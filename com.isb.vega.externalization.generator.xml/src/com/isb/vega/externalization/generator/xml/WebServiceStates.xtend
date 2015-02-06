package com.isb.vega.externalization.generator.xml

class WebServiceStates {
	
	def static doGenerateWebServiceStates() 
	'''
	<webServiceStates>
		<webServiceState>
			«Utils.doGenerateFieldStatesHead»
			<alias>«»</alias>
			<transport>«»</transport>
			<synchrony>«»</synchrony>
			<wsdl>«»</wsdl>
			<wsOp>«»</wsOp>
			<namespace>«»</namespace>
		</webServiceState>
	</webServiceStates>
	'''
}