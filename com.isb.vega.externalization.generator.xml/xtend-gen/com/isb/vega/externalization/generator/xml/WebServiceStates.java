package com.isb.vega.externalization.generator.xml;

import com.isb.vega.externalization.generator.xml.Utils;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class WebServiceStates {
  public static CharSequence doGenerateWebServiceStates() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<webServiceStates>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<webServiceState>");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _doGenerateFieldStatesHead = Utils.doGenerateFieldStatesHead();
    _builder.append(_doGenerateFieldStatesHead, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<alias>");
    _builder.append("</alias>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<transport>");
    _builder.append("</transport>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<synchrony>");
    _builder.append("</synchrony>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<wsdl>");
    _builder.append("</wsdl>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<wsOp>");
    _builder.append("</wsOp>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<namespace>");
    _builder.append("</namespace>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</webServiceState>");
    _builder.newLine();
    _builder.append("</webServiceStates>");
    _builder.newLine();
    return _builder;
  }
}
