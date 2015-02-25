package com.isb.vega.generator.xml.configuration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.isb.vega.internal.model.assembly.AssemblyProject;
import com.isb.vega.internal.model.component.ComponentFieldContainer;
import com.isb.vega.internal.model.component.Method;
import com.isb.vega.internal.model.component.MethodContainer;
import com.isb.vega.internal.model.component.sql.SQLComponent;
import com.isb.vega.internal.model.component.sql.SQLComponentData;
import com.isb.vega.internal.model.component.sql.SQLSentenceField;
import com.isb.vega.internal.model.core.VegaFragmentRoot;
import com.isb.vega.internal.model.operation.flow.InternalOperationData;
import com.isb.vega.internal.model.operation.flow.state.component.ComponentState;
import com.isb.vega.internal.model.operation.flow.state.connector.wscaller.WSCallerState;
import com.isb.vega.internal.model.parameter.ParameterType;
import com.isb.vega.internal.model.parameter.ParameterTypeContainer;
import com.isb.vega.internal.model.vegabeans.VegaBeanContainer;
import com.isb.vega.internal.model.vegabeans.VegaBeanManager;
import com.isb.vega.internal.model.vegabeans.VegaBeanPackage;
import com.isb.vega.internal.wrapper.rigel.core.BKSConfigurationModel;
import com.isb.vega.model.api.utils.UtilsProjectsApi;
import com.isb.vega.model.assembly.IAssembly;
import com.isb.vega.model.assembly.IAssemblyFile;
import com.isb.vega.model.assembly.IAssemblyFileData;
import com.isb.vega.model.assembly.IAssemblyProject;
import com.isb.vega.model.assembly.ScenarioExternalizationContributor;
import com.isb.vega.model.component.IComponent;
import com.isb.vega.model.component.IPhysicalComponentData;
import com.isb.vega.model.component.UtilsComponents;
import com.isb.vega.model.core.IVegaElement;
import com.isb.vega.model.core.IVegaProject;
import com.isb.vega.model.operation.IOperation;
import com.isb.vega.model.operation.IOperationData;
import com.isb.vega.model.operation.UtilsOperations;
import com.isb.vega.model.operation.flow.IFlowOperationData;
import com.isb.vega.model.operation.flow.IInternalOperationData;
import com.isb.vega.model.operation.flow.IState;
import com.isb.vega.model.operation.flow.state.facade.IFacadeInterfaceState;
import com.isb.vega.model.scenario.IScenario;

import dependencies.Cache;
import dependencies.ComponentSQL;
import dependencies.DependenciesFactory;
import dependencies.Ensamblado;
import dependencies.Fachada;
import dependencies.HOST;
import dependencies.OI;
import dependencies.OP;
import dependencies.SQLSentence;
import dependencies.Webservice;


public class CreateConfigurationXML{
	List<Fachada> listFachada = new ArrayList<Fachada>();
	List<OP> listOP = new ArrayList<OP>();
	IAssemblyFile assemblyFile;
	IOperation[] operation;
	IScenario[] iscenarios;
	DependenciesFactory dependencies = DependenciesFactory.eINSTANCE;
	Cache cache;	
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
			List<IOperation> listOIs = utilsDependencies.getlist(operation, UtilsOperations.OI_OPERATIONS);
			
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
							if (fachada!=null) listFachadas.add(fachada);
						}
					}
				if (listFachadas!=null) op.getEFachada().addAll(listFachadas);
				}			 
			}	
			/*Codigo provisional para cargar los webservices de las OIS*/
			for (IOperation iOperationOI : listOIs) {			
				IOperationData operationData = iOperationOI.getOperationData();
				if  (operationData instanceof IInternalOperationData){
					InternalOperationData iFlowOperationData = (InternalOperationData)operationData;
					IState[] lstStates = iFlowOperationData.getOperationFlow().getStateContainer().getStates();
					for (IState iState : lstStates) {
						if(iState instanceof WSCallerState){
							Webservice webService = createEntities.createWebservice(dependencies, iState);
							
						}else if (iState instanceof ComponentState){
							ComponentState componentState = (ComponentState)iState;	
							IVegaProject[] xmlPath = componentState.getVegaProject().getVegaProjectsOnXmlPath();
							IComponent component = UtilsComponents.findComponent(xmlPath, componentState.getFieldValue("package").toString(), componentState.getFieldValue("componentName").toString());
							sqlComponent(iFlowOperationData,componentState);
 
						}
					}
				 
				}	
			}	
					 
			}

	private void sqlComponent(InternalOperationData iFlowOperationData, ComponentState componentState) throws JAXBException {
		IVegaElement[] children = iFlowOperationData.getVegaProject().getChildren(); // obtenemos todos los hijos del vega project a partir de operationData
		for (IVegaElement iVegaElement : children) {
			if (iVegaElement instanceof VegaFragmentRoot){ // preguntamos por objeto VegaFragmentRoot
				IVegaElement[] cVegaElement = ((VegaFragmentRoot) iVegaElement).getChildren(); // obtenemos hijos VegaFragmentRoot
				for (IVegaElement iVegaFragmentRoot : cVegaElement) {//recorrmos VegaFragmentRoot
					if (iVegaFragmentRoot instanceof VegaBeanManager){//comprobacion objeto VegaBeanManager
						IVegaElement[] cVegaBeanManager = ((VegaBeanManager) iVegaFragmentRoot).getChildren();//obtebnemos hijos VegaBeanManager
						for (IVegaElement iVegaBeanManager : cVegaBeanManager) {
							if (iVegaBeanManager instanceof VegaBeanPackage){//preguntamos por objeto VegaBeanPackage
							IVegaElement[] cVegaBeanPackage = ((VegaBeanPackage) iVegaBeanManager).getChildren();
							for (IVegaElement iVegaBeanPackage : cVegaBeanPackage) {//Recorremos VegaBeanPackage
								if (iVegaBeanPackage instanceof VegaBeanContainer){//preguntamos por objeto VegaBeanContainer
									IVegaElement[] cVegaBeanContainer = ((VegaBeanContainer) iVegaBeanPackage).getChildren();
									
									
									
									for (IVegaElement iVegaBeanContainer : cVegaBeanContainer) {
										if (iVegaBeanContainer instanceof SQLComponent){
											IVegaElement[] cSQLComponent = ((SQLComponent) iVegaBeanContainer).getChildren();
											for (IVegaElement iSQLComponent : cSQLComponent) {
												
												if (iSQLComponent instanceof SQLComponentData){
													if (((SQLComponentData) iSQLComponent).getName().equals(componentState.getComponentName())){
														
														//*************************************************************************************************//
														//si el nombre del SQLComponentData coincide con el nombre del estado componente
														// alias de la cache
														IPhysicalComponentData physCompData = (IPhysicalComponentData) iSQLComponent;
														if(physCompData.getCacheType().equals("")){
															cache = dependencies.createCache();
															cache.setName(iSQLComponent.getElementId());
															if(iVegaBeanPackage.getParent().getElementId() != null)
																cache.setPackage(iVegaBeanPackage.getParent().getElementId());
															if (physCompData.getCacheType()!= null) 
																cache.setAlias(physCompData.getCacheType());
															 
														}
														//si coincide el nombre del método con el nombre del estado componente
														IVegaElement[] cParametersContainers = ((SQLComponentData) iSQLComponent).getChildren();
														for (IVegaElement iParametersContainers : cParametersContainers) {
																if (iParametersContainers instanceof MethodContainer){
																	IVegaElement[] methodContainer = ((MethodContainer) iParametersContainers).getChildren();
																	for (IVegaElement method : methodContainer) {
																		Method metodo = ((Method) method);
																		String methodSQLComponent = metodo.getName();
																		String methodStateContainer = componentState.getMethodSignature().toString().substring(0,componentState.getMethodSignature().toString().indexOf("("));
																		if (methodSQLComponent.equals(methodStateContainer)){
																			//comparamos los nombres de los métodos (del state y del sqlcomponent). Si son iguales creamos las instancias SQLComponent y sqlsentence
																			getSQL(cParametersContainers,cache);
																			break;
																		} // fin comparación
																	}// fin bucle methodContainer
																}// fin comprobación objeto methodContainer
														}// fin bucle parametersContainers
													}//fin comparación nombre del estado componente con el nombre del componente del SQLComponent
												}// fin comprobación objeto SQLComponentData
											}//fin bucle SQLComponent 
										}//fin comprobación objeto SQLComponent
									}//fin bucle SQLContainer
								}//fin comprobación objeto VegaBeanContainer
							}//fin bucle VegaBeanPackage
							}//fin comprobacion objeto Vega
						}//fin bucle VagaBeanManager
					}//fin comprobación objeto VegaBeanManager
				}//fin bucle VegaElement
			}//comprobación objeto VegaFragmentRoot
		}//fin bucle 
	} // fin ppal
	
	 
	/** Si el estado componente(nombre y método) coincide con el SQLComponentData (nombre y método). Si el SQLComponentData tiene ParameterTypeContainer, se
	 * procede a crear la entidad ComponentSQL.Si el SQLComponentData tiene ComponentFieldContainer procedemos a crear la entidad sqlSentence
	 * @param cParametersContainers - contenedor de parámetros del SQLComponent
	 * @param listCache 
	 */
	private void getSQL(IVegaElement[] cParametersContainers, Cache listCache) {
		for (IVegaElement iParametersContainers : cParametersContainers) {
			if (iParametersContainers instanceof ParameterTypeContainer){
				IVegaElement[] parametersContainers = ((ParameterTypeContainer) iParametersContainers).getChildren();
				ComponentSQL sql = dependencies.createComponentSQL();
				for (IVegaElement cParametersContainer : parametersContainers) {
					
					if (cParametersContainer instanceof ParameterType){
						 getParameterType(
								sql,
								cParametersContainer,listCache);
					}
				}
			}else if (iParametersContainers instanceof ComponentFieldContainer){
				IVegaElement[] sqls = ((ComponentFieldContainer) iParametersContainers).getChildren();
				getSQLSentences(sqls);
			}
		}
	}

	/** 
	 * Método para crear la entidad SqlSentence a partir de la collección ComponentFieldContainer
	 * @param sqls - Colección de elementos Vega 
	 */

	private void getSQLSentences(IVegaElement[] sqls) {
		SQLSentence sqlSentence = dependencies.createSQLSentence();
		for (IVegaElement isql : sqls) {
			if (isql instanceof SQLSentenceField){
				 SQLSentenceField sql = ((SQLSentenceField) isql);
				 if (sql.getElementId().equals("text")){
					 sqlSentence.setSql(sql.getText());
				 }else if (sql.getElementId().equals("name")){
					 sqlSentence.setName(sql.getName());
				 }else if (sql.getElementId().equals("type")){
					 sqlSentence.setType(String.valueOf(sql.getType()));
				 }		 
			}
		}
	}
	/** 
	 * Método para crear la entidad ComponentSQL a partir de la collección ParameterTypeContainer
	 * @param cache 
	 * @param sqls - Colección de elementos Vega 
	 */

	private void getParameterType(ComponentSQL sql, IVegaElement cParametersContainer, Cache cache) {
		ParameterType parameter = ((ParameterType) cParametersContainer);
		 	if (parameter.getElementId().equals("dataSource")){
		 		sql.setDatasource(parameter.getDefaultValue().toString());
			}else if (parameter.getElementId().equals("aliasDataSource")){
				sql.setDataSourceAlias(parameter.getDefaultValue().toString());
			}else if (parameter.getElementId().equals("implementationType")){
				sql.setImplementationType(parameter.getDefaultValue().toString());
			}else if (parameter.getElementId().equals("MAX_ROWS")){
				sql.setMaxRows(parameter.getDefaultValue().toString());
			}else if (parameter.getElementId().equals("PAGE_MAX_SIZE")){
				sql.setPageMaxSize(parameter.getDefaultValue().toString());
			}
		 	Cache eCache = sql.getECache();
		 	eCache.setPackage(cache.getPackage());
		 	eCache.setAlias(cache.getAlias());
		 	eCache.setName(cache.getName());
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
