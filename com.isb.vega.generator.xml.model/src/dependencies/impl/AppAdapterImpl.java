/**
 */
package dependencies.impl;

import dependencies.AppAdapter;
import dependencies.Cache;
import dependencies.DependenciesPackage;
import dependencies.FTP;
import dependencies.Fachada;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.AppAdapterImpl#getEFachada <em>EFachada</em>}</li>
 *   <li>{@link dependencies.impl.AppAdapterImpl#getECache <em>ECache</em>}</li>
 *   <li>{@link dependencies.impl.AppAdapterImpl#getEFTP <em>EFTP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppAdapterImpl extends MinimalEObjectImpl.Container implements AppAdapter {
	/**
	 * The cached value of the '{@link #getEFachada() <em>EFachada</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFachada()
	 * @generated
	 * @ordered
	 */
	protected EList<Fachada> eFachada;

	/**
	 * The cached value of the '{@link #getECache() <em>ECache</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECache()
	 * @generated
	 * @ordered
	 */
	protected EList<Cache> eCache;

	/**
	 * The cached value of the '{@link #getEFTP() <em>EFTP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFTP()
	 * @generated
	 * @ordered
	 */
	protected EList<FTP> eFTP;

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
	public EList<Fachada> getEFachada() {
		if (eFachada == null) {
			eFachada = new EObjectResolvingEList<Fachada>(Fachada.class, this, DependenciesPackage.APP_ADAPTER__EFACHADA);
		}
		return eFachada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cache> getECache() {
		if (eCache == null) {
			eCache = new EObjectContainmentEList<Cache>(Cache.class, this, DependenciesPackage.APP_ADAPTER__ECACHE);
		}
		return eCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FTP> getEFTP() {
		if (eFTP == null) {
			eFTP = new EObjectContainmentEList<FTP>(FTP.class, this, DependenciesPackage.APP_ADAPTER__EFTP);
		}
		return eFTP;
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
				return ((InternalEList<?>)getECache()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.APP_ADAPTER__EFTP:
				return ((InternalEList<?>)getEFTP()).basicRemove(otherEnd, msgs);
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
				return getEFachada();
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				return getECache();
			case DependenciesPackage.APP_ADAPTER__EFTP:
				return getEFTP();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DependenciesPackage.APP_ADAPTER__EFACHADA:
				getEFachada().clear();
				getEFachada().addAll((Collection<? extends Fachada>)newValue);
				return;
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				getECache().clear();
				getECache().addAll((Collection<? extends Cache>)newValue);
				return;
			case DependenciesPackage.APP_ADAPTER__EFTP:
				getEFTP().clear();
				getEFTP().addAll((Collection<? extends FTP>)newValue);
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
				getEFachada().clear();
				return;
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				getECache().clear();
				return;
			case DependenciesPackage.APP_ADAPTER__EFTP:
				getEFTP().clear();
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
				return eFachada != null && !eFachada.isEmpty();
			case DependenciesPackage.APP_ADAPTER__ECACHE:
				return eCache != null && !eCache.isEmpty();
			case DependenciesPackage.APP_ADAPTER__EFTP:
				return eFTP != null && !eFTP.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppAdapterImpl
