package com.isb.vega.generator.xml.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.isb.vega.generator.xml.configuration.EntitiesLogLevelsXmlGenerator.EntityAndLogLevels;
import com.isb.vega.internal.model.assembly.AssemblyChannelAdapterReference;
import com.isb.vega.internal.model.component.externalization.ComponentMethodSignature;
import com.isb.vega.model.applogs.IAssemblyLoggeableComponent;
import com.isb.vega.model.applogs.IAssemblyLoggeableEntity;
import com.isb.vega.model.applogs.IAssemblyLoggeableMethod;
import com.isb.vega.model.applogs.IAssemblyLoggeableOperation;
import com.isb.vega.model.assembly.IAppReference;
import com.isb.vega.model.assembly.IAssemblyFileData;
import com.isb.vega.model.assembly.IAssemblyNode;
import com.isb.vega.model.assembly.IAssemblyProject;
import com.isb.vega.model.assembly.IModuleReference;
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
import com.isb.vega.model.component.IBaseComponent;
import com.isb.vega.model.component.IBaseComponentData;
import com.isb.vega.model.component.IBaseMethod;
import com.isb.vega.model.component.IComponent;
import com.isb.vega.model.component.IImplLogMethod;
import com.isb.vega.model.component.IMethod;
import com.isb.vega.model.component.IPhysicalComponentData;
import com.isb.vega.model.component.UtilsComponents;
import com.isb.vega.model.component.facade.IFacadeInterfaceMethod;
import com.isb.vega.model.component.pl.IPLPhysicalComponent;
import com.isb.vega.model.core.IVegaElement;
import com.isb.vega.model.core.IVegaProject;
import com.isb.vega.model.descriptors.xml.generator.IEntitiesLogLevelsXmlGenerator;
import com.isb.vega.model.loglevels.ILogLevel;
import com.isb.vega.model.loglevels.ILogLevelsContainer;
import com.isb.vega.model.loglevels.ILoggeable;
import com.isb.vega.model.operation.flow.IFlowOperationData;
import com.isb.vega.model.operation.flow.IState;
import com.isb.vega.model.operation.flow.state.facade.IFacadeInterfaceState;
import com.isb.vega.model.preassembly.util.UtilsPreAssembly;
import com.isb.vega.model.vegabeans.IVegaBeanPackage;
import com.isb.vega.runtime.wrapper.manager.MessagingServiceManager;

import dependencies.ChannelAdapter;
import dependencies.DependenciesFactory;
import dependencies.Ensamblado;
import dependencies.Fachada;
import dependencies.HOST;
import dependencies.JMS;
import dependencies.Levels;
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
	

	static Fachada fachada;
	/** Rellena la entidad fachada a partir del State proporcionado.
	  * @param dependencies - Factoría de entidades del modelo
	  * @param iState - estado de interfaz de fachada
	 * @return 
	  * @return listFachada - lista de fachadas cargadas
	  */
	public static Fachada createFacades(DependenciesFactory dependencies,
									 IState iState) {
		List<Fachada> listFachada = new ArrayList<Fachada>();
		if(iState instanceof IFacadeInterfaceState){
			IFacadeInterfaceState facadeState = (IFacadeInterfaceState)iState;					
			fachada = dependencies.createFachada();
			fachada.setFacadeName(facadeState.getFacade());
			fachada.setMethodName(facadeState.getName());
			fachada.setInterfazName(facadeState.getFacadeInterface());
			listFachada.add(fachada);
		}
		return fachada;
	}
	
	/** Rellena la entidad OP a partir del IFlowOperationData proporcionado.
	  * @param iFlowOperationData -
	  * @param dependencies - Factoría de entidades del modelo
	 * @return 
	  * @return listOP - lista de ops cargadas
	*/
	public static OP createOPs(DependenciesFactory dependencies,
								 IFlowOperationData iFlowOperationData,Ensamblado ensamblado) {
		List<OP> listOP = new ArrayList<OP>();
		OP op = dependencies.createOP();	
		op.setOpName(iFlowOperationData.getName());
		op.setVersion(iFlowOperationData.getVersion());
		op.setLpName(iFlowOperationData.getParent().getParent().getParent().getElementId());
		listOP.add(op);
		ensamblado.setEOP(op);
		return op;
	}
	
	
	/** Rellena la entidad MULTIPROFILE 
	  * @param assemblyFileData - Datos del fichero del ensamblado
	  * @param dependencies - Factoría de entidades del modelo
	*/
	public static void createMultiProfile(IAssemblyFileData assemblyFileData, DependenciesFactory dependencies, Ensamblado ensamblado) {
		IAssemblyCategoryProfileContainer assemblyCategoryContainer = assemblyFileData.getAssemblyCategoryContainer();
		IAssemblyCategoryProfile[] categories = assemblyCategoryContainer.getCategories();
		MultiProfile multiprofile = dependencies.createMultiProfile();
		for (IAssemblyCategoryProfile iAssemblyCategoryProfile : categories) {
			setValuesMultiProfiles(iAssemblyCategoryProfile, multiprofile);
		}
		ensamblado.setEMultiProfile(multiprofile);
	}
	
	
	/** Rellena los atributos de la entidad MULTIPROFILE dependiendo del nombre del nombre del AssemblyCategoryProfile
	  * @param iAssemblyCategoryProfile - objeto que proporciona el contenedor del perfil múltiple de vega.
	  * @param multiprofile - entidad MULTIPROFILE
	*/
	public static void setValuesMultiProfiles(
			IAssemblyCategoryProfile iAssemblyCategoryProfile, MultiProfile multiprofile) {
			IAssemblyValueCategory[] assemblyValueCategory = iAssemblyCategoryProfile.getAssemblyValueCategoryContainer().getValues();
			if (iAssemblyCategoryProfile.getName().equals( "CanalMarco")){
				multiprofile.setCatCanalMarco(UtilsDependencies.obtenerValor(assemblyValueCategory));
			}else if (iAssemblyCategoryProfile.getName().equals( "Empresa")){
				multiprofile.setCatCompany(UtilsDependencies.obtenerValor(assemblyValueCategory));
			}else if (iAssemblyCategoryProfile.getName().equals( "EmpresaAsociada")){
				multiprofile.setCatEmpresaAsociada(UtilsDependencies.obtenerValor(assemblyValueCategory));
			}else if (iAssemblyCategoryProfile.getName().equals( "Estructura")){
				multiprofile.setCatEstructura(UtilsDependencies.obtenerValor(assemblyValueCategory));
			}else if (iAssemblyCategoryProfile.getName().equals( "Gama")){
				multiprofile.setCatGama(UtilsDependencies.obtenerValor(assemblyValueCategory));
			}else if (iAssemblyCategoryProfile.getName().equals( "Idioma")){
				multiprofile.setCatIdioma(UtilsDependencies.obtenerValor(assemblyValueCategory));
			}else if (iAssemblyCategoryProfile.getName().equals( "NivelIU")){
				multiprofile.setCatNivelIU(UtilsDependencies.obtenerValor(assemblyValueCategory));
			}else if (iAssemblyCategoryProfile.getName().equals( "Render")){
				multiprofile.setCatRender(UtilsDependencies.obtenerValor(assemblyValueCategory));
			}
}
	
	/** Rellena la entidad SECURITY a partir del AssemblyFileData proporcionado.
	  * @param assemblyFileData - datos del fichero del ensamblado
	  * @param dependencies - Factoría de entidades del modelo
	*/
	public static void createSecurity(IAssemblyFileData assemblyFileData, DependenciesFactory dependencies, Ensamblado ensamblado) {
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
		    		trxLogicalChannel.setName(getname(name, trxOp, logicalChannel));
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
		    			trxPhysicalChannel.setName(getname(name, trxOp, physicalChannel));
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
		    			satLogicalChannel.setName(getname(name, sat, logicalChannel));
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
		    			satPhysicalChannel.setName(getname(name, sat, physicalChannel));
		    			satPhysicalChannel.setValue(value);
		    			listSATPhysicalChannel.add(i,satPhysicalChannel);
					}
		    		host.getESATPhysicalChannel().addAll(listSATPhysicalChannel);
	    		}
	    	

		} 
	    
	    ensamblado.setEEnsamblado(security);
	    ensamblado.setEHOST(host);
	}

	
	private static String getname(String name, String connector, String channel) {
		String nameconnector="";
		nameconnector= name.replaceFirst(connector, "").trim();
		nameconnector = nameconnector.replaceFirst(channel, "").trim();
		return nameconnector;
	}

	public static void createChannelAdapter(IAssemblyProject assemblyProject,
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
	
	public static void createLogLevel(IAssemblyFileData assemblyFileData, DependenciesFactory dependencies, Ensamblado ensamblado) {
		IAssemblyNode[] nodos=assemblyFileData.getAssemblyDiagram().getAssemblyNodeContainer().getNodes();
		List<LogLevel> list = getLogLevels(nodos, dependencies, assemblyFileData);
		if(assemblyFileData.getLogLevelsContainer().getLogLevels().length>0){
			EntityAndLogLevels logEntity = new EntityAndLogLevels(assemblyFileData,assemblyFileData.getLogLevelsContainer(),assemblyFileData.getName(),IEntitiesLogLevelsXmlGenerator.ASSEMBLY_PRIORITY) ;
			LogLevel loglevel= LoggeableEntity(logEntity,assemblyFileData, dependencies);
			if(loglevel!=null)
				list.add(loglevel);
		}
		ensamblado.getELogLevel().addAll(list);
	
	}

	private static List<LogLevel>  getLogLevels(IAssemblyNode[] nodos, DependenciesFactory dependencies, IAssemblyFileData assemblyFileData) {
		
		List <LogLevel>	 listLogLevels = new ArrayList<LogLevel>();	
		List<EntityAndLogLevels> assemblyLogLevelsList = new ArrayList<EntityAndLogLevels>();
		

		for (int i=0; i<nodos.length; i++)
		{
			String referenceName = null;
			IAssemblyLoggeableEntity[] assemblyLoggeableEntities = null;
			
			if (nodos[i].getNodeType()==IAssemblyNode.APP_REF_NODE || 
				nodos[i].getNodeType()==IAssemblyNode.BL_APP_REF_NODE ||
				nodos[i].getNodeType()==IAssemblyNode.PL_APP_REF_NODE)
				
			{
				// Añadimos las entidades que tenemos en el ensamblado para aplicaciones
				IAppReference appRef = (IAppReference) nodos[i];
				
				// Obtenemos el nombre de la aplicación referenciada
				referenceName = appRef.getApplicationName();
				
				// Añadimos las entidades que tenemos en el ensamblado para las aplicaciones
				assemblyLoggeableEntities = appRef.getAssemblyLoggeableEntityContainer().getAssemblyLoggeableEntitys();
				for (int j = 0; j < assemblyLoggeableEntities.length; j++)
				{
					// Se obtiene la lista de entidades loggeables de cada uno de los nodos
					IAssemblyLoggeableEntity assEntity = assemblyLoggeableEntities[j];
					
					//si son operaciones, igual que con las originales
					if(assEntity.getAssemblyType() == IAssemblyLoggeableEntity.ASSEMBLY_OPERATION_TYPE
							&& assEntity.getLogLevelsContainer().hasChildren())
					{
						EntityAndLogLevels entity = new EntityAndLogLevels(assEntity , assEntity.getLogLevelsContainer(), referenceName, IEntitiesLogLevelsXmlGenerator.ASS_OPERATION_PRIORITY);
						checkPropagationPriority(entity, IEntitiesLogLevelsXmlGenerator.ASS_OPERATION_PRIORITY);
						assemblyLogLevelsList.add(entity);
					}
				}
			}
			else if (nodos[i].getNodeType()== IAssemblyNode.BL_BLOCK_REF_NODE ||
					 nodos[i].getNodeType()== IAssemblyNode.PL_BLOCK_REF_NODE ||
					 nodos[i].getNodeType()== IAssemblyNode.EXT_PL_BLOCK_REF_NODE)
			{
				IModuleReference modRef = (IModuleReference)nodos[i];
				
				ILoggeable[] entities = UtilsAssembly.getLoggeableElements(modRef);

				if(entities.length==0)
					continue;

				for (int j = 0; j < entities.length; j++)
				{
					ILoggeable entity = entities[j];
					switch (entity.getType())
					{
						//para componentes originales, solo nos quedamos con los niveles redefinidos en los IF, aunque no apliquen
						case ILoggeable.COMPONENT_TYPE:
							
							IBaseMethod[] methods = ((IBaseComponentData)entity).getBaseMethodsContainer().getBaseMethods();
						    for (int k = 0; k < methods.length; k++)
						    {
						    	IImplLogMethod implMethod = (IImplLogMethod)methods[k];
						    	//obtengo el IF o el metodo del IF del que heredaria sus niveles de log el metodo. Solo para comp de negocio					    	
						    	IAssemblyLoggeableEntity assLoggeable = getParentLogLevelsInAssembly(implMethod, modRef);
						    	if(assLoggeable!=null && assLoggeable.getOwnLogLevelsContainer().hasChildren())
						    	{
						    		String prioriy;
						    		if(assLoggeable.getAssemblyType()==IAssemblyLoggeableEntity.ASSEMBLY_METHOD_TYPE)
						    			prioriy = IEntitiesLogLevelsXmlGenerator.ASS_IF_METHOD_PRIORITY;
						    		else
						    			prioriy = IEntitiesLogLevelsXmlGenerator.ASS_IF_PRIORITY;
						    		
						    		EntityAndLogLevels logEntity = new EntityAndLogLevels((IImplLogMethod)methods[k],
							    			assLoggeable.getOwnLogLevelsContainer(), modRef.getModuleName(), prioriy);
						    		
									// Bugzilla 25658: La propagación de niveles de log en IFs debe propagarse
									// Si el método del componente no tiene hijos en el contenedor propio es que no 
						    		// se ha sobreescrito y cogemos el valor de propagación del método del interfaz que implementa
									if(!logEntity.getEntity().getOwnLogLevelsContainer().hasChildren())
						    			logEntity.setPropagateLog(assLoggeable.getPropagateLog());

						    		// Si el método no modifica la propagación del componente del que hereda los niveles
						    		// de log, se asigna prioridad de propagación mínima.
						    		if (assLoggeable.getPropagateLog() == implMethod.getPropagateLog())
						    			logEntity.setPropagationPriority(IEntitiesLogLevelsXmlGenerator.MIN_PRIORITY) ;
						    			assemblyLogLevelsList.add (logEntity) ;				    		
						    	}
						    	else
						    	if(implMethod.getLogLevelsContainer().hasChildren())
						    	{
						    		// Bugzilla 8493: Falta informacion de niveles de log asociados a componentes y operaciones
						    		assemblyLogLevelsList.add(new EntityAndLogLevels(implMethod, implMethod.getLogLevelsContainer(), modRef.getModuleName(), IEntitiesLogLevelsXmlGenerator.MIN_PRIORITY));						    		
						    	}
						    }
						    
					    	// Bugzilla 8493: Falta informacion de niveles de log asociados a componentes y operaciones
					    	// En caso de que el ensamblado no defina las entidades de log de un componente que no se ha 
					    	// redesplegado se añaden a "assemblyLogsLevels.xml" sus niveles de log con prioridad "-1".
						    if(entity.getLogLevelsContainer().hasChildren())
						    	assemblyLogLevelsList.add(new EntityAndLogLevels(entity, entity.getLogLevelsContainer(), modRef.getModuleName(), IEntitiesLogLevelsXmlGenerator.MIN_PRIORITY));

							break;
							
				    	// Bugzilla 8493: Falta informacion de niveles de log asociados a componentes y operaciones
						case ILoggeable.INTERNAL_OPERATION_TYPE:
						case ILoggeable.PRESENTATION_OPERATION_TYPE:
							if (entity.getLogLevelsContainer().hasChildren())
								assemblyLogLevelsList.add(new EntityAndLogLevels(entity, entity.getLogLevelsContainer(), modRef.getModuleName(), IEntitiesLogLevelsXmlGenerator.MIN_PRIORITY));						    		
							break;

						//para entidades definidas en el ensamblado 
						case ILoggeable.ASSEMBLY_TYPE:
							IAssemblyLoggeableEntity assEntity = (IAssemblyLoggeableEntity) entity;
							
							// Se externaliza siempre, ya que al menos se habrán redefinido niveles o propagación
							if(assEntity.getAssemblyType()==IAssemblyLoggeableEntity.ASSEMBLY_OPERATION_TYPE)
						    {
								EntityAndLogLevels logEntity = new EntityAndLogLevels(entity, entity.getLogLevelsContainer(), modRef.getModuleName(), IEntitiesLogLevelsXmlGenerator.ASS_OPERATION_PRIORITY) ;
						    	if(!assEntity.getOwnLogLevelsContainer().hasChildren())
						    		logEntity.setPriority(IEntitiesLogLevelsXmlGenerator.MIN_PRIORITY);
						    	checkPropagationPriority(logEntity, IEntitiesLogLevelsXmlGenerator.ASS_OPERATION_PRIORITY) ;
								assemblyLogLevelsList.add(logEntity);
						    }
							//para componentes en el ensamblado
							else if(assEntity.getAssemblyType()==IAssemblyLoggeableEntity.ASSEMBLY_COMPONENT_TYPE)
						    {
								IAssemblyLoggeableComponent assComponent = (IAssemblyLoggeableComponent) assEntity;
								
						        //Solo nos quedamos con los componentes (no IF) y sus metodos
								if(assComponent.getComponentType().equals(IAssemblyLoggeableComponent.FACADE_INTERFACE_TYPE))
									continue;
								
								ILogLevelsContainer assCompLogLevelsCont = null;								
								
								//obtenemos el contenedor de niveles de log propio del componente
							if(assComponent.isInfoLogsInAssembly() && assComponent.getOwnLogLevelsContainer().hasChildren())
									assCompLogLevelsCont = assComponent.getOwnLogLevelsContainer();
								
								//obtenemos todos los metodos del componente, originales y del ensamblado
								ILoggeable[] assMethods = UtilsPreAssembly.getLoggeableMethods(assComponent);
								for (int k = 0; k < assMethods.length; k++)
								{
									ILogLevelsContainer logLevelsCont = null;
									String priority = ""; //$NON-NLS-1$
									//si se trata de un metodo original
									if(assMethods[k].getType()==ILoggeable.METHOD_TYPE)
									{
										//si el componente redefine sus niveles de log en
										//el ensamblado, los ponemos en el metodo, aunque realmente
										//no sea estos los que coja al tener el metodo en si mismo niveles,
										//pero puede suceder que el metodo cambien y no se reensamble
										if(assCompLogLevelsCont!=null &&	assCompLogLevelsCont.hasChildren())
										{
											logLevelsCont = assCompLogLevelsCont;
											priority = IEntitiesLogLevelsXmlGenerator.ASS_COMPONENT_PRIORITY;
										}
										else 
										{
											//si su componente padre de negocio no tiene niveles de log, buscamos el IF
											//o el metodo del IF del que heredaria sus nivles
											IAssemblyLoggeableEntity assLoggeable = getParentLogLevelsInAssembly((IImplLogMethod)assMethods[k], modRef);
											if(assLoggeable!=null && assLoggeable.getOwnLogLevelsContainer().hasChildren())
											{
												logLevelsCont = assLoggeable.getOwnLogLevelsContainer();
												if(assLoggeable.getAssemblyType()==IAssemblyLoggeableEntity.ASSEMBLY_METHOD_TYPE)
									    			priority = IEntitiesLogLevelsXmlGenerator.ASS_IF_METHOD_PRIORITY;
									    		else
									    			priority = IEntitiesLogLevelsXmlGenerator.ASS_IF_PRIORITY;
											}
										}
										// Si no se está redefiniendo la información de log en el ensamblado,
										// utiliza la que le corresponda con nivel de prioridad mínimo
										if (logLevelsCont == null)
										{
											logLevelsCont = assMethods[k].getLogLevelsContainer();
											priority = IEntitiesLogLevelsXmlGenerator.MIN_PRIORITY ;
										}
									}else
									{
										//para metodos que redefinen sus niveles en el ensamblado nos quedamos con ellos
										// Procesa métodos que redefinen información de log en el ensamblado
										logLevelsCont = assMethods[k].getLogLevelsContainer();
										priority = IEntitiesLogLevelsXmlGenerator.ASS_COMPONENT_METHOD_PRIORITY;
									}
									if(logLevelsCont != null && logLevelsCont.hasChildren())
									{
										EntityAndLogLevels logEntity = new EntityAndLogLevels(assMethods[k],logLevelsCont,modRef.getModuleName(), priority) ;
										checkPropagationPriority(logEntity, priority) ;
										assemblyLogLevelsList.add(logEntity) ;
									}
								}
						    }
							break;
						default:
							break;								
					}
				}
			}
		}
		
		// Si hay entidades loggeables
		if (assemblyLogLevelsList != null && !assemblyLogLevelsList.isEmpty())
		{		
			
			// Recorremos las entidades logables obtenidas para rellenar el modelo
			for (Iterator<EntityAndLogLevels> it=assemblyLogLevelsList.iterator(); it.hasNext();)
			{
				EntityAndLogLevels entityAndLogLevels = (EntityAndLogLevels) it.next();
//				LogLevel loglevel = dependencies.createLogLevel();
//				//loglevel.setId(value);
//				IVegaElement[] levelContainer = entityAndLogLevels.getLogLevelsContainer().getChildren();
//				List<Levels> levels = new ArrayList<Levels>();
//				for (IVegaElement iVegaElement : levelContainer) {
//					String level =iVegaElement.getFieldValue("name").toString();
//					Levels elevels = dependencies.createLevels();
//					elevels.setNameLevel(level);
//					levels.add(elevels);					
//				}
//				
//				loglevel.getELevels().addAll(levels);
//				loglevel.setLevelPriority(entityAndLogLevels.getPriority());
//				if(entityAndLogLevels.getPropagateLog()){
//					loglevel.setPropagation("true");
//				}else{
//					loglevel.setPropagation("false");
//				}
//				
//				loglevel.setPropagationPriority(entityAndLogLevels.getPropagationPriority());
//				listLogLevels.add(loglevel);	
				LogLevel loglevel = LoggeableEntity(entityAndLogLevels, assemblyFileData, dependencies);
				listLogLevels.add(loglevel);
			}
			
			
		}
		return listLogLevels;

	}
	
	/** Rellena la entidad JMS a partir del AssemblyFileData proporcionado.
	  * @param assemblyFileData - datos del fichero del ensamblado
	  * @param dependencies - Factoría de entidades del modelo
	  * @param ensamblado -  Ensamblado
	*/
	public static void createJMS(IAssemblyFileData assemblyFileData, DependenciesFactory dependencies, Ensamblado ensamblado) {
		IAssemblySettingsContainer assemblySettingsContainer = assemblyFileData.getAssemblySettingsContainer();
	    IAdvancedSettingsContainer advancedSettingContainer = assemblySettingsContainer.getAdvancedSettingsContainer();
	    ISetting[] setting = advancedSettingContainer.getSettingsContainer().getSettings();
	    List<JMS> listJMS = new ArrayList<JMS>();
	    for (ISetting iSetting : setting) {
	    	String value = iSetting.getValue();
	    	String portName = MessagingServiceManager.getInstance().getListenerPortByAlias(value);
	    	if (iSetting.getElementId().equals("jms.transactional")){
	    		JMS jms = dependencies.createJMS();
	    		jms.setJmsModules(value);
	    		jms.setListenerPorts(portName);
	    		listJMS.add(jms);
	    	}
	   }
	  ensamblado.getEJMS().addAll(listJMS);
	}
	public static void checkPropagationPriority (EntityAndLogLevels entity, String defaultPriority)
	{
		ILoggeable assEntity = entity.getEntity() ;
		if (assEntity.getType() != ILoggeable.ASSEMBLY_TYPE)	
			return ;
		
		ILoggeable original = UtilsPreAssembly.findOriginalElement((IAssemblyLoggeableEntity)assEntity) ;
		if (original != null && original.getPropagateLog() == assEntity.getPropagateLog())
				entity.setPropagationPriority(IEntitiesLogLevelsXmlGenerator.MIN_PRIORITY) ;
		else
				entity.setPropagationPriority(defaultPriority) ;	
	}
	public static IAssemblyLoggeableEntity getParentLogLevelsInAssembly(IImplLogMethod compMethod, IModuleReference modRef)
	{			
		//solo continuamos para originales, es decir, que no redefinen sus niveles en el ensamblado
		if(compMethod.getParentComponentData().getType()==ILoggeable.COMPONENT_TYPE)
		{
			//solo para metodos de negocio
			if(!((IBaseComponent)compMethod.getParentComponentData().getParent()).getComponentType().equals(IPLPhysicalComponent.PL_PHYSICAL_COMPONENT_TYPE))
			{		
			//obtenemos su correspondiente metodo de fachada implementado
			IFacadeInterfaceMethod ifMethod = 
				UtilsComponents.getImplementedFacadeInterfaceMethod(
							(IPhysicalComponentData)compMethod.getParentComponentData(), (IMethod)compMethod);
			
			if(ifMethod!=null)
			{			
				//si existe el metodo de if, buscamos si su IF padre existe en el ensamblado
				IAssemblyLoggeableComponent assLogIF = UtilsAssembly.getParentInAssembly(ifMethod.getParentComponentData(), modRef);
				if(assLogIF!=null)
				{
					//si existe el IF, buscamos el metodo del IF en el ensamblado.
					IAssemblyLoggeableMethod assLogIFMethod = 
						assLogIF.getAssemblyLoggeableMethodContainer().getAssemblyLoggeableMethod(
								new ComponentMethodSignature(ifMethod).toString());

					//si existe el método y redefine niveles de log, lo devolvemos
					if(assLogIFMethod!=null && assLogIFMethod.getOwnLogLevelsContainer().hasChildren())
						return assLogIFMethod;
						
					//si el metodo no existe o no tiene nieveles en el ensamblado, devolvemos el IF si
					//es que tiene niveles propios.
					if(assLogIF.isInfoLogsInAssembly() && assLogIF.getOwnLogLevelsContainer().hasChildren())
						return assLogIF;					
				}
			}
		}
		}
		
		return null;
	}
	
	public static LogLevel LoggeableEntity(EntityAndLogLevels entityAndLogLevels, IAssemblyFileData assemblyfiledata, DependenciesFactory dependencies)
	{    
	    ILogLevelsContainer logLevelsConts = entityAndLogLevels.getLogLevelsContainer();
	    LogLevel logLevelen =null;
	 
	    ILoggeable logEntity = entityAndLogLevels.getEntity();    
	    
	    if(!logLevelsConts.hasChildren() && entityAndLogLevels.getPropagationPriority() == IEntitiesLogLevelsXmlGenerator.MIN_PRIORITY)
	        return null;
	    
	    String moduleName= entityAndLogLevels.getParentName();   
	    
	    String id = ""; //$NON-NLS-1$
	    String idUnderScore = ""; //$NON-NLS-1$
	    
	    //solo escribimos categorias para los metodos y operaciones
	     if(logEntity.getType()==ILoggeable.INTERNAL_OPERATION_TYPE ||
   		 		logEntity.getType()==ILoggeable.PRESENTATION_OPERATION_TYPE ||
   		 		(logEntity.getType()==ILoggeable.ASSEMBLY_TYPE &&
 				 ((IAssemblyLoggeableEntity)logEntity).getAssemblyType()==IAssemblyLoggeableEntity.ASSEMBLY_OPERATION_TYPE))
	    {
        	id+=getOperationID(logEntity);        
            id+=IEntitiesLogLevelsXmlGenerator.CATEGORY_SEPARATOR+UtilsPreAssembly.generateNamesForLoggeableElements(logEntity).replace(IEntitiesLogLevelsXmlGenerator.CATEGORY_SEPARATOR,IEntitiesLogLevelsXmlGenerator.ELEMENT_SEPARATOR);
            
            logLevelen= getLogLevels(entityAndLogLevels, dependencies, logLevelsConts, id);
            
	    
	    }
	    else if (logEntity.getType()==ILoggeable.METHOD_TYPE ||
	    		 (logEntity.getType()==ILoggeable.ASSEMBLY_TYPE &&
				  ((IAssemblyLoggeableEntity)logEntity).getAssemblyType()==IAssemblyLoggeableEntity.ASSEMBLY_METHOD_TYPE))
	    {
            ILoggeable component = (ILoggeable)logEntity.getParent().getParent();
            
            boolean isPLCompMethod = false;
            if(logEntity.getType()==ILoggeable.ASSEMBLY_TYPE)
            {
            	ILoggeable oriComp = UtilsPreAssembly.findOriginalElement((IAssemblyLoggeableEntity)component);
            	if(oriComp!=null)
            		isPLCompMethod = ((IBaseComponent)oriComp.getParent()).getComponentType().equals(IPLPhysicalComponent.PL_PHYSICAL_COMPONENT_TYPE);
            }else
            {
            	IBaseComponent baseComp = (IBaseComponent)component.getParent();
            	isPLCompMethod = baseComp.getComponentType().equals(IPLPhysicalComponent.PL_PHYSICAL_COMPONENT_TYPE);
            }
            
            String compCat = IEntitiesLogLevelsXmlGenerator.COMPONENT_CATEGORY;
            if(isPLCompMethod)
            	compCat = IEntitiesLogLevelsXmlGenerator.PL_COMPONENT_CATEGORY;
            
            id += compCat+IEntitiesLogLevelsXmlGenerator.CATEGORY_SEPARATOR+moduleName+IEntitiesLogLevelsXmlGenerator.ELEMENT_SEPARATOR+getFormatedComponentName(component,false)+IEntitiesLogLevelsXmlGenerator.CATEGORY_SEPARATOR;
            idUnderScore += compCat+IEntitiesLogLevelsXmlGenerator.CATEGORY_SEPARATOR+moduleName+IEntitiesLogLevelsXmlGenerator.ELEMENT_SEPARATOR+getFormatedComponentName(component,true)+IEntitiesLogLevelsXmlGenerator.CATEGORY_SEPARATOR;
            
            id+=getMethodSignature(logEntity); 
            getLogLevels(entityAndLogLevels, dependencies, logLevelsConts, id);
            idUnderScore+=getMethodSignature(logEntity);
            if(!isPLCompMethod)
            	logLevelen=getLogLevels(entityAndLogLevels, dependencies, logLevelsConts, id);
	    }
        else if(logEntity.getType()==ILoggeable.ASSEMBLY_GLOBAL_TYPE )
        {
        	id += IEntitiesLogLevelsXmlGenerator.ASSEMBLY_CATEGORY;
        	logLevelen= getLogLevels(entityAndLogLevels, dependencies, logLevelsConts, id);
        }
            return logLevelen;    
	}

	private static LogLevel getLogLevels(EntityAndLogLevels entityAndLogLevels,
			DependenciesFactory dependencies,
			ILogLevelsContainer logLevelsConts, String id) {
		//Creamos el log del ensamblado
            LogLevel logLevel = dependencies.createLogLevel();
            logLevel.setId(id);
            if(entityAndLogLevels.getPropagateLog()){
            	logLevel.setPropagation("true");
            }else{
            	logLevel.setPropagation("false");
            }
            logLevel.setPropagationPriority(entityAndLogLevels.getPropagationPriority());
            logLevel.setLevelPriority(entityAndLogLevels.getPriority());
            
            List<Levels> listLevel = new ArrayList<Levels>();
            for ( ILogLevel logLevelsCont : logLevelsConts.getLogLevels()) {
            	Levels level = dependencies.createLevels();
            	level.setNameLevel(logLevelsCont.getName());
            	listLevel.add(level);
			}
            logLevel.getELevels().addAll(listLevel);
          return logLevel;
	}
	
	public static String getOperationID(ILoggeable operEntity)
	{
		String operationID = ""; //$NON-NLS-1$
		
		if (operEntity.getType()==ILoggeable.ASSEMBLY_TYPE)
		{
			IAssemblyLoggeableOperation assOp = (IAssemblyLoggeableOperation) operEntity;
			if (assOp.getOperationType().equals(IAssemblyLoggeableOperation.INTERNAL_OPERATION_TYPE))
				operationID = IEntitiesLogLevelsXmlGenerator.OI_OPERATION_CATEGORY;
			else if (assOp.getOperationType().equals(IAssemblyLoggeableOperation.PRESENTATION_OPERATION_TYPE))
				operationID = IEntitiesLogLevelsXmlGenerator.OP_OPERATION_CATEGORY;
			
			return operationID;
		}
		else
			return EntitiesLogLevelsXmlGenerator.getOperationID(operEntity);
	}
	
	public static String getFormatedComponentName(ILoggeable compEntity, boolean underScoreSeparator)
	{
		if (compEntity.getType()==ILoggeable.ASSEMBLY_TYPE)
		{
			// si es un componente del ensamblado, 1º buscamos el original
			String qualifiedComponentName = ((IAssemblyLoggeableComponent) compEntity).getName();
			IVegaProject[] vegaProjects = compEntity.getVegaProject().getVegaProjectsOnXmlPath();
			IComponent comp = UtilsComponents.findComponent(vegaProjects, qualifiedComponentName);

			String compName = null;
			String pkName = null;
			if (comp != null)
			{
				// si existe, ya tenemos todo
				compName = comp.getElementId();
				pkName = comp.getParentVegaBeanPackage().getElementId();
			}
			else
			{
				// si no existe, obtenemos todo del identificador de la entidad
				// del ensamblado
				int index = qualifiedComponentName.lastIndexOf(IVegaBeanPackage.QUALIFIED_NAME_SEPARATOR);
				compName = qualifiedComponentName.substring(index + 1);
				pkName = qualifiedComponentName.substring(0, index - 1);
			}
			
			if (underScoreSeparator)
				return pkName.replace(IEntitiesLogLevelsXmlGenerator.CATEGORY_SEPARATOR, IEntitiesLogLevelsXmlGenerator.NAME_SEPARATOR) + 
						IEntitiesLogLevelsXmlGenerator.NAME_SEPARATOR + 
					   compName.replace(IEntitiesLogLevelsXmlGenerator.CATEGORY_SEPARATOR, IEntitiesLogLevelsXmlGenerator.NAME_SEPARATOR);
			else
				return pkName.replace(IEntitiesLogLevelsXmlGenerator.CATEGORY_SEPARATOR, IEntitiesLogLevelsXmlGenerator.NAME_SEPARATOR) + 
						IEntitiesLogLevelsXmlGenerator.ELEMENT_SEPARATOR + 
					   compName.replace(IEntitiesLogLevelsXmlGenerator.CATEGORY_SEPARATOR, IEntitiesLogLevelsXmlGenerator.NAME_SEPARATOR);
		}
		else
			return EntitiesLogLevelsXmlGenerator.getFormatedComponentName(compEntity, underScoreSeparator);
	}	
	
	public static String getMethodSignature(ILoggeable logEntity)
	{
		String methodSig = ""; //$NON-NLS-1$
		IVegaProject[] projects = logEntity.getVegaProject().getVegaProjectsOnXmlPath();

		if(logEntity.getType()!=ILoggeable.METHOD_TYPE)
		{
			ILoggeable method = UtilsPreAssembly.findOriginalElement((IAssemblyLoggeableEntity)logEntity);
			if(method!=null)
				methodSig = new ComponentMethodSignature((IImplLogMethod)method).toStringWithJavaTypes(projects);
			else
				methodSig = logEntity.getElementId();
			
			return methodSig.replace(IEntitiesLogLevelsXmlGenerator.CATEGORY_SEPARATOR,IEntitiesLogLevelsXmlGenerator.NAME_SEPARATOR);
		}
		else
			return EntitiesLogLevelsXmlGenerator.getMethodSignature(logEntity);
	}
}
