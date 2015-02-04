package com.isb.vega.externalization.generator.xml

import dependencies.Ensamblado
import java.util.List

class AssemblyXML {
		
	def static doGenerateAssembly(Ensamblado ensamblado, List<String> listPort, List<String>listModules) 
		
    '''
	<assembly defaultBankChannel="«»" name="«ensamblado.name»"> 
		«IF ensamblado.ELogLevel!=null»
		«AssemblyUtils.doGenerateLogLevel(ensamblado.ELogLevel)»
		«ENDIF»
		«IF (ensamblado.EEnsamblado!=null)»
		<assemblySecurity>
			«IF ensamblado.EEnsamblado.autentication!=null && !ensamblado.EEnsamblado.autentication.equals("")»
			<authenticationEnabled>«ensamblado.EEnsamblado.autentication.toString»</assemblySecurity>
			«ELSE»
			<authenticationEnabled/>
			«ENDIF»
			«IF ensamblado.EEnsamblado.usuNotes!=null && !ensamblado.EEnsamblado.usuNotes.equals("")»
			<uploadUsunotes>«ensamblado.EEnsamblado.usuNotes.toString»</uploadUsunotes>
			«ELSE»
			<uploadUsunotes/>
			«ENDIF»
			«IF ensamblado.EEnsamblado.entityAlias!=null && !ensamblado.EEnsamblado.entityAlias.equals("")»
			<externalEntityAlias>«ensamblado.EEnsamblado.entityAlias.toString»</externalEntityAlias>
			«ELSE»
			<externalEntityAlias/>
			«ENDIF»
			«IF ensamblado.EEnsamblado.codePassword!=null && !ensamblado.EEnsamblado.codePassword.equals("")»
			<codedPassword>«ensamblado.EEnsamblado.codePassword.toString»</codedPassword>
			«ELSE»
			<codedPassword/>
			«ENDIF»
			«IF ensamblado.EEnsamblado.multi!=null && !ensamblado.EEnsamblado.multi.equals("")»
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
		«AssemblyUtils.doGenerateJMS(listPort, listModules)»
		«ELSE»
		<jmsTransactionals/>
		«ENDIF»
	</assembly>
	'''

}