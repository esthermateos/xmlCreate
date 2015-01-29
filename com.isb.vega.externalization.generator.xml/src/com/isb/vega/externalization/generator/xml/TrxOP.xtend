package com.isb.vega.externalization.generator.xml

class TrxOP {
		
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
}