package com.isb.vega.externalization.generator.xml

import dependencies.OI

class Utils {
	
	def static doGenerateFieldStatesHead(OI oi, String statename) 
	'''
	«IF oi.lnName!=null && !oi.lnName.toString.equals("")»
	<application>«oi.lnName»</application>
	«ELSE»
	<application/>
	«ENDIF»
	«IF oi.oiName!=null && !oi.oiName.toString.equals("")»
	<internalOp>«oi.oiName»</internalOp>
	«ELSE»
	<internalOp/>
	«ENDIF»
	«IF oi.version!=null && !oi.version.toString.equals("")»
	<internalOpVersion>«oi.version»</internalOpVersion>
	«ELSE»
	<internalOpVersion/>
	«ENDIF»
	«IF statename!=null && !statename.equals("")»
	<state>«statename»</state>
	«ELSE»
	<state/>
	«ENDIF»	
	'''
	
	def static doGenerateFieldStatesFoot(String version, String alias, String mode) 
	'''
	«IF version!=null && !version.equals("")»
	<version>«version»</version>
	«ELSE»
	<version/>
	«ENDIF»
	«IF alias!=null && !alias.equals("")»
	<alias>«alias»</alias>
	«ELSE»
	<alias/>
	«ENDIF»
	«IF mode!=null && !mode.equals("")»
	<mode>«mode»</mode>
	«ELSE»
	<mode/>
	«ENDIF»
	'''
	
	def static doGeneratePackNameAlias() 
	'''
	<package>«»</package>
	<name>«»</name>
	<alias>«»</alias>
	'''
	
}