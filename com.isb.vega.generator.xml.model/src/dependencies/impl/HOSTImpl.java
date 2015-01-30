/**
 */
package dependencies.impl;

import dependencies.DependenciesPackage;
import dependencies.HOST;
import dependencies.SATLogicalChannel;
import dependencies.SATPhysicalChannel;
import dependencies.trxOPLogicalChannel;
import dependencies.trxOPPhysicalChannel;

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
 * An implementation of the model object '<em><b>HOST</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.HOSTImpl#getSatProtocol <em>Sat Protocol</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getSatAlias <em>Sat Alias</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getSatTimeOut <em>Sat Time Out</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getSatNullValues <em>Sat Null Values</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getSatNullWhenSpaces <em>Sat Null When Spaces</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getTrxOPDefaultMode <em>Trx OP Default Mode</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getTrxOPTCPAlias <em>Trx OPTCP Alias</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getAltairProtocol <em>Altair Protocol</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getAltairAlias <em>Altair Alias</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getRedProtocol <em>Red Protocol</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getTrxprotocol <em>Trxprotocol</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getEOPLogicalChannel <em>EOP Logical Channel</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getEPhysicalChannel <em>EPhysical Channel</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getESATLogicalChannel <em>ESAT Logical Channel</em>}</li>
 *   <li>{@link dependencies.impl.HOSTImpl#getESATPhysicalChannel <em>ESAT Physical Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HOSTImpl extends MinimalEObjectImpl.Container implements HOST {
	/**
	 * The default value of the '{@link #getSatProtocol() <em>Sat Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String SAT_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatProtocol() <em>Sat Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatProtocol()
	 * @generated
	 * @ordered
	 */
	protected String satProtocol = SAT_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatAlias() <em>Sat Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String SAT_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatAlias() <em>Sat Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatAlias()
	 * @generated
	 * @ordered
	 */
	protected String satAlias = SAT_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatTimeOut() <em>Sat Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatTimeOut()
	 * @generated
	 * @ordered
	 */
	protected static final String SAT_TIME_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatTimeOut() <em>Sat Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatTimeOut()
	 * @generated
	 * @ordered
	 */
	protected String satTimeOut = SAT_TIME_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatNullValues() <em>Sat Null Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatNullValues()
	 * @generated
	 * @ordered
	 */
	protected static final String SAT_NULL_VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatNullValues() <em>Sat Null Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatNullValues()
	 * @generated
	 * @ordered
	 */
	protected String satNullValues = SAT_NULL_VALUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatNullWhenSpaces() <em>Sat Null When Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatNullWhenSpaces()
	 * @generated
	 * @ordered
	 */
	protected static final String SAT_NULL_WHEN_SPACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatNullWhenSpaces() <em>Sat Null When Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatNullWhenSpaces()
	 * @generated
	 * @ordered
	 */
	protected String satNullWhenSpaces = SAT_NULL_WHEN_SPACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrxOPDefaultMode() <em>Trx OP Default Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrxOPDefaultMode()
	 * @generated
	 * @ordered
	 */
	protected static final String TRX_OP_DEFAULT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrxOPDefaultMode() <em>Trx OP Default Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrxOPDefaultMode()
	 * @generated
	 * @ordered
	 */
	protected String trxOPDefaultMode = TRX_OP_DEFAULT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrxOPTCPAlias() <em>Trx OPTCP Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrxOPTCPAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String TRX_OPTCP_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrxOPTCPAlias() <em>Trx OPTCP Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrxOPTCPAlias()
	 * @generated
	 * @ordered
	 */
	protected String trxOPTCPAlias = TRX_OPTCP_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltairProtocol() <em>Altair Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltairProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTAIR_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAltairProtocol() <em>Altair Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltairProtocol()
	 * @generated
	 * @ordered
	 */
	protected String altairProtocol = ALTAIR_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltairAlias() <em>Altair Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltairAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTAIR_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAltairAlias() <em>Altair Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltairAlias()
	 * @generated
	 * @ordered
	 */
	protected String altairAlias = ALTAIR_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedProtocol() <em>Red Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String RED_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedProtocol() <em>Red Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedProtocol()
	 * @generated
	 * @ordered
	 */
	protected String redProtocol = RED_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrxprotocol() <em>Trxprotocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrxprotocol()
	 * @generated
	 * @ordered
	 */
	protected static final String TRXPROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrxprotocol() <em>Trxprotocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrxprotocol()
	 * @generated
	 * @ordered
	 */
	protected String trxprotocol = TRXPROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEOPLogicalChannel() <em>EOP Logical Channel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOPLogicalChannel()
	 * @generated
	 * @ordered
	 */
	protected EList<trxOPLogicalChannel> eOPLogicalChannel;

	/**
	 * The cached value of the '{@link #getEPhysicalChannel() <em>EPhysical Channel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPhysicalChannel()
	 * @generated
	 * @ordered
	 */
	protected EList<trxOPPhysicalChannel> ePhysicalChannel;

	/**
	 * The cached value of the '{@link #getESATLogicalChannel() <em>ESAT Logical Channel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESATLogicalChannel()
	 * @generated
	 * @ordered
	 */
	protected EList<SATLogicalChannel> eSATLogicalChannel;

	/**
	 * The cached value of the '{@link #getESATPhysicalChannel() <em>ESAT Physical Channel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESATPhysicalChannel()
	 * @generated
	 * @ordered
	 */
	protected EList<SATPhysicalChannel> eSATPhysicalChannel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HOSTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.HOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSatProtocol() {
		return satProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatProtocol(String newSatProtocol) {
		String oldSatProtocol = satProtocol;
		satProtocol = newSatProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.HOST__SAT_PROTOCOL, oldSatProtocol, satProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSatAlias() {
		return satAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatAlias(String newSatAlias) {
		String oldSatAlias = satAlias;
		satAlias = newSatAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.HOST__SAT_ALIAS, oldSatAlias, satAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSatTimeOut() {
		return satTimeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatTimeOut(String newSatTimeOut) {
		String oldSatTimeOut = satTimeOut;
		satTimeOut = newSatTimeOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.HOST__SAT_TIME_OUT, oldSatTimeOut, satTimeOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSatNullValues() {
		return satNullValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatNullValues(String newSatNullValues) {
		String oldSatNullValues = satNullValues;
		satNullValues = newSatNullValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.HOST__SAT_NULL_VALUES, oldSatNullValues, satNullValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSatNullWhenSpaces() {
		return satNullWhenSpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatNullWhenSpaces(String newSatNullWhenSpaces) {
		String oldSatNullWhenSpaces = satNullWhenSpaces;
		satNullWhenSpaces = newSatNullWhenSpaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.HOST__SAT_NULL_WHEN_SPACES, oldSatNullWhenSpaces, satNullWhenSpaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrxOPDefaultMode() {
		return trxOPDefaultMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrxOPDefaultMode(String newTrxOPDefaultMode) {
		String oldTrxOPDefaultMode = trxOPDefaultMode;
		trxOPDefaultMode = newTrxOPDefaultMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.HOST__TRX_OP_DEFAULT_MODE, oldTrxOPDefaultMode, trxOPDefaultMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrxOPTCPAlias() {
		return trxOPTCPAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrxOPTCPAlias(String newTrxOPTCPAlias) {
		String oldTrxOPTCPAlias = trxOPTCPAlias;
		trxOPTCPAlias = newTrxOPTCPAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.HOST__TRX_OPTCP_ALIAS, oldTrxOPTCPAlias, trxOPTCPAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAltairProtocol() {
		return altairProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltairProtocol(String newAltairProtocol) {
		String oldAltairProtocol = altairProtocol;
		altairProtocol = newAltairProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.HOST__ALTAIR_PROTOCOL, oldAltairProtocol, altairProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAltairAlias() {
		return altairAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltairAlias(String newAltairAlias) {
		String oldAltairAlias = altairAlias;
		altairAlias = newAltairAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.HOST__ALTAIR_ALIAS, oldAltairAlias, altairAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedProtocol() {
		return redProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedProtocol(String newRedProtocol) {
		String oldRedProtocol = redProtocol;
		redProtocol = newRedProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.HOST__RED_PROTOCOL, oldRedProtocol, redProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrxprotocol() {
		return trxprotocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrxprotocol(String newTrxprotocol) {
		String oldTrxprotocol = trxprotocol;
		trxprotocol = newTrxprotocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.HOST__TRXPROTOCOL, oldTrxprotocol, trxprotocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<trxOPLogicalChannel> getEOPLogicalChannel() {
		if (eOPLogicalChannel == null) {
			eOPLogicalChannel = new EObjectContainmentEList<trxOPLogicalChannel>(trxOPLogicalChannel.class, this, DependenciesPackage.HOST__EOP_LOGICAL_CHANNEL);
		}
		return eOPLogicalChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<trxOPPhysicalChannel> getEPhysicalChannel() {
		if (ePhysicalChannel == null) {
			ePhysicalChannel = new EObjectContainmentEList<trxOPPhysicalChannel>(trxOPPhysicalChannel.class, this, DependenciesPackage.HOST__EPHYSICAL_CHANNEL);
		}
		return ePhysicalChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SATLogicalChannel> getESATLogicalChannel() {
		if (eSATLogicalChannel == null) {
			eSATLogicalChannel = new EObjectContainmentEList<SATLogicalChannel>(SATLogicalChannel.class, this, DependenciesPackage.HOST__ESAT_LOGICAL_CHANNEL);
		}
		return eSATLogicalChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SATPhysicalChannel> getESATPhysicalChannel() {
		if (eSATPhysicalChannel == null) {
			eSATPhysicalChannel = new EObjectContainmentEList<SATPhysicalChannel>(SATPhysicalChannel.class, this, DependenciesPackage.HOST__ESAT_PHYSICAL_CHANNEL);
		}
		return eSATPhysicalChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependenciesPackage.HOST__EOP_LOGICAL_CHANNEL:
				return ((InternalEList<?>)getEOPLogicalChannel()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.HOST__EPHYSICAL_CHANNEL:
				return ((InternalEList<?>)getEPhysicalChannel()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.HOST__ESAT_LOGICAL_CHANNEL:
				return ((InternalEList<?>)getESATLogicalChannel()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.HOST__ESAT_PHYSICAL_CHANNEL:
				return ((InternalEList<?>)getESATPhysicalChannel()).basicRemove(otherEnd, msgs);
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
			case DependenciesPackage.HOST__SAT_PROTOCOL:
				return getSatProtocol();
			case DependenciesPackage.HOST__SAT_ALIAS:
				return getSatAlias();
			case DependenciesPackage.HOST__SAT_TIME_OUT:
				return getSatTimeOut();
			case DependenciesPackage.HOST__SAT_NULL_VALUES:
				return getSatNullValues();
			case DependenciesPackage.HOST__SAT_NULL_WHEN_SPACES:
				return getSatNullWhenSpaces();
			case DependenciesPackage.HOST__TRX_OP_DEFAULT_MODE:
				return getTrxOPDefaultMode();
			case DependenciesPackage.HOST__TRX_OPTCP_ALIAS:
				return getTrxOPTCPAlias();
			case DependenciesPackage.HOST__ALTAIR_PROTOCOL:
				return getAltairProtocol();
			case DependenciesPackage.HOST__ALTAIR_ALIAS:
				return getAltairAlias();
			case DependenciesPackage.HOST__RED_PROTOCOL:
				return getRedProtocol();
			case DependenciesPackage.HOST__TRXPROTOCOL:
				return getTrxprotocol();
			case DependenciesPackage.HOST__EOP_LOGICAL_CHANNEL:
				return getEOPLogicalChannel();
			case DependenciesPackage.HOST__EPHYSICAL_CHANNEL:
				return getEPhysicalChannel();
			case DependenciesPackage.HOST__ESAT_LOGICAL_CHANNEL:
				return getESATLogicalChannel();
			case DependenciesPackage.HOST__ESAT_PHYSICAL_CHANNEL:
				return getESATPhysicalChannel();
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
			case DependenciesPackage.HOST__SAT_PROTOCOL:
				setSatProtocol((String)newValue);
				return;
			case DependenciesPackage.HOST__SAT_ALIAS:
				setSatAlias((String)newValue);
				return;
			case DependenciesPackage.HOST__SAT_TIME_OUT:
				setSatTimeOut((String)newValue);
				return;
			case DependenciesPackage.HOST__SAT_NULL_VALUES:
				setSatNullValues((String)newValue);
				return;
			case DependenciesPackage.HOST__SAT_NULL_WHEN_SPACES:
				setSatNullWhenSpaces((String)newValue);
				return;
			case DependenciesPackage.HOST__TRX_OP_DEFAULT_MODE:
				setTrxOPDefaultMode((String)newValue);
				return;
			case DependenciesPackage.HOST__TRX_OPTCP_ALIAS:
				setTrxOPTCPAlias((String)newValue);
				return;
			case DependenciesPackage.HOST__ALTAIR_PROTOCOL:
				setAltairProtocol((String)newValue);
				return;
			case DependenciesPackage.HOST__ALTAIR_ALIAS:
				setAltairAlias((String)newValue);
				return;
			case DependenciesPackage.HOST__RED_PROTOCOL:
				setRedProtocol((String)newValue);
				return;
			case DependenciesPackage.HOST__TRXPROTOCOL:
				setTrxprotocol((String)newValue);
				return;
			case DependenciesPackage.HOST__EOP_LOGICAL_CHANNEL:
				getEOPLogicalChannel().clear();
				getEOPLogicalChannel().addAll((Collection<? extends trxOPLogicalChannel>)newValue);
				return;
			case DependenciesPackage.HOST__EPHYSICAL_CHANNEL:
				getEPhysicalChannel().clear();
				getEPhysicalChannel().addAll((Collection<? extends trxOPPhysicalChannel>)newValue);
				return;
			case DependenciesPackage.HOST__ESAT_LOGICAL_CHANNEL:
				getESATLogicalChannel().clear();
				getESATLogicalChannel().addAll((Collection<? extends SATLogicalChannel>)newValue);
				return;
			case DependenciesPackage.HOST__ESAT_PHYSICAL_CHANNEL:
				getESATPhysicalChannel().clear();
				getESATPhysicalChannel().addAll((Collection<? extends SATPhysicalChannel>)newValue);
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
			case DependenciesPackage.HOST__SAT_PROTOCOL:
				setSatProtocol(SAT_PROTOCOL_EDEFAULT);
				return;
			case DependenciesPackage.HOST__SAT_ALIAS:
				setSatAlias(SAT_ALIAS_EDEFAULT);
				return;
			case DependenciesPackage.HOST__SAT_TIME_OUT:
				setSatTimeOut(SAT_TIME_OUT_EDEFAULT);
				return;
			case DependenciesPackage.HOST__SAT_NULL_VALUES:
				setSatNullValues(SAT_NULL_VALUES_EDEFAULT);
				return;
			case DependenciesPackage.HOST__SAT_NULL_WHEN_SPACES:
				setSatNullWhenSpaces(SAT_NULL_WHEN_SPACES_EDEFAULT);
				return;
			case DependenciesPackage.HOST__TRX_OP_DEFAULT_MODE:
				setTrxOPDefaultMode(TRX_OP_DEFAULT_MODE_EDEFAULT);
				return;
			case DependenciesPackage.HOST__TRX_OPTCP_ALIAS:
				setTrxOPTCPAlias(TRX_OPTCP_ALIAS_EDEFAULT);
				return;
			case DependenciesPackage.HOST__ALTAIR_PROTOCOL:
				setAltairProtocol(ALTAIR_PROTOCOL_EDEFAULT);
				return;
			case DependenciesPackage.HOST__ALTAIR_ALIAS:
				setAltairAlias(ALTAIR_ALIAS_EDEFAULT);
				return;
			case DependenciesPackage.HOST__RED_PROTOCOL:
				setRedProtocol(RED_PROTOCOL_EDEFAULT);
				return;
			case DependenciesPackage.HOST__TRXPROTOCOL:
				setTrxprotocol(TRXPROTOCOL_EDEFAULT);
				return;
			case DependenciesPackage.HOST__EOP_LOGICAL_CHANNEL:
				getEOPLogicalChannel().clear();
				return;
			case DependenciesPackage.HOST__EPHYSICAL_CHANNEL:
				getEPhysicalChannel().clear();
				return;
			case DependenciesPackage.HOST__ESAT_LOGICAL_CHANNEL:
				getESATLogicalChannel().clear();
				return;
			case DependenciesPackage.HOST__ESAT_PHYSICAL_CHANNEL:
				getESATPhysicalChannel().clear();
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
			case DependenciesPackage.HOST__SAT_PROTOCOL:
				return SAT_PROTOCOL_EDEFAULT == null ? satProtocol != null : !SAT_PROTOCOL_EDEFAULT.equals(satProtocol);
			case DependenciesPackage.HOST__SAT_ALIAS:
				return SAT_ALIAS_EDEFAULT == null ? satAlias != null : !SAT_ALIAS_EDEFAULT.equals(satAlias);
			case DependenciesPackage.HOST__SAT_TIME_OUT:
				return SAT_TIME_OUT_EDEFAULT == null ? satTimeOut != null : !SAT_TIME_OUT_EDEFAULT.equals(satTimeOut);
			case DependenciesPackage.HOST__SAT_NULL_VALUES:
				return SAT_NULL_VALUES_EDEFAULT == null ? satNullValues != null : !SAT_NULL_VALUES_EDEFAULT.equals(satNullValues);
			case DependenciesPackage.HOST__SAT_NULL_WHEN_SPACES:
				return SAT_NULL_WHEN_SPACES_EDEFAULT == null ? satNullWhenSpaces != null : !SAT_NULL_WHEN_SPACES_EDEFAULT.equals(satNullWhenSpaces);
			case DependenciesPackage.HOST__TRX_OP_DEFAULT_MODE:
				return TRX_OP_DEFAULT_MODE_EDEFAULT == null ? trxOPDefaultMode != null : !TRX_OP_DEFAULT_MODE_EDEFAULT.equals(trxOPDefaultMode);
			case DependenciesPackage.HOST__TRX_OPTCP_ALIAS:
				return TRX_OPTCP_ALIAS_EDEFAULT == null ? trxOPTCPAlias != null : !TRX_OPTCP_ALIAS_EDEFAULT.equals(trxOPTCPAlias);
			case DependenciesPackage.HOST__ALTAIR_PROTOCOL:
				return ALTAIR_PROTOCOL_EDEFAULT == null ? altairProtocol != null : !ALTAIR_PROTOCOL_EDEFAULT.equals(altairProtocol);
			case DependenciesPackage.HOST__ALTAIR_ALIAS:
				return ALTAIR_ALIAS_EDEFAULT == null ? altairAlias != null : !ALTAIR_ALIAS_EDEFAULT.equals(altairAlias);
			case DependenciesPackage.HOST__RED_PROTOCOL:
				return RED_PROTOCOL_EDEFAULT == null ? redProtocol != null : !RED_PROTOCOL_EDEFAULT.equals(redProtocol);
			case DependenciesPackage.HOST__TRXPROTOCOL:
				return TRXPROTOCOL_EDEFAULT == null ? trxprotocol != null : !TRXPROTOCOL_EDEFAULT.equals(trxprotocol);
			case DependenciesPackage.HOST__EOP_LOGICAL_CHANNEL:
				return eOPLogicalChannel != null && !eOPLogicalChannel.isEmpty();
			case DependenciesPackage.HOST__EPHYSICAL_CHANNEL:
				return ePhysicalChannel != null && !ePhysicalChannel.isEmpty();
			case DependenciesPackage.HOST__ESAT_LOGICAL_CHANNEL:
				return eSATLogicalChannel != null && !eSATLogicalChannel.isEmpty();
			case DependenciesPackage.HOST__ESAT_PHYSICAL_CHANNEL:
				return eSATPhysicalChannel != null && !eSATPhysicalChannel.isEmpty();
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
		result.append(" (satProtocol: ");
		result.append(satProtocol);
		result.append(", satAlias: ");
		result.append(satAlias);
		result.append(", satTimeOut: ");
		result.append(satTimeOut);
		result.append(", satNullValues: ");
		result.append(satNullValues);
		result.append(", satNullWhenSpaces: ");
		result.append(satNullWhenSpaces);
		result.append(", trxOPDefaultMode: ");
		result.append(trxOPDefaultMode);
		result.append(", trxOPTCPAlias: ");
		result.append(trxOPTCPAlias);
		result.append(", altairProtocol: ");
		result.append(altairProtocol);
		result.append(", altairAlias: ");
		result.append(altairAlias);
		result.append(", RedProtocol: ");
		result.append(redProtocol);
		result.append(", trxprotocol: ");
		result.append(trxprotocol);
		result.append(')');
		return result.toString();
	}

} //HOSTImpl
