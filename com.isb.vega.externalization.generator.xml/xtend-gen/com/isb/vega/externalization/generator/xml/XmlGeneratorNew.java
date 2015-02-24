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
import dependencies.ChannelAdapter;
import dependencies.Ensamblado;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

@SuppressWarnings("all")
public class XmlGeneratorNew {
  private Ensamblado ensamblado;
  
  private List<String> listPort;
  
  private List<String> listModules;
  
  public XmlGeneratorNew(final Ensamblado ensamblado, final List<String> listPort, final List<String> listModules) {
    this.ensamblado = ensamblado;
    this.listModules = listModules;
    this.listPort = listPort;
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
              CharSequence _doGenerateAssembly = XmlGeneratorNew.this.doGenerateAssembly(XmlGeneratorNew.this.ensamblado, XmlGeneratorNew.this.listPort, XmlGeneratorNew.this.listModules);
              it.append(_doGenerateAssembly);
              CharSequence _doGenerateCommunication = XmlGeneratorNew.this.doGenerateCommunication(XmlGeneratorNew.this.ensamblado);
              it.append(_doGenerateCommunication);
              CharSequence _doGenerateChannelAdapter = XmlGeneratorNew.this.doGenerateChannelAdapter(XmlGeneratorNew.this.ensamblado);
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
    _builder.append("<cache>");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _doGeneratePackNameAlias = Utils.doGeneratePackNameAlias();
    _builder.append(_doGeneratePackNameAlias, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</cache>");
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
    _builder.append("<appmetainf createdBy=\"ALMSupport\" date=\"");
    String _Date = GetDate.Date();
    _builder.append(_Date, "");
    _builder.append("\" version=\"2.0\"/>");
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
  
  public CharSequence doGenerateChannelAdapter(final Ensamblado ensamblado) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(ensamblado, null));
      if (_notEquals) {
        EList<ChannelAdapter> channelAdapters = ensamblado.getEChannelAdapter();
        _builder.newLineIfNotEmpty();
        {
          boolean _notEquals_1 = (!Objects.equal(channelAdapters, null));
          if (_notEquals_1) {
            _builder.append("<channelAdapters>");
            _builder.newLine();
            {
              for(final ChannelAdapter channelAdapter : channelAdapters) {
                _builder.append("\t");
                _builder.append("<channelAdapter>");
                _builder.newLine();
                {
                  boolean _and = false;
                  String _name = channelAdapter.getName();
                  boolean _notEquals_2 = (!Objects.equal(_name, null));
                  if (!_notEquals_2) {
                    _and = false;
                  } else {
                    String _name_1 = channelAdapter.getName();
                    String _string = _name_1.toString();
                    boolean _equals = _string.equals("");
                    boolean _not = (!_equals);
                    _and = (_notEquals_2 && _not);
                  }
                  if (_and) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<adapterName>");
                    String _name_2 = channelAdapter.getName();
                    _builder.append(_name_2, "		");
                    _builder.append("</adapterName>");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<adapterName/>");
                    _builder.newLine();
                  }
                }
                {
                  boolean _and_1 = false;
                  String _type = channelAdapter.getType();
                  boolean _notEquals_3 = (!Objects.equal(_type, null));
                  if (!_notEquals_3) {
                    _and_1 = false;
                  } else {
                    String _type_1 = channelAdapter.getType();
                    String _string_1 = _type_1.toString();
                    boolean _equals_1 = _string_1.equals("");
                    boolean _not_1 = (!_equals_1);
                    _and_1 = (_notEquals_3 && _not_1);
                  }
                  if (_and_1) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<type>");
                    String _type_2 = channelAdapter.getType();
                    _builder.append(_type_2, "		");
                    _builder.append("</type>");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<type/>");
                    _builder.newLine();
                  }
                }
                {
                  boolean _and_2 = false;
                  String _facadeName = channelAdapter.getFacadeName();
                  boolean _notEquals_4 = (!Objects.equal(_facadeName, null));
                  if (!_notEquals_4) {
                    _and_2 = false;
                  } else {
                    String _facadeName_1 = channelAdapter.getFacadeName();
                    String _string_2 = _facadeName_1.toString();
                    boolean _equals_2 = _string_2.equals("");
                    boolean _not_2 = (!_equals_2);
                    _and_2 = (_notEquals_4 && _not_2);
                  }
                  if (_and_2) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<facadeName>");
                    String _facadeName_2 = channelAdapter.getFacadeName();
                    _builder.append(_facadeName_2, "		");
                    _builder.append("</facadeName>");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<facadeName/>");
                    _builder.newLine();
                  }
                }
                {
                  boolean _and_3 = false;
                  String _interfaceName = channelAdapter.getInterfaceName();
                  boolean _notEquals_5 = (!Objects.equal(_interfaceName, null));
                  if (!_notEquals_5) {
                    _and_3 = false;
                  } else {
                    String _interfaceName_1 = channelAdapter.getInterfaceName();
                    String _string_3 = _interfaceName_1.toString();
                    boolean _equals_3 = _string_3.equals("");
                    boolean _not_3 = (!_equals_3);
                    _and_3 = (_notEquals_5 && _not_3);
                  }
                  if (_and_3) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<interfaceName>");
                    String _interfaceName_2 = channelAdapter.getInterfaceName();
                    _builder.append(_interfaceName_2, "		");
                    _builder.append("</interfaceName>");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<interfaceName/>");
                    _builder.newLine();
                  }
                }
                {
                  boolean _and_4 = false;
                  String _alias = channelAdapter.getAlias();
                  boolean _notEquals_6 = (!Objects.equal(_alias, null));
                  if (!_notEquals_6) {
                    _and_4 = false;
                  } else {
                    String _alias_1 = channelAdapter.getAlias();
                    String _string_4 = _alias_1.toString();
                    boolean _equals_4 = _string_4.equals("");
                    boolean _not_4 = (!_equals_4);
                    _and_4 = (_notEquals_6 && _not_4);
                  }
                  if (_and_4) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<alias>");
                    String _alias_2 = channelAdapter.getAlias();
                    _builder.append(_alias_2, "		");
                    _builder.append("</alias>");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<alias/>");
                    _builder.newLine();
                  }
                }
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<block/>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<transport/>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<package/>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("</channelAdapter>");
                _builder.newLine();
              }
            }
            _builder.append("</channelAdapters>");
            _builder.newLine();
          } else {
            _builder.append("<channelAdapters/>");
            _builder.newLine();
          }
        }
      } else {
        _builder.append("<channelAdapters/>");
        _builder.newLine();
      }
    }
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
  
  public CharSequence doGenerateAssembly(final Ensamblado ensamblado, final List<String> listPort, final List<String> listModules) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(ensamblado, null));
      if (_notEquals) {
        CharSequence _doGenerateAssembly = AssemblyXML.doGenerateAssembly(ensamblado, listPort, listModules);
        _builder.append(_doGenerateAssembly, "");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<assembly/>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public Writer compile(final File target, final Ensamblado ensamblado, final List<String> listPort, final List<String> listModules) {
    XmlGeneratorNew _xmlGeneratorNew = new XmlGeneratorNew(ensamblado, listPort, listModules);
    Writer _generate = _xmlGeneratorNew.generate(target);
    return _generate;
  }
}
