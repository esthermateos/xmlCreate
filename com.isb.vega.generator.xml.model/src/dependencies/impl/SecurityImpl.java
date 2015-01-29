/**
 */
package dependencies.impl;

import dependencies.DependenciesPackage;
import dependencies.Security;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dependencies.impl.SecurityImpl#isAutentication <em>Autentication</em>}</li>
 *   <li>{@link dependencies.impl.SecurityImpl#getUsuNotes <em>Usu Notes</em>}</li>
 *   <li>{@link dependencies.impl.SecurityImpl#getEntityAlias <em>Entity Alias</em>}</li>
 *   <li>{@link dependencies.impl.SecurityImpl#isCodePassword <em>Code Password</em>}</li>
 *   <li>{@link dependencies.impl.SecurityImpl#isMulti <em>Multi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityImpl extends MinimalEObjectImpl.Container implements Security {
	/**
	 * The default value of the '{@link #isAutentication() <em>Autentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutentication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTENTICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutentication() <em>Autentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutentication()
	 * @generated
	 * @ordered
	 */
	protected boolean autentication = AUTENTICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsuNotes() <em>Usu Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String USU_NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsuNotes() <em>Usu Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuNotes()
	 * @generated
	 * @ordered
	 */
	protected String usuNotes = USU_NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntityAlias() <em>Entity Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityAlias() <em>Entity Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityAlias()
	 * @generated
	 * @ordered
	 */
	protected String entityAlias = ENTITY_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCodePassword() <em>Code Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCodePassword()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CODE_PASSWORD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCodePassword() <em>Code Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCodePassword()
	 * @generated
	 * @ordered
	 */
	protected boolean codePassword = CODE_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #isMulti() <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulti()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMulti() <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulti()
	 * @generated
	 * @ordered
	 */
	protected boolean multi = MULTI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependenciesPackage.Literals.SECURITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutentication() {
		return autentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutentication(boolean newAutentication) {
		boolean oldAutentication = autentication;
		autentication = newAutentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.SECURITY__AUTENTICATION, oldAutentication, autentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsuNotes() {
		return usuNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsuNotes(String newUsuNotes) {
		String oldUsuNotes = usuNotes;
		usuNotes = newUsuNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.SECURITY__USU_NOTES, oldUsuNotes, usuNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityAlias() {
		return entityAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityAlias(String newEntityAlias) {
		String oldEntityAlias = entityAlias;
		entityAlias = newEntityAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.SECURITY__ENTITY_ALIAS, oldEntityAlias, entityAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCodePassword() {
		return codePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePassword(boolean newCodePassword) {
		boolean oldCodePassword = codePassword;
		codePassword = newCodePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.SECURITY__CODE_PASSWORD, oldCodePassword, codePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMulti() {
		return multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulti(boolean newMulti) {
		boolean oldMulti = multi;
		multi = newMulti;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.SECURITY__MULTI, oldMulti, multi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependenciesPackage.SECURITY__AUTENTICATION:
				return isAutentication();
			case DependenciesPackage.SECURITY__USU_NOTES:
				return getUsuNotes();
			case DependenciesPackage.SECURITY__ENTITY_ALIAS:
				return getEntityAlias();
			case DependenciesPackage.SECURITY__CODE_PASSWORD:
				return isCodePassword();
			case DependenciesPackage.SECURITY__MULTI:
				return isMulti();
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
			case DependenciesPackage.SECURITY__AUTENTICATION:
				setAutentication((Boolean)newValue);
				return;
			case DependenciesPackage.SECURITY__USU_NOTES:
				setUsuNotes((String)newValue);
				return;
			case DependenciesPackage.SECURITY__ENTITY_ALIAS:
				setEntityAlias((String)newValue);
				return;
			case DependenciesPackage.SECURITY__CODE_PASSWORD:
				setCodePassword((Boolean)newValue);
				return;
			case DependenciesPackage.SECURITY__MULTI:
				setMulti((Boolean)newValue);
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
			case DependenciesPackage.SECURITY__AUTENTICATION:
				setAutentication(AUTENTICATION_EDEFAULT);
				return;
			case DependenciesPackage.SECURITY__USU_NOTES:
				setUsuNotes(USU_NOTES_EDEFAULT);
				return;
			case DependenciesPackage.SECURITY__ENTITY_ALIAS:
				setEntityAlias(ENTITY_ALIAS_EDEFAULT);
				return;
			case DependenciesPackage.SECURITY__CODE_PASSWORD:
				setCodePassword(CODE_PASSWORD_EDEFAULT);
				return;
			case DependenciesPackage.SECURITY__MULTI:
				setMulti(MULTI_EDEFAULT);
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
			case DependenciesPackage.SECURITY__AUTENTICATION:
				return autentication != AUTENTICATION_EDEFAULT;
			case DependenciesPackage.SECURITY__USU_NOTES:
				return USU_NOTES_EDEFAULT == null ? usuNotes != null : !USU_NOTES_EDEFAULT.equals(usuNotes);
			case DependenciesPackage.SECURITY__ENTITY_ALIAS:
				return ENTITY_ALIAS_EDEFAULT == null ? entityAlias != null : !ENTITY_ALIAS_EDEFAULT.equals(entityAlias);
			case DependenciesPackage.SECURITY__CODE_PASSWORD:
				return codePassword != CODE_PASSWORD_EDEFAULT;
			case DependenciesPackage.SECURITY__MULTI:
				return multi != MULTI_EDEFAULT;
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
		result.append(" (autentication: ");
		result.append(autentication);
		result.append(", usuNotes: ");
		result.append(usuNotes);
		result.append(", entityAlias: ");
		result.append(entityAlias);
		result.append(", codePassword: ");
		result.append(codePassword);
		result.append(", multi: ");
		result.append(multi);
		result.append(')');
		return result.toString();
	}

} //SecurityImpl
