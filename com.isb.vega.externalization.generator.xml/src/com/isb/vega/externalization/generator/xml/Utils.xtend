package com.isb.vega.externalization.generator.xml

class Utils {
	
	def static doGenerateFieldStatesHead() 
	'''
	<application>«»</application>
	<internalOp>«»</internalOp>
	<internalOpVersion>«»</internalOpVersion>
	<state>«»</state>	
	'''
	
	def static doGenerateFieldStatesFoot() 
	'''
	<version>«»</version>
	<alias>«»</alias>
	<mode>«»</mode>
	'''
	
	def static doGeneratePackNameAlias() 
	'''
	<package>«»</package>
	<name>«»</name>
	<alias>«»</alias>
	'''
}