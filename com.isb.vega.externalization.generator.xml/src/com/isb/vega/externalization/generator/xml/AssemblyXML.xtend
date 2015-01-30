package com.isb.vega.externalization.generator.xml

import dependencies.Ensamblado

class AssemblyXML {
		
	def static doGenerateAssembly( Ensamblado ensamblado) 
    '''
	<assembly defaultBankChannel="«»" name="«ensamblado.name»"> 
		«LogLevelDefinitions.doGenerateLogLevel»
		<assemblySecurity>
			<authenticationEnabled>«»</assemblySecurity>
			<uploadUsunotes>«»</uploadUsunotes>
			<externalEntityAlias>«»</externalEntityAlias>
			<codedPassword>«»</codedPassword>
			<aebMultis>«»</aebMultis>
		</assemblySecurity>
		<aebMultis>
			<mode/>
			«MultisCategories.doGenerateMultiCategories»
		</aebMultis>
		<jmsTransactionals>
			<listenerPorts/>
			<jmsModules/>
		</jmsTransactionals>
	</assembly>
	'''

}