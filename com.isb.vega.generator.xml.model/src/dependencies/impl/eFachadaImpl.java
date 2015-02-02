/**
 */
package dependencies.impl;

import dependencies.DependenciesPackage;
import dependencies.Fachada;
import dependencies.eFachada;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>eFachada</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.eFachadaImpl#getName <em>Name</em>}</li>
 *   <li>{@link dependencies.impl.eFachadaImpl#getType <em>Type</em>}</li>
 *   <li>{@link dependencies.impl.eFachadaImpl#getSql <em>Sql</em>}</li>
 *   <li>{@link dependencies.impl.eFachadaImpl#getEFachada <em>EFachada</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class eFachadaImpl extends MinimalEObjectImpl.Container implements eFachada {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSql() <em>Sql</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSql()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSql() <em>Sql</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSql()
	 * @generated
	 * @ordered
	 */
	protected String sql = SQL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected eFachadaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.EFACHADA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.EFACHADA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.EFACHADA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSql() {
		return sql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSql(String newSql) {
		String oldSql = sql;
		sql = newSql;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.EFACHADA__SQL, oldSql, sql));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependenciesPackage.EFACHADA__EFACHADA, oldEFachada, eFachada));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.EFACHADA__EFACHADA, oldEFachada, eFachada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependenciesPackage.EFACHADA__NAME:
				return getName();
			case DependenciesPackage.EFACHADA__TYPE:
				return getType();
			case DependenciesPackage.EFACHADA__SQL:
				return getSql();
			case DependenciesPackage.EFACHADA__EFACHADA:
				if (resolve) return getEFachada();
				return basicGetEFachada();
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
			case DependenciesPackage.EFACHADA__NAME:
				setName((String)newValue);
				return;
			case DependenciesPackage.EFACHADA__TYPE:
				setType((String)newValue);
				return;
			case DependenciesPackage.EFACHADA__SQL:
				setSql((String)newValue);
				return;
			case DependenciesPackage.EFACHADA__EFACHADA:
				setEFachada((Fachada)newValue);
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
			case DependenciesPackage.EFACHADA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DependenciesPackage.EFACHADA__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DependenciesPackage.EFACHADA__SQL:
				setSql(SQL_EDEFAULT);
				return;
			case DependenciesPackage.EFACHADA__EFACHADA:
				setEFachada((Fachada)null);
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
			case DependenciesPackage.EFACHADA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DependenciesPackage.EFACHADA__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DependenciesPackage.EFACHADA__SQL:
				return SQL_EDEFAULT == null ? sql != null : !SQL_EDEFAULT.equals(sql);
			case DependenciesPackage.EFACHADA__EFACHADA:
				return eFachada != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", sql: ");
		result.append(sql);
		result.append(')');
		return result.toString();
	}

} //eFachadaImpl
