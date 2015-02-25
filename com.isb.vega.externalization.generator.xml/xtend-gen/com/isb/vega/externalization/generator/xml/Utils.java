package com.isb.vega.externalization.generator.xml;

import com.google.common.base.Objects;
import dependencies.Cache;
import dependencies.ComponentSQL;
import dependencies.Ensamblado;
import dependencies.OI;
import dependencies.OP;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Utils {
  public static CharSequence doGenerateFieldStatesHead() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<application>");
    _builder.append("</application>");
    _builder.newLine();
    _builder.append("<internalOp>");
    _builder.append("</internalOp>");
    _builder.newLine();
    _builder.append("<internalOpVersion>");
    _builder.append("</internalOpVersion>");
    _builder.newLine();
    _builder.append("<state>");
    _builder.append("</state>\t");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence doGenerateFieldStatesFoot() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<version>");
    _builder.append("</version>");
    _builder.newLine();
    _builder.append("<alias>");
    _builder.append("</alias>");
    _builder.newLine();
    _builder.append("<mode>");
    _builder.append("</mode>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence doGeneratePackNameAlias(final Ensamblado ensamblado) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(ensamblado, null));
      if (_notEquals) {
        EList<OP> ops = ensamblado.getEOP();
        _builder.newLineIfNotEmpty();
        {
          for(final OP op : ops) {
            EList<OI> ois = op.getEOI();
            _builder.newLineIfNotEmpty();
            {
              for(final OI oi : ois) {
                _builder.append("\t");
                ComponentSQL sqlComponent = oi.getEComponentSQL();
                _builder.newLineIfNotEmpty();
                {
                  Cache _eCache = sqlComponent.getECache();
                  String _alias = _eCache.getAlias();
                  boolean _notEquals_1 = (!Objects.equal(_alias, null));
                  if (_notEquals_1) {
                    _builder.append("\t");
                    Cache cache = sqlComponent.getECache();
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("<package>");
                    String _package = cache.getPackage();
                    _builder.append(_package, "	");
                    _builder.append("</package>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("<name>");
                    String _name = cache.getName();
                    _builder.append(_name, "	");
                    _builder.append("</name>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("<alias>");
                    String _alias_1 = cache.getAlias();
                    _builder.append(_alias_1, "	");
                    _builder.append("</alias>");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public static CharSequence doGenerateFTP() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<module>");
    _builder.append("</module>");
    _builder.newLine();
    _builder.append("<package>");
    _builder.append("</package>");
    _builder.newLine();
    _builder.append("<name>");
    _builder.append("</name>");
    _builder.newLine();
    _builder.append("<alias>");
    _builder.append("</alias>");
    _builder.newLine();
    _builder.append("\t ");
    _builder.newLine();
    return _builder;
  }
}
