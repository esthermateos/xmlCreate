/**
 */
package dependencies.impl;

import dependencies.Altair;
import dependencies.AppAdapter;
import dependencies.Cache;
import dependencies.ChannelAdapter;
import dependencies.ClientArcReferences;
import dependencies.ComponentSQL;
import dependencies.DependenciesFactory;
import dependencies.DependenciesPackage;
import dependencies.Ensamblado;
import dependencies.Fachada;
import dependencies.Java;
import dependencies.Levels;
import dependencies.LogLevel;
import dependencies.MultiProfile;
import dependencies.Rules;
import dependencies.SATLogicalChannel;
import dependencies.SATPhysicalChannel;
import dependencies.SQLSentence;
import dependencies.Security;
import dependencies.Siebel;
import dependencies.TableParameters;
import dependencies.Tp;
import dependencies.TrxOP;
import dependencies.TrxOPLogicalChannel;
import dependencies.TrxOPPhysicalChannel;
import dependencies.Webservice;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependenciesPackageImpl extends EPackageImpl implements DependenciesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fachadaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trxOPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jmsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ensambladoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jspEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siebelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bbooEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlSentenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientArcReferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trxOPLogicalChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trxOPPhysicalChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satLogicalChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satPhysicalChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ftpEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dependencies.DependenciesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DependenciesPackageImpl() {
		super(eNS_URI, DependenciesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DependenciesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DependenciesPackage init() {
		if (isInited) return (DependenciesPackage)EPackage.Registry.INSTANCE.getEPackage(DependenciesPackage.eNS_URI);

		// Obtain or create and register package
		DependenciesPackageImpl theDependenciesPackage = (DependenciesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DependenciesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DependenciesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDependenciesPackage.createPackageContents();

		// Initialize created meta-data
		theDependenciesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDependenciesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DependenciesPackage.eNS_URI, theDependenciesPackage);
		return theDependenciesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHOST() {
		return hostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHOST_SatProtocol() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHOST_SatAlias() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHOST_SatTimeOut() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHOST_SatNullValues() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHOST_SatNullWhenSpaces() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHOST_TrxOPDefaultMode() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHOST_TrxOPTCPAlias() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHOST_AltairProtocol() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHOST_AltairAlias() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHOST_RedProtocol() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHOST_Trxprotocol() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHOST_EOPLogicalChannel() {
		return (EReference)hostEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHOST_EPhysicalChannel() {
		return (EReference)hostEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHOST_ESATLogicalChannel() {
		return (EReference)hostEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHOST_ESATPhysicalChannel() {
		return (EReference)hostEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOP() {
		return opEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOP_EstadoLlamadaOP() {
		return (EReference)opEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOP_ERJSP() {
		return (EReference)opEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOP_LpName() {
		return (EAttribute)opEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOP_OpName() {
		return (EAttribute)opEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOP_Version() {
		return (EAttribute)opEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOP_EOI() {
		return (EReference)opEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOP_EFachada() {
		return (EReference)opEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOI() {
		return oiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOI_EstadoLlamadaOI() {
		return (EReference)oiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOI_LnName() {
		return (EAttribute)oiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOI_OiName() {
		return (EAttribute)oiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOI_Version() {
		return (EAttribute)oiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOI_ETp() {
		return (EReference)oiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOI_EBBOO() {
		return (EReference)oiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOI_ESiebel() {
		return (EReference)oiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOI_EComponentSQL() {
		return (EReference)oiEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOI_EAltair() {
		return (EReference)oiEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOI_ETrxOP() {
		return (EReference)oiEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOI_ESAT() {
		return (EReference)oiEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOI_EFachada() {
		return (EReference)oiEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOI_EWebService() {
		return (EReference)oiEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOI_EJava() {
		return (EReference)oiEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOI_EAppAdapter() {
		return (EReference)oiEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFachada() {
		return fachadaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFachada_FacadeName() {
		return (EAttribute)fachadaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFachada_InterfazName() {
		return (EAttribute)fachadaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFachada_MethodName() {
		return (EAttribute)fachadaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFachada_MethodID() {
		return (EAttribute)fachadaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFachada_EOI() {
		return (EReference)fachadaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFachada_EComponentSQL() {
		return (EReference)fachadaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFachada_EJava() {
		return (EReference)fachadaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFachada_EAppAdapter() {
		return (EReference)fachadaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrxOP() {
		return trxOPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrxOP_State() {
		return (EAttribute)trxOPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrxOP_Transaction() {
		return (EAttribute)trxOPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrxOP_Operation() {
		return (EAttribute)trxOPEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrxOP_Version() {
		return (EAttribute)trxOPEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrxOP_Alias() {
		return (EAttribute)trxOPEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrxOP_Protocol() {
		return (EAttribute)trxOPEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrxOP_TransactionMode() {
		return (EAttribute)trxOPEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSAT() {
		return satEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAT_State() {
		return (EAttribute)satEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAT_SatName() {
		return (EAttribute)satEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAT_Version() {
		return (EAttribute)satEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAT_Alias() {
		return (EAttribute)satEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAT_Mode() {
		return (EAttribute)satEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltair() {
		return altairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAltair_State() {
		return (EAttribute)altairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAltair_Transaction() {
		return (EAttribute)altairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAltair_Version() {
		return (EAttribute)altairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAltair_Alias() {
		return (EAttribute)altairEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAltair_Mode() {
		return (EAttribute)altairEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebservice() {
		return webserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebservice_State() {
		return (EAttribute)webserviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebservice_Alias() {
		return (EAttribute)webserviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebservice_Transport() {
		return (EAttribute)webserviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebservice_Synchrony() {
		return (EAttribute)webserviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebservice_Wsdl() {
		return (EAttribute)webserviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebservice_WsOp() {
		return (EAttribute)webserviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebservice_Namespace() {
		return (EAttribute)webserviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelAdapter() {
		return channelAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelAdapter_Name() {
		return (EAttribute)channelAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelAdapter_Type() {
		return (EAttribute)channelAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelAdapter_FacadeName() {
		return (EAttribute)channelAdapterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelAdapter_InterfaceName() {
		return (EAttribute)channelAdapterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelAdapter_Alias() {
		return (EAttribute)channelAdapterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJMS() {
		return jmsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJMS_ListenerPorts() {
		return (EAttribute)jmsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJMS_JmsModules() {
		return (EAttribute)jmsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnsamblado() {
		return ensambladoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnsamblado_Name() {
		return (EAttribute)ensambladoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsamblado_ELogLevel() {
		return (EReference)ensambladoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsamblado_EMultiProfile() {
		return (EReference)ensambladoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsamblado_EHOST() {
		return (EReference)ensambladoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsamblado_EJMS() {
		return (EReference)ensambladoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsamblado_EChannelAdapter() {
		return (EReference)ensambladoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsamblado_EEnsamblado() {
		return (EReference)ensambladoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsamblado_EOP() {
		return (EReference)ensambladoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnsamblado_DefaultBankChannel() {
		return (EAttribute)ensambladoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurity_Autentication() {
		return (EAttribute)securityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurity_UsuNotes() {
		return (EAttribute)securityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurity_EntityAlias() {
		return (EAttribute)securityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurity_CodePassword() {
		return (EAttribute)securityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurity_Multi() {
		return (EAttribute)securityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiProfile() {
		return multiProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiProfile_CatCompany() {
		return (EAttribute)multiProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiProfile_CatCanalMarco() {
		return (EAttribute)multiProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiProfile_CatGama() {
		return (EAttribute)multiProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiProfile_CatIdioma() {
		return (EAttribute)multiProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiProfile_CatEstructura() {
		return (EAttribute)multiProfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiProfile_CatNivelIU() {
		return (EAttribute)multiProfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiProfile_CatEmpresaAsociada() {
		return (EAttribute)multiProfileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiProfile_CatRender() {
		return (EAttribute)multiProfileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiProfile_CatOrden() {
		return (EAttribute)multiProfileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiProfile_Mode() {
		return (EAttribute)multiProfileEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJava() {
		return javaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJava_Package() {
		return (EAttribute)javaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJava_ComponentName() {
		return (EAttribute)javaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJava_ECache() {
		return (EReference)javaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJava_EFTP() {
		return (EReference)javaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppAdapter() {
		return appAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppAdapter_ECache() {
		return (EReference)appAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppAdapter_EFTP() {
		return (EReference)appAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppAdapter_Package() {
		return (EAttribute)appAdapterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppAdapter_ComponentName() {
		return (EAttribute)appAdapterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSP() {
		return jspEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSP_Name() {
		return (EAttribute)jspEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJSP_ETableParameters() {
		return (EReference)jspEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJSP_ERules() {
		return (EReference)jspEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiebel() {
		return siebelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiebel_State() {
		return (EAttribute)siebelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiebel_Server() {
		return (EAttribute)siebelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiebel_Object() {
		return (EAttribute)siebelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiebel_Request() {
		return (EAttribute)siebelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTp() {
		return tpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTp_State() {
		return (EAttribute)tpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTp_Code() {
		return (EAttribute)tpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTp_Type() {
		return (EAttribute)tpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTp_Subtype() {
		return (EAttribute)tpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBBOO() {
		return bbooEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBBOO_State() {
		return (EAttribute)bbooEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBBOO_Alias() {
		return (EAttribute)bbooEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBBOO_Document() {
		return (EAttribute)bbooEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBBOO_Provider() {
		return (EAttribute)bbooEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableParameters() {
		return tableParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableParameters_Table() {
		return (EAttribute)tableParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableParameters_Columns() {
		return (EAttribute)tableParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableParameters_Cacheado() {
		return (EAttribute)tableParametersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableParameters_EClientArcReferences() {
		return (EReference)tableParametersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentSQL() {
		return componentSQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentSQL_ImplementationType() {
		return (EAttribute)componentSQLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentSQL_Datasource() {
		return (EAttribute)componentSQLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentSQL_DataSourceAlias() {
		return (EAttribute)componentSQLEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentSQL_MaxRows() {
		return (EAttribute)componentSQLEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentSQL_PageMaxSize() {
		return (EAttribute)componentSQLEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSQL_ESQLSentence() {
		return (EReference)componentSQLEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSQL_ECache() {
		return (EReference)componentSQLEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSQL_EFTP() {
		return (EReference)componentSQLEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentSQL_Component() {
		return (EAttribute)componentSQLEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentSQL_Module() {
		return (EAttribute)componentSQLEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLSentence() {
		return sqlSentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSQLSentence_Name() {
		return (EAttribute)sqlSentenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSQLSentence_Type() {
		return (EAttribute)sqlSentenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSQLSentence_Sql() {
		return (EAttribute)sqlSentenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLSentence_EFachada() {
		return (EReference)sqlSentenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientArcReferences() {
		return clientArcReferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientArcReferences_Src() {
		return (EAttribute)clientArcReferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientArcReferences_Reference() {
		return (EAttribute)clientArcReferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogLevel() {
		return logLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogLevel_Id() {
		return (EAttribute)logLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogLevel_Propagation() {
		return (EAttribute)logLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogLevel_PropagationPriority() {
		return (EAttribute)logLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogLevel_LevelPriority() {
		return (EAttribute)logLevelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogLevel_ELevels() {
		return (EReference)logLevelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRules() {
		return rulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRules_IdLit() {
		return (EAttribute)rulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRules_Lit() {
		return (EAttribute)rulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrxOPLogicalChannel() {
		return trxOPLogicalChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrxOPLogicalChannel_Name() {
		return (EAttribute)trxOPLogicalChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrxOPLogicalChannel_Value() {
		return (EAttribute)trxOPLogicalChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrxOPPhysicalChannel() {
		return trxOPPhysicalChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrxOPPhysicalChannel_Name() {
		return (EAttribute)trxOPPhysicalChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrxOPPhysicalChannel_Value() {
		return (EAttribute)trxOPPhysicalChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSATLogicalChannel() {
		return satLogicalChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSATLogicalChannel_Name() {
		return (EAttribute)satLogicalChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSATLogicalChannel_Value() {
		return (EAttribute)satLogicalChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSATPhysicalChannel() {
		return satPhysicalChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSATPhysicalChannel_Name() {
		return (EAttribute)satPhysicalChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSATPhysicalChannel_Value() {
		return (EAttribute)satPhysicalChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCache() {
		return cacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Package() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Name() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Alias() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevels() {
		return levelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLevels_NameLevel() {
		return (EAttribute)levelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFTP() {
		return ftpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFTP_Module() {
		return (EAttribute)ftpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFTP_Package() {
		return (EAttribute)ftpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFTP_Name() {
		return (EAttribute)ftpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFTP_Alias() {
		return (EAttribute)ftpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesFactory getDependenciesFactory() {
		return (DependenciesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hostEClass = createEClass(HOST);
		createEAttribute(hostEClass, HOST__SAT_PROTOCOL);
		createEAttribute(hostEClass, HOST__SAT_ALIAS);
		createEAttribute(hostEClass, HOST__SAT_TIME_OUT);
		createEAttribute(hostEClass, HOST__SAT_NULL_VALUES);
		createEAttribute(hostEClass, HOST__SAT_NULL_WHEN_SPACES);
		createEAttribute(hostEClass, HOST__TRX_OP_DEFAULT_MODE);
		createEAttribute(hostEClass, HOST__TRX_OPTCP_ALIAS);
		createEAttribute(hostEClass, HOST__ALTAIR_PROTOCOL);
		createEAttribute(hostEClass, HOST__ALTAIR_ALIAS);
		createEAttribute(hostEClass, HOST__RED_PROTOCOL);
		createEAttribute(hostEClass, HOST__TRXPROTOCOL);
		createEReference(hostEClass, HOST__EOP_LOGICAL_CHANNEL);
		createEReference(hostEClass, HOST__EPHYSICAL_CHANNEL);
		createEReference(hostEClass, HOST__ESAT_LOGICAL_CHANNEL);
		createEReference(hostEClass, HOST__ESAT_PHYSICAL_CHANNEL);

		opEClass = createEClass(OP);
		createEReference(opEClass, OP__ESTADO_LLAMADA_OP);
		createEReference(opEClass, OP__ERJSP);
		createEAttribute(opEClass, OP__LP_NAME);
		createEAttribute(opEClass, OP__OP_NAME);
		createEAttribute(opEClass, OP__VERSION);
		createEReference(opEClass, OP__EOI);
		createEReference(opEClass, OP__EFACHADA);

		oiEClass = createEClass(OI);
		createEReference(oiEClass, OI__ESTADO_LLAMADA_OI);
		createEAttribute(oiEClass, OI__LN_NAME);
		createEAttribute(oiEClass, OI__OI_NAME);
		createEAttribute(oiEClass, OI__VERSION);
		createEReference(oiEClass, OI__ETP);
		createEReference(oiEClass, OI__EBBOO);
		createEReference(oiEClass, OI__ESIEBEL);
		createEReference(oiEClass, OI__ECOMPONENT_SQL);
		createEReference(oiEClass, OI__EALTAIR);
		createEReference(oiEClass, OI__ETRX_OP);
		createEReference(oiEClass, OI__ESAT);
		createEReference(oiEClass, OI__EFACHADA);
		createEReference(oiEClass, OI__EWEB_SERVICE);
		createEReference(oiEClass, OI__EJAVA);
		createEReference(oiEClass, OI__EAPP_ADAPTER);

		fachadaEClass = createEClass(FACHADA);
		createEAttribute(fachadaEClass, FACHADA__FACADE_NAME);
		createEAttribute(fachadaEClass, FACHADA__INTERFAZ_NAME);
		createEAttribute(fachadaEClass, FACHADA__METHOD_NAME);
		createEAttribute(fachadaEClass, FACHADA__METHOD_ID);
		createEReference(fachadaEClass, FACHADA__EOI);
		createEReference(fachadaEClass, FACHADA__ECOMPONENT_SQL);
		createEReference(fachadaEClass, FACHADA__EJAVA);
		createEReference(fachadaEClass, FACHADA__EAPP_ADAPTER);

		trxOPEClass = createEClass(TRX_OP);
		createEAttribute(trxOPEClass, TRX_OP__STATE);
		createEAttribute(trxOPEClass, TRX_OP__TRANSACTION);
		createEAttribute(trxOPEClass, TRX_OP__OPERATION);
		createEAttribute(trxOPEClass, TRX_OP__VERSION);
		createEAttribute(trxOPEClass, TRX_OP__ALIAS);
		createEAttribute(trxOPEClass, TRX_OP__PROTOCOL);
		createEAttribute(trxOPEClass, TRX_OP__TRANSACTION_MODE);

		satEClass = createEClass(SAT);
		createEAttribute(satEClass, SAT__STATE);
		createEAttribute(satEClass, SAT__SAT_NAME);
		createEAttribute(satEClass, SAT__VERSION);
		createEAttribute(satEClass, SAT__ALIAS);
		createEAttribute(satEClass, SAT__MODE);

		altairEClass = createEClass(ALTAIR);
		createEAttribute(altairEClass, ALTAIR__STATE);
		createEAttribute(altairEClass, ALTAIR__TRANSACTION);
		createEAttribute(altairEClass, ALTAIR__VERSION);
		createEAttribute(altairEClass, ALTAIR__ALIAS);
		createEAttribute(altairEClass, ALTAIR__MODE);

		webserviceEClass = createEClass(WEBSERVICE);
		createEAttribute(webserviceEClass, WEBSERVICE__STATE);
		createEAttribute(webserviceEClass, WEBSERVICE__ALIAS);
		createEAttribute(webserviceEClass, WEBSERVICE__TRANSPORT);
		createEAttribute(webserviceEClass, WEBSERVICE__SYNCHRONY);
		createEAttribute(webserviceEClass, WEBSERVICE__WSDL);
		createEAttribute(webserviceEClass, WEBSERVICE__WS_OP);
		createEAttribute(webserviceEClass, WEBSERVICE__NAMESPACE);

		channelAdapterEClass = createEClass(CHANNEL_ADAPTER);
		createEAttribute(channelAdapterEClass, CHANNEL_ADAPTER__NAME);
		createEAttribute(channelAdapterEClass, CHANNEL_ADAPTER__TYPE);
		createEAttribute(channelAdapterEClass, CHANNEL_ADAPTER__FACADE_NAME);
		createEAttribute(channelAdapterEClass, CHANNEL_ADAPTER__INTERFACE_NAME);
		createEAttribute(channelAdapterEClass, CHANNEL_ADAPTER__ALIAS);

		jmsEClass = createEClass(JMS);
		createEAttribute(jmsEClass, JMS__LISTENER_PORTS);
		createEAttribute(jmsEClass, JMS__JMS_MODULES);

		ensambladoEClass = createEClass(ENSAMBLADO);
		createEAttribute(ensambladoEClass, ENSAMBLADO__NAME);
		createEReference(ensambladoEClass, ENSAMBLADO__ELOG_LEVEL);
		createEReference(ensambladoEClass, ENSAMBLADO__EMULTI_PROFILE);
		createEReference(ensambladoEClass, ENSAMBLADO__EHOST);
		createEReference(ensambladoEClass, ENSAMBLADO__EJMS);
		createEReference(ensambladoEClass, ENSAMBLADO__ECHANNEL_ADAPTER);
		createEReference(ensambladoEClass, ENSAMBLADO__EENSAMBLADO);
		createEReference(ensambladoEClass, ENSAMBLADO__EOP);
		createEAttribute(ensambladoEClass, ENSAMBLADO__DEFAULT_BANK_CHANNEL);

		securityEClass = createEClass(SECURITY);
		createEAttribute(securityEClass, SECURITY__AUTENTICATION);
		createEAttribute(securityEClass, SECURITY__USU_NOTES);
		createEAttribute(securityEClass, SECURITY__ENTITY_ALIAS);
		createEAttribute(securityEClass, SECURITY__CODE_PASSWORD);
		createEAttribute(securityEClass, SECURITY__MULTI);

		multiProfileEClass = createEClass(MULTI_PROFILE);
		createEAttribute(multiProfileEClass, MULTI_PROFILE__CAT_COMPANY);
		createEAttribute(multiProfileEClass, MULTI_PROFILE__CAT_CANAL_MARCO);
		createEAttribute(multiProfileEClass, MULTI_PROFILE__CAT_GAMA);
		createEAttribute(multiProfileEClass, MULTI_PROFILE__CAT_IDIOMA);
		createEAttribute(multiProfileEClass, MULTI_PROFILE__CAT_ESTRUCTURA);
		createEAttribute(multiProfileEClass, MULTI_PROFILE__CAT_NIVEL_IU);
		createEAttribute(multiProfileEClass, MULTI_PROFILE__CAT_EMPRESA_ASOCIADA);
		createEAttribute(multiProfileEClass, MULTI_PROFILE__CAT_RENDER);
		createEAttribute(multiProfileEClass, MULTI_PROFILE__CAT_ORDEN);
		createEAttribute(multiProfileEClass, MULTI_PROFILE__MODE);

		javaEClass = createEClass(JAVA);
		createEAttribute(javaEClass, JAVA__PACKAGE);
		createEAttribute(javaEClass, JAVA__COMPONENT_NAME);
		createEReference(javaEClass, JAVA__ECACHE);
		createEReference(javaEClass, JAVA__EFTP);

		appAdapterEClass = createEClass(APP_ADAPTER);
		createEReference(appAdapterEClass, APP_ADAPTER__ECACHE);
		createEReference(appAdapterEClass, APP_ADAPTER__EFTP);
		createEAttribute(appAdapterEClass, APP_ADAPTER__PACKAGE);
		createEAttribute(appAdapterEClass, APP_ADAPTER__COMPONENT_NAME);

		jspEClass = createEClass(JSP);
		createEAttribute(jspEClass, JSP__NAME);
		createEReference(jspEClass, JSP__ETABLE_PARAMETERS);
		createEReference(jspEClass, JSP__ERULES);

		siebelEClass = createEClass(SIEBEL);
		createEAttribute(siebelEClass, SIEBEL__STATE);
		createEAttribute(siebelEClass, SIEBEL__SERVER);
		createEAttribute(siebelEClass, SIEBEL__OBJECT);
		createEAttribute(siebelEClass, SIEBEL__REQUEST);

		tpEClass = createEClass(TP);
		createEAttribute(tpEClass, TP__STATE);
		createEAttribute(tpEClass, TP__CODE);
		createEAttribute(tpEClass, TP__TYPE);
		createEAttribute(tpEClass, TP__SUBTYPE);

		bbooEClass = createEClass(BBOO);
		createEAttribute(bbooEClass, BBOO__STATE);
		createEAttribute(bbooEClass, BBOO__ALIAS);
		createEAttribute(bbooEClass, BBOO__DOCUMENT);
		createEAttribute(bbooEClass, BBOO__PROVIDER);

		tableParametersEClass = createEClass(TABLE_PARAMETERS);
		createEAttribute(tableParametersEClass, TABLE_PARAMETERS__TABLE);
		createEAttribute(tableParametersEClass, TABLE_PARAMETERS__COLUMNS);
		createEAttribute(tableParametersEClass, TABLE_PARAMETERS__CACHEADO);
		createEReference(tableParametersEClass, TABLE_PARAMETERS__ECLIENT_ARC_REFERENCES);

		componentSQLEClass = createEClass(COMPONENT_SQL);
		createEAttribute(componentSQLEClass, COMPONENT_SQL__IMPLEMENTATION_TYPE);
		createEAttribute(componentSQLEClass, COMPONENT_SQL__DATASOURCE);
		createEAttribute(componentSQLEClass, COMPONENT_SQL__DATA_SOURCE_ALIAS);
		createEAttribute(componentSQLEClass, COMPONENT_SQL__MAX_ROWS);
		createEAttribute(componentSQLEClass, COMPONENT_SQL__PAGE_MAX_SIZE);
		createEReference(componentSQLEClass, COMPONENT_SQL__ESQL_SENTENCE);
		createEReference(componentSQLEClass, COMPONENT_SQL__ECACHE);
		createEReference(componentSQLEClass, COMPONENT_SQL__EFTP);
		createEAttribute(componentSQLEClass, COMPONENT_SQL__COMPONENT);
		createEAttribute(componentSQLEClass, COMPONENT_SQL__MODULE);

		sqlSentenceEClass = createEClass(SQL_SENTENCE);
		createEAttribute(sqlSentenceEClass, SQL_SENTENCE__NAME);
		createEAttribute(sqlSentenceEClass, SQL_SENTENCE__TYPE);
		createEAttribute(sqlSentenceEClass, SQL_SENTENCE__SQL);
		createEReference(sqlSentenceEClass, SQL_SENTENCE__EFACHADA);

		clientArcReferencesEClass = createEClass(CLIENT_ARC_REFERENCES);
		createEAttribute(clientArcReferencesEClass, CLIENT_ARC_REFERENCES__SRC);
		createEAttribute(clientArcReferencesEClass, CLIENT_ARC_REFERENCES__REFERENCE);

		logLevelEClass = createEClass(LOG_LEVEL);
		createEAttribute(logLevelEClass, LOG_LEVEL__ID);
		createEAttribute(logLevelEClass, LOG_LEVEL__PROPAGATION);
		createEAttribute(logLevelEClass, LOG_LEVEL__PROPAGATION_PRIORITY);
		createEAttribute(logLevelEClass, LOG_LEVEL__LEVEL_PRIORITY);
		createEReference(logLevelEClass, LOG_LEVEL__ELEVELS);

		rulesEClass = createEClass(RULES);
		createEAttribute(rulesEClass, RULES__ID_LIT);
		createEAttribute(rulesEClass, RULES__LIT);

		trxOPLogicalChannelEClass = createEClass(TRX_OP_LOGICAL_CHANNEL);
		createEAttribute(trxOPLogicalChannelEClass, TRX_OP_LOGICAL_CHANNEL__NAME);
		createEAttribute(trxOPLogicalChannelEClass, TRX_OP_LOGICAL_CHANNEL__VALUE);

		trxOPPhysicalChannelEClass = createEClass(TRX_OP_PHYSICAL_CHANNEL);
		createEAttribute(trxOPPhysicalChannelEClass, TRX_OP_PHYSICAL_CHANNEL__NAME);
		createEAttribute(trxOPPhysicalChannelEClass, TRX_OP_PHYSICAL_CHANNEL__VALUE);

		satLogicalChannelEClass = createEClass(SAT_LOGICAL_CHANNEL);
		createEAttribute(satLogicalChannelEClass, SAT_LOGICAL_CHANNEL__NAME);
		createEAttribute(satLogicalChannelEClass, SAT_LOGICAL_CHANNEL__VALUE);

		satPhysicalChannelEClass = createEClass(SAT_PHYSICAL_CHANNEL);
		createEAttribute(satPhysicalChannelEClass, SAT_PHYSICAL_CHANNEL__NAME);
		createEAttribute(satPhysicalChannelEClass, SAT_PHYSICAL_CHANNEL__VALUE);

		cacheEClass = createEClass(CACHE);
		createEAttribute(cacheEClass, CACHE__PACKAGE);
		createEAttribute(cacheEClass, CACHE__NAME);
		createEAttribute(cacheEClass, CACHE__ALIAS);

		levelsEClass = createEClass(LEVELS);
		createEAttribute(levelsEClass, LEVELS__NAME_LEVEL);

		ftpEClass = createEClass(FTP);
		createEAttribute(ftpEClass, FTP__MODULE);
		createEAttribute(ftpEClass, FTP__PACKAGE);
		createEAttribute(ftpEClass, FTP__NAME);
		createEAttribute(ftpEClass, FTP__ALIAS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(hostEClass, dependencies.HOST.class, "HOST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHOST_SatProtocol(), ecorePackage.getEString(), "satProtocol", null, 0, 1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHOST_SatAlias(), ecorePackage.getEString(), "satAlias", null, 0, 1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHOST_SatTimeOut(), ecorePackage.getEString(), "satTimeOut", null, 0, 1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHOST_SatNullValues(), ecorePackage.getEString(), "satNullValues", null, 0, 1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHOST_SatNullWhenSpaces(), ecorePackage.getEString(), "satNullWhenSpaces", null, 0, 1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHOST_TrxOPDefaultMode(), ecorePackage.getEString(), "trxOPDefaultMode", null, 0, 1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHOST_TrxOPTCPAlias(), ecorePackage.getEString(), "trxOPTCPAlias", null, 0, 1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHOST_AltairProtocol(), ecorePackage.getEString(), "altairProtocol", null, 0, 1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHOST_AltairAlias(), ecorePackage.getEString(), "altairAlias", null, 0, 1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHOST_RedProtocol(), ecorePackage.getEString(), "RedProtocol", null, 0, 1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHOST_Trxprotocol(), ecorePackage.getEString(), "trxprotocol", null, 0, 1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHOST_EOPLogicalChannel(), this.getTrxOPLogicalChannel(), null, "eOPLogicalChannel", null, 0, -1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHOST_EPhysicalChannel(), this.getTrxOPPhysicalChannel(), null, "ePhysicalChannel", null, 0, -1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHOST_ESATLogicalChannel(), this.getSATLogicalChannel(), null, "eSATLogicalChannel", null, 0, -1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHOST_ESATPhysicalChannel(), this.getSATPhysicalChannel(), null, "eSATPhysicalChannel", null, 0, -1, dependencies.HOST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opEClass, dependencies.OP.class, "OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOP_EstadoLlamadaOP(), this.getOP(), null, "estadoLlamadaOP", null, 0, -1, dependencies.OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOP_ERJSP(), this.getJSP(), null, "ERJSP", null, 1, -1, dependencies.OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOP_LpName(), ecorePackage.getEString(), "lpName", null, 0, 1, dependencies.OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOP_OpName(), ecorePackage.getEString(), "opName", null, 0, 1, dependencies.OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOP_Version(), ecorePackage.getEString(), "version", null, 0, 1, dependencies.OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOP_EOI(), this.getOI(), null, "eOI", null, 0, -1, dependencies.OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOP_EFachada(), this.getFachada(), null, "eFachada", null, 0, -1, dependencies.OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oiEClass, dependencies.OI.class, "OI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOI_EstadoLlamadaOI(), this.getOI(), null, "estadoLlamadaOI", null, 0, -1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOI_LnName(), ecorePackage.getEString(), "lnName", null, 0, 1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOI_OiName(), ecorePackage.getEString(), "oiName", null, 0, 1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOI_Version(), ecorePackage.getEString(), "version", null, 0, 1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOI_ETp(), this.getTp(), null, "eTp", null, 0, -1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOI_EBBOO(), this.getBBOO(), null, "eBBOO", null, 0, -1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOI_ESiebel(), this.getSiebel(), null, "eSiebel", null, 0, -1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOI_EComponentSQL(), this.getComponentSQL(), null, "eComponentSQL", null, 0, -1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOI_EAltair(), this.getAltair(), null, "eAltair", null, 0, -1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOI_ETrxOP(), this.getTrxOP(), null, "eTrxOP", null, 0, -1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOI_ESAT(), this.getSAT(), null, "eSAT", null, 0, -1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOI_EFachada(), this.getFachada(), null, "eFachada", null, 0, -1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOI_EWebService(), this.getWebservice(), null, "eWebService", null, 0, -1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOI_EJava(), this.getJava(), null, "eJava", null, 0, -1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOI_EAppAdapter(), this.getAppAdapter(), null, "eAppAdapter", null, 0, -1, dependencies.OI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fachadaEClass, Fachada.class, "Fachada", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFachada_FacadeName(), ecorePackage.getEString(), "facadeName", null, 0, 1, Fachada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFachada_InterfazName(), ecorePackage.getEString(), "interfazName", null, 0, 1, Fachada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFachada_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, Fachada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFachada_MethodID(), ecorePackage.getEString(), "methodID", null, 0, 1, Fachada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFachada_EOI(), this.getOI(), null, "eOI", null, 1, 1, Fachada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFachada_EComponentSQL(), this.getComponentSQL(), null, "eComponentSQL", null, 0, 1, Fachada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFachada_EJava(), this.getJava(), null, "eJava", null, 0, 1, Fachada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFachada_EAppAdapter(), this.getAppAdapter(), null, "eAppAdapter", null, 0, 1, Fachada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trxOPEClass, TrxOP.class, "TrxOP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrxOP_State(), ecorePackage.getEString(), "state", null, 0, 1, TrxOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrxOP_Transaction(), ecorePackage.getEString(), "transaction", null, 0, 1, TrxOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrxOP_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, TrxOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrxOP_Version(), ecorePackage.getEString(), "version", null, 0, 1, TrxOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrxOP_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, TrxOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrxOP_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, TrxOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrxOP_TransactionMode(), ecorePackage.getEString(), "transactionMode", null, 0, 1, TrxOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satEClass, dependencies.SAT.class, "SAT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSAT_State(), ecorePackage.getEString(), "state", null, 0, 1, dependencies.SAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSAT_SatName(), ecorePackage.getEString(), "satName", null, 0, 1, dependencies.SAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSAT_Version(), ecorePackage.getEString(), "version", null, 0, 1, dependencies.SAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSAT_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, dependencies.SAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSAT_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, dependencies.SAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(altairEClass, Altair.class, "Altair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAltair_State(), ecorePackage.getEString(), "state", null, 0, 1, Altair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAltair_Transaction(), ecorePackage.getEString(), "transaction", null, 0, 1, Altair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAltair_Version(), ecorePackage.getEString(), "version", null, 0, 1, Altair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAltair_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Altair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAltair_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, Altair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webserviceEClass, Webservice.class, "Webservice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebservice_State(), ecorePackage.getEString(), "state", null, 0, 1, Webservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebservice_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Webservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebservice_Transport(), ecorePackage.getEString(), "transport", null, 0, 1, Webservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebservice_Synchrony(), ecorePackage.getEString(), "synchrony", null, 0, 1, Webservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebservice_Wsdl(), ecorePackage.getEString(), "wsdl", null, 0, 1, Webservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebservice_WsOp(), ecorePackage.getEString(), "wsOp", null, 0, 1, Webservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebservice_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, Webservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelAdapterEClass, ChannelAdapter.class, "ChannelAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelAdapter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ChannelAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelAdapter_Type(), ecorePackage.getEString(), "type", null, 0, 1, ChannelAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelAdapter_FacadeName(), ecorePackage.getEString(), "facadeName", null, 0, 1, ChannelAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelAdapter_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 0, 1, ChannelAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelAdapter_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, ChannelAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jmsEClass, dependencies.JMS.class, "JMS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJMS_ListenerPorts(), ecorePackage.getEString(), "listenerPorts", null, 0, 1, dependencies.JMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJMS_JmsModules(), ecorePackage.getEString(), "jmsModules", null, 0, 1, dependencies.JMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ensambladoEClass, Ensamblado.class, "Ensamblado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnsamblado_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ensamblado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnsamblado_ELogLevel(), this.getLogLevel(), null, "eLogLevel", null, 0, -1, Ensamblado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnsamblado_EMultiProfile(), this.getMultiProfile(), null, "eMultiProfile", null, 0, 1, Ensamblado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnsamblado_EHOST(), this.getHOST(), null, "eHOST", null, 0, 1, Ensamblado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnsamblado_EJMS(), this.getJMS(), null, "eJMS", null, 0, -1, Ensamblado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnsamblado_EChannelAdapter(), this.getChannelAdapter(), null, "eChannelAdapter", null, 0, -1, Ensamblado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnsamblado_EEnsamblado(), this.getSecurity(), null, "eEnsamblado", null, 0, 1, Ensamblado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnsamblado_EOP(), this.getOP(), null, "eOP", null, 0, -1, Ensamblado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnsamblado_DefaultBankChannel(), ecorePackage.getEString(), "defaultBankChannel", null, 0, 1, Ensamblado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityEClass, Security.class, "Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurity_Autentication(), ecorePackage.getEString(), "autentication", null, 0, 1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurity_UsuNotes(), ecorePackage.getEString(), "usuNotes", null, 0, 1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurity_EntityAlias(), ecorePackage.getEString(), "entityAlias", null, 0, 1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurity_CodePassword(), ecorePackage.getEString(), "codePassword", null, 0, 1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurity_Multi(), ecorePackage.getEString(), "multi", null, 0, 1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiProfileEClass, MultiProfile.class, "MultiProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiProfile_CatCompany(), ecorePackage.getEString(), "catCompany", null, 0, 1, MultiProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiProfile_CatCanalMarco(), ecorePackage.getEString(), "catCanalMarco", null, 0, 1, MultiProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiProfile_CatGama(), ecorePackage.getEString(), "catGama", null, 0, 1, MultiProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiProfile_CatIdioma(), ecorePackage.getEString(), "catIdioma", null, 0, 1, MultiProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiProfile_CatEstructura(), ecorePackage.getEString(), "catEstructura", null, 0, 1, MultiProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiProfile_CatNivelIU(), ecorePackage.getEString(), "catNivelIU", null, 0, 1, MultiProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiProfile_CatEmpresaAsociada(), ecorePackage.getEString(), "catEmpresaAsociada", null, 0, 1, MultiProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiProfile_CatRender(), ecorePackage.getEString(), "catRender", null, 0, 1, MultiProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiProfile_CatOrden(), ecorePackage.getEString(), "catOrden", null, 0, 1, MultiProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiProfile_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, MultiProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaEClass, Java.class, "Java", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJava_Package(), ecorePackage.getEString(), "package", null, 0, 1, Java.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJava_ComponentName(), ecorePackage.getEString(), "componentName", null, 0, 1, Java.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJava_ECache(), this.getCache(), null, "eCache", null, 0, 1, Java.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJava_EFTP(), this.getFTP(), null, "eFTP", null, 0, 1, Java.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appAdapterEClass, AppAdapter.class, "AppAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppAdapter_ECache(), this.getCache(), null, "eCache", null, 0, 1, AppAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppAdapter_EFTP(), this.getFTP(), null, "eFTP", null, 0, 1, AppAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppAdapter_Package(), ecorePackage.getEString(), "package", null, 0, 1, AppAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppAdapter_ComponentName(), ecorePackage.getEString(), "componentName", null, 0, 1, AppAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jspEClass, dependencies.JSP.class, "JSP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJSP_Name(), ecorePackage.getEString(), "name", null, 0, 1, dependencies.JSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJSP_ETableParameters(), this.getTableParameters(), null, "eTableParameters", null, 0, -1, dependencies.JSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJSP_ERules(), this.getRules(), null, "eRules", null, 0, -1, dependencies.JSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siebelEClass, Siebel.class, "Siebel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSiebel_State(), ecorePackage.getEString(), "state", null, 0, 1, Siebel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSiebel_Server(), ecorePackage.getEString(), "server", null, 0, 1, Siebel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSiebel_Object(), ecorePackage.getEString(), "object", null, 0, 1, Siebel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSiebel_Request(), ecorePackage.getEString(), "request", null, 0, 1, Siebel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tpEClass, Tp.class, "Tp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTp_State(), ecorePackage.getEString(), "state", null, 0, 1, Tp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTp_Code(), ecorePackage.getEString(), "code", null, 0, 1, Tp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTp_Type(), ecorePackage.getEString(), "type", null, 0, 1, Tp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTp_Subtype(), ecorePackage.getEString(), "subtype", null, 0, 1, Tp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bbooEClass, dependencies.BBOO.class, "BBOO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBBOO_State(), ecorePackage.getEString(), "state", null, 0, 1, dependencies.BBOO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBBOO_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, dependencies.BBOO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBBOO_Document(), ecorePackage.getEString(), "document", null, 0, 1, dependencies.BBOO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBBOO_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, dependencies.BBOO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableParametersEClass, TableParameters.class, "TableParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableParameters_Table(), ecorePackage.getEString(), "table", null, 0, 1, TableParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableParameters_Columns(), ecorePackage.getEString(), "columns", null, 0, 1, TableParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableParameters_Cacheado(), ecorePackage.getEString(), "cacheado", null, 0, 1, TableParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableParameters_EClientArcReferences(), this.getClientArcReferences(), null, "eClientArcReferences", null, 0, -1, TableParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentSQLEClass, ComponentSQL.class, "ComponentSQL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentSQL_ImplementationType(), ecorePackage.getEString(), "implementationType", null, 0, 1, ComponentSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentSQL_Datasource(), ecorePackage.getEString(), "datasource", null, 0, 1, ComponentSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentSQL_DataSourceAlias(), ecorePackage.getEString(), "dataSourceAlias", null, 0, 1, ComponentSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentSQL_MaxRows(), ecorePackage.getEString(), "maxRows", null, 0, 1, ComponentSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentSQL_PageMaxSize(), ecorePackage.getEString(), "pageMaxSize", null, 0, 1, ComponentSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentSQL_ESQLSentence(), this.getSQLSentence(), null, "eSQLSentence", null, 1, -1, ComponentSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentSQL_ECache(), this.getCache(), null, "eCache", null, 0, 1, ComponentSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentSQL_EFTP(), this.getFTP(), null, "eFTP", null, 0, 1, ComponentSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentSQL_Component(), ecorePackage.getEString(), "component", null, 0, 1, ComponentSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentSQL_Module(), ecorePackage.getEString(), "module", null, 0, 1, ComponentSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlSentenceEClass, SQLSentence.class, "SQLSentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSQLSentence_Name(), ecorePackage.getEString(), "name", null, 0, 1, SQLSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSQLSentence_Type(), ecorePackage.getEString(), "type", null, 0, 1, SQLSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSQLSentence_Sql(), ecorePackage.getEString(), "sql", null, 0, 1, SQLSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSQLSentence_EFachada(), this.getFachada(), null, "eFachada", null, 0, 1, SQLSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientArcReferencesEClass, ClientArcReferences.class, "ClientArcReferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClientArcReferences_Src(), ecorePackage.getEString(), "src", null, 0, 1, ClientArcReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClientArcReferences_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, ClientArcReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logLevelEClass, LogLevel.class, "LogLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogLevel_Id(), ecorePackage.getEString(), "id", null, 0, 1, LogLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogLevel_Propagation(), ecorePackage.getEString(), "propagation", null, 0, 1, LogLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogLevel_PropagationPriority(), ecorePackage.getEString(), "propagationPriority", null, 0, 1, LogLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogLevel_LevelPriority(), ecorePackage.getEString(), "levelPriority", null, 0, 1, LogLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogLevel_ELevels(), this.getLevels(), null, "eLevels", null, 0, -1, LogLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rulesEClass, Rules.class, "Rules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRules_IdLit(), ecorePackage.getEString(), "idLit", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRules_Lit(), ecorePackage.getEString(), "lit", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trxOPLogicalChannelEClass, TrxOPLogicalChannel.class, "TrxOPLogicalChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrxOPLogicalChannel_Name(), ecorePackage.getEString(), "name", null, 0, 1, TrxOPLogicalChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrxOPLogicalChannel_Value(), ecorePackage.getEString(), "value", null, 0, 1, TrxOPLogicalChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trxOPPhysicalChannelEClass, TrxOPPhysicalChannel.class, "TrxOPPhysicalChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrxOPPhysicalChannel_Name(), ecorePackage.getEString(), "name", null, 0, 1, TrxOPPhysicalChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrxOPPhysicalChannel_Value(), ecorePackage.getEString(), "value", null, 0, 1, TrxOPPhysicalChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satLogicalChannelEClass, SATLogicalChannel.class, "SATLogicalChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSATLogicalChannel_Name(), ecorePackage.getEString(), "name", null, 0, 1, SATLogicalChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSATLogicalChannel_Value(), ecorePackage.getEString(), "value", null, 0, 1, SATLogicalChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satPhysicalChannelEClass, SATPhysicalChannel.class, "SATPhysicalChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSATPhysicalChannel_Name(), ecorePackage.getEString(), "name", null, 0, 1, SATPhysicalChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSATPhysicalChannel_Value(), ecorePackage.getEString(), "value", null, 0, 1, SATPhysicalChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheEClass, Cache.class, "Cache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCache_Package(), ecorePackage.getEString(), "package", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_Name(), ecorePackage.getEString(), "name", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelsEClass, Levels.class, "Levels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevels_NameLevel(), ecorePackage.getEString(), "nameLevel", null, 0, 1, Levels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ftpEClass, dependencies.FTP.class, "FTP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFTP_Module(), ecorePackage.getEString(), "module", null, 0, 1, dependencies.FTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFTP_Package(), ecorePackage.getEString(), "package", null, 0, 1, dependencies.FTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFTP_Name(), ecorePackage.getEString(), "name", null, 0, 1, dependencies.FTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFTP_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, dependencies.FTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DependenciesPackageImpl
