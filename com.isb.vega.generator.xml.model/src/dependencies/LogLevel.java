/**
 */
package dependencies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.LogLevel#getId <em>Id</em>}</li>
 *   <li>{@link dependencies.LogLevel#getPropagation <em>Propagation</em>}</li>
 *   <li>{@link dependencies.LogLevel#getPropagationPriority <em>Propagation Priority</em>}</li>
 *   <li>{@link dependencies.LogLevel#getLevel <em>Level</em>}</li>
 *   <li>{@link dependencies.LogLevel#getLevelPriority <em>Level Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getLogLevel()
 * @model
 * @generated
 */
public interface LogLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dependencies.DependenciesPackage#getLogLevel_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dependencies.LogLevel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Propagation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagation</em>' attribute.
	 * @see #setPropagation(String)
	 * @see dependencies.DependenciesPackage#getLogLevel_Propagation()
	 * @model
	 * @generated
	 */
	String getPropagation();

	/**
	 * Sets the value of the '{@link dependencies.LogLevel#getPropagation <em>Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagation</em>' attribute.
	 * @see #getPropagation()
	 * @generated
	 */
	void setPropagation(String value);

	/**
	 * Returns the value of the '<em><b>Propagation Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagation Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagation Priority</em>' attribute.
	 * @see #setPropagationPriority(String)
	 * @see dependencies.DependenciesPackage#getLogLevel_PropagationPriority()
	 * @model
	 * @generated
	 */
	String getPropagationPriority();

	/**
	 * Sets the value of the '{@link dependencies.LogLevel#getPropagationPriority <em>Propagation Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagation Priority</em>' attribute.
	 * @see #getPropagationPriority()
	 * @generated
	 */
	void setPropagationPriority(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see dependencies.DependenciesPackage#getLogLevel_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link dependencies.LogLevel#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Level Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Priority</em>' attribute.
	 * @see #setLevelPriority(String)
	 * @see dependencies.DependenciesPackage#getLogLevel_LevelPriority()
	 * @model
	 * @generated
	 */
	String getLevelPriority();

	/**
	 * Sets the value of the '{@link dependencies.LogLevel#getLevelPriority <em>Level Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Priority</em>' attribute.
	 * @see #getLevelPriority()
	 * @generated
	 */
	void setLevelPriority(String value);

} // LogLevel
