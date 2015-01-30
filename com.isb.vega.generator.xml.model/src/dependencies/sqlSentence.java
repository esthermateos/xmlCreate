/**
 */
package dependencies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sql Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.sqlSentence#getName <em>Name</em>}</li>
 *   <li>{@link dependencies.sqlSentence#getType <em>Type</em>}</li>
 *   <li>{@link dependencies.sqlSentence#getSql <em>Sql</em>}</li>
 *   <li>{@link dependencies.sqlSentence#getEFachada <em>EFachada</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getsqlSentence()
 * @model
 * @generated
 */
public interface sqlSentence extends EObject {
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
	 * @see dependencies.DependenciesPackage#getsqlSentence_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dependencies.sqlSentence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see dependencies.DependenciesPackage#getsqlSentence_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link dependencies.sqlSentence#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql</em>' attribute.
	 * @see #setSql(String)
	 * @see dependencies.DependenciesPackage#getsqlSentence_Sql()
	 * @model
	 * @generated
	 */
	String getSql();

	/**
	 * Sets the value of the '{@link dependencies.sqlSentence#getSql <em>Sql</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql</em>' attribute.
	 * @see #getSql()
	 * @generated
	 */
	void setSql(String value);

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
	 * @see dependencies.DependenciesPackage#getsqlSentence_EFachada()
	 * @model
	 * @generated
	 */
	Fachada getEFachada();

	/**
	 * Sets the value of the '{@link dependencies.sqlSentence#getEFachada <em>EFachada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFachada</em>' reference.
	 * @see #getEFachada()
	 * @generated
	 */
	void setEFachada(Fachada value);

} // sqlSentence
