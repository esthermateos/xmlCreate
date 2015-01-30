/**
 */
package dependencies.util;

import dependencies.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dependencies.DependenciesPackage
 * @generated
 */
public class DependenciesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DependenciesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesSwitch() {
		if (modelPackage == null) {
			modelPackage = DependenciesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DependenciesPackage.HOST: {
				HOST host = (HOST)theEObject;
				T result = caseHOST(host);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.OP: {
				OP op = (OP)theEObject;
				T result = caseOP(op);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.OI: {
				OI oi = (OI)theEObject;
				T result = caseOI(oi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.FACHADA: {
				Fachada fachada = (Fachada)theEObject;
				T result = caseFachada(fachada);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.TRX_OP: {
				TrxOP trxOP = (TrxOP)theEObject;
				T result = caseTrxOP(trxOP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.SAT: {
				SAT sat = (SAT)theEObject;
				T result = caseSAT(sat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.ALTAIR: {
				Altair altair = (Altair)theEObject;
				T result = caseAltair(altair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.WEBSERVICE: {
				Webservice webservice = (Webservice)theEObject;
				T result = caseWebservice(webservice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.CHANNEL_ADAPTER: {
				ChannelAdapter channelAdapter = (ChannelAdapter)theEObject;
				T result = caseChannelAdapter(channelAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.JMS: {
				JMS jms = (JMS)theEObject;
				T result = caseJMS(jms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.ENSAMBLADO: {
				Ensamblado ensamblado = (Ensamblado)theEObject;
				T result = caseEnsamblado(ensamblado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.SECURITY: {
				Security security = (Security)theEObject;
				T result = caseSecurity(security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.MULTI_PROFILE: {
				MultiProfile multiProfile = (MultiProfile)theEObject;
				T result = caseMultiProfile(multiProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.JAVA: {
				Java java = (Java)theEObject;
				T result = caseJava(java);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.APP_ADAPTER: {
				AppAdapter appAdapter = (AppAdapter)theEObject;
				T result = caseAppAdapter(appAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.JSP: {
				JSP jsp = (JSP)theEObject;
				T result = caseJSP(jsp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.SIEBEL: {
				Siebel siebel = (Siebel)theEObject;
				T result = caseSiebel(siebel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.TP: {
				Tp tp = (Tp)theEObject;
				T result = caseTp(tp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.BBOO: {
				BBOO bboo = (BBOO)theEObject;
				T result = caseBBOO(bboo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.TABLE_PARAMETERS: {
				TableParameters tableParameters = (TableParameters)theEObject;
				T result = caseTableParameters(tableParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.SQL_COMPONENT: {
				SQLComponent sqlComponent = (SQLComponent)theEObject;
				T result = caseSQLComponent(sqlComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.SQL_SENTENCE: {
				sqlSentence sqlSentence = (sqlSentence)theEObject;
				T result = casesqlSentence(sqlSentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.CLIENT_ARC_REFERENCES: {
				ClientArcReferences clientArcReferences = (ClientArcReferences)theEObject;
				T result = caseClientArcReferences(clientArcReferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.LOG_LEVEL: {
				LogLevel logLevel = (LogLevel)theEObject;
				T result = caseLogLevel(logLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.RULES: {
				Rules rules = (Rules)theEObject;
				T result = caseRules(rules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.TRX_OP_LOGICAL_CHANNEL: {
				trxOPLogicalChannel trxOPLogicalChannel = (trxOPLogicalChannel)theEObject;
				T result = casetrxOPLogicalChannel(trxOPLogicalChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.TRX_OP_PHYSICAL_CHANNEL: {
				trxOPPhysicalChannel trxOPPhysicalChannel = (trxOPPhysicalChannel)theEObject;
				T result = casetrxOPPhysicalChannel(trxOPPhysicalChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.SAT_LOGICAL_CHANNEL: {
				SATLogicalChannel satLogicalChannel = (SATLogicalChannel)theEObject;
				T result = caseSATLogicalChannel(satLogicalChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.SAT_PHYSICAL_CHANNEL: {
				SATPhysicalChannel satPhysicalChannel = (SATPhysicalChannel)theEObject;
				T result = caseSATPhysicalChannel(satPhysicalChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependenciesPackage.CACHE: {
				Cache cache = (Cache)theEObject;
				T result = caseCache(cache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HOST</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HOST</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHOST(HOST object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOP(OP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOI(OI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fachada</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fachada</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFachada(Fachada object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trx OP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trx OP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrxOP(TrxOP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAT(SAT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Altair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Altair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltair(Altair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Webservice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Webservice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebservice(Webservice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelAdapter(ChannelAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JMS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JMS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJMS(JMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ensamblado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ensamblado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnsamblado(Ensamblado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity(Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiProfile(MultiProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJava(Java object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppAdapter(AppAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSP(JSP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Siebel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Siebel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiebel(Siebel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTp(Tp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BBOO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BBOO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBBOO(BBOO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableParameters(TableParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLComponent(SQLComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sql Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sql Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesqlSentence(sqlSentence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Arc References</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Arc References</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClientArcReferences(ClientArcReferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogLevel(LogLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRules(Rules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>trx OP Logical Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>trx OP Logical Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetrxOPLogicalChannel(trxOPLogicalChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>trx OP Physical Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>trx OP Physical Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetrxOPPhysicalChannel(trxOPPhysicalChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAT Logical Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAT Logical Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSATLogicalChannel(SATLogicalChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAT Physical Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAT Physical Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSATPhysicalChannel(SATPhysicalChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCache(Cache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DependenciesSwitch
