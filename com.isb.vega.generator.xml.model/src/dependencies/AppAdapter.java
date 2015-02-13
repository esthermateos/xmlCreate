/**
 */
package dependencies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.AppAdapter#getEFachada <em>EFachada</em>}</li>
 *   <li>{@link dependencies.AppAdapter#getECache <em>ECache</em>}</li>
 *   <li>{@link dependencies.AppAdapter#getEFTP <em>EFTP</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getAppAdapter()
 * @model
 * @generated
 */
public interface AppAdapter extends EObject {
	/**
	 * Returns the value of the '<em><b>EFachada</b></em>' reference list.
	 * The list contents are of type {@link dependencies.Fachada}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFachada</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFachada</em>' reference list.
	 * @see dependencies.DependenciesPackage#getAppAdapter_EFachada()
	 * @model
	 * @generated
	 */
	EList<Fachada> getEFachada();

	/**
	 * Returns the value of the '<em><b>ECache</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.Cache}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECache</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECache</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getAppAdapter_ECache()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cache> getECache();

	/**
	 * Returns the value of the '<em><b>EFTP</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.FTP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFTP</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFTP</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getAppAdapter_EFTP()
	 * @model containment="true"
	 * @generated
	 */
	EList<FTP> getEFTP();

} // AppAdapter
