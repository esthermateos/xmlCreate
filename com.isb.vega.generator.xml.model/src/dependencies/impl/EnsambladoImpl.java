/**
 */
package dependencies.impl;

import dependencies.ChannelAdapter;
import dependencies.DependenciesPackage;
import dependencies.Ensamblado;
import dependencies.HOST;
import dependencies.JMS;
import dependencies.LogLevel;
import dependencies.MultiProfile;
import dependencies.OP;
import dependencies.Security;

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
 * An implementation of the model object '<em><b>Ensamblado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.EnsambladoImpl#getName <em>Name</em>}</li>
 *   <li>{@link dependencies.impl.EnsambladoImpl#getELogLevel <em>ELog Level</em>}</li>
 *   <li>{@link dependencies.impl.EnsambladoImpl#getEMultiProfile <em>EMulti Profile</em>}</li>
 *   <li>{@link dependencies.impl.EnsambladoImpl#getEHOST <em>EHOST</em>}</li>
 *   <li>{@link dependencies.impl.EnsambladoImpl#getEJMS <em>EJMS</em>}</li>
 *   <li>{@link dependencies.impl.EnsambladoImpl#getEChannelAdapter <em>EChannel Adapter</em>}</li>
 *   <li>{@link dependencies.impl.EnsambladoImpl#getEEnsamblado <em>EEnsamblado</em>}</li>
 *   <li>{@link dependencies.impl.EnsambladoImpl#getEOP <em>EOP</em>}</li>
 *   <li>{@link dependencies.impl.EnsambladoImpl#getDefaultBankChannel <em>Default Bank Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnsambladoImpl extends MinimalEObjectImpl.Container implements Ensamblado {
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
	 * The cached value of the '{@link #getELogLevel() <em>ELog Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELogLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<LogLevel> eLogLevel;

	/**
	 * The cached value of the '{@link #getEMultiProfile() <em>EMulti Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMultiProfile()
	 * @generated
	 * @ordered
	 */
	protected MultiProfile eMultiProfile;

	/**
	 * The cached value of the '{@link #getEHOST() <em>EHOST</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEHOST()
	 * @generated
	 * @ordered
	 */
	protected HOST eHOST;

	/**
	 * The cached value of the '{@link #getEJMS() <em>EJMS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEJMS()
	 * @generated
	 * @ordered
	 */
	protected EList<JMS> eJMS;

	/**
	 * The cached value of the '{@link #getEChannelAdapter() <em>EChannel Adapter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEChannelAdapter()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelAdapter> eChannelAdapter;

	/**
	 * The cached value of the '{@link #getEEnsamblado() <em>EEnsamblado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEnsamblado()
	 * @generated
	 * @ordered
	 */
	protected Security eEnsamblado;

	/**
	 * The cached value of the '{@link #getEOP() <em>EOP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOP()
	 * @generated
	 * @ordered
	 */
	protected EList<OP> eOP;

	/**
	 * The default value of the '{@link #getDefaultBankChannel() <em>Default Bank Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBankChannel()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_BANK_CHANNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultBankChannel() <em>Default Bank Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBankChannel()
	 * @generated
	 * @ordered
	 */
	protected String defaultBankChannel = DEFAULT_BANK_CHANNEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnsambladoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.ENSAMBLADO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.ENSAMBLADO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogLevel> getELogLevel() {
		if (eLogLevel == null) {
			eLogLevel = new EObjectContainmentEList<LogLevel>(LogLevel.class, this, DependenciesPackage.ENSAMBLADO__ELOG_LEVEL);
		}
		return eLogLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiProfile getEMultiProfile() {
		return eMultiProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEMultiProfile(MultiProfile newEMultiProfile, NotificationChain msgs) {
		MultiProfile oldEMultiProfile = eMultiProfile;
		eMultiProfile = newEMultiProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependenciesPackage.ENSAMBLADO__EMULTI_PROFILE, oldEMultiProfile, newEMultiProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEMultiProfile(MultiProfile newEMultiProfile) {
		if (newEMultiProfile != eMultiProfile) {
			NotificationChain msgs = null;
			if (eMultiProfile != null)
				msgs = ((InternalEObject)eMultiProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.ENSAMBLADO__EMULTI_PROFILE, null, msgs);
			if (newEMultiProfile != null)
				msgs = ((InternalEObject)newEMultiProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.ENSAMBLADO__EMULTI_PROFILE, null, msgs);
			msgs = basicSetEMultiProfile(newEMultiProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.ENSAMBLADO__EMULTI_PROFILE, newEMultiProfile, newEMultiProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HOST getEHOST() {
		return eHOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEHOST(HOST newEHOST, NotificationChain msgs) {
		HOST oldEHOST = eHOST;
		eHOST = newEHOST;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependenciesPackage.ENSAMBLADO__EHOST, oldEHOST, newEHOST);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEHOST(HOST newEHOST) {
		if (newEHOST != eHOST) {
			NotificationChain msgs = null;
			if (eHOST != null)
				msgs = ((InternalEObject)eHOST).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.ENSAMBLADO__EHOST, null, msgs);
			if (newEHOST != null)
				msgs = ((InternalEObject)newEHOST).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.ENSAMBLADO__EHOST, null, msgs);
			msgs = basicSetEHOST(newEHOST, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.ENSAMBLADO__EHOST, newEHOST, newEHOST));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JMS> getEJMS() {
		if (eJMS == null) {
			eJMS = new EObjectContainmentEList<JMS>(JMS.class, this, DependenciesPackage.ENSAMBLADO__EJMS);
		}
		return eJMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelAdapter> getEChannelAdapter() {
		if (eChannelAdapter == null) {
			eChannelAdapter = new EObjectContainmentEList<ChannelAdapter>(ChannelAdapter.class, this, DependenciesPackage.ENSAMBLADO__ECHANNEL_ADAPTER);
		}
		return eChannelAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security getEEnsamblado() {
		return eEnsamblado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEEnsamblado(Security newEEnsamblado, NotificationChain msgs) {
		Security oldEEnsamblado = eEnsamblado;
		eEnsamblado = newEEnsamblado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependenciesPackage.ENSAMBLADO__EENSAMBLADO, oldEEnsamblado, newEEnsamblado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEEnsamblado(Security newEEnsamblado) {
		if (newEEnsamblado != eEnsamblado) {
			NotificationChain msgs = null;
			if (eEnsamblado != null)
				msgs = ((InternalEObject)eEnsamblado).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.ENSAMBLADO__EENSAMBLADO, null, msgs);
			if (newEEnsamblado != null)
				msgs = ((InternalEObject)newEEnsamblado).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.ENSAMBLADO__EENSAMBLADO, null, msgs);
			msgs = basicSetEEnsamblado(newEEnsamblado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.ENSAMBLADO__EENSAMBLADO, newEEnsamblado, newEEnsamblado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OP> getEOP() {
		if (eOP == null) {
			eOP = new EObjectContainmentEList<OP>(OP.class, this, DependenciesPackage.ENSAMBLADO__EOP);
		}
		return eOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultBankChannel() {
		return defaultBankChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultBankChannel(String newDefaultBankChannel) {
		String oldDefaultBankChannel = defaultBankChannel;
		defaultBankChannel = newDefaultBankChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.ENSAMBLADO__DEFAULT_BANK_CHANNEL, oldDefaultBankChannel, defaultBankChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependenciesPackage.ENSAMBLADO__ELOG_LEVEL:
				return ((InternalEList<?>)getELogLevel()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.ENSAMBLADO__EMULTI_PROFILE:
				return basicSetEMultiProfile(null, msgs);
			case DependenciesPackage.ENSAMBLADO__EHOST:
				return basicSetEHOST(null, msgs);
			case DependenciesPackage.ENSAMBLADO__EJMS:
				return ((InternalEList<?>)getEJMS()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.ENSAMBLADO__ECHANNEL_ADAPTER:
				return ((InternalEList<?>)getEChannelAdapter()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.ENSAMBLADO__EENSAMBLADO:
				return basicSetEEnsamblado(null, msgs);
			case DependenciesPackage.ENSAMBLADO__EOP:
				return ((InternalEList<?>)getEOP()).basicRemove(otherEnd, msgs);
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
			case DependenciesPackage.ENSAMBLADO__NAME:
				return getName();
			case DependenciesPackage.ENSAMBLADO__ELOG_LEVEL:
				return getELogLevel();
			case DependenciesPackage.ENSAMBLADO__EMULTI_PROFILE:
				return getEMultiProfile();
			case DependenciesPackage.ENSAMBLADO__EHOST:
				return getEHOST();
			case DependenciesPackage.ENSAMBLADO__EJMS:
				return getEJMS();
			case DependenciesPackage.ENSAMBLADO__ECHANNEL_ADAPTER:
				return getEChannelAdapter();
			case DependenciesPackage.ENSAMBLADO__EENSAMBLADO:
				return getEEnsamblado();
			case DependenciesPackage.ENSAMBLADO__EOP:
				return getEOP();
			case DependenciesPackage.ENSAMBLADO__DEFAULT_BANK_CHANNEL:
				return getDefaultBankChannel();
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
			case DependenciesPackage.ENSAMBLADO__NAME:
				setName((String)newValue);
				return;
			case DependenciesPackage.ENSAMBLADO__ELOG_LEVEL:
				getELogLevel().clear();
				getELogLevel().addAll((Collection<? extends LogLevel>)newValue);
				return;
			case DependenciesPackage.ENSAMBLADO__EMULTI_PROFILE:
				setEMultiProfile((MultiProfile)newValue);
				return;
			case DependenciesPackage.ENSAMBLADO__EHOST:
				setEHOST((HOST)newValue);
				return;
			case DependenciesPackage.ENSAMBLADO__EJMS:
				getEJMS().clear();
				getEJMS().addAll((Collection<? extends JMS>)newValue);
				return;
			case DependenciesPackage.ENSAMBLADO__ECHANNEL_ADAPTER:
				getEChannelAdapter().clear();
				getEChannelAdapter().addAll((Collection<? extends ChannelAdapter>)newValue);
				return;
			case DependenciesPackage.ENSAMBLADO__EENSAMBLADO:
				setEEnsamblado((Security)newValue);
				return;
			case DependenciesPackage.ENSAMBLADO__EOP:
				getEOP().clear();
				getEOP().addAll((Collection<? extends OP>)newValue);
				return;
			case DependenciesPackage.ENSAMBLADO__DEFAULT_BANK_CHANNEL:
				setDefaultBankChannel((String)newValue);
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
			case DependenciesPackage.ENSAMBLADO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DependenciesPackage.ENSAMBLADO__ELOG_LEVEL:
				getELogLevel().clear();
				return;
			case DependenciesPackage.ENSAMBLADO__EMULTI_PROFILE:
				setEMultiProfile((MultiProfile)null);
				return;
			case DependenciesPackage.ENSAMBLADO__EHOST:
				setEHOST((HOST)null);
				return;
			case DependenciesPackage.ENSAMBLADO__EJMS:
				getEJMS().clear();
				return;
			case DependenciesPackage.ENSAMBLADO__ECHANNEL_ADAPTER:
				getEChannelAdapter().clear();
				return;
			case DependenciesPackage.ENSAMBLADO__EENSAMBLADO:
				setEEnsamblado((Security)null);
				return;
			case DependenciesPackage.ENSAMBLADO__EOP:
				getEOP().clear();
				return;
			case DependenciesPackage.ENSAMBLADO__DEFAULT_BANK_CHANNEL:
				setDefaultBankChannel(DEFAULT_BANK_CHANNEL_EDEFAULT);
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
			case DependenciesPackage.ENSAMBLADO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DependenciesPackage.ENSAMBLADO__ELOG_LEVEL:
				return eLogLevel != null && !eLogLevel.isEmpty();
			case DependenciesPackage.ENSAMBLADO__EMULTI_PROFILE:
				return eMultiProfile != null;
			case DependenciesPackage.ENSAMBLADO__EHOST:
				return eHOST != null;
			case DependenciesPackage.ENSAMBLADO__EJMS:
				return eJMS != null && !eJMS.isEmpty();
			case DependenciesPackage.ENSAMBLADO__ECHANNEL_ADAPTER:
				return eChannelAdapter != null && !eChannelAdapter.isEmpty();
			case DependenciesPackage.ENSAMBLADO__EENSAMBLADO:
				return eEnsamblado != null;
			case DependenciesPackage.ENSAMBLADO__EOP:
				return eOP != null && !eOP.isEmpty();
			case DependenciesPackage.ENSAMBLADO__DEFAULT_BANK_CHANNEL:
				return DEFAULT_BANK_CHANNEL_EDEFAULT == null ? defaultBankChannel != null : !DEFAULT_BANK_CHANNEL_EDEFAULT.equals(defaultBankChannel);
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
		result.append(", defaultBankChannel: ");
		result.append(defaultBankChannel);
		result.append(')');
		return result.toString();
	}

} //EnsambladoImpl
