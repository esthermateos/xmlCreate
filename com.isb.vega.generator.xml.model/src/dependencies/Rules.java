/**
 */
package dependencies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.Rules#getIdLit <em>Id Lit</em>}</li>
 *   <li>{@link dependencies.Rules#getLit <em>Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getRules()
 * @model
 * @generated
 */
public interface Rules extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Lit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Lit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Lit</em>' attribute.
	 * @see #setIdLit(String)
	 * @see dependencies.DependenciesPackage#getRules_IdLit()
	 * @model
	 * @generated
	 */
	String getIdLit();

	/**
	 * Sets the value of the '{@link dependencies.Rules#getIdLit <em>Id Lit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Lit</em>' attribute.
	 * @see #getIdLit()
	 * @generated
	 */
	void setIdLit(String value);

	/**
	 * Returns the value of the '<em><b>Lit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lit</em>' attribute.
	 * @see #setLit(String)
	 * @see dependencies.DependenciesPackage#getRules_Lit()
	 * @model
	 * @generated
	 */
	String getLit();

	/**
	 * Sets the value of the '{@link dependencies.Rules#getLit <em>Lit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lit</em>' attribute.
	 * @see #getLit()
	 * @generated
	 */
	void setLit(String value);

} // Rules
