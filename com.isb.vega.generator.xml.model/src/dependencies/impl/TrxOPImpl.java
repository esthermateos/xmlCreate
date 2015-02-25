/**
 */
package dependencies.impl;

import dependencies.DependenciesPackage;
import dependencies.TrxOP;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trx OP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.TrxOPImpl#getState <em>State</em>}</li>
 *   <li>{@link dependencies.impl.TrxOPImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link dependencies.impl.TrxOPImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link dependencies.impl.TrxOPImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link dependencies.impl.TrxOPImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link dependencies.impl.TrxOPImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link dependencies.impl.TrxOPImpl#getTransactionMode <em>Transaction Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrxOPImpl extends MinimalEObjectImpl.Container implements TrxOP {
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
	 * The default value of the '{@link #getTransaction() <em>Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected String transaction = TRANSACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected String operation = OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

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
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionMode() <em>Transaction Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionMode()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionMode() <em>Transaction Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionMode()
	 * @generated
	 * @ordered
	 */
	protected String transactionMode = TRANSACTION_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrxOPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.TRX_OP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.TRX_OP__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransaction() {
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransaction(String newTransaction) {
		String oldTransaction = transaction;
		transaction = newTransaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.TRX_OP__TRANSACTION, oldTransaction, transaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(String newOperation) {
		String oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.TRX_OP__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.TRX_OP__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.TRX_OP__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.TRX_OP__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransactionMode() {
		return transactionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionMode(String newTransactionMode) {
		String oldTransactionMode = transactionMode;
		transactionMode = newTransactionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.TRX_OP__TRANSACTION_MODE, oldTransactionMode, transactionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependenciesPackage.TRX_OP__STATE:
				return getState();
			case DependenciesPackage.TRX_OP__TRANSACTION:
				return getTransaction();
			case DependenciesPackage.TRX_OP__OPERATION:
				return getOperation();
			case DependenciesPackage.TRX_OP__VERSION:
				return getVersion();
			case DependenciesPackage.TRX_OP__ALIAS:
				return getAlias();
			case DependenciesPackage.TRX_OP__PROTOCOL:
				return getProtocol();
			case DependenciesPackage.TRX_OP__TRANSACTION_MODE:
				return getTransactionMode();
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
			case DependenciesPackage.TRX_OP__STATE:
				setState((String)newValue);
				return;
			case DependenciesPackage.TRX_OP__TRANSACTION:
				setTransaction((String)newValue);
				return;
			case DependenciesPackage.TRX_OP__OPERATION:
				setOperation((String)newValue);
				return;
			case DependenciesPackage.TRX_OP__VERSION:
				setVersion((String)newValue);
				return;
			case DependenciesPackage.TRX_OP__ALIAS:
				setAlias((String)newValue);
				return;
			case DependenciesPackage.TRX_OP__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case DependenciesPackage.TRX_OP__TRANSACTION_MODE:
				setTransactionMode((String)newValue);
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
			case DependenciesPackage.TRX_OP__STATE:
				setState(STATE_EDEFAULT);
				return;
			case DependenciesPackage.TRX_OP__TRANSACTION:
				setTransaction(TRANSACTION_EDEFAULT);
				return;
			case DependenciesPackage.TRX_OP__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case DependenciesPackage.TRX_OP__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DependenciesPackage.TRX_OP__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case DependenciesPackage.TRX_OP__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case DependenciesPackage.TRX_OP__TRANSACTION_MODE:
				setTransactionMode(TRANSACTION_MODE_EDEFAULT);
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
			case DependenciesPackage.TRX_OP__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case DependenciesPackage.TRX_OP__TRANSACTION:
				return TRANSACTION_EDEFAULT == null ? transaction != null : !TRANSACTION_EDEFAULT.equals(transaction);
			case DependenciesPackage.TRX_OP__OPERATION:
				return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
			case DependenciesPackage.TRX_OP__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DependenciesPackage.TRX_OP__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case DependenciesPackage.TRX_OP__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case DependenciesPackage.TRX_OP__TRANSACTION_MODE:
				return TRANSACTION_MODE_EDEFAULT == null ? transactionMode != null : !TRANSACTION_MODE_EDEFAULT.equals(transactionMode);
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
		result.append(" (state: ");
		result.append(state);
		result.append(", transaction: ");
		result.append(transaction);
		result.append(", operation: ");
		result.append(operation);
		result.append(", version: ");
		result.append(version);
		result.append(", alias: ");
		result.append(alias);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", transactionMode: ");
		result.append(transactionMode);
		result.append(')');
		return result.toString();
	}

} //TrxOPImpl
