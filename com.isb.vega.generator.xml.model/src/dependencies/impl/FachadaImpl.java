/**
 */
package dependencies.impl;

import dependencies.DependenciesPackage;
import dependencies.Fachada;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependenciesPackage.FACHADA__FACADE_NAME:
				return getFacadeName();
			case DependenciesPackage.FACHADA__INTERFAZ_NAME:
				return getInterfazName();
			case DependenciesPackage.FACHADA__METHOD_NAME:
				return getMethodName();
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
		result.append(')');
		return result.toString();
	}

} //FachadaImpl
