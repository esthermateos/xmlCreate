/**
 */
package dependencies.impl;

import dependencies.Altair;
import dependencies.AppAdapter;
import dependencies.BBOO;
import dependencies.ComponentSQL;
import dependencies.DependenciesPackage;
import dependencies.Fachada;
import dependencies.Java;
import dependencies.OI;
import dependencies.SAT;
import dependencies.Siebel;
import dependencies.Tp;
import dependencies.TrxOP;
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
 * An implementation of the model object '<em><b>OI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.OIImpl#getEstadoLlamadaOI <em>Estado Llamada OI</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getLnName <em>Ln Name</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getOiName <em>Oi Name</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getETp <em>ETp</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getEBBOO <em>EBBOO</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getESiebel <em>ESiebel</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getEComponentSQL <em>EComponent SQL</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getEAltair <em>EAltair</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getETrxOP <em>ETrx OP</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getESAT <em>ESAT</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getEFachada <em>EFachada</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getEWebService <em>EWeb Service</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getEJava <em>EJava</em>}</li>
 *   <li>{@link dependencies.impl.OIImpl#getEAppAdapter <em>EApp Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OIImpl extends MinimalEObjectImpl.Container implements OI {
	/**
	 * The cached value of the '{@link #getEstadoLlamadaOI() <em>Estado Llamada OI</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadoLlamadaOI()
	 * @generated
	 * @ordered
	 */
	protected EList<OI> estadoLlamadaOI;

	/**
	 * The default value of the '{@link #getLnName() <em>Ln Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnName()
	 * @generated
	 * @ordered
	 */
	protected static final String LN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLnName() <em>Ln Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnName()
	 * @generated
	 * @ordered
	 */
	protected String lnName = LN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOiName() <em>Oi Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOiName()
	 * @generated
	 * @ordered
	 */
	protected static final String OI_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOiName() <em>Oi Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOiName()
	 * @generated
	 * @ordered
	 */
	protected String oiName = OI_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getETp() <em>ETp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETp()
	 * @generated
	 * @ordered
	 */
	protected EList<Tp> eTp;

	/**
	 * The cached value of the '{@link #getEBBOO() <em>EBBOO</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBBOO()
	 * @generated
	 * @ordered
	 */
	protected EList<BBOO> eBBOO;

	/**
	 * The cached value of the '{@link #getESiebel() <em>ESiebel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESiebel()
	 * @generated
	 * @ordered
	 */
	protected EList<Siebel> eSiebel;

	/**
	 * The cached value of the '{@link #getEComponentSQL() <em>EComponent SQL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEComponentSQL()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentSQL> eComponentSQL;

	/**
	 * The cached value of the '{@link #getEAltair() <em>EAltair</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAltair()
	 * @generated
	 * @ordered
	 */
	protected EList<Altair> eAltair;

	/**
	 * The cached value of the '{@link #getETrxOP() <em>ETrx OP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETrxOP()
	 * @generated
	 * @ordered
	 */
	protected EList<TrxOP> eTrxOP;

	/**
	 * The cached value of the '{@link #getESAT() <em>ESAT</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESAT()
	 * @generated
	 * @ordered
	 */
	protected EList<SAT> eSAT;

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
	 * The cached value of the '{@link #getEWebService() <em>EWeb Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEWebService()
	 * @generated
	 * @ordered
	 */
	protected EList<Webservice> eWebService;

	/**
	 * The cached value of the '{@link #getEJava() <em>EJava</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEJava()
	 * @generated
	 * @ordered
	 */
	protected EList<Java> eJava;

	/**
	 * The cached value of the '{@link #getEAppAdapter() <em>EApp Adapter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAppAdapter()
	 * @generated
	 * @ordered
	 */
	protected EList<AppAdapter> eAppAdapter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.OI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OI> getEstadoLlamadaOI() {
		if (estadoLlamadaOI == null) {
			estadoLlamadaOI = new EObjectResolvingEList<OI>(OI.class, this, DependenciesPackage.OI__ESTADO_LLAMADA_OI);
		}
		return estadoLlamadaOI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLnName() {
		return lnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLnName(String newLnName) {
		String oldLnName = lnName;
		lnName = newLnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.OI__LN_NAME, oldLnName, lnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOiName() {
		return oiName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOiName(String newOiName) {
		String oldOiName = oiName;
		oiName = newOiName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.OI__OI_NAME, oldOiName, oiName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.OI__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tp> getETp() {
		if (eTp == null) {
			eTp = new EObjectContainmentEList<Tp>(Tp.class, this, DependenciesPackage.OI__ETP);
		}
		return eTp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BBOO> getEBBOO() {
		if (eBBOO == null) {
			eBBOO = new EObjectContainmentEList<BBOO>(BBOO.class, this, DependenciesPackage.OI__EBBOO);
		}
		return eBBOO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Siebel> getESiebel() {
		if (eSiebel == null) {
			eSiebel = new EObjectContainmentEList<Siebel>(Siebel.class, this, DependenciesPackage.OI__ESIEBEL);
		}
		return eSiebel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentSQL> getEComponentSQL() {
		if (eComponentSQL == null) {
			eComponentSQL = new EObjectContainmentEList<ComponentSQL>(ComponentSQL.class, this, DependenciesPackage.OI__ECOMPONENT_SQL);
		}
		return eComponentSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Altair> getEAltair() {
		if (eAltair == null) {
			eAltair = new EObjectContainmentEList<Altair>(Altair.class, this, DependenciesPackage.OI__EALTAIR);
		}
		return eAltair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrxOP> getETrxOP() {
		if (eTrxOP == null) {
			eTrxOP = new EObjectContainmentEList<TrxOP>(TrxOP.class, this, DependenciesPackage.OI__ETRX_OP);
		}
		return eTrxOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SAT> getESAT() {
		if (eSAT == null) {
			eSAT = new EObjectContainmentEList<SAT>(SAT.class, this, DependenciesPackage.OI__ESAT);
		}
		return eSAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fachada> getEFachada() {
		if (eFachada == null) {
			eFachada = new EObjectContainmentEList<Fachada>(Fachada.class, this, DependenciesPackage.OI__EFACHADA);
		}
		return eFachada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Webservice> getEWebService() {
		if (eWebService == null) {
			eWebService = new EObjectResolvingEList<Webservice>(Webservice.class, this, DependenciesPackage.OI__EWEB_SERVICE);
		}
		return eWebService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Java> getEJava() {
		if (eJava == null) {
			eJava = new EObjectContainmentEList<Java>(Java.class, this, DependenciesPackage.OI__EJAVA);
		}
		return eJava;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AppAdapter> getEAppAdapter() {
		if (eAppAdapter == null) {
			eAppAdapter = new EObjectContainmentEList<AppAdapter>(AppAdapter.class, this, DependenciesPackage.OI__EAPP_ADAPTER);
		}
		return eAppAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependenciesPackage.OI__ETP:
				return ((InternalEList<?>)getETp()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.OI__EBBOO:
				return ((InternalEList<?>)getEBBOO()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.OI__ESIEBEL:
				return ((InternalEList<?>)getESiebel()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.OI__ECOMPONENT_SQL:
				return ((InternalEList<?>)getEComponentSQL()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.OI__EALTAIR:
				return ((InternalEList<?>)getEAltair()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.OI__ETRX_OP:
				return ((InternalEList<?>)getETrxOP()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.OI__ESAT:
				return ((InternalEList<?>)getESAT()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.OI__EFACHADA:
				return ((InternalEList<?>)getEFachada()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.OI__EJAVA:
				return ((InternalEList<?>)getEJava()).basicRemove(otherEnd, msgs);
			case DependenciesPackage.OI__EAPP_ADAPTER:
				return ((InternalEList<?>)getEAppAdapter()).basicRemove(otherEnd, msgs);
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
			case DependenciesPackage.OI__ESTADO_LLAMADA_OI:
				return getEstadoLlamadaOI();
			case DependenciesPackage.OI__LN_NAME:
				return getLnName();
			case DependenciesPackage.OI__OI_NAME:
				return getOiName();
			case DependenciesPackage.OI__VERSION:
				return getVersion();
			case DependenciesPackage.OI__ETP:
				return getETp();
			case DependenciesPackage.OI__EBBOO:
				return getEBBOO();
			case DependenciesPackage.OI__ESIEBEL:
				return getESiebel();
			case DependenciesPackage.OI__ECOMPONENT_SQL:
				return getEComponentSQL();
			case DependenciesPackage.OI__EALTAIR:
				return getEAltair();
			case DependenciesPackage.OI__ETRX_OP:
				return getETrxOP();
			case DependenciesPackage.OI__ESAT:
				return getESAT();
			case DependenciesPackage.OI__EFACHADA:
				return getEFachada();
			case DependenciesPackage.OI__EWEB_SERVICE:
				return getEWebService();
			case DependenciesPackage.OI__EJAVA:
				return getEJava();
			case DependenciesPackage.OI__EAPP_ADAPTER:
				return getEAppAdapter();
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
			case DependenciesPackage.OI__ESTADO_LLAMADA_OI:
				getEstadoLlamadaOI().clear();
				getEstadoLlamadaOI().addAll((Collection<? extends OI>)newValue);
				return;
			case DependenciesPackage.OI__LN_NAME:
				setLnName((String)newValue);
				return;
			case DependenciesPackage.OI__OI_NAME:
				setOiName((String)newValue);
				return;
			case DependenciesPackage.OI__VERSION:
				setVersion((String)newValue);
				return;
			case DependenciesPackage.OI__ETP:
				getETp().clear();
				getETp().addAll((Collection<? extends Tp>)newValue);
				return;
			case DependenciesPackage.OI__EBBOO:
				getEBBOO().clear();
				getEBBOO().addAll((Collection<? extends BBOO>)newValue);
				return;
			case DependenciesPackage.OI__ESIEBEL:
				getESiebel().clear();
				getESiebel().addAll((Collection<? extends Siebel>)newValue);
				return;
			case DependenciesPackage.OI__ECOMPONENT_SQL:
				getEComponentSQL().clear();
				getEComponentSQL().addAll((Collection<? extends ComponentSQL>)newValue);
				return;
			case DependenciesPackage.OI__EALTAIR:
				getEAltair().clear();
				getEAltair().addAll((Collection<? extends Altair>)newValue);
				return;
			case DependenciesPackage.OI__ETRX_OP:
				getETrxOP().clear();
				getETrxOP().addAll((Collection<? extends TrxOP>)newValue);
				return;
			case DependenciesPackage.OI__ESAT:
				getESAT().clear();
				getESAT().addAll((Collection<? extends SAT>)newValue);
				return;
			case DependenciesPackage.OI__EFACHADA:
				getEFachada().clear();
				getEFachada().addAll((Collection<? extends Fachada>)newValue);
				return;
			case DependenciesPackage.OI__EWEB_SERVICE:
				getEWebService().clear();
				getEWebService().addAll((Collection<? extends Webservice>)newValue);
				return;
			case DependenciesPackage.OI__EJAVA:
				getEJava().clear();
				getEJava().addAll((Collection<? extends Java>)newValue);
				return;
			case DependenciesPackage.OI__EAPP_ADAPTER:
				getEAppAdapter().clear();
				getEAppAdapter().addAll((Collection<? extends AppAdapter>)newValue);
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
			case DependenciesPackage.OI__ESTADO_LLAMADA_OI:
				getEstadoLlamadaOI().clear();
				return;
			case DependenciesPackage.OI__LN_NAME:
				setLnName(LN_NAME_EDEFAULT);
				return;
			case DependenciesPackage.OI__OI_NAME:
				setOiName(OI_NAME_EDEFAULT);
				return;
			case DependenciesPackage.OI__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DependenciesPackage.OI__ETP:
				getETp().clear();
				return;
			case DependenciesPackage.OI__EBBOO:
				getEBBOO().clear();
				return;
			case DependenciesPackage.OI__ESIEBEL:
				getESiebel().clear();
				return;
			case DependenciesPackage.OI__ECOMPONENT_SQL:
				getEComponentSQL().clear();
				return;
			case DependenciesPackage.OI__EALTAIR:
				getEAltair().clear();
				return;
			case DependenciesPackage.OI__ETRX_OP:
				getETrxOP().clear();
				return;
			case DependenciesPackage.OI__ESAT:
				getESAT().clear();
				return;
			case DependenciesPackage.OI__EFACHADA:
				getEFachada().clear();
				return;
			case DependenciesPackage.OI__EWEB_SERVICE:
				getEWebService().clear();
				return;
			case DependenciesPackage.OI__EJAVA:
				getEJava().clear();
				return;
			case DependenciesPackage.OI__EAPP_ADAPTER:
				getEAppAdapter().clear();
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
			case DependenciesPackage.OI__ESTADO_LLAMADA_OI:
				return estadoLlamadaOI != null && !estadoLlamadaOI.isEmpty();
			case DependenciesPackage.OI__LN_NAME:
				return LN_NAME_EDEFAULT == null ? lnName != null : !LN_NAME_EDEFAULT.equals(lnName);
			case DependenciesPackage.OI__OI_NAME:
				return OI_NAME_EDEFAULT == null ? oiName != null : !OI_NAME_EDEFAULT.equals(oiName);
			case DependenciesPackage.OI__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DependenciesPackage.OI__ETP:
				return eTp != null && !eTp.isEmpty();
			case DependenciesPackage.OI__EBBOO:
				return eBBOO != null && !eBBOO.isEmpty();
			case DependenciesPackage.OI__ESIEBEL:
				return eSiebel != null && !eSiebel.isEmpty();
			case DependenciesPackage.OI__ECOMPONENT_SQL:
				return eComponentSQL != null && !eComponentSQL.isEmpty();
			case DependenciesPackage.OI__EALTAIR:
				return eAltair != null && !eAltair.isEmpty();
			case DependenciesPackage.OI__ETRX_OP:
				return eTrxOP != null && !eTrxOP.isEmpty();
			case DependenciesPackage.OI__ESAT:
				return eSAT != null && !eSAT.isEmpty();
			case DependenciesPackage.OI__EFACHADA:
				return eFachada != null && !eFachada.isEmpty();
			case DependenciesPackage.OI__EWEB_SERVICE:
				return eWebService != null && !eWebService.isEmpty();
			case DependenciesPackage.OI__EJAVA:
				return eJava != null && !eJava.isEmpty();
			case DependenciesPackage.OI__EAPP_ADAPTER:
				return eAppAdapter != null && !eAppAdapter.isEmpty();
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
		result.append(" (lnName: ");
		result.append(lnName);
		result.append(", oiName: ");
		result.append(oiName);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //OIImpl
