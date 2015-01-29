package com.isb.vega.externalization.generator.xml

class LogLevelDefinitions {
	
	def static doGenerateLogLevel() 
	
//	var listLogLevel
	
    '''
	<assemblyLogLevelsDefinitions> 
		«//FOR
		 »
			<category id="«»">
			<propagation priority="«»">«»</propagation>
			level priority="«»">«»</level>
			</category>
		«//ENDFOR
		»
	</assemblyLogLevelsDefinitions> 
	'''
}