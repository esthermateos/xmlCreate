/**
 */
package dependencies.impl;

import dependencies.Cache;
import dependencies.DependenciesPackage;
import dependencies.SQLComponent;
import dependencies.eFachada;

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
 * An implementation of the model object '<em><b>SQL Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.SQLComponentImpl#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link dependencies.impl.SQLComponentImpl#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link dependencies.impl.SQLComponentImpl#getDataSourceAlias <em>Data Source Alias</em>}</li>
 *   <li>{@link dependencies.impl.SQLComponentImpl#getMaxRows <em>Max Rows</em>}</li>
 *   <li>{@link dependencies.impl.SQLComponentImpl#getPageMaxSize <em>Page Max Size</em>}</li>
 *   <li>{@link dependencies.impl.SQLComponentImpl#getESQLSentence <em>ESQL Sentence</em>}</li>
 *   <li>{@link dependencies.impl.SQLComponentImpl#getECache <em>ECache</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SQLComponentImpl extends MinimalEObjectImpl.Container implements SQLComponent {
	/**
	 * The default value of the '{@link #getImplementationType() <em>Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationType()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationType() <em>Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationType()
	 * @generated
	 * @ordered
	 */
	protected String implementationType = IMPLEMENTATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatasource() <em>Datasource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasource()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatasource() <em>Datasource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasource()
	 * @generated
	 * @ordered
	 */
	protected String datasource = DATASOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSourceAlias() <em>Data Source Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourceAlias() <em>Data Source Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceAlias()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceAlias = DATA_SOURCE_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRows() <em>Max Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRows()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_ROWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRows() <em>Max Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRows()
	 * @generated
	 * @ordered
	 */
	protected String maxRows = MAX_ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageMaxSize() <em>Page Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageMaxSize()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_MAX_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageMaxSize() <em>Page Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageMaxSize()
	 * @generated
	 * @ordered
	 */
	protected String pageMaxSize = PAGE_MAX_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getESQLSentence() <em>ESQL Sentence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESQLSentence()
	 * @generated
	 * @ordered
	 */
	protected EList<eFachada> eSQLSentence;

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
	protected SQLComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.SQL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementationType() {
		return implementationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationType(String newImplementationType) {
		String oldImplementationType = implementationType;
		implementationType = newImplementationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.SQL_COMPONENT__IMPLEMENTATION_TYPE, oldImplementationType, implementationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatasource() {
		return datasource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatasource(String newDatasource) {
		String oldDatasource = datasource;
		datasource = newDatasource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.SQL_COMPONENT__DATASOURCE, oldDatasource, datasource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSourceAlias() {
		return dataSourceAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceAlias(String newDataSourceAlias) {
		String oldDataSourceAlias = dataSourceAlias;
		dataSourceAlias = newDataSourceAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.SQL_COMPONENT__DATA_SOURCE_ALIAS, oldDataSourceAlias, dataSourceAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxRows() {
		return maxRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRows(String newMaxRows) {
		String oldMaxRows = maxRows;
		maxRows = newMaxRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.SQL_COMPONENT__MAX_ROWS, oldMaxRows, maxRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageMaxSize() {
		return pageMaxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageMaxSize(String newPageMaxSize) {
		String oldPageMaxSize = pageMaxSize;
		pageMaxSize = newPageMaxSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.SQL_COMPONENT__PAGE_MAX_SIZE, oldPageMaxSize, pageMaxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<eFachada> getESQLSentence() {
		if (eSQLSentence == null) {
			eSQLSentence = new EObjectContainmentEList<eFachada>(eFachada.class, this, DependenciesPackage.SQL_COMPONENT__ESQL_SENTENCE);
		}
		return eSQLSentence;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependenciesPackage.SQL_COMPONENT__ECACHE, oldECache, newECache);
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
				msgs = ((InternalEObject)eCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.SQL_COMPONENT__ECACHE, null, msgs);
			if (newECache != null)
				msgs = ((InternalEObject)newECache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.SQL_COMPONENT__ECACHE, null, msgs);
			msgs = basicSetECache(newECache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.SQL_COMPONENT__ECACHE, newECache, newECache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependenciesPackage.SQL_COMPONENT__ESQL_SENTENCE:
				return ((InternalEList<?>)getESQLSentence()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.SQL_COMPONENT__ECACHE:
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
			case DependenciesPackage.SQL_COMPONENT__IMPLEMENTATION_TYPE:
				return getImplementationType();
			case DependenciesPackage.SQL_COMPONENT__DATASOURCE:
				return getDatasource();
			case DependenciesPackage.SQL_COMPONENT__DATA_SOURCE_ALIAS:
				return getDataSourceAlias();
			case DependenciesPackage.SQL_COMPONENT__MAX_ROWS:
				return getMaxRows();
			case DependenciesPackage.SQL_COMPONENT__PAGE_MAX_SIZE:
				return getPageMaxSize();
			case DependenciesPackage.SQL_COMPONENT__ESQL_SENTENCE:
				return getESQLSentence();
			case DependenciesPackage.SQL_COMPONENT__ECACHE:
				return getECache();
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
			case DependenciesPackage.SQL_COMPONENT__IMPLEMENTATION_TYPE:
				setImplementationType((String)newValue);
				return;
			case DependenciesPackage.SQL_COMPONENT__DATASOURCE:
				setDatasource((String)newValue);
				return;
			case DependenciesPackage.SQL_COMPONENT__DATA_SOURCE_ALIAS:
				setDataSourceAlias((String)newValue);
				return;
			case DependenciesPackage.SQL_COMPONENT__MAX_ROWS:
				setMaxRows((String)newValue);
				return;
			case DependenciesPackage.SQL_COMPONENT__PAGE_MAX_SIZE:
				setPageMaxSize((String)newValue);
				return;
			case DependenciesPackage.SQL_COMPONENT__ESQL_SENTENCE:
				getESQLSentence().clear();
				getESQLSentence().addAll((Collection<? extends eFachada>)newValue);
				return;
			case DependenciesPackage.SQL_COMPONENT__ECACHE:
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
			case DependenciesPackage.SQL_COMPONENT__IMPLEMENTATION_TYPE:
				setImplementationType(IMPLEMENTATION_TYPE_EDEFAULT);
				return;
			case DependenciesPackage.SQL_COMPONENT__DATASOURCE:
				setDatasource(DATASOURCE_EDEFAULT);
				return;
			case DependenciesPackage.SQL_COMPONENT__DATA_SOURCE_ALIAS:
				setDataSourceAlias(DATA_SOURCE_ALIAS_EDEFAULT);
				return;
			case DependenciesPackage.SQL_COMPONENT__MAX_ROWS:
				setMaxRows(MAX_ROWS_EDEFAULT);
				return;
			case DependenciesPackage.SQL_COMPONENT__PAGE_MAX_SIZE:
				setPageMaxSize(PAGE_MAX_SIZE_EDEFAULT);
				return;
			case DependenciesPackage.SQL_COMPONENT__ESQL_SENTENCE:
				getESQLSentence().clear();
				return;
			case DependenciesPackage.SQL_COMPONENT__ECACHE:
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
			case DependenciesPackage.SQL_COMPONENT__IMPLEMENTATION_TYPE:
				return IMPLEMENTATION_TYPE_EDEFAULT == null ? implementationType != null : !IMPLEMENTATION_TYPE_EDEFAULT.equals(implementationType);
			case DependenciesPackage.SQL_COMPONENT__DATASOURCE:
				return DATASOURCE_EDEFAULT == null ? datasource != null : !DATASOURCE_EDEFAULT.equals(datasource);
			case DependenciesPackage.SQL_COMPONENT__DATA_SOURCE_ALIAS:
				return DATA_SOURCE_ALIAS_EDEFAULT == null ? dataSourceAlias != null : !DATA_SOURCE_ALIAS_EDEFAULT.equals(dataSourceAlias);
			case DependenciesPackage.SQL_COMPONENT__MAX_ROWS:
				return MAX_ROWS_EDEFAULT == null ? maxRows != null : !MAX_ROWS_EDEFAULT.equals(maxRows);
			case DependenciesPackage.SQL_COMPONENT__PAGE_MAX_SIZE:
				return PAGE_MAX_SIZE_EDEFAULT == null ? pageMaxSize != null : !PAGE_MAX_SIZE_EDEFAULT.equals(pageMaxSize);
			case DependenciesPackage.SQL_COMPONENT__ESQL_SENTENCE:
				return eSQLSentence != null && !eSQLSentence.isEmpty();
			case DependenciesPackage.SQL_COMPONENT__ECACHE:
				return eCache != null;
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
		result.append(" (implementationType: ");
		result.append(implementationType);
		result.append(", datasource: ");
		result.append(datasource);
		result.append(", dataSourceAlias: ");
		result.append(dataSourceAlias);
		result.append(", maxRows: ");
		result.append(maxRows);
		result.append(", pageMaxSize: ");
		result.append(pageMaxSize);
		result.append(')');
		return result.toString();
	}

} //SQLComponentImpl
