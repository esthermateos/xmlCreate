package com.isb.vega.externalization.generator.xml

import static com.isb.vega.externalization.generator.xml.Using.*
import java.io.File
import java.io.FileWriter
import dependencies.DependenciesFactory
import dependencies.Ensamblado
import dependencies.DependenciesPackage

class XmlGeneratorNew {
	
	DependenciesPackage dependen
	
	new(DependenciesPackage dependencies) {
		dependen =dependencies
	}
	
	def generate(File file) {
		using(new FileWriter(file)) [
			it.append(doGenerateHeader())
			it.append(doGenerateAssembly(dependen))
			it.append(doGenerateCommunication(dependen))
			it.append(doGenerateChannelAdapter(dependen))
			it.append(doGenerateWebServices(dependen))
			it.append(doGenerateSQLComponents(dependen))
			it.append(doGenerateCaches(dependen))
			it.append(doGenerateFtps(dependen))
			it.append(doGenerateRules(dependen))
			it.append(doGenerateGlobal(dependen))
			it.append(doGenerateOther())
			it.append(doGenerateFooter());
		]
	}
	
	
		def doGenerateCaches(DependenciesPackage dependency) '''
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
	
		def doGenerateFtps(DependenciesPackage dependency) '''
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
	
		def doGenerateGlobal(DependenciesPackage dependency) '''
		<global>
			«Global.doGenerateGlobal»
		</global>
	'''
	
		def doGenerateRules(DependenciesPackage dependency) '''
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
	
		def doGenerateSQLComponents(DependenciesPackage dependency) '''
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
	
		def doGenerateWebServices(DependenciesPackage dependency) '''
		<webServices>
			<associatedLogics></associatedLogics>
			«WebServiceStates.doGenerateWebServiceStates»
		</webServices>
	'''
	
		def doGenerateChannelAdapter(DependenciesPackage dependency) '''
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
	
		def doGenerateCommunication(DependenciesPackage dependency) '''
		<communication>
			«Connectors.doGenerateTrxOP()»
			«Connectors.doGenerateSat()»
			«Connectors.doGenerateAltair()»
			«Connectors.doGenerateBboo()»
			«Connectors.doGenerateTp()»
			«Connectors.doGenerateSiebel()»
		</communication>		
	'''
	
		def doGenerateFooter() '''
		</configuration>
	'''
	
		def doGenerateAssembly(DependenciesPackage dependency){
			AssemblyXML.doGenerateAssembly(dependency.ensamblado as Ensamblado)
		}
		
	
	def static compile(File target, DependenciesPackage dependencies) {
		new XmlGeneratorNew(dependencies).generate(target);
	}
}