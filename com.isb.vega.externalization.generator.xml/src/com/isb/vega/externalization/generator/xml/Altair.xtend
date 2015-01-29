package com.isb.vega.externalization.generator.xml

class Altair {
	
def static doGenerateAltair() 
    '''
	<altair>
		<altairProtocol>«»</altairProtocol>
		<altairAlias>«»</altairAlias>
		<altairStates>
			«//FOR
			»
			<altairState>
				«Utils.doGenerateFieldStatesHead»
				<transaction>«»</transaction>
				«Utils.doGenerateFieldStatesFoot»
			</altairState>
			
			«//ENDFOR
			»
		</altairStates>
	</altair>
	'''

}