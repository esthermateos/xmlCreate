/**
 */
package dependencies.impl;

import dependencies.DependenciesPackage;
import dependencies.JMS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JMS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.JMSImpl#getListenerPorts <em>Listener Ports</em>}</li>
 *   <li>{@link dependencies.impl.JMSImpl#getJmsModules <em>Jms Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JMSImpl extends MinimalEObjectImpl.Container implements JMS {
	/**
	 * The default value of the '{@link #getListenerPorts() <em>Listener Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListenerPorts()
	 * @generated
	 * @ordered
	 */
	protected static final String LISTENER_PORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListenerPorts() <em>Listener Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListenerPorts()
	 * @generated
	 * @ordered
	 */
	protected String listenerPorts = LISTENER_PORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJmsModules() <em>Jms Modules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJmsModules()
	 * @generated
	 * @ordered
	 */
	protected static final String JMS_MODULES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJmsModules() <em>Jms Modules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJmsModules()
	 * @generated
	 * @ordered
	 */
	protected String jmsModules = JMS_MODULES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JMSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.JMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListenerPorts() {
		return listenerPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListenerPorts(String newListenerPorts) {
		String oldListenerPorts = listenerPorts;
		listenerPorts = newListenerPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.JMS__LISTENER_PORTS, oldListenerPorts, listenerPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJmsModules() {
		return jmsModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJmsModules(String newJmsModules) {
		String oldJmsModules = jmsModules;
		jmsModules = newJmsModules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.JMS__JMS_MODULES, oldJmsModules, jmsModules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependenciesPackage.JMS__LISTENER_PORTS:
				return getListenerPorts();
			case DependenciesPackage.JMS__JMS_MODULES:
				return getJmsModules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DependenciesPackage.JMS__LISTENER_PORTS:
				setListenerPorts((String)newValue);
				return;
			case DependenciesPackage.JMS__JMS_MODULES:
				setJmsModules((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DependenciesPackage.JMS__LISTENER_PORTS:
				setListenerPorts(LISTENER_PORTS_EDEFAULT);
				return;
			case DependenciesPackage.JMS__JMS_MODULES:
				setJmsModules(JMS_MODULES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DependenciesPackage.JMS__LISTENER_PORTS:
				return LISTENER_PORTS_EDEFAULT == null ? listenerPorts != null : !LISTENER_PORTS_EDEFAULT.equals(listenerPorts);
			case DependenciesPackage.JMS__JMS_MODULES:
				return JMS_MODULES_EDEFAULT == null ? jmsModules != null : !JMS_MODULES_EDEFAULT.equals(jmsModules);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (listenerPorts: ");
		result.append(listenerPorts);
		result.append(", jmsModules: ");
		result.append(jmsModules);
		result.append(')');
		return result.toString();
	}

} //JMSImpl
