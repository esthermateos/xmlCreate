package com.isb.vega.generator.xml.configuration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;

import com.isb.vega.externalization.generator.xml.XmlGeneratorNew;
import com.isb.vega.internal.model.assembly.AssemblyProject;
import com.isb.vega.internal.model.component.externalization.XmlGenerator;
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
import com.isb.vega.model.scenario.IScenario;

import dependencies.DependenciesFactory;
import dependencies.Ensamblado;
import dependencies.Fachada;
import dependencies.OP;


public class CreateconfigurationXML {
	
	
	List<Fachada> listFachada = new ArrayList<Fachada>();
	List<OP> listOP = new ArrayList<OP>();
	IAssemblyFile assemblyFile;
	IOperation[] operation;
	IScenario[] iscenarios;
	DependenciesFactory dependencies = DependenciesFactory.eINSTANCE;
	Fachada fachada;
	List<Fachada> listFachadas = new ArrayList<Fachada>();
	
	public  void  getConfigurationXML(String name, String ruta) {
			IProject iProject = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
			IVegaProject vegaProject = UtilsProjectsApi.findVegProjectInVegaCore(iProject);
			
			//a partir de la conversión del objeto vegaProject obtenemos el fichero de ensamblado, mediante el cual 
			// vamos a ir cargando todo el ECORE
			if (vegaProject instanceof AssemblyProject){ 
				IAssembly assembly = ((IAssemblyProject)vegaProject).getAssembly();
				assemblyFile = assembly.getAssemblyFile();
			}
			
			Ensamblado ensamblado = dependencies.createEnsamblado();
			ensamblado.setName(name);	
			// a partir del objeto assembllyFileData creamos las entidades MULTIPROFILE y SECURITY
			IAssemblyFileData assemblyFileData = assemblyFile.getAssemblyFileData();
			CreateEntities.createMultiProfile(assemblyFileData,dependencies, ensamblado);
			
			CreateEntities.createSecurity(assemblyFileData, dependencies, ensamblado);
		
			//Creamos el objeto ensamblado y obtenemos los posibles escenarios
	
			iscenarios = UtilsDependencies.getScenarios(vegaProject, iscenarios, assemblyFile);
			for (IScenario scenario : iscenarios) 
			{				
				ScenarioExternalizationContributor scenarioExternalizationContributor = new ScenarioExternalizationContributor();
				operation = scenarioExternalizationContributor.contributeOperations(scenario);
			}
//	
			List<IOperation> listOPs = UtilsDependencies.getlist(operation, UtilsOperations.OP_OPERATIONS);
		//	List<IOperation> listOIs = UtilsDependencies.getlist(operation, UtilsOperations.OI_OPERATIONS);
			
			/*recorremos las OPS para crear las fachadas de OPS*/
			
			for (IOperation iOperationOP : listOPs) {			
				IOperationData operationData = iOperationOP.getOperationData();
				if  (operationData instanceof IFlowOperationData){
					IFlowOperationData iFlowOperationData = (IFlowOperationData)operationData;
					OP op = CreateEntities.createOPs(dependencies, iFlowOperationData, ensamblado);
					IState[] lstStates = iFlowOperationData.getOperationFlow().getStateContainer().getStates();
					for (IState iState : lstStates) {
						fachada = CreateEntities.createFacades(dependencies, iState);
						listFachadas.add(fachada);
					}
					op.getEFachada().addAll(listFachadas);
				}			 
			}	
	

		
			//Creamos el fichero de ruta dada
			File configuration = new File(ruta, "configuration.xml");
			try {
				configuration.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Externalizamos los datos del modelo			
		//	XmlGeneratorNew.compile(configuration, ensamblado);
	
	}


}
