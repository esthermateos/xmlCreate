package com.isb.vega.externalization.generator.xml;

import com.google.common.base.Objects;
import dependencies.OI;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Utils {
  public static CharSequence doGenerateFieldStatesHead(final OI oi, final String statename) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      String _lnName = oi.getLnName();
      boolean _notEquals = (!Objects.equal(_lnName, null));
      if (!_notEquals) {
        _and = false;
      } else {
        String _lnName_1 = oi.getLnName();
        String _string = _lnName_1.toString();
        boolean _equals = _string.equals("");
        boolean _not = (!_equals);
        _and = (_notEquals && _not);
      }
      if (_and) {
        _builder.append("<application>");
        String _lnName_2 = oi.getLnName();
        _builder.append(_lnName_2, "");
        _builder.append("</application>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<application/>");
        _builder.newLine();
      }
    }
    {
      boolean _and_1 = false;
      String _oiName = oi.getOiName();
      boolean _notEquals_1 = (!Objects.equal(_oiName, null));
      if (!_notEquals_1) {
        _and_1 = false;
      } else {
        String _oiName_1 = oi.getOiName();
        String _string_1 = _oiName_1.toString();
        boolean _equals_1 = _string_1.equals("");
        boolean _not_1 = (!_equals_1);
        _and_1 = (_notEquals_1 && _not_1);
      }
      if (_and_1) {
        _builder.append("<internalOp>");
        String _oiName_2 = oi.getOiName();
        _builder.append(_oiName_2, "");
        _builder.append("</internalOp>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<internalOp/>");
        _builder.newLine();
      }
    }
    {
      boolean _and_2 = false;
      String _version = oi.getVersion();
      boolean _notEquals_2 = (!Objects.equal(_version, null));
      if (!_notEquals_2) {
        _and_2 = false;
      } else {
        String _version_1 = oi.getVersion();
        String _string_2 = _version_1.toString();
        boolean _equals_2 = _string_2.equals("");
        boolean _not_2 = (!_equals_2);
        _and_2 = (_notEquals_2 && _not_2);
      }
      if (_and_2) {
        _builder.append("<internalOpVersion>");
        String _version_2 = oi.getVersion();
        _builder.append(_version_2, "");
        _builder.append("</internalOpVersion>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<internalOpVersion/>");
        _builder.newLine();
      }
    }
    {
      boolean _and_3 = false;
      boolean _notEquals_3 = (!Objects.equal(statename, null));
      if (!_notEquals_3) {
        _and_3 = false;
      } else {
        boolean _equals_3 = statename.equals("");
        boolean _not_3 = (!_equals_3);
        _and_3 = (_notEquals_3 && _not_3);
      }
      if (_and_3) {
        _builder.append("<state>");
        _builder.append(statename, "");
        _builder.append("</state>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<state/>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public static CharSequence doGenerateFieldStatesFoot(final String version, final String alias, final String mode) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(version, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _equals = version.equals("");
        boolean _not = (!_equals);
        _and = (_notEquals && _not);
      }
      if (_and) {
        _builder.append("<version>");
        _builder.append(version, "");
        _builder.append("</version>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<version/>");
        _builder.newLine();
      }
    }
    {
      boolean _and_1 = false;
      boolean _notEquals_1 = (!Objects.equal(alias, null));
      if (!_notEquals_1) {
        _and_1 = false;
      } else {
        boolean _equals_1 = alias.equals("");
        boolean _not_1 = (!_equals_1);
        _and_1 = (_notEquals_1 && _not_1);
      }
      if (_and_1) {
        _builder.append("<alias>");
        _builder.append(alias, "");
        _builder.append("</alias>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<alias/>");
        _builder.newLine();
      }
    }
    {
      boolean _and_2 = false;
      boolean _notEquals_2 = (!Objects.equal(mode, null));
      if (!_notEquals_2) {
        _and_2 = false;
      } else {
        boolean _equals_2 = mode.equals("");
        boolean _not_2 = (!_equals_2);
        _and_2 = (_notEquals_2 && _not_2);
      }
      if (_and_2) {
        _builder.append("<mode>");
        _builder.append(mode, "");
        _builder.append("</mode>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<mode/>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public static CharSequence doGeneratePackNameAlias() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<package>");
    _builder.append("</package>");
    _builder.newLine();
    _builder.append("<name>");
    _builder.append("</name>");
    _builder.newLine();
    _builder.append("<alias>");
    _builder.append("</alias>");
    _builder.newLine();
    return _builder;
  }
}
