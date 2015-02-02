package com.isb.vega.externalization.generator.xml

import dependencies.Ensamblado

class Connectors {
	
	def static doGenerateTrxOP(Ensamblado ensamblado) 	
    '''
    «var host =  ensamblado.EHOST»
	«IF host!=null»
		«IF host.trxprotocol!=null || host.trxOPDefaultMode!=null || host.redProtocol!=null || host.trxOPTCPAlias!=null || host.EOPLogicalChannel!=null || host.EPhysicalChannel!=null »
		<trxOP>
			«IF host.trxprotocol!=null»
			<trxOpProtocol>«host.trxprotocol.toString»</trxOpProtocol>
			«ELSE»
			<trxOpProtocol/>
			«ENDIF»
			«IF host.trxOPDefaultMode!=null»
			<trxOpDefaultMode>«host.trxOPDefaultMode.toString»</trxOpDefaultMode>
			«ELSE»
			<trxOpDefaultMode/>
			«ENDIF»
			«IF host.redProtocol!=null»
			<trxOpRedGProtocol>«host.redProtocol.toString»</trxOpRedGProtocol>
			«ELSE»
			<trxOpRedGProtocol/>
			«ENDIF»
			«IF host.trxOPTCPAlias!=null»
			<trxOpTCPAlias>«host.trxOPTCPAlias.toString»</trxOpTCPAlias>
			«ELSE»
			<trxOpTCPAlias/>
			«ENDIF»
			<trxOpLogicalChannels>
			«var logicalChannels = host.EOPLogicalChannel»
			«IF logicalChannels!=null»
				«FOR logicalChannel : logicalChannels»
					<trxOpLogicalChannel name="«logicalChannel.name»">«logicalChannel.value»</trxOpLogicalChannel>
				«ENDFOR»
			«ENDIF»
			</trxOpLogicalChannels>
			<trxOpPyshicalChannels>
			«var PyshicalChannels = host.EOPLogicalChannel»
			«IF PyshicalChannels!=null»
				«FOR PyshicalChannel : PyshicalChannels»
					<trxOpPyshicalChannel name="«PyshicalChannel.name»">«PyshicalChannel.value»</trxOpPyshicalChannel>
				«ENDFOR»
			«ENDIF»			
			</trxOpPyshicalChannels>
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
		«ELSE»
		<trxOP>
			<trxOpProtocol/>
			<trxOpDefaultMode/>
			<trxOpRedGProtocol/>
			<trxOpTCPAlias/>
			<trxOpLogicalChannels/>
			<trxOpPyshicalChannels/>
			<trxOpStates/>
		</trxOp>
		«ENDIF»
	«ELSE»
		<trxOP>
			<trxOpProtocol/>
			<trxOpDefaultMode/>
			<trxOpRedGProtocol/>
			<trxOpTCPAlias/>
			<trxOpLogicalChannels/>
			<trxOpPyshicalChannels/>
			<trxOpStates/>
		</trxOp>
	«ENDIF»
	'''
	
	def static doGenerateSat(Ensamblado ensamblado) 
    '''
    «var host =  ensamblado.EHOST»
	«IF host!=null»
		«IF host.satProtocol!=null || host.satAlias!=null || host.satTimeOut!=null || host.satNullValues!=null || host.satNullWhenSpaces!=null
		|| host.ESATLogicalChannel!=null || host.ESATPhysicalChannel!=null »
		<sat>
			«IF host.satProtocol!=null»
			<satProtocol>«host.satProtocol»</satProtocol>
			«ELSE»
			<satProtocol/>
			«ENDIF»
			«IF host.satAlias!=null»
			<satAlias>«host.satAlias»</satAlias>
			«ELSE»
			<satAlias/>
			«ENDIF»
			«IF host.satTimeOut!=null»
			<satTimeOut>«host.satTimeOut»</satTimeOut>
			«ELSE»
			<satTimeOut/>
			«ENDIF»
			«IF host.satNullValues!=null»
			<satNullValues>«host.satNullValues»</satNullValues>
			«ELSE»
			<satNullValues/>
			«ENDIF»
			«IF host.satNullWhenSpaces!=null»
			<satNullWhenSpaces>«host.satNullWhenSpaces»</satNullWhenSpaces>
			«ELSE»
			<satNullWhenSpaces/>
			«ENDIF»
			<satLogicalChannels>
			«var logicalChannels = host.ESATLogicalChannel»
			«IF logicalChannels!=null»
				«FOR logicalChannel : logicalChannels»
					<satLogicalChannel name="«logicalChannel.name»">«logicalChannel.value»</satLogicalChannel>
				«ENDFOR»
			«ENDIF»
			</satLogicalChannels>
			<satPyshicalChannels>
			«var PyshicalChannels = host.ESATLogicalChannel»
			«IF PyshicalChannels!=null»
				«FOR PyshicalChannel : PyshicalChannels»
					<satPyshicalChannel name="«PyshicalChannel.name»">«PyshicalChannel.value»</satPyshicalChannel>
				«ENDFOR»
			«ENDIF»
			</satPyshicalChannels>
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
		«ELSE»
			<sat>
			<satProtocol/>
			<satAlias/>
			<satTimeOut/>
			<satNullValues/>
			<satNullWhenSpaces/>
			<satLogicalChannels/>
			<satPyshicalChannels/>
			<satStates/>
		</sat>
		«ENDIF»
	«ELSE»
	<sat>
		<satProtocol/>
		<satAlias/>
		<satTimeOut/>
		<satNullValues/>
		<satNullWhenSpaces/>
		<satLogicalChannels/>
		<satPyshicalChannels/>
		<satStates/>
	</sat>
	«ENDIF»
	'''
	
	def static doGenerateAltair(Ensamblado ensamblado) 
    '''
    «var host =  ensamblado.EHOST»
	«IF host!=null»
		«IF host.altairAlias!=null || host.altairProtocol!=null»
		<altair>
			«IF host.altairProtocol!=null»
			<altairProtocol>«host.altairProtocol»</altairProtocol>
			«ELSE»
			<altairProtocol/>
			«ENDIF»
			«IF host.altairAlias!=null»
			<altairAlias>«host.altairAlias»</altairAlias>
			«ELSE»
			<altairAlias/>
			«ENDIF»
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
		«ELSE»
		<altair>
			<altairProtocol/>
			<altairAlias/>
			<altairStates/>
		</altair>
		«ENDIF»
	«ELSE»
	<altair>
		<altairProtocol/>
		<altairAlias/>
		<altairStates/>
	</altair>
	«ENDIF»
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