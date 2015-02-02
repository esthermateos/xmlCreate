package com.isb.vega.externalization.generator.xml

import dependencies.MultiProfile

class MultisCategories {
		
	def static doGenerateMultiCategories(MultiProfile multiProfile) 	
    '''
	<multisCategories>
		«IF multiProfile.catGama!=null»
		<category name="Perfil.Gama">«multiProfile.catGama.toString»</category>
		«ELSE»
		<category name="Perfil.Gama"></category>
		«ENDIF»
		«IF multiProfile.catIdioma!=null»
		<category name="Perfil.Idioma">«multiProfile.catIdioma.toString»</category>
		«ELSE»
		<category name="Perfil.Idioma"></category>
		«ENDIF»
		«IF multiProfile.catCompany!=null»
		<category name="Perfil.Empresa">«multiProfile.catCompany.toString»</category>
		«ELSE»
		<category name="Perfil.Empresa"></category>
		«ENDIF»
		«IF multiProfile.catCanalMarco!=null»
		<category name="Perfil.CanalMarco">«multiProfile.catCanalMarco.toString»</category>
		«ELSE»
		<category name="Perfil.CanalMarco"></category>
		«ENDIF»
		«IF multiProfile.catOrden!=null»
		<category name="Perfil.orden">«multiProfile.catOrden.toString»</category>
		«ELSE»
		<category name="Perfil.orden"></category>
		«ENDIF»
		«IF multiProfile.catEstructura!=null»
		<category name="Perfil.Estructura">«multiProfile.catEstructura.toString»</category>
		«ELSE»
		<category name="Perfil.Estructura"></category>
		«ENDIF»
	</multisCategories>
	'''
}