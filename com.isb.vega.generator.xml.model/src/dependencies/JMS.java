/**
 */
package dependencies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JMS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.JMS#getListenerPorts <em>Listener Ports</em>}</li>
 *   <li>{@link dependencies.JMS#getJmsModules <em>Jms Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getJMS()
 * @model
 * @generated
 */
public interface JMS extends EObject {
	/**
	 * Returns the value of the '<em><b>Listener Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listener Ports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listener Ports</em>' attribute.
	 * @see #setListenerPorts(String)
	 * @see dependencies.DependenciesPackage#getJMS_ListenerPorts()
	 * @model
	 * @generated
	 */
	String getListenerPorts();

	/**
	 * Sets the value of the '{@link dependencies.JMS#getListenerPorts <em>Listener Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listener Ports</em>' attribute.
	 * @see #getListenerPorts()
	 * @generated
	 */
	void setListenerPorts(String value);

	/**
	 * Returns the value of the '<em><b>Jms Modules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jms Modules</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jms Modules</em>' attribute.
	 * @see #setJmsModules(String)
	 * @see dependencies.DependenciesPackage#getJMS_JmsModules()
	 * @model
	 * @generated
	 */
	String getJmsModules();

	/**
	 * Sets the value of the '{@link dependencies.JMS#getJmsModules <em>Jms Modules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jms Modules</em>' attribute.
	 * @see #getJmsModules()
	 * @generated
	 */
	void setJmsModules(String value);

} // JMS
