/**
 */
package dependencies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component SQL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.ComponentSQL#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link dependencies.ComponentSQL#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link dependencies.ComponentSQL#getDataSourceAlias <em>Data Source Alias</em>}</li>
 *   <li>{@link dependencies.ComponentSQL#getMaxRows <em>Max Rows</em>}</li>
 *   <li>{@link dependencies.ComponentSQL#getPageMaxSize <em>Page Max Size</em>}</li>
 *   <li>{@link dependencies.ComponentSQL#getESQLSentence <em>ESQL Sentence</em>}</li>
 *   <li>{@link dependencies.ComponentSQL#getECache <em>ECache</em>}</li>
 *   <li>{@link dependencies.ComponentSQL#getEFTP <em>EFTP</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getComponentSQL()
 * @model
 * @generated
 */
public interface ComponentSQL extends EObject {
	/**
	 * Returns the value of the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Type</em>' attribute.
	 * @see #setImplementationType(String)
	 * @see dependencies.DependenciesPackage#getComponentSQL_ImplementationType()
	 * @model
	 * @generated
	 */
	String getImplementationType();

	/**
	 * Sets the value of the '{@link dependencies.ComponentSQL#getImplementationType <em>Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Type</em>' attribute.
	 * @see #getImplementationType()
	 * @generated
	 */
	void setImplementationType(String value);

	/**
	 * Returns the value of the '<em><b>Datasource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datasource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasource</em>' attribute.
	 * @see #setDatasource(String)
	 * @see dependencies.DependenciesPackage#getComponentSQL_Datasource()
	 * @model
	 * @generated
	 */
	String getDatasource();

	/**
	 * Sets the value of the '{@link dependencies.ComponentSQL#getDatasource <em>Datasource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasource</em>' attribute.
	 * @see #getDatasource()
	 * @generated
	 */
	void setDatasource(String value);

	/**
	 * Returns the value of the '<em><b>Data Source Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Alias</em>' attribute.
	 * @see #setDataSourceAlias(String)
	 * @see dependencies.DependenciesPackage#getComponentSQL_DataSourceAlias()
	 * @model
	 * @generated
	 */
	String getDataSourceAlias();

	/**
	 * Sets the value of the '{@link dependencies.ComponentSQL#getDataSourceAlias <em>Data Source Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Alias</em>' attribute.
	 * @see #getDataSourceAlias()
	 * @generated
	 */
	void setDataSourceAlias(String value);

	/**
	 * Returns the value of the '<em><b>Max Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Rows</em>' attribute.
	 * @see #setMaxRows(String)
	 * @see dependencies.DependenciesPackage#getComponentSQL_MaxRows()
	 * @model
	 * @generated
	 */
	String getMaxRows();

	/**
	 * Sets the value of the '{@link dependencies.ComponentSQL#getMaxRows <em>Max Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Rows</em>' attribute.
	 * @see #getMaxRows()
	 * @generated
	 */
	void setMaxRows(String value);

	/**
	 * Returns the value of the '<em><b>Page Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Max Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Max Size</em>' attribute.
	 * @see #setPageMaxSize(String)
	 * @see dependencies.DependenciesPackage#getComponentSQL_PageMaxSize()
	 * @model
	 * @generated
	 */
	String getPageMaxSize();

	/**
	 * Sets the value of the '{@link dependencies.ComponentSQL#getPageMaxSize <em>Page Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Max Size</em>' attribute.
	 * @see #getPageMaxSize()
	 * @generated
	 */
	void setPageMaxSize(String value);

	/**
	 * Returns the value of the '<em><b>ESQL Sentence</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.SQLSentence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESQL Sentence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESQL Sentence</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getComponentSQL_ESQLSentence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SQLSentence> getESQLSentence();

	/**
	 * Returns the value of the '<em><b>ECache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECache</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECache</em>' containment reference.
	 * @see #setECache(Cache)
	 * @see dependencies.DependenciesPackage#getComponentSQL_ECache()
	 * @model containment="true"
	 * @generated
	 */
	Cache getECache();

	/**
	 * Sets the value of the '{@link dependencies.ComponentSQL#getECache <em>ECache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECache</em>' containment reference.
	 * @see #getECache()
	 * @generated
	 */
	void setECache(Cache value);

	/**
	 * Returns the value of the '<em><b>EFTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFTP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFTP</em>' containment reference.
	 * @see #setEFTP(FTP)
	 * @see dependencies.DependenciesPackage#getComponentSQL_EFTP()
	 * @model containment="true"
	 * @generated
	 */
	FTP getEFTP();

	/**
	 * Sets the value of the '{@link dependencies.ComponentSQL#getEFTP <em>EFTP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFTP</em>' containment reference.
	 * @see #getEFTP()
	 * @generated
	 */
	void setEFTP(FTP value);

} // ComponentSQL
