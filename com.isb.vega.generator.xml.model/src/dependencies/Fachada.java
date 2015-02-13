/**
 */
package dependencies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fachada</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.Fachada#getFacadeName <em>Facade Name</em>}</li>
 *   <li>{@link dependencies.Fachada#getInterfazName <em>Interfaz Name</em>}</li>
 *   <li>{@link dependencies.Fachada#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link dependencies.Fachada#getMethodID <em>Method ID</em>}</li>
 *   <li>{@link dependencies.Fachada#getEOI <em>EOI</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getFachada()
 * @model
 * @generated
 */
public interface Fachada extends EObject {
	/**
	 * Returns the value of the '<em><b>Facade Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facade Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facade Name</em>' attribute.
	 * @see #setFacadeName(String)
	 * @see dependencies.DependenciesPackage#getFachada_FacadeName()
	 * @model
	 * @generated
	 */
	String getFacadeName();

	/**
	 * Sets the value of the '{@link dependencies.Fachada#getFacadeName <em>Facade Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facade Name</em>' attribute.
	 * @see #getFacadeName()
	 * @generated
	 */
	void setFacadeName(String value);

	/**
	 * Returns the value of the '<em><b>Interfaz Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaz Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaz Name</em>' attribute.
	 * @see #setInterfazName(String)
	 * @see dependencies.DependenciesPackage#getFachada_InterfazName()
	 * @model
	 * @generated
	 */
	String getInterfazName();

	/**
	 * Sets the value of the '{@link dependencies.Fachada#getInterfazName <em>Interfaz Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaz Name</em>' attribute.
	 * @see #getInterfazName()
	 * @generated
	 */
	void setInterfazName(String value);

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see dependencies.DependenciesPackage#getFachada_MethodName()
	 * @model
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link dependencies.Fachada#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Method ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method ID</em>' attribute.
	 * @see #setMethodID(String)
	 * @see dependencies.DependenciesPackage#getFachada_MethodID()
	 * @model
	 * @generated
	 */
	String getMethodID();

	/**
	 * Sets the value of the '{@link dependencies.Fachada#getMethodID <em>Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method ID</em>' attribute.
	 * @see #getMethodID()
	 * @generated
	 */
	void setMethodID(String value);

	/**
	 * Returns the value of the '<em><b>EOI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOI</em>' reference.
	 * @see #setEOI(OI)
	 * @see dependencies.DependenciesPackage#getFachada_EOI()
	 * @model required="true"
	 * @generated
	 */
	OI getEOI();

	/**
	 * Sets the value of the '{@link dependencies.Fachada#getEOI <em>EOI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOI</em>' reference.
	 * @see #getEOI()
	 * @generated
	 */
	void setEOI(OI value);

} // Fachada
