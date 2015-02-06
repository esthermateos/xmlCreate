package com.isb.vega.externalization.generator.xml

class Global {
	
	def static doGenerateGlobal() 	
    '''
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
	<clientArcReferences>
		<clientArcRef>
			<application>«»</application>
			<presentationOP>«»</presentationOP>
			<version>«»</version>
			<src>«»</src>
		</clientArcRef>
	</clientArcReferences>
	'''
	
}