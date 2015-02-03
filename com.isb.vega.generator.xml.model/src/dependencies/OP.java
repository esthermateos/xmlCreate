/**
 */
package dependencies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.OP#getEstadoLlamadaOP <em>Estado Llamada OP</em>}</li>
 *   <li>{@link dependencies.OP#getERJSP <em>ERJSP</em>}</li>
 *   <li>{@link dependencies.OP#getLpName <em>Lp Name</em>}</li>
 *   <li>{@link dependencies.OP#getOpName <em>Op Name</em>}</li>
 *   <li>{@link dependencies.OP#getVersion <em>Version</em>}</li>
 *   <li>{@link dependencies.OP#getEWebService <em>EWeb Service</em>}</li>
 *   <li>{@link dependencies.OP#getEOI <em>EOI</em>}</li>
 *   <li>{@link dependencies.OP#getEFachada <em>EFachada</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getOP()
 * @model
 * @generated
 */
public interface OP extends EObject {
	/**
	 * Returns the value of the '<em><b>Estado Llamada OP</b></em>' reference list.
	 * The list contents are of type {@link dependencies.OP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado Llamada OP</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado Llamada OP</em>' reference list.
	 * @see dependencies.DependenciesPackage#getOP_EstadoLlamadaOP()
	 * @model
	 * @generated
	 */
	EList<OP> getEstadoLlamadaOP();

	/**
	 * Returns the value of the '<em><b>ERJSP</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.JSP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERJSP</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERJSP</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getOP_ERJSP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<JSP> getERJSP();

	/**
	 * Returns the value of the '<em><b>Lp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Name</em>' attribute.
	 * @see #setLpName(String)
	 * @see dependencies.DependenciesPackage#getOP_LpName()
	 * @model
	 * @generated
	 */
	String getLpName();

	/**
	 * Sets the value of the '{@link dependencies.OP#getLpName <em>Lp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Name</em>' attribute.
	 * @see #getLpName()
	 * @generated
	 */
	void setLpName(String value);

	/**
	 * Returns the value of the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Name</em>' attribute.
	 * @see #setOpName(String)
	 * @see dependencies.DependenciesPackage#getOP_OpName()
	 * @model
	 * @generated
	 */
	String getOpName();

	/**
	 * Sets the value of the '{@link dependencies.OP#getOpName <em>Op Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Name</em>' attribute.
	 * @see #getOpName()
	 * @generated
	 */
	void setOpName(String value);

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
	 * @see dependencies.DependenciesPackage#getOP_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link dependencies.OP#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>EWeb Service</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.Webservice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EWeb Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EWeb Service</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getOP_EWebService()
	 * @model containment="true"
	 * @generated
	 */
	EList<Webservice> getEWebService();

	/**
	 * Returns the value of the '<em><b>EOI</b></em>' reference list.
	 * The list contents are of type {@link dependencies.OI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOI</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOI</em>' reference list.
	 * @see dependencies.DependenciesPackage#getOP_EOI()
	 * @model
	 * @generated
	 */
	EList<OI> getEOI();

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
	 * @see dependencies.DependenciesPackage#getOP_EFachada()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fachada> getEFachada();

} // OP
