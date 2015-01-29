package com.isb.vega.generator.xml.configuration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.isb.vega.internal.model.assembly.AssemblyProject;
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

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class CreateconfigurationXML extends AbstractHandler {
	
	
	List<Fachada> listFachada = new ArrayList<>();
	List<OP> listOP = new ArrayList<>();
	IAssemblyFile assemblyFile;
	IOperation[] operation;
	IScenario[] iscenarios;
	DependenciesFactory dependencies = DependenciesFactory.eINSTANCE;

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			String name = "SGSDEP_ENS";
			//String name = "SCU_CRECAR_ENS";
			getConfigurationXML(name);
			return null;
	}
	
	
	private  void  getConfigurationXML(String name) {
			IProject iProject = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
			IVegaProject vegaProject = UtilsProjectsApi.findVegProjectInVegaCore(iProject);
			
			//a partir de la conversión del objeto vegaProject obtenemos el fichero de ensamblado, mediante el cual 
			// vamos a ir cargando todo el ECORE
			if (vegaProject instanceof AssemblyProject){ 
				IAssembly assembly = ((IAssemblyProject)vegaProject).getAssembly();
				assemblyFile = assembly.getAssemblyFile();
			}
			// a partir del objeto assembllyFileData creamos las entidades MULTIPROFILE y SECURITY
			IAssemblyFileData assemblyFileData = assemblyFile.getAssemblyFileData();
			CreateEntities.createMultiProfile(assemblyFileData,dependencies);
			CreateEntities.createBasicSecurity(assemblyFileData, dependencies);
		
			//Creamos el objeto ensamblado y obtenemos los posibles escenarios
			Ensamblado ensamblado = dependencies.createEnsamblado();
			ensamblado.setName(name);		
			iscenarios = UtilsDependencies.getScenarios(vegaProject, iscenarios, assemblyFile);
			for (IScenario scenario : iscenarios) 
			{				
				ScenarioExternalizationContributor scenarioExternalizationContributor = new ScenarioExternalizationContributor();
				operation = scenarioExternalizationContributor.contributeOperations(scenario);
			}
	
			List<IOperation> listOPs = UtilsDependencies.getlist(operation, UtilsOperations.OP_OPERATIONS);
			List<IOperation> listOIs = UtilsDependencies.getlist(operation, UtilsOperations.OI_OPERATIONS);
			
			/*recorremos las OPS para crear las fachadas de OPS*/
			
			for (IOperation iOperationOP : listOPs) {			
				IOperationData operationData = iOperationOP.getOperationData();
				if  (operationData instanceof IFlowOperationData){
					IFlowOperationData iFlowOperationData = (IFlowOperationData)operationData;
					CreateEntities.createOPs(dependencies, iFlowOperationData);
					IState[] lstStates = iFlowOperationData.getOperationFlow().getStateContainer().getStates();
					for (IState iState : lstStates) {
						CreateEntities.createFacades(dependencies, iState);		
					}
				}			 
			}	
	
			//			for (Fachada fachada : listFachada) {
			//			
			//			}
	
		}


}
