package com.isb.vega.externalization.generator.xml

import dependencies.LogLevel
import org.eclipse.emf.common.util.EList
import dependencies.JMS

class AssemblyUtils {
	
	def static doGenerateLogLevel(EList<LogLevel> loglevels)
	'''
	«IF (loglevels.length==0)»
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
	
	def static doGenerateJMS(JMS jms)
	'''
	<jmsTransactionals>
		<listenerPorts/>
		<jmsModules/>
	</jmsTransactionals>
	'''
}