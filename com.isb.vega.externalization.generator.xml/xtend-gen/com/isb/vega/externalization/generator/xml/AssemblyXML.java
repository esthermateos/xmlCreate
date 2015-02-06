package com.isb.vega.externalization.generator.xml;

import com.google.common.base.Objects;
import com.isb.vega.externalization.generator.xml.AssemblyUtils;
import com.isb.vega.externalization.generator.xml.MultisCategories;
import dependencies.Ensamblado;
import dependencies.JMS;
import dependencies.LogLevel;
import dependencies.MultiProfile;
import dependencies.Security;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AssemblyXML {
  public static CharSequence doGenerateAssembly(final Ensamblado ensamblado, final List<String> listPort, final List<String> listModules) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _or = false;
      boolean _and = false;
      String _defaultBankChannel = ensamblado.getDefaultBankChannel();
      boolean _notEquals = (!Objects.equal(_defaultBankChannel, null));
      if (!_notEquals) {
        _and = false;
      } else {
        String _defaultBankChannel_1 = ensamblado.getDefaultBankChannel();
        String _string = _defaultBankChannel_1.toString();
        boolean _equals = _string.equals("");
        boolean _not = (!_equals);
        _and = (_notEquals && _not);
      }
      if (_and) {
        _or = true;
      } else {
        boolean _and_1 = false;
        String _name = ensamblado.getName();
        boolean _notEquals_1 = (!Objects.equal(_name, null));
        if (!_notEquals_1) {
          _and_1 = false;
        } else {
          String _name_1 = ensamblado.getName();
          String _string_1 = _name_1.toString();
          boolean _equals_1 = _string_1.equals("");
          boolean _not_1 = (!_equals_1);
          _and_1 = (_notEquals_1 && _not_1);
        }
        _or = (_and || _and_1);
      }
      if (_or) {
        _builder.append("<assembly defaultBankChannel=\"");
        String _defaultBankChannel_2 = ensamblado.getDefaultBankChannel();
        _builder.append(_defaultBankChannel_2, "");
        _builder.append("\" name=\"");
        String _name_2 = ensamblado.getName();
        _builder.append(_name_2, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<assembly>");
        _builder.newLine();
      }
    }
    {
      EList<LogLevel> _eLogLevel = ensamblado.getELogLevel();
      boolean _notEquals_2 = (!Objects.equal(_eLogLevel, null));
      if (_notEquals_2) {
        _builder.append("\t");
        EList<LogLevel> _eLogLevel_1 = ensamblado.getELogLevel();
        CharSequence _doGenerateLogLevel = AssemblyUtils.doGenerateLogLevel(_eLogLevel_1);
        _builder.append(_doGenerateLogLevel, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Security _eEnsamblado = ensamblado.getEEnsamblado();
      boolean _notEquals_3 = (!Objects.equal(_eEnsamblado, null));
      if (_notEquals_3) {
        _builder.append("\t");
        _builder.append("<assemblySecurity>");
        _builder.newLine();
        {
          boolean _and_2 = false;
          Security _eEnsamblado_1 = ensamblado.getEEnsamblado();
          String _autentication = _eEnsamblado_1.getAutentication();
          boolean _notEquals_4 = (!Objects.equal(_autentication, null));
          if (!_notEquals_4) {
            _and_2 = false;
          } else {
            Security _eEnsamblado_2 = ensamblado.getEEnsamblado();
            String _autentication_1 = _eEnsamblado_2.getAutentication();
            String _string_2 = _autentication_1.toString();
            boolean _equals_2 = _string_2.equals("");
            boolean _not_2 = (!_equals_2);
            _and_2 = (_notEquals_4 && _not_2);
          }
          if (_and_2) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<authenticationEnabled>");
            Security _eEnsamblado_3 = ensamblado.getEEnsamblado();
            String _autentication_2 = _eEnsamblado_3.getAutentication();
            String _string_3 = _autentication_2.toString();
            _builder.append(_string_3, "		");
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
          boolean _and_3 = false;
          Security _eEnsamblado_4 = ensamblado.getEEnsamblado();
          String _usuNotes = _eEnsamblado_4.getUsuNotes();
          boolean _notEquals_5 = (!Objects.equal(_usuNotes, null));
          if (!_notEquals_5) {
            _and_3 = false;
          } else {
            Security _eEnsamblado_5 = ensamblado.getEEnsamblado();
            String _usuNotes_1 = _eEnsamblado_5.getUsuNotes();
            String _string_4 = _usuNotes_1.toString();
            boolean _equals_3 = _string_4.equals("");
            boolean _not_3 = (!_equals_3);
            _and_3 = (_notEquals_5 && _not_3);
          }
          if (_and_3) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<uploadUsunotes>");
            Security _eEnsamblado_6 = ensamblado.getEEnsamblado();
            String _usuNotes_2 = _eEnsamblado_6.getUsuNotes();
            String _string_5 = _usuNotes_2.toString();
            _builder.append(_string_5, "		");
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
          boolean _and_4 = false;
          Security _eEnsamblado_7 = ensamblado.getEEnsamblado();
          String _entityAlias = _eEnsamblado_7.getEntityAlias();
          boolean _notEquals_6 = (!Objects.equal(_entityAlias, null));
          if (!_notEquals_6) {
            _and_4 = false;
          } else {
            Security _eEnsamblado_8 = ensamblado.getEEnsamblado();
            String _entityAlias_1 = _eEnsamblado_8.getEntityAlias();
            String _string_6 = _entityAlias_1.toString();
            boolean _equals_4 = _string_6.equals("");
            boolean _not_4 = (!_equals_4);
            _and_4 = (_notEquals_6 && _not_4);
          }
          if (_and_4) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<externalEntityAlias>");
            Security _eEnsamblado_9 = ensamblado.getEEnsamblado();
            String _entityAlias_2 = _eEnsamblado_9.getEntityAlias();
            String _string_7 = _entityAlias_2.toString();
            _builder.append(_string_7, "		");
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
          boolean _and_5 = false;
          Security _eEnsamblado_10 = ensamblado.getEEnsamblado();
          String _codePassword = _eEnsamblado_10.getCodePassword();
          boolean _notEquals_7 = (!Objects.equal(_codePassword, null));
          if (!_notEquals_7) {
            _and_5 = false;
          } else {
            Security _eEnsamblado_11 = ensamblado.getEEnsamblado();
            String _codePassword_1 = _eEnsamblado_11.getCodePassword();
            String _string_8 = _codePassword_1.toString();
            boolean _equals_5 = _string_8.equals("");
            boolean _not_5 = (!_equals_5);
            _and_5 = (_notEquals_7 && _not_5);
          }
          if (_and_5) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<codedPassword>");
            Security _eEnsamblado_12 = ensamblado.getEEnsamblado();
            String _codePassword_2 = _eEnsamblado_12.getCodePassword();
            String _string_9 = _codePassword_2.toString();
            _builder.append(_string_9, "		");
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
          boolean _and_6 = false;
          Security _eEnsamblado_13 = ensamblado.getEEnsamblado();
          String _multi = _eEnsamblado_13.getMulti();
          boolean _notEquals_8 = (!Objects.equal(_multi, null));
          if (!_notEquals_8) {
            _and_6 = false;
          } else {
            Security _eEnsamblado_14 = ensamblado.getEEnsamblado();
            String _multi_1 = _eEnsamblado_14.getMulti();
            String _string_10 = _multi_1.toString();
            boolean _equals_6 = _string_10.equals("");
            boolean _not_6 = (!_equals_6);
            _and_6 = (_notEquals_8 && _not_6);
          }
          if (_and_6) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<aebMultis>");
            Security _eEnsamblado_15 = ensamblado.getEEnsamblado();
            String _multi_2 = _eEnsamblado_15.getMulti();
            String _string_11 = _multi_2.toString();
            _builder.append(_string_11, "		");
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
      boolean _notEquals_9 = (!Objects.equal(_eMultiProfile, null));
      if (_notEquals_9) {
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
      EList<JMS> _eJMS = ensamblado.getEJMS();
      boolean _notEquals_10 = (!Objects.equal(_eJMS, null));
      if (_notEquals_10) {
        _builder.append("\t");
        CharSequence _doGenerateJMS = AssemblyUtils.doGenerateJMS(listPort, listModules);
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
