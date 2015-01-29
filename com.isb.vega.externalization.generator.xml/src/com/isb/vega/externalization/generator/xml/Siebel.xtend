package com.isb.vega.externalization.generator.xml

class Siebel {

	def static doGenerateSiebel() 
    '''
	<siebel>
		<siebelStates>
			«//FOR
			»
			<siebelState>
				«Utils.doGenerateFieldStatesHead»
				<server>«»</server>
				<object>«»</type>
				<request>«»</request>
			</siebelState>
			«//ENDFOR
			»
		</siebelStates>
	</siebel>
	
	'''	
}