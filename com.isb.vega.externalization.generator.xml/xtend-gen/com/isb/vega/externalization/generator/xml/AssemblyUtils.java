package com.isb.vega.externalization.generator.xml;

import dependencies.JMS;
import dependencies.LogLevel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class AssemblyUtils {
  public static CharSequence doGenerateLogLevel(final EList<LogLevel> loglevels) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _length = ((Object[])Conversions.unwrapArray(loglevels, Object.class)).length;
      boolean _equals = (_length == 0);
      if (_equals) {
        _builder.append("<assemblyLogLevelsDefinitions/>");
        _builder.newLine();
      } else {
        _builder.append("<assemblyLogLevelsDefinitions>");
        _builder.newLine();
        {
          for(final LogLevel loglevel : loglevels) {
            _builder.append("\t");
            _builder.append("<category id=\"");
            String _id = loglevel.getId();
            _builder.append(_id, "	");
            _builder.append("\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<propagation priority=\"");
            String _propagationPriority = loglevel.getPropagationPriority();
            _builder.append(_propagationPriority, "		");
            _builder.append("\">");
            String _propagation = loglevel.getPropagation();
            _builder.append(_propagation, "		");
            _builder.append("</propagation>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<level priority=\"");
            String _levelPriority = loglevel.getLevelPriority();
            _builder.append(_levelPriority, "		");
            _builder.append("\">");
            String _level = loglevel.getLevel();
            _builder.append(_level, "		");
            _builder.append("</level>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("</category>");
            _builder.newLine();
          }
        }
        _builder.append("</assemblyLogLevelsDefinitions>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public static CharSequence doGenerateJMS(final JMS jms) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<jmsTransactionals>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<listenerPorts/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<jmsModules/>");
    _builder.newLine();
    _builder.append("</jmsTransactionals>");
    _builder.newLine();
    return _builder;
  }
}
