/**
 */
package dependencies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Webservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.Webservice#getState <em>State</em>}</li>
 *   <li>{@link dependencies.Webservice#getAlias <em>Alias</em>}</li>
 *   <li>{@link dependencies.Webservice#getTransport <em>Transport</em>}</li>
 *   <li>{@link dependencies.Webservice#getSynchrony <em>Synchrony</em>}</li>
 *   <li>{@link dependencies.Webservice#getWsdl <em>Wsdl</em>}</li>
 *   <li>{@link dependencies.Webservice#getWsOp <em>Ws Op</em>}</li>
 *   <li>{@link dependencies.Webservice#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getWebservice()
 * @model
 * @generated
 */
public interface Webservice extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see dependencies.DependenciesPackage#getWebservice_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link dependencies.Webservice#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see dependencies.DependenciesPackage#getWebservice_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link dependencies.Webservice#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport</em>' attribute.
	 * @see #setTransport(String)
	 * @see dependencies.DependenciesPackage#getWebservice_Transport()
	 * @model
	 * @generated
	 */
	String getTransport();

	/**
	 * Sets the value of the '{@link dependencies.Webservice#getTransport <em>Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport</em>' attribute.
	 * @see #getTransport()
	 * @generated
	 */
	void setTransport(String value);

	/**
	 * Returns the value of the '<em><b>Synchrony</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchrony</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchrony</em>' attribute.
	 * @see #setSynchrony(String)
	 * @see dependencies.DependenciesPackage#getWebservice_Synchrony()
	 * @model
	 * @generated
	 */
	String getSynchrony();

	/**
	 * Sets the value of the '{@link dependencies.Webservice#getSynchrony <em>Synchrony</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchrony</em>' attribute.
	 * @see #getSynchrony()
	 * @generated
	 */
	void setSynchrony(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl</em>' attribute.
	 * @see #setWsdl(String)
	 * @see dependencies.DependenciesPackage#getWebservice_Wsdl()
	 * @model
	 * @generated
	 */
	String getWsdl();

	/**
	 * Sets the value of the '{@link dependencies.Webservice#getWsdl <em>Wsdl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl</em>' attribute.
	 * @see #getWsdl()
	 * @generated
	 */
	void setWsdl(String value);

	/**
	 * Returns the value of the '<em><b>Ws Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Op</em>' attribute.
	 * @see #setWsOp(String)
	 * @see dependencies.DependenciesPackage#getWebservice_WsOp()
	 * @model
	 * @generated
	 */
	String getWsOp();

	/**
	 * Sets the value of the '{@link dependencies.Webservice#getWsOp <em>Ws Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Op</em>' attribute.
	 * @see #getWsOp()
	 * @generated
	 */
	void setWsOp(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see dependencies.DependenciesPackage#getWebservice_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link dependencies.Webservice#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

} // Webservice
