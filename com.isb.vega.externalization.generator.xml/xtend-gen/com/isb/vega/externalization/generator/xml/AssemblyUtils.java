package com.isb.vega.externalization.generator.xml;

import com.google.common.base.Objects;
import dependencies.JMS;
import dependencies.LogLevel;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class AssemblyUtils {
  public static CharSequence doGenerateLogLevel(final EList<LogLevel> loglevels) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _or = false;
      boolean _equals = Objects.equal(loglevels, null);
      if (_equals) {
        _or = true;
      } else {
        int _length = ((Object[])Conversions.unwrapArray(loglevels, Object.class)).length;
        boolean _equals_1 = (_length == 0);
        _or = (_equals || _equals_1);
      }
      if (_or) {
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
  
  public static CharSequence doGenerateJMS(final EList<JMS> listjms) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<jmsTransactionals>");
    _builder.newLine();
    _builder.append("\t");
    ArrayList<String> listPort = null;
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    ArrayList<String> listModules = null;
    _builder.newLineIfNotEmpty();
    {
      for(final JMS jms : listjms) {
        _builder.append("\t");
        String _listenerPorts = jms.getListenerPorts();
        boolean _add = listPort.add(_listenerPorts);
        _builder.append(_add, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _jmsModules = jms.getJmsModules();
        boolean _add_1 = listModules.add(_jmsModules);
        _builder.append(_add_1, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _or = false;
      boolean _notEquals = (!Objects.equal(listPort, null));
      if (_notEquals) {
        _or = true;
      } else {
        int _size = listPort.size();
        boolean _notEquals_1 = (_size != 0);
        _or = (_notEquals || _notEquals_1);
      }
      if (_or) {
        _builder.append("\t\t");
        _builder.append("<listenerPorts>");
        _builder.newLine();
        {
          for(final String port : listPort) {
            {
              boolean _and = false;
              boolean _notEquals_2 = (!Objects.equal(port, null));
              if (!_notEquals_2) {
                _and = false;
              } else {
                boolean _equals = port.equals("");
                boolean _not = (!_equals);
                _and = (_notEquals_2 && _not);
              }
              if (_and) {
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("<portName>");
                _builder.append(port, "			");
                _builder.append("</portName>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("<portName/>");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("\t\t");
        _builder.append("</listenerPorts>");
        _builder.newLine();
      } else {
        _builder.append("\t\t");
        _builder.append("</listenerPorts>");
        _builder.newLine();
      }
    }
    {
      boolean _or_1 = false;
      boolean _notEquals_3 = (!Objects.equal(listPort, null));
      if (_notEquals_3) {
        _or_1 = true;
      } else {
        int _size_1 = listPort.size();
        boolean _notEquals_4 = (_size_1 != 0);
        _or_1 = (_notEquals_3 || _notEquals_4);
      }
      if (_or_1) {
        _builder.append("\t\t");
        _builder.append("<jmsModules>");
        _builder.newLine();
        {
          for(final String module : listModules) {
            {
              boolean _and_1 = false;
              boolean _notEquals_5 = (!Objects.equal(module, null));
              if (!_notEquals_5) {
                _and_1 = false;
              } else {
                boolean _equals_1 = module.equals("");
                boolean _not_1 = (!_equals_1);
                _and_1 = (_notEquals_5 && _not_1);
              }
              if (_and_1) {
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("<jmsTransactional>");
                _builder.append(module, "			");
                _builder.append("</jmsTransactional>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("<jmsTransactional/>");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("\t\t");
        _builder.append("</jmsModules>");
        _builder.newLine();
      } else {
        _builder.append("\t\t");
        _builder.append("</jmsModules>");
        _builder.newLine();
      }
    }
    _builder.append("</jmsTransactionals>\t\t");
    _builder.newLine();
    return _builder;
  }
}
