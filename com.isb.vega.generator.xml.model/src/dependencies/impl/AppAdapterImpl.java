/**
 */
package dependencies.impl;

import dependencies.AppAdapter;
import dependencies.Cache;
import dependencies.DependenciesPackage;
import dependencies.Fachada;

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
 *   <li>{@link dependencies.impl.AppAdapterImpl#getEFachada <em>EFachada</em>}</li>
 *   <li>{@link dependencies.impl.AppAdapterImpl#getECache <em>ECache</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppAdapterImpl extends MinimalEObjectImpl.Container implements AppAdapter {
	/**
	 * The cached value of the '{@link #getEFachada() <em>EFachada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFachada()
	 * @generated
	 * @ordered
	 */
	protected Fachada eFachada;

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
	public Fachada getEFachada() {
		if (eFachada != null && eFachada.eIsProxy()) {
			InternalEObject oldEFachada = (InternalEObject)eFachada;
			eFachada = (Fachada)eResolveProxy(oldEFachada);
			if (eFachada != oldEFachada) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependenciesPackage.APP_ADAPTER__EFACHADA, oldEFachada, eFachada));
			}
		}
		return eFachada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fachada basicGetEFachada() {
		return eFachada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEFachada(Fachada newEFachada) {
		Fachada oldEFachada = eFachada;
		eFachada = newEFachada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.APP_ADAPTER__EFACHADA, oldEFachada, eFachada));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				return basicSetECache(null, msgs);
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
			case DependenciesPackage.APP_ADAPTER__EFACHADA:
				if (resolve) return getEFachada();
				return basicGetEFachada();
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				return getECache();
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
			case DependenciesPackage.APP_ADAPTER__EFACHADA:
				setEFachada((Fachada)newValue);
				return;
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				setECache((Cache)newValue);
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
			case DependenciesPackage.APP_ADAPTER__EFACHADA:
				setEFachada((Fachada)null);
				return;
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				setECache((Cache)null);
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
			case DependenciesPackage.APP_ADAPTER__EFACHADA:
				return eFachada != null;
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				return eCache != null;
		}
		return super.eIsSet(featureID);
	}

} //AppAdapterImpl
