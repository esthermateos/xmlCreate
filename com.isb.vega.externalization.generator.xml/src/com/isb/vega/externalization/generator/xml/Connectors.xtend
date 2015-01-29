package com.isb.vega.externalization.generator.xml

class Connectors {
	
	def static doGenerateTrxOP() 
    '''
	<trxOp>
		<trxOpProtocol>«»</trxOpProtocol>
		<trxOpDefaultMode>«»</trxOpDefaultMode>
		<trxOpRedGProtocol>«»</trxOpRedGProtocol>
		<trxOpTCPAlias>«»</trxOpTCPAlias>
		<trxOpLogicalChannels>
		«//FOR
		»
			<trxOpLogicalChannel name="«»">«»</trxOpLogicalChannel>
		«//ENDFOR
		»
		</trxOpLogicalChannels>
		<trxOpPyshicalChannels>
		«//FOR
		»
			<trxOpPyshicalChannel name="«»">«»</trxOpPyshicalChannel>
		«//ENDFOR
		»
		<trxOpStates>
			«//FOR
			»
			<trxOpState>
				«Utils.doGenerateFieldStatesHead»
				<transaction>«»</transaction>
				<operation>«»</operation>
				<version>«»</version>
				<alias>«»</alias>
				<protocol>«»</protocol>
				<transactionMode>«»</transactionMode>
			</trxOpState>
			«//ENDFOR
			»
		</trxOpStates>
	</trxOp>	
	'''
	
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