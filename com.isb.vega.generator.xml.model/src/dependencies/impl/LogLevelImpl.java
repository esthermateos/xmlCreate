/**
 */
package dependencies.impl;

import dependencies.DependenciesPackage;
import dependencies.LogLevel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.LogLevelImpl#getId <em>Id</em>}</li>
 *   <li>{@link dependencies.impl.LogLevelImpl#getPropagation <em>Propagation</em>}</li>
 *   <li>{@link dependencies.impl.LogLevelImpl#getPropagationPriority <em>Propagation Priority</em>}</li>
 *   <li>{@link dependencies.impl.LogLevelImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link dependencies.impl.LogLevelImpl#getLevelPriority <em>Level Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogLevelImpl extends MinimalEObjectImpl.Container implements LogLevel {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropagation() <em>Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagation()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPAGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropagation() <em>Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagation()
	 * @generated
	 * @ordered
	 */
	protected String propagation = PROPAGATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropagationPriority() <em>Propagation Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagationPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPAGATION_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropagationPriority() <em>Propagation Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagationPriority()
	 * @generated
	 * @ordered
	 */
	protected String propagationPriority = PROPAGATION_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelPriority() <em>Level Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelPriority() <em>Level Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelPriority()
	 * @generated
	 * @ordered
	 */
	protected String levelPriority = LEVEL_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.LOG_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.LOG_LEVEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropagation() {
		return propagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagation(String newPropagation) {
		String oldPropagation = propagation;
		propagation = newPropagation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.LOG_LEVEL__PROPAGATION, oldPropagation, propagation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropagationPriority() {
		return propagationPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagationPriority(String newPropagationPriority) {
		String oldPropagationPriority = propagationPriority;
		propagationPriority = newPropagationPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.LOG_LEVEL__PROPAGATION_PRIORITY, oldPropagationPriority, propagationPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.LOG_LEVEL__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevelPriority() {
		return levelPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelPriority(String newLevelPriority) {
		String oldLevelPriority = levelPriority;
		levelPriority = newLevelPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.LOG_LEVEL__LEVEL_PRIORITY, oldLevelPriority, levelPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependenciesPackage.LOG_LEVEL__ID:
				return getId();
			case DependenciesPackage.LOG_LEVEL__PROPAGATION:
				return getPropagation();
			case DependenciesPackage.LOG_LEVEL__PROPAGATION_PRIORITY:
				return getPropagationPriority();
			case DependenciesPackage.LOG_LEVEL__LEVEL:
				return getLevel();
			case DependenciesPackage.LOG_LEVEL__LEVEL_PRIORITY:
				return getLevelPriority();
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
			case DependenciesPackage.LOG_LEVEL__ID:
				setId((String)newValue);
				return;
			case DependenciesPackage.LOG_LEVEL__PROPAGATION:
				setPropagation((String)newValue);
				return;
			case DependenciesPackage.LOG_LEVEL__PROPAGATION_PRIORITY:
				setPropagationPriority((String)newValue);
				return;
			case DependenciesPackage.LOG_LEVEL__LEVEL:
				setLevel((String)newValue);
				return;
			case DependenciesPackage.LOG_LEVEL__LEVEL_PRIORITY:
				setLevelPriority((String)newValue);
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
			case DependenciesPackage.LOG_LEVEL__ID:
				setId(ID_EDEFAULT);
				return;
			case DependenciesPackage.LOG_LEVEL__PROPAGATION:
				setPropagation(PROPAGATION_EDEFAULT);
				return;
			case DependenciesPackage.LOG_LEVEL__PROPAGATION_PRIORITY:
				setPropagationPriority(PROPAGATION_PRIORITY_EDEFAULT);
				return;
			case DependenciesPackage.LOG_LEVEL__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case DependenciesPackage.LOG_LEVEL__LEVEL_PRIORITY:
				setLevelPriority(LEVEL_PRIORITY_EDEFAULT);
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
			case DependenciesPackage.LOG_LEVEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DependenciesPackage.LOG_LEVEL__PROPAGATION:
				return PROPAGATION_EDEFAULT == null ? propagation != null : !PROPAGATION_EDEFAULT.equals(propagation);
			case DependenciesPackage.LOG_LEVEL__PROPAGATION_PRIORITY:
				return PROPAGATION_PRIORITY_EDEFAULT == null ? propagationPriority != null : !PROPAGATION_PRIORITY_EDEFAULT.equals(propagationPriority);
			case DependenciesPackage.LOG_LEVEL__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case DependenciesPackage.LOG_LEVEL__LEVEL_PRIORITY:
				return LEVEL_PRIORITY_EDEFAULT == null ? levelPriority != null : !LEVEL_PRIORITY_EDEFAULT.equals(levelPriority);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", propagation: ");
		result.append(propagation);
		result.append(", propagationPriority: ");
		result.append(propagationPriority);
		result.append(", level: ");
		result.append(level);
		result.append(", levelPriority: ");
		result.append(levelPriority);
		result.append(')');
		return result.toString();
	}

} //LogLevelImpl
