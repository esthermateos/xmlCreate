/**
 */
package dependencies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Levels</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.Levels#getNameLevel <em>Name Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getLevels()
 * @model
 * @generated
 */
public interface Levels extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Level</em>' attribute.
	 * @see #setNameLevel(String)
	 * @see dependencies.DependenciesPackage#getLevels_NameLevel()
	 * @model
	 * @generated
	 */
	String getNameLevel();

	/**
	 * Sets the value of the '{@link dependencies.Levels#getNameLevel <em>Name Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Level</em>' attribute.
	 * @see #getNameLevel()
	 * @generated
	 */
	void setNameLevel(String value);

} // Levels
