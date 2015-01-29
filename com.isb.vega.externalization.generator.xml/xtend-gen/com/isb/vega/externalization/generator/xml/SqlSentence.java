package com.isb.vega.externalization.generator.xml;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SqlSentence {
  public static CharSequence doGenerateSqlSentence() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("<sql-sentence>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<module>");
    _builder.append("</module>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<component>");
    _builder.append("</component>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<name>");
    _builder.append("</name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<type>");
    _builder.append("</type>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<sql>");
    _builder.append("</sql>");
    _builder.newLine();
    _builder.append("</sql-sentence>");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
