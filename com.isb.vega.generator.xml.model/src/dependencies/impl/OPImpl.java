/**
 */
package dependencies.impl;

import dependencies.DependenciesPackage;
import dependencies.Fachada;
import dependencies.JSP;
import dependencies.OI;
import dependencies.OP;
import dependencies.Webservice;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.OPImpl#getEstadoLlamadaOP <em>Estado Llamada OP</em>}</li>
 *   <li>{@link dependencies.impl.OPImpl#getERJSP <em>ERJSP</em>}</li>
 *   <li>{@link dependencies.impl.OPImpl#getLpName <em>Lp Name</em>}</li>
 *   <li>{@link dependencies.impl.OPImpl#getOpName <em>Op Name</em>}</li>
 *   <li>{@link dependencies.impl.OPImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link dependencies.impl.OPImpl#getEWebService <em>EWeb Service</em>}</li>
 *   <li>{@link dependencies.impl.OPImpl#getEOI <em>EOI</em>}</li>
 *   <li>{@link dependencies.impl.OPImpl#getEFachada <em>EFachada</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPImpl extends MinimalEObjectImpl.Container implements OP {
	/**
	 * The cached value of the '{@link #getEstadoLlamadaOP() <em>Estado Llamada OP</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadoLlamadaOP()
	 * @generated
	 * @ordered
	 */
	protected EList<OP> estadoLlamadaOP;

	/**
	 * The cached value of the '{@link #getERJSP() <em>ERJSP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERJSP()
	 * @generated
	 * @ordered
	 */
	protected EList<JSP> erjsp;

	/**
	 * The default value of the '{@link #getLpName() <em>Lp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpName()
	 * @generated
	 * @ordered
	 */
	protected static final String LP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLpName() <em>Lp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpName()
	 * @generated
	 * @ordered
	 */
	protected String lpName = LP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpName() <em>Op Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpName()
	 * @generated
	 * @ordered
	 */
	protected static final String OP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpName() <em>Op Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpName()
	 * @generated
	 * @ordered
	 */
	protected String opName = OP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEWebService() <em>EWeb Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEWebService()
	 * @generated
	 * @ordered
	 */
	protected EList<Webservice> eWebService;

	/**
	 * The cached value of the '{@link #getEOI() <em>EOI</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOI()
	 * @generated
	 * @ordered
	 */
	protected EList<OI> eOI;

	/**
	 * The cached value of the '{@link #getEFachada() <em>EFachada</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFachada()
	 * @generated
	 * @ordered
	 */
	protected EList<Fachada> eFachada;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OP> getEstadoLlamadaOP() {
		if (estadoLlamadaOP == null) {
			estadoLlamadaOP = new EObjectResolvingEList<OP>(OP.class, this, DependenciesPackage.OP__ESTADO_LLAMADA_OP);
		}
		return estadoLlamadaOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JSP> getERJSP() {
		if (erjsp == null) {
			erjsp = new EObjectContainmentEList<JSP>(JSP.class, this, DependenciesPackage.OP__ERJSP);
		}
		return erjsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLpName() {
		return lpName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLpName(String newLpName) {
		String oldLpName = lpName;
		lpName = newLpName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.OP__LP_NAME, oldLpName, lpName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpName() {
		return opName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpName(String newOpName) {
		String oldOpName = opName;
		opName = newOpName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.OP__OP_NAME, oldOpName, opName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.OP__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Webservice> getEWebService() {
		if (eWebService == null) {
			eWebService = new EObjectContainmentEList<Webservice>(Webservice.class, this, DependenciesPackage.OP__EWEB_SERVICE);
		}
		return eWebService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OI> getEOI() {
		if (eOI == null) {
			eOI = new EObjectResolvingEList<OI>(OI.class, this, DependenciesPackage.OP__EOI);
		}
		return eOI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fachada> getEFachada() {
		if (eFachada == null) {
			eFachada = new EObjectContainmentEList<Fachada>(Fachada.class, this, DependenciesPackage.OP__EFACHADA);
		}
		return eFachada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependenciesPackage.OP__ERJSP:
				return ((InternalEList<?>)getERJSP()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.OP__EWEB_SERVICE:
				return ((InternalEList<?>)getEWebService()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.OP__EFACHADA:
				return ((InternalEList<?>)getEFachada()).basicRemove(otherEnd, msgs);
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
			case DependenciesPackage.OP__ESTADO_LLAMADA_OP:
				return getEstadoLlamadaOP();
			case DependenciesPackage.OP__ERJSP:
				return getERJSP();
			case DependenciesPackage.OP__LP_NAME:
				return getLpName();
			case DependenciesPackage.OP__OP_NAME:
				return getOpName();
			case DependenciesPackage.OP__VERSION:
				return getVersion();
			case DependenciesPackage.OP__EWEB_SERVICE:
				return getEWebService();
			case DependenciesPackage.OP__EOI:
				return getEOI();
			case DependenciesPackage.OP__EFACHADA:
				return getEFachada();
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
			case DependenciesPackage.OP__ESTADO_LLAMADA_OP:
				getEstadoLlamadaOP().clear();
				getEstadoLlamadaOP().addAll((Collection<? extends OP>)newValue);
				return;
			case DependenciesPackage.OP__ERJSP:
				getERJSP().clear();
				getERJSP().addAll((Collection<? extends JSP>)newValue);
				return;
			case DependenciesPackage.OP__LP_NAME:
				setLpName((String)newValue);
				return;
			case DependenciesPackage.OP__OP_NAME:
				setOpName((String)newValue);
				return;
			case DependenciesPackage.OP__VERSION:
				setVersion((String)newValue);
				return;
			case DependenciesPackage.OP__EWEB_SERVICE:
				getEWebService().clear();
				getEWebService().addAll((Collection<? extends Webservice>)newValue);
				return;
			case DependenciesPackage.OP__EOI:
				getEOI().clear();
				getEOI().addAll((Collection<? extends OI>)newValue);
				return;
			case DependenciesPackage.OP__EFACHADA:
				getEFachada().clear();
				getEFachada().addAll((Collection<? extends Fachada>)newValue);
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
			case DependenciesPackage.OP__ESTADO_LLAMADA_OP:
				getEstadoLlamadaOP().clear();
				return;
			case DependenciesPackage.OP__ERJSP:
				getERJSP().clear();
				return;
			case DependenciesPackage.OP__LP_NAME:
				setLpName(LP_NAME_EDEFAULT);
				return;
			case DependenciesPackage.OP__OP_NAME:
				setOpName(OP_NAME_EDEFAULT);
				return;
			case DependenciesPackage.OP__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DependenciesPackage.OP__EWEB_SERVICE:
				getEWebService().clear();
				return;
			case DependenciesPackage.OP__EOI:
				getEOI().clear();
				return;
			case DependenciesPackage.OP__EFACHADA:
				getEFachada().clear();
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
			case DependenciesPackage.OP__ESTADO_LLAMADA_OP:
				return estadoLlamadaOP != null && !estadoLlamadaOP.isEmpty();
			case DependenciesPackage.OP__ERJSP:
				return erjsp != null && !erjsp.isEmpty();
			case DependenciesPackage.OP__LP_NAME:
				return LP_NAME_EDEFAULT == null ? lpName != null : !LP_NAME_EDEFAULT.equals(lpName);
			case DependenciesPackage.OP__OP_NAME:
				return OP_NAME_EDEFAULT == null ? opName != null : !OP_NAME_EDEFAULT.equals(opName);
			case DependenciesPackage.OP__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DependenciesPackage.OP__EWEB_SERVICE:
				return eWebService != null && !eWebService.isEmpty();
			case DependenciesPackage.OP__EOI:
				return eOI != null && !eOI.isEmpty();
			case DependenciesPackage.OP__EFACHADA:
				return eFachada != null && !eFachada.isEmpty();
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
		result.append(" (lpName: ");
		result.append(lpName);
		result.append(", opName: ");
		result.append(opName);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //OPImpl
