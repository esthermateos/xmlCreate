/**
 */
package dependencies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.TableParameters#getTable <em>Table</em>}</li>
 *   <li>{@link dependencies.TableParameters#getColumns <em>Columns</em>}</li>
 *   <li>{@link dependencies.TableParameters#getCacheado <em>Cacheado</em>}</li>
 *   <li>{@link dependencies.TableParameters#getEClientArcReferences <em>EClient Arc References</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getTableParameters()
 * @model
 * @generated
 */
public interface TableParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(String)
	 * @see dependencies.DependenciesPackage#getTableParameters_Table()
	 * @model
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link dependencies.TableParameters#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(String)
	 * @see dependencies.DependenciesPackage#getTableParameters_Columns()
	 * @model
	 * @generated
	 */
	String getColumns();

	/**
	 * Sets the value of the '{@link dependencies.TableParameters#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(String value);

	/**
	 * Returns the value of the '<em><b>Cacheado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cacheado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cacheado</em>' attribute.
	 * @see #setCacheado(String)
	 * @see dependencies.DependenciesPackage#getTableParameters_Cacheado()
	 * @model
	 * @generated
	 */
	String getCacheado();

	/**
	 * Sets the value of the '{@link dependencies.TableParameters#getCacheado <em>Cacheado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cacheado</em>' attribute.
	 * @see #getCacheado()
	 * @generated
	 */
	void setCacheado(String value);

	/**
	 * Returns the value of the '<em><b>EClient Arc References</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.ClientArcReferences}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClient Arc References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClient Arc References</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getTableParameters_EClientArcReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClientArcReferences> getEClientArcReferences();

} // TableParameters
