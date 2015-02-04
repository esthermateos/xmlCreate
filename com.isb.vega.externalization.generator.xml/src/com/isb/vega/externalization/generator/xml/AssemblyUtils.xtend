package com.isb.vega.externalization.generator.xml

import dependencies.LogLevel
import org.eclipse.emf.common.util.EList
import dependencies.JMS
import java.util.ArrayList
import java.util.List

class AssemblyUtils {
	
	def static doGenerateLogLevel(EList<LogLevel> loglevels)
	'''
	«IF (loglevels== null || loglevels.length==0)»
	<assemblyLogLevelsDefinitions/>
	«ELSE»
	<assemblyLogLevelsDefinitions>
		«FOR loglevel : loglevels»
		<category id="«loglevel.id»">
			<propagation priority="«loglevel.propagationPriority»">«loglevel.propagation»</propagation>
			<level priority="«loglevel.levelPriority»">«loglevel.level»</level>
		</category>
		«ENDFOR»
	</assemblyLogLevelsDefinitions>
	«ENDIF»
	'''
	
	def static doGenerateJMS(List<String> listPort, List<String>listModules)
	'''
	<jmsTransactionals>
		«IF listPort!=null && listPort.size!=0»
		<listenerPorts>
			«FOR port : listPort»
				«IF port!=null && !port.equals("")»
				<portName>«port»</portName>
				«ELSE»
				<portName/>
				«ENDIF»
			«ENDFOR»
		</listenerPorts>
		«ELSE»
		</listenerPorts>
		«ENDIF»
		«IF listModules!=null && listModules.size!=0»
		<jmsModules>
			«FOR module : listModules»
				«IF module!=null && !module.equals("")»
				<jmsTransactional>«module»</jmsTransactional>
				«ELSE»
				<jmsTransactional/>
				«ENDIF»
			«ENDFOR»
		</jmsModules>
		«ELSE»
		</jmsModules>
		«ENDIF»
	</jmsTransactionals>		
	'''
}