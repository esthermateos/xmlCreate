package com.isb.vega.externalization.generator.xml

import static com.isb.vega.externalization.generator.xml.Using.*
import java.io.File
import java.io.FileWriter

class XmlGeneratorNew {
	def generate(File file) {
		using(new FileWriter(file)) [
			it.append(doGenerateHeader())
			it.append(doGenerateAssembly())
			it.append(doGenerateCommunication())
			it.append(doGenerateChannelAdapter())
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
			«//FOR
			»
			<cache>
				«Utils.doGeneratePackNameAlias»
			</cache>
			«//ENDFOR
			»
		</caches>
	'''
	
		def doGenerateFtps() '''
		<ftps>
			«//FOR
			»
			<ftp>
				<module>«»</module>
				«Utils.doGeneratePackNameAlias»
			</ftp>
			«//ENDFOR
			»
		</ftps>
	'''
	
		def doGenerateGlobal() '''
		<global>
			
		</global>
	'''
	
		def doGenerateRules() '''
		<rules>
			«//FOR
			»
			<rule>
				<id>«»</id>
				<lit>«»</lit>
			</rule>
			«//ENDFOR
			»
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
			<appmetainf createBy="ALMSupport" date="«GetDate.Date()» version="2.0">
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
	
		def doGenerateChannelAdapter() '''
		<channelAdapters>
			«//FOR
			»
			<channelAdapters>
				<adapterName>«»</adapterName>
				<type>«»</type>
				<facadeName>«»</facadeName>
				<interfaceName>«»</interfaceName>
				<alias>«»</alias>
				<block/>
				<transport/>
				<package/>
			</channelAdapter>
			«//ENDFOR
			»
		</channelAdapters>
	'''
	
		def doGenerateCommunication() '''
		<communication>
			«Connectors.doGenerateTrxOP»
			«Connectors.doGenerateSat»
			«Connectors.doGenerateAltair»
			«Connectors.doGenerateBboo»
			«Connectors.doGenerateTp»
			«Connectors.doGenerateSiebel»
		</communication>		
	'''
	
		def doGenerateFooter() '''
		</configuration>
	'''
	
		def doGenerateAssembly(){
			AssemblyXML.doGenerateAssembly()
		}
		
	
	def static compile(File target) {
		new XmlGeneratorNew().generate(target);
	}
}