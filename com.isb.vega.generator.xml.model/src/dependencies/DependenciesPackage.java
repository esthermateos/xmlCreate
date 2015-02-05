/**
 */
package dependencies;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dependencies.DependenciesFactory
 * @model kind="package"
 * @generated
 */
public interface DependenciesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dependencies";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bsk.dependencies/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dependencies";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependenciesPackage eINSTANCE = dependencies.impl.DependenciesPackageImpl.init();

	/**
	 * The meta object id for the '{@link dependencies.impl.HOSTImpl <em>HOST</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.HOSTImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getHOST()
	 * @generated
	 */
	int HOST = 0;

	/**
	 * The feature id for the '<em><b>Sat Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__SAT_PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Sat Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__SAT_ALIAS = 1;

	/**
	 * The feature id for the '<em><b>Sat Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__SAT_TIME_OUT = 2;

	/**
	 * The feature id for the '<em><b>Sat Null Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__SAT_NULL_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Sat Null When Spaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__SAT_NULL_WHEN_SPACES = 4;

	/**
	 * The feature id for the '<em><b>Trx OP Default Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__TRX_OP_DEFAULT_MODE = 5;

	/**
	 * The feature id for the '<em><b>Trx OPTCP Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__TRX_OPTCP_ALIAS = 6;

	/**
	 * The feature id for the '<em><b>Altair Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__ALTAIR_PROTOCOL = 7;

	/**
	 * The feature id for the '<em><b>Altair Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__ALTAIR_ALIAS = 8;

	/**
	 * The feature id for the '<em><b>Red Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__RED_PROTOCOL = 9;

	/**
	 * The feature id for the '<em><b>Trxprotocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__TRXPROTOCOL = 10;

	/**
	 * The feature id for the '<em><b>EOP Logical Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__EOP_LOGICAL_CHANNEL = 11;

	/**
	 * The feature id for the '<em><b>EPhysical Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__EPHYSICAL_CHANNEL = 12;

	/**
	 * The feature id for the '<em><b>ESAT Logical Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__ESAT_LOGICAL_CHANNEL = 13;

	/**
	 * The feature id for the '<em><b>ESAT Physical Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__ESAT_PHYSICAL_CHANNEL = 14;

	/**
	 * The number of structural features of the '<em>HOST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>HOST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.OPImpl <em>OP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.OPImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getOP()
	 * @generated
	 */
	int OP = 1;

	/**
	 * The feature id for the '<em><b>Estado Llamada OP</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__ESTADO_LLAMADA_OP = 0;

	/**
	 * The feature id for the '<em><b>ERJSP</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__ERJSP = 1;

	/**
	 * The feature id for the '<em><b>Lp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__LP_NAME = 2;

	/**
	 * The feature id for the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__OP_NAME = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__VERSION = 4;

	/**
	 * The feature id for the '<em><b>EWeb Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__EWEB_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>EOI</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__EOI = 6;

	/**
	 * The feature id for the '<em><b>EFachada</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__EFACHADA = 7;

	/**
	 * The number of structural features of the '<em>OP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>OP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.OIImpl <em>OI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.OIImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getOI()
	 * @generated
	 */
	int OI = 2;

	/**
	 * The feature id for the '<em><b>Estado Llamada OI</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__ESTADO_LLAMADA_OI = 0;

	/**
	 * The feature id for the '<em><b>ER App Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__ER_APP_ADAPTER = 1;

	/**
	 * The feature id for the '<em><b>Ln Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__LN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Oi Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__OI_NAME = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__VERSION = 4;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__EREFERENCE1 = 5;

	/**
	 * The feature id for the '<em><b>ETp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__ETP = 6;

	/**
	 * The feature id for the '<em><b>EBBOO</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__EBBOO = 7;

	/**
	 * The feature id for the '<em><b>ESiebel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__ESIEBEL = 8;

	/**
	 * The feature id for the '<em><b>ESQL Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__ESQL_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>EJava</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__EJAVA = 10;

	/**
	 * The feature id for the '<em><b>EAltair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__EALTAIR = 11;

	/**
	 * The feature id for the '<em><b>ETrx OP</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__ETRX_OP = 12;

	/**
	 * The feature id for the '<em><b>ESAT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__ESAT = 13;

	/**
	 * The feature id for the '<em><b>EFachada</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI__EFACHADA = 14;

	/**
	 * The number of structural features of the '<em>OI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>OI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.FachadaImpl <em>Fachada</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.FachadaImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getFachada()
	 * @generated
	 */
	int FACHADA = 3;

	/**
	 * The feature id for the '<em><b>Facade Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACHADA__FACADE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Interfaz Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACHADA__INTERFAZ_NAME = 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACHADA__METHOD_NAME = 2;

	/**
	 * The number of structural features of the '<em>Fachada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACHADA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fachada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACHADA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.TrxOPImpl <em>Trx OP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.TrxOPImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getTrxOP()
	 * @generated
	 */
	int TRX_OP = 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP__STATE = 0;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP__TRANSACTION = 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP__OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP__ALIAS = 4;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP__PROTOCOL = 5;

	/**
	 * The feature id for the '<em><b>Transaction Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP__TRANSACTION_MODE = 6;

	/**
	 * The number of structural features of the '<em>Trx OP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Trx OP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.SATImpl <em>SAT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.SATImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getSAT()
	 * @generated
	 */
	int SAT = 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT__STATE = 0;

	/**
	 * The feature id for the '<em><b>Sat Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT__SAT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT__ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT__MODE = 4;

	/**
	 * The number of structural features of the '<em>SAT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>SAT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.AltairImpl <em>Altair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.AltairImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getAltair()
	 * @generated
	 */
	int ALTAIR = 6;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTAIR__STATE = 0;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTAIR__TRANSACTION = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTAIR__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTAIR__ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTAIR__MODE = 4;

	/**
	 * The number of structural features of the '<em>Altair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTAIR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Altair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.WebserviceImpl <em>Webservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.WebserviceImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getWebservice()
	 * @generated
	 */
	int WEBSERVICE = 7;

	/**
	 * The feature id for the '<em><b>Associated Logics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE__ASSOCIATED_LOGICS = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE__ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE__TRANSPORT = 3;

	/**
	 * The feature id for the '<em><b>Synchrony</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE__SYNCHRONY = 4;

	/**
	 * The feature id for the '<em><b>Wsdl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE__WSDL = 5;

	/**
	 * The feature id for the '<em><b>Ws Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE__WS_OP = 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE__NAMESPACE = 7;

	/**
	 * The number of structural features of the '<em>Webservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Webservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.ChannelAdapterImpl <em>Channel Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.ChannelAdapterImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getChannelAdapter()
	 * @generated
	 */
	int CHANNEL_ADAPTER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_ADAPTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_ADAPTER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Facade Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_ADAPTER__FACADE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_ADAPTER__INTERFACE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_ADAPTER__ALIAS = 4;

	/**
	 * The number of structural features of the '<em>Channel Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_ADAPTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Channel Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_ADAPTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.JMSImpl <em>JMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.JMSImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getJMS()
	 * @generated
	 */
	int JMS = 9;

	/**
	 * The feature id for the '<em><b>Listener Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMS__LISTENER_PORTS = 0;

	/**
	 * The feature id for the '<em><b>Jms Modules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMS__JMS_MODULES = 1;

	/**
	 * The number of structural features of the '<em>JMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>JMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.EnsambladoImpl <em>Ensamblado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.EnsambladoImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getEnsamblado()
	 * @generated
	 */
	int ENSAMBLADO = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSAMBLADO__NAME = 0;

	/**
	 * The feature id for the '<em><b>ELog Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSAMBLADO__ELOG_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>EMulti Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSAMBLADO__EMULTI_PROFILE = 2;

	/**
	 * The feature id for the '<em><b>EHOST</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSAMBLADO__EHOST = 3;

	/**
	 * The feature id for the '<em><b>EJMS</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSAMBLADO__EJMS = 4;

	/**
	 * The feature id for the '<em><b>EChannel Adapter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSAMBLADO__ECHANNEL_ADAPTER = 5;

	/**
	 * The feature id for the '<em><b>EEnsamblado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSAMBLADO__EENSAMBLADO = 6;

	/**
	 * The feature id for the '<em><b>EOP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSAMBLADO__EOP = 7;

	/**
	 * The number of structural features of the '<em>Ensamblado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSAMBLADO_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Ensamblado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSAMBLADO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.SecurityImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 11;

	/**
	 * The feature id for the '<em><b>Autentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__AUTENTICATION = 0;

	/**
	 * The feature id for the '<em><b>Usu Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__USU_NOTES = 1;

	/**
	 * The feature id for the '<em><b>Entity Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__ENTITY_ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Code Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__CODE_PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__MULTI = 4;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.MultiProfileImpl <em>Multi Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.MultiProfileImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getMultiProfile()
	 * @generated
	 */
	int MULTI_PROFILE = 12;

	/**
	 * The feature id for the '<em><b>Cat Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROFILE__CAT_COMPANY = 0;

	/**
	 * The feature id for the '<em><b>Cat Canal Marco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROFILE__CAT_CANAL_MARCO = 1;

	/**
	 * The feature id for the '<em><b>Cat Gama</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROFILE__CAT_GAMA = 2;

	/**
	 * The feature id for the '<em><b>Cat Idioma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROFILE__CAT_IDIOMA = 3;

	/**
	 * The feature id for the '<em><b>Cat Estructura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROFILE__CAT_ESTRUCTURA = 4;

	/**
	 * The feature id for the '<em><b>Cat Nivel IU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROFILE__CAT_NIVEL_IU = 5;

	/**
	 * The feature id for the '<em><b>Cat Empresa Asociada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROFILE__CAT_EMPRESA_ASOCIADA = 6;

	/**
	 * The feature id for the '<em><b>Cat Render</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROFILE__CAT_RENDER = 7;

	/**
	 * The feature id for the '<em><b>Cat Orden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROFILE__CAT_ORDEN = 8;

	/**
	 * The number of structural features of the '<em>Multi Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROFILE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Multi Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.JavaImpl <em>Java</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.JavaImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getJava()
	 * @generated
	 */
	int JAVA = 13;

	/**
	 * The feature id for the '<em><b>EFachada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA__EFACHADA = 0;

	/**
	 * The feature id for the '<em><b>ECache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA__ECACHE = 1;

	/**
	 * The number of structural features of the '<em>Java</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Java</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.AppAdapterImpl <em>App Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.AppAdapterImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getAppAdapter()
	 * @generated
	 */
	int APP_ADAPTER = 14;

	/**
	 * The feature id for the '<em><b>EFachada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ADAPTER__EFACHADA = 0;

	/**
	 * The feature id for the '<em><b>ECache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ADAPTER__ECACHE = 1;

	/**
	 * The number of structural features of the '<em>App Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ADAPTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>App Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ADAPTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.JSPImpl <em>JSP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.JSPImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getJSP()
	 * @generated
	 */
	int JSP = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP__NAME = 0;

	/**
	 * The feature id for the '<em><b>ETable Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP__ETABLE_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>ERules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP__ERULES = 2;

	/**
	 * The number of structural features of the '<em>JSP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>JSP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.SiebelImpl <em>Siebel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.SiebelImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getSiebel()
	 * @generated
	 */
	int SIEBEL = 16;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEBEL__STATE = 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEBEL__SERVER = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEBEL__OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEBEL__REQUEST = 3;

	/**
	 * The number of structural features of the '<em>Siebel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEBEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Siebel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEBEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.TpImpl <em>Tp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.TpImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getTp()
	 * @generated
	 */
	int TP = 17;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP__STATE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP__SUBTYPE = 3;

	/**
	 * The number of structural features of the '<em>Tp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.BBOOImpl <em>BBOO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.BBOOImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getBBOO()
	 * @generated
	 */
	int BBOO = 18;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOO__STATE = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOO__ALIAS = 1;

	/**
	 * The feature id for the '<em><b>Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOO__DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOO__PROVIDER = 3;

	/**
	 * The number of structural features of the '<em>BBOO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>BBOO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.TableParametersImpl <em>Table Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.TableParametersImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getTableParameters()
	 * @generated
	 */
	int TABLE_PARAMETERS = 19;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PARAMETERS__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PARAMETERS__COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Cacheado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PARAMETERS__CACHEADO = 2;

	/**
	 * The feature id for the '<em><b>EClient Arc References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PARAMETERS__ECLIENT_ARC_REFERENCES = 3;

	/**
	 * The number of structural features of the '<em>Table Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PARAMETERS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Table Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.SQLComponentImpl <em>SQL Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.SQLComponentImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getSQLComponent()
	 * @generated
	 */
	int SQL_COMPONENT = 20;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_COMPONENT__IMPLEMENTATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Datasource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_COMPONENT__DATASOURCE = 1;

	/**
	 * The feature id for the '<em><b>Data Source Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_COMPONENT__DATA_SOURCE_ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Max Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_COMPONENT__MAX_ROWS = 3;

	/**
	 * The feature id for the '<em><b>Page Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_COMPONENT__PAGE_MAX_SIZE = 4;

	/**
	 * The feature id for the '<em><b>ESQL Sentence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_COMPONENT__ESQL_SENTENCE = 5;

	/**
	 * The feature id for the '<em><b>ECache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_COMPONENT__ECACHE = 6;

	/**
	 * The number of structural features of the '<em>SQL Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_COMPONENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>SQL Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.eFachadaImpl <em>eFachada</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.eFachadaImpl
	 * @see dependencies.impl.DependenciesPackageImpl#geteFachada()
	 * @generated
	 */
	int EFACHADA = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACHADA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACHADA__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACHADA__SQL = 2;

	/**
	 * The feature id for the '<em><b>EFachada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACHADA__EFACHADA = 3;

	/**
	 * The number of structural features of the '<em>eFachada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACHADA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>eFachada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACHADA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.ClientArcReferencesImpl <em>Client Arc References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.ClientArcReferencesImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getClientArcReferences()
	 * @generated
	 */
	int CLIENT_ARC_REFERENCES = 22;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_ARC_REFERENCES__SRC = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_ARC_REFERENCES__REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Client Arc References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_ARC_REFERENCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Client Arc References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_ARC_REFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.LogLevelImpl <em>Log Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.LogLevelImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getLogLevel()
	 * @generated
	 */
	int LOG_LEVEL = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_LEVEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Propagation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_LEVEL__PROPAGATION = 1;

	/**
	 * The feature id for the '<em><b>Propagation Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_LEVEL__PROPAGATION_PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Level Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_LEVEL__LEVEL_PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>ELevels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_LEVEL__ELEVELS = 4;

	/**
	 * The number of structural features of the '<em>Log Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_LEVEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Log Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.RulesImpl <em>Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.RulesImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getRules()
	 * @generated
	 */
	int RULES = 24;

	/**
	 * The feature id for the '<em><b>Id Lit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__ID_LIT = 0;

	/**
	 * The feature id for the '<em><b>Lit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__LIT = 1;

	/**
	 * The number of structural features of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.TrxOPLogicalChannelImpl <em>Trx OP Logical Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.TrxOPLogicalChannelImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getTrxOPLogicalChannel()
	 * @generated
	 */
	int TRX_OP_LOGICAL_CHANNEL = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP_LOGICAL_CHANNEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP_LOGICAL_CHANNEL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Trx OP Logical Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP_LOGICAL_CHANNEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trx OP Logical Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP_LOGICAL_CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.TrxOPPhysicalChannelImpl <em>Trx OP Physical Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.TrxOPPhysicalChannelImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getTrxOPPhysicalChannel()
	 * @generated
	 */
	int TRX_OP_PHYSICAL_CHANNEL = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP_PHYSICAL_CHANNEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP_PHYSICAL_CHANNEL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Trx OP Physical Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP_PHYSICAL_CHANNEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trx OP Physical Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRX_OP_PHYSICAL_CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.SATLogicalChannelImpl <em>SAT Logical Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.SATLogicalChannelImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getSATLogicalChannel()
	 * @generated
	 */
	int SAT_LOGICAL_CHANNEL = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT_LOGICAL_CHANNEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT_LOGICAL_CHANNEL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>SAT Logical Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT_LOGICAL_CHANNEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SAT Logical Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT_LOGICAL_CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.SATPhysicalChannelImpl <em>SAT Physical Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.SATPhysicalChannelImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getSATPhysicalChannel()
	 * @generated
	 */
	int SAT_PHYSICAL_CHANNEL = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT_PHYSICAL_CHANNEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT_PHYSICAL_CHANNEL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>SAT Physical Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT_PHYSICAL_CHANNEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SAT Physical Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAT_PHYSICAL_CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.CacheImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 29;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__ALIAS = 2;

	/**
	 * The number of structural features of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencies.impl.LevelsImpl <em>Levels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencies.impl.LevelsImpl
	 * @see dependencies.impl.DependenciesPackageImpl#getLevels()
	 * @generated
	 */
	int LEVELS = 30;

	/**
	 * The feature id for the '<em><b>Name Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS__NAME_LEVEL = 0;

	/**
	 * The number of structural features of the '<em>Levels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Levels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link dependencies.HOST <em>HOST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HOST</em>'.
	 * @see dependencies.HOST
	 * @generated
	 */
	EClass getHOST();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.HOST#getSatProtocol <em>Sat Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sat Protocol</em>'.
	 * @see dependencies.HOST#getSatProtocol()
	 * @see #getHOST()
	 * @generated
	 */
	EAttribute getHOST_SatProtocol();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.HOST#getSatAlias <em>Sat Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sat Alias</em>'.
	 * @see dependencies.HOST#getSatAlias()
	 * @see #getHOST()
	 * @generated
	 */
	EAttribute getHOST_SatAlias();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.HOST#getSatTimeOut <em>Sat Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sat Time Out</em>'.
	 * @see dependencies.HOST#getSatTimeOut()
	 * @see #getHOST()
	 * @generated
	 */
	EAttribute getHOST_SatTimeOut();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.HOST#getSatNullValues <em>Sat Null Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sat Null Values</em>'.
	 * @see dependencies.HOST#getSatNullValues()
	 * @see #getHOST()
	 * @generated
	 */
	EAttribute getHOST_SatNullValues();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.HOST#getSatNullWhenSpaces <em>Sat Null When Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sat Null When Spaces</em>'.
	 * @see dependencies.HOST#getSatNullWhenSpaces()
	 * @see #getHOST()
	 * @generated
	 */
	EAttribute getHOST_SatNullWhenSpaces();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.HOST#getTrxOPDefaultMode <em>Trx OP Default Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trx OP Default Mode</em>'.
	 * @see dependencies.HOST#getTrxOPDefaultMode()
	 * @see #getHOST()
	 * @generated
	 */
	EAttribute getHOST_TrxOPDefaultMode();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.HOST#getTrxOPTCPAlias <em>Trx OPTCP Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trx OPTCP Alias</em>'.
	 * @see dependencies.HOST#getTrxOPTCPAlias()
	 * @see #getHOST()
	 * @generated
	 */
	EAttribute getHOST_TrxOPTCPAlias();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.HOST#getAltairProtocol <em>Altair Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altair Protocol</em>'.
	 * @see dependencies.HOST#getAltairProtocol()
	 * @see #getHOST()
	 * @generated
	 */
	EAttribute getHOST_AltairProtocol();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.HOST#getAltairAlias <em>Altair Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altair Alias</em>'.
	 * @see dependencies.HOST#getAltairAlias()
	 * @see #getHOST()
	 * @generated
	 */
	EAttribute getHOST_AltairAlias();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.HOST#getRedProtocol <em>Red Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red Protocol</em>'.
	 * @see dependencies.HOST#getRedProtocol()
	 * @see #getHOST()
	 * @generated
	 */
	EAttribute getHOST_RedProtocol();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.HOST#getTrxprotocol <em>Trxprotocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trxprotocol</em>'.
	 * @see dependencies.HOST#getTrxprotocol()
	 * @see #getHOST()
	 * @generated
	 */
	EAttribute getHOST_Trxprotocol();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.HOST#getEOPLogicalChannel <em>EOP Logical Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EOP Logical Channel</em>'.
	 * @see dependencies.HOST#getEOPLogicalChannel()
	 * @see #getHOST()
	 * @generated
	 */
	EReference getHOST_EOPLogicalChannel();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.HOST#getEPhysicalChannel <em>EPhysical Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EPhysical Channel</em>'.
	 * @see dependencies.HOST#getEPhysicalChannel()
	 * @see #getHOST()
	 * @generated
	 */
	EReference getHOST_EPhysicalChannel();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.HOST#getESATLogicalChannel <em>ESAT Logical Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ESAT Logical Channel</em>'.
	 * @see dependencies.HOST#getESATLogicalChannel()
	 * @see #getHOST()
	 * @generated
	 */
	EReference getHOST_ESATLogicalChannel();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.HOST#getESATPhysicalChannel <em>ESAT Physical Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ESAT Physical Channel</em>'.
	 * @see dependencies.HOST#getESATPhysicalChannel()
	 * @see #getHOST()
	 * @generated
	 */
	EReference getHOST_ESATPhysicalChannel();

	/**
	 * Returns the meta object for class '{@link dependencies.OP <em>OP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OP</em>'.
	 * @see dependencies.OP
	 * @generated
	 */
	EClass getOP();

	/**
	 * Returns the meta object for the reference list '{@link dependencies.OP#getEstadoLlamadaOP <em>Estado Llamada OP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Estado Llamada OP</em>'.
	 * @see dependencies.OP#getEstadoLlamadaOP()
	 * @see #getOP()
	 * @generated
	 */
	EReference getOP_EstadoLlamadaOP();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.OP#getERJSP <em>ERJSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ERJSP</em>'.
	 * @see dependencies.OP#getERJSP()
	 * @see #getOP()
	 * @generated
	 */
	EReference getOP_ERJSP();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.OP#getLpName <em>Lp Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lp Name</em>'.
	 * @see dependencies.OP#getLpName()
	 * @see #getOP()
	 * @generated
	 */
	EAttribute getOP_LpName();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.OP#getOpName <em>Op Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Name</em>'.
	 * @see dependencies.OP#getOpName()
	 * @see #getOP()
	 * @generated
	 */
	EAttribute getOP_OpName();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.OP#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see dependencies.OP#getVersion()
	 * @see #getOP()
	 * @generated
	 */
	EAttribute getOP_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.OP#getEWebService <em>EWeb Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EWeb Service</em>'.
	 * @see dependencies.OP#getEWebService()
	 * @see #getOP()
	 * @generated
	 */
	EReference getOP_EWebService();

	/**
	 * Returns the meta object for the reference list '{@link dependencies.OP#getEOI <em>EOI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EOI</em>'.
	 * @see dependencies.OP#getEOI()
	 * @see #getOP()
	 * @generated
	 */
	EReference getOP_EOI();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.OP#getEFachada <em>EFachada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EFachada</em>'.
	 * @see dependencies.OP#getEFachada()
	 * @see #getOP()
	 * @generated
	 */
	EReference getOP_EFachada();

	/**
	 * Returns the meta object for class '{@link dependencies.OI <em>OI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OI</em>'.
	 * @see dependencies.OI
	 * @generated
	 */
	EClass getOI();

	/**
	 * Returns the meta object for the reference list '{@link dependencies.OI#getEstadoLlamadaOI <em>Estado Llamada OI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Estado Llamada OI</em>'.
	 * @see dependencies.OI#getEstadoLlamadaOI()
	 * @see #getOI()
	 * @generated
	 */
	EReference getOI_EstadoLlamadaOI();

	/**
	 * Returns the meta object for the containment reference '{@link dependencies.OI#getERAppAdapter <em>ER App Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ER App Adapter</em>'.
	 * @see dependencies.OI#getERAppAdapter()
	 * @see #getOI()
	 * @generated
	 */
	EReference getOI_ERAppAdapter();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.OI#getLnName <em>Ln Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Name</em>'.
	 * @see dependencies.OI#getLnName()
	 * @see #getOI()
	 * @generated
	 */
	EAttribute getOI_LnName();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.OI#getOiName <em>Oi Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oi Name</em>'.
	 * @see dependencies.OI#getOiName()
	 * @see #getOI()
	 * @generated
	 */
	EAttribute getOI_OiName();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.OI#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see dependencies.OI#getVersion()
	 * @see #getOI()
	 * @generated
	 */
	EAttribute getOI_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.OI#getEReference1 <em>EReference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference1</em>'.
	 * @see dependencies.OI#getEReference1()
	 * @see #getOI()
	 * @generated
	 */
	EReference getOI_EReference1();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.OI#getETp <em>ETp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ETp</em>'.
	 * @see dependencies.OI#getETp()
	 * @see #getOI()
	 * @generated
	 */
	EReference getOI_ETp();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.OI#getEBBOO <em>EBBOO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EBBOO</em>'.
	 * @see dependencies.OI#getEBBOO()
	 * @see #getOI()
	 * @generated
	 */
	EReference getOI_EBBOO();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.OI#getESiebel <em>ESiebel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ESiebel</em>'.
	 * @see dependencies.OI#getESiebel()
	 * @see #getOI()
	 * @generated
	 */
	EReference getOI_ESiebel();

	/**
	 * Returns the meta object for the containment reference '{@link dependencies.OI#getESQLComponent <em>ESQL Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ESQL Component</em>'.
	 * @see dependencies.OI#getESQLComponent()
	 * @see #getOI()
	 * @generated
	 */
	EReference getOI_ESQLComponent();

	/**
	 * Returns the meta object for the reference '{@link dependencies.OI#getEJava <em>EJava</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EJava</em>'.
	 * @see dependencies.OI#getEJava()
	 * @see #getOI()
	 * @generated
	 */
	EReference getOI_EJava();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.OI#getEAltair <em>EAltair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EAltair</em>'.
	 * @see dependencies.OI#getEAltair()
	 * @see #getOI()
	 * @generated
	 */
	EReference getOI_EAltair();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.OI#getETrxOP <em>ETrx OP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ETrx OP</em>'.
	 * @see dependencies.OI#getETrxOP()
	 * @see #getOI()
	 * @generated
	 */
	EReference getOI_ETrxOP();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.OI#getESAT <em>ESAT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ESAT</em>'.
	 * @see dependencies.OI#getESAT()
	 * @see #getOI()
	 * @generated
	 */
	EReference getOI_ESAT();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.OI#getEFachada <em>EFachada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EFachada</em>'.
	 * @see dependencies.OI#getEFachada()
	 * @see #getOI()
	 * @generated
	 */
	EReference getOI_EFachada();

	/**
	 * Returns the meta object for class '{@link dependencies.Fachada <em>Fachada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fachada</em>'.
	 * @see dependencies.Fachada
	 * @generated
	 */
	EClass getFachada();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Fachada#getFacadeName <em>Facade Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facade Name</em>'.
	 * @see dependencies.Fachada#getFacadeName()
	 * @see #getFachada()
	 * @generated
	 */
	EAttribute getFachada_FacadeName();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Fachada#getInterfazName <em>Interfaz Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interfaz Name</em>'.
	 * @see dependencies.Fachada#getInterfazName()
	 * @see #getFachada()
	 * @generated
	 */
	EAttribute getFachada_InterfazName();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Fachada#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see dependencies.Fachada#getMethodName()
	 * @see #getFachada()
	 * @generated
	 */
	EAttribute getFachada_MethodName();

	/**
	 * Returns the meta object for class '{@link dependencies.TrxOP <em>Trx OP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trx OP</em>'.
	 * @see dependencies.TrxOP
	 * @generated
	 */
	EClass getTrxOP();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TrxOP#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see dependencies.TrxOP#getState()
	 * @see #getTrxOP()
	 * @generated
	 */
	EAttribute getTrxOP_State();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TrxOP#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction</em>'.
	 * @see dependencies.TrxOP#getTransaction()
	 * @see #getTrxOP()
	 * @generated
	 */
	EAttribute getTrxOP_Transaction();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TrxOP#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see dependencies.TrxOP#getOperation()
	 * @see #getTrxOP()
	 * @generated
	 */
	EAttribute getTrxOP_Operation();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TrxOP#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see dependencies.TrxOP#getVersion()
	 * @see #getTrxOP()
	 * @generated
	 */
	EAttribute getTrxOP_Version();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TrxOP#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see dependencies.TrxOP#getAlias()
	 * @see #getTrxOP()
	 * @generated
	 */
	EAttribute getTrxOP_Alias();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TrxOP#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see dependencies.TrxOP#getProtocol()
	 * @see #getTrxOP()
	 * @generated
	 */
	EAttribute getTrxOP_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TrxOP#getTransactionMode <em>Transaction Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Mode</em>'.
	 * @see dependencies.TrxOP#getTransactionMode()
	 * @see #getTrxOP()
	 * @generated
	 */
	EAttribute getTrxOP_TransactionMode();

	/**
	 * Returns the meta object for class '{@link dependencies.SAT <em>SAT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAT</em>'.
	 * @see dependencies.SAT
	 * @generated
	 */
	EClass getSAT();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SAT#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see dependencies.SAT#getState()
	 * @see #getSAT()
	 * @generated
	 */
	EAttribute getSAT_State();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SAT#getSatName <em>Sat Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sat Name</em>'.
	 * @see dependencies.SAT#getSatName()
	 * @see #getSAT()
	 * @generated
	 */
	EAttribute getSAT_SatName();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SAT#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see dependencies.SAT#getVersion()
	 * @see #getSAT()
	 * @generated
	 */
	EAttribute getSAT_Version();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SAT#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see dependencies.SAT#getAlias()
	 * @see #getSAT()
	 * @generated
	 */
	EAttribute getSAT_Alias();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SAT#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see dependencies.SAT#getMode()
	 * @see #getSAT()
	 * @generated
	 */
	EAttribute getSAT_Mode();

	/**
	 * Returns the meta object for class '{@link dependencies.Altair <em>Altair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Altair</em>'.
	 * @see dependencies.Altair
	 * @generated
	 */
	EClass getAltair();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Altair#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see dependencies.Altair#getState()
	 * @see #getAltair()
	 * @generated
	 */
	EAttribute getAltair_State();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Altair#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction</em>'.
	 * @see dependencies.Altair#getTransaction()
	 * @see #getAltair()
	 * @generated
	 */
	EAttribute getAltair_Transaction();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Altair#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see dependencies.Altair#getVersion()
	 * @see #getAltair()
	 * @generated
	 */
	EAttribute getAltair_Version();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Altair#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see dependencies.Altair#getAlias()
	 * @see #getAltair()
	 * @generated
	 */
	EAttribute getAltair_Alias();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Altair#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see dependencies.Altair#getMode()
	 * @see #getAltair()
	 * @generated
	 */
	EAttribute getAltair_Mode();

	/**
	 * Returns the meta object for class '{@link dependencies.Webservice <em>Webservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Webservice</em>'.
	 * @see dependencies.Webservice
	 * @generated
	 */
	EClass getWebservice();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Webservice#getAssociatedLogics <em>Associated Logics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated Logics</em>'.
	 * @see dependencies.Webservice#getAssociatedLogics()
	 * @see #getWebservice()
	 * @generated
	 */
	EAttribute getWebservice_AssociatedLogics();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Webservice#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see dependencies.Webservice#getState()
	 * @see #getWebservice()
	 * @generated
	 */
	EAttribute getWebservice_State();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Webservice#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see dependencies.Webservice#getAlias()
	 * @see #getWebservice()
	 * @generated
	 */
	EAttribute getWebservice_Alias();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Webservice#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport</em>'.
	 * @see dependencies.Webservice#getTransport()
	 * @see #getWebservice()
	 * @generated
	 */
	EAttribute getWebservice_Transport();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Webservice#getSynchrony <em>Synchrony</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchrony</em>'.
	 * @see dependencies.Webservice#getSynchrony()
	 * @see #getWebservice()
	 * @generated
	 */
	EAttribute getWebservice_Synchrony();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Webservice#getWsdl <em>Wsdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl</em>'.
	 * @see dependencies.Webservice#getWsdl()
	 * @see #getWebservice()
	 * @generated
	 */
	EAttribute getWebservice_Wsdl();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Webservice#getWsOp <em>Ws Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Op</em>'.
	 * @see dependencies.Webservice#getWsOp()
	 * @see #getWebservice()
	 * @generated
	 */
	EAttribute getWebservice_WsOp();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Webservice#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see dependencies.Webservice#getNamespace()
	 * @see #getWebservice()
	 * @generated
	 */
	EAttribute getWebservice_Namespace();

	/**
	 * Returns the meta object for class '{@link dependencies.ChannelAdapter <em>Channel Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Adapter</em>'.
	 * @see dependencies.ChannelAdapter
	 * @generated
	 */
	EClass getChannelAdapter();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.ChannelAdapter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dependencies.ChannelAdapter#getName()
	 * @see #getChannelAdapter()
	 * @generated
	 */
	EAttribute getChannelAdapter_Name();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.ChannelAdapter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dependencies.ChannelAdapter#getType()
	 * @see #getChannelAdapter()
	 * @generated
	 */
	EAttribute getChannelAdapter_Type();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.ChannelAdapter#getFacadeName <em>Facade Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facade Name</em>'.
	 * @see dependencies.ChannelAdapter#getFacadeName()
	 * @see #getChannelAdapter()
	 * @generated
	 */
	EAttribute getChannelAdapter_FacadeName();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.ChannelAdapter#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see dependencies.ChannelAdapter#getInterfaceName()
	 * @see #getChannelAdapter()
	 * @generated
	 */
	EAttribute getChannelAdapter_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.ChannelAdapter#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see dependencies.ChannelAdapter#getAlias()
	 * @see #getChannelAdapter()
	 * @generated
	 */
	EAttribute getChannelAdapter_Alias();

	/**
	 * Returns the meta object for class '{@link dependencies.JMS <em>JMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JMS</em>'.
	 * @see dependencies.JMS
	 * @generated
	 */
	EClass getJMS();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.JMS#getListenerPorts <em>Listener Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listener Ports</em>'.
	 * @see dependencies.JMS#getListenerPorts()
	 * @see #getJMS()
	 * @generated
	 */
	EAttribute getJMS_ListenerPorts();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.JMS#getJmsModules <em>Jms Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jms Modules</em>'.
	 * @see dependencies.JMS#getJmsModules()
	 * @see #getJMS()
	 * @generated
	 */
	EAttribute getJMS_JmsModules();

	/**
	 * Returns the meta object for class '{@link dependencies.Ensamblado <em>Ensamblado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ensamblado</em>'.
	 * @see dependencies.Ensamblado
	 * @generated
	 */
	EClass getEnsamblado();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Ensamblado#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dependencies.Ensamblado#getName()
	 * @see #getEnsamblado()
	 * @generated
	 */
	EAttribute getEnsamblado_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.Ensamblado#getELogLevel <em>ELog Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ELog Level</em>'.
	 * @see dependencies.Ensamblado#getELogLevel()
	 * @see #getEnsamblado()
	 * @generated
	 */
	EReference getEnsamblado_ELogLevel();

	/**
	 * Returns the meta object for the containment reference '{@link dependencies.Ensamblado#getEMultiProfile <em>EMulti Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EMulti Profile</em>'.
	 * @see dependencies.Ensamblado#getEMultiProfile()
	 * @see #getEnsamblado()
	 * @generated
	 */
	EReference getEnsamblado_EMultiProfile();

	/**
	 * Returns the meta object for the containment reference '{@link dependencies.Ensamblado#getEHOST <em>EHOST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EHOST</em>'.
	 * @see dependencies.Ensamblado#getEHOST()
	 * @see #getEnsamblado()
	 * @generated
	 */
	EReference getEnsamblado_EHOST();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.Ensamblado#getEJMS <em>EJMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EJMS</em>'.
	 * @see dependencies.Ensamblado#getEJMS()
	 * @see #getEnsamblado()
	 * @generated
	 */
	EReference getEnsamblado_EJMS();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.Ensamblado#getEChannelAdapter <em>EChannel Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EChannel Adapter</em>'.
	 * @see dependencies.Ensamblado#getEChannelAdapter()
	 * @see #getEnsamblado()
	 * @generated
	 */
	EReference getEnsamblado_EChannelAdapter();

	/**
	 * Returns the meta object for the containment reference '{@link dependencies.Ensamblado#getEEnsamblado <em>EEnsamblado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EEnsamblado</em>'.
	 * @see dependencies.Ensamblado#getEEnsamblado()
	 * @see #getEnsamblado()
	 * @generated
	 */
	EReference getEnsamblado_EEnsamblado();

	/**
	 * Returns the meta object for the containment reference '{@link dependencies.Ensamblado#getEOP <em>EOP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EOP</em>'.
	 * @see dependencies.Ensamblado#getEOP()
	 * @see #getEnsamblado()
	 * @generated
	 */
	EReference getEnsamblado_EOP();

	/**
	 * Returns the meta object for class '{@link dependencies.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see dependencies.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Security#getAutentication <em>Autentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autentication</em>'.
	 * @see dependencies.Security#getAutentication()
	 * @see #getSecurity()
	 * @generated
	 */
	EAttribute getSecurity_Autentication();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Security#getUsuNotes <em>Usu Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usu Notes</em>'.
	 * @see dependencies.Security#getUsuNotes()
	 * @see #getSecurity()
	 * @generated
	 */
	EAttribute getSecurity_UsuNotes();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Security#getEntityAlias <em>Entity Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Alias</em>'.
	 * @see dependencies.Security#getEntityAlias()
	 * @see #getSecurity()
	 * @generated
	 */
	EAttribute getSecurity_EntityAlias();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Security#getCodePassword <em>Code Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Password</em>'.
	 * @see dependencies.Security#getCodePassword()
	 * @see #getSecurity()
	 * @generated
	 */
	EAttribute getSecurity_CodePassword();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Security#getMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi</em>'.
	 * @see dependencies.Security#getMulti()
	 * @see #getSecurity()
	 * @generated
	 */
	EAttribute getSecurity_Multi();

	/**
	 * Returns the meta object for class '{@link dependencies.MultiProfile <em>Multi Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Profile</em>'.
	 * @see dependencies.MultiProfile
	 * @generated
	 */
	EClass getMultiProfile();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.MultiProfile#getCatCompany <em>Cat Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cat Company</em>'.
	 * @see dependencies.MultiProfile#getCatCompany()
	 * @see #getMultiProfile()
	 * @generated
	 */
	EAttribute getMultiProfile_CatCompany();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.MultiProfile#getCatCanalMarco <em>Cat Canal Marco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cat Canal Marco</em>'.
	 * @see dependencies.MultiProfile#getCatCanalMarco()
	 * @see #getMultiProfile()
	 * @generated
	 */
	EAttribute getMultiProfile_CatCanalMarco();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.MultiProfile#getCatGama <em>Cat Gama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cat Gama</em>'.
	 * @see dependencies.MultiProfile#getCatGama()
	 * @see #getMultiProfile()
	 * @generated
	 */
	EAttribute getMultiProfile_CatGama();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.MultiProfile#getCatIdioma <em>Cat Idioma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cat Idioma</em>'.
	 * @see dependencies.MultiProfile#getCatIdioma()
	 * @see #getMultiProfile()
	 * @generated
	 */
	EAttribute getMultiProfile_CatIdioma();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.MultiProfile#getCatEstructura <em>Cat Estructura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cat Estructura</em>'.
	 * @see dependencies.MultiProfile#getCatEstructura()
	 * @see #getMultiProfile()
	 * @generated
	 */
	EAttribute getMultiProfile_CatEstructura();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.MultiProfile#getCatNivelIU <em>Cat Nivel IU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cat Nivel IU</em>'.
	 * @see dependencies.MultiProfile#getCatNivelIU()
	 * @see #getMultiProfile()
	 * @generated
	 */
	EAttribute getMultiProfile_CatNivelIU();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.MultiProfile#getCatEmpresaAsociada <em>Cat Empresa Asociada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cat Empresa Asociada</em>'.
	 * @see dependencies.MultiProfile#getCatEmpresaAsociada()
	 * @see #getMultiProfile()
	 * @generated
	 */
	EAttribute getMultiProfile_CatEmpresaAsociada();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.MultiProfile#getCatRender <em>Cat Render</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cat Render</em>'.
	 * @see dependencies.MultiProfile#getCatRender()
	 * @see #getMultiProfile()
	 * @generated
	 */
	EAttribute getMultiProfile_CatRender();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.MultiProfile#getCatOrden <em>Cat Orden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cat Orden</em>'.
	 * @see dependencies.MultiProfile#getCatOrden()
	 * @see #getMultiProfile()
	 * @generated
	 */
	EAttribute getMultiProfile_CatOrden();

	/**
	 * Returns the meta object for class '{@link dependencies.Java <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java</em>'.
	 * @see dependencies.Java
	 * @generated
	 */
	EClass getJava();

	/**
	 * Returns the meta object for the reference '{@link dependencies.Java#getEFachada <em>EFachada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EFachada</em>'.
	 * @see dependencies.Java#getEFachada()
	 * @see #getJava()
	 * @generated
	 */
	EReference getJava_EFachada();

	/**
	 * Returns the meta object for the containment reference '{@link dependencies.Java#getECache <em>ECache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ECache</em>'.
	 * @see dependencies.Java#getECache()
	 * @see #getJava()
	 * @generated
	 */
	EReference getJava_ECache();

	/**
	 * Returns the meta object for class '{@link dependencies.AppAdapter <em>App Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Adapter</em>'.
	 * @see dependencies.AppAdapter
	 * @generated
	 */
	EClass getAppAdapter();

	/**
	 * Returns the meta object for the reference '{@link dependencies.AppAdapter#getEFachada <em>EFachada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EFachada</em>'.
	 * @see dependencies.AppAdapter#getEFachada()
	 * @see #getAppAdapter()
	 * @generated
	 */
	EReference getAppAdapter_EFachada();

	/**
	 * Returns the meta object for the containment reference '{@link dependencies.AppAdapter#getECache <em>ECache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ECache</em>'.
	 * @see dependencies.AppAdapter#getECache()
	 * @see #getAppAdapter()
	 * @generated
	 */
	EReference getAppAdapter_ECache();

	/**
	 * Returns the meta object for class '{@link dependencies.JSP <em>JSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSP</em>'.
	 * @see dependencies.JSP
	 * @generated
	 */
	EClass getJSP();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.JSP#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dependencies.JSP#getName()
	 * @see #getJSP()
	 * @generated
	 */
	EAttribute getJSP_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.JSP#getETableParameters <em>ETable Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ETable Parameters</em>'.
	 * @see dependencies.JSP#getETableParameters()
	 * @see #getJSP()
	 * @generated
	 */
	EReference getJSP_ETableParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.JSP#getERules <em>ERules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ERules</em>'.
	 * @see dependencies.JSP#getERules()
	 * @see #getJSP()
	 * @generated
	 */
	EReference getJSP_ERules();

	/**
	 * Returns the meta object for class '{@link dependencies.Siebel <em>Siebel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Siebel</em>'.
	 * @see dependencies.Siebel
	 * @generated
	 */
	EClass getSiebel();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Siebel#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see dependencies.Siebel#getState()
	 * @see #getSiebel()
	 * @generated
	 */
	EAttribute getSiebel_State();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Siebel#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server</em>'.
	 * @see dependencies.Siebel#getServer()
	 * @see #getSiebel()
	 * @generated
	 */
	EAttribute getSiebel_Server();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Siebel#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see dependencies.Siebel#getObject()
	 * @see #getSiebel()
	 * @generated
	 */
	EAttribute getSiebel_Object();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Siebel#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request</em>'.
	 * @see dependencies.Siebel#getRequest()
	 * @see #getSiebel()
	 * @generated
	 */
	EAttribute getSiebel_Request();

	/**
	 * Returns the meta object for class '{@link dependencies.Tp <em>Tp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tp</em>'.
	 * @see dependencies.Tp
	 * @generated
	 */
	EClass getTp();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Tp#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see dependencies.Tp#getState()
	 * @see #getTp()
	 * @generated
	 */
	EAttribute getTp_State();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Tp#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see dependencies.Tp#getCode()
	 * @see #getTp()
	 * @generated
	 */
	EAttribute getTp_Code();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Tp#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dependencies.Tp#getType()
	 * @see #getTp()
	 * @generated
	 */
	EAttribute getTp_Type();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Tp#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see dependencies.Tp#getSubtype()
	 * @see #getTp()
	 * @generated
	 */
	EAttribute getTp_Subtype();

	/**
	 * Returns the meta object for class '{@link dependencies.BBOO <em>BBOO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BBOO</em>'.
	 * @see dependencies.BBOO
	 * @generated
	 */
	EClass getBBOO();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.BBOO#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see dependencies.BBOO#getState()
	 * @see #getBBOO()
	 * @generated
	 */
	EAttribute getBBOO_State();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.BBOO#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see dependencies.BBOO#getAlias()
	 * @see #getBBOO()
	 * @generated
	 */
	EAttribute getBBOO_Alias();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.BBOO#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document</em>'.
	 * @see dependencies.BBOO#getDocument()
	 * @see #getBBOO()
	 * @generated
	 */
	EAttribute getBBOO_Document();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.BBOO#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see dependencies.BBOO#getProvider()
	 * @see #getBBOO()
	 * @generated
	 */
	EAttribute getBBOO_Provider();

	/**
	 * Returns the meta object for class '{@link dependencies.TableParameters <em>Table Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Parameters</em>'.
	 * @see dependencies.TableParameters
	 * @generated
	 */
	EClass getTableParameters();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TableParameters#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see dependencies.TableParameters#getTable()
	 * @see #getTableParameters()
	 * @generated
	 */
	EAttribute getTableParameters_Table();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TableParameters#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see dependencies.TableParameters#getColumns()
	 * @see #getTableParameters()
	 * @generated
	 */
	EAttribute getTableParameters_Columns();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TableParameters#getCacheado <em>Cacheado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cacheado</em>'.
	 * @see dependencies.TableParameters#getCacheado()
	 * @see #getTableParameters()
	 * @generated
	 */
	EAttribute getTableParameters_Cacheado();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.TableParameters#getEClientArcReferences <em>EClient Arc References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EClient Arc References</em>'.
	 * @see dependencies.TableParameters#getEClientArcReferences()
	 * @see #getTableParameters()
	 * @generated
	 */
	EReference getTableParameters_EClientArcReferences();

	/**
	 * Returns the meta object for class '{@link dependencies.SQLComponent <em>SQL Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Component</em>'.
	 * @see dependencies.SQLComponent
	 * @generated
	 */
	EClass getSQLComponent();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SQLComponent#getImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Type</em>'.
	 * @see dependencies.SQLComponent#getImplementationType()
	 * @see #getSQLComponent()
	 * @generated
	 */
	EAttribute getSQLComponent_ImplementationType();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SQLComponent#getDatasource <em>Datasource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datasource</em>'.
	 * @see dependencies.SQLComponent#getDatasource()
	 * @see #getSQLComponent()
	 * @generated
	 */
	EAttribute getSQLComponent_Datasource();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SQLComponent#getDataSourceAlias <em>Data Source Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source Alias</em>'.
	 * @see dependencies.SQLComponent#getDataSourceAlias()
	 * @see #getSQLComponent()
	 * @generated
	 */
	EAttribute getSQLComponent_DataSourceAlias();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SQLComponent#getMaxRows <em>Max Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Rows</em>'.
	 * @see dependencies.SQLComponent#getMaxRows()
	 * @see #getSQLComponent()
	 * @generated
	 */
	EAttribute getSQLComponent_MaxRows();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SQLComponent#getPageMaxSize <em>Page Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Max Size</em>'.
	 * @see dependencies.SQLComponent#getPageMaxSize()
	 * @see #getSQLComponent()
	 * @generated
	 */
	EAttribute getSQLComponent_PageMaxSize();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.SQLComponent#getESQLSentence <em>ESQL Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ESQL Sentence</em>'.
	 * @see dependencies.SQLComponent#getESQLSentence()
	 * @see #getSQLComponent()
	 * @generated
	 */
	EReference getSQLComponent_ESQLSentence();

	/**
	 * Returns the meta object for the containment reference '{@link dependencies.SQLComponent#getECache <em>ECache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ECache</em>'.
	 * @see dependencies.SQLComponent#getECache()
	 * @see #getSQLComponent()
	 * @generated
	 */
	EReference getSQLComponent_ECache();

	/**
	 * Returns the meta object for class '{@link dependencies.eFachada <em>eFachada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>eFachada</em>'.
	 * @see dependencies.eFachada
	 * @generated
	 */
	EClass geteFachada();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.eFachada#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dependencies.eFachada#getName()
	 * @see #geteFachada()
	 * @generated
	 */
	EAttribute geteFachada_Name();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.eFachada#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dependencies.eFachada#getType()
	 * @see #geteFachada()
	 * @generated
	 */
	EAttribute geteFachada_Type();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.eFachada#getSql <em>Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql</em>'.
	 * @see dependencies.eFachada#getSql()
	 * @see #geteFachada()
	 * @generated
	 */
	EAttribute geteFachada_Sql();

	/**
	 * Returns the meta object for the reference '{@link dependencies.eFachada#getEFachada <em>EFachada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EFachada</em>'.
	 * @see dependencies.eFachada#getEFachada()
	 * @see #geteFachada()
	 * @generated
	 */
	EReference geteFachada_EFachada();

	/**
	 * Returns the meta object for class '{@link dependencies.ClientArcReferences <em>Client Arc References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Arc References</em>'.
	 * @see dependencies.ClientArcReferences
	 * @generated
	 */
	EClass getClientArcReferences();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.ClientArcReferences#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see dependencies.ClientArcReferences#getSrc()
	 * @see #getClientArcReferences()
	 * @generated
	 */
	EAttribute getClientArcReferences_Src();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.ClientArcReferences#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see dependencies.ClientArcReferences#getReference()
	 * @see #getClientArcReferences()
	 * @generated
	 */
	EAttribute getClientArcReferences_Reference();

	/**
	 * Returns the meta object for class '{@link dependencies.LogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Level</em>'.
	 * @see dependencies.LogLevel
	 * @generated
	 */
	EClass getLogLevel();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.LogLevel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dependencies.LogLevel#getId()
	 * @see #getLogLevel()
	 * @generated
	 */
	EAttribute getLogLevel_Id();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.LogLevel#getPropagation <em>Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propagation</em>'.
	 * @see dependencies.LogLevel#getPropagation()
	 * @see #getLogLevel()
	 * @generated
	 */
	EAttribute getLogLevel_Propagation();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.LogLevel#getPropagationPriority <em>Propagation Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propagation Priority</em>'.
	 * @see dependencies.LogLevel#getPropagationPriority()
	 * @see #getLogLevel()
	 * @generated
	 */
	EAttribute getLogLevel_PropagationPriority();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.LogLevel#getLevelPriority <em>Level Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Priority</em>'.
	 * @see dependencies.LogLevel#getLevelPriority()
	 * @see #getLogLevel()
	 * @generated
	 */
	EAttribute getLogLevel_LevelPriority();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencies.LogLevel#getELevels <em>ELevels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ELevels</em>'.
	 * @see dependencies.LogLevel#getELevels()
	 * @see #getLogLevel()
	 * @generated
	 */
	EReference getLogLevel_ELevels();

	/**
	 * Returns the meta object for class '{@link dependencies.Rules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules</em>'.
	 * @see dependencies.Rules
	 * @generated
	 */
	EClass getRules();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Rules#getIdLit <em>Id Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Lit</em>'.
	 * @see dependencies.Rules#getIdLit()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_IdLit();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Rules#getLit <em>Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lit</em>'.
	 * @see dependencies.Rules#getLit()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Lit();

	/**
	 * Returns the meta object for class '{@link dependencies.TrxOPLogicalChannel <em>Trx OP Logical Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trx OP Logical Channel</em>'.
	 * @see dependencies.TrxOPLogicalChannel
	 * @generated
	 */
	EClass getTrxOPLogicalChannel();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TrxOPLogicalChannel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dependencies.TrxOPLogicalChannel#getName()
	 * @see #getTrxOPLogicalChannel()
	 * @generated
	 */
	EAttribute getTrxOPLogicalChannel_Name();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TrxOPLogicalChannel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dependencies.TrxOPLogicalChannel#getValue()
	 * @see #getTrxOPLogicalChannel()
	 * @generated
	 */
	EAttribute getTrxOPLogicalChannel_Value();

	/**
	 * Returns the meta object for class '{@link dependencies.TrxOPPhysicalChannel <em>Trx OP Physical Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trx OP Physical Channel</em>'.
	 * @see dependencies.TrxOPPhysicalChannel
	 * @generated
	 */
	EClass getTrxOPPhysicalChannel();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TrxOPPhysicalChannel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dependencies.TrxOPPhysicalChannel#getName()
	 * @see #getTrxOPPhysicalChannel()
	 * @generated
	 */
	EAttribute getTrxOPPhysicalChannel_Name();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.TrxOPPhysicalChannel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dependencies.TrxOPPhysicalChannel#getValue()
	 * @see #getTrxOPPhysicalChannel()
	 * @generated
	 */
	EAttribute getTrxOPPhysicalChannel_Value();

	/**
	 * Returns the meta object for class '{@link dependencies.SATLogicalChannel <em>SAT Logical Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAT Logical Channel</em>'.
	 * @see dependencies.SATLogicalChannel
	 * @generated
	 */
	EClass getSATLogicalChannel();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SATLogicalChannel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dependencies.SATLogicalChannel#getName()
	 * @see #getSATLogicalChannel()
	 * @generated
	 */
	EAttribute getSATLogicalChannel_Name();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SATLogicalChannel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dependencies.SATLogicalChannel#getValue()
	 * @see #getSATLogicalChannel()
	 * @generated
	 */
	EAttribute getSATLogicalChannel_Value();

	/**
	 * Returns the meta object for class '{@link dependencies.SATPhysicalChannel <em>SAT Physical Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAT Physical Channel</em>'.
	 * @see dependencies.SATPhysicalChannel
	 * @generated
	 */
	EClass getSATPhysicalChannel();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SATPhysicalChannel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dependencies.SATPhysicalChannel#getName()
	 * @see #getSATPhysicalChannel()
	 * @generated
	 */
	EAttribute getSATPhysicalChannel_Name();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.SATPhysicalChannel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dependencies.SATPhysicalChannel#getValue()
	 * @see #getSATPhysicalChannel()
	 * @generated
	 */
	EAttribute getSATPhysicalChannel_Value();

	/**
	 * Returns the meta object for class '{@link dependencies.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see dependencies.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Cache#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see dependencies.Cache#getPackage()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Package();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Cache#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dependencies.Cache#getName()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Name();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Cache#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see dependencies.Cache#getAlias()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Alias();

	/**
	 * Returns the meta object for class '{@link dependencies.Levels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Levels</em>'.
	 * @see dependencies.Levels
	 * @generated
	 */
	EClass getLevels();

	/**
	 * Returns the meta object for the attribute '{@link dependencies.Levels#getNameLevel <em>Name Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Level</em>'.
	 * @see dependencies.Levels#getNameLevel()
	 * @see #getLevels()
	 * @generated
	 */
	EAttribute getLevels_NameLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DependenciesFactory getDependenciesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dependencies.impl.HOSTImpl <em>HOST</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.HOSTImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getHOST()
		 * @generated
		 */
		EClass HOST = eINSTANCE.getHOST();

		/**
		 * The meta object literal for the '<em><b>Sat Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__SAT_PROTOCOL = eINSTANCE.getHOST_SatProtocol();

		/**
		 * The meta object literal for the '<em><b>Sat Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__SAT_ALIAS = eINSTANCE.getHOST_SatAlias();

		/**
		 * The meta object literal for the '<em><b>Sat Time Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__SAT_TIME_OUT = eINSTANCE.getHOST_SatTimeOut();

		/**
		 * The meta object literal for the '<em><b>Sat Null Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__SAT_NULL_VALUES = eINSTANCE.getHOST_SatNullValues();

		/**
		 * The meta object literal for the '<em><b>Sat Null When Spaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__SAT_NULL_WHEN_SPACES = eINSTANCE.getHOST_SatNullWhenSpaces();

		/**
		 * The meta object literal for the '<em><b>Trx OP Default Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__TRX_OP_DEFAULT_MODE = eINSTANCE.getHOST_TrxOPDefaultMode();

		/**
		 * The meta object literal for the '<em><b>Trx OPTCP Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__TRX_OPTCP_ALIAS = eINSTANCE.getHOST_TrxOPTCPAlias();

		/**
		 * The meta object literal for the '<em><b>Altair Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__ALTAIR_PROTOCOL = eINSTANCE.getHOST_AltairProtocol();

		/**
		 * The meta object literal for the '<em><b>Altair Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__ALTAIR_ALIAS = eINSTANCE.getHOST_AltairAlias();

		/**
		 * The meta object literal for the '<em><b>Red Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__RED_PROTOCOL = eINSTANCE.getHOST_RedProtocol();

		/**
		 * The meta object literal for the '<em><b>Trxprotocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__TRXPROTOCOL = eINSTANCE.getHOST_Trxprotocol();

		/**
		 * The meta object literal for the '<em><b>EOP Logical Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST__EOP_LOGICAL_CHANNEL = eINSTANCE.getHOST_EOPLogicalChannel();

		/**
		 * The meta object literal for the '<em><b>EPhysical Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST__EPHYSICAL_CHANNEL = eINSTANCE.getHOST_EPhysicalChannel();

		/**
		 * The meta object literal for the '<em><b>ESAT Logical Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST__ESAT_LOGICAL_CHANNEL = eINSTANCE.getHOST_ESATLogicalChannel();

		/**
		 * The meta object literal for the '<em><b>ESAT Physical Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST__ESAT_PHYSICAL_CHANNEL = eINSTANCE.getHOST_ESATPhysicalChannel();

		/**
		 * The meta object literal for the '{@link dependencies.impl.OPImpl <em>OP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.OPImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getOP()
		 * @generated
		 */
		EClass OP = eINSTANCE.getOP();

		/**
		 * The meta object literal for the '<em><b>Estado Llamada OP</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP__ESTADO_LLAMADA_OP = eINSTANCE.getOP_EstadoLlamadaOP();

		/**
		 * The meta object literal for the '<em><b>ERJSP</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP__ERJSP = eINSTANCE.getOP_ERJSP();

		/**
		 * The meta object literal for the '<em><b>Lp Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP__LP_NAME = eINSTANCE.getOP_LpName();

		/**
		 * The meta object literal for the '<em><b>Op Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP__OP_NAME = eINSTANCE.getOP_OpName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP__VERSION = eINSTANCE.getOP_Version();

		/**
		 * The meta object literal for the '<em><b>EWeb Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP__EWEB_SERVICE = eINSTANCE.getOP_EWebService();

		/**
		 * The meta object literal for the '<em><b>EOI</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP__EOI = eINSTANCE.getOP_EOI();

		/**
		 * The meta object literal for the '<em><b>EFachada</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP__EFACHADA = eINSTANCE.getOP_EFachada();

		/**
		 * The meta object literal for the '{@link dependencies.impl.OIImpl <em>OI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.OIImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getOI()
		 * @generated
		 */
		EClass OI = eINSTANCE.getOI();

		/**
		 * The meta object literal for the '<em><b>Estado Llamada OI</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OI__ESTADO_LLAMADA_OI = eINSTANCE.getOI_EstadoLlamadaOI();

		/**
		 * The meta object literal for the '<em><b>ER App Adapter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OI__ER_APP_ADAPTER = eINSTANCE.getOI_ERAppAdapter();

		/**
		 * The meta object literal for the '<em><b>Ln Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OI__LN_NAME = eINSTANCE.getOI_LnName();

		/**
		 * The meta object literal for the '<em><b>Oi Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OI__OI_NAME = eINSTANCE.getOI_OiName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OI__VERSION = eINSTANCE.getOI_Version();

		/**
		 * The meta object literal for the '<em><b>EReference1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OI__EREFERENCE1 = eINSTANCE.getOI_EReference1();

		/**
		 * The meta object literal for the '<em><b>ETp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OI__ETP = eINSTANCE.getOI_ETp();

		/**
		 * The meta object literal for the '<em><b>EBBOO</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OI__EBBOO = eINSTANCE.getOI_EBBOO();

		/**
		 * The meta object literal for the '<em><b>ESiebel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OI__ESIEBEL = eINSTANCE.getOI_ESiebel();

		/**
		 * The meta object literal for the '<em><b>ESQL Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OI__ESQL_COMPONENT = eINSTANCE.getOI_ESQLComponent();

		/**
		 * The meta object literal for the '<em><b>EJava</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OI__EJAVA = eINSTANCE.getOI_EJava();

		/**
		 * The meta object literal for the '<em><b>EAltair</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OI__EALTAIR = eINSTANCE.getOI_EAltair();

		/**
		 * The meta object literal for the '<em><b>ETrx OP</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OI__ETRX_OP = eINSTANCE.getOI_ETrxOP();

		/**
		 * The meta object literal for the '<em><b>ESAT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OI__ESAT = eINSTANCE.getOI_ESAT();

		/**
		 * The meta object literal for the '<em><b>EFachada</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OI__EFACHADA = eINSTANCE.getOI_EFachada();

		/**
		 * The meta object literal for the '{@link dependencies.impl.FachadaImpl <em>Fachada</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.FachadaImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getFachada()
		 * @generated
		 */
		EClass FACHADA = eINSTANCE.getFachada();

		/**
		 * The meta object literal for the '<em><b>Facade Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACHADA__FACADE_NAME = eINSTANCE.getFachada_FacadeName();

		/**
		 * The meta object literal for the '<em><b>Interfaz Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACHADA__INTERFAZ_NAME = eINSTANCE.getFachada_InterfazName();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACHADA__METHOD_NAME = eINSTANCE.getFachada_MethodName();

		/**
		 * The meta object literal for the '{@link dependencies.impl.TrxOPImpl <em>Trx OP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.TrxOPImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getTrxOP()
		 * @generated
		 */
		EClass TRX_OP = eINSTANCE.getTrxOP();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRX_OP__STATE = eINSTANCE.getTrxOP_State();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRX_OP__TRANSACTION = eINSTANCE.getTrxOP_Transaction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRX_OP__OPERATION = eINSTANCE.getTrxOP_Operation();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRX_OP__VERSION = eINSTANCE.getTrxOP_Version();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRX_OP__ALIAS = eINSTANCE.getTrxOP_Alias();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRX_OP__PROTOCOL = eINSTANCE.getTrxOP_Protocol();

		/**
		 * The meta object literal for the '<em><b>Transaction Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRX_OP__TRANSACTION_MODE = eINSTANCE.getTrxOP_TransactionMode();

		/**
		 * The meta object literal for the '{@link dependencies.impl.SATImpl <em>SAT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.SATImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getSAT()
		 * @generated
		 */
		EClass SAT = eINSTANCE.getSAT();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAT__STATE = eINSTANCE.getSAT_State();

		/**
		 * The meta object literal for the '<em><b>Sat Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAT__SAT_NAME = eINSTANCE.getSAT_SatName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAT__VERSION = eINSTANCE.getSAT_Version();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAT__ALIAS = eINSTANCE.getSAT_Alias();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAT__MODE = eINSTANCE.getSAT_Mode();

		/**
		 * The meta object literal for the '{@link dependencies.impl.AltairImpl <em>Altair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.AltairImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getAltair()
		 * @generated
		 */
		EClass ALTAIR = eINSTANCE.getAltair();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTAIR__STATE = eINSTANCE.getAltair_State();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTAIR__TRANSACTION = eINSTANCE.getAltair_Transaction();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTAIR__VERSION = eINSTANCE.getAltair_Version();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTAIR__ALIAS = eINSTANCE.getAltair_Alias();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTAIR__MODE = eINSTANCE.getAltair_Mode();

		/**
		 * The meta object literal for the '{@link dependencies.impl.WebserviceImpl <em>Webservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.WebserviceImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getWebservice()
		 * @generated
		 */
		EClass WEBSERVICE = eINSTANCE.getWebservice();

		/**
		 * The meta object literal for the '<em><b>Associated Logics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSERVICE__ASSOCIATED_LOGICS = eINSTANCE.getWebservice_AssociatedLogics();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSERVICE__STATE = eINSTANCE.getWebservice_State();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSERVICE__ALIAS = eINSTANCE.getWebservice_Alias();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSERVICE__TRANSPORT = eINSTANCE.getWebservice_Transport();

		/**
		 * The meta object literal for the '<em><b>Synchrony</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSERVICE__SYNCHRONY = eINSTANCE.getWebservice_Synchrony();

		/**
		 * The meta object literal for the '<em><b>Wsdl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSERVICE__WSDL = eINSTANCE.getWebservice_Wsdl();

		/**
		 * The meta object literal for the '<em><b>Ws Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSERVICE__WS_OP = eINSTANCE.getWebservice_WsOp();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSERVICE__NAMESPACE = eINSTANCE.getWebservice_Namespace();

		/**
		 * The meta object literal for the '{@link dependencies.impl.ChannelAdapterImpl <em>Channel Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.ChannelAdapterImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getChannelAdapter()
		 * @generated
		 */
		EClass CHANNEL_ADAPTER = eINSTANCE.getChannelAdapter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_ADAPTER__NAME = eINSTANCE.getChannelAdapter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_ADAPTER__TYPE = eINSTANCE.getChannelAdapter_Type();

		/**
		 * The meta object literal for the '<em><b>Facade Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_ADAPTER__FACADE_NAME = eINSTANCE.getChannelAdapter_FacadeName();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_ADAPTER__INTERFACE_NAME = eINSTANCE.getChannelAdapter_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_ADAPTER__ALIAS = eINSTANCE.getChannelAdapter_Alias();

		/**
		 * The meta object literal for the '{@link dependencies.impl.JMSImpl <em>JMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.JMSImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getJMS()
		 * @generated
		 */
		EClass JMS = eINSTANCE.getJMS();

		/**
		 * The meta object literal for the '<em><b>Listener Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMS__LISTENER_PORTS = eINSTANCE.getJMS_ListenerPorts();

		/**
		 * The meta object literal for the '<em><b>Jms Modules</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMS__JMS_MODULES = eINSTANCE.getJMS_JmsModules();

		/**
		 * The meta object literal for the '{@link dependencies.impl.EnsambladoImpl <em>Ensamblado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.EnsambladoImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getEnsamblado()
		 * @generated
		 */
		EClass ENSAMBLADO = eINSTANCE.getEnsamblado();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSAMBLADO__NAME = eINSTANCE.getEnsamblado_Name();

		/**
		 * The meta object literal for the '<em><b>ELog Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSAMBLADO__ELOG_LEVEL = eINSTANCE.getEnsamblado_ELogLevel();

		/**
		 * The meta object literal for the '<em><b>EMulti Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSAMBLADO__EMULTI_PROFILE = eINSTANCE.getEnsamblado_EMultiProfile();

		/**
		 * The meta object literal for the '<em><b>EHOST</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSAMBLADO__EHOST = eINSTANCE.getEnsamblado_EHOST();

		/**
		 * The meta object literal for the '<em><b>EJMS</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSAMBLADO__EJMS = eINSTANCE.getEnsamblado_EJMS();

		/**
		 * The meta object literal for the '<em><b>EChannel Adapter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSAMBLADO__ECHANNEL_ADAPTER = eINSTANCE.getEnsamblado_EChannelAdapter();

		/**
		 * The meta object literal for the '<em><b>EEnsamblado</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSAMBLADO__EENSAMBLADO = eINSTANCE.getEnsamblado_EEnsamblado();

		/**
		 * The meta object literal for the '<em><b>EOP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSAMBLADO__EOP = eINSTANCE.getEnsamblado_EOP();

		/**
		 * The meta object literal for the '{@link dependencies.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.SecurityImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '<em><b>Autentication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY__AUTENTICATION = eINSTANCE.getSecurity_Autentication();

		/**
		 * The meta object literal for the '<em><b>Usu Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY__USU_NOTES = eINSTANCE.getSecurity_UsuNotes();

		/**
		 * The meta object literal for the '<em><b>Entity Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY__ENTITY_ALIAS = eINSTANCE.getSecurity_EntityAlias();

		/**
		 * The meta object literal for the '<em><b>Code Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY__CODE_PASSWORD = eINSTANCE.getSecurity_CodePassword();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY__MULTI = eINSTANCE.getSecurity_Multi();

		/**
		 * The meta object literal for the '{@link dependencies.impl.MultiProfileImpl <em>Multi Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.MultiProfileImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getMultiProfile()
		 * @generated
		 */
		EClass MULTI_PROFILE = eINSTANCE.getMultiProfile();

		/**
		 * The meta object literal for the '<em><b>Cat Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PROFILE__CAT_COMPANY = eINSTANCE.getMultiProfile_CatCompany();

		/**
		 * The meta object literal for the '<em><b>Cat Canal Marco</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PROFILE__CAT_CANAL_MARCO = eINSTANCE.getMultiProfile_CatCanalMarco();

		/**
		 * The meta object literal for the '<em><b>Cat Gama</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PROFILE__CAT_GAMA = eINSTANCE.getMultiProfile_CatGama();

		/**
		 * The meta object literal for the '<em><b>Cat Idioma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PROFILE__CAT_IDIOMA = eINSTANCE.getMultiProfile_CatIdioma();

		/**
		 * The meta object literal for the '<em><b>Cat Estructura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PROFILE__CAT_ESTRUCTURA = eINSTANCE.getMultiProfile_CatEstructura();

		/**
		 * The meta object literal for the '<em><b>Cat Nivel IU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PROFILE__CAT_NIVEL_IU = eINSTANCE.getMultiProfile_CatNivelIU();

		/**
		 * The meta object literal for the '<em><b>Cat Empresa Asociada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PROFILE__CAT_EMPRESA_ASOCIADA = eINSTANCE.getMultiProfile_CatEmpresaAsociada();

		/**
		 * The meta object literal for the '<em><b>Cat Render</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PROFILE__CAT_RENDER = eINSTANCE.getMultiProfile_CatRender();

		/**
		 * The meta object literal for the '<em><b>Cat Orden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PROFILE__CAT_ORDEN = eINSTANCE.getMultiProfile_CatOrden();

		/**
		 * The meta object literal for the '{@link dependencies.impl.JavaImpl <em>Java</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.JavaImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getJava()
		 * @generated
		 */
		EClass JAVA = eINSTANCE.getJava();

		/**
		 * The meta object literal for the '<em><b>EFachada</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA__EFACHADA = eINSTANCE.getJava_EFachada();

		/**
		 * The meta object literal for the '<em><b>ECache</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA__ECACHE = eINSTANCE.getJava_ECache();

		/**
		 * The meta object literal for the '{@link dependencies.impl.AppAdapterImpl <em>App Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.AppAdapterImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getAppAdapter()
		 * @generated
		 */
		EClass APP_ADAPTER = eINSTANCE.getAppAdapter();

		/**
		 * The meta object literal for the '<em><b>EFachada</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ADAPTER__EFACHADA = eINSTANCE.getAppAdapter_EFachada();

		/**
		 * The meta object literal for the '<em><b>ECache</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ADAPTER__ECACHE = eINSTANCE.getAppAdapter_ECache();

		/**
		 * The meta object literal for the '{@link dependencies.impl.JSPImpl <em>JSP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.JSPImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getJSP()
		 * @generated
		 */
		EClass JSP = eINSTANCE.getJSP();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSP__NAME = eINSTANCE.getJSP_Name();

		/**
		 * The meta object literal for the '<em><b>ETable Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSP__ETABLE_PARAMETERS = eINSTANCE.getJSP_ETableParameters();

		/**
		 * The meta object literal for the '<em><b>ERules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSP__ERULES = eINSTANCE.getJSP_ERules();

		/**
		 * The meta object literal for the '{@link dependencies.impl.SiebelImpl <em>Siebel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.SiebelImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getSiebel()
		 * @generated
		 */
		EClass SIEBEL = eINSTANCE.getSiebel();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIEBEL__STATE = eINSTANCE.getSiebel_State();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIEBEL__SERVER = eINSTANCE.getSiebel_Server();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIEBEL__OBJECT = eINSTANCE.getSiebel_Object();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIEBEL__REQUEST = eINSTANCE.getSiebel_Request();

		/**
		 * The meta object literal for the '{@link dependencies.impl.TpImpl <em>Tp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.TpImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getTp()
		 * @generated
		 */
		EClass TP = eINSTANCE.getTp();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TP__STATE = eINSTANCE.getTp_State();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TP__CODE = eINSTANCE.getTp_Code();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TP__TYPE = eINSTANCE.getTp_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TP__SUBTYPE = eINSTANCE.getTp_Subtype();

		/**
		 * The meta object literal for the '{@link dependencies.impl.BBOOImpl <em>BBOO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.BBOOImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getBBOO()
		 * @generated
		 */
		EClass BBOO = eINSTANCE.getBBOO();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BBOO__STATE = eINSTANCE.getBBOO_State();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BBOO__ALIAS = eINSTANCE.getBBOO_Alias();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BBOO__DOCUMENT = eINSTANCE.getBBOO_Document();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BBOO__PROVIDER = eINSTANCE.getBBOO_Provider();

		/**
		 * The meta object literal for the '{@link dependencies.impl.TableParametersImpl <em>Table Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.TableParametersImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getTableParameters()
		 * @generated
		 */
		EClass TABLE_PARAMETERS = eINSTANCE.getTableParameters();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PARAMETERS__TABLE = eINSTANCE.getTableParameters_Table();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PARAMETERS__COLUMNS = eINSTANCE.getTableParameters_Columns();

		/**
		 * The meta object literal for the '<em><b>Cacheado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PARAMETERS__CACHEADO = eINSTANCE.getTableParameters_Cacheado();

		/**
		 * The meta object literal for the '<em><b>EClient Arc References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_PARAMETERS__ECLIENT_ARC_REFERENCES = eINSTANCE.getTableParameters_EClientArcReferences();

		/**
		 * The meta object literal for the '{@link dependencies.impl.SQLComponentImpl <em>SQL Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.SQLComponentImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getSQLComponent()
		 * @generated
		 */
		EClass SQL_COMPONENT = eINSTANCE.getSQLComponent();

		/**
		 * The meta object literal for the '<em><b>Implementation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_COMPONENT__IMPLEMENTATION_TYPE = eINSTANCE.getSQLComponent_ImplementationType();

		/**
		 * The meta object literal for the '<em><b>Datasource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_COMPONENT__DATASOURCE = eINSTANCE.getSQLComponent_Datasource();

		/**
		 * The meta object literal for the '<em><b>Data Source Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_COMPONENT__DATA_SOURCE_ALIAS = eINSTANCE.getSQLComponent_DataSourceAlias();

		/**
		 * The meta object literal for the '<em><b>Max Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_COMPONENT__MAX_ROWS = eINSTANCE.getSQLComponent_MaxRows();

		/**
		 * The meta object literal for the '<em><b>Page Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_COMPONENT__PAGE_MAX_SIZE = eINSTANCE.getSQLComponent_PageMaxSize();

		/**
		 * The meta object literal for the '<em><b>ESQL Sentence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_COMPONENT__ESQL_SENTENCE = eINSTANCE.getSQLComponent_ESQLSentence();

		/**
		 * The meta object literal for the '<em><b>ECache</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_COMPONENT__ECACHE = eINSTANCE.getSQLComponent_ECache();

		/**
		 * The meta object literal for the '{@link dependencies.impl.eFachadaImpl <em>eFachada</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.eFachadaImpl
		 * @see dependencies.impl.DependenciesPackageImpl#geteFachada()
		 * @generated
		 */
		EClass EFACHADA = eINSTANCE.geteFachada();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFACHADA__NAME = eINSTANCE.geteFachada_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFACHADA__TYPE = eINSTANCE.geteFachada_Type();

		/**
		 * The meta object literal for the '<em><b>Sql</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFACHADA__SQL = eINSTANCE.geteFachada_Sql();

		/**
		 * The meta object literal for the '<em><b>EFachada</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFACHADA__EFACHADA = eINSTANCE.geteFachada_EFachada();

		/**
		 * The meta object literal for the '{@link dependencies.impl.ClientArcReferencesImpl <em>Client Arc References</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.ClientArcReferencesImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getClientArcReferences()
		 * @generated
		 */
		EClass CLIENT_ARC_REFERENCES = eINSTANCE.getClientArcReferences();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_ARC_REFERENCES__SRC = eINSTANCE.getClientArcReferences_Src();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_ARC_REFERENCES__REFERENCE = eINSTANCE.getClientArcReferences_Reference();

		/**
		 * The meta object literal for the '{@link dependencies.impl.LogLevelImpl <em>Log Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.LogLevelImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getLogLevel()
		 * @generated
		 */
		EClass LOG_LEVEL = eINSTANCE.getLogLevel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_LEVEL__ID = eINSTANCE.getLogLevel_Id();

		/**
		 * The meta object literal for the '<em><b>Propagation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_LEVEL__PROPAGATION = eINSTANCE.getLogLevel_Propagation();

		/**
		 * The meta object literal for the '<em><b>Propagation Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_LEVEL__PROPAGATION_PRIORITY = eINSTANCE.getLogLevel_PropagationPriority();

		/**
		 * The meta object literal for the '<em><b>Level Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_LEVEL__LEVEL_PRIORITY = eINSTANCE.getLogLevel_LevelPriority();

		/**
		 * The meta object literal for the '<em><b>ELevels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_LEVEL__ELEVELS = eINSTANCE.getLogLevel_ELevels();

		/**
		 * The meta object literal for the '{@link dependencies.impl.RulesImpl <em>Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.RulesImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getRules()
		 * @generated
		 */
		EClass RULES = eINSTANCE.getRules();

		/**
		 * The meta object literal for the '<em><b>Id Lit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__ID_LIT = eINSTANCE.getRules_IdLit();

		/**
		 * The meta object literal for the '<em><b>Lit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__LIT = eINSTANCE.getRules_Lit();

		/**
		 * The meta object literal for the '{@link dependencies.impl.TrxOPLogicalChannelImpl <em>Trx OP Logical Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.TrxOPLogicalChannelImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getTrxOPLogicalChannel()
		 * @generated
		 */
		EClass TRX_OP_LOGICAL_CHANNEL = eINSTANCE.getTrxOPLogicalChannel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRX_OP_LOGICAL_CHANNEL__NAME = eINSTANCE.getTrxOPLogicalChannel_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRX_OP_LOGICAL_CHANNEL__VALUE = eINSTANCE.getTrxOPLogicalChannel_Value();

		/**
		 * The meta object literal for the '{@link dependencies.impl.TrxOPPhysicalChannelImpl <em>Trx OP Physical Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.TrxOPPhysicalChannelImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getTrxOPPhysicalChannel()
		 * @generated
		 */
		EClass TRX_OP_PHYSICAL_CHANNEL = eINSTANCE.getTrxOPPhysicalChannel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRX_OP_PHYSICAL_CHANNEL__NAME = eINSTANCE.getTrxOPPhysicalChannel_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRX_OP_PHYSICAL_CHANNEL__VALUE = eINSTANCE.getTrxOPPhysicalChannel_Value();

		/**
		 * The meta object literal for the '{@link dependencies.impl.SATLogicalChannelImpl <em>SAT Logical Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.SATLogicalChannelImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getSATLogicalChannel()
		 * @generated
		 */
		EClass SAT_LOGICAL_CHANNEL = eINSTANCE.getSATLogicalChannel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAT_LOGICAL_CHANNEL__NAME = eINSTANCE.getSATLogicalChannel_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAT_LOGICAL_CHANNEL__VALUE = eINSTANCE.getSATLogicalChannel_Value();

		/**
		 * The meta object literal for the '{@link dependencies.impl.SATPhysicalChannelImpl <em>SAT Physical Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.SATPhysicalChannelImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getSATPhysicalChannel()
		 * @generated
		 */
		EClass SAT_PHYSICAL_CHANNEL = eINSTANCE.getSATPhysicalChannel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAT_PHYSICAL_CHANNEL__NAME = eINSTANCE.getSATPhysicalChannel_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAT_PHYSICAL_CHANNEL__VALUE = eINSTANCE.getSATPhysicalChannel_Value();

		/**
		 * The meta object literal for the '{@link dependencies.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.CacheImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getCache()
		 * @generated
		 */
		EClass CACHE = eINSTANCE.getCache();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__PACKAGE = eINSTANCE.getCache_Package();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__NAME = eINSTANCE.getCache_Name();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__ALIAS = eINSTANCE.getCache_Alias();

		/**
		 * The meta object literal for the '{@link dependencies.impl.LevelsImpl <em>Levels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencies.impl.LevelsImpl
		 * @see dependencies.impl.DependenciesPackageImpl#getLevels()
		 * @generated
		 */
		EClass LEVELS = eINSTANCE.getLevels();

		/**
		 * The meta object literal for the '<em><b>Name Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVELS__NAME_LEVEL = eINSTANCE.getLevels_NameLevel();

	}

} //DependenciesPackage
