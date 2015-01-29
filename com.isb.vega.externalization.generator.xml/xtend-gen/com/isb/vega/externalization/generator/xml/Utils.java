package com.isb.vega.externalization.generator.xml;

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
