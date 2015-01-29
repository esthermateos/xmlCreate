package com.isb.vega.externalization.generator.xml;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class LogLevelDefinitions {
  public static CharSequence doGenerateLogLevel() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<assemblyLogLevelsDefinitions> ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<category id=\"");
    _builder.append("\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<propagation priority=\"");
    _builder.append("\">");
    _builder.append("</propagation>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("level priority=\"");
    _builder.append("\">");
    _builder.append("</level>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</category>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("</assemblyLogLevelsDefinitions> ");
    _builder.newLine();
    return _builder;
  }
}
