/**
 */
package dependencies.impl;

import dependencies.DependenciesPackage;
import dependencies.MultiProfile;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.MultiProfileImpl#getCatCompany <em>Cat Company</em>}</li>
 *   <li>{@link dependencies.impl.MultiProfileImpl#getCatCanalMarco <em>Cat Canal Marco</em>}</li>
 *   <li>{@link dependencies.impl.MultiProfileImpl#getCatGama <em>Cat Gama</em>}</li>
 *   <li>{@link dependencies.impl.MultiProfileImpl#getCatIdioma <em>Cat Idioma</em>}</li>
 *   <li>{@link dependencies.impl.MultiProfileImpl#getCatEstructura <em>Cat Estructura</em>}</li>
 *   <li>{@link dependencies.impl.MultiProfileImpl#getCatNivelIU <em>Cat Nivel IU</em>}</li>
 *   <li>{@link dependencies.impl.MultiProfileImpl#getCatEmpresaAsociada <em>Cat Empresa Asociada</em>}</li>
 *   <li>{@link dependencies.impl.MultiProfileImpl#getCatRender <em>Cat Render</em>}</li>
 *   <li>{@link dependencies.impl.MultiProfileImpl#getCatOrden <em>Cat Orden</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiProfileImpl extends MinimalEObjectImpl.Container implements MultiProfile {
	/**
	 * The default value of the '{@link #getCatCompany() <em>Cat Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatCompany()
	 * @generated
	 * @ordered
	 */
	protected static final String CAT_COMPANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatCompany() <em>Cat Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatCompany()
	 * @generated
	 * @ordered
	 */
	protected String catCompany = CAT_COMPANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatCanalMarco() <em>Cat Canal Marco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatCanalMarco()
	 * @generated
	 * @ordered
	 */
	protected static final String CAT_CANAL_MARCO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatCanalMarco() <em>Cat Canal Marco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatCanalMarco()
	 * @generated
	 * @ordered
	 */
	protected String catCanalMarco = CAT_CANAL_MARCO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatGama() <em>Cat Gama</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatGama()
	 * @generated
	 * @ordered
	 */
	protected static final String CAT_GAMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatGama() <em>Cat Gama</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatGama()
	 * @generated
	 * @ordered
	 */
	protected String catGama = CAT_GAMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatIdioma() <em>Cat Idioma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatIdioma()
	 * @generated
	 * @ordered
	 */
	protected static final String CAT_IDIOMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatIdioma() <em>Cat Idioma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatIdioma()
	 * @generated
	 * @ordered
	 */
	protected String catIdioma = CAT_IDIOMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatEstructura() <em>Cat Estructura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatEstructura()
	 * @generated
	 * @ordered
	 */
	protected static final String CAT_ESTRUCTURA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatEstructura() <em>Cat Estructura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatEstructura()
	 * @generated
	 * @ordered
	 */
	protected String catEstructura = CAT_ESTRUCTURA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatNivelIU() <em>Cat Nivel IU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatNivelIU()
	 * @generated
	 * @ordered
	 */
	protected static final String CAT_NIVEL_IU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatNivelIU() <em>Cat Nivel IU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatNivelIU()
	 * @generated
	 * @ordered
	 */
	protected String catNivelIU = CAT_NIVEL_IU_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatEmpresaAsociada() <em>Cat Empresa Asociada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatEmpresaAsociada()
	 * @generated
	 * @ordered
	 */
	protected static final String CAT_EMPRESA_ASOCIADA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatEmpresaAsociada() <em>Cat Empresa Asociada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatEmpresaAsociada()
	 * @generated
	 * @ordered
	 */
	protected String catEmpresaAsociada = CAT_EMPRESA_ASOCIADA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatRender() <em>Cat Render</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatRender()
	 * @generated
	 * @ordered
	 */
	protected static final String CAT_RENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatRender() <em>Cat Render</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatRender()
	 * @generated
	 * @ordered
	 */
	protected String catRender = CAT_RENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatOrden() <em>Cat Orden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatOrden()
	 * @generated
	 * @ordered
	 */
	protected static final String CAT_ORDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatOrden() <em>Cat Orden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatOrden()
	 * @generated
	 * @ordered
	 */
	protected String catOrden = CAT_ORDEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.MULTI_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatCompany() {
		return catCompany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatCompany(String newCatCompany) {
		String oldCatCompany = catCompany;
		catCompany = newCatCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.MULTI_PROFILE__CAT_COMPANY, oldCatCompany, catCompany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatCanalMarco() {
		return catCanalMarco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatCanalMarco(String newCatCanalMarco) {
		String oldCatCanalMarco = catCanalMarco;
		catCanalMarco = newCatCanalMarco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.MULTI_PROFILE__CAT_CANAL_MARCO, oldCatCanalMarco, catCanalMarco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatGama() {
		return catGama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatGama(String newCatGama) {
		String oldCatGama = catGama;
		catGama = newCatGama;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.MULTI_PROFILE__CAT_GAMA, oldCatGama, catGama));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatIdioma() {
		return catIdioma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatIdioma(String newCatIdioma) {
		String oldCatIdioma = catIdioma;
		catIdioma = newCatIdioma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.MULTI_PROFILE__CAT_IDIOMA, oldCatIdioma, catIdioma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatEstructura() {
		return catEstructura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatEstructura(String newCatEstructura) {
		String oldCatEstructura = catEstructura;
		catEstructura = newCatEstructura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.MULTI_PROFILE__CAT_ESTRUCTURA, oldCatEstructura, catEstructura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatNivelIU() {
		return catNivelIU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatNivelIU(String newCatNivelIU) {
		String oldCatNivelIU = catNivelIU;
		catNivelIU = newCatNivelIU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.MULTI_PROFILE__CAT_NIVEL_IU, oldCatNivelIU, catNivelIU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatEmpresaAsociada() {
		return catEmpresaAsociada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatEmpresaAsociada(String newCatEmpresaAsociada) {
		String oldCatEmpresaAsociada = catEmpresaAsociada;
		catEmpresaAsociada = newCatEmpresaAsociada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.MULTI_PROFILE__CAT_EMPRESA_ASOCIADA, oldCatEmpresaAsociada, catEmpresaAsociada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatRender() {
		return catRender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatRender(String newCatRender) {
		String oldCatRender = catRender;
		catRender = newCatRender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.MULTI_PROFILE__CAT_RENDER, oldCatRender, catRender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatOrden() {
		return catOrden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatOrden(String newCatOrden) {
		String oldCatOrden = catOrden;
		catOrden = newCatOrden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.MULTI_PROFILE__CAT_ORDEN, oldCatOrden, catOrden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependenciesPackage.MULTI_PROFILE__CAT_COMPANY:
				return getCatCompany();
			case DependenciesPackage.MULTI_PROFILE__CAT_CANAL_MARCO:
				return getCatCanalMarco();
			case DependenciesPackage.MULTI_PROFILE__CAT_GAMA:
				return getCatGama();
			case DependenciesPackage.MULTI_PROFILE__CAT_IDIOMA:
				return getCatIdioma();
			case DependenciesPackage.MULTI_PROFILE__CAT_ESTRUCTURA:
				return getCatEstructura();
			case DependenciesPackage.MULTI_PROFILE__CAT_NIVEL_IU:
				return getCatNivelIU();
			case DependenciesPackage.MULTI_PROFILE__CAT_EMPRESA_ASOCIADA:
				return getCatEmpresaAsociada();
			case DependenciesPackage.MULTI_PROFILE__CAT_RENDER:
				return getCatRender();
			case DependenciesPackage.MULTI_PROFILE__CAT_ORDEN:
				return getCatOrden();
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
			case DependenciesPackage.MULTI_PROFILE__CAT_COMPANY:
				setCatCompany((String)newValue);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_CANAL_MARCO:
				setCatCanalMarco((String)newValue);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_GAMA:
				setCatGama((String)newValue);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_IDIOMA:
				setCatIdioma((String)newValue);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_ESTRUCTURA:
				setCatEstructura((String)newValue);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_NIVEL_IU:
				setCatNivelIU((String)newValue);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_EMPRESA_ASOCIADA:
				setCatEmpresaAsociada((String)newValue);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_RENDER:
				setCatRender((String)newValue);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_ORDEN:
				setCatOrden((String)newValue);
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
			case DependenciesPackage.MULTI_PROFILE__CAT_COMPANY:
				setCatCompany(CAT_COMPANY_EDEFAULT);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_CANAL_MARCO:
				setCatCanalMarco(CAT_CANAL_MARCO_EDEFAULT);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_GAMA:
				setCatGama(CAT_GAMA_EDEFAULT);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_IDIOMA:
				setCatIdioma(CAT_IDIOMA_EDEFAULT);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_ESTRUCTURA:
				setCatEstructura(CAT_ESTRUCTURA_EDEFAULT);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_NIVEL_IU:
				setCatNivelIU(CAT_NIVEL_IU_EDEFAULT);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_EMPRESA_ASOCIADA:
				setCatEmpresaAsociada(CAT_EMPRESA_ASOCIADA_EDEFAULT);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_RENDER:
				setCatRender(CAT_RENDER_EDEFAULT);
				return;
			case DependenciesPackage.MULTI_PROFILE__CAT_ORDEN:
				setCatOrden(CAT_ORDEN_EDEFAULT);
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
			case DependenciesPackage.MULTI_PROFILE__CAT_COMPANY:
				return CAT_COMPANY_EDEFAULT == null ? catCompany != null : !CAT_COMPANY_EDEFAULT.equals(catCompany);
			case DependenciesPackage.MULTI_PROFILE__CAT_CANAL_MARCO:
				return CAT_CANAL_MARCO_EDEFAULT == null ? catCanalMarco != null : !CAT_CANAL_MARCO_EDEFAULT.equals(catCanalMarco);
			case DependenciesPackage.MULTI_PROFILE__CAT_GAMA:
				return CAT_GAMA_EDEFAULT == null ? catGama != null : !CAT_GAMA_EDEFAULT.equals(catGama);
			case DependenciesPackage.MULTI_PROFILE__CAT_IDIOMA:
				return CAT_IDIOMA_EDEFAULT == null ? catIdioma != null : !CAT_IDIOMA_EDEFAULT.equals(catIdioma);
			case DependenciesPackage.MULTI_PROFILE__CAT_ESTRUCTURA:
				return CAT_ESTRUCTURA_EDEFAULT == null ? catEstructura != null : !CAT_ESTRUCTURA_EDEFAULT.equals(catEstructura);
			case DependenciesPackage.MULTI_PROFILE__CAT_NIVEL_IU:
				return CAT_NIVEL_IU_EDEFAULT == null ? catNivelIU != null : !CAT_NIVEL_IU_EDEFAULT.equals(catNivelIU);
			case DependenciesPackage.MULTI_PROFILE__CAT_EMPRESA_ASOCIADA:
				return CAT_EMPRESA_ASOCIADA_EDEFAULT == null ? catEmpresaAsociada != null : !CAT_EMPRESA_ASOCIADA_EDEFAULT.equals(catEmpresaAsociada);
			case DependenciesPackage.MULTI_PROFILE__CAT_RENDER:
				return CAT_RENDER_EDEFAULT == null ? catRender != null : !CAT_RENDER_EDEFAULT.equals(catRender);
			case DependenciesPackage.MULTI_PROFILE__CAT_ORDEN:
				return CAT_ORDEN_EDEFAULT == null ? catOrden != null : !CAT_ORDEN_EDEFAULT.equals(catOrden);
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
		result.append(" (catCompany: ");
		result.append(catCompany);
		result.append(", catCanalMarco: ");
		result.append(catCanalMarco);
		result.append(", catGama: ");
		result.append(catGama);
		result.append(", catIdioma: ");
		result.append(catIdioma);
		result.append(", catEstructura: ");
		result.append(catEstructura);
		result.append(", catNivelIU: ");
		result.append(catNivelIU);
		result.append(", catEmpresaAsociada: ");
		result.append(catEmpresaAsociada);
		result.append(", catRender: ");
		result.append(catRender);
		result.append(", catOrden: ");
		result.append(catOrden);
		result.append(')');
		return result.toString();
	}

} //MultiProfileImpl
