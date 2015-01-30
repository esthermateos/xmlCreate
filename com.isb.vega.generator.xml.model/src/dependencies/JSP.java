/**
 */
package dependencies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.JSP#getName <em>Name</em>}</li>
 *   <li>{@link dependencies.JSP#getETableParameters <em>ETable Parameters</em>}</li>
 *   <li>{@link dependencies.JSP#getERules <em>ERules</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getJSP()
 * @model
 * @generated
 */
public interface JSP extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dependencies.DependenciesPackage#getJSP_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dependencies.JSP#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ETable Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.TableParameters}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ETable Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETable Parameters</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getJSP_ETableParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableParameters> getETableParameters();

	/**
	 * Returns the value of the '<em><b>ERules</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.Rules}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERules</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getJSP_ERules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rules> getERules();

} // JSP
