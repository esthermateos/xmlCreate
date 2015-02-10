package com.isb.vega.externalization.generator.xml

import static com.isb.vega.externalization.generator.xml.Using.*
import java.io.File
import java.io.FileWriter
import dependencies.Ensamblado
import java.util.List

class XmlGeneratorNew {
	
	Ensamblado ensamblado
	List<String> listPort
	List<String>listModules
	
	new(Ensamblado ensamblado, List<String> listPort, List<String>listModules) {
		this.ensamblado = ensamblado
		this.listModules = listModules
		this.listPort = listPort
	}
	
	def generate(File file) {
		using(new FileWriter(file)) [
			it.append(doGenerateHeader())			
			it.append(doGenerateAssembly(ensamblado, listPort, listModules))
			it.append(doGenerateCommunication(ensamblado))
			it.append(doGenerateChannelAdapter(ensamblado))
			it.append(doGenerateWebServices())
			it.append(doGenerateSQLComponents())
			it.append(doGenerateCaches())
			it.append(doGenerateFtps())
			it.append(doGenerateRules())
			it.append(doGenerateGlobal())
			it.append(doGenerateOther())
			it.append(doGenerateFooter());
		]
	}
	
	
		def doGenerateCaches() '''
		<caches>
			<cache>
				«Utils.doGeneratePackNameAlias»
			</cache>
		</caches>
	'''
	
		def doGenerateFtps() '''
		<ftps>
			<ftp>
				<module>«»</module>
				«Utils.doGeneratePackNameAlias»
			</ftp>
		</ftps>
	'''
	
		def doGenerateGlobal() '''
		<global>
			«Global.doGenerateGlobal»
		</global>
	'''
	
		def doGenerateRules() '''
		<rules>
			<rule>
				<id>«»</id>
				<lit>«»</lit>
			</rule>
		</rules>
	'''
	
		def doGenerateOther() '''
		<other>
			<catCon/>	
		</other>
	'''
	
		def doGenerateHeader() '''
		<?xml version="1.0" encoding="ISO-8859-1"?>
		<configuration>
		<appmetainf createdBy="ALMSupport" date="«GetDate.Date()»" version="2.0">
	'''
	
		def doGenerateSQLComponents() '''
		<sqlComponents>
			<propertiesPath>«»</propertiesPath>
			<sqlComponent>
				<parameters>
					<sqlComponentParams>
						<module>«»</module>
						<component>«»</component>
						<implementationType>«»</implementationType>
						<dataSource>«»</dataSource>
						<dataSourceAlias>«»</dataSourceAlias>
						<maxRows>«»</maxRows>
						<pageMaxSize>«»</pageMaxSize>
					</sqlComponentParams>
				</parameters>
				<sqls>
					«SqlSentence.doGenerateSqlSentence»
				</sqls>
			</sqlComponent>
		</sqlComponents>
	'''
	
		def doGenerateWebServices() '''
		<webServices>
			<associatedLogics></associatedLogics>
			«WebServiceStates.doGenerateWebServiceStates»
		</webServices>
	'''
	
		def doGenerateChannelAdapter(Ensamblado ensamblado) '''
		«IF ensamblado!=null»
		«var channelAdapters = ensamblado.EChannelAdapter»
		«IF channelAdapters!=null»
		<channelAdapters>
			«FOR channelAdapter : channelAdapters»
			<channelAdapter>
				«IF channelAdapter.name!=null && !channelAdapter.name.toString.equals("")»
					<adapterName>«channelAdapter.name»</adapterName>
				«ELSE»
					<adapterName/>
				«ENDIF»
				«IF channelAdapter.type!=null && !channelAdapter.type.toString.equals("")»
					<type>«channelAdapter.type»</type>
				«ELSE»
					<type/>
				«ENDIF»
				«IF channelAdapter.facadeName!=null && !channelAdapter.facadeName.toString.equals("")»
					<facadeName>«channelAdapter.facadeName»</facadeName>
				«ELSE»
					<facadeName/>
				«ENDIF»
				«IF channelAdapter.interfaceName!=null && !channelAdapter.interfaceName.toString.equals("")»
					<interfaceName>«channelAdapter.interfaceName»</interfaceName>
				«ELSE»
					<interfaceName/>
				«ENDIF»
				«IF channelAdapter.alias!=null && !channelAdapter.alias.toString.equals("")»
					<alias>«channelAdapter.alias»</alias>
				«ELSE»
					<alias/>
				«ENDIF»
				<block/>
				<transport/>
				<package/>
			</channelAdapter>
			«ENDFOR»
		</channelAdapters>
		«ELSE»
		<channelAdapters/>
		«ENDIF»
		«ELSE»
		<channelAdapters/>
		«ENDIF»
	'''
	
		def doGenerateCommunication(Ensamblado ensamblado) '''
		«IF ensamblado!=null»
		<communication>
			«Connectors.doGenerateTrxOP(ensamblado)»
			«Connectors.doGenerateSat(ensamblado)»
			«Connectors.doGenerateAltair(ensamblado)»
			«Connectors.doGenerateBboo()»
			«Connectors.doGenerateTp()»
			«Connectors.doGenerateSiebel()»
		</communication>
		«ELSE»
		<communication/>
		«ENDIF»		
	'''
	
		def doGenerateFooter() '''
		</configuration>
	'''
	
		def doGenerateAssembly(Ensamblado ensamblado, List<String> listPort, List<String>listModules)'''
		«IF ensamblado!=null»
			«AssemblyXML.doGenerateAssembly(ensamblado, listPort, listModules)»
		«ELSE»
		<assembly/>
		«ENDIF»
		'''
		
	
	def compile(File target, Ensamblado ensamblado, List<String> listPort, List<String>listModules) {
		new XmlGeneratorNew(ensamblado, listPort, listModules).generate(target);
	}
}