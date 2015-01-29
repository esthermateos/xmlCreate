package com.isb.vega.externalization.generator.xml

class Tp {
		
	def static doGenerateTp() 
    '''
	<tp>
		<tpStates>
			«//FOR
			»
			<tpState>
				«Utils.doGenerateFieldStatesHead»
				<code>«»</code>
				<type>«»</type>
				<subtype>«»</subtype>
			</tpState>
			«//ENDFOR
			»
		</tpStates>
	</tp>	
	'''
}