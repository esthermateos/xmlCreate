package com.isb.vega.externalization.generator.xml

class Sat {
	
	def static doGenerateSat() 
    '''
	<sat>
		<satProtocol>«»</satProtocol>
		<satAlias>«»</satAlias>
		<satTimeOut>«»</satTimeOut>
		<satNullValues>«»</satNullValues>
		<satNullWhenSpaces>«»</satNullWhenSpaces>
		<satLogicalChannels>
		«//FOR
		»
			<satLogicalChannel name="«»">«»</satLogicalChannel>
		«//ENDFOR
		»
		</satLogicalChannels>
		<satPyshicalChannels>
		«//FOR
		»
			<satPyshicalChannel name="«»">«»</satPyshicalChannel>
		«//ENDFOR
		»
		<satStates>
			«//FOR
			»
			<satState>
				«Utils.doGenerateFieldStatesHead»
				<satName>«»</satName>
				«Utils.doGenerateFieldStatesFoot»
			</satState>
			«//ENDFOR
			»
		</satStates>
	</sat>
	
	'''
}