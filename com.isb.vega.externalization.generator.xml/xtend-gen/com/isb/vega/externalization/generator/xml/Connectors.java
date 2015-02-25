package com.isb.vega.externalization.generator.xml;

import com.google.common.base.Objects;
import com.isb.vega.externalization.generator.xml.GetInternalOperationFacadeModel;
import com.isb.vega.externalization.generator.xml.Utils;
import dependencies.Altair;
import dependencies.BBOO;
import dependencies.Ensamblado;
import dependencies.HOST;
import dependencies.OI;
import dependencies.OP;
import dependencies.SAT;
import dependencies.SATLogicalChannel;
import dependencies.SATPhysicalChannel;
import dependencies.Siebel;
import dependencies.Tp;
import dependencies.TrxOP;
import dependencies.TrxOPLogicalChannel;
import dependencies.TrxOPPhysicalChannel;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class Connectors {
  public static CharSequence doGenerateTrxOP(final Ensamblado ensamblado) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    EList<OP> ops = ensamblado.getEOP();
    _builder.newLineIfNotEmpty();
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
            EList<TrxOPLogicalChannel> _eOPLogicalChannel = host.getEOPLogicalChannel();
            boolean _notEquals_5 = (!Objects.equal(_eOPLogicalChannel, null));
            _or_1 = (_or_2 || _notEquals_5);
          }
          if (_or_1) {
            _or = true;
          } else {
            EList<TrxOPPhysicalChannel> _ePhysicalChannel = host.getEPhysicalChannel();
            boolean _notEquals_6 = (!Objects.equal(_ePhysicalChannel, null));
            _or = (_or_1 || _notEquals_6);
          }
          if (_or) {
            _builder.append("<trxOp>");
            _builder.newLine();
            {
              boolean _and = false;
              String _trxprotocol_1 = host.getTrxprotocol();
              boolean _notEquals_7 = (!Objects.equal(_trxprotocol_1, null));
              if (!_notEquals_7) {
                _and = false;
              } else {
                String _trxprotocol_2 = host.getTrxprotocol();
                String _string = _trxprotocol_2.toString();
                boolean _equals = _string.equals("");
                boolean _not = (!_equals);
                _and = (_notEquals_7 && _not);
              }
              if (_and) {
                _builder.append("\t");
                _builder.append("<trxOpProtocol>");
                String _trxprotocol_3 = host.getTrxprotocol();
                String _string_1 = _trxprotocol_3.toString();
                _builder.append(_string_1, "	");
                _builder.append("</trxOpProtocol>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<trxOpProtocol/>");
                _builder.newLine();
              }
            }
            {
              boolean _and_1 = false;
              String _trxOPDefaultMode_1 = host.getTrxOPDefaultMode();
              boolean _notEquals_8 = (!Objects.equal(_trxOPDefaultMode_1, null));
              if (!_notEquals_8) {
                _and_1 = false;
              } else {
                String _trxOPDefaultMode_2 = host.getTrxOPDefaultMode();
                String _string_2 = _trxOPDefaultMode_2.toString();
                boolean _equals_1 = _string_2.equals("");
                boolean _not_1 = (!_equals_1);
                _and_1 = (_notEquals_8 && _not_1);
              }
              if (_and_1) {
                _builder.append("\t");
                _builder.append("<trxOpDefaultMode>");
                String _trxOPDefaultMode_3 = host.getTrxOPDefaultMode();
                String _string_3 = _trxOPDefaultMode_3.toString();
                _builder.append(_string_3, "	");
                _builder.append("</trxOpDefaultMode>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<trxOpDefaultMode/>");
                _builder.newLine();
              }
            }
            {
              boolean _and_2 = false;
              String _redProtocol_1 = host.getRedProtocol();
              boolean _notEquals_9 = (!Objects.equal(_redProtocol_1, null));
              if (!_notEquals_9) {
                _and_2 = false;
              } else {
                String _redProtocol_2 = host.getRedProtocol();
                String _string_4 = _redProtocol_2.toString();
                boolean _equals_2 = _string_4.equals("");
                boolean _not_2 = (!_equals_2);
                _and_2 = (_notEquals_9 && _not_2);
              }
              if (_and_2) {
                _builder.append("\t");
                _builder.append("<trxOpRedGProtocol>");
                String _redProtocol_3 = host.getRedProtocol();
                String _string_5 = _redProtocol_3.toString();
                _builder.append(_string_5, "	");
                _builder.append("</trxOpRedGProtocol>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<trxOpRedGProtocol/>");
                _builder.newLine();
              }
            }
            {
              boolean _and_3 = false;
              String _trxOPTCPAlias_1 = host.getTrxOPTCPAlias();
              boolean _notEquals_10 = (!Objects.equal(_trxOPTCPAlias_1, null));
              if (!_notEquals_10) {
                _and_3 = false;
              } else {
                String _trxOPTCPAlias_2 = host.getTrxOPTCPAlias();
                String _string_6 = _trxOPTCPAlias_2.toString();
                boolean _equals_3 = _string_6.equals("");
                boolean _not_3 = (!_equals_3);
                _and_3 = (_notEquals_10 && _not_3);
              }
              if (_and_3) {
                _builder.append("\t");
                _builder.append("<trxOpTCPAlias>");
                String _trxOPTCPAlias_3 = host.getTrxOPTCPAlias();
                String _string_7 = _trxOPTCPAlias_3.toString();
                _builder.append(_string_7, "	");
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
            EList<TrxOPLogicalChannel> logicalChannels = host.getEOPLogicalChannel();
            _builder.newLineIfNotEmpty();
            {
              boolean _notEquals_11 = (!Objects.equal(logicalChannels, null));
              if (_notEquals_11) {
                {
                  for(final TrxOPLogicalChannel logicalChannel : logicalChannels) {
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
            EList<TrxOPPhysicalChannel> pyshicalChannels = host.getEPhysicalChannel();
            _builder.newLineIfNotEmpty();
            {
              boolean _notEquals_12 = (!Objects.equal(pyshicalChannels, null));
              if (_notEquals_12) {
                {
                  for(final TrxOPPhysicalChannel pyshicalChannel : pyshicalChannels) {
                    _builder.append("\t\t");
                    _builder.append("<trxOpPyshicalChannel name=\"");
                    String _name_1 = pyshicalChannel.getName();
                    _builder.append(_name_1, "		");
                    _builder.append("\">");
                    String _value_1 = pyshicalChannel.getValue();
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
            List<OI> listaOI = GetInternalOperationFacadeModel.getTotalInternalOperations(ensamblado);
            _builder.newLineIfNotEmpty();
            {
              boolean _and_4 = false;
              boolean _notEquals_13 = (!Objects.equal(listaOI, null));
              if (!_notEquals_13) {
                _and_4 = false;
              } else {
                final List<OI> _converted_listaOI = (List<OI>)listaOI;
                int _length = ((Object[])Conversions.unwrapArray(_converted_listaOI, Object.class)).length;
                boolean _notEquals_14 = (_length != 0);
                _and_4 = (_notEquals_13 && _notEquals_14);
              }
              if (_and_4) {
                {
                  for(final OI internalOper : listaOI) {
                    _builder.append("\t\t");
                    EList<TrxOP> listTrx = internalOper.getETrxOP();
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _and_5 = false;
                      boolean _notEquals_15 = (!Objects.equal(listTrx, null));
                      if (!_notEquals_15) {
                        _and_5 = false;
                      } else {
                        final EList<TrxOP> _converted_listTrx = (EList<TrxOP>)listTrx;
                        int _length_1 = ((Object[])Conversions.unwrapArray(_converted_listTrx, Object.class)).length;
                        boolean _notEquals_16 = (_length_1 != 0);
                        _and_5 = (_notEquals_15 && _notEquals_16);
                      }
                      if (_and_5) {
                        {
                          for(final TrxOP trxop : listTrx) {
                            _builder.append("\t\t");
                            _builder.append("<trxOpState>");
                            _builder.newLine();
                            _builder.append("\t\t");
                            _builder.append("\t");
                            String _state = trxop.getState();
                            CharSequence _doGenerateFieldStatesHead = Utils.doGenerateFieldStatesHead(internalOper, _state);
                            _builder.append(_doGenerateFieldStatesHead, "			");
                            _builder.newLineIfNotEmpty();
                            {
                              boolean _and_6 = false;
                              String _transaction = trxop.getTransaction();
                              boolean _notEquals_17 = (!Objects.equal(_transaction, null));
                              if (!_notEquals_17) {
                                _and_6 = false;
                              } else {
                                String _transaction_1 = trxop.getTransaction();
                                String _string_8 = _transaction_1.toString();
                                boolean _equals_4 = _string_8.equals("");
                                boolean _not_4 = (!_equals_4);
                                _and_6 = (_notEquals_17 && _not_4);
                              }
                              if (_and_6) {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<transaction>");
                                String _transaction_2 = trxop.getTransaction();
                                _builder.append(_transaction_2, "			");
                                _builder.append("</transaction>");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<transaction/>");
                                _builder.newLine();
                              }
                            }
                            {
                              boolean _and_7 = false;
                              String _operation = trxop.getOperation();
                              boolean _notEquals_18 = (!Objects.equal(_operation, null));
                              if (!_notEquals_18) {
                                _and_7 = false;
                              } else {
                                String _version = trxop.getVersion();
                                String _string_9 = _version.toString();
                                boolean _equals_5 = _string_9.equals("");
                                boolean _not_5 = (!_equals_5);
                                _and_7 = (_notEquals_18 && _not_5);
                              }
                              if (_and_7) {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<operation>");
                                String _operation_1 = trxop.getOperation();
                                _builder.append(_operation_1, "			");
                                _builder.append("</operation>");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<operation/>");
                                _builder.newLine();
                              }
                            }
                            {
                              boolean _and_8 = false;
                              String _version_1 = trxop.getVersion();
                              boolean _notEquals_19 = (!Objects.equal(_version_1, null));
                              if (!_notEquals_19) {
                                _and_8 = false;
                              } else {
                                String _version_2 = trxop.getVersion();
                                String _string_10 = _version_2.toString();
                                boolean _equals_6 = _string_10.equals("");
                                boolean _not_6 = (!_equals_6);
                                _and_8 = (_notEquals_19 && _not_6);
                              }
                              if (_and_8) {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<version>");
                                String _version_3 = trxop.getVersion();
                                _builder.append(_version_3, "			");
                                _builder.append("</version>");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<version/>");
                                _builder.newLine();
                              }
                            }
                            {
                              boolean _and_9 = false;
                              String _alias = trxop.getAlias();
                              boolean _notEquals_20 = (!Objects.equal(_alias, null));
                              if (!_notEquals_20) {
                                _and_9 = false;
                              } else {
                                String _alias_1 = trxop.getAlias();
                                String _string_11 = _alias_1.toString();
                                boolean _equals_7 = _string_11.equals("");
                                boolean _not_7 = (!_equals_7);
                                _and_9 = (_notEquals_20 && _not_7);
                              }
                              if (_and_9) {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<alias>");
                                String _alias_2 = trxop.getAlias();
                                _builder.append(_alias_2, "			");
                                _builder.append("</alias>");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<alias/>");
                                _builder.newLine();
                              }
                            }
                            {
                              boolean _and_10 = false;
                              String _protocol = trxop.getProtocol();
                              boolean _notEquals_21 = (!Objects.equal(_protocol, null));
                              if (!_notEquals_21) {
                                _and_10 = false;
                              } else {
                                String _protocol_1 = trxop.getProtocol();
                                String _string_12 = _protocol_1.toString();
                                boolean _equals_8 = _string_12.equals("");
                                boolean _not_8 = (!_equals_8);
                                _and_10 = (_notEquals_21 && _not_8);
                              }
                              if (_and_10) {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<protocol>");
                                String _protocol_2 = trxop.getProtocol();
                                _builder.append(_protocol_2, "			");
                                _builder.append("</protocol>");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<protocol/>");
                                _builder.newLine();
                              }
                            }
                            {
                              boolean _and_11 = false;
                              String _transactionMode = trxop.getTransactionMode();
                              boolean _notEquals_22 = (!Objects.equal(_transactionMode, null));
                              if (!_notEquals_22) {
                                _and_11 = false;
                              } else {
                                String _transactionMode_1 = trxop.getTransactionMode();
                                String _string_13 = _transactionMode_1.toString();
                                boolean _equals_9 = _string_13.equals("");
                                boolean _not_9 = (!_equals_9);
                                _and_11 = (_notEquals_22 && _not_9);
                              }
                              if (_and_11) {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<transactionMode>");
                                String _transactionMode_2 = trxop.getTransactionMode();
                                _builder.append(_transactionMode_2, "			");
                                _builder.append("</transactionMode>");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<transactionMode/>");
                                _builder.newLine();
                              }
                            }
                            _builder.append("\t\t");
                            _builder.append("</trxOpState>");
                            _builder.newLine();
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                _builder.append("\t\t");
                _builder.append("<trxOpState/>");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("</trxOpStates>");
            _builder.newLine();
            _builder.append("</trxOp>");
            _builder.newLine();
          } else {
            _builder.append("<trxOp>");
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
        _builder.append("<trxOp>");
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
              boolean _and = false;
              String _satProtocol_1 = host.getSatProtocol();
              boolean _notEquals_8 = (!Objects.equal(_satProtocol_1, null));
              if (!_notEquals_8) {
                _and = false;
              } else {
                String _satProtocol_2 = host.getSatProtocol();
                String _string = _satProtocol_2.toString();
                boolean _equals = _string.equals("");
                boolean _not = (!_equals);
                _and = (_notEquals_8 && _not);
              }
              if (_and) {
                _builder.append("\t");
                _builder.append("<satProtocol>");
                String _satProtocol_3 = host.getSatProtocol();
                _builder.append(_satProtocol_3, "	");
                _builder.append("</satProtocol>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<satProtocol/>");
                _builder.newLine();
              }
            }
            {
              boolean _and_1 = false;
              String _satAlias_1 = host.getSatAlias();
              boolean _notEquals_9 = (!Objects.equal(_satAlias_1, null));
              if (!_notEquals_9) {
                _and_1 = false;
              } else {
                String _satAlias_2 = host.getSatAlias();
                String _string_1 = _satAlias_2.toString();
                boolean _equals_1 = _string_1.equals("");
                boolean _not_1 = (!_equals_1);
                _and_1 = (_notEquals_9 && _not_1);
              }
              if (_and_1) {
                _builder.append("\t");
                _builder.append("<satAlias>");
                String _satAlias_3 = host.getSatAlias();
                _builder.append(_satAlias_3, "	");
                _builder.append("</satAlias>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<satAlias/>");
                _builder.newLine();
              }
            }
            {
              boolean _and_2 = false;
              String _satTimeOut_1 = host.getSatTimeOut();
              boolean _notEquals_10 = (!Objects.equal(_satTimeOut_1, null));
              if (!_notEquals_10) {
                _and_2 = false;
              } else {
                String _satTimeOut_2 = host.getSatTimeOut();
                String _string_2 = _satTimeOut_2.toString();
                boolean _equals_2 = _string_2.equals("");
                boolean _not_2 = (!_equals_2);
                _and_2 = (_notEquals_10 && _not_2);
              }
              if (_and_2) {
                _builder.append("\t");
                _builder.append("<satTimeOut>");
                String _satTimeOut_3 = host.getSatTimeOut();
                _builder.append(_satTimeOut_3, "	");
                _builder.append("</satTimeOut>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<satTimeOut/>");
                _builder.newLine();
              }
            }
            {
              boolean _and_3 = false;
              String _satNullValues_1 = host.getSatNullValues();
              boolean _notEquals_11 = (!Objects.equal(_satNullValues_1, null));
              if (!_notEquals_11) {
                _and_3 = false;
              } else {
                String _satNullValues_2 = host.getSatNullValues();
                String _string_3 = _satNullValues_2.toString();
                boolean _equals_3 = _string_3.equals("");
                boolean _not_3 = (!_equals_3);
                _and_3 = (_notEquals_11 && _not_3);
              }
              if (_and_3) {
                _builder.append("\t");
                _builder.append("<satNullValues>");
                String _satNullValues_3 = host.getSatNullValues();
                _builder.append(_satNullValues_3, "	");
                _builder.append("</satNullValues>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<satNullValues/>");
                _builder.newLine();
              }
            }
            {
              boolean _and_4 = false;
              String _satNullWhenSpaces_1 = host.getSatNullWhenSpaces();
              boolean _notEquals_12 = (!Objects.equal(_satNullWhenSpaces_1, null));
              if (!_notEquals_12) {
                _and_4 = false;
              } else {
                String _satNullWhenSpaces_2 = host.getSatNullWhenSpaces();
                String _string_4 = _satNullWhenSpaces_2.toString();
                boolean _equals_4 = _string_4.equals("");
                boolean _not_4 = (!_equals_4);
                _and_4 = (_notEquals_12 && _not_4);
              }
              if (_and_4) {
                _builder.append("\t");
                _builder.append("<satNullWhenSpaces>");
                String _satNullWhenSpaces_3 = host.getSatNullWhenSpaces();
                _builder.append(_satNullWhenSpaces_3, "	");
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
            _builder.append("\t");
            List<OI> listaOI = GetInternalOperationFacadeModel.getTotalInternalOperations(ensamblado);
            _builder.newLineIfNotEmpty();
            {
              boolean _and_5 = false;
              boolean _notEquals_15 = (!Objects.equal(listaOI, null));
              if (!_notEquals_15) {
                _and_5 = false;
              } else {
                final List<OI> _converted_listaOI = (List<OI>)listaOI;
                int _length = ((Object[])Conversions.unwrapArray(_converted_listaOI, Object.class)).length;
                boolean _notEquals_16 = (_length != 0);
                _and_5 = (_notEquals_15 && _notEquals_16);
              }
              if (_and_5) {
                {
                  for(final OI internalOper : listaOI) {
                    _builder.append("\t\t");
                    EList<SAT> listSat = internalOper.getESAT();
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _and_6 = false;
                      boolean _notEquals_17 = (!Objects.equal(listSat, null));
                      if (!_notEquals_17) {
                        _and_6 = false;
                      } else {
                        final EList<SAT> _converted_listSat = (EList<SAT>)listSat;
                        int _length_1 = ((Object[])Conversions.unwrapArray(_converted_listSat, Object.class)).length;
                        boolean _notEquals_18 = (_length_1 != 0);
                        _and_6 = (_notEquals_17 && _notEquals_18);
                      }
                      if (_and_6) {
                        {
                          for(final SAT sat : listSat) {
                            _builder.append("\t\t");
                            _builder.append("<satState>");
                            _builder.newLine();
                            _builder.append("\t\t");
                            _builder.append("\t");
                            String _state = sat.getState();
                            CharSequence _doGenerateFieldStatesHead = Utils.doGenerateFieldStatesHead(internalOper, _state);
                            _builder.append(_doGenerateFieldStatesHead, "			");
                            _builder.newLineIfNotEmpty();
                            {
                              boolean _and_7 = false;
                              String _satName = sat.getSatName();
                              boolean _notEquals_19 = (!Objects.equal(_satName, null));
                              if (!_notEquals_19) {
                                _and_7 = false;
                              } else {
                                String _satName_1 = sat.getSatName();
                                String _string_5 = _satName_1.toString();
                                boolean _equals_5 = _string_5.equals("");
                                boolean _not_5 = (!_equals_5);
                                _and_7 = (_notEquals_19 && _not_5);
                              }
                              if (_and_7) {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<satName>");
                                String _satName_2 = sat.getSatName();
                                _builder.append(_satName_2, "			");
                                _builder.append("</satName>");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<satName/>");
                                _builder.newLine();
                              }
                            }
                            _builder.append("\t\t");
                            _builder.append("\t");
                            String _version = sat.getVersion();
                            String _alias = sat.getAlias();
                            String _mode = sat.getMode();
                            CharSequence _doGenerateFieldStatesFoot = Utils.doGenerateFieldStatesFoot(_version, _alias, _mode);
                            _builder.append(_doGenerateFieldStatesFoot, "			");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("</satState>");
                            _builder.newLine();
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                _builder.append("\t\t");
                _builder.append("<satState/>");
                _builder.newLine();
              }
            }
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
              boolean _and = false;
              String _altairProtocol_1 = host.getAltairProtocol();
              boolean _notEquals_3 = (!Objects.equal(_altairProtocol_1, null));
              if (!_notEquals_3) {
                _and = false;
              } else {
                String _altairProtocol_2 = host.getAltairProtocol();
                boolean _equals = _altairProtocol_2.equals("");
                boolean _not = (!_equals);
                _and = (_notEquals_3 && _not);
              }
              if (_and) {
                _builder.append("\t");
                _builder.append("<altairProtocol>");
                String _altairProtocol_3 = host.getAltairProtocol();
                _builder.append(_altairProtocol_3, "	");
                _builder.append("</altairProtocol>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("<altairProtocol/>");
                _builder.newLine();
              }
            }
            {
              boolean _and_1 = false;
              String _altairAlias_1 = host.getAltairAlias();
              boolean _notEquals_4 = (!Objects.equal(_altairAlias_1, null));
              if (!_notEquals_4) {
                _and_1 = false;
              } else {
                String _altairAlias_2 = host.getAltairAlias();
                boolean _equals_1 = _altairAlias_2.equals("");
                boolean _not_1 = (!_equals_1);
                _and_1 = (_notEquals_4 && _not_1);
              }
              if (_and_1) {
                _builder.append("\t");
                _builder.append("<altairAlias>");
                String _altairAlias_3 = host.getAltairAlias();
                _builder.append(_altairAlias_3, "	");
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
            _builder.append("\t");
            List<OI> listaOI = GetInternalOperationFacadeModel.getTotalInternalOperations(ensamblado);
            _builder.newLineIfNotEmpty();
            {
              boolean _and_2 = false;
              boolean _notEquals_5 = (!Objects.equal(listaOI, null));
              if (!_notEquals_5) {
                _and_2 = false;
              } else {
                final List<OI> _converted_listaOI = (List<OI>)listaOI;
                int _length = ((Object[])Conversions.unwrapArray(_converted_listaOI, Object.class)).length;
                boolean _notEquals_6 = (_length != 0);
                _and_2 = (_notEquals_5 && _notEquals_6);
              }
              if (_and_2) {
                {
                  for(final OI internalOper : listaOI) {
                    _builder.append("\t\t");
                    EList<Altair> listAltair = internalOper.getEAltair();
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _and_3 = false;
                      boolean _notEquals_7 = (!Objects.equal(listAltair, null));
                      if (!_notEquals_7) {
                        _and_3 = false;
                      } else {
                        final EList<Altair> _converted_listAltair = (EList<Altair>)listAltair;
                        int _length_1 = ((Object[])Conversions.unwrapArray(_converted_listAltair, Object.class)).length;
                        boolean _notEquals_8 = (_length_1 != 0);
                        _and_3 = (_notEquals_7 && _notEquals_8);
                      }
                      if (_and_3) {
                        {
                          for(final Altair altair : listAltair) {
                            _builder.append("\t\t");
                            _builder.append("<altairState>");
                            _builder.newLine();
                            _builder.append("\t\t");
                            _builder.append("\t");
                            String _state = altair.getState();
                            CharSequence _doGenerateFieldStatesHead = Utils.doGenerateFieldStatesHead(internalOper, _state);
                            _builder.append(_doGenerateFieldStatesHead, "			");
                            _builder.newLineIfNotEmpty();
                            {
                              boolean _and_4 = false;
                              String _transaction = altair.getTransaction();
                              boolean _notEquals_9 = (!Objects.equal(_transaction, null));
                              if (!_notEquals_9) {
                                _and_4 = false;
                              } else {
                                String _transaction_1 = altair.getTransaction();
                                boolean _equals_2 = _transaction_1.equals("");
                                boolean _not_2 = (!_equals_2);
                                _and_4 = (_notEquals_9 && _not_2);
                              }
                              if (_and_4) {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<transaction>");
                                String _transaction_2 = altair.getTransaction();
                                _builder.append(_transaction_2, "			");
                                _builder.append("</transaction>");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("<transaction/>");
                                _builder.newLine();
                              }
                            }
                            _builder.append("\t\t");
                            _builder.append("\t");
                            String _version = altair.getVersion();
                            String _alias = altair.getAlias();
                            String _mode = altair.getMode();
                            CharSequence _doGenerateFieldStatesFoot = Utils.doGenerateFieldStatesFoot(_version, _alias, _mode);
                            _builder.append(_doGenerateFieldStatesFoot, "			");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("</altairState>");
                            _builder.newLine();
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                _builder.append("\t\t");
                _builder.append("<altairState/>");
                _builder.newLine();
              }
            }
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
  
  public static CharSequence doGenerateBboo(final Ensamblado ensamblado) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<bboo>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<bbooStates>");
    _builder.newLine();
    _builder.append("\t");
    List<OI> listaOI = GetInternalOperationFacadeModel.getTotalInternalOperations(ensamblado);
    _builder.newLineIfNotEmpty();
    {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(listaOI, null));
      if (!_notEquals) {
        _and = false;
      } else {
        final List<OI> _converted_listaOI = (List<OI>)listaOI;
        int _length = ((Object[])Conversions.unwrapArray(_converted_listaOI, Object.class)).length;
        boolean _notEquals_1 = (_length != 0);
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        {
          for(final OI internalOper : listaOI) {
            _builder.append("\t\t");
            EList<BBOO> listBBOO = internalOper.getEBBOO();
            _builder.newLineIfNotEmpty();
            {
              boolean _and_1 = false;
              boolean _notEquals_2 = (!Objects.equal(listBBOO, null));
              if (!_notEquals_2) {
                _and_1 = false;
              } else {
                final EList<BBOO> _converted_listBBOO = (EList<BBOO>)listBBOO;
                int _length_1 = ((Object[])Conversions.unwrapArray(_converted_listBBOO, Object.class)).length;
                boolean _notEquals_3 = (_length_1 != 0);
                _and_1 = (_notEquals_2 && _notEquals_3);
              }
              if (_and_1) {
                {
                  for(final BBOO bboo : listBBOO) {
                    _builder.append("\t\t");
                    _builder.append("<bbooState>");
                    _builder.newLine();
                    _builder.append("\t\t");
                    _builder.append("\t");
                    String _state = bboo.getState();
                    CharSequence _doGenerateFieldStatesHead = Utils.doGenerateFieldStatesHead(internalOper, _state);
                    _builder.append(_doGenerateFieldStatesHead, "			");
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _and_2 = false;
                      String _alias = bboo.getAlias();
                      boolean _notEquals_4 = (!Objects.equal(_alias, null));
                      if (!_notEquals_4) {
                        _and_2 = false;
                      } else {
                        String _alias_1 = bboo.getAlias();
                        String _string = _alias_1.toString();
                        boolean _equals = _string.equals("");
                        boolean _not = (!_equals);
                        _and_2 = (_notEquals_4 && _not);
                      }
                      if (_and_2) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<alias>");
                        String _alias_2 = bboo.getAlias();
                        _builder.append(_alias_2, "			");
                        _builder.append("</alias>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<alias/>");
                        _builder.newLine();
                      }
                    }
                    {
                      boolean _and_3 = false;
                      String _document = bboo.getDocument();
                      boolean _notEquals_5 = (!Objects.equal(_document, null));
                      if (!_notEquals_5) {
                        _and_3 = false;
                      } else {
                        String _document_1 = bboo.getDocument();
                        String _string_1 = _document_1.toString();
                        boolean _equals_1 = _string_1.equals("");
                        boolean _not_1 = (!_equals_1);
                        _and_3 = (_notEquals_5 && _not_1);
                      }
                      if (_and_3) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<document>");
                        String _document_2 = bboo.getDocument();
                        _builder.append(_document_2, "			");
                        _builder.append("</document>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<document/>");
                        _builder.newLine();
                      }
                    }
                    {
                      boolean _and_4 = false;
                      String _provider = bboo.getProvider();
                      boolean _notEquals_6 = (!Objects.equal(_provider, null));
                      if (!_notEquals_6) {
                        _and_4 = false;
                      } else {
                        String _provider_1 = bboo.getProvider();
                        String _string_2 = _provider_1.toString();
                        boolean _equals_2 = _string_2.equals("");
                        boolean _not_2 = (!_equals_2);
                        _and_4 = (_notEquals_6 && _not_2);
                      }
                      if (_and_4) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<provider>");
                        String _provider_2 = bboo.getProvider();
                        _builder.append(_provider_2, "			");
                        _builder.append("</provider>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<provider/>");
                        _builder.newLine();
                      }
                    }
                    _builder.append("\t\t");
                    _builder.append("</bbooState>");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
      } else {
        _builder.append("\t\t");
        _builder.append("<bbooState/>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("</bbooStates>");
    _builder.newLine();
    _builder.append("</bboo>\t");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence doGenerateSiebel(final Ensamblado ensamblado) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<siebel>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<siebelStates>");
    _builder.newLine();
    _builder.append("\t");
    List<OI> listaOI = GetInternalOperationFacadeModel.getTotalInternalOperations(ensamblado);
    _builder.newLineIfNotEmpty();
    {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(listaOI, null));
      if (!_notEquals) {
        _and = false;
      } else {
        final List<OI> _converted_listaOI = (List<OI>)listaOI;
        int _length = ((Object[])Conversions.unwrapArray(_converted_listaOI, Object.class)).length;
        boolean _notEquals_1 = (_length != 0);
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        {
          for(final OI internalOper : listaOI) {
            _builder.append("\t\t");
            EList<Siebel> listSiebels = internalOper.getESiebel();
            _builder.newLineIfNotEmpty();
            {
              boolean _and_1 = false;
              boolean _notEquals_2 = (!Objects.equal(listSiebels, null));
              if (!_notEquals_2) {
                _and_1 = false;
              } else {
                final EList<Siebel> _converted_listSiebels = (EList<Siebel>)listSiebels;
                int _length_1 = ((Object[])Conversions.unwrapArray(_converted_listSiebels, Object.class)).length;
                boolean _notEquals_3 = (_length_1 != 0);
                _and_1 = (_notEquals_2 && _notEquals_3);
              }
              if (_and_1) {
                {
                  for(final Siebel siebel : listSiebels) {
                    _builder.append("\t\t");
                    _builder.append("<siebelState>");
                    _builder.newLine();
                    _builder.append("\t\t");
                    _builder.append("\t");
                    String _state = siebel.getState();
                    CharSequence _doGenerateFieldStatesHead = Utils.doGenerateFieldStatesHead(internalOper, _state);
                    _builder.append(_doGenerateFieldStatesHead, "			");
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _and_2 = false;
                      String _server = siebel.getServer();
                      boolean _notEquals_4 = (!Objects.equal(_server, null));
                      if (!_notEquals_4) {
                        _and_2 = false;
                      } else {
                        String _server_1 = siebel.getServer();
                        String _string = _server_1.toString();
                        boolean _equals = _string.equals("");
                        boolean _not = (!_equals);
                        _and_2 = (_notEquals_4 && _not);
                      }
                      if (_and_2) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<server>");
                        String _server_2 = siebel.getServer();
                        _builder.append(_server_2, "			");
                        _builder.append("</server>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<server/>");
                        _builder.newLine();
                      }
                    }
                    {
                      boolean _and_3 = false;
                      String _object = siebel.getObject();
                      boolean _notEquals_5 = (!Objects.equal(_object, null));
                      if (!_notEquals_5) {
                        _and_3 = false;
                      } else {
                        String _object_1 = siebel.getObject();
                        String _string_1 = _object_1.toString();
                        boolean _equals_1 = _string_1.equals("");
                        boolean _not_1 = (!_equals_1);
                        _and_3 = (_notEquals_5 && _not_1);
                      }
                      if (_and_3) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<object>");
                        String _object_2 = siebel.getObject();
                        _builder.append(_object_2, "			");
                        _builder.append("</object>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<object/>");
                        _builder.newLine();
                      }
                    }
                    {
                      boolean _and_4 = false;
                      String _request = siebel.getRequest();
                      boolean _notEquals_6 = (!Objects.equal(_request, null));
                      if (!_notEquals_6) {
                        _and_4 = false;
                      } else {
                        String _request_1 = siebel.getRequest();
                        String _string_2 = _request_1.toString();
                        boolean _equals_2 = _string_2.equals("");
                        boolean _not_2 = (!_equals_2);
                        _and_4 = (_notEquals_6 && _not_2);
                      }
                      if (_and_4) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<request>");
                        String _request_2 = siebel.getRequest();
                        _builder.append(_request_2, "			");
                        _builder.append("</request>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<request/>");
                        _builder.newLine();
                      }
                    }
                    _builder.append("\t\t");
                    _builder.append("</siebelState>");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
      } else {
        _builder.append("\t\t");
        _builder.append("<siebelStates/>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("</siebelStates>");
    _builder.newLine();
    _builder.append("</siebel>\t");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence doGenerateTp(final Ensamblado ensamblado) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tp>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<tpStates>");
    _builder.newLine();
    _builder.append("\t");
    List<OI> listaOI = GetInternalOperationFacadeModel.getTotalInternalOperations(ensamblado);
    _builder.newLineIfNotEmpty();
    {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(listaOI, null));
      if (!_notEquals) {
        _and = false;
      } else {
        final List<OI> _converted_listaOI = (List<OI>)listaOI;
        int _length = ((Object[])Conversions.unwrapArray(_converted_listaOI, Object.class)).length;
        boolean _notEquals_1 = (_length != 0);
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        {
          for(final OI internalOper : listaOI) {
            _builder.append("\t\t");
            EList<Tp> listTP = internalOper.getETp();
            _builder.newLineIfNotEmpty();
            {
              boolean _and_1 = false;
              boolean _notEquals_2 = (!Objects.equal(listTP, null));
              if (!_notEquals_2) {
                _and_1 = false;
              } else {
                final EList<Tp> _converted_listTP = (EList<Tp>)listTP;
                int _length_1 = ((Object[])Conversions.unwrapArray(_converted_listTP, Object.class)).length;
                boolean _notEquals_3 = (_length_1 != 0);
                _and_1 = (_notEquals_2 && _notEquals_3);
              }
              if (_and_1) {
                {
                  for(final Tp tp : listTP) {
                    _builder.append("\t\t");
                    _builder.append("<tpState>");
                    _builder.newLine();
                    _builder.append("\t\t");
                    _builder.append("\t");
                    String _state = tp.getState();
                    CharSequence _doGenerateFieldStatesHead = Utils.doGenerateFieldStatesHead(internalOper, _state);
                    _builder.append(_doGenerateFieldStatesHead, "			");
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _and_2 = false;
                      String _code = tp.getCode();
                      boolean _notEquals_4 = (!Objects.equal(_code, null));
                      if (!_notEquals_4) {
                        _and_2 = false;
                      } else {
                        String _code_1 = tp.getCode();
                        String _string = _code_1.toString();
                        boolean _equals = _string.equals("");
                        boolean _not = (!_equals);
                        _and_2 = (_notEquals_4 && _not);
                      }
                      if (_and_2) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<code>");
                        String _code_2 = tp.getCode();
                        _builder.append(_code_2, "			");
                        _builder.append("</code>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<code/>");
                        _builder.newLine();
                      }
                    }
                    {
                      boolean _and_3 = false;
                      String _type = tp.getType();
                      boolean _notEquals_5 = (!Objects.equal(_type, null));
                      if (!_notEquals_5) {
                        _and_3 = false;
                      } else {
                        String _type_1 = tp.getType();
                        String _string_1 = _type_1.toString();
                        boolean _equals_1 = _string_1.equals("");
                        boolean _not_1 = (!_equals_1);
                        _and_3 = (_notEquals_5 && _not_1);
                      }
                      if (_and_3) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<type>");
                        String _type_2 = tp.getType();
                        _builder.append(_type_2, "			");
                        _builder.append("</type>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<type/>");
                        _builder.newLine();
                      }
                    }
                    {
                      boolean _and_4 = false;
                      String _subtype = tp.getSubtype();
                      boolean _notEquals_6 = (!Objects.equal(_subtype, null));
                      if (!_notEquals_6) {
                        _and_4 = false;
                      } else {
                        String _subtype_1 = tp.getSubtype();
                        String _string_2 = _subtype_1.toString();
                        boolean _equals_2 = _string_2.equals("");
                        boolean _not_2 = (!_equals_2);
                        _and_4 = (_notEquals_6 && _not_2);
                      }
                      if (_and_4) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<subtype>");
                        String _subtype_2 = tp.getSubtype();
                        _builder.append(_subtype_2, "			");
                        _builder.append("</subtype>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<subtype/>");
                        _builder.newLine();
                      }
                    }
                    _builder.append("\t\t");
                    _builder.append("</tpState>");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
      } else {
        _builder.append("\t\t");
        _builder.append("<tpState/>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("</tpStates>");
    _builder.newLine();
    _builder.append("</tp>");
    _builder.newLine();
    return _builder;
  }
}
