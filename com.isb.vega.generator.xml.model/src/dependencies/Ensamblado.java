/**
 */
package dependencies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ensamblado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.Ensamblado#getName <em>Name</em>}</li>
 *   <li>{@link dependencies.Ensamblado#getELogLevel <em>ELog Level</em>}</li>
 *   <li>{@link dependencies.Ensamblado#getEMultiProfile <em>EMulti Profile</em>}</li>
 *   <li>{@link dependencies.Ensamblado#getEHOST <em>EHOST</em>}</li>
 *   <li>{@link dependencies.Ensamblado#getEJMS <em>EJMS</em>}</li>
 *   <li>{@link dependencies.Ensamblado#getEChannelAdapter <em>EChannel Adapter</em>}</li>
 *   <li>{@link dependencies.Ensamblado#getEEnsamblado <em>EEnsamblado</em>}</li>
 *   <li>{@link dependencies.Ensamblado#getEOP <em>EOP</em>}</li>
 *   <li>{@link dependencies.Ensamblado#getDefaultBankChannel <em>Default Bank Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getEnsamblado()
 * @model
 * @generated
 */
public interface Ensamblado extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dependencies.DependenciesPackage#getEnsamblado_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dependencies.Ensamblado#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ELog Level</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.LogLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELog Level</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELog Level</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getEnsamblado_ELogLevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogLevel> getELogLevel();

	/**
	 * Returns the value of the '<em><b>EMulti Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EMulti Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMulti Profile</em>' containment reference.
	 * @see #setEMultiProfile(MultiProfile)
	 * @see dependencies.DependenciesPackage#getEnsamblado_EMultiProfile()
	 * @model containment="true"
	 * @generated
	 */
	MultiProfile getEMultiProfile();

	/**
	 * Sets the value of the '{@link dependencies.Ensamblado#getEMultiProfile <em>EMulti Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMulti Profile</em>' containment reference.
	 * @see #getEMultiProfile()
	 * @generated
	 */
	void setEMultiProfile(MultiProfile value);

	/**
	 * Returns the value of the '<em><b>EHOST</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EHOST</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EHOST</em>' containment reference.
	 * @see #setEHOST(HOST)
	 * @see dependencies.DependenciesPackage#getEnsamblado_EHOST()
	 * @model containment="true"
	 * @generated
	 */
	HOST getEHOST();

	/**
	 * Sets the value of the '{@link dependencies.Ensamblado#getEHOST <em>EHOST</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EHOST</em>' containment reference.
	 * @see #getEHOST()
	 * @generated
	 */
	void setEHOST(HOST value);

	/**
	 * Returns the value of the '<em><b>EJMS</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.JMS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EJMS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EJMS</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getEnsamblado_EJMS()
	 * @model containment="true"
	 * @generated
	 */
	EList<JMS> getEJMS();

	/**
	 * Returns the value of the '<em><b>EChannel Adapter</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.ChannelAdapter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EChannel Adapter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EChannel Adapter</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getEnsamblado_EChannelAdapter()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChannelAdapter> getEChannelAdapter();

	/**
	 * Returns the value of the '<em><b>EEnsamblado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EEnsamblado</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnsamblado</em>' containment reference.
	 * @see #setEEnsamblado(Security)
	 * @see dependencies.DependenciesPackage#getEnsamblado_EEnsamblado()
	 * @model containment="true"
	 * @generated
	 */
	Security getEEnsamblado();

	/**
	 * Sets the value of the '{@link dependencies.Ensamblado#getEEnsamblado <em>EEnsamblado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EEnsamblado</em>' containment reference.
	 * @see #getEEnsamblado()
	 * @generated
	 */
	void setEEnsamblado(Security value);

	/**
	 * Returns the value of the '<em><b>EOP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOP</em>' containment reference.
	 * @see #setEOP(OP)
	 * @see dependencies.DependenciesPackage#getEnsamblado_EOP()
	 * @model containment="true"
	 * @generated
	 */
	OP getEOP();

	/**
	 * Sets the value of the '{@link dependencies.Ensamblado#getEOP <em>EOP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOP</em>' containment reference.
	 * @see #getEOP()
	 * @generated
	 */
	void setEOP(OP value);

	/**
	 * Returns the value of the '<em><b>Default Bank Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Bank Channel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Bank Channel</em>' attribute.
	 * @see #setDefaultBankChannel(String)
	 * @see dependencies.DependenciesPackage#getEnsamblado_DefaultBankChannel()
	 * @model
	 * @generated
	 */
	String getDefaultBankChannel();

	/**
	 * Sets the value of the '{@link dependencies.Ensamblado#getDefaultBankChannel <em>Default Bank Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Bank Channel</em>' attribute.
	 * @see #getDefaultBankChannel()
	 * @generated
	 */
	void setDefaultBankChannel(String value);

} // Ensamblado
