package com.isb.vega.externalization.generator.xml;

import com.google.common.base.Objects;
import dependencies.Levels;
import dependencies.LogLevel;
import java.util.List;
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
            {
              boolean _and = false;
              String _propagationPriority = loglevel.getPropagationPriority();
              boolean _notEquals = (!Objects.equal(_propagationPriority, null));
              if (!_notEquals) {
                _and = false;
              } else {
                String _propagationPriority_1 = loglevel.getPropagationPriority();
                boolean _equals_2 = _propagationPriority_1.equals("");
                boolean _not = (!_equals_2);
                _and = (_notEquals && _not);
              }
              if (_and) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<propagation priority=\"");
                String _propagationPriority_2 = loglevel.getPropagationPriority();
                _builder.append(_propagationPriority_2, "		");
                _builder.append("\">");
                String _propagation = loglevel.getPropagation();
                _builder.append(_propagation, "		");
                _builder.append("</propagation>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<propagation/>");
                _builder.newLine();
              }
            }
            {
              boolean _and_1 = false;
              EList<Levels> _eLevels = loglevel.getELevels();
              boolean _notEquals_1 = (!Objects.equal(_eLevels, null));
              if (!_notEquals_1) {
                _and_1 = false;
              } else {
                EList<Levels> _eLevels_1 = loglevel.getELevels();
                int _size = _eLevels_1.size();
                boolean _notEquals_2 = (_size != 0);
                _and_1 = (_notEquals_1 && _notEquals_2);
              }
              if (_and_1) {
                {
                  EList<Levels> _eLevels_2 = loglevel.getELevels();
                  for(final Levels levels : _eLevels_2) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<level priority=\"");
                    String _levelPriority = loglevel.getLevelPriority();
                    _builder.append(_levelPriority, "		");
                    _builder.append("\">");
                    String _nameLevel = levels.getNameLevel();
                    _builder.append(_nameLevel, "		");
                    _builder.append("</level>");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<level/>");
                _builder.newLine();
              }
            }
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
  
  public static CharSequence doGenerateJMS(final List<String> listPort, final List<String> listModules) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<jmsTransactionals>");
    _builder.newLine();
    {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(listPort, null));
      if (!_notEquals) {
        _and = false;
      } else {
        int _size = listPort.size();
        boolean _notEquals_1 = (_size != 0);
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        _builder.append("\t");
        _builder.append("<listenerPorts>");
        _builder.newLine();
        {
          for(final String port : listPort) {
            {
              boolean _and_1 = false;
              boolean _notEquals_2 = (!Objects.equal(port, null));
              if (!_notEquals_2) {
                _and_1 = false;
              } else {
                boolean _equals = port.equals("");
                boolean _not = (!_equals);
                _and_1 = (_notEquals_2 && _not);
              }
              if (_and_1) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<portName>");
                _builder.append(port, "		");
                _builder.append("</portName>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<portName/>");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("</listenerPorts>");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("</listenerPorts>");
        _builder.newLine();
      }
    }
    {
      boolean _and_2 = false;
      boolean _notEquals_3 = (!Objects.equal(listModules, null));
      if (!_notEquals_3) {
        _and_2 = false;
      } else {
        int _size_1 = listModules.size();
        boolean _notEquals_4 = (_size_1 != 0);
        _and_2 = (_notEquals_3 && _notEquals_4);
      }
      if (_and_2) {
        _builder.append("\t");
        _builder.append("<jmsModules>");
        _builder.newLine();
        {
          for(final String module : listModules) {
            {
              boolean _and_3 = false;
              boolean _notEquals_5 = (!Objects.equal(module, null));
              if (!_notEquals_5) {
                _and_3 = false;
              } else {
                boolean _equals_1 = module.equals("");
                boolean _not_1 = (!_equals_1);
                _and_3 = (_notEquals_5 && _not_1);
              }
              if (_and_3) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<jmsTransactional>");
                _builder.append(module, "		");
                _builder.append("</jmsTransactional>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<jmsTransactional/>");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("</jmsModules>");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("</jmsModules>");
        _builder.newLine();
      }
    }
    _builder.append("</jmsTransactionals>\t\t");
    _builder.newLine();
    return _builder;
  }
}
