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
 *   <li>{@link dependencies.Java#getPackage <em>Package</em>}</li>
 *   <li>{@link dependencies.Java#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link dependencies.Java#getECache <em>ECache</em>}</li>
 *   <li>{@link dependencies.Java#getEFTP <em>EFTP</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getJava()
 * @model
 * @generated
 */
public interface Java extends EObject {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see dependencies.DependenciesPackage#getJava_Package()
	 * @model
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link dependencies.Java#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name</em>' attribute.
	 * @see #setComponentName(String)
	 * @see dependencies.DependenciesPackage#getJava_ComponentName()
	 * @model
	 * @generated
	 */
	String getComponentName();

	/**
	 * Sets the value of the '{@link dependencies.Java#getComponentName <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' attribute.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(String value);

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

	/**
	 * Returns the value of the '<em><b>EFTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFTP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFTP</em>' containment reference.
	 * @see #setEFTP(FTP)
	 * @see dependencies.DependenciesPackage#getJava_EFTP()
	 * @model containment="true"
	 * @generated
	 */
	FTP getEFTP();

	/**
	 * Sets the value of the '{@link dependencies.Java#getEFTP <em>EFTP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFTP</em>' containment reference.
	 * @see #getEFTP()
	 * @generated
	 */
	void setEFTP(FTP value);

} // Java
