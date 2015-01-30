package com.isb.vega.externalization.generator.xml

class Global {
	
	def static doGenerateGlobal() 	
    '''
	«//FOR
	»
	<treeTbls>
		<treeTbl>
			<application>«»</application>
			<presentationOP>«»</presentationOP>
			<version>«»</version> 
			<jsp>«»</jsp>
			<table>«»</table> 
			<columns>«»</columns> 
		</treeTbl>
	</treeTbls>
	«//FOR
	»
	<mgrTables>
		<mgrTable>
			<application>«»</application>
			<presentationOP>«»</presentationOP>
			<version>«»</version> 
			<jsp>«»</jsp>
			<table>«»</table> 
			<columns>«»</columns> 
		</mgrTable>
	</mgrTables>
	«//FOR
		 »
	<clientArcReferences>
		«//FOR
		»
		<clientArcRef>
			<application>«»</application>
			<presentationOP>«»</presentationOP>
			<version>«»</version>
			<src>«»</src>
		</clientArcRef>
	</clientArcReferences>
	'''
	
}