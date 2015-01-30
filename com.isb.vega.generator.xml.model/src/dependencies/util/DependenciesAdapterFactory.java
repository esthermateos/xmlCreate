/**
 */
package dependencies.util;

import dependencies.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dependencies.DependenciesPackage
 * @generated
 */
public class DependenciesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DependenciesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DependenciesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenciesSwitch<Adapter> modelSwitch =
		new DependenciesSwitch<Adapter>() {
			@Override
			public Adapter caseHOST(HOST object) {
				return createHOSTAdapter();
			}
			@Override
			public Adapter caseOP(OP object) {
				return createOPAdapter();
			}
			@Override
			public Adapter caseOI(OI object) {
				return createOIAdapter();
			}
			@Override
			public Adapter caseFachada(Fachada object) {
				return createFachadaAdapter();
			}
			@Override
			public Adapter caseTrxOP(TrxOP object) {
				return createTrxOPAdapter();
			}
			@Override
			public Adapter caseSAT(SAT object) {
				return createSATAdapter();
			}
			@Override
			public Adapter caseAltair(Altair object) {
				return createAltairAdapter();
			}
			@Override
			public Adapter caseWebservice(Webservice object) {
				return createWebserviceAdapter();
			}
			@Override
			public Adapter caseChannelAdapter(ChannelAdapter object) {
				return createChannelAdapterAdapter();
			}
			@Override
			public Adapter caseJMS(JMS object) {
				return createJMSAdapter();
			}
			@Override
			public Adapter caseEnsamblado(Ensamblado object) {
				return createEnsambladoAdapter();
			}
			@Override
			public Adapter caseSecurity(Security object) {
				return createSecurityAdapter();
			}
			@Override
			public Adapter caseMultiProfile(MultiProfile object) {
				return createMultiProfileAdapter();
			}
			@Override
			public Adapter caseJava(Java object) {
				return createJavaAdapter();
			}
			@Override
			public Adapter caseAppAdapter(AppAdapter object) {
				return createAppAdapterAdapter();
			}
			@Override
			public Adapter caseJSP(JSP object) {
				return createJSPAdapter();
			}
			@Override
			public Adapter caseSiebel(Siebel object) {
				return createSiebelAdapter();
			}
			@Override
			public Adapter caseTp(Tp object) {
				return createTpAdapter();
			}
			@Override
			public Adapter caseBBOO(BBOO object) {
				return createBBOOAdapter();
			}
			@Override
			public Adapter caseTableParameters(TableParameters object) {
				return createTableParametersAdapter();
			}
			@Override
			public Adapter caseSQLComponent(SQLComponent object) {
				return createSQLComponentAdapter();
			}
			@Override
			public Adapter casesqlSentence(sqlSentence object) {
				return createsqlSentenceAdapter();
			}
			@Override
			public Adapter caseClientArcReferences(ClientArcReferences object) {
				return createClientArcReferencesAdapter();
			}
			@Override
			public Adapter caseLogLevel(LogLevel object) {
				return createLogLevelAdapter();
			}
			@Override
			public Adapter caseRules(Rules object) {
				return createRulesAdapter();
			}
			@Override
			public Adapter casetrxOPLogicalChannel(trxOPLogicalChannel object) {
				return createtrxOPLogicalChannelAdapter();
			}
			@Override
			public Adapter casetrxOPPhysicalChannel(trxOPPhysicalChannel object) {
				return createtrxOPPhysicalChannelAdapter();
			}
			@Override
			public Adapter caseSATLogicalChannel(SATLogicalChannel object) {
				return createSATLogicalChannelAdapter();
			}
			@Override
			public Adapter caseSATPhysicalChannel(SATPhysicalChannel object) {
				return createSATPhysicalChannelAdapter();
			}
			@Override
			public Adapter caseCache(Cache object) {
				return createCacheAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dependencies.HOST <em>HOST</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.HOST
	 * @generated
	 */
	public Adapter createHOSTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.OP <em>OP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.OP
	 * @generated
	 */
	public Adapter createOPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.OI <em>OI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.OI
	 * @generated
	 */
	public Adapter createOIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.Fachada <em>Fachada</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.Fachada
	 * @generated
	 */
	public Adapter createFachadaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.TrxOP <em>Trx OP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.TrxOP
	 * @generated
	 */
	public Adapter createTrxOPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.SAT <em>SAT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.SAT
	 * @generated
	 */
	public Adapter createSATAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.Altair <em>Altair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.Altair
	 * @generated
	 */
	public Adapter createAltairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.Webservice <em>Webservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.Webservice
	 * @generated
	 */
	public Adapter createWebserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.ChannelAdapter <em>Channel Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.ChannelAdapter
	 * @generated
	 */
	public Adapter createChannelAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.JMS <em>JMS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.JMS
	 * @generated
	 */
	public Adapter createJMSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.Ensamblado <em>Ensamblado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.Ensamblado
	 * @generated
	 */
	public Adapter createEnsambladoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.Security
	 * @generated
	 */
	public Adapter createSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.MultiProfile <em>Multi Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.MultiProfile
	 * @generated
	 */
	public Adapter createMultiProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.Java <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.Java
	 * @generated
	 */
	public Adapter createJavaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.AppAdapter <em>App Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.AppAdapter
	 * @generated
	 */
	public Adapter createAppAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.JSP <em>JSP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.JSP
	 * @generated
	 */
	public Adapter createJSPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.Siebel <em>Siebel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.Siebel
	 * @generated
	 */
	public Adapter createSiebelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.Tp <em>Tp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.Tp
	 * @generated
	 */
	public Adapter createTpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.BBOO <em>BBOO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.BBOO
	 * @generated
	 */
	public Adapter createBBOOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.TableParameters <em>Table Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.TableParameters
	 * @generated
	 */
	public Adapter createTableParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.SQLComponent <em>SQL Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.SQLComponent
	 * @generated
	 */
	public Adapter createSQLComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.sqlSentence <em>sql Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.sqlSentence
	 * @generated
	 */
	public Adapter createsqlSentenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.ClientArcReferences <em>Client Arc References</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.ClientArcReferences
	 * @generated
	 */
	public Adapter createClientArcReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.LogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.LogLevel
	 * @generated
	 */
	public Adapter createLogLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.Rules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.Rules
	 * @generated
	 */
	public Adapter createRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.trxOPLogicalChannel <em>trx OP Logical Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.trxOPLogicalChannel
	 * @generated
	 */
	public Adapter createtrxOPLogicalChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.trxOPPhysicalChannel <em>trx OP Physical Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.trxOPPhysicalChannel
	 * @generated
	 */
	public Adapter createtrxOPPhysicalChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.SATLogicalChannel <em>SAT Logical Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.SATLogicalChannel
	 * @generated
	 */
	public Adapter createSATLogicalChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.SATPhysicalChannel <em>SAT Physical Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.SATPhysicalChannel
	 * @generated
	 */
	public Adapter createSATPhysicalChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dependencies.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dependencies.Cache
	 * @generated
	 */
	public Adapter createCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DependenciesAdapterFactory
