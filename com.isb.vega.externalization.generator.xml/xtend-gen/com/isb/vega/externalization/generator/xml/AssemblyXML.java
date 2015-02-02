package com.isb.vega.externalization.generator.xml;

import com.google.common.base.Objects;
import com.isb.vega.externalization.generator.xml.AssemblyUtils;
import com.isb.vega.externalization.generator.xml.MultisCategories;
import dependencies.Ensamblado;
import dependencies.JMS;
import dependencies.LogLevel;
import dependencies.MultiProfile;
import dependencies.Security;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AssemblyXML {
  public static CharSequence doGenerateAssembly(final Ensamblado ensamblado) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<assembly defaultBankChannel=\"");
    _builder.append("\" name=\"");
    String _name = ensamblado.getName();
    _builder.append(_name, "");
    _builder.append("\"> ");
    _builder.newLineIfNotEmpty();
    {
      EList<LogLevel> _eLogLevel = ensamblado.getELogLevel();
      boolean _notEquals = (!Objects.equal(_eLogLevel, null));
      if (_notEquals) {
        _builder.append("\t");
        EList<LogLevel> _eLogLevel_1 = ensamblado.getELogLevel();
        CharSequence _doGenerateLogLevel = AssemblyUtils.doGenerateLogLevel(_eLogLevel_1);
        _builder.append(_doGenerateLogLevel, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Security _eEnsamblado = ensamblado.getEEnsamblado();
      boolean _notEquals_1 = (!Objects.equal(_eEnsamblado, null));
      if (_notEquals_1) {
        _builder.append("\t");
        _builder.append("<assemblySecurity>");
        _builder.newLine();
        {
          Security _eEnsamblado_1 = ensamblado.getEEnsamblado();
          String _autentication = _eEnsamblado_1.getAutentication();
          boolean _notEquals_2 = (!Objects.equal(_autentication, null));
          if (_notEquals_2) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<authenticationEnabled>");
            Security _eEnsamblado_2 = ensamblado.getEEnsamblado();
            String _autentication_1 = _eEnsamblado_2.getAutentication();
            String _string = _autentication_1.toString();
            _builder.append(_string, "		");
            _builder.append("</assemblySecurity>");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<authenticationEnabled/>");
            _builder.newLine();
          }
        }
        {
          Security _eEnsamblado_3 = ensamblado.getEEnsamblado();
          String _usuNotes = _eEnsamblado_3.getUsuNotes();
          boolean _notEquals_3 = (!Objects.equal(_usuNotes, null));
          if (_notEquals_3) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<uploadUsunotes>");
            Security _eEnsamblado_4 = ensamblado.getEEnsamblado();
            String _usuNotes_1 = _eEnsamblado_4.getUsuNotes();
            String _string_1 = _usuNotes_1.toString();
            _builder.append(_string_1, "		");
            _builder.append("</uploadUsunotes>");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<uploadUsunotes/>");
            _builder.newLine();
          }
        }
        {
          Security _eEnsamblado_5 = ensamblado.getEEnsamblado();
          String _entityAlias = _eEnsamblado_5.getEntityAlias();
          boolean _notEquals_4 = (!Objects.equal(_entityAlias, null));
          if (_notEquals_4) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<externalEntityAlias>");
            Security _eEnsamblado_6 = ensamblado.getEEnsamblado();
            String _entityAlias_1 = _eEnsamblado_6.getEntityAlias();
            String _string_2 = _entityAlias_1.toString();
            _builder.append(_string_2, "		");
            _builder.append("</externalEntityAlias>");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<externalEntityAlias/>");
            _builder.newLine();
          }
        }
        {
          Security _eEnsamblado_7 = ensamblado.getEEnsamblado();
          String _codePassword = _eEnsamblado_7.getCodePassword();
          boolean _notEquals_5 = (!Objects.equal(_codePassword, null));
          if (_notEquals_5) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<codedPassword>");
            Security _eEnsamblado_8 = ensamblado.getEEnsamblado();
            String _codePassword_1 = _eEnsamblado_8.getCodePassword();
            String _string_3 = _codePassword_1.toString();
            _builder.append(_string_3, "		");
            _builder.append("</codedPassword>");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<codedPassword/>");
            _builder.newLine();
          }
        }
        {
          Security _eEnsamblado_9 = ensamblado.getEEnsamblado();
          String _multi = _eEnsamblado_9.getMulti();
          boolean _notEquals_6 = (!Objects.equal(_multi, null));
          if (_notEquals_6) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<aebMultis>");
            Security _eEnsamblado_10 = ensamblado.getEEnsamblado();
            String _multi_1 = _eEnsamblado_10.getMulti();
            String _string_4 = _multi_1.toString();
            _builder.append(_string_4, "		");
            _builder.append("</aebMultis>");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<aebMultis/>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("</assemblySecurity>");
        _builder.newLine();
      }
    }
    {
      MultiProfile _eMultiProfile = ensamblado.getEMultiProfile();
      boolean _notEquals_7 = (!Objects.equal(_eMultiProfile, null));
      if (_notEquals_7) {
        _builder.append("\t");
        _builder.append("<aebMultis>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<mode/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        MultiProfile _eMultiProfile_1 = ensamblado.getEMultiProfile();
        CharSequence _doGenerateMultiCategories = MultisCategories.doGenerateMultiCategories(_eMultiProfile_1);
        _builder.append(_doGenerateMultiCategories, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</aebMultis>");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("<aebMultis/>");
        _builder.newLine();
      }
    }
    {
      JMS _eJMS = ensamblado.getEJMS();
      boolean _notEquals_8 = (!Objects.equal(_eJMS, null));
      if (_notEquals_8) {
        _builder.append("\t");
        JMS _eJMS_1 = ensamblado.getEJMS();
        CharSequence _doGenerateJMS = AssemblyUtils.doGenerateJMS(_eJMS_1);
        _builder.append(_doGenerateJMS, "	");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        _builder.append("<jmsTransactionals/>");
        _builder.newLine();
      }
    }
    _builder.append("</assembly>");
    _builder.newLine();
    return _builder;
  }
}
