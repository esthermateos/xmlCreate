/**
 */
package dependencies.impl;

import dependencies.AppAdapter;
import dependencies.ComponentSQL;
import dependencies.DependenciesPackage;
import dependencies.Fachada;
import dependencies.Java;
import dependencies.OI;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fachada</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.FachadaImpl#getFacadeName <em>Facade Name</em>}</li>
 *   <li>{@link dependencies.impl.FachadaImpl#getInterfazName <em>Interfaz Name</em>}</li>
 *   <li>{@link dependencies.impl.FachadaImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link dependencies.impl.FachadaImpl#getMethodID <em>Method ID</em>}</li>
 *   <li>{@link dependencies.impl.FachadaImpl#getEOI <em>EOI</em>}</li>
 *   <li>{@link dependencies.impl.FachadaImpl#getEComponentSQL <em>EComponent SQL</em>}</li>
 *   <li>{@link dependencies.impl.FachadaImpl#getEJava <em>EJava</em>}</li>
 *   <li>{@link dependencies.impl.FachadaImpl#getEAppAdapter <em>EApp Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FachadaImpl extends MinimalEObjectImpl.Container implements Fachada {
	/**
	 * The default value of the '{@link #getFacadeName() <em>Facade Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacadeName()
	 * @generated
	 * @ordered
	 */
	protected static final String FACADE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacadeName() <em>Facade Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacadeName()
	 * @generated
	 * @ordered
	 */
	protected String facadeName = FACADE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfazName() <em>Interfaz Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfazName()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFAZ_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfazName() <em>Interfaz Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfazName()
	 * @generated
	 * @ordered
	 */
	protected String interfazName = INTERFAZ_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodID() <em>Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodID()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodID() <em>Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodID()
	 * @generated
	 * @ordered
	 */
	protected String methodID = METHOD_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEOI() <em>EOI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOI()
	 * @generated
	 * @ordered
	 */
	protected OI eOI;

	/**
	 * The cached value of the '{@link #getEComponentSQL() <em>EComponent SQL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEComponentSQL()
	 * @generated
	 * @ordered
	 */
	protected ComponentSQL eComponentSQL;

	/**
	 * The cached value of the '{@link #getEJava() <em>EJava</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEJava()
	 * @generated
	 * @ordered
	 */
	protected Java eJava;

	/**
	 * The cached value of the '{@link #getEAppAdapter() <em>EApp Adapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAppAdapter()
	 * @generated
	 * @ordered
	 */
	protected AppAdapter eAppAdapter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FachadaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.FACHADA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFacadeName() {
		return facadeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacadeName(String newFacadeName) {
		String oldFacadeName = facadeName;
		facadeName = newFacadeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.FACHADA__FACADE_NAME, oldFacadeName, facadeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfazName() {
		return interfazName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfazName(String newInterfazName) {
		String oldInterfazName = interfazName;
		interfazName = newInterfazName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.FACHADA__INTERFAZ_NAME, oldInterfazName, interfazName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.FACHADA__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodID() {
		return methodID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodID(String newMethodID) {
		String oldMethodID = methodID;
		methodID = newMethodID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.FACHADA__METHOD_ID, oldMethodID, methodID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OI getEOI() {
		if (eOI != null && eOI.eIsProxy()) {
			InternalEObject oldEOI = (InternalEObject)eOI;
			eOI = (OI)eResolveProxy(oldEOI);
			if (eOI != oldEOI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependenciesPackage.FACHADA__EOI, oldEOI, eOI));
			}
		}
		return eOI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OI basicGetEOI() {
		return eOI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEOI(OI newEOI) {
		OI oldEOI = eOI;
		eOI = newEOI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.FACHADA__EOI, oldEOI, eOI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSQL getEComponentSQL() {
		return eComponentSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEComponentSQL(ComponentSQL newEComponentSQL, NotificationChain msgs) {
		ComponentSQL oldEComponentSQL = eComponentSQL;
		eComponentSQL = newEComponentSQL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependenciesPackage.FACHADA__ECOMPONENT_SQL, oldEComponentSQL, newEComponentSQL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEComponentSQL(ComponentSQL newEComponentSQL) {
		if (newEComponentSQL != eComponentSQL) {
			NotificationChain msgs = null;
			if (eComponentSQL != null)
				msgs = ((InternalEObject)eComponentSQL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.FACHADA__ECOMPONENT_SQL, null, msgs);
			if (newEComponentSQL != null)
				msgs = ((InternalEObject)newEComponentSQL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.FACHADA__ECOMPONENT_SQL, null, msgs);
			msgs = basicSetEComponentSQL(newEComponentSQL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.FACHADA__ECOMPONENT_SQL, newEComponentSQL, newEComponentSQL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java getEJava() {
		return eJava;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEJava(Java newEJava, NotificationChain msgs) {
		Java oldEJava = eJava;
		eJava = newEJava;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependenciesPackage.FACHADA__EJAVA, oldEJava, newEJava);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEJava(Java newEJava) {
		if (newEJava != eJava) {
			NotificationChain msgs = null;
			if (eJava != null)
				msgs = ((InternalEObject)eJava).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.FACHADA__EJAVA, null, msgs);
			if (newEJava != null)
				msgs = ((InternalEObject)newEJava).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.FACHADA__EJAVA, null, msgs);
			msgs = basicSetEJava(newEJava, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.FACHADA__EJAVA, newEJava, newEJava));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppAdapter getEAppAdapter() {
		return eAppAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEAppAdapter(AppAdapter newEAppAdapter, NotificationChain msgs) {
		AppAdapter oldEAppAdapter = eAppAdapter;
		eAppAdapter = newEAppAdapter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependenciesPackage.FACHADA__EAPP_ADAPTER, oldEAppAdapter, newEAppAdapter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAppAdapter(AppAdapter newEAppAdapter) {
		if (newEAppAdapter != eAppAdapter) {
			NotificationChain msgs = null;
			if (eAppAdapter != null)
				msgs = ((InternalEObject)eAppAdapter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.FACHADA__EAPP_ADAPTER, null, msgs);
			if (newEAppAdapter != null)
				msgs = ((InternalEObject)newEAppAdapter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependenciesPackage.FACHADA__EAPP_ADAPTER, null, msgs);
			msgs = basicSetEAppAdapter(newEAppAdapter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.FACHADA__EAPP_ADAPTER, newEAppAdapter, newEAppAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependenciesPackage.FACHADA__ECOMPONENT_SQL:
				return basicSetEComponentSQL(null, msgs);
			case DependenciesPackage.FACHADA__EJAVA:
				return basicSetEJava(null, msgs);
			case DependenciesPackage.FACHADA__EAPP_ADAPTER:
				return basicSetEAppAdapter(null, msgs);
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
			case DependenciesPackage.FACHADA__FACADE_NAME:
				return getFacadeName();
			case DependenciesPackage.FACHADA__INTERFAZ_NAME:
				return getInterfazName();
			case DependenciesPackage.FACHADA__METHOD_NAME:
				return getMethodName();
			case DependenciesPackage.FACHADA__METHOD_ID:
				return getMethodID();
			case DependenciesPackage.FACHADA__EOI:
				if (resolve) return getEOI();
				return basicGetEOI();
			case DependenciesPackage.FACHADA__ECOMPONENT_SQL:
				return getEComponentSQL();
			case DependenciesPackage.FACHADA__EJAVA:
				return getEJava();
			case DependenciesPackage.FACHADA__EAPP_ADAPTER:
				return getEAppAdapter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DependenciesPackage.FACHADA__FACADE_NAME:
				setFacadeName((String)newValue);
				return;
			case DependenciesPackage.FACHADA__INTERFAZ_NAME:
				setInterfazName((String)newValue);
				return;
			case DependenciesPackage.FACHADA__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case DependenciesPackage.FACHADA__METHOD_ID:
				setMethodID((String)newValue);
				return;
			case DependenciesPackage.FACHADA__EOI:
				setEOI((OI)newValue);
				return;
			case DependenciesPackage.FACHADA__ECOMPONENT_SQL:
				setEComponentSQL((ComponentSQL)newValue);
				return;
			case DependenciesPackage.FACHADA__EJAVA:
				setEJava((Java)newValue);
				return;
			case DependenciesPackage.FACHADA__EAPP_ADAPTER:
				setEAppAdapter((AppAdapter)newValue);
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
			case DependenciesPackage.FACHADA__FACADE_NAME:
				setFacadeName(FACADE_NAME_EDEFAULT);
				return;
			case DependenciesPackage.FACHADA__INTERFAZ_NAME:
				setInterfazName(INTERFAZ_NAME_EDEFAULT);
				return;
			case DependenciesPackage.FACHADA__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case DependenciesPackage.FACHADA__METHOD_ID:
				setMethodID(METHOD_ID_EDEFAULT);
				return;
			case DependenciesPackage.FACHADA__EOI:
				setEOI((OI)null);
				return;
			case DependenciesPackage.FACHADA__ECOMPONENT_SQL:
				setEComponentSQL((ComponentSQL)null);
				return;
			case DependenciesPackage.FACHADA__EJAVA:
				setEJava((Java)null);
				return;
			case DependenciesPackage.FACHADA__EAPP_ADAPTER:
				setEAppAdapter((AppAdapter)null);
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
			case DependenciesPackage.FACHADA__FACADE_NAME:
				return FACADE_NAME_EDEFAULT == null ? facadeName != null : !FACADE_NAME_EDEFAULT.equals(facadeName);
			case DependenciesPackage.FACHADA__INTERFAZ_NAME:
				return INTERFAZ_NAME_EDEFAULT == null ? interfazName != null : !INTERFAZ_NAME_EDEFAULT.equals(interfazName);
			case DependenciesPackage.FACHADA__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case DependenciesPackage.FACHADA__METHOD_ID:
				return METHOD_ID_EDEFAULT == null ? methodID != null : !METHOD_ID_EDEFAULT.equals(methodID);
			case DependenciesPackage.FACHADA__EOI:
				return eOI != null;
			case DependenciesPackage.FACHADA__ECOMPONENT_SQL:
				return eComponentSQL != null;
			case DependenciesPackage.FACHADA__EJAVA:
				return eJava != null;
			case DependenciesPackage.FACHADA__EAPP_ADAPTER:
				return eAppAdapter != null;
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
		result.append(" (facadeName: ");
		result.append(facadeName);
		result.append(", interfazName: ");
		result.append(interfazName);
		result.append(", methodName: ");
		result.append(methodName);
		result.append(", methodID: ");
		result.append(methodID);
		result.append(')');
		return result.toString();
	}

} //FachadaImpl
