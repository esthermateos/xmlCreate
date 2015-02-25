package com.isb.vega.externalization.generator.xml

import dependencies.Ensamblado

class WebServiceStates {
	
	def static doGenerateWebServiceStates(Ensamblado ensamblado) 
	'''
	<webServiceStates>
		«var listaOI = GetInternalOperationFacadeModel.getTotalInternalOperations(ensamblado)»
			«IF listaOI!=null && listaOI.length!=0»
				«FOR internalOper : listaOI»
				«var listWS = internalOper.EWebService»
				«IF listWS!=null && listWS.length!=0»
					«FOR ws : listWS»
					<webServiceState>
						«Utils.doGenerateFieldStatesHead(internalOper, ws.state)»
						«IF ws.alias!=null && !ws.alias.toString.equals("")»
						<alias>«ws.alias»</alias>
						«ELSE»
						<alias/>
						«ENDIF»
						«IF ws.transport!=null && !ws.transport.toString.equals("")»
						<transport>«ws.transport»</transport>
						«ELSE»
						<transport/>
						«ENDIF»
						«IF ws.synchrony!=null && !ws.synchrony.toString.equals("")»
						<synchrony>«ws.synchrony»</synchrony>
						«ELSE»
						<synchrony/>
						«ENDIF»
						«IF ws.wsdl!=null && !ws.wsdl.toString.equals("")»
						<wsdl>«ws.wsdl»</wsdl>
						«ELSE»
						<wsdl/>
						«ENDIF»
						«IF ws.wsOp!=null && !ws.wsOp.toString.equals("")»
						<wsOp>«ws.wsOp»</wsOp>
						«ELSE»
						<wsOp/>
						«ENDIF»
						«IF ws.namespace!=null && !ws.namespace.toString.equals("")»
						<namespace>«ws.namespace»</namespace>
						«ELSE»
						<namespace/>
						«ENDIF»
					</webServiceState>
					«ENDFOR»
				«ENDIF»
				«ENDFOR»
			«ELSE»
			<webServiceState/>
			«ENDIF»
	</webServiceStates>
	'''
}