package com.isb.vega.externalization.generator.xml

class AssemblyXML {
		
	def static doGenerateAssembly() 
    '''
	<assembly defaultBankChannel="«»" name="«»"> 
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