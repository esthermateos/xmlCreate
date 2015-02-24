package com.isb.vega.externalization.generator.xml

import dependencies.Ensamblado

class Connectors {
	
	def static doGenerateTrxOP(Ensamblado ensamblado) 	
    '''
    «var host =  ensamblado.EHOST»
	«IF host!=null»
		«IF host.trxprotocol!=null || host.trxOPDefaultMode!=null || host.redProtocol!=null || host.trxOPTCPAlias!=null || host.EOPLogicalChannel!=null || host.EPhysicalChannel!=null »
		<trxOp>
			«IF host.trxprotocol!=null && !host.trxprotocol.toString.equals("")»
			<trxOpProtocol>«host.trxprotocol.toString»</trxOpProtocol>
			«ELSE»
			<trxOpProtocol/>
			«ENDIF»
			«IF host.trxOPDefaultMode!=null && !host.trxOPDefaultMode.toString.equals("")»
			<trxOpDefaultMode>«host.trxOPDefaultMode.toString»</trxOpDefaultMode>
			«ELSE»
			<trxOpDefaultMode/>
			«ENDIF»
			«IF host.redProtocol!=null && !host.redProtocol.toString.equals("")»
			<trxOpRedGProtocol>«host.redProtocol.toString»</trxOpRedGProtocol>
			«ELSE»
			<trxOpRedGProtocol/>
			«ENDIF»
			«IF host.trxOPTCPAlias!=null && !host.trxOPTCPAlias.toString.equals("")»
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
				«var PyshicalChannels = host.EPhysicalChannel»
				«IF PyshicalChannels!=null»
					«FOR PyshicalChannel : PyshicalChannels»
						<trxOpPyshicalChannel name="«PyshicalChannel.name»">«PyshicalChannel.value»</trxOpPyshicalChannel>
					«ENDFOR»
				«ENDIF»			
			</trxOpPyshicalChannels>
			<trxOpStates>
				<trxOpState>
					«Utils.doGenerateFieldStatesHead»
					<transaction>«»</transaction>
					<operation>«»</operation>
					<version>«»</version>
					<alias>«»</alias>
					<protocol>«»</protocol>
					<transactionMode>«»</transactionMode>
				</trxOpState>
			</trxOpStates>
		</trxOp>
		«ELSE»
		<trxOp>
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
		<trxOp>
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
			«IF host.satProtocol!=null && !host.satProtocol.toString.equals("")»
			<satProtocol>«host.satProtocol»</satProtocol>
			«ELSE»
			<satProtocol/>
			«ENDIF»
			«IF host.satAlias!=null && !host.satAlias.toString.equals("")»
			<satAlias>«host.satAlias»</satAlias>
			«ELSE»
			<satAlias/>
			«ENDIF»
			«IF host.satTimeOut!=null && !host.satTimeOut.toString.equals("")»
			<satTimeOut>«host.satTimeOut»</satTimeOut>
			«ELSE»
			<satTimeOut/>
			«ENDIF»
			«IF host.satNullValues!=null && !host.satNullValues.toString.equals("")»
			<satNullValues>«host.satNullValues»</satNullValues>
			«ELSE»
			<satNullValues/>
			«ENDIF»
			«IF host.satNullWhenSpaces!=null && !host.satNullWhenSpaces.toString.equals("")»
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
				«var PyshicalChannels = host.ESATPhysicalChannel»
				«IF PyshicalChannels!=null»
					«FOR PyshicalChannel : PyshicalChannels»
						<satPyshicalChannel name="«PyshicalChannel.name»">«PyshicalChannel.value»</satPyshicalChannel>
					«ENDFOR»
				«ENDIF»
			</satPyshicalChannels>
			<satStates>
				<satState>
					«Utils.doGenerateFieldStatesHead»
					<satName>«»</satName>
					«Utils.doGenerateFieldStatesFoot»
				</satState>
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
			«IF host.altairProtocol!=null && !host.altairProtocol.equals("")»
			<altairProtocol>«host.altairProtocol»</altairProtocol>
			«ELSE»
			<altairProtocol/>
			«ENDIF»
			«IF host.altairAlias!=null && !host.altairAlias.equals("")»
			<altairAlias>«host.altairAlias»</altairAlias>
			«ELSE»
			<altairAlias/>
			«ENDIF»
			<altairStates>
				<altairState>
					«Utils.doGenerateFieldStatesHead»
					<transaction>«»</transaction>
					«Utils.doGenerateFieldStatesFoot»
				</altairState>				
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
			<bbooState>
			«Utils.doGenerateFieldStatesHead»
			<alias>«»</alias>
			<document>«»</document>
			<provider>«»</provider>
			</bbooState>
		</bbooStates>
	</bboo>	
	'''
	
	def static doGenerateSiebel() 
    '''
	<siebel>
		<siebelStates>
			<siebelState>
				«Utils.doGenerateFieldStatesHead»
				<server>«»</server>
				<object>«»</object>
				<request>«»</request>
			</siebelState>
		</siebelStates>
	</siebel>	
	'''	
	
	def static doGenerateTp() 
    '''
	<tp>
		<tpStates>
			<tpState>
				«Utils.doGenerateFieldStatesHead»
				<code>«»</code>
				<type>«»</type>
				<subtype>«»</subtype>
			</tpState>
		</tpStates>
	</tp>	
	'''
}