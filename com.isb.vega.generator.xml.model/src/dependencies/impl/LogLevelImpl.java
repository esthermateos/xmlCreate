/**
 */
package dependencies.impl;

import dependencies.DependenciesPackage;
import dependencies.Levels;
import dependencies.LogLevel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link dependencies.impl.LogLevelImpl#getLevelPriority <em>Level Priority</em>}</li>
 *   <li>{@link dependencies.impl.LogLevelImpl#getELevels <em>ELevels</em>}</li>
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
	 * The cached value of the '{@link #getELevels() <em>ELevels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELevels()
	 * @generated
	 * @ordered
	 */
	protected EList<Levels> eLevels;

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
	public EList<Levels> getELevels() {
		if (eLevels == null) {
			eLevels = new EObjectContainmentEList<Levels>(Levels.class, this, DependenciesPackage.LOG_LEVEL__ELEVELS);
		}
		return eLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependenciesPackage.LOG_LEVEL__ELEVELS:
				return ((InternalEList<?>)getELevels()).basicRemove(otherEnd, msgs);
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
			case DependenciesPackage.LOG_LEVEL__ID:
				return getId();
			case DependenciesPackage.LOG_LEVEL__PROPAGATION:
				return getPropagation();
			case DependenciesPackage.LOG_LEVEL__PROPAGATION_PRIORITY:
				return getPropagationPriority();
			case DependenciesPackage.LOG_LEVEL__LEVEL_PRIORITY:
				return getLevelPriority();
			case DependenciesPackage.LOG_LEVEL__ELEVELS:
				return getELevels();
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
			case DependenciesPackage.LOG_LEVEL__ID:
				setId((String)newValue);
				return;
			case DependenciesPackage.LOG_LEVEL__PROPAGATION:
				setPropagation((String)newValue);
				return;
			case DependenciesPackage.LOG_LEVEL__PROPAGATION_PRIORITY:
				setPropagationPriority((String)newValue);
				return;
			case DependenciesPackage.LOG_LEVEL__LEVEL_PRIORITY:
				setLevelPriority((String)newValue);
				return;
			case DependenciesPackage.LOG_LEVEL__ELEVELS:
				getELevels().clear();
				getELevels().addAll((Collection<? extends Levels>)newValue);
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
			case DependenciesPackage.LOG_LEVEL__LEVEL_PRIORITY:
				setLevelPriority(LEVEL_PRIORITY_EDEFAULT);
				return;
			case DependenciesPackage.LOG_LEVEL__ELEVELS:
				getELevels().clear();
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
			case DependenciesPackage.LOG_LEVEL__LEVEL_PRIORITY:
				return LEVEL_PRIORITY_EDEFAULT == null ? levelPriority != null : !LEVEL_PRIORITY_EDEFAULT.equals(levelPriority);
			case DependenciesPackage.LOG_LEVEL__ELEVELS:
				return eLevels != null && !eLevels.isEmpty();
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
		result.append(", levelPriority: ");
		result.append(levelPriority);
		result.append(')');
		return result.toString();
	}

} //LogLevelImpl
