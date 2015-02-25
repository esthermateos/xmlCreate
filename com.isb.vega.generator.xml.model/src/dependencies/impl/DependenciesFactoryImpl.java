/**
 */
package dependencies.impl;

import dependencies.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependenciesFactoryImpl extends EFactoryImpl implements DependenciesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DependenciesFactory init() {
		try {
			DependenciesFactory theDependenciesFactory = (DependenciesFactory)EPackage.Registry.INSTANCE.getEFactory(DependenciesPackage.eNS_URI);
			if (theDependenciesFactory != null) {
				return theDependenciesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DependenciesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DependenciesPackage.HOST: return createHOST();
			case DependenciesPackage.OP: return createOP();
			case DependenciesPackage.OI: return createOI();
			case DependenciesPackage.FACHADA: return createFachada();
			case DependenciesPackage.TRX_OP: return createTrxOP();
			case DependenciesPackage.SAT: return createSAT();
			case DependenciesPackage.ALTAIR: return createAltair();
			case DependenciesPackage.WEBSERVICE: return createWebservice();
			case DependenciesPackage.CHANNEL_ADAPTER: return createChannelAdapter();
			case DependenciesPackage.JMS: return createJMS();
			case DependenciesPackage.ENSAMBLADO: return createEnsamblado();
			case DependenciesPackage.SECURITY: return createSecurity();
			case DependenciesPackage.MULTI_PROFILE: return createMultiProfile();
			case DependenciesPackage.JAVA: return createJava();
			case DependenciesPackage.APP_ADAPTER: return createAppAdapter();
			case DependenciesPackage.JSP: return createJSP();
			case DependenciesPackage.SIEBEL: return createSiebel();
			case DependenciesPackage.TP: return createTp();
			case DependenciesPackage.BBOO: return createBBOO();
			case DependenciesPackage.TABLE_PARAMETERS: return createTableParameters();
			case DependenciesPackage.COMPONENT_SQL: return createComponentSQL();
			case DependenciesPackage.SQL_SENTENCE: return createSQLSentence();
			case DependenciesPackage.CLIENT_ARC_REFERENCES: return createClientArcReferences();
			case DependenciesPackage.LOG_LEVEL: return createLogLevel();
			case DependenciesPackage.RULES: return createRules();
			case DependenciesPackage.TRX_OP_LOGICAL_CHANNEL: return createTrxOPLogicalChannel();
			case DependenciesPackage.TRX_OP_PHYSICAL_CHANNEL: return createTrxOPPhysicalChannel();
			case DependenciesPackage.SAT_LOGICAL_CHANNEL: return createSATLogicalChannel();
			case DependenciesPackage.SAT_PHYSICAL_CHANNEL: return createSATPhysicalChannel();
			case DependenciesPackage.CACHE: return createCache();
			case DependenciesPackage.LEVELS: return createLevels();
			case DependenciesPackage.FTP: return createFTP();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HOST createHOST() {
		HOSTImpl host = new HOSTImpl();
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OP createOP() {
		OPImpl op = new OPImpl();
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OI createOI() {
		OIImpl oi = new OIImpl();
		return oi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fachada createFachada() {
		FachadaImpl fachada = new FachadaImpl();
		return fachada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrxOP createTrxOP() {
		TrxOPImpl trxOP = new TrxOPImpl();
		return trxOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAT createSAT() {
		SATImpl sat = new SATImpl();
		return sat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Altair createAltair() {
		AltairImpl altair = new AltairImpl();
		return altair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webservice createWebservice() {
		WebserviceImpl webservice = new WebserviceImpl();
		return webservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelAdapter createChannelAdapter() {
		ChannelAdapterImpl channelAdapter = new ChannelAdapterImpl();
		return channelAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMS createJMS() {
		JMSImpl jms = new JMSImpl();
		return jms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ensamblado createEnsamblado() {
		EnsambladoImpl ensamblado = new EnsambladoImpl();
		return ensamblado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security createSecurity() {
		SecurityImpl security = new SecurityImpl();
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiProfile createMultiProfile() {
		MultiProfileImpl multiProfile = new MultiProfileImpl();
		return multiProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java createJava() {
		JavaImpl java = new JavaImpl();
		return java;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppAdapter createAppAdapter() {
		AppAdapterImpl appAdapter = new AppAdapterImpl();
		return appAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSP createJSP() {
		JSPImpl jsp = new JSPImpl();
		return jsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Siebel createSiebel() {
		SiebelImpl siebel = new SiebelImpl();
		return siebel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp createTp() {
		TpImpl tp = new TpImpl();
		return tp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBOO createBBOO() {
		BBOOImpl bboo = new BBOOImpl();
		return bboo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableParameters createTableParameters() {
		TableParametersImpl tableParameters = new TableParametersImpl();
		return tableParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSQL createComponentSQL() {
		ComponentSQLImpl componentSQL = new ComponentSQLImpl();
		return componentSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLSentence createSQLSentence() {
		SQLSentenceImpl sqlSentence = new SQLSentenceImpl();
		return sqlSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientArcReferences createClientArcReferences() {
		ClientArcReferencesImpl clientArcReferences = new ClientArcReferencesImpl();
		return clientArcReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogLevel createLogLevel() {
		LogLevelImpl logLevel = new LogLevelImpl();
		return logLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rules createRules() {
		RulesImpl rules = new RulesImpl();
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrxOPLogicalChannel createTrxOPLogicalChannel() {
		TrxOPLogicalChannelImpl trxOPLogicalChannel = new TrxOPLogicalChannelImpl();
		return trxOPLogicalChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrxOPPhysicalChannel createTrxOPPhysicalChannel() {
		TrxOPPhysicalChannelImpl trxOPPhysicalChannel = new TrxOPPhysicalChannelImpl();
		return trxOPPhysicalChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SATLogicalChannel createSATLogicalChannel() {
		SATLogicalChannelImpl satLogicalChannel = new SATLogicalChannelImpl();
		return satLogicalChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SATPhysicalChannel createSATPhysicalChannel() {
		SATPhysicalChannelImpl satPhysicalChannel = new SATPhysicalChannelImpl();
		return satPhysicalChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache createCache() {
		CacheImpl cache = new CacheImpl();
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Levels createLevels() {
		LevelsImpl levels = new LevelsImpl();
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTP createFTP() {
		FTPImpl ftp = new FTPImpl();
		return ftp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesPackage getDependenciesPackage() {
		return (DependenciesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DependenciesPackage getPackage() {
		return DependenciesPackage.eINSTANCE;
	}

} //DependenciesFactoryImpl
