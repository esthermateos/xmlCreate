package com.isb.vega.generator.xml.configuration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

import com.isb.vega.externalization.generator.xml.XmlGeneratorNew;
import com.isb.vega.internal.model.assembly.AssemblyProject;
import com.isb.vega.internal.model.blapplication.BLApplication;
import com.isb.vega.internal.model.component.externalization.ComponentMethodSignature;
import com.isb.vega.internal.model.component.java.ComponentCallField;
import com.isb.vega.internal.model.component.java.FacadeInterfaceCallField;
import com.isb.vega.internal.model.module.BLModule;
import com.isb.vega.internal.model.module.BLModuleProject;
import com.isb.vega.internal.model.operation.flow.state.basic.OIState;
import com.isb.vega.internal.model.operation.flow.state.basic.OPState;
import com.isb.vega.internal.model.operation.flow.state.component.ComponentState;
import com.isb.vega.internal.model.operation.flow.state.connector.altair.AltairState;
import com.isb.vega.internal.model.operation.flow.state.connector.bboo.BBOOState;
import com.isb.vega.internal.model.operation.flow.state.connector.sat.SatState;
import com.isb.vega.internal.model.operation.flow.state.connector.siebel.SiebelState;
import com.isb.vega.internal.model.operation.flow.state.connector.tp.TPStateImpl;
import com.isb.vega.internal.model.operation.flow.state.connector.trxop.TrxopState;
import com.isb.vega.internal.model.operation.flow.state.connector.wscaller.WSCallerState;
import com.isb.vega.internal.wrapper.rigel.core.BKSConfigurationModel;
import com.isb.vega.model.api.utils.UtilsProjectsApi;
import com.isb.vega.model.application.IApplicationFile;
import com.isb.vega.model.assembly.IAssembly;
import com.isb.vega.model.assembly.IAssemblyFile;
import com.isb.vega.model.assembly.IAssemblyFileData;
import com.isb.vega.model.assembly.IAssemblyProject;
import com.isb.vega.model.assembly.IPLModuleReference;
import com.isb.vega.model.assembly.ScenarioExternalizationContributor;
import com.isb.vega.model.assembly.UtilsAssembly;
import com.isb.vega.model.blapplication.IBLApplication;
import com.isb.vega.model.component.IComponent;
import com.isb.vega.model.component.IComponentField;
import com.isb.vega.model.component.IMethod;
import com.isb.vega.model.component.IPhysicalComponent;
import com.isb.vega.model.component.UtilsComponents;
import com.isb.vega.model.component.facade.IFacadeInterface;
import com.isb.vega.model.core.IVegaElement;
import com.isb.vega.model.core.IVegaProject;
import com.isb.vega.model.core.VegaModelUtils;
import com.isb.vega.model.facade.IFacade;
import com.isb.vega.model.facade.UtilsFacades;
import com.isb.vega.model.module.IBLModule;
import com.isb.vega.model.module.IBLModuleFile;
import com.isb.vega.model.module.IPLModuleFile;
import com.isb.vega.model.module.UtilsModules;
import com.isb.vega.model.operation.IOperation;
import com.isb.vega.model.operation.IOperationData;
import com.isb.vega.model.operation.UtilsOperations;
import com.isb.vega.model.operation.flow.IFlowOperationData;
import com.isb.vega.model.operation.flow.IInternalOperationData;
import com.isb.vega.model.operation.flow.IState;
import com.isb.vega.model.operation.flow.state.facade.IFacadeInterfaceState;
import com.isb.vega.model.operation.flow.state.facade.UtilsFacadeInterfaceState;
import com.isb.vega.model.scenario.IScenario;

import dependencies.Altair;
import dependencies.BBOO;
import dependencies.DependenciesFactory;
import dependencies.Ensamblado;
import dependencies.Fachada;
import dependencies.JMS;
import dependencies.OI;
import dependencies.OP;
import dependencies.SAT;
import dependencies.Siebel;
import dependencies.Tp;
import dependencies.TrxOP;
import dependencies.Webservice;

public class CreateConfigurationXML {
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
	Ensamblado ensamblado;
	EList<OP> listOPModel;

	public void getConfigurationXML(String name, String ruta) throws Exception,
			IOException {
		IProject iProject = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(name);
		IVegaProject vegaProject = UtilsProjectsApi
				.findVegProjectInVegaCore(iProject);

		// a partir de la conversión del objeto vegaProject obtenemos el fichero
		// de ensamblado, mediante el cual
		// vamos a ir cargando todo el ECORE
		if (vegaProject instanceof AssemblyProject) {
			assemblyProject = ((IAssemblyProject) vegaProject);
			IAssembly assembly = ((IAssemblyProject) vegaProject).getAssembly();
			assemblyFile = assembly.getAssemblyFile();
		}

		ensamblado = dependencies.createEnsamblado();
		ensamblado.setName(name);
		getDefaultBankChannel(ensamblado);
		// a partir del objeto assembllyFileData creamos las entidades
		// MULTIPROFILE y SECURITY
		IAssemblyFileData assemblyFileData = assemblyFile.getAssemblyFileData();
		createEntities.createMultiProfile(assemblyFileData, dependencies,
				ensamblado);

		createEntities.createSecurity(assemblyFileData, dependencies,
				ensamblado);
		createEntities.createLogLevel(assemblyFileData, dependencies,
				ensamblado);
		createEntities.createJMS(assemblyFileData, dependencies, ensamblado);
		// Creamos el objeto ensamblado y obtenemos los posibles escenarios
		createEntities.createChannelAdapter(assemblyProject, assemblyFileData,
				dependencies, ensamblado);

		iscenarios = utilsDependencies.getScenarios(vegaProject, iscenarios,
				assemblyFile);
		for (IScenario scenario : iscenarios) {
			scenaryName = getScenaryName(scenario);
			ScenarioExternalizationContributor scenarioExternalizationContributor = new ScenarioExternalizationContributor();
			operation = scenarioExternalizationContributor
					.contributeOperations(scenario);

		}
		// Actualizamos el mode del modelo dentro de la entidad MultiProfile.
		ensamblado.getEMultiProfile().setMode(getMode(scenaryName, iProject));

		List<IOperation> listOPs = utilsDependencies.getlist(operation,
				UtilsOperations.OP_OPERATIONS);

		// Recorremos las OPS para obtener las fachadas de OPS, JSP, OI, y todo
		// lo que ellas depende, y asi obtener el arbol.
		for (IOperation iOperationOP : listOPs) {
			// Obtenemos el PL de la aplicación
			
			//Provisional******************************************
		//	if(iOperationOP.getElementId().equalsIgnoreCase("OP_MyCreditCardServices")){

			IPLModuleReference[] modules = UtilsAssembly
					.getPLModulesReferences(assemblyFile);
			IOperationData operationData = iOperationOP.getOperationData();
			if (operationData instanceof IFlowOperationData) {
				IFlowOperationData iFlowOperationData = (IFlowOperationData) operationData;
				OP op = createEntities.createOPs(dependencies,
						iFlowOperationData, ensamblado);
				// Obtenemos todos los estados que forman la OP y los
				// recorremos.
				IState[] lstStates = iFlowOperationData.getOperationFlow()
						.getStateContainer().getStates();
				for (IState iState : lstStates) {
					/*
					 * Los estados que sean de instancia Interfaz de Fachada nos
					 * interesan para obtener la implementación de ellos y asi
					 * obtener el arbol de dependecias de cada una de las OP
					 */
					if (iState instanceof IFacadeInterfaceState) {
						// Normalmente solo existirá un PL (Escenario) en cada
						// aplicacion.
						if (modules.length == 1) {
							getElemenImpl(iState, modules[0], op, null, null, null, null);
						} else {
							for (IPLModuleReference module : modules) {
								getElemenImpl(iState, module, op, null, null, null, null);
							}
						}

					} else if (iState instanceof OIState) {
						OIState stateOI = (OIState) iState;
						String interOp = stateOI.getInternalOperation();
						String refAppl = stateOI.getReferenceApplication();
						IVegaProject[] xmlPath = modules[0].getVegaProject()
								.getVegaProjectsOnXmlPath();
						IOperation iOperation = UtilsOperations.findOperation(
								xmlPath, refAppl, interOp);
						IOperationData operationDataIO = iOperation
								.getOperationData();
						if (operationDataIO instanceof IInternalOperationData) {
							IInternalOperationData iInternalOperationDataIO = (IInternalOperationData) operationDataIO;
							// Se comprueba que la OI que estamos analizando no
							// exista ni por parte de OP ni por parte de OI asi
							// evitamos que se repitan.
							OI lnStateOI = createEntities.createOis(
									dependencies, iInternalOperationDataIO);
							OI oiModel = getInternalOper(lnStateOI,
									ensamblado.getEOP());
							if (oiModel == null) {
								if (lnStateOI != null) {
									op.getEOI().add(lnStateOI);
									IBLApplication blApp = VegaModelUtils
											.findParentElement(iOperation,
													IBLApplication.class);
									IApplicationFile applFile = blApp
											.getApplicationFile();
									BLModuleProject blModuleProject = VegaModelUtils
											.findParentElement(applFile,
													BLModuleProject.class);
									IBLModuleFile blModuleFile = blModuleProject
											.getBLModule().getBLModuleFile();
									IState[] lstStatesOI = iInternalOperationDataIO
											.getOperationFlow()
											.getStateContainer().getStates();
									getStates(blModuleFile, lnStateOI,
											lstStatesOI);
								}
							} else {
								// Buscamos la fachada en nuestro modelo, y la
								// asociamos, pero ya no la creamos.
								op.getEOI().add(oiModel);
							}

						}
					}
				}
				ensamblado.getEOP().add(op);

			}
		//}//IF provisional**************************************
		}

		// Recorremos de nuevo para asociar las OP referenciadas una vez creadas
		// ya en nuestro modelo.
		getReferencesOPs(listOPs, ensamblado.getEOP());

		// Creamos el fichero en la ruta dada
		File configuration = createFile(name, ruta, iProject);

		// Externalizamos los datos del modelo
		List<String> listPort = new ArrayList<String>();
		List<String> listModules = new ArrayList<String>();
		for (JMS jms : ensamblado.getEJMS()) {
			if (jms.getListenerPorts() != null)
				listPort.add(jms.getListenerPorts());
			if (jms.getJmsModules() != null)
				listModules.add(jms.getJmsModules());
		}

		XmlGeneratorNew xmlGeneratorNew = new XmlGeneratorNew(ensamblado,
				listModules, listModules);
		xmlGeneratorNew.compile(configuration, ensamblado, listPort,
				listModules);

	}

	public void getReferencesOPs(List<IOperation> listOPs, EList<OP> opsModel) {
		for (IOperation iOperationOP : listOPs) {
			IOperationData operationData = iOperationOP.getOperationData();
			if (operationData instanceof IFlowOperationData) {
				IFlowOperationData iFlowOperationData = (IFlowOperationData) operationData;
				OP opIni = null;
				// Buscamos en nuestro modelo la OP a la cual vamos a relacionar
				// sus OPs.
				for (OP opModel : opsModel) {
					String nameOpIni = iFlowOperationData.getName();
					String lnOPIni = iFlowOperationData.getParent().getParent()
							.getParent().getElementId();
					if (opModel.getLpName().equals(lnOPIni)
							&& opModel.getOpName().equals(nameOpIni)) {
						opIni = opModel;
						break;
					}
				}
				// Obtenemos los estados de la OP, pero solo nos interesaran
				// aquellos que sean OPs.
				IState[] lstStates = iFlowOperationData.getOperationFlow()
						.getStateContainer().getStates();
				for (IState iState : lstStates) {
					if (iState instanceof OPState) {
						// Recorremos nuestro modelo buscando la OP que
						// corresponda al estado.
						for (OP opModelState : opsModel) {
							String presentationOperationState = ((OPState) iState)
									.getPresentationOperation();
							String referenceApplicationState = ((OPState) iState)
									.getReferenceApplication();
							String nameModel = opModelState.getOpName();
							String referenceModel = opModelState.getLpName();
							if (presentationOperationState.equals(nameModel)
									&& referenceApplicationState
											.endsWith(referenceModel)) {
								if (opIni != null) {
									opIni.getEstadoLlamadaOP()
											.add(opModelState);
									break;
								} else {
									break;
								}
							}
						}// Fin FOR para buscar la OP del estado en nuestro
							// modelo.
					}// FIN del IF en caso de ser un estado tipo OPState.
				}// END FOR
			}
		}

	}

	/*
	 * Método que obtiene todas las fachadas, OI, conectores, WS... hasta
	 * conseguir todas las dependecias de las que consta una OP
	 */
	public void getElemenImpl(IState iState, IVegaElement module,
			Object parentEntity, Fachada fachadaOr, IFacade ifacadeCall, IFacadeInterface facadeInterCall, String methodSignatureCall) {

		Fachada fachada = null;
		// Se distingue si se viene de una OP o una OI.
		if(iState!=null){
			if (parentEntity instanceof OP) {
				fachada = createEntities.createFacades(dependencies, iState);
				((OP) parentEntity).getEFachada().add(fachada);

			} else if (parentEntity instanceof OI) {
				fachada = fachadaOr;
			}
		}else{
			fachada = fachadaOr;
		}		

		// Se obtienen la fachada la interfaz de fachada y el método del estado pasado.
		IFacade facade=null;
		IFacadeInterface facadeInterface = null;
		String methodSignature = null;
		
		if(iState!=null){
			IFacadeInterfaceState iFacadeInterfaceState = (IFacadeInterfaceState) iState;
			facade = UtilsFacadeInterfaceState
					.findReferencedFacade(iFacadeInterfaceState);
			facadeInterface = UtilsFacadeInterfaceState
					.findReferencedFacadeInterface(iFacadeInterfaceState);
			methodSignature = iFacadeInterfaceState.getMethodSignature();
		}else{
			facade =ifacadeCall;
			facadeInterface =facadeInterCall;
			methodSignature =methodSignatureCall;
		}

		IPhysicalComponent physicalComponent = null;

		// Dependiendo de si el origen es una OP (IPLModuleReference), o una OI
		// (IBLModule), se procede a obtener el componente fisico
		if (module instanceof IPLModuleReference) {
			String blBlockName = ((IPLModuleReference) module).getModuleName();
			IPLModuleFile blModuleFile = UtilsModules
					.findPLModuleFile(blBlockName);
			physicalComponent = UtilsAssembly.findPhysicalComponent(
					assemblyFile, blModuleFile, facade, facadeInterface);
		} else if (module instanceof IBLModuleFile) {
			IBLModuleFile blModuleFile = ((IBLModuleFile) module);
			physicalComponent = UtilsAssembly.findPhysicalComponent(
					assemblyFile, blModuleFile, facade, facadeInterface);
		}
		if (physicalComponent != null) {
			IVegaProject[] xmlPath = physicalComponent.getVegaProject().getVegaProjectsOnXmlPath();
			// Desde el componente fisico, se obtienen todos los métodos y se
			// recorren.		
			IMethod[] methodsContainer = physicalComponent
					.getPhysicalComponentData().getMethodsContainer()
					.getMethods();
			for (IMethod iMethod : methodsContainer) {
				// Se comprueba que el método es que se corresponde con
				// el que tenemso en la fachada que estamos tratando.
				if (isMethod(iMethod, facadeInterface, methodSignature)) {
					IBLModule blmodule= VegaModelUtils.findParentElement(physicalComponent, BLModuleProject.class).getBLModule();
					IBLModuleFile moduleFile = blmodule.getBLModuleFile();
					String type = iMethod.getMethodImplementation().getMethodImplementationType();
					IComponentField componentField= UtilsDependencies.getImplMethodField(physicalComponent.getBaseComponentData(), iMethod.getElementId());
					if(type.equals("delegateImplementation")){
						//Obtenemos la fachada corespondiente al metodo delegado y buscamos su OI correspondiente.
						getMethodDelegate(fachada, methodSignature, xmlPath,
								moduleFile, componentField);
						
					}else if(type.equals("javaImplementation")){
						//Pendiente de obtener metodos java
		
					}else if(type.equals("mapperImplementation")){
						BLModuleProject bLModuleProject=VegaModelUtils.findParentElement(physicalComponent, BLModuleProject.class);
						IOperation operationPrueba = UtilsOperations.findOperation(xmlPath, bLModuleProject.getModule().getElementId(), iMethod.getName());
						ScenarioExternalizationContributor scenarioExternalizationContributor = new ScenarioExternalizationContributor();
						// Obtenemos las operaciones correspondientes a cada uno
						// de los métodos
						Set<IOperation> operations = new HashSet<IOperation>();
						scenarioExternalizationContributor
								.getOperationFromBLModule(moduleFile,
										operations);
						List<IOperation> initialOIs = new ArrayList<IOperation>(
								operations);
							// Se recorren todas las OI obtenidas
							for (IOperation operation : initialOIs) {
								IOperationData operationData = operation
										.getOperationData();
								if (operationData instanceof IInternalOperationData) {
									IInternalOperationData iInternalOperationData = (IInternalOperationData) operationData;
									// Se comprueba que la OI corresponde con el nombre del método que estamos buscando
									if (operation.getElementId().equals(iMethod.getName())) {
										OI lnOI = createEntities.createOis(
												dependencies,
												iInternalOperationData);
										fachada.setEOI(lnOI);
										// Obtenemos los estados que forman la OI a la que hemos accedido y los recorremos
										IState[] lstStates = iInternalOperationData
												.getOperationFlow()
												.getStateContainer()
												.getStates();
										getStates(moduleFile, lnOI, lstStates);

									}

								}
							}
						}
					}//Fin de comprobar si es el método que buscamos. 
			}
		}//FIN Componentes fisicos

	}

	public void getMethodDelegate(Fachada fachada, String methodSignature,
			IVegaProject[] xmlPath, IBLModuleFile moduleFile,
			IComponentField componentField) {
		if(componentField instanceof FacadeInterfaceCallField){
			String calledfacadeInterface = componentField.getFieldValue("calledFacadeInterface").toString();
			String pack = calledfacadeInterface.substring(0, calledfacadeInterface.lastIndexOf("."));
			String namecalledfacadeInterface = calledfacadeInterface.substring(calledfacadeInterface.lastIndexOf(".")+1, calledfacadeInterface.length());
			String calledfacade = componentField.getFieldValue("calledFacade").toString();
			IFacade ifacade = UtilsFacades.findFacade(xmlPath, calledfacade);
			IFacadeInterface facadeInter = UtilsFacades.findFacadeInterface(xmlPath, pack, namecalledfacadeInterface);						
			getElemenImpl(null, moduleFile, fachada, fachada, ifacade, facadeInter, methodSignature);
			
		}else if (componentField instanceof ComponentCallField){
			String pack =componentField.getFieldValue("calledComponentPackage").toString();
			String componentName =componentField.getFieldValue("calledComponentName").toString();
			IComponent component = UtilsComponents.findComponent(xmlPath, pack, componentName);	
			//Hay que distinguir si estamos en un java, un SQL o un AAL
			String type = component.getComponentType();
			if(type.equals("appAdapterComponent")){
				//Añadimos ala fachada el compomente AAL.
				component.exists();
			}else if(type.equals("sqlComponent")){
				//Añadimos ala fachada el compomente SQL.
				component.exists();
			}else if (type.equals("javaComponent")){
				//Añadimos ala fachada el compomente java.
			}
		}
	}

	private void getStates(IBLModuleFile moduleFile, OI lnOI, IState[] lstStates) {
		for (IState state : lstStates) {
			listOPModel = ensamblado.getEOP();
			/*
			 * En el caso de ser una interfaz de fachada, se llamara
			 * recursivamente a este método para obtener las fachadas de su sg
			 * OI y asi sucesivamente.
			 */
			if (state instanceof IFacadeInterfaceState) {
				// Se comprueba que la fachada que estamos analizando no exista
				// ni por parte de OP ni por parte de OI asi evitamos que se
				// repitan.
				Fachada fachadaIO = createEntities.createFacades(dependencies,
						state);
				Fachada fachadaIOModel = getFachada(fachadaIO, listOPModel);
				if (fachadaIOModel == null) {
					if (fachadaIO != null) {
						lnOI.getEFachada().add(fachadaIO);
						getElemenImpl(state, (IBLModuleFile) moduleFile, lnOI,
								fachadaIO, null, null, null);
					}
				} else {
					// Buscamos la fachada en nuestro modelo, y la asociamos,
					// pero ya no la creamos.
					fachadaIO = fachadaIOModel;
					lnOI.getEFachada().add(fachadaIO);
				}
			} else if (state instanceof WSCallerState) {
				Webservice webService = createEntities.createWebservice(
						dependencies, state);
				if (webService != null) {
					lnOI.getEWebService().add(webService);
				}

			} else if (state instanceof SiebelState) {
				Siebel siebel = createEntities
						.createSiebel(dependencies, state);
				if (siebel != null) {
					lnOI.getESiebel().add(siebel);
				}
			} else if (state instanceof SatState) {
				SAT sat = createEntities.createSAT(dependencies, state);
				if (sat != null) {
					lnOI.getESAT().add(sat);
				}
			} else if (state instanceof AltairState) {
				Altair altair = createEntities
						.createAltair(dependencies, state);
				if (altair != null) {
					lnOI.getEAltair().add(altair);
				}
			} else if (state instanceof BBOOState) {
				BBOO bboo = createEntities.createBBOO(dependencies, state);
				if (bboo != null) {
					lnOI.getEBBOO().add(bboo);
				}
			} else if (state instanceof TPStateImpl) {
				Tp tp = createEntities.createTp(dependencies, state);
				if (tp != null) {
					lnOI.getETp().add(tp);
				}
			} else if (state instanceof TrxopState) {
				TrxOP trxOP = createEntities.createTrxOP(dependencies, state);
				if (trxOP != null) {
					lnOI.getETrxOP().add(trxOP);
				}
			} else if (state instanceof OIState) {
				OIState stateOI = (OIState) state;
				String interOp = stateOI.getInternalOperation();
				String refAppl = stateOI.getReferenceApplication();
				IVegaProject[] xmlPath = stateOI.getVegaProject()
						.getVegaProjectsOnXmlPath();
				IOperation iOperation = UtilsOperations.findOperation(xmlPath,
						refAppl, interOp);
				IOperationData operationDataIO = iOperation.getOperationData();
				if (operationDataIO instanceof IInternalOperationData) {
					IInternalOperationData iInternalOperationDataIO = (IInternalOperationData) operationDataIO;
					// Se comprueba que la OI que estamos analizando no exista
					// ni por parte de OP ni por parte de OI asi evitamos que se
					// repitan.
					OI lnStateOI = createEntities.createOis(dependencies,
							iInternalOperationDataIO);
					OI oiModel = getInternalOper(lnStateOI, listOPModel);
					if (oiModel == null) {
						if (lnStateOI != null) {
							lnOI.getEstadoLlamadaOI().add(lnStateOI);
							IState[] lstStatesOI = iInternalOperationDataIO
									.getOperationFlow().getStateContainer()
									.getStates();
							getStates((IBLModuleFile) moduleFile, lnStateOI,
									lstStatesOI);
						}
					} else {
						// Buscamos la fachada en nuestro modelo, y la
						// asociamos, pero ya no la creamos.
						lnOI.getEstadoLlamadaOI().add(oiModel);
					}

				}

			}else if(state instanceof ComponentState){
				ComponentState componentState = (ComponentState)state;
				IVegaProject[] xmlPath = componentState.getVegaProject().getVegaProjectsOnXmlPath();
				String pack = componentState.getComponentPackage();
				String componentName = componentState.getComponentName();
				IComponent component = UtilsComponents.findComponent(xmlPath, pack, componentName);
				String type = component.getComponentType();
				if(type.equals("appAdapterComponent")){
					//Añadimos a la OI el compomente AAL.
					component.exists();
				}else if(type.equals("sqlComponent")){
					//Añadimos a la OI el compomente SQL.
//					ComponentSQL sql = null;
//					lnOI.
					
				}else if (type.equals("javaComponent")){
					//Añadimos a la OI el compomente java.
				}
								
				
			}
		}// end for
	}

	public OI getInternalOper(OI oiIni, EList<OP> listOPs) {
		OI oiModel = null;
		List<OI> listOI = new ArrayList<OI>();
		if (listOPs == null) {
			return oiModel;
		}
		for (OP op : listOPs) {
			EList<Fachada> opFacades = op.getEFachada();
			for (Fachada fachada : opFacades) {
				OI initOI = fachada.getEOI();
				if (initOI != null) {
					if (!listOI.contains(initOI)) {
						listOI.add(initOI);
					}
					getInternalOperations(initOI, listOI);
				}
			}
		}

		for (OP op : listOPs) {
			EList<OI> opOIs = op.getEOI();
			for (OI opOI : opOIs) {
				if (opOI != null) {
					if (!listOI.contains(opOI)) {
						listOI.add(opOI);
					}
					getInternalOperations(opOI, listOI);
				}
			}
		}

		for (OI oi : listOI) {
			if (oi == oiIni) {
				oiModel = oi;
				break;
			}
		}

		return oiModel;
	}

	public List<OI> getInternalOperations(OI oi, List<OI> listOI) {
		EList<Fachada> listFacades = oi.getEFachada();
		for (Fachada fachada : listFacades) {
			OI OIfacade = fachada.getEOI();
			if (OIfacade != null) {
				if (!listOI.contains(OIfacade)) {
					listOI.add(OIfacade);
				}
				getInternalOperations(OIfacade, listOI);
			}
		}
		List<OI> listIO = oi.getEstadoLlamadaOI();
		for (OI internalOI : listIO) {
			if (!listOI.contains(internalOI)) {
				listOI.add(internalOI);
			}
			getInternalOperations(internalOI, listOI);
		}
		return listOI;
	}

	private Fachada getFachada(Fachada fachadaIO, EList<OP> listOPs) {
		Fachada facade = null;
		List<Fachada> listfacades = new ArrayList<Fachada>();
		List<Fachada> listfacadesTotal = new ArrayList<Fachada>();
		for (OP op : listOPs) {
			listfacades = op.getEFachada();
			for (Fachada fachada : listfacades) {
				listfacadesTotal.add(fachada);
			}
			getFacadesIO(listfacades, listfacadesTotal);
		}

		for (Fachada fachada : listfacadesTotal) {
			if (fachada == fachadaIO) {
				facade = fachada;
				break;
			}
		}
		return facade;
	}

	public List<Fachada> getFacadesIO(List<Fachada> listfacades,
			List<Fachada> listfacadesTotal) {
		for (Fachada fachada : listfacades) {
			OI initOI = fachada.getEOI();
			if (initOI != null) {
				List<Fachada> facedesOI = initOI.getEFachada();
				for (Fachada facade : facedesOI) {
					if (!listfacadesTotal.contains(facade)) {
						listfacadesTotal.add(facade);
					}
				}
				getFacadesIO(facedesOI, listfacadesTotal);

				List<OI> listIO = initOI.getEstadoLlamadaOI();
				for (OI internalOI : listIO) {
					List<Fachada> listfacadesOI = internalOI.getEFachada();
					getFacadesIO(listfacadesOI, listfacadesTotal);
				}
			}
		}
		return listfacadesTotal;
	}

	public boolean isMethod(IMethod iMethod, IFacadeInterface facadeInterface,
			String methodSignature) {
		IMethod[] facadeMethods = facadeInterface.getComponentData()
				.getMethodsContainer().getMethods();
		String nameMehotd = methodSignature.substring(0,
				methodSignature.lastIndexOf("("));
		ComponentMethodSignature signature = new ComponentMethodSignature(
				iMethod);
		IMethod methodFacade = null;
		for (IMethod iMethod2 : facadeMethods) {
			if (iMethod2.getName().equals(nameMehotd)) {
				methodFacade = iMethod2;
				break;
			}
		}

		if (methodFacade == null) {
			return false;
		}
		ComponentMethodSignature iSignature = new ComponentMethodSignature(
				methodFacade);
		if (signature.equalsWithExceptions(iSignature)) {
			String physReturnType = iMethod.getMethodReturn().getReturnType();
			String facadeReturnType = methodFacade.getMethodReturn()
					.getReturnType();

			if (!physReturnType.equals(facadeReturnType)) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

	private String getMode(String scenary, IProject iProject)
			throws IOException {
		String mode = null;
		String rutaProject = iProject.getLocationURI().getPath().toString();
		rutaProject = rutaProject
				.substring(0, rutaProject.lastIndexOf("/") + 1).concat(scenary)
				.concat("/JavaSource/").concat(scenary)
				.concat("_descriptor.xml");
		File file = new File(rutaProject);
		if (file.exists()) {
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
					NodeList fstNmElmntLst = fstElmnt
							.getElementsByTagName("param-name");
					Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
					NodeList fstNm = fstNmElmnt.getChildNodes();
					if (fstNm.item(0).getNodeValue()
							.equals("RigelProp_aeb_newMultisMode")) {
						NodeList lstNmElmntLst = fstElmnt
								.getElementsByTagName("param-value");
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
		return scenario.getParent().getParent().getParent().getElementId()
				.toString();
	}

	private File createFile(String name, String ruta, IProject iProject)
			throws IOException {
		if (iProject.getLocationURI() != null) {
			String rutaProject = iProject.getLocationURI().getPath().toString();
			rutaProject = rutaProject.substring(0,
					rutaProject.lastIndexOf(name) - 1);
			if (!ruta.startsWith("/")) {
				ruta = "/".concat(ruta);
			}
			if (ruta.startsWith(name)) {
				ruta = ruta.replaceFirst(name, "");
			} else {
				if (ruta.startsWith("/".concat(name))) {
					ruta = ruta.replaceFirst("/".concat(name), "");
				}
			}
			String rutaFinal = rutaProject.concat(ruta);
			File filePath = new File(rutaFinal);
			if (!filePath.exists()) {
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
