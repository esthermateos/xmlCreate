/**
 */
package dependencies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.Java#getEFachada <em>EFachada</em>}</li>
 *   <li>{@link dependencies.Java#getECache <em>ECache</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getJava()
 * @model
 * @generated
 */
public interface Java extends EObject {
	/**
	 * Returns the value of the '<em><b>EFachada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFachada</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFachada</em>' reference.
	 * @see #setEFachada(Fachada)
	 * @see dependencies.DependenciesPackage#getJava_EFachada()
	 * @model
	 * @generated
	 */
	Fachada getEFachada();

	/**
	 * Sets the value of the '{@link dependencies.Java#getEFachada <em>EFachada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFachada</em>' reference.
	 * @see #getEFachada()
	 * @generated
	 */
	void setEFachada(Fachada value);

	/**
	 * Returns the value of the '<em><b>ECache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECache</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECache</em>' containment reference.
	 * @see #setECache(Cache)
	 * @see dependencies.DependenciesPackage#getJava_ECache()
	 * @model containment="true"
	 * @generated
	 */
	Cache getECache();

	/**
	 * Sets the value of the '{@link dependencies.Java#getECache <em>ECache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECache</em>' containment reference.
	 * @see #getECache()
	 * @generated
	 */
	void setECache(Cache value);

} // Java
