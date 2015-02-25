/**
 */
package dependencies.impl;

import dependencies.Cache;
import dependencies.ComponentSQL;
import dependencies.DependenciesPackage;
import dependencies.FTP;
import dependencies.SQLSentence;

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
 * An implementation of the model object '<em><b>Component SQL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.ComponentSQLImpl#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link dependencies.impl.ComponentSQLImpl#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link dependencies.impl.ComponentSQLImpl#getDataSourceAlias <em>Data Source Alias</em>}</li>
 *   <li>{@link dependencies.impl.ComponentSQLImpl#getMaxRows <em>Max Rows</em>}</li>
 *   <li>{@link dependencies.impl.ComponentSQLImpl#getPageMaxSize <em>Page Max Size</em>}</li>
 *   <li>{@link dependencies.impl.ComponentSQLImpl#getESQLSentence <em>ESQL Sentence</em>}</li>
 *   <li>{@link dependencies.impl.ComponentSQLImpl#getECache <em>ECache</em>}</li>
 *   <li>{@link dependencies.impl.ComponentSQLImpl#getEFTP <em>EFTP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentSQLImpl extends MinimalEObjectImpl.Container implements ComponentSQL {
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
	protected EList<SQLSentence> eSQLSentence;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSQLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.COMPONENT_SQL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.COMPONENT_SQL__IMPLEMENTATION_TYPE, oldImplementationType, implementationType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.COMPONENT_SQL__DATASOURCE, oldDatasource, datasource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.COMPONENT_SQL__DATA_SOURCE_ALIAS, oldDataSourceAlias, dataSourceAlias));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.COMPONENT_SQL__MAX_ROWS, oldMaxRows, maxRows));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.COMPONENT_SQL__PAGE_MAX_SIZE, oldPageMaxSize, pageMaxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SQLSentence> getESQLSentence() {
		if (eSQLSentence == null) {
			eSQLSentence = new EObjectContainmentEList<SQLSentence>(SQLSentence.class, this, DependenciesPackage.COMPONENT_SQL__ESQL_SENTENCE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependenciesPackage.COMPONENT_SQL__ECACHE, oldECache, newECache);
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
				msgs = ((InternalEObject)eCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.COMPONENT_SQL__ECACHE, null, msgs);
			if (newECache != null)
				msgs = ((InternalEObject)newECache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.COMPONENT_SQL__ECACHE, null, msgs);
			msgs = basicSetECache(newECache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.COMPONENT_SQL__ECACHE, newECache, newECache));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependenciesPackage.COMPONENT_SQL__EFTP, oldEFTP, newEFTP);
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
				msgs = ((InternalEObject)eFTP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.COMPONENT_SQL__EFTP, null, msgs);
			if (newEFTP != null)
				msgs = ((InternalEObject)newEFTP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.COMPONENT_SQL__EFTP, null, msgs);
			msgs = basicSetEFTP(newEFTP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.COMPONENT_SQL__EFTP, newEFTP, newEFTP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependenciesPackage.COMPONENT_SQL__ESQL_SENTENCE:
				return ((InternalEList<?>)getESQLSentence()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.COMPONENT_SQL__ECACHE:
				return basicSetECache(null, msgs);
			case DependenciesPackage.COMPONENT_SQL__EFTP:
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
			case DependenciesPackage.COMPONENT_SQL__IMPLEMENTATION_TYPE:
				return getImplementationType();
			case DependenciesPackage.COMPONENT_SQL__DATASOURCE:
				return getDatasource();
			case DependenciesPackage.COMPONENT_SQL__DATA_SOURCE_ALIAS:
				return getDataSourceAlias();
			case DependenciesPackage.COMPONENT_SQL__MAX_ROWS:
				return getMaxRows();
			case DependenciesPackage.COMPONENT_SQL__PAGE_MAX_SIZE:
				return getPageMaxSize();
			case DependenciesPackage.COMPONENT_SQL__ESQL_SENTENCE:
				return getESQLSentence();
			case DependenciesPackage.COMPONENT_SQL__ECACHE:
				return getECache();
			case DependenciesPackage.COMPONENT_SQL__EFTP:
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
			case DependenciesPackage.COMPONENT_SQL__IMPLEMENTATION_TYPE:
				setImplementationType((String)newValue);
				return;
			case DependenciesPackage.COMPONENT_SQL__DATASOURCE:
				setDatasource((String)newValue);
				return;
			case DependenciesPackage.COMPONENT_SQL__DATA_SOURCE_ALIAS:
				setDataSourceAlias((String)newValue);
				return;
			case DependenciesPackage.COMPONENT_SQL__MAX_ROWS:
				setMaxRows((String)newValue);
				return;
			case DependenciesPackage.COMPONENT_SQL__PAGE_MAX_SIZE:
				setPageMaxSize((String)newValue);
				return;
			case DependenciesPackage.COMPONENT_SQL__ESQL_SENTENCE:
				getESQLSentence().clear();
				getESQLSentence().addAll((Collection<? extends SQLSentence>)newValue);
				return;
			case DependenciesPackage.COMPONENT_SQL__ECACHE:
				setECache((Cache)newValue);
				return;
			case DependenciesPackage.COMPONENT_SQL__EFTP:
				setEFTP((FTP)newValue);
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
			case DependenciesPackage.COMPONENT_SQL__IMPLEMENTATION_TYPE:
				setImplementationType(IMPLEMENTATION_TYPE_EDEFAULT);
				return;
			case DependenciesPackage.COMPONENT_SQL__DATASOURCE:
				setDatasource(DATASOURCE_EDEFAULT);
				return;
			case DependenciesPackage.COMPONENT_SQL__DATA_SOURCE_ALIAS:
				setDataSourceAlias(DATA_SOURCE_ALIAS_EDEFAULT);
				return;
			case DependenciesPackage.COMPONENT_SQL__MAX_ROWS:
				setMaxRows(MAX_ROWS_EDEFAULT);
				return;
			case DependenciesPackage.COMPONENT_SQL__PAGE_MAX_SIZE:
				setPageMaxSize(PAGE_MAX_SIZE_EDEFAULT);
				return;
			case DependenciesPackage.COMPONENT_SQL__ESQL_SENTENCE:
				getESQLSentence().clear();
				return;
			case DependenciesPackage.COMPONENT_SQL__ECACHE:
				setECache((Cache)null);
				return;
			case DependenciesPackage.COMPONENT_SQL__EFTP:
				setEFTP((FTP)null);
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
			case DependenciesPackage.COMPONENT_SQL__IMPLEMENTATION_TYPE:
				return IMPLEMENTATION_TYPE_EDEFAULT == null ? implementationType != null : !IMPLEMENTATION_TYPE_EDEFAULT.equals(implementationType);
			case DependenciesPackage.COMPONENT_SQL__DATASOURCE:
				return DATASOURCE_EDEFAULT == null ? datasource != null : !DATASOURCE_EDEFAULT.equals(datasource);
			case DependenciesPackage.COMPONENT_SQL__DATA_SOURCE_ALIAS:
				return DATA_SOURCE_ALIAS_EDEFAULT == null ? dataSourceAlias != null : !DATA_SOURCE_ALIAS_EDEFAULT.equals(dataSourceAlias);
			case DependenciesPackage.COMPONENT_SQL__MAX_ROWS:
				return MAX_ROWS_EDEFAULT == null ? maxRows != null : !MAX_ROWS_EDEFAULT.equals(maxRows);
			case DependenciesPackage.COMPONENT_SQL__PAGE_MAX_SIZE:
				return PAGE_MAX_SIZE_EDEFAULT == null ? pageMaxSize != null : !PAGE_MAX_SIZE_EDEFAULT.equals(pageMaxSize);
			case DependenciesPackage.COMPONENT_SQL__ESQL_SENTENCE:
				return eSQLSentence != null && !eSQLSentence.isEmpty();
			case DependenciesPackage.COMPONENT_SQL__ECACHE:
				return eCache != null;
			case DependenciesPackage.COMPONENT_SQL__EFTP:
				return eFTP != null;
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

} //ComponentSQLImpl
