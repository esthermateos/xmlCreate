package com.isb.vega.externalization.generator.xml

import dependencies.MultiProfile

class MultisCategories {
		
	def static doGenerateMultiCategories(MultiProfile multiProfile) 	
    '''
	<multisCategories>
		«IF multiProfile.catGama!=null && !multiProfile.catGama.toString.equals("")»
		<category name="Perfil.Gama">«multiProfile.catGama»</category>
		«ENDIF»
		«IF multiProfile.catIdioma!=null && !multiProfile.catIdioma.toString.equals("")»
		<category name="Perfil.Idioma">«multiProfile.catIdioma»</category>
		«ENDIF»
		«IF multiProfile.catCompany!=null && !multiProfile.catCompany.toString.equals("")»
		<category name="Perfil.Empresa">«multiProfile.catCompany»</category>
		«ENDIF»
		«IF multiProfile.catCanalMarco!=null && !multiProfile.catCanalMarco.toString.equals("")»
		<category name="Perfil.CanalMarco">«multiProfile.catCanalMarco»</category>
		«ENDIF»
		«IF multiProfile.catOrden!=null && !multiProfile.catOrden.toString.equals("")»
		<category name="Perfil.orden">«multiProfile.catOrden»</category>
		«ENDIF»
		«IF multiProfile.catEstructura!=null && !multiProfile.catEstructura.toString.equals("")»
		<category name="Perfil.Estructura">«multiProfile.catEstructura»</category>
		«ENDIF»
		«IF multiProfile.catNivelIU!=null && !multiProfile.catNivelIU.toString.equals("")»
		<category name="Perfil.NivelUI">«multiProfile.catNivelIU»</category>
		«ENDIF»
		«IF multiProfile.catEmpresaAsociada!=null && !multiProfile.catEmpresaAsociada.toString.equals("")»
		<category name="Perfil.EmpresaAsociada">«multiProfile.catEmpresaAsociada»</category>
		«ENDIF»
		«IF multiProfile.catRender!=null && !multiProfile.catRender.toString.equals("")»
		<category name="Perfil.Render">«multiProfile.catRender»</category>
		«ENDIF»
	</multisCategories>
	'''
}