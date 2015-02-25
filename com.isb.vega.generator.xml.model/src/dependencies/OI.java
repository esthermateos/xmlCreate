/**
 */
package dependencies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.OI#getEstadoLlamadaOI <em>Estado Llamada OI</em>}</li>
 *   <li>{@link dependencies.OI#getLnName <em>Ln Name</em>}</li>
 *   <li>{@link dependencies.OI#getOiName <em>Oi Name</em>}</li>
 *   <li>{@link dependencies.OI#getVersion <em>Version</em>}</li>
 *   <li>{@link dependencies.OI#getETp <em>ETp</em>}</li>
 *   <li>{@link dependencies.OI#getEBBOO <em>EBBOO</em>}</li>
 *   <li>{@link dependencies.OI#getESiebel <em>ESiebel</em>}</li>
 *   <li>{@link dependencies.OI#getEComponentSQL <em>EComponent SQL</em>}</li>
 *   <li>{@link dependencies.OI#getEAltair <em>EAltair</em>}</li>
 *   <li>{@link dependencies.OI#getETrxOP <em>ETrx OP</em>}</li>
 *   <li>{@link dependencies.OI#getESAT <em>ESAT</em>}</li>
 *   <li>{@link dependencies.OI#getEFachada <em>EFachada</em>}</li>
 *   <li>{@link dependencies.OI#getEWebService <em>EWeb Service</em>}</li>
 *   <li>{@link dependencies.OI#getEJava <em>EJava</em>}</li>
 *   <li>{@link dependencies.OI#getEAppAdapter <em>EApp Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getOI()
 * @model
 * @generated
 */
public interface OI extends EObject {
	/**
	 * Returns the value of the '<em><b>Estado Llamada OI</b></em>' reference list.
	 * The list contents are of type {@link dependencies.OI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado Llamada OI</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado Llamada OI</em>' reference list.
	 * @see dependencies.DependenciesPackage#getOI_EstadoLlamadaOI()
	 * @model
	 * @generated
	 */
	EList<OI> getEstadoLlamadaOI();

	/**
	 * Returns the value of the '<em><b>Ln Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ln Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ln Name</em>' attribute.
	 * @see #setLnName(String)
	 * @see dependencies.DependenciesPackage#getOI_LnName()
	 * @model
	 * @generated
	 */
	String getLnName();

	/**
	 * Sets the value of the '{@link dependencies.OI#getLnName <em>Ln Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ln Name</em>' attribute.
	 * @see #getLnName()
	 * @generated
	 */
	void setLnName(String value);

	/**
	 * Returns the value of the '<em><b>Oi Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oi Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oi Name</em>' attribute.
	 * @see #setOiName(String)
	 * @see dependencies.DependenciesPackage#getOI_OiName()
	 * @model
	 * @generated
	 */
	String getOiName();

	/**
	 * Sets the value of the '{@link dependencies.OI#getOiName <em>Oi Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oi Name</em>' attribute.
	 * @see #getOiName()
	 * @generated
	 */
	void setOiName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see dependencies.DependenciesPackage#getOI_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link dependencies.OI#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>ETp</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.Tp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ETp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETp</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getOI_ETp()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tp> getETp();

	/**
	 * Returns the value of the '<em><b>EBBOO</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.BBOO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EBBOO</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EBBOO</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getOI_EBBOO()
	 * @model containment="true"
	 * @generated
	 */
	EList<BBOO> getEBBOO();

	/**
	 * Returns the value of the '<em><b>ESiebel</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.Siebel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESiebel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESiebel</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getOI_ESiebel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Siebel> getESiebel();

	/**
	 * Returns the value of the '<em><b>EComponent SQL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EComponent SQL</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EComponent SQL</em>' containment reference.
	 * @see #setEComponentSQL(ComponentSQL)
	 * @see dependencies.DependenciesPackage#getOI_EComponentSQL()
	 * @model containment="true"
	 * @generated
	 */
	ComponentSQL getEComponentSQL();

	/**
	 * Sets the value of the '{@link dependencies.OI#getEComponentSQL <em>EComponent SQL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EComponent SQL</em>' containment reference.
	 * @see #getEComponentSQL()
	 * @generated
	 */
	void setEComponentSQL(ComponentSQL value);

	/**
	 * Returns the value of the '<em><b>EAltair</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.Altair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAltair</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAltair</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getOI_EAltair()
	 * @model containment="true"
	 * @generated
	 */
	EList<Altair> getEAltair();

	/**
	 * Returns the value of the '<em><b>ETrx OP</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.TrxOP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ETrx OP</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETrx OP</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getOI_ETrxOP()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrxOP> getETrxOP();

	/**
	 * Returns the value of the '<em><b>ESAT</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.SAT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESAT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESAT</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getOI_ESAT()
	 * @model containment="true"
	 * @generated
	 */
	EList<SAT> getESAT();

	/**
	 * Returns the value of the '<em><b>EFachada</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.Fachada}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFachada</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFachada</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getOI_EFachada()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fachada> getEFachada();

	/**
	 * Returns the value of the '<em><b>EWeb Service</b></em>' reference list.
	 * The list contents are of type {@link dependencies.Webservice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EWeb Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EWeb Service</em>' reference list.
	 * @see dependencies.DependenciesPackage#getOI_EWebService()
	 * @model
	 * @generated
	 */
	EList<Webservice> getEWebService();

	/**
	 * Returns the value of the '<em><b>EJava</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EJava</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EJava</em>' containment reference.
	 * @see #setEJava(Java)
	 * @see dependencies.DependenciesPackage#getOI_EJava()
	 * @model containment="true"
	 * @generated
	 */
	Java getEJava();

	/**
	 * Sets the value of the '{@link dependencies.OI#getEJava <em>EJava</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EJava</em>' containment reference.
	 * @see #getEJava()
	 * @generated
	 */
	void setEJava(Java value);

	/**
	 * Returns the value of the '<em><b>EApp Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EApp Adapter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EApp Adapter</em>' containment reference.
	 * @see #setEAppAdapter(AppAdapter)
	 * @see dependencies.DependenciesPackage#getOI_EAppAdapter()
	 * @model containment="true"
	 * @generated
	 */
	AppAdapter getEAppAdapter();

	/**
	 * Sets the value of the '{@link dependencies.OI#getEAppAdapter <em>EApp Adapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EApp Adapter</em>' containment reference.
	 * @see #getEAppAdapter()
	 * @generated
	 */
	void setEAppAdapter(AppAdapter value);

} // OI
