/**
 */
package dependencies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.Security#isAutentication <em>Autentication</em>}</li>
 *   <li>{@link dependencies.Security#getUsuNotes <em>Usu Notes</em>}</li>
 *   <li>{@link dependencies.Security#getEntityAlias <em>Entity Alias</em>}</li>
 *   <li>{@link dependencies.Security#isCodePassword <em>Code Password</em>}</li>
 *   <li>{@link dependencies.Security#isMulti <em>Multi</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getSecurity()
 * @model
 * @generated
 */
public interface Security extends EObject {
	/**
	 * Returns the value of the '<em><b>Autentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autentication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autentication</em>' attribute.
	 * @see #setAutentication(boolean)
	 * @see dependencies.DependenciesPackage#getSecurity_Autentication()
	 * @model
	 * @generated
	 */
	boolean isAutentication();

	/**
	 * Sets the value of the '{@link dependencies.Security#isAutentication <em>Autentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autentication</em>' attribute.
	 * @see #isAutentication()
	 * @generated
	 */
	void setAutentication(boolean value);

	/**
	 * Returns the value of the '<em><b>Usu Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usu Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usu Notes</em>' attribute.
	 * @see #setUsuNotes(String)
	 * @see dependencies.DependenciesPackage#getSecurity_UsuNotes()
	 * @model
	 * @generated
	 */
	String getUsuNotes();

	/**
	 * Sets the value of the '{@link dependencies.Security#getUsuNotes <em>Usu Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usu Notes</em>' attribute.
	 * @see #getUsuNotes()
	 * @generated
	 */
	void setUsuNotes(String value);

	/**
	 * Returns the value of the '<em><b>Entity Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Alias</em>' attribute.
	 * @see #setEntityAlias(String)
	 * @see dependencies.DependenciesPackage#getSecurity_EntityAlias()
	 * @model
	 * @generated
	 */
	String getEntityAlias();

	/**
	 * Sets the value of the '{@link dependencies.Security#getEntityAlias <em>Entity Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Alias</em>' attribute.
	 * @see #getEntityAlias()
	 * @generated
	 */
	void setEntityAlias(String value);

	/**
	 * Returns the value of the '<em><b>Code Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Password</em>' attribute.
	 * @see #setCodePassword(boolean)
	 * @see dependencies.DependenciesPackage#getSecurity_CodePassword()
	 * @model
	 * @generated
	 */
	boolean isCodePassword();

	/**
	 * Sets the value of the '{@link dependencies.Security#isCodePassword <em>Code Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Password</em>' attribute.
	 * @see #isCodePassword()
	 * @generated
	 */
	void setCodePassword(boolean value);

	/**
	 * Returns the value of the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi</em>' attribute.
	 * @see #setMulti(boolean)
	 * @see dependencies.DependenciesPackage#getSecurity_Multi()
	 * @model
	 * @generated
	 */
	boolean isMulti();

	/**
	 * Sets the value of the '{@link dependencies.Security#isMulti <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi</em>' attribute.
	 * @see #isMulti()
	 * @generated
	 */
	void setMulti(boolean value);

} // Security