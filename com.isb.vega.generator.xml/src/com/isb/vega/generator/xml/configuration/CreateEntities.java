package com.isb.vega.generator.xml.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.isb.vega.generator.xml.configuration.EntitiesLogLevelsXmlGenerator.EntityAndLogLevels;
import com.isb.vega.internal.model.assembly.AssemblyChannelAdapterReference;
import com.isb.vega.model.assembly.IAssemblyFileData;
import com.isb.vega.model.assembly.IAssemblyNode;
import com.isb.vega.model.assembly.IAssemblyProject;
import com.isb.vega.model.assembly.UtilsAssembly;
import com.isb.vega.model.assembly.profile.multi.IAssemblyCategoryProfile;
import com.isb.vega.model.assembly.profile.multi.IAssemblyCategoryProfileContainer;
import com.isb.vega.model.assembly.profile.multi.IAssemblyValueCategory;
import com.isb.vega.model.assembly.settings.IAdvancedSettingsContainer;
import com.isb.vega.model.assembly.settings.IAssemblySettingsContainer;
import com.isb.vega.model.assembly.settings.IHostCommChannelContainer;
import com.isb.vega.model.assembly.settings.ISetting;
import com.isb.vega.model.channeladapter.IChannelAdapter;
import com.isb.vega.model.channeladapter.IChannelAdapterMethod;
import com.isb.vega.model.core.IVegaElement;
import com.isb.vega.model.descriptors.xml.generator.IEntitiesLogLevelsXmlGenerator;
import com.isb.vega.model.operation.flow.IFlowOperationData;
import com.isb.vega.model.operation.flow.IState;
import com.isb.vega.model.operation.flow.state.facade.IFacadeInterfaceState;
import com.isb.vega.runtime.wrapper.manager.MessagingServiceManager;

import dependencies.ChannelAdapter;
import dependencies.DependenciesFactory;
import dependencies.Ensamblado;
import dependencies.Fachada;
import dependencies.HOST;
import dependencies.JMS;
import dependencies.LogLevel;
import dependencies.MultiProfile;
import dependencies.OP;
import dependencies.SATLogicalChannel;
import dependencies.SATPhysicalChannel;
import dependencies.Security;
import dependencies.TrxOPLogicalChannel;
import dependencies.TrxOPPhysicalChannel;

public class CreateEntities {

	static String logicalChannel = ".LogicalChannel";
	static String physicalChannel = ".PhysicalChannel";
	static String trxOp = "TrxOp.HostCommunication.";
	static String sat = "Sat.HostCommunication.";


	Fachada fachada;
	UtilsDependencies utilsDependencies = new UtilsDependencies();
	/** Rellena la entidad fachada a partir del State proporcionado.
	 * @param dependencies - Factor�a de entidades del modelo
	 * @param iState - estado de interfaz de fachada
	 * @return 
	 * @return listFachada - lista de fachadas cargadas
	 */
	public Fachada createFacades(DependenciesFactory dependencies,
			IState iState) {
		List<Fachada> listFachada = new ArrayList<Fachada>();
			IFacadeInterfaceState facadeState = (IFacadeInterfaceState)iState;					
			fachada = dependencies.createFachada();
			fachada.setFacadeName(facadeState.getFacade());
			fachada.setMethodName(facadeState.getName());
			fachada.setInterfazName(facadeState.getFacadeInterface());
			if(fachada!=null) listFachada.add(fachada);
	 
		return fachada;
	}

	/** Rellena la entidad OP a partir del IFlowOperationData proporcionado.
	 * @param iFlowOperationData -
	 * @param dependencies - Factor�a de entidades del modelo
	 * @return 
	 * @return listOP - lista de ops cargadas
	 */
	public OP createOPs(DependenciesFactory dependencies,
			IFlowOperationData iFlowOperationData,Ensamblado ensamblado) {
		List<OP> listOP = new ArrayList<OP>();
		OP op = dependencies.createOP();	
		op.setOpName(iFlowOperationData.getName());
		op.setVersion(iFlowOperationData.getVersion());
		op.setLpName(iFlowOperationData.getParent().getParent().getParent().getElementId());
		if (op !=null) listOP.add(op);
	//	ensamblado.setEOP(op);
		return op;
	}


	/** Rellena la entidad MULTIPROFILE 
	 * @param assemblyFileData - Datos del fichero del ensamblado
	 * @param dependencies - Factor�a de entidades del modelo
	 */
	public void createMultiProfile(IAssemblyFileData assemblyFileData, DependenciesFactory dependencies, Ensamblado ensamblado) {
		IAssemblyCategoryProfileContainer assemblyCategoryContainer = assemblyFileData.getAssemblyCategoryContainer();
		IAssemblyCategoryProfile[] categories = assemblyCategoryContainer.getCategories();
		MultiProfile multiprofile = dependencies.createMultiProfile();
		for (IAssemblyCategoryProfile iAssemblyCategoryProfile : categories) {
			setValuesMultiProfiles(iAssemblyCategoryProfile, multiprofile);
		}
		multiprofile.setCatOrden(utilsDependencies.getOrden(multiprofile));
		ensamblado.setEMultiProfile(multiprofile);
	}


	/** Rellena los atributos de la entidad MULTIPROFILE dependiendo del nombre del nombre del AssemblyCategoryProfile
	 * @param iAssemblyCategoryProfile - objeto que proporciona el contenedor del perfil m�ltiple de vega.
	 * @param multiprofile - entidad MULTIPROFILE
	 */
	public void setValuesMultiProfiles(IAssemblyCategoryProfile iAssemblyCategoryProfile, MultiProfile multiprofile) {
		IAssemblyValueCategory[] assemblyValueCategory = iAssemblyCategoryProfile.getAssemblyValueCategoryContainer().getValues();
		if (iAssemblyCategoryProfile.getName().equals( "CanalMarco")){
			multiprofile.setCatCanalMarco(utilsDependencies.obtenerValor(assemblyValueCategory));
		}else if (iAssemblyCategoryProfile.getName().equals( "Empresa")){
			multiprofile.setCatCompany(utilsDependencies.obtenerValor(assemblyValueCategory));
		}else if (iAssemblyCategoryProfile.getName().equals( "EmpresaAsociada")){
			multiprofile.setCatEmpresaAsociada(utilsDependencies.obtenerValor(assemblyValueCategory));
		}else if (iAssemblyCategoryProfile.getName().equals( "Estructura")){
			multiprofile.setCatEstructura(utilsDependencies.obtenerValor(assemblyValueCategory));
		}else if (iAssemblyCategoryProfile.getName().equals( "Gama")){
			multiprofile.setCatGama(utilsDependencies.obtenerValor(assemblyValueCategory));
		}else if (iAssemblyCategoryProfile.getName().equals( "Idioma")){
			multiprofile.setCatIdioma(utilsDependencies.obtenerValor(assemblyValueCategory));
		}else if (iAssemblyCategoryProfile.getName().equals( "NivelIU")){
			multiprofile.setCatNivelIU(utilsDependencies.obtenerValor(assemblyValueCategory));
		}else if (iAssemblyCategoryProfile.getName().equals( "Render")){
			multiprofile.setCatRender(utilsDependencies.obtenerValor(assemblyValueCategory));
		}
		//

	}



	/** Rellena la entidad SECURITY a partir del AssemblyFileData proporcionado.
	 * @param assemblyFileData - datos del fichero del ensamblado
	 * @param dependencies - Factor�a de entidades del modelo
	 */
	public void createSecurity(IAssemblyFileData assemblyFileData, DependenciesFactory dependencies, Ensamblado ensamblado) {
		Security security = dependencies.createSecurity();
		HOST host = dependencies.createHOST();
		IAssemblySettingsContainer assemblySettingsContainer = assemblyFileData.getAssemblySettingsContainer();
		IAdvancedSettingsContainer advancedSettingContainer = assemblySettingsContainer.getAdvancedSettingsContainer();
		ISetting[] basisSettings = assemblySettingsContainer.getBasicSettingsContainer().getSettings();
		ISetting[] setting = advancedSettingContainer.getSettingsContainer().getSettings();
		for (ISetting iSetting : setting) {
			String value = iSetting.getValue();
			if (iSetting.getElementId().equals("aeb.opcontainer.uploadusunotes")){
				security.setUsuNotes(value);
			}else if(iSetting.getElementId().equals("aeb.multis")){
				security.setMulti(value);
			}else if(iSetting.getElementId().equals("aeb.external.entity.alias")){
				security.setEntityAlias(value);
			}else if(iSetting.getElementId().equals("initialization.codedPassword")){
				security.setCodePassword(value);
			}else if (iSetting.getElementId().equals("Sat.Timeout")){
				host.setSatTimeOut(value);
			}else if(iSetting.getElementId().equals("satTypeString.nullWhenSpaces")){
				host.setSatNullWhenSpaces(value);
			}else if(iSetting.getElementId().equals("sattype.null")){
				host.setSatNullValues(value);
			}
		}

		for (ISetting basisSetting : basisSettings) {
			String value = basisSetting.getValue();
			if (basisSetting.getElementId().equals("aeb.authentication.enabled")){
				security.setAutentication(value);				
			}else if(basisSetting.getElementId().equals("TrxOp.ProtocolsUsed.TransactionRedG")){
				host.setRedProtocol(value);
			}else if(basisSetting.getElementId().equals("TrxOp.ProtocolsUsed.Transaction")){
				host.setTrxprotocol(value);
			}else if(basisSetting.getElementId().equals("Altair.ProtocolsUsed.Alias")){
				host.setAltairAlias(value);
			}else if(basisSetting.getElementId().equals("Altair.ProtocolsUsed.Transaction")){
				host.setAltairProtocol(value);
			}else if(basisSetting.getElementId().equals("TrxOp.ProtocolsUsed.Alias")){//TCP
				host.setTrxOPTCPAlias(value);
			}else if(basisSetting.getElementId().equals("Sat.ProtocolsUsed.Transaction")){
				host.setSatProtocol(value);
			}else if(basisSetting.getElementId().equals("Sat.ProtocolsUsed.Alias")){
				host.setSatAlias(value);
			}else if(basisSetting.getElementId().equals("TrxOp.ProtocolsUsed.Alias.Type")){
				host.setTrxOPDefaultMode(value);				
			}
		}

		// Vamos a crear los canales fisicos y logicos del host.
		Collection<IHostCommChannelContainer> listChannels = advancedSettingContainer.getAllChannelContainers();
		List<TrxOPLogicalChannel> listTrxLogicalChannel = new ArrayList<TrxOPLogicalChannel>();
		List<TrxOPPhysicalChannel> listTrxPhysicalChannel = new ArrayList<TrxOPPhysicalChannel>();
		List<SATLogicalChannel> listSATLogicalChannel = new ArrayList<SATLogicalChannel>();
		List<SATPhysicalChannel> listSATPhysicalChannel = new ArrayList<SATPhysicalChannel>();
		for (IHostCommChannelContainer channel : listChannels) {
			IVegaElement[] children;
			if(channel.getElementId().equals("trxOpHostCommLogicChContainer")){
				children = channel.getChildren();
				for (int i=0; i<children.length; i++) {
					String name = children[i].getFieldValue("name").toString();	    			
					String value = children[i].getFieldValue("value").toString();
					TrxOPLogicalChannel trxLogicalChannel = dependencies.createTrxOPLogicalChannel();
					trxLogicalChannel.setName(utilsDependencies.getname(name, trxOp, logicalChannel));
					trxLogicalChannel.setValue(value);
					listTrxLogicalChannel.add(i,trxLogicalChannel);		
				}
				host.getEOPLogicalChannel().addAll(listTrxLogicalChannel);

			}else if(channel.getElementId().equals("trxOpHostCommPhysicChContainer")){
				children = channel.getChildren();
				for (int i=0; i<children.length; i++) {
					String name = children[i].getFieldValue("name").toString();
					String value = children[i].getFieldValue("value").toString();
					TrxOPPhysicalChannel trxPhysicalChannel = dependencies.createTrxOPPhysicalChannel();
					trxPhysicalChannel.setName(utilsDependencies.getname(name, trxOp, physicalChannel));
					trxPhysicalChannel.setValue(value);
					listTrxPhysicalChannel.add(i,trxPhysicalChannel);	
				}
				host.getEPhysicalChannel().addAll(listTrxPhysicalChannel);

			}else if(channel.getElementId().equals("satHostCommLogicChContainer")){
				children = channel.getChildren();
				for (int i=0; i<children.length; i++) {
					String name = children[i].getFieldValue("name").toString();
					String value = children[i].getFieldValue("value").toString();
					SATLogicalChannel satLogicalChannel = dependencies.createSATLogicalChannel();
					satLogicalChannel.setName(utilsDependencies.getname(name, sat, logicalChannel));
					satLogicalChannel.setValue(value);
					listSATLogicalChannel.add(i,satLogicalChannel);	
				}
				host.getESATLogicalChannel().addAll(listSATLogicalChannel);

			}else if(channel.getElementId().equals("satHostCommPhysicChContainer")){
				children = channel.getChildren();
				for (int i=0; i<children.length; i++) {
					String name = children[i].getFieldValue("name").toString();
					String value = children[i].getFieldValue("value").toString();
					SATPhysicalChannel satPhysicalChannel = dependencies.createSATPhysicalChannel();
					satPhysicalChannel.setName(utilsDependencies.getname(name, sat, physicalChannel));
					satPhysicalChannel.setValue(value);
					listSATPhysicalChannel.add(i,satPhysicalChannel);
				}
				host.getESATPhysicalChannel().addAll(listSATPhysicalChannel);
			}


		} 

		ensamblado.setEEnsamblado(security);
		ensamblado.setEHOST(host);
	}


	
	public void createChannelAdapter(IAssemblyProject assemblyProject,
			IAssemblyFileData assemblyFileData, DependenciesFactory dependencies, Ensamblado ensamblado) {

		IVegaElement[] assemblyNodeContainer = assemblyFileData.getAssemblyDiagram().getAssemblyNodeContainer().getChildren();
		List<ChannelAdapter> listChannelAdapter = new ArrayList<ChannelAdapter>();
		for (IVegaElement assemblyNode : assemblyNodeContainer) {
			if(assemblyNode instanceof AssemblyChannelAdapterReference){
				AssemblyChannelAdapterReference channelAdapterReference = (AssemblyChannelAdapterReference)assemblyNode;
				//Accedemos la adaptador para obtener todos sus datos
				IChannelAdapter adapter = UtilsAssembly.findChannelAdapter(assemblyProject, channelAdapterReference.getName());
				IChannelAdapterMethod[] channelAdapterMethod = adapter.getChannelAdapterFile().getChannelAdapterFileData().getChannelAdapterMethodContainer().getChannelAdapterMethods();
				for (IChannelAdapterMethod iChannelAdapterMethod : channelAdapterMethod) {
					String alias = iChannelAdapterMethod.getAlias();
					String interfacename = iChannelAdapterMethod.getFacadeInterfaceReference();
					interfacename= interfacename.substring(interfacename.lastIndexOf(".")+1, interfacename.length());
					ChannelAdapter channelAdapter = dependencies.createChannelAdapter();
					channelAdapter.setName(channelAdapterReference.getName());
					channelAdapter.setType(channelAdapterReference.getChannelAdapterType());
					channelAdapter.setFacadeName(channelAdapterReference.getReferenceFacade());
					channelAdapter.setInterfaceName(interfacename);
					channelAdapter.setAlias(alias);
					listChannelAdapter.add(channelAdapter);						
				}
				ensamblado.getEChannelAdapter().addAll(listChannelAdapter);				
			}			
		}	
	}

	public void createLogLevel(IAssemblyFileData assemblyFileData, DependenciesFactory dependencies, Ensamblado ensamblado) {
		IAssemblyNode[] nodos=assemblyFileData.getAssemblyDiagram().getAssemblyNodeContainer().getNodes();
		List<LogLevel> list = utilsDependencies.getLogLevels(nodos, dependencies, assemblyFileData);
		if(assemblyFileData.getLogLevelsContainer().getLogLevels().length>0){
			EntityAndLogLevels logEntity = new EntityAndLogLevels(assemblyFileData,assemblyFileData.getLogLevelsContainer(),assemblyFileData.getName(),IEntitiesLogLevelsXmlGenerator.ASSEMBLY_PRIORITY) ;
			LogLevel loglevel= utilsDependencies.LoggeableEntity(logEntity,assemblyFileData, dependencies);
			if(loglevel!=null)
				list.add(loglevel);
		}
		ensamblado.getELogLevel().addAll(list);

	}

	

	/** Rellena la entidad JMS a partir del AssemblyFileData proporcionado.
	 * @param assemblyFileData - datos del fichero del ensamblado
	 * @param dependencies - Factor�a de entidades del modelo
	 * @param ensamblado -  Ensamblado
	 */
	public void createJMS(IAssemblyFileData assemblyFileData, DependenciesFactory dependencies, Ensamblado ensamblado) {
		IAssemblySettingsContainer assemblySettingsContainer = assemblyFileData.getAssemblySettingsContainer();
		IAdvancedSettingsContainer advancedSettingContainer = assemblySettingsContainer.getAdvancedSettingsContainer();
		ISetting[] setting = advancedSettingContainer.getSettingsContainer().getSettings();
		List<JMS> listJMS = new ArrayList<JMS>();
		for (ISetting iSetting : setting) {
			if (iSetting.getElementId().equals("jms.transactional")){
				String value = iSetting.getValue();
				String[] valueSplit= value.split(",");
				for (String string : valueSplit) {
					String portName = MessagingServiceManager.getInstance().getListenerPortByAlias(string);
					JMS jms = dependencies.createJMS();
					jms.setJmsModules(string);
					jms.setListenerPorts(portName);
					listJMS.add(jms);
				}
			}
		}
		ensamblado.getEJMS().addAll(listJMS);
	}
	
}
