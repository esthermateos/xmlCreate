package com.isb.vega.generator.xml.configuration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.isb.vega.externalization.generator.xml.XmlGeneratorNew;
import com.isb.vega.internal.model.assembly.AssemblyProject;
import com.isb.vega.internal.wrapper.rigel.core.BKSConfigurationModel;
import com.isb.vega.model.api.utils.UtilsProjectsApi;
import com.isb.vega.model.assembly.IAssembly;
import com.isb.vega.model.assembly.IAssemblyFile;
import com.isb.vega.model.assembly.IAssemblyFileData;
import com.isb.vega.model.assembly.IAssemblyProject;
import com.isb.vega.model.assembly.ScenarioExternalizationContributor;
import com.isb.vega.model.core.IVegaProject;
import com.isb.vega.model.operation.IOperation;
import com.isb.vega.model.operation.IOperationData;
import com.isb.vega.model.operation.UtilsOperations;
import com.isb.vega.model.operation.flow.IFlowOperationData;
import com.isb.vega.model.operation.flow.IState;
import com.isb.vega.model.operation.flow.state.facade.IFacadeInterfaceState;
import com.isb.vega.model.scenario.IScenario;

import dependencies.DependenciesFactory;
import dependencies.Ensamblado;
import dependencies.Fachada;
import dependencies.JMS;
import dependencies.OP;


public class CreateConfigurationXML{
	List<Fachada> listFachada = new ArrayList<Fachada>();
	List<OP> listOP = new ArrayList<OP>();
	IAssemblyFile assemblyFile;
	IOperation[] operation;
	IScenario[] iscenarios;
	DependenciesFactory dependencies = DependenciesFactory.eINSTANCE;
	
	List<Fachada> listFachadas = new ArrayList<Fachada>();
	IAssemblyProject assemblyProject;
	String scenaryName;
	CreateEntities createEntities = new CreateEntities();
	UtilsDependencies utilsDependencies = new UtilsDependencies();
	
	public void  getConfigurationXML(String name, String ruta) throws Exception, IOException{
			IProject iProject = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
			IVegaProject vegaProject = UtilsProjectsApi.findVegProjectInVegaCore(iProject);

			//a partir de la conversión del objeto vegaProject obtenemos el fichero de ensamblado, mediante el cual 
			// vamos a ir cargando todo el ECORE
			if (vegaProject instanceof AssemblyProject){ 
				assemblyProject = ((IAssemblyProject)vegaProject);
				IAssembly assembly = ((IAssemblyProject)vegaProject).getAssembly();
				assemblyFile = assembly.getAssemblyFile();
			}
			
			Ensamblado ensamblado = dependencies.createEnsamblado();
			ensamblado.setName(name);
			getDefaultBankChannel(ensamblado);
			// a partir del objeto assembllyFileData creamos las entidades MULTIPROFILE y SECURITY
			IAssemblyFileData assemblyFileData = assemblyFile.getAssemblyFileData();
			createEntities.createMultiProfile(assemblyFileData,dependencies, ensamblado);
			
			createEntities.createSecurity(assemblyFileData, dependencies, ensamblado);
			createEntities.createLogLevel(assemblyFileData, dependencies, ensamblado);
			createEntities.createJMS(assemblyFileData, dependencies, ensamblado);
			//Creamos el objeto ensamblado y obtenemos los posibles escenarios
			createEntities.createChannelAdapter(assemblyProject, assemblyFileData, dependencies, ensamblado);
			
			iscenarios = utilsDependencies.getScenarios(vegaProject, iscenarios, assemblyFile);
			for (IScenario scenario : iscenarios) 
			{				
				scenaryName = getScenaryName(scenario);				
				ScenarioExternalizationContributor scenarioExternalizationContributor = new ScenarioExternalizationContributor();
				operation = scenarioExternalizationContributor.contributeOperations(scenario);
				
			}
			//Actualizamos el mode del modelo dentro de la entidad MultiProfile.
			ensamblado.getEMultiProfile().setMode(getMode(scenaryName, iProject));
			
//	
			List<IOperation> listOPs = utilsDependencies.getlist(operation, UtilsOperations.OP_OPERATIONS);
		//	List<IOperation> listOIs = UtilsDependencies.getlist(operation, UtilsOperations.OI_OPERATIONS);
			
			/*recorremos las OPS para crear las fachadas de OPS*/
			
			for (IOperation iOperationOP : listOPs) {			
				IOperationData operationData = iOperationOP.getOperationData();
				if  (operationData instanceof IFlowOperationData){
					IFlowOperationData iFlowOperationData = (IFlowOperationData)operationData;
					OP op = createEntities.createOPs(dependencies, iFlowOperationData, ensamblado);
					IState[] lstStates = iFlowOperationData.getOperationFlow().getStateContainer().getStates();
					for (IState iState : lstStates) {
						if(iState instanceof IFacadeInterfaceState){
						Fachada fachada = createEntities.createFacades(dependencies, iState);
						listFachadas.add(fachada);
						}
					}
				op.getEFachada().addAll(listFachadas);
				}			 
			}	
		
			//Creamos el fichero en la ruta dada
			File configuration = createFile(name, ruta, iProject);
			
			//Externalizamos los datos del modelo	
			List <String> listPort = new ArrayList<String>();
			List <String> listModules = new ArrayList<String>();
			for (JMS jms : ensamblado.getEJMS()) {
				listPort.add(jms.getListenerPorts());
				listModules.add(jms.getJmsModules());
			}

				XmlGeneratorNew xmlGeneratorNew= new XmlGeneratorNew(ensamblado, listModules, listModules);				
				xmlGeneratorNew.compile(configuration, ensamblado,listPort, listModules);					
			
	

	
	}

	private String getMode(String scenary, IProject iProject) throws IOException {
		String mode = null;
		String rutaProject= iProject.getLocationURI().getPath().toString();
		rutaProject= rutaProject.substring(0, rutaProject.lastIndexOf("/")+1).concat(scenary).concat("/JavaSource/").concat(scenary).concat("_descriptor.xml");
		File file = new File(rutaProject);
		if(file.exists()){
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db;
			try {
				db = dbf.newDocumentBuilder();
				Document doc = db.parse(file);
				doc.getDocumentElement().normalize();
				NodeList nodeLst = doc.getElementsByTagName("init-param");
				for (int s = 0; s < nodeLst.getLength(); s++) {
					org.w3c.dom.Node fstNode = nodeLst.item(s);
					Element fstElmnt = (Element) fstNode;
				    NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("param-name");
				    Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
				    NodeList fstNm = fstNmElmnt.getChildNodes();
				    if(fstNm.item(0).getNodeValue().equals("RigelProp_aeb_newMultisMode")){
				    	NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("param-value");
				        Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
				        NodeList lstNm = lstNmElmnt.getChildNodes();
				        mode = lstNm.item(0).getNodeValue();
				        break;
				    }
				}				
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}		
		return mode;
	}

	private String getScenaryName(IScenario scenario) {
		return scenario.getParent().getParent().getParent().getElementId().toString();
	}

	private File createFile(String name, String ruta, IProject iProject) throws IOException {
		if(iProject.getLocationURI()!=null){
			String rutaProject= iProject.getLocationURI().getPath().toString();
			rutaProject = rutaProject.substring(0, rutaProject.lastIndexOf(name)-1);
			if(!ruta.startsWith("/")){
				ruta = "/".concat(ruta);
			}
			if(ruta.startsWith(name)){
				ruta = ruta.replaceFirst(name, "");
			}else{
				if(ruta.startsWith("/".concat(name))){
					ruta = ruta.replaceFirst("/".concat(name), "");
				}
			}
			String rutaFinal = rutaProject.concat(ruta);
			File filePath = new File(rutaFinal);
			if(!filePath.exists()){
				filePath.mkdirs();
			}
	
			File configuration = new File(rutaFinal, "configuration.xml");
			configuration.createNewFile();

			return configuration;
		}
		return null;
	}

	public void getDefaultBankChannel(Ensamblado ensamblado) {
		BKSConfigurationModel bKSConfigurationModel = new BKSConfigurationModel();
		String entity = bKSConfigurationModel.getCfgEnt();
		String enviroment = bKSConfigurationModel.getCfgEnv();
		String defaultBank = entity.concat("_").concat(enviroment);
		ensamblado.setDefaultBankChannel(defaultBank);
	}
	


}
