package com.isb.vega.externalization.generator.xml

import dependencies.Ensamblado


class AssemblyXML {
		
	def static doGenerateAssembly(Ensamblado ensamblado) 
		
    '''
	<assembly defaultBankChannel="«»" name="«ensamblado.name»"> 
		«IF ensamblado.ELogLevel!=null»
		«AssemblyUtils.doGenerateLogLevel(ensamblado.ELogLevel)»
		«ENDIF»
		«IF (ensamblado.EEnsamblado!=null)»
		<assemblySecurity>
			«IF ensamblado.EEnsamblado.autentication!=null»
			<authenticationEnabled>«ensamblado.EEnsamblado.autentication.toString»</assemblySecurity>
			«ELSE»
			<authenticationEnabled/>
			«ENDIF»
			«IF ensamblado.EEnsamblado.usuNotes!=null»
			<uploadUsunotes>«ensamblado.EEnsamblado.usuNotes.toString»</uploadUsunotes>
			«ELSE»
			<uploadUsunotes/>
			«ENDIF»
			«IF ensamblado.EEnsamblado.entityAlias!=null»
			<externalEntityAlias>«ensamblado.EEnsamblado.entityAlias.toString»</externalEntityAlias>
			«ELSE»
			<externalEntityAlias/>
			«ENDIF»
			«IF ensamblado.EEnsamblado.codePassword!=null»
			<codedPassword>«ensamblado.EEnsamblado.codePassword.toString»</codedPassword>
			«ELSE»
			<codedPassword/>
			«ENDIF»
			«IF ensamblado.EEnsamblado.multi!=null»
			<aebMultis>«ensamblado.EEnsamblado.multi.toString»</aebMultis>
			«ELSE»
			<aebMultis/>
			«ENDIF»
		</assemblySecurity>
		«ENDIF»
		«IF (ensamblado.EMultiProfile!=null)»
		<aebMultis>
			<mode/>
			«MultisCategories.doGenerateMultiCategories(ensamblado.EMultiProfile)»
		</aebMultis>
		«ELSE»
		<aebMultis/>
		«ENDIF»
		«IF (ensamblado.EJMS!=null)»
		«AssemblyUtils.doGenerateJMS(ensamblado.EJMS)»
		«ELSE»
		<jmsTransactionals/>
		«ENDIF»
	</assembly>
	'''

}