package com.isb.vega.externalization.generator.xml

class Bboo {
	
	def static doGenerateBboo() 
    '''
	<bboo>
		<bbooStates>
			«//FOR
			»
			<bbooState>
			«Utils.doGenerateFieldStatesHead»
			<alias>«»</alias>
			<document>«»</document>
			<provider>«»</provider>
			</bbooState>
			«//ENDFOR
			»
		</bbooStates>
	</bboo>	
	'''
}