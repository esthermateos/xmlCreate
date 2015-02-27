package com.isb.vega.generator.xml.configuration;

import java.util.ArrayList;
import java.util.List;

import com.isb.vega.model.assembly.IAssemblyFile;
import com.isb.vega.model.assembly.IAssemblyProject;
import com.isb.vega.model.component.IComponent;
import com.isb.vega.model.component.IComponentData;
import com.isb.vega.model.component.IComponentField;
import com.isb.vega.model.component.IPhysicalComponentData;
import com.isb.vega.model.component.appadapter.IAppAdapterComponent;
import com.isb.vega.model.component.java.IJavaComponent;
import com.isb.vega.model.component.sql.ISQLComponent;
import com.isb.vega.model.component.sql.ISQLComponentData;
import com.isb.vega.model.component.sql.ISQLSentenceField;
import com.isb.vega.model.core.IVegaElement;
import com.isb.vega.model.operation.IOperation;
import com.isb.vega.model.parameter.IParameterType;
import com.isb.vega.model.scenario.IScenario;

import dependencies.AppAdapter;
import dependencies.Cache;
import dependencies.ComponentSQL;
import dependencies.DependenciesFactory;
import dependencies.Fachada;
import dependencies.Java;
import dependencies.OP;
import dependencies.SQLSentence;


public class GenerateComponents{
	List<Fachada> listFachada = new ArrayList<Fachada>();
	List<OP> listOP = new ArrayList<OP>();
	IAssemblyFile assemblyFile;
	IOperation[] operation;
	IScenario[] iscenarios;
	DependenciesFactory dependencies = DependenciesFactory.eINSTANCE;
	IPhysicalComponentData physCompData;
	List<Fachada> listFachadas = new ArrayList<Fachada>();
	IAssemblyProject assemblyProject;
	String scenaryName;
	CreateEntities createEntities = new CreateEntities();
	UtilsDependencies utilsDependencies = new UtilsDependencies();
	Cache cache;
	

	
	public Object getComponents(IComponent component, String paquete, String modulo, String componentName) {
		Object finalCom =null;

		if (component instanceof ISQLComponent){
			ISQLComponent sqlComponent = (ISQLComponent) component;
			ISQLComponentData sqlComponentData = sqlComponent.getSQLComponentData();
			physCompData = (IPhysicalComponentData) sqlComponentData;
			ComponentSQL componentSQL = createSQLComponentData(sqlComponent,sqlComponentData,paquete,modulo);
			if (componentSQL != null){
				if (physCompData != null){
					if(!physCompData.getCacheType().equals("")){
						Cache cache = createEntities.createCache(dependencies, paquete,component,physCompData,componentSQL);
						getCache(componentSQL, cache);
					}
				}
			}
			finalCom = componentSQL;
		}else if (component instanceof IJavaComponent){
			IComponentData cJavaComponent = ((IJavaComponent) component).getComponentData();
			physCompData = (IPhysicalComponentData) cJavaComponent;

			Java javacomponent = dependencies.createJava();
			javacomponent.setPackage(paquete);
			javacomponent.setComponentName(componentName);

			if (javacomponent != null){	
				//create javacomponent
				if (physCompData != null){
					if(!physCompData.getCacheType().equals("")){
						Cache cache = createEntities.createCache(dependencies, paquete,component,physCompData,javacomponent);
						getCache(javacomponent, cache);
					}
				}
			}
			finalCom = javacomponent;
		}else if (component instanceof IAppAdapterComponent){
			IComponentData cComponentData = ((IAppAdapterComponent) component).getComponentData();
			physCompData = (IPhysicalComponentData) cComponentData;
			AppAdapter appAdaptercomponent = dependencies.createAppAdapter(); 
			appAdaptercomponent.setPackage(paquete);
			appAdaptercomponent.setComponentName(componentName);

			if (appAdaptercomponent != null){	
				//create appAdapter
				if (physCompData != null){
					if(!physCompData.getCacheType().equals("")){
						Cache cache = createEntities.createCache(dependencies, paquete,component,physCompData,appAdaptercomponent);
						getCache(appAdaptercomponent, cache);
					}
				}
			}
			finalCom = appAdaptercomponent;
		}
		return finalCom;
	} // fin ppal



	private void getCache(Object component, Cache cache) {
		if(component instanceof ComponentSQL){
			((ComponentSQL)component).setECache(cache);
		}else if (component instanceof Java){
			((Java)component).setECache(cache);
		}else if (component instanceof AppAdapter){
			((AppAdapter)component).setECache(cache);
		}
	}
	
	
	public ComponentSQL createSQLComponentData(ISQLComponent component, ISQLComponentData iSQLComponent, String paquete, String modulo){
		List<SQLSentence> listSqlSentences = new ArrayList<SQLSentence>();
		ISQLComponentData sqlComponentData = component.getSQLComponentData();
		IParameterType[] cParametersContainers = sqlComponentData.getParameterTypeContainer().getParameterTypes();
		ComponentSQL sqlComponent = null;
		if(cParametersContainers!=null){
			sqlComponent = dependencies.createComponentSQL();
		}
		for ( IParameterType paramType : cParametersContainers) {
			if (paramType.getElementId().equals("dataSource")){
				sqlComponent.setDatasource(paramType.getDefaultValue().toString());
			}else if (paramType.getElementId().equals("aliasDataSource")){
				sqlComponent.setDataSourceAlias(paramType.getDefaultValue().toString());
			}else if (paramType.getElementId().equals("implementationType")){
				sqlComponent.setImplementationType(paramType.getDefaultValue().toString());
			}else if (paramType.getElementId().equals("MAX_ROWS")){
				sqlComponent.setMaxRows(paramType.getDefaultValue().toString());
			}else if (paramType.getElementId().equals("PAGE_MAX_SIZE")){
				sqlComponent.setPageMaxSize(paramType.getDefaultValue().toString());
			}
		}
		if(sqlComponent!=null){
			sqlComponent.setModule(modulo);
			sqlComponent.setComponent(paquete.concat(".").concat(component.getElementId()));
		} 


		if (sqlComponent!=null)
		{
			IComponentField[] componentFields = component.getSQLComponentData().getComponentFieldContainer().getComponentFields();
			for (IComponentField iComponentField : componentFields) {
				SQLSentence sqlSentence = dependencies.createSQLSentence();
				ISQLSentenceField sql = ((ISQLSentenceField) iComponentField);
				if (sql.getFieldValue("text").toString() != null){
					sqlSentence.setSql(sql.getText().toString());
				}
				if (sql.getFieldValue("name").toString() != null){
					sqlSentence.setName(sql.getName());
				}
				if (sql.getFieldValue("type").toString() != null){
					sqlSentence.setType(String.valueOf(sql.getType()));
				}
				listSqlSentences.add(sqlSentence);
			}
		}
		sqlComponent.getESQLSentence().addAll(listSqlSentences);
		return sqlComponent;
	}


	
	/** 
	 * Método para crear la entidad ComponentSQL a partir de la collección ParameterTypeContainer
	 * @param modulo 
	 * @param paquete 
	 * @param modulo 
	 * @param paquete 
	 * @param component 
	 * @param cache 
	 * @param sqls - Colección de elementos Vega 
	 * @return 
	 */

	public ComponentSQL getParameterType(ComponentSQL sql, IVegaElement[] parametersContainers, String paquete, String modulo, IComponent component) {
		for (IVegaElement cparametersContainer : parametersContainers) {
			if (cparametersContainer instanceof IParameterType){
				IParameterType parameter = ((IParameterType) cparametersContainer);
				if (parameter.getElementId().equals("dataSource")){
					sql.setDatasource(parameter.getDefaultValue().toString());
				}else if (parameter.getElementId().equals("aliasDataSource")){
					sql.setDataSourceAlias(parameter.getDefaultValue().toString());
				}else if (parameter.getElementId().equals("implementationType")){
					sql.setImplementationType(parameter.getDefaultValue().toString());
				}else if (parameter.getElementId().equals("MAX_ROWS")){
					sql.setMaxRows(parameter.getDefaultValue().toString());
				}else if (parameter.getElementId().equals("PAGE_MAX_SIZE")){
					sql.setPageMaxSize(parameter.getDefaultValue().toString());
				}
			}
		}
		sql.setModule(modulo);
		sql.setComponent(paquete.concat(".").concat(component.getElementId()));
		return sql;

	}
}
