package com.isb.vega.externalization.generator.xml

import dependencies.Ensamblado

class Connectors {
	
	def static doGenerateTrxOP(Ensamblado ensamblado) 	
    '''
    «var ops = ensamblado.EOP»
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
				«var pyshicalChannels = host.EPhysicalChannel»
				«IF pyshicalChannels!=null»
					«FOR pyshicalChannel : pyshicalChannels»
						<trxOpPyshicalChannel name="«pyshicalChannel.name»">«pyshicalChannel.value»</trxOpPyshicalChannel>
					«ENDFOR»
				«ENDIF»			
			</trxOpPyshicalChannels>
			<trxOpStates>
				«var listaOI = GetInternalOperationFacadeModel.getTotalInternalOperations(ensamblado)»
				«IF listaOI!=null && listaOI.length!=0»
				«FOR internalOper : listaOI»
				«var listTrx = internalOper.ETrxOP»
				«IF listTrx!=null && listTrx.length!=0»
					«FOR trxop : listTrx»
					<trxOpState>
						«Utils.doGenerateFieldStatesHead(internalOper, trxop.state)»
						«IF trxop.transaction!=null && !trxop.transaction.toString.equals("")»
						<transaction>«trxop.transaction»</transaction>
						«ELSE»
						<transaction/>
						«ENDIF»
						«IF trxop.operation!=null && !trxop.version.toString.equals("")»
						<operation>«trxop.operation»</operation>
						«ELSE»
						<operation/>
						«ENDIF»
						«IF trxop.version!=null && !trxop.version.toString.equals("")»
						<version>«trxop.version»</version>
						«ELSE»
						<version/>
						«ENDIF»
						«IF trxop.alias!=null && !trxop.alias.toString.equals("")»
						<alias>«trxop.alias»</alias>
						«ELSE»
						<alias/>
						«ENDIF»
						«IF trxop.protocol!=null && !trxop.protocol.toString.equals("")»
						<protocol>«trxop.protocol»</protocol>
						«ELSE»
						<protocol/>
						«ENDIF»
						«IF trxop.transactionMode!=null && !trxop.transactionMode.toString.equals("")»
						<transactionMode>«trxop.transactionMode»</transactionMode>
						«ELSE»
						<transactionMode/>
						«ENDIF»
					</trxOpState>
					«ENDFOR»
				«ENDIF»
				«ENDFOR»
				«ELSE»
				<trxOpState/>
				«ENDIF»
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
			«var listaOI = GetInternalOperationFacadeModel.getTotalInternalOperations(ensamblado)»
				«IF listaOI!=null && listaOI.length!=0»
				«FOR internalOper : listaOI»
				«var listSat = internalOper.ESAT»
				«IF listSat!=null && listSat.length!=0»
					«FOR sat : listSat»
					<satState>
						«Utils.doGenerateFieldStatesHead(internalOper, sat.state)»
						«IF sat.satName!=null && !sat.satName.toString.equals("")»
						<satName>«sat.satName»</satName>
						«ELSE»
						<satName/>
						«ENDIF»
						«Utils.doGenerateFieldStatesFoot(sat.version, sat.alias, sat.mode)»
					</satState>
					«ENDFOR»
				«ENDIF»
				«ENDFOR»
				«ELSE»
				<satState/>
				«ENDIF»
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
			«var listaOI = GetInternalOperationFacadeModel.getTotalInternalOperations(ensamblado)»
				«IF listaOI!=null && listaOI.length!=0»
					«FOR internalOper : listaOI»
					«var listAltair= internalOper.EAltair»
					«IF listAltair!=null && listAltair.length!=0»
						«FOR altair : listAltair»
						<altairState>
							«Utils.doGenerateFieldStatesHead(internalOper, altair.state)»
							«IF altair.transaction!=null && !altair.transaction.equals("")»
							<transaction>«altair.transaction»</transaction>
							«ELSE»
							<transaction/>
							«ENDIF»
							«Utils.doGenerateFieldStatesFoot(altair.version, altair.alias, altair.mode)»
						</altairState>
					«ENDFOR»
				«ENDIF»
				«ENDFOR»
				«ELSE»
				<altairState/>
				«ENDIF»				
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
	
	def static doGenerateBboo(Ensamblado ensamblado) 
    '''
	<bboo>
		<bbooStates>
		«var listaOI = GetInternalOperationFacadeModel.getTotalInternalOperations(ensamblado)»
			«IF listaOI!=null && listaOI.length!=0»
				«FOR internalOper : listaOI»
				«var listBBOO = internalOper.EBBOO»
				«IF listBBOO!=null && listBBOO.length!=0»
					«FOR bboo : listBBOO»
					<bbooState>
						«Utils.doGenerateFieldStatesHead(internalOper,bboo.state)»
						«IF bboo.alias!=null && !bboo.alias.toString.equals("")»
						<alias>«bboo.alias»</alias>
						«ELSE»
						<alias/>
						«ENDIF»
						«IF bboo.document!=null && !bboo.document.toString.equals("")»
						<document>«bboo.document»</document>
						«ELSE»
						<document/>
						«ENDIF»
						«IF bboo.provider!=null && !bboo.provider.toString.equals("")»
						<provider>«bboo.provider»</provider>
						«ELSE»
						<provider/>
						«ENDIF»
					</bbooState>
					«ENDFOR»
				«ENDIF»
				«ENDFOR»
			«ELSE»
			<bbooState/>
			«ENDIF»
		</bbooStates>
	</bboo>	
	'''
	
	def static doGenerateSiebel(Ensamblado ensamblado) 
    '''
	<siebel>
		<siebelStates>
		«var listaOI = GetInternalOperationFacadeModel.getTotalInternalOperations(ensamblado)»
			«IF listaOI!=null && listaOI.length!=0»
				«FOR internalOper : listaOI»
				«var listSiebels = internalOper.ESiebel»
				«IF listSiebels!=null && listSiebels.length!=0»
					«FOR siebel : listSiebels»
					<siebelState>
						«Utils.doGenerateFieldStatesHead(internalOper, siebel.state)»
						«IF siebel.server!=null && !siebel.server.toString.equals("")»
						<server>«siebel.server»</server>
						«ELSE»
						<server/>
						«ENDIF»
						«IF siebel.object!=null && !siebel.object.toString.equals("")»
						<object>«siebel.object»</object>
						«ELSE»
						<object/>
						«ENDIF»
						«IF siebel.request!=null && !siebel.request.toString.equals("")»
						<request>«siebel.request»</request>
						«ELSE»
						<request/>
						«ENDIF»
					</siebelState>
					«ENDFOR»
				«ENDIF»
				«ENDFOR»
			«ELSE»
			<siebelStates/>
			«ENDIF»
		</siebelStates>
	</siebel>	
	'''	
	
	def static doGenerateTp(Ensamblado ensamblado) 
    '''
	<tp>
		<tpStates>
		«var listaOI = GetInternalOperationFacadeModel.getTotalInternalOperations(ensamblado)»
			«IF listaOI!=null && listaOI.length!=0»
				«FOR internalOper : listaOI»
				«var listTP = internalOper.ETp»
				«IF listTP!=null && listTP.length!=0»
					«FOR tp : listTP»
					<tpState>
						«Utils.doGenerateFieldStatesHead(internalOper,tp.state)»
						«IF tp.code!=null && !tp.code.toString.equals("")»
						<code>«tp.code»</code>
						«ELSE»
						<code/>
						«ENDIF»
						«IF tp.type!=null && !tp.type.toString.equals("")»
						<type>«tp.type»</type>
						«ELSE»
						<type/>
						«ENDIF»
						«IF tp.subtype!=null && !tp.subtype.toString.equals("")»
						<subtype>«tp.subtype»</subtype>
						«ELSE»
						<subtype/>
						«ENDIF»
					</tpState>
					«ENDFOR»
				«ENDIF»
				«ENDFOR»
			«ELSE»
			<tpState/>
			«ENDIF»
		</tpStates>
	</tp>
	'''
}
				
			

