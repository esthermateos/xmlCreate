package com.isb.vega.externalization.generator.xml

class SqlSentence {
	
	def static doGenerateSqlSentence() 
	'''
	«//FOR
	»
	<sql-sentence>
		<module>«»</module>
		<component>«»</component>
		<name>«»</name>
		<type>«»</type>
		<sql>«»</sql>
	</sql-sentence>
	«//ENDFOR
	»
	'''}