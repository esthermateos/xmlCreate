package com.isb.vega.externalization.generator.xml;

import com.google.common.base.Objects;
import com.isb.vega.externalization.generator.xml.Utils;
import dependencies.Ensamblado;
import dependencies.HOST;
import dependencies.SATLogicalChannel;
import dependencies.SATPhysicalChannel;
import dependencies.trxOPLogicalChannel;
import dependencies.trxOPPhysicalChannel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Connectors {
  public static CharSequence doGenerateTrxOP(final Ensamblado ensamblado) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    HOST host = ensamblado.getEHOST();
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals = (!Objects.equal(host, null));
      if (_notEquals) {
        {
          boolean _or = false;
          boolean _or_1 = false;
          boolean _or_2 = false;
          boolean _or_3 = false;
          boolean _or_4 = false;
          String _trxprotocol = host.getTrxprotocol();
          boolean _notEquals_1 = (!Objects.equal(_trxprotocol, null));
          if (_notEquals_1) {
            _or_4 = true;
          } else {
            String _trxOPDefaultMode = host.getTrxOPDefaultMode();
            boolean _notEquals_2 = (!Objects.equal(_trxOPDefaultMode, null));
            _or_4 = (_notEquals_1 || _notEquals_2);
          }
          if (_or_4) {
            _or_3 = true;
          } else {
            String _redProtocol = host.getRedProtocol();
            boolean _notEquals_3 = (!Objects.equal(_redProtocol, null));
            _or_3 = (_or_4 || _notEquals_3);
          }
          if (_or_3) {
            _or_2 = true;
          } else {
            String _trxOPTCPAlias = host.getTrxOPTCPAlias();
            boolean _notEquals_4 = (!Objects.equal(_trxOPTCPAlias, null));
            _or_2 = (_or_3 || _notEquals_4);
          }
          if (_or_2) {
            _or_1 = true;
          } else {
            EList<trxOPLogicalChannel> _eOPLogicalChannel = host.getEOPLogicalChannel();
            boolean _notEquals_5 = (!Objects.equal(_eOPLogicalChannel, null));
            _or_1 = (_or_2 || _notEquals_5);
          }
          if (_or_1) {
            _or = true;
          } else {
            EList<trxOPPhysicalChannel> _ePhysicalChannel = host.getEPhysicalChannel();
            boolean _notEquals_6 = (!Objects.equal(_ePhysicalChannel, null));
            _or = (_or_1 || _notEquals_6);
          }
          if (_or) {
            _builder.append("<trxOP>");
            _builder.newLine();
            {
              String _trxprotocol_1 = host.getTrxprotocol();
              boolean _notEquals_7 = (!Objects.equal(_trxprotocol_1, null));
              if (_notEquals_7) {
                _builder.append("\t");
                _builder.append("<trxOpProtocol>");
                String _trxprotocol_2 = host.getTrxprotocol();
                String _string = _trxprotocol_2.toString();
                _builder.append(_string, "	");
                _builder.append("</trxOpProtocol>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<trxOpProtocol/>");
                _builder.newLine();
              }
            }
            {
              String _trxOPDefaultMode_1 = host.getTrxOPDefaultMode();
              boolean _notEquals_8 = (!Objects.equal(_trxOPDefaultMode_1, null));
              if (_notEquals_8) {
                _builder.append("\t");
                _builder.append("<trxOpDefaultMode>");
                String _trxOPDefaultMode_2 = host.getTrxOPDefaultMode();
                String _string_1 = _trxOPDefaultMode_2.toString();
                _builder.append(_string_1, "	");
                _builder.append("</trxOpDefaultMode>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<trxOpDefaultMode/>");
                _builder.newLine();
              }
            }
            {
              String _redProtocol_1 = host.getRedProtocol();
              boolean _notEquals_9 = (!Objects.equal(_redProtocol_1, null));
              if (_notEquals_9) {
                _builder.append("\t");
                _builder.append("<trxOpRedGProtocol>");
                String _redProtocol_2 = host.getRedProtocol();
                String _string_2 = _redProtocol_2.toString();
                _builder.append(_string_2, "	");
                _builder.append("</trxOpRedGProtocol>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<trxOpRedGProtocol/>");
                _builder.newLine();
              }
            }
            {
              String _trxOPTCPAlias_1 = host.getTrxOPTCPAlias();
              boolean _notEquals_10 = (!Objects.equal(_trxOPTCPAlias_1, null));
              if (_notEquals_10) {
                _builder.append("\t");
                _builder.append("<trxOpTCPAlias>");
                String _trxOPTCPAlias_2 = host.getTrxOPTCPAlias();
                String _string_3 = _trxOPTCPAlias_2.toString();
                _builder.append(_string_3, "	");
                _builder.append("</trxOpTCPAlias>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<trxOpTCPAlias/>");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("<trxOpLogicalChannels>");
            _builder.newLine();
            _builder.append("\t\t");
            EList<trxOPLogicalChannel> logicalChannels = host.getEOPLogicalChannel();
            _builder.newLineIfNotEmpty();
            {
              boolean _notEquals_11 = (!Objects.equal(logicalChannels, null));
              if (_notEquals_11) {
                {
                  for(final trxOPLogicalChannel logicalChannel : logicalChannels) {
                    _builder.append("\t\t");
                    _builder.append("<trxOpLogicalChannel name=\"");
                    String _name = logicalChannel.getName();
                    _builder.append(_name, "		");
                    _builder.append("\">");
                    String _value = logicalChannel.getValue();
                    _builder.append(_value, "		");
                    _builder.append("</trxOpLogicalChannel>");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.append("</trxOpLogicalChannels>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<trxOpPyshicalChannels>");
            _builder.newLine();
            _builder.append("\t\t");
            EList<trxOPPhysicalChannel> PyshicalChannels = host.getEPhysicalChannel();
            _builder.newLineIfNotEmpty();
            {
              boolean _notEquals_12 = (!Objects.equal(PyshicalChannels, null));
              if (_notEquals_12) {
                {
                  for(final trxOPPhysicalChannel PyshicalChannel : PyshicalChannels) {
                    _builder.append("\t\t");
                    _builder.append("<trxOpPyshicalChannel name=\"");
                    String _name_1 = PyshicalChannel.getName();
                    _builder.append(_name_1, "		");
                    _builder.append("\">");
                    String _value_1 = PyshicalChannel.getValue();
                    _builder.append(_value_1, "		");
                    _builder.append("</trxOpPyshicalChannel>");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.append("</trxOpPyshicalChannels>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<trxOpStates>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("<trxOpState>");
            _builder.newLine();
            _builder.append("\t\t\t");
            CharSequence _doGenerateFieldStatesHead = Utils.doGenerateFieldStatesHead();
            _builder.append(_doGenerateFieldStatesHead, "			");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("<transaction>");
            _builder.append("</transaction>");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("<operation>");
            _builder.append("</operation>");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("<version>");
            _builder.append("</version>");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("<alias>");
            _builder.append("</alias>");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("<protocol>");
            _builder.append("</protocol>");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("<transactionMode>");
            _builder.append("</transactionMode>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("</trxOpState>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</trxOpStates>");
            _builder.newLine();
            _builder.append("</trxOp>");
            _builder.newLine();
          } else {
            _builder.append("<trxOP>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<trxOpProtocol/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<trxOpDefaultMode/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<trxOpRedGProtocol/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<trxOpTCPAlias/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<trxOpLogicalChannels/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<trxOpPyshicalChannels/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<trxOpStates/>");
            _builder.newLine();
            _builder.append("</trxOp>");
            _builder.newLine();
          }
        }
      } else {
        _builder.append("<trxOP>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<trxOpProtocol/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<trxOpDefaultMode/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<trxOpRedGProtocol/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<trxOpTCPAlias/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<trxOpLogicalChannels/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<trxOpPyshicalChannels/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<trxOpStates/>");
        _builder.newLine();
        _builder.append("</trxOp>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public static CharSequence doGenerateSat(final Ensamblado ensamblado) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    HOST host = ensamblado.getEHOST();
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals = (!Objects.equal(host, null));
      if (_notEquals) {
        {
          boolean _or = false;
          boolean _or_1 = false;
          boolean _or_2 = false;
          boolean _or_3 = false;
          boolean _or_4 = false;
          boolean _or_5 = false;
          String _satProtocol = host.getSatProtocol();
          boolean _notEquals_1 = (!Objects.equal(_satProtocol, null));
          if (_notEquals_1) {
            _or_5 = true;
          } else {
            String _satAlias = host.getSatAlias();
            boolean _notEquals_2 = (!Objects.equal(_satAlias, null));
            _or_5 = (_notEquals_1 || _notEquals_2);
          }
          if (_or_5) {
            _or_4 = true;
          } else {
            String _satTimeOut = host.getSatTimeOut();
            boolean _notEquals_3 = (!Objects.equal(_satTimeOut, null));
            _or_4 = (_or_5 || _notEquals_3);
          }
          if (_or_4) {
            _or_3 = true;
          } else {
            String _satNullValues = host.getSatNullValues();
            boolean _notEquals_4 = (!Objects.equal(_satNullValues, null));
            _or_3 = (_or_4 || _notEquals_4);
          }
          if (_or_3) {
            _or_2 = true;
          } else {
            String _satNullWhenSpaces = host.getSatNullWhenSpaces();
            boolean _notEquals_5 = (!Objects.equal(_satNullWhenSpaces, null));
            _or_2 = (_or_3 || _notEquals_5);
          }
          if (_or_2) {
            _or_1 = true;
          } else {
            EList<SATLogicalChannel> _eSATLogicalChannel = host.getESATLogicalChannel();
            boolean _notEquals_6 = (!Objects.equal(_eSATLogicalChannel, null));
            _or_1 = (_or_2 || _notEquals_6);
          }
          if (_or_1) {
            _or = true;
          } else {
            EList<SATPhysicalChannel> _eSATPhysicalChannel = host.getESATPhysicalChannel();
            boolean _notEquals_7 = (!Objects.equal(_eSATPhysicalChannel, null));
            _or = (_or_1 || _notEquals_7);
          }
          if (_or) {
            _builder.append("<sat>");
            _builder.newLine();
            {
              String _satProtocol_1 = host.getSatProtocol();
              boolean _notEquals_8 = (!Objects.equal(_satProtocol_1, null));
              if (_notEquals_8) {
                _builder.append("\t");
                _builder.append("<satProtocol>");
                String _satProtocol_2 = host.getSatProtocol();
                _builder.append(_satProtocol_2, "	");
                _builder.append("</satProtocol>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<satProtocol/>");
                _builder.newLine();
              }
            }
            {
              String _satAlias_1 = host.getSatAlias();
              boolean _notEquals_9 = (!Objects.equal(_satAlias_1, null));
              if (_notEquals_9) {
                _builder.append("\t");
                _builder.append("<satAlias>");
                String _satAlias_2 = host.getSatAlias();
                _builder.append(_satAlias_2, "	");
                _builder.append("</satAlias>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<satAlias/>");
                _builder.newLine();
              }
            }
            {
              String _satTimeOut_1 = host.getSatTimeOut();
              boolean _notEquals_10 = (!Objects.equal(_satTimeOut_1, null));
              if (_notEquals_10) {
                _builder.append("\t");
                _builder.append("<satTimeOut>");
                String _satTimeOut_2 = host.getSatTimeOut();
                _builder.append(_satTimeOut_2, "	");
                _builder.append("</satTimeOut>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<satTimeOut/>");
                _builder.newLine();
              }
            }
            {
              String _satNullValues_1 = host.getSatNullValues();
              boolean _notEquals_11 = (!Objects.equal(_satNullValues_1, null));
              if (_notEquals_11) {
                _builder.append("\t");
                _builder.append("<satNullValues>");
                String _satNullValues_2 = host.getSatNullValues();
                _builder.append(_satNullValues_2, "	");
                _builder.append("</satNullValues>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<satNullValues/>");
                _builder.newLine();
              }
            }
            {
              String _satNullWhenSpaces_1 = host.getSatNullWhenSpaces();
              boolean _notEquals_12 = (!Objects.equal(_satNullWhenSpaces_1, null));
              if (_notEquals_12) {
                _builder.append("\t");
                _builder.append("<satNullWhenSpaces>");
                String _satNullWhenSpaces_2 = host.getSatNullWhenSpaces();
                _builder.append(_satNullWhenSpaces_2, "	");
                _builder.append("</satNullWhenSpaces>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<satNullWhenSpaces/>");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("<satLogicalChannels>");
            _builder.newLine();
            _builder.append("\t\t");
            EList<SATLogicalChannel> logicalChannels = host.getESATLogicalChannel();
            _builder.newLineIfNotEmpty();
            {
              boolean _notEquals_13 = (!Objects.equal(logicalChannels, null));
              if (_notEquals_13) {
                {
                  for(final SATLogicalChannel logicalChannel : logicalChannels) {
                    _builder.append("\t\t");
                    _builder.append("<satLogicalChannel name=\"");
                    String _name = logicalChannel.getName();
                    _builder.append(_name, "		");
                    _builder.append("\">");
                    String _value = logicalChannel.getValue();
                    _builder.append(_value, "		");
                    _builder.append("</satLogicalChannel>");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.append("</satLogicalChannels>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<satPyshicalChannels>");
            _builder.newLine();
            _builder.append("\t\t");
            EList<SATPhysicalChannel> PyshicalChannels = host.getESATPhysicalChannel();
            _builder.newLineIfNotEmpty();
            {
              boolean _notEquals_14 = (!Objects.equal(PyshicalChannels, null));
              if (_notEquals_14) {
                {
                  for(final SATPhysicalChannel PyshicalChannel : PyshicalChannels) {
                    _builder.append("\t\t");
                    _builder.append("<satPyshicalChannel name=\"");
                    String _name_1 = PyshicalChannel.getName();
                    _builder.append(_name_1, "		");
                    _builder.append("\">");
                    String _value_1 = PyshicalChannel.getValue();
                    _builder.append(_value_1, "		");
                    _builder.append("</satPyshicalChannel>");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.append("</satPyshicalChannels>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<satStates>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("<satState>");
            _builder.newLine();
            _builder.append("\t\t\t");
            CharSequence _doGenerateFieldStatesHead = Utils.doGenerateFieldStatesHead();
            _builder.append(_doGenerateFieldStatesHead, "			");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("<satName>");
            _builder.append("</satName>");
            _builder.newLine();
            _builder.append("\t\t\t");
            CharSequence _doGenerateFieldStatesFoot = Utils.doGenerateFieldStatesFoot();
            _builder.append(_doGenerateFieldStatesFoot, "			");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("</satState>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</satStates>");
            _builder.newLine();
            _builder.append("</sat>");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("<sat>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<satProtocol/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<satAlias/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<satTimeOut/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<satNullValues/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<satNullWhenSpaces/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<satLogicalChannels/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<satPyshicalChannels/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<satStates/>");
            _builder.newLine();
            _builder.append("</sat>");
            _builder.newLine();
          }
        }
      } else {
        _builder.append("<sat>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<satProtocol/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<satAlias/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<satTimeOut/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<satNullValues/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<satNullWhenSpaces/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<satLogicalChannels/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<satPyshicalChannels/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<satStates/>");
        _builder.newLine();
        _builder.append("</sat>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public static CharSequence doGenerateAltair(final Ensamblado ensamblado) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    HOST host = ensamblado.getEHOST();
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals = (!Objects.equal(host, null));
      if (_notEquals) {
        {
          boolean _or = false;
          String _altairAlias = host.getAltairAlias();
          boolean _notEquals_1 = (!Objects.equal(_altairAlias, null));
          if (_notEquals_1) {
            _or = true;
          } else {
            String _altairProtocol = host.getAltairProtocol();
            boolean _notEquals_2 = (!Objects.equal(_altairProtocol, null));
            _or = (_notEquals_1 || _notEquals_2);
          }
          if (_or) {
            _builder.append("<altair>");
            _builder.newLine();
            {
              String _altairProtocol_1 = host.getAltairProtocol();
              boolean _notEquals_3 = (!Objects.equal(_altairProtocol_1, null));
              if (_notEquals_3) {
                _builder.append("\t");
                _builder.append("<altairProtocol>");
                String _altairProtocol_2 = host.getAltairProtocol();
                _builder.append(_altairProtocol_2, "	");
                _builder.append("</altairProtocol>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<altairProtocol/>");
                _builder.newLine();
              }
            }
            {
              String _altairAlias_1 = host.getAltairAlias();
              boolean _notEquals_4 = (!Objects.equal(_altairAlias_1, null));
              if (_notEquals_4) {
                _builder.append("\t");
                _builder.append("<altairAlias>");
                String _altairAlias_2 = host.getAltairAlias();
                _builder.append(_altairAlias_2, "	");
                _builder.append("</altairAlias>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<altairAlias/>");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("<altairStates>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("<altairState>");
            _builder.newLine();
            _builder.append("\t\t\t");
            CharSequence _doGenerateFieldStatesHead = Utils.doGenerateFieldStatesHead();
            _builder.append(_doGenerateFieldStatesHead, "			");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("<transaction>");
            _builder.append("</transaction>");
            _builder.newLine();
            _builder.append("\t\t\t");
            CharSequence _doGenerateFieldStatesFoot = Utils.doGenerateFieldStatesFoot();
            _builder.append(_doGenerateFieldStatesFoot, "			");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("</altairState>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</altairStates>");
            _builder.newLine();
            _builder.append("</altair>");
            _builder.newLine();
          } else {
            _builder.append("<altair>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<altairProtocol/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<altairAlias/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<altairStates/>");
            _builder.newLine();
            _builder.append("</altair>");
            _builder.newLine();
          }
        }
      } else {
        _builder.append("<altair>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<altairProtocol/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<altairAlias/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<altairStates/>");
        _builder.newLine();
        _builder.append("</altair>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public static CharSequence doGenerateBboo() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<bboo>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<bbooStates>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<bbooState>");
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
    _builder.append("<document>");
    _builder.append("</document>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<provider>");
    _builder.append("</provider>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</bbooState>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</bbooStates>");
    _builder.newLine();
    _builder.append("</bboo>\t");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence doGenerateSiebel() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<siebel>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<siebelStates>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<siebelState>");
    _builder.newLine();
    _builder.append("\t\t\t");
    CharSequence _doGenerateFieldStatesHead = Utils.doGenerateFieldStatesHead();
    _builder.append(_doGenerateFieldStatesHead, "			");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<server>");
    _builder.append("</server>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<object>");
    _builder.append("</type>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<request>");
    _builder.append("</request>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</siebelState>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</siebelStates>");
    _builder.newLine();
    _builder.append("</siebel>\t");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence doGenerateTp() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tp>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<tpStates>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<tpState>");
    _builder.newLine();
    _builder.append("\t\t\t");
    CharSequence _doGenerateFieldStatesHead = Utils.doGenerateFieldStatesHead();
    _builder.append(_doGenerateFieldStatesHead, "			");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<code>");
    _builder.append("</code>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<type>");
    _builder.append("</type>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<subtype>");
    _builder.append("</subtype>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</tpState>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</tpStates>");
    _builder.newLine();
    _builder.append("</tp>\t");
    _builder.newLine();
    return _builder;
  }
}
