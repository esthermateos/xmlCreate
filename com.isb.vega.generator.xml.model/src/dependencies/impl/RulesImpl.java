/**
 */
package dependencies.impl;

import dependencies.DependenciesPackage;
import dependencies.Rules;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.RulesImpl#getIdLit <em>Id Lit</em>}</li>
 *   <li>{@link dependencies.impl.RulesImpl#getLit <em>Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RulesImpl extends MinimalEObjectImpl.Container implements Rules {
	/**
	 * The default value of the '{@link #getIdLit() <em>Id Lit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdLit()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_LIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdLit() <em>Id Lit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdLit()
	 * @generated
	 * @ordered
	 */
	protected String idLit = ID_LIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLit() <em>Lit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLit()
	 * @generated
	 * @ordered
	 */
	protected static final String LIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLit() <em>Lit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLit()
	 * @generated
	 * @ordered
	 */
	protected String lit = LIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.RULES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdLit() {
		return idLit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdLit(String newIdLit) {
		String oldIdLit = idLit;
		idLit = newIdLit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.RULES__ID_LIT, oldIdLit, idLit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLit() {
		return lit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLit(String newLit) {
		String oldLit = lit;
		lit = newLit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.RULES__LIT, oldLit, lit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependenciesPackage.RULES__ID_LIT:
				return getIdLit();
			case DependenciesPackage.RULES__LIT:
				return getLit();
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
			case DependenciesPackage.RULES__ID_LIT:
				setIdLit((String)newValue);
				return;
			case DependenciesPackage.RULES__LIT:
				setLit((String)newValue);
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
			case DependenciesPackage.RULES__ID_LIT:
				setIdLit(ID_LIT_EDEFAULT);
				return;
			case DependenciesPackage.RULES__LIT:
				setLit(LIT_EDEFAULT);
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
			case DependenciesPackage.RULES__ID_LIT:
				return ID_LIT_EDEFAULT == null ? idLit != null : !ID_LIT_EDEFAULT.equals(idLit);
			case DependenciesPackage.RULES__LIT:
				return LIT_EDEFAULT == null ? lit != null : !LIT_EDEFAULT.equals(lit);
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
		result.append(" (idLit: ");
		result.append(idLit);
		result.append(", lit: ");
		result.append(lit);
		result.append(')');
		return result.toString();
	}

} //RulesImpl
