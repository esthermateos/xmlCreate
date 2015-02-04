package com.isb.vega.externalization.generator.xml

import dependencies.MultiProfile

class MultisCategories {
		
	def static doGenerateMultiCategories(MultiProfile multiProfile) 	
    '''
	<multisCategories>
		«IF multiProfile.catGama!=null && !multiProfile.catGama.equals("")»
		<category name="Perfil.Gama">«multiProfile.catGama»</category>
		«ELSE»
		<category name="Perfil.Gama"></category>
		«ENDIF»
		«IF multiProfile.catIdioma!=null && !multiProfile.catIdioma.equals("")»
		<category name="Perfil.Idioma">«multiProfile.catIdioma»</category>
		«ELSE»
		<category name="Perfil.Idioma"></category>
		«ENDIF»
		«IF multiProfile.catCompany!=null && !multiProfile.catCompany.equals("")»
		<category name="Perfil.Empresa">«multiProfile.catCompany»</category>
		«ELSE»
		<category name="Perfil.Empresa"></category>
		«ENDIF»
		«IF multiProfile.catCanalMarco!=null && !multiProfile.catCanalMarco.equals("")»
		<category name="Perfil.CanalMarco">«multiProfile.catCanalMarco»</category>
		«ELSE»
		<category name="Perfil.CanalMarco"></category>
		«ENDIF»
		«IF multiProfile.catOrden!=null && !multiProfile.catOrden.equals("")»
		<category name="Perfil.orden">«multiProfile.catOrden»</category>
		«ELSE»
		<category name="Perfil.orden"></category>
		«ENDIF»
		«IF multiProfile.catEstructura!=null && !multiProfile.catEstructura.equals("")»
		<category name="Perfil.Estructura">«multiProfile.catEstructura»</category>
		«ELSE»
		<category name="Perfil.Estructura"></category>
		«ENDIF»
		«IF multiProfile.catNivelIU!=null && !multiProfile.catNivelIU.equals("")»
		<category name="Perfil.NivelUI">«multiProfile.catNivelIU»</category>
		«ELSE»
		<category name="Perfil.NivelUI"></category>
		«ENDIF»
		«IF multiProfile.catEmpresaAsociada!=null && !multiProfile.catEmpresaAsociada.equals("")»
		<category name="Perfil.EmpresaAsociada">«multiProfile.catEmpresaAsociada»</category>
		«ELSE»
		<category name="Perfil.EmpresaAsociada"></category>
		«ENDIF»
		«IF multiProfile.catRender!=null && !multiProfile.catRender.equals("")»
		<category name="Perfil.Render">«multiProfile.catRender»</category>
		«ELSE»
		<category name="Perfil.Render"></category>
		«ENDIF»
	</multisCategories>
	'''
}