package com.isb.vega.externalization.generator.xml;

import com.google.common.base.Objects;
import com.isb.vega.externalization.generator.xml.GetInternalOperationFacadeModel;
import com.isb.vega.externalization.generator.xml.Utils;
import dependencies.Ensamblado;
import dependencies.OI;
import dependencies.Webservice;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class WebServiceStates {
  public static CharSequence doGenerateWebServiceStates(final Ensamblado ensamblado) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<webServiceStates>");
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
            EList<Webservice> listWS = internalOper.getEWebService();
            _builder.newLineIfNotEmpty();
            {
              boolean _and_1 = false;
              boolean _notEquals_2 = (!Objects.equal(listWS, null));
              if (!_notEquals_2) {
                _and_1 = false;
              } else {
                final EList<Webservice> _converted_listWS = (EList<Webservice>)listWS;
                int _length_1 = ((Object[])Conversions.unwrapArray(_converted_listWS, Object.class)).length;
                boolean _notEquals_3 = (_length_1 != 0);
                _and_1 = (_notEquals_2 && _notEquals_3);
              }
              if (_and_1) {
                {
                  for(final Webservice ws : listWS) {
                    _builder.append("\t\t");
                    _builder.append("<webServiceState>");
                    _builder.newLine();
                    _builder.append("\t\t");
                    _builder.append("\t");
                    String _state = ws.getState();
                    CharSequence _doGenerateFieldStatesHead = Utils.doGenerateFieldStatesHead(internalOper, _state);
                    _builder.append(_doGenerateFieldStatesHead, "			");
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _and_2 = false;
                      String _alias = ws.getAlias();
                      boolean _notEquals_4 = (!Objects.equal(_alias, null));
                      if (!_notEquals_4) {
                        _and_2 = false;
                      } else {
                        String _alias_1 = ws.getAlias();
                        String _string = _alias_1.toString();
                        boolean _equals = _string.equals("");
                        boolean _not = (!_equals);
                        _and_2 = (_notEquals_4 && _not);
                      }
                      if (_and_2) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<alias>");
                        String _alias_2 = ws.getAlias();
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
                      String _transport = ws.getTransport();
                      boolean _notEquals_5 = (!Objects.equal(_transport, null));
                      if (!_notEquals_5) {
                        _and_3 = false;
                      } else {
                        String _transport_1 = ws.getTransport();
                        String _string_1 = _transport_1.toString();
                        boolean _equals_1 = _string_1.equals("");
                        boolean _not_1 = (!_equals_1);
                        _and_3 = (_notEquals_5 && _not_1);
                      }
                      if (_and_3) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<transport>");
                        String _transport_2 = ws.getTransport();
                        _builder.append(_transport_2, "			");
                        _builder.append("</transport>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<transport/>");
                        _builder.newLine();
                      }
                    }
                    {
                      boolean _and_4 = false;
                      String _synchrony = ws.getSynchrony();
                      boolean _notEquals_6 = (!Objects.equal(_synchrony, null));
                      if (!_notEquals_6) {
                        _and_4 = false;
                      } else {
                        String _synchrony_1 = ws.getSynchrony();
                        String _string_2 = _synchrony_1.toString();
                        boolean _equals_2 = _string_2.equals("");
                        boolean _not_2 = (!_equals_2);
                        _and_4 = (_notEquals_6 && _not_2);
                      }
                      if (_and_4) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<synchrony>");
                        String _synchrony_2 = ws.getSynchrony();
                        _builder.append(_synchrony_2, "			");
                        _builder.append("</synchrony>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<synchrony/>");
                        _builder.newLine();
                      }
                    }
                    {
                      boolean _and_5 = false;
                      String _wsdl = ws.getWsdl();
                      boolean _notEquals_7 = (!Objects.equal(_wsdl, null));
                      if (!_notEquals_7) {
                        _and_5 = false;
                      } else {
                        String _wsdl_1 = ws.getWsdl();
                        String _string_3 = _wsdl_1.toString();
                        boolean _equals_3 = _string_3.equals("");
                        boolean _not_3 = (!_equals_3);
                        _and_5 = (_notEquals_7 && _not_3);
                      }
                      if (_and_5) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<wsdl>");
                        String _wsdl_2 = ws.getWsdl();
                        _builder.append(_wsdl_2, "			");
                        _builder.append("</wsdl>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<wsdl/>");
                        _builder.newLine();
                      }
                    }
                    {
                      boolean _and_6 = false;
                      String _wsOp = ws.getWsOp();
                      boolean _notEquals_8 = (!Objects.equal(_wsOp, null));
                      if (!_notEquals_8) {
                        _and_6 = false;
                      } else {
                        String _wsOp_1 = ws.getWsOp();
                        String _string_4 = _wsOp_1.toString();
                        boolean _equals_4 = _string_4.equals("");
                        boolean _not_4 = (!_equals_4);
                        _and_6 = (_notEquals_8 && _not_4);
                      }
                      if (_and_6) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<wsOp>");
                        String _wsOp_2 = ws.getWsOp();
                        _builder.append(_wsOp_2, "			");
                        _builder.append("</wsOp>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<wsOp/>");
                        _builder.newLine();
                      }
                    }
                    {
                      boolean _and_7 = false;
                      String _namespace = ws.getNamespace();
                      boolean _notEquals_9 = (!Objects.equal(_namespace, null));
                      if (!_notEquals_9) {
                        _and_7 = false;
                      } else {
                        String _namespace_1 = ws.getNamespace();
                        String _string_5 = _namespace_1.toString();
                        boolean _equals_5 = _string_5.equals("");
                        boolean _not_5 = (!_equals_5);
                        _and_7 = (_notEquals_9 && _not_5);
                      }
                      if (_and_7) {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<namespace>");
                        String _namespace_2 = ws.getNamespace();
                        _builder.append(_namespace_2, "			");
                        _builder.append("</namespace>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("<namespace/>");
                        _builder.newLine();
                      }
                    }
                    _builder.append("\t\t");
                    _builder.append("</webServiceState>");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
      } else {
        _builder.append("\t\t");
        _builder.append("<webServiceState/>");
        _builder.newLine();
      }
    }
    _builder.append("</webServiceStates>");
    _builder.newLine();
    return _builder;
  }
}
