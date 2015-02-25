package com.isb.vega.generator.xml.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.isb.vega.generator.xml.configuration.EntitiesLogLevelsXmlGenerator.EntityAndLogLevels;
import com.isb.vega.internal.model.assembly.AssemblyChannelAdapterReference;
import com.isb.vega.internal.model.blapplication.BLApplication;
import com.isb.vega.internal.model.operation.flow.state.connector.altair.AltairState;
import com.isb.vega.internal.model.operation.flow.state.connector.bboo.BBOOState;
import com.isb.vega.internal.model.operation.flow.state.connector.sat.SatState;
import com.isb.vega.internal.model.operation.flow.state.connector.siebel.SiebelState;
import com.isb.vega.internal.model.operation.flow.state.connector.tp.TPStateImpl;
import com.isb.vega.internal.model.operation.flow.state.connector.trxop.TrxopState;
import com.isb.vega.internal.model.operation.flow.state.connector.wscaller.WSCallerState;
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
import com.isb.vega.model.core.VegaModelUtils;
import com.isb.vega.model.descriptors.xml.generator.IEntitiesLogLevelsXmlGenerator;
import com.isb.vega.model.operation.flow.IFlowOperationData;
import com.isb.vega.model.operation.flow.IInternalOperationData;
import com.isb.vega.model.operation.flow.IState;
import com.isb.vega.model.operation.flow.state.facade.IFacadeInterfaceState;
import com.isb.vega.runtime.wrapper.manager.MessagingServiceManager;

import dependencies.Altair;
import dependencies.BBOO;
import dependencies.ChannelAdapter;
import dependencies.DependenciesFactory;
import dependencies.Ensamblado;
import dependencies.Fachada;
import dependencies.HOST;
import dependencies.JMS;
import dependencies.LogLevel;
import dependencies.MultiProfile;
import dependencies.OI;
import dependencies.OP;
import dependencies.SAT;
import dependencies.SATLogicalChannel;
import dependencies.SATPhysicalChannel;
import dependencies.Security;
import dependencies.Siebel;
import dependencies.Tp;
import dependencies.TrxOP;
import dependencies.TrxOPLogicalChannel;
import dependencies.TrxOPPhysicalChannel;
import dependencies.Webservice;

public class CreateEntities {

	static String logicalChannel = ".LogicalChannel";
	static String physicalChannel = ".PhysicalChannel";
	static String trxOp = "TrxOp.HostCommunication.";
	static String sat = "Sat.HostCommunication.";


	UtilsDependencies utilsDependencies = new UtilsDependencies();
	/** Rellena la entidad fachada a partir del State proporcionado.
	 * @param dependencies - Factoría de entidades del modelo
	 * @param iState - estado de interfaz de fachada
	 * @param string2 
	 * @param namecalledfacadeInterface 
	 * @param string 
	 * @param calledfacade 
	 * @return 
	 * @return listFachada - lista de fachadas cargadas
	 */
	public Fachada createFacades(DependenciesFactory dependencies,
			IState iState) {
			Fachada fachada;
				IFacadeInterfaceState facadeState = (IFacadeInterfaceState)iState;					
				fachada = dependencies.createFachada();
				fachada.setFacadeName(facadeState.getFacade());
				fachada.setMethodName(facadeState.getName());
				fachada.setInterfazName(facadeState.getFacadeInterface());
				fachada.setMethodID(facadeState.getMethodID());
		return fachada;
	}

	/** Rellena la entidad OP a partir del IFlowOperationData proporcionado.
	 * @param iFlowOperationData -
	 * @param dependencies - Factoría de entidades del modelo
	 * @return 
	 * @return listOP - lista de ops cargadas
	 */
	public OP createOPs(DependenciesFactory dependencies,
			IFlowOperationData iFlowOperationData,Ensamblado ensamblado) {
		OP op = dependencies.createOP();	
		op.setOpName(iFlowOperationData.getName());
		op.setVersion(iFlowOperationData.getVersion());
		op.setLpName(iFlowOperationData.getParent().getParent().getParent().getElementId());
		return op;
	}


	/** Rellena la entidad MULTIPROFILE 
	 * @param assemblyFileData - Datos del fichero del ensamblado
	 * @param dependencies - Factoría de entidades del modelo
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
	 * @param iAssemblyCategoryProfile - objeto que proporciona el contenedor del perfil múltiple de vega.
	 * @param multiprofile - entidad MULTIPROFILE
	 */
	public void setValuesMultiProfiles(IAssemblyCategoryProfile iAssemblyCategoryProfile,
											  MultiProfile multiprofile) {
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
	 * @param dependencies - Factoría de entidades del modelo
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
	 * @param dependencies - Factoría de entidades del modelo
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
	
	public  OI createOis(DependenciesFactory dependencies,
			IInternalOperationData iInternalOperationData) {
			BLApplication parent = VegaModelUtils.findParentElement(iInternalOperationData, BLApplication.class);						
			OI oi = dependencies.createOI();
			oi.setLnName(parent.getElementId());
			oi.setOiName(iInternalOperationData.getName());
			oi.setVersion(iInternalOperationData.getVersion());
		return oi;
	}
	
	public Webservice createWebservice(DependenciesFactory dependencies,IState iState) {

            WSCallerState wsState = (WSCallerState)iState;       
            Webservice webService = dependencies.createWebservice();
            webService.setAlias(wsState.getAlias());
            webService.setNamespace(wsState.getNameSpace());
            webService.setState(wsState.getName());//wsState.getStateType()
            webService.setSynchrony((wsState.getMessageType()== 1) ? "true": "false");
            webService.setWsdl(wsState.getWsdl());
            webService.setWsOp(wsState.getOperation());
            webService.setTransport(wsState.getTransport());

            return webService;

}
	
	public Siebel createSiebel(DependenciesFactory dependencies,IState iState) {

            SiebelState siebelState = (SiebelState)iState;
            Siebel siebel = dependencies.createSiebel();
            siebel.setState(siebelState.getName());//siebelState.getStateType()
            siebel.setServer(siebelState.getSiebelServerAlias());
            siebel.setRequest(siebelState.getSiebelRequestType());
            siebel.setObject(siebelState.getSiebelObject());

            return siebel;
      
}

	public SAT createSAT (DependenciesFactory dependencies,IState iState) {

		 SatState satState = (SatState)iState;
         SAT sat = dependencies.createSAT();
         sat.setAlias(satState.getSatAlias());
         sat.setMode(satState.getSatMode());
         sat.setSatName(satState.getSatName()); // dudas con name
         sat.setState(satState.getName());//satState.getStateType()
         sat.setVersion(satState.getSatVersion());

         return sat;

}
	
	public Altair createAltair (DependenciesFactory dependencies,IState iState) {

		  AltairState altairState = (AltairState)iState;
          Altair altair = dependencies.createAltair();
          altair.setAlias(altairState.getAltairAlias());
          altair.setMode(altairState.getAltairMode());
          altair.setState(altairState.getName());//altairState.getStateType()
          altair.setTransaction(altairState.getAltairTransaction());
          altair.setVersion(altairState.getAltairVersion());

        return altair;

}
	
	public BBOO createBBOO (DependenciesFactory dependencies,IState iState) {
		BBOOState bbooState = (BBOOState)iState;
		BBOO bboo = dependencies.createBBOO();
		bboo.setAlias(bbooState.getBBOOServerAlias()); //mirar ya que no hay otro alias
		bboo.setDocument(bbooState.getBBOODocument());
		bboo.setProvider(bbooState.getBBOODataProvider());
		bboo.setState(bbooState.getName());//bbooState.getStateType()
		
      return bboo;

}
	
	public Tp createTp (DependenciesFactory dependencies,IState iState) {
		TPStateImpl tpState = (TPStateImpl)iState;
        Tp tp = dependencies.createTp();
        tp.setCode(tpState.getCode());
        tp.setState(tpState.getName());//tpState.getStateType()
        tp.setSubtype(tpState.getSubType());
        tp.setType(tpState.getType());
		
      return tp;

}
	
	public TrxOP createTrxOP (DependenciesFactory dependencies,IState iState) {

		TrxopState trxopState = (TrxopState)iState;
		TrxOP trxop = dependencies.createTrxOP();
		trxop.setAlias(trxopState.getTrxopAlias());
		trxop.setProtocol(trxopState.getTrxopMode());
		trxop.setOperation(trxopState.getTrxopOperation());
		trxop.setState(trxopState.getName());//trxopState.getStateType()
		trxop.setTransaction(trxopState.getTrxopTransaction());
		trxop.setTransactionMode(trxopState.getTrxopCtgAware());
		trxop.setVersion(trxopState.getTrxopVersion());
		
      return trxop;

}
	
}
