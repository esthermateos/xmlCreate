/**
 */
package dependencies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HOST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dependencies.HOST#getSatProtocol <em>Sat Protocol</em>}</li>
 *   <li>{@link dependencies.HOST#getSatAlias <em>Sat Alias</em>}</li>
 *   <li>{@link dependencies.HOST#getSatTimeOut <em>Sat Time Out</em>}</li>
 *   <li>{@link dependencies.HOST#getSatNullValues <em>Sat Null Values</em>}</li>
 *   <li>{@link dependencies.HOST#getSatNullWhenSpaces <em>Sat Null When Spaces</em>}</li>
 *   <li>{@link dependencies.HOST#getTrxOPDefaultMode <em>Trx OP Default Mode</em>}</li>
 *   <li>{@link dependencies.HOST#getTrxOPTCPAlias <em>Trx OPTCP Alias</em>}</li>
 *   <li>{@link dependencies.HOST#getAltairProtocol <em>Altair Protocol</em>}</li>
 *   <li>{@link dependencies.HOST#getAltairAlias <em>Altair Alias</em>}</li>
 *   <li>{@link dependencies.HOST#getRedProtocol <em>Red Protocol</em>}</li>
 *   <li>{@link dependencies.HOST#getTrxprotocol <em>Trxprotocol</em>}</li>
 *   <li>{@link dependencies.HOST#getEOPLogicalChannel <em>EOP Logical Channel</em>}</li>
 *   <li>{@link dependencies.HOST#getEPhysicalChannel <em>EPhysical Channel</em>}</li>
 *   <li>{@link dependencies.HOST#getESATLogicalChannel <em>ESAT Logical Channel</em>}</li>
 *   <li>{@link dependencies.HOST#getESATPhysicalChannel <em>ESAT Physical Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see dependencies.DependenciesPackage#getHOST()
 * @model
 * @generated
 */
public interface HOST extends EObject {
	/**
	 * Returns the value of the '<em><b>Sat Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sat Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sat Protocol</em>' attribute.
	 * @see #setSatProtocol(String)
	 * @see dependencies.DependenciesPackage#getHOST_SatProtocol()
	 * @model
	 * @generated
	 */
	String getSatProtocol();

	/**
	 * Sets the value of the '{@link dependencies.HOST#getSatProtocol <em>Sat Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sat Protocol</em>' attribute.
	 * @see #getSatProtocol()
	 * @generated
	 */
	void setSatProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Sat Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sat Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sat Alias</em>' attribute.
	 * @see #setSatAlias(String)
	 * @see dependencies.DependenciesPackage#getHOST_SatAlias()
	 * @model
	 * @generated
	 */
	String getSatAlias();

	/**
	 * Sets the value of the '{@link dependencies.HOST#getSatAlias <em>Sat Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sat Alias</em>' attribute.
	 * @see #getSatAlias()
	 * @generated
	 */
	void setSatAlias(String value);

	/**
	 * Returns the value of the '<em><b>Sat Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sat Time Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sat Time Out</em>' attribute.
	 * @see #setSatTimeOut(String)
	 * @see dependencies.DependenciesPackage#getHOST_SatTimeOut()
	 * @model
	 * @generated
	 */
	String getSatTimeOut();

	/**
	 * Sets the value of the '{@link dependencies.HOST#getSatTimeOut <em>Sat Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sat Time Out</em>' attribute.
	 * @see #getSatTimeOut()
	 * @generated
	 */
	void setSatTimeOut(String value);

	/**
	 * Returns the value of the '<em><b>Sat Null Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sat Null Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sat Null Values</em>' attribute.
	 * @see #setSatNullValues(String)
	 * @see dependencies.DependenciesPackage#getHOST_SatNullValues()
	 * @model
	 * @generated
	 */
	String getSatNullValues();

	/**
	 * Sets the value of the '{@link dependencies.HOST#getSatNullValues <em>Sat Null Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sat Null Values</em>' attribute.
	 * @see #getSatNullValues()
	 * @generated
	 */
	void setSatNullValues(String value);

	/**
	 * Returns the value of the '<em><b>Sat Null When Spaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sat Null When Spaces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sat Null When Spaces</em>' attribute.
	 * @see #setSatNullWhenSpaces(String)
	 * @see dependencies.DependenciesPackage#getHOST_SatNullWhenSpaces()
	 * @model
	 * @generated
	 */
	String getSatNullWhenSpaces();

	/**
	 * Sets the value of the '{@link dependencies.HOST#getSatNullWhenSpaces <em>Sat Null When Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sat Null When Spaces</em>' attribute.
	 * @see #getSatNullWhenSpaces()
	 * @generated
	 */
	void setSatNullWhenSpaces(String value);

	/**
	 * Returns the value of the '<em><b>Trx OP Default Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trx OP Default Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trx OP Default Mode</em>' attribute.
	 * @see #setTrxOPDefaultMode(String)
	 * @see dependencies.DependenciesPackage#getHOST_TrxOPDefaultMode()
	 * @model
	 * @generated
	 */
	String getTrxOPDefaultMode();

	/**
	 * Sets the value of the '{@link dependencies.HOST#getTrxOPDefaultMode <em>Trx OP Default Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trx OP Default Mode</em>' attribute.
	 * @see #getTrxOPDefaultMode()
	 * @generated
	 */
	void setTrxOPDefaultMode(String value);

	/**
	 * Returns the value of the '<em><b>Trx OPTCP Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trx OPTCP Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trx OPTCP Alias</em>' attribute.
	 * @see #setTrxOPTCPAlias(String)
	 * @see dependencies.DependenciesPackage#getHOST_TrxOPTCPAlias()
	 * @model
	 * @generated
	 */
	String getTrxOPTCPAlias();

	/**
	 * Sets the value of the '{@link dependencies.HOST#getTrxOPTCPAlias <em>Trx OPTCP Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trx OPTCP Alias</em>' attribute.
	 * @see #getTrxOPTCPAlias()
	 * @generated
	 */
	void setTrxOPTCPAlias(String value);

	/**
	 * Returns the value of the '<em><b>Altair Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altair Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altair Protocol</em>' attribute.
	 * @see #setAltairProtocol(String)
	 * @see dependencies.DependenciesPackage#getHOST_AltairProtocol()
	 * @model
	 * @generated
	 */
	String getAltairProtocol();

	/**
	 * Sets the value of the '{@link dependencies.HOST#getAltairProtocol <em>Altair Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altair Protocol</em>' attribute.
	 * @see #getAltairProtocol()
	 * @generated
	 */
	void setAltairProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Altair Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altair Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altair Alias</em>' attribute.
	 * @see #setAltairAlias(String)
	 * @see dependencies.DependenciesPackage#getHOST_AltairAlias()
	 * @model
	 * @generated
	 */
	String getAltairAlias();

	/**
	 * Sets the value of the '{@link dependencies.HOST#getAltairAlias <em>Altair Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altair Alias</em>' attribute.
	 * @see #getAltairAlias()
	 * @generated
	 */
	void setAltairAlias(String value);

	/**
	 * Returns the value of the '<em><b>Red Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Protocol</em>' attribute.
	 * @see #setRedProtocol(String)
	 * @see dependencies.DependenciesPackage#getHOST_RedProtocol()
	 * @model
	 * @generated
	 */
	String getRedProtocol();

	/**
	 * Sets the value of the '{@link dependencies.HOST#getRedProtocol <em>Red Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red Protocol</em>' attribute.
	 * @see #getRedProtocol()
	 * @generated
	 */
	void setRedProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Trxprotocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trxprotocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trxprotocol</em>' attribute.
	 * @see #setTrxprotocol(String)
	 * @see dependencies.DependenciesPackage#getHOST_Trxprotocol()
	 * @model
	 * @generated
	 */
	String getTrxprotocol();

	/**
	 * Sets the value of the '{@link dependencies.HOST#getTrxprotocol <em>Trxprotocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trxprotocol</em>' attribute.
	 * @see #getTrxprotocol()
	 * @generated
	 */
	void setTrxprotocol(String value);

	/**
	 * Returns the value of the '<em><b>EOP Logical Channel</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.trxOPLogicalChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOP Logical Channel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOP Logical Channel</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getHOST_EOPLogicalChannel()
	 * @model containment="true"
	 * @generated
	 */
	EList<trxOPLogicalChannel> getEOPLogicalChannel();

	/**
	 * Returns the value of the '<em><b>EPhysical Channel</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.trxOPPhysicalChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPhysical Channel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPhysical Channel</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getHOST_EPhysicalChannel()
	 * @model containment="true"
	 * @generated
	 */
	EList<trxOPPhysicalChannel> getEPhysicalChannel();

	/**
	 * Returns the value of the '<em><b>ESAT Logical Channel</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.SATLogicalChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESAT Logical Channel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESAT Logical Channel</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getHOST_ESATLogicalChannel()
	 * @model containment="true"
	 * @generated
	 */
	EList<SATLogicalChannel> getESATLogicalChannel();

	/**
	 * Returns the value of the '<em><b>ESAT Physical Channel</b></em>' containment reference list.
	 * The list contents are of type {@link dependencies.SATPhysicalChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESAT Physical Channel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESAT Physical Channel</em>' containment reference list.
	 * @see dependencies.DependenciesPackage#getHOST_ESATPhysicalChannel()
	 * @model containment="true"
	 * @generated
	 */
	EList<SATPhysicalChannel> getESATPhysicalChannel();

} // HOST
