/**
 */
package dependencies.impl;

import dependencies.ClientArcReferences;
import dependencies.DependenciesPackage;
import dependencies.TableParameters;

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
 * An implementation of the model object '<em><b>Table Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.TableParametersImpl#getTable <em>Table</em>}</li>
 *   <li>{@link dependencies.impl.TableParametersImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link dependencies.impl.TableParametersImpl#getCacheado <em>Cacheado</em>}</li>
 *   <li>{@link dependencies.impl.TableParametersImpl#getEClientArcReferences <em>EClient Arc References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableParametersImpl extends MinimalEObjectImpl.Container implements TableParameters {
	/**
	 * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected String table = TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected String columns = COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheado() <em>Cacheado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheado()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHEADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheado() <em>Cacheado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheado()
	 * @generated
	 * @ordered
	 */
	protected String cacheado = CACHEADO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEClientArcReferences() <em>EClient Arc References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClientArcReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ClientArcReferences> eClientArcReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.TABLE_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(String newTable) {
		String oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.TABLE_PARAMETERS__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(String newColumns) {
		String oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.TABLE_PARAMETERS__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCacheado() {
		return cacheado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheado(String newCacheado) {
		String oldCacheado = cacheado;
		cacheado = newCacheado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.TABLE_PARAMETERS__CACHEADO, oldCacheado, cacheado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClientArcReferences> getEClientArcReferences() {
		if (eClientArcReferences == null) {
			eClientArcReferences = new EObjectContainmentEList<ClientArcReferences>(ClientArcReferences.class, this, DependenciesPackage.TABLE_PARAMETERS__ECLIENT_ARC_REFERENCES);
		}
		return eClientArcReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependenciesPackage.TABLE_PARAMETERS__ECLIENT_ARC_REFERENCES:
				return ((InternalEList<?>)getEClientArcReferences()).basicRemove(otherEnd, msgs);
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
			case DependenciesPackage.TABLE_PARAMETERS__TABLE:
				return getTable();
			case DependenciesPackage.TABLE_PARAMETERS__COLUMNS:
				return getColumns();
			case DependenciesPackage.TABLE_PARAMETERS__CACHEADO:
				return getCacheado();
			case DependenciesPackage.TABLE_PARAMETERS__ECLIENT_ARC_REFERENCES:
				return getEClientArcReferences();
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
			case DependenciesPackage.TABLE_PARAMETERS__TABLE:
				setTable((String)newValue);
				return;
			case DependenciesPackage.TABLE_PARAMETERS__COLUMNS:
				setColumns((String)newValue);
				return;
			case DependenciesPackage.TABLE_PARAMETERS__CACHEADO:
				setCacheado((String)newValue);
				return;
			case DependenciesPackage.TABLE_PARAMETERS__ECLIENT_ARC_REFERENCES:
				getEClientArcReferences().clear();
				getEClientArcReferences().addAll((Collection<? extends ClientArcReferences>)newValue);
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
			case DependenciesPackage.TABLE_PARAMETERS__TABLE:
				setTable(TABLE_EDEFAULT);
				return;
			case DependenciesPackage.TABLE_PARAMETERS__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case DependenciesPackage.TABLE_PARAMETERS__CACHEADO:
				setCacheado(CACHEADO_EDEFAULT);
				return;
			case DependenciesPackage.TABLE_PARAMETERS__ECLIENT_ARC_REFERENCES:
				getEClientArcReferences().clear();
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
			case DependenciesPackage.TABLE_PARAMETERS__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
			case DependenciesPackage.TABLE_PARAMETERS__COLUMNS:
				return COLUMNS_EDEFAULT == null ? columns != null : !COLUMNS_EDEFAULT.equals(columns);
			case DependenciesPackage.TABLE_PARAMETERS__CACHEADO:
				return CACHEADO_EDEFAULT == null ? cacheado != null : !CACHEADO_EDEFAULT.equals(cacheado);
			case DependenciesPackage.TABLE_PARAMETERS__ECLIENT_ARC_REFERENCES:
				return eClientArcReferences != null && !eClientArcReferences.isEmpty();
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
		result.append(" (table: ");
		result.append(table);
		result.append(", columns: ");
		result.append(columns);
		result.append(", cacheado: ");
		result.append(cacheado);
		result.append(')');
		return result.toString();
	}

} //TableParametersImpl
