/**
 */
package dependencies.impl;

import dependencies.DependenciesPackage;
import dependencies.Webservice;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Webservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.WebserviceImpl#getAssociatedLogics <em>Associated Logics</em>}</li>
 *   <li>{@link dependencies.impl.WebserviceImpl#getState <em>State</em>}</li>
 *   <li>{@link dependencies.impl.WebserviceImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link dependencies.impl.WebserviceImpl#getTransport <em>Transport</em>}</li>
 *   <li>{@link dependencies.impl.WebserviceImpl#getSynchrony <em>Synchrony</em>}</li>
 *   <li>{@link dependencies.impl.WebserviceImpl#getWsdl <em>Wsdl</em>}</li>
 *   <li>{@link dependencies.impl.WebserviceImpl#getWsOp <em>Ws Op</em>}</li>
 *   <li>{@link dependencies.impl.WebserviceImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebserviceImpl extends MinimalEObjectImpl.Container implements Webservice {
	/**
	 * The default value of the '{@link #getAssociatedLogics() <em>Associated Logics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedLogics()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATED_LOGICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociatedLogics() <em>Associated Logics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedLogics()
	 * @generated
	 * @ordered
	 */
	protected String associatedLogics = ASSOCIATED_LOGICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransport() <em>Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransport()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransport() <em>Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransport()
	 * @generated
	 * @ordered
	 */
	protected String transport = TRANSPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSynchrony() <em>Synchrony</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchrony()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNCHRONY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSynchrony() <em>Synchrony</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchrony()
	 * @generated
	 * @ordered
	 */
	protected String synchrony = SYNCHRONY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsdl() <em>Wsdl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdl()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdl() <em>Wsdl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdl()
	 * @generated
	 * @ordered
	 */
	protected String wsdl = WSDL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsOp() <em>Ws Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsOp()
	 * @generated
	 * @ordered
	 */
	protected static final String WS_OP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsOp() <em>Ws Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsOp()
	 * @generated
	 * @ordered
	 */
	protected String wsOp = WS_OP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebserviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.WEBSERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociatedLogics() {
		return associatedLogics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedLogics(String newAssociatedLogics) {
		String oldAssociatedLogics = associatedLogics;
		associatedLogics = newAssociatedLogics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.WEBSERVICE__ASSOCIATED_LOGICS, oldAssociatedLogics, associatedLogics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.WEBSERVICE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.WEBSERVICE__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransport() {
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransport(String newTransport) {
		String oldTransport = transport;
		transport = newTransport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.WEBSERVICE__TRANSPORT, oldTransport, transport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSynchrony() {
		return synchrony;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchrony(String newSynchrony) {
		String oldSynchrony = synchrony;
		synchrony = newSynchrony;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.WEBSERVICE__SYNCHRONY, oldSynchrony, synchrony));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdl() {
		return wsdl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdl(String newWsdl) {
		String oldWsdl = wsdl;
		wsdl = newWsdl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.WEBSERVICE__WSDL, oldWsdl, wsdl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsOp() {
		return wsOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsOp(String newWsOp) {
		String oldWsOp = wsOp;
		wsOp = newWsOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.WEBSERVICE__WS_OP, oldWsOp, wsOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.WEBSERVICE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependenciesPackage.WEBSERVICE__ASSOCIATED_LOGICS:
				return getAssociatedLogics();
			case DependenciesPackage.WEBSERVICE__STATE:
				return getState();
			case DependenciesPackage.WEBSERVICE__ALIAS:
				return getAlias();
			case DependenciesPackage.WEBSERVICE__TRANSPORT:
				return getTransport();
			case DependenciesPackage.WEBSERVICE__SYNCHRONY:
				return getSynchrony();
			case DependenciesPackage.WEBSERVICE__WSDL:
				return getWsdl();
			case DependenciesPackage.WEBSERVICE__WS_OP:
				return getWsOp();
			case DependenciesPackage.WEBSERVICE__NAMESPACE:
				return getNamespace();
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
			case DependenciesPackage.WEBSERVICE__ASSOCIATED_LOGICS:
				setAssociatedLogics((String)newValue);
				return;
			case DependenciesPackage.WEBSERVICE__STATE:
				setState((String)newValue);
				return;
			case DependenciesPackage.WEBSERVICE__ALIAS:
				setAlias((String)newValue);
				return;
			case DependenciesPackage.WEBSERVICE__TRANSPORT:
				setTransport((String)newValue);
				return;
			case DependenciesPackage.WEBSERVICE__SYNCHRONY:
				setSynchrony((String)newValue);
				return;
			case DependenciesPackage.WEBSERVICE__WSDL:
				setWsdl((String)newValue);
				return;
			case DependenciesPackage.WEBSERVICE__WS_OP:
				setWsOp((String)newValue);
				return;
			case DependenciesPackage.WEBSERVICE__NAMESPACE:
				setNamespace((String)newValue);
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
			case DependenciesPackage.WEBSERVICE__ASSOCIATED_LOGICS:
				setAssociatedLogics(ASSOCIATED_LOGICS_EDEFAULT);
				return;
			case DependenciesPackage.WEBSERVICE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case DependenciesPackage.WEBSERVICE__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case DependenciesPackage.WEBSERVICE__TRANSPORT:
				setTransport(TRANSPORT_EDEFAULT);
				return;
			case DependenciesPackage.WEBSERVICE__SYNCHRONY:
				setSynchrony(SYNCHRONY_EDEFAULT);
				return;
			case DependenciesPackage.WEBSERVICE__WSDL:
				setWsdl(WSDL_EDEFAULT);
				return;
			case DependenciesPackage.WEBSERVICE__WS_OP:
				setWsOp(WS_OP_EDEFAULT);
				return;
			case DependenciesPackage.WEBSERVICE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
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
			case DependenciesPackage.WEBSERVICE__ASSOCIATED_LOGICS:
				return ASSOCIATED_LOGICS_EDEFAULT == null ? associatedLogics != null : !ASSOCIATED_LOGICS_EDEFAULT.equals(associatedLogics);
			case DependenciesPackage.WEBSERVICE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case DependenciesPackage.WEBSERVICE__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case DependenciesPackage.WEBSERVICE__TRANSPORT:
				return TRANSPORT_EDEFAULT == null ? transport != null : !TRANSPORT_EDEFAULT.equals(transport);
			case DependenciesPackage.WEBSERVICE__SYNCHRONY:
				return SYNCHRONY_EDEFAULT == null ? synchrony != null : !SYNCHRONY_EDEFAULT.equals(synchrony);
			case DependenciesPackage.WEBSERVICE__WSDL:
				return WSDL_EDEFAULT == null ? wsdl != null : !WSDL_EDEFAULT.equals(wsdl);
			case DependenciesPackage.WEBSERVICE__WS_OP:
				return WS_OP_EDEFAULT == null ? wsOp != null : !WS_OP_EDEFAULT.equals(wsOp);
			case DependenciesPackage.WEBSERVICE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
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
		result.append(" (associatedLogics: ");
		result.append(associatedLogics);
		result.append(", state: ");
		result.append(state);
		result.append(", alias: ");
		result.append(alias);
		result.append(", transport: ");
		result.append(transport);
		result.append(", synchrony: ");
		result.append(synchrony);
		result.append(", wsdl: ");
		result.append(wsdl);
		result.append(", wsOp: ");
		result.append(wsOp);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(')');
		return result.toString();
	}

} //WebserviceImpl
