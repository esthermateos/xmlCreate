package com.isb.vega.generator.xml.configuration;

import org.w3c.dom.*;

import com.isb.vega.internal.model.component.externalization.ComponentMethodSignature;
import com.isb.vega.internal.model.component.externalization.XmlGenerator;
import com.isb.vega.model.component.*;
import com.isb.vega.model.core.IVegaProject;
import com.isb.vega.model.descriptors.xml.generator.*;
import com.isb.vega.model.loglevels.*;
import com.isb.vega.model.vegabeans.IVegaBeanPackage;


public class EntitiesLogLevelsXmlGenerator extends XmlGenerator implements IEntitiesLogLevelsXmlGenerator
{
	public static class EntityAndLogLevels
	{
		private ILoggeable _entity;
		private ILogLevelsContainer _logLevelsContainer;
		private String _parentName;
		private String _priority;
		private String _propagationPriority ;
		private boolean _propagateLog;
		
		/**
		 * Construye una nueva instancia de la clase. <p> Por defecto, la prioridad que se aplica a la propagación 
		 * es la misma que a la entidad loggeable.
		 * @param entity
		 * @param logLevelsCont
		 * @param parentName
		 * @param priority
		 */
		public  EntityAndLogLevels(ILoggeable entity, ILogLevelsContainer logLevelsCont, String parentName, String priority) 
		{
			_entity = entity;
			_logLevelsContainer = logLevelsCont;
			_parentName = parentName;
			_priority = priority;
			_propagationPriority = priority;

			// Bugzilla 25658: La propagación de niveles de log en IFs debe propagarse
			_propagateLog = entity.getPropagateLog();	
		}

		public ILoggeable getEntity() 
		{
			return _entity;
		}

		public ILogLevelsContainer getLogLevelsContainer() 
		{
			return _logLevelsContainer;
		}

		public String getParentName() 
		{
			return _parentName;
		}
		
		public String getPriority()
		{
			return _priority;
		}
		
		public void setPriority (String value)
		{
			_priority = value ;
		}
		
		public boolean getPropagateLog ()
		{
			return _propagateLog;
		}
		
		public String getPropagationPriority ()
		{
			return _propagationPriority ;
		}
		
		public void setPropagationPriority (String value)
		{
			_propagationPriority = value ;
		}

		public boolean isPropagateLog()
		{
			return _propagateLog;
		}

		public void setPropagateLog(boolean propagateLog)
		{
			_propagateLog = propagateLog;
		}
	}
	
	/**
	 * @param entityCategory
	 * @param document
	 * @param logLevels
	 */
	protected void externalizeLogLevels(Element entityCategory,
			Document document, ILogLevel[] logLevels, String priority)
		{
			for (int i = 0; i < logLevels.length; i++)
			{
				ILogLevel logLevel = logLevels[i];
				Element logLevelElement = (Element) entityCategory.appendChild(document.createElement(TAG_LEVEL));
				logLevelElement.setAttribute(ATR_CATEGORY_PRIORITY, priority);

				logLevelElement.appendChild(document.createTextNode(logLevel.getName()));
			}
		}

	
	/**
	 * Crea el nodo de categoría con los atributos id, priority y propagateLog para
	 * la entidad logeable recibida en entityAndLogLevels
	 * Llama a externalizeLogLevels para añadir los nodos hijos con los niveles de log
	 * 
	 * @param document
	 * @param id
	 * @param logLevelsDefinitions
	 * @param logLevelsCont
	 * @param entityAndLogLevels
	 */
	protected void createExternalizeLogLevels(Document document, String id,
		Element logLevelsDefinitions, ILogLevelsContainer logLevelsCont, EntityAndLogLevels entityAndLogLevels)
	{
		Element entityCategory = (Element) logLevelsDefinitions.appendChild(document.createElement(TAG_CATEGORY));
		entityCategory.setAttribute(ATR_CATEGORY_ID, id);
		
		// Externaliza la propagación	
		Element propagateElement = (Element) entityCategory.appendChild(document.createElement(TAG_PROPAGATE_LOG));
		propagateElement.setAttribute(ATR_CATEGORY_PRIORITY, entityAndLogLevels.getPropagationPriority());
		propagateElement.appendChild(document.createTextNode(new Boolean (entityAndLogLevels.getPropagateLog()).toString()));
		
		externalizeLogLevels(entityCategory, document, logLevelsCont.getLogLevels(), entityAndLogLevels.getPriority());
	}

	/**
	 * Devuelve la signatura de un método con tipos java en sus parámetros
	 */
	protected String getMethodSignature(ILoggeable logEntity)
	{
		String methodSig = ""; //$NON-NLS-1$
		IVegaProject[] projects = logEntity.getVegaProject().getVegaProjectsOnXmlPath();

		if (logEntity.getType() == ILoggeable.METHOD_TYPE)
			methodSig = new ComponentMethodSignature((IImplLogMethod) logEntity).toStringWithJavaTypes(projects);
		
		return methodSig.replace(CATEGORY_SEPARATOR, NAME_SEPARATOR);
	}

	/**
	 * Devuelve el nombre del componente formateado segun las categorias de log
	 * que espera runtime.
	 */
	protected String getFormatedComponentName(ILoggeable compEntity, boolean underScoreSeparator)
	{
		if (compEntity.getType() == ILoggeable.COMPONENT_TYPE ||
			compEntity.getType() == ILoggeable.FACADE_INTERFACE_TYPE)
		{
			// si es un componente original ya tenemos todo
			IBaseComponent comp = (IBaseComponent) ((IBaseComponentData) compEntity).getParent();
			String compName = comp.getElementId();
			String pkName = comp.getParentVegaBeanPackage().getElementId();
		
			if (underScoreSeparator)
				return pkName.replace(CATEGORY_SEPARATOR, NAME_SEPARATOR) + 
					   NAME_SEPARATOR + 
					   compName.replace(CATEGORY_SEPARATOR, NAME_SEPARATOR);
			else
				return pkName.replace(CATEGORY_SEPARATOR, NAME_SEPARATOR) + 
					   ELEMENT_SEPARATOR + 
					   compName.replace(CATEGORY_SEPARATOR, NAME_SEPARATOR);
		}
		
		return ""; //$NON-NLS-1$
	}

	/**
	 * Devuelve el identificador para cada uno de los tipos de operaciones q
	 * espera runtime
	 */
	protected String getOperationID(ILoggeable operEntity)
	{
		String operationID = ""; //$NON-NLS-1$
		switch (operEntity.getType())
		{
			case ILoggeable.INTERNAL_OPERATION_TYPE:
				operationID = OI_OPERATION_CATEGORY;
				break;
			case ILoggeable.PRESENTATION_OPERATION_TYPE:
				operationID = OP_OPERATION_CATEGORY;
				break;
			default:
				break;
		}

		return operationID;
	}

	/**
	 * Returns the name of the loggeable entity in the assembly
	 * @param loggeable
	 * @return String
	 */
	protected String generateNamesForLoggeableElements(ILoggeable loggeable)
	{
		String name = ""; //$NON-NLS-1$
		switch (loggeable.getType()) 
		{
			case ILoggeable.COMPONENT_TYPE:
			case ILoggeable.FACADE_INTERFACE_TYPE:
				name = getComponentName((IComponentData)loggeable);			
				break;
			case ILoggeable.METHOD_TYPE:
				name = new ComponentMethodSignature((IMethod)loggeable).toString();
				break;
			case ILoggeable.ASSEMBLY_TYPE:
				name = loggeable.getElementId();
				break;
			default:
				break;
		}
		
		return name;	
	}
	
	/*
	 * Devuelve el nombre de una entidad de tipo componente que se crea en el ensamblado
	 */
	private String getComponentName(IComponentData componentData)
	{
	    return ((IComponent)componentData.getParent()).getParentVegaBeanPackage().getElementId() + 
			   IVegaBeanPackage.QUALIFIED_NAME_SEPARATOR + 
			   componentData.getElementId();
	}
}
