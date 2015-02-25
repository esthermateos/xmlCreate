/**
 */
package dependencies.impl;

import dependencies.AppAdapter;
import dependencies.Cache;
import dependencies.DependenciesPackage;
import dependencies.FTP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.AppAdapterImpl#getECache <em>ECache</em>}</li>
 *   <li>{@link dependencies.impl.AppAdapterImpl#getEFTP <em>EFTP</em>}</li>
 *   <li>{@link dependencies.impl.AppAdapterImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link dependencies.impl.AppAdapterImpl#getComponentName <em>Component Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppAdapterImpl extends MinimalEObjectImpl.Container implements AppAdapter {
	/**
	 * The cached value of the '{@link #getECache() <em>ECache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECache()
	 * @generated
	 * @ordered
	 */
	protected Cache eCache;

	/**
	 * The cached value of the '{@link #getEFTP() <em>EFTP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFTP()
	 * @generated
	 * @ordered
	 */
	protected FTP eFTP;

	/**
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected String componentName = COMPONENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.APP_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache getECache() {
		return eCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetECache(Cache newECache, NotificationChain msgs) {
		Cache oldECache = eCache;
		eCache = newECache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependenciesPackage.APP_ADAPTER__ECACHE, oldECache, newECache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setECache(Cache newECache) {
		if (newECache != eCache) {
			NotificationChain msgs = null;
			if (eCache != null)
				msgs = ((InternalEObject)eCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.APP_ADAPTER__ECACHE, null, msgs);
			if (newECache != null)
				msgs = ((InternalEObject)newECache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.APP_ADAPTER__ECACHE, null, msgs);
			msgs = basicSetECache(newECache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.APP_ADAPTER__ECACHE, newECache, newECache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTP getEFTP() {
		return eFTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEFTP(FTP newEFTP, NotificationChain msgs) {
		FTP oldEFTP = eFTP;
		eFTP = newEFTP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependenciesPackage.APP_ADAPTER__EFTP, oldEFTP, newEFTP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEFTP(FTP newEFTP) {
		if (newEFTP != eFTP) {
			NotificationChain msgs = null;
			if (eFTP != null)
				msgs = ((InternalEObject)eFTP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.APP_ADAPTER__EFTP, null, msgs);
			if (newEFTP != null)
				msgs = ((InternalEObject)newEFTP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.APP_ADAPTER__EFTP, null, msgs);
			msgs = basicSetEFTP(newEFTP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.APP_ADAPTER__EFTP, newEFTP, newEFTP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		String oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.APP_ADAPTER__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentName() {
		return componentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentName(String newComponentName) {
		String oldComponentName = componentName;
		componentName = newComponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.APP_ADAPTER__COMPONENT_NAME, oldComponentName, componentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				return basicSetECache(null, msgs);
			case DependenciesPackage.APP_ADAPTER__EFTP:
				return basicSetEFTP(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				return getECache();
			case DependenciesPackage.APP_ADAPTER__EFTP:
				return getEFTP();
			case DependenciesPackage.APP_ADAPTER__PACKAGE:
				return getPackage();
			case DependenciesPackage.APP_ADAPTER__COMPONENT_NAME:
				return getComponentName();
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
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				setECache((Cache)newValue);
				return;
			case DependenciesPackage.APP_ADAPTER__EFTP:
				setEFTP((FTP)newValue);
				return;
			case DependenciesPackage.APP_ADAPTER__PACKAGE:
				setPackage((String)newValue);
				return;
			case DependenciesPackage.APP_ADAPTER__COMPONENT_NAME:
				setComponentName((String)newValue);
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
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				setECache((Cache)null);
				return;
			case DependenciesPackage.APP_ADAPTER__EFTP:
				setEFTP((FTP)null);
				return;
			case DependenciesPackage.APP_ADAPTER__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case DependenciesPackage.APP_ADAPTER__COMPONENT_NAME:
				setComponentName(COMPONENT_NAME_EDEFAULT);
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
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				return eCache != null;
			case DependenciesPackage.APP_ADAPTER__EFTP:
				return eFTP != null;
			case DependenciesPackage.APP_ADAPTER__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case DependenciesPackage.APP_ADAPTER__COMPONENT_NAME:
				return COMPONENT_NAME_EDEFAULT == null ? componentName != null : !COMPONENT_NAME_EDEFAULT.equals(componentName);
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
		result.append(" (package: ");
		result.append(package_);
		result.append(", componentName: ");
		result.append(componentName);
		result.append(')');
		return result.toString();
	}

} //AppAdapterImpl
