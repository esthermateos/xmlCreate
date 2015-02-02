package com.isb.vega.externalization.generator.xml;

import com.google.common.base.Objects;
import com.isb.vega.externalization.generator.xml.AssemblyXML;
import com.isb.vega.externalization.generator.xml.Connectors;
import com.isb.vega.externalization.generator.xml.GetDate;
import com.isb.vega.externalization.generator.xml.Global;
import com.isb.vega.externalization.generator.xml.SqlSentence;
import com.isb.vega.externalization.generator.xml.Using;
import com.isb.vega.externalization.generator.xml.Utils;
import com.isb.vega.externalization.generator.xml.WebServiceStates;
import dependencies.Ensamblado;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

@SuppressWarnings("all")
public class XmlGeneratorNew {
  private Ensamblado ensamblado;
  
  public XmlGeneratorNew(final Ensamblado ensamblado) {
    this.ensamblado = ensamblado;
  }
  
  public Writer generate(final File file) {
    try {
      FileWriter _fileWriter = new FileWriter(file);
      final Function1<FileWriter,Writer> _function = new Function1<FileWriter,Writer>() {
        public Writer apply(final FileWriter it) {
          try {
            Writer _xblockexpression = null;
            {
              CharSequence _doGenerateHeader = XmlGeneratorNew.this.doGenerateHeader();
              it.append(_doGenerateHeader);
              CharSequence _doGenerateAssembly = XmlGeneratorNew.this.doGenerateAssembly(XmlGeneratorNew.this.ensamblado);
              it.append(_doGenerateAssembly);
              CharSequence _doGenerateCommunication = XmlGeneratorNew.this.doGenerateCommunication(XmlGeneratorNew.this.ensamblado);
              it.append(_doGenerateCommunication);
              CharSequence _doGenerateChannelAdapter = XmlGeneratorNew.this.doGenerateChannelAdapter();
              it.append(_doGenerateChannelAdapter);
              CharSequence _doGenerateWebServices = XmlGeneratorNew.this.doGenerateWebServices();
              it.append(_doGenerateWebServices);
              CharSequence _doGenerateSQLComponents = XmlGeneratorNew.this.doGenerateSQLComponents();
              it.append(_doGenerateSQLComponents);
              CharSequence _doGenerateCaches = XmlGeneratorNew.this.doGenerateCaches();
              it.append(_doGenerateCaches);
              CharSequence _doGenerateFtps = XmlGeneratorNew.this.doGenerateFtps();
              it.append(_doGenerateFtps);
              CharSequence _doGenerateRules = XmlGeneratorNew.this.doGenerateRules();
              it.append(_doGenerateRules);
              CharSequence _doGenerateGlobal = XmlGeneratorNew.this.doGenerateGlobal();
              it.append(_doGenerateGlobal);
              CharSequence _doGenerateOther = XmlGeneratorNew.this.doGenerateOther();
              it.append(_doGenerateOther);
              CharSequence _doGenerateFooter = XmlGeneratorNew.this.doGenerateFooter();
              Writer _append = it.append(_doGenerateFooter);
              _xblockexpression = (_append);
            }
            return _xblockexpression;
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      Writer _using = Using.<FileWriter, Writer>using(_fileWriter, _function);
      return _using;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence doGenerateCaches() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<caches>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<cache>");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _doGeneratePackNameAlias = Utils.doGeneratePackNameAlias();
    _builder.append(_doGeneratePackNameAlias, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</cache>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("</caches>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence doGenerateFtps() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ftps>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<ftp>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<module>");
    _builder.append("</module>");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _doGeneratePackNameAlias = Utils.doGeneratePackNameAlias();
    _builder.append(_doGeneratePackNameAlias, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</ftp>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("</ftps>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence doGenerateGlobal() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<global>");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _doGenerateGlobal = Global.doGenerateGlobal();
    _builder.append(_doGenerateGlobal, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</global>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence doGenerateRules() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<rules>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<rule>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<id>");
    _builder.append("</id>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<lit>");
    _builder.append("</lit>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</rule>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("</rules>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence doGenerateOther() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<other>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<catCon/>\t");
    _builder.newLine();
    _builder.append("</other>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence doGenerateHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
    _builder.newLine();
    _builder.append("<configuration>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<appmetainf createBy=\"ALMSupport\" date=\"");
    String _Date = GetDate.Date();
    _builder.append(_Date, "	");
    _builder.append("\" version=\"2.0\">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence doGenerateSQLComponents() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<sqlComponents>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<propertiesPath>");
    _builder.append("</propertiesPath>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<sqlComponent>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<parameters>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<sqlComponentParams>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<module>");
    _builder.append("</module>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<component>");
    _builder.append("</component>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<implementationType>");
    _builder.append("</implementationType>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<dataSource>");
    _builder.append("</dataSource>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<dataSourceAlias>");
    _builder.append("</dataSourceAlias>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<maxRows>");
    _builder.append("</maxRows>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<pageMaxSize>");
    _builder.append("</pageMaxSize>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</sqlComponentParams>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</parameters>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<sqls>");
    _builder.newLine();
    _builder.append("\t\t\t");
    CharSequence _doGenerateSqlSentence = SqlSentence.doGenerateSqlSentence();
    _builder.append(_doGenerateSqlSentence, "			");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</sqls>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</sqlComponent>");
    _builder.newLine();
    _builder.append("</sqlComponents>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence doGenerateWebServices() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<webServices>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<associatedLogics></associatedLogics>");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _doGenerateWebServiceStates = WebServiceStates.doGenerateWebServiceStates();
    _builder.append(_doGenerateWebServiceStates, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</webServices>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence doGenerateChannelAdapter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<channelAdapters>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<channelAdapters>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<adapterName>");
    _builder.append("</adapterName>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<type>");
    _builder.append("</type>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<facadeName>");
    _builder.append("</facadeName>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<interfaceName>");
    _builder.append("</interfaceName>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<alias>");
    _builder.append("</alias>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<block/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<transport/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<package/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</channelAdapter>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("</channelAdapters>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence doGenerateCommunication(final Ensamblado ensamblado) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(ensamblado, null));
      if (_notEquals) {
        _builder.append("<communication>");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _doGenerateTrxOP = Connectors.doGenerateTrxOP(ensamblado);
        _builder.append(_doGenerateTrxOP, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _doGenerateSat = Connectors.doGenerateSat(ensamblado);
        _builder.append(_doGenerateSat, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _doGenerateAltair = Connectors.doGenerateAltair(ensamblado);
        _builder.append(_doGenerateAltair, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _doGenerateBboo = Connectors.doGenerateBboo();
        _builder.append(_doGenerateBboo, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _doGenerateTp = Connectors.doGenerateTp();
        _builder.append(_doGenerateTp, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _doGenerateSiebel = Connectors.doGenerateSiebel();
        _builder.append(_doGenerateSiebel, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("</communication>");
        _builder.newLine();
      } else {
        _builder.append("<communication/>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence doGenerateFooter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</configuration>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence doGenerateAssembly(final Ensamblado ensamblado) {
    CharSequence _xifexpression = null;
    boolean _notEquals = (!Objects.equal(ensamblado, null));
    if (_notEquals) {
      CharSequence _doGenerateAssembly = AssemblyXML.doGenerateAssembly(ensamblado);
      _xifexpression = _doGenerateAssembly;
    }
    return _xifexpression;
  }
  
  public static Writer compile(final File target, final Ensamblado ensamblado) {
    XmlGeneratorNew _xmlGeneratorNew = new XmlGeneratorNew(ensamblado);
    Writer _generate = _xmlGeneratorNew.generate(target);
    return _generate;
  }
}
