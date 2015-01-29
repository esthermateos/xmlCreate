package com.isb.vega.externalization.generator.xml;

import com.isb.vega.externalization.generator.xml.LogLevelDefinitions;
import com.isb.vega.externalization.generator.xml.MultisCategories;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AssemblyXML {
  public static CharSequence doGenerateAssembly() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<assembly defaultBankChannel=\"");
    _builder.append("\" name=\"");
    _builder.append("\"> ");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _doGenerateLogLevel = LogLevelDefinitions.doGenerateLogLevel();
    _builder.append(_doGenerateLogLevel, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<assemblySecurity>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<authenticationEnabled>");
    _builder.append("</assemblySecurity>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<uploadUsunotes>");
    _builder.append("</uploadUsunotes>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<externalEntityAlias>");
    _builder.append("</externalEntityAlias>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<codedPassword>");
    _builder.append("</codedPassword>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<aebMultis>");
    _builder.append("</aebMultis>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</assemblySecurity>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<aebMultis>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<mode/>");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _doGenerateMultiCategories = MultisCategories.doGenerateMultiCategories();
    _builder.append(_doGenerateMultiCategories, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</aebMultis>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<jmsTransactionals>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<listenerPorts/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<jmsModules/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</jmsTransactionals>");
    _builder.newLine();
    _builder.append("</assembly>");
    _builder.newLine();
    return _builder;
  }
}
