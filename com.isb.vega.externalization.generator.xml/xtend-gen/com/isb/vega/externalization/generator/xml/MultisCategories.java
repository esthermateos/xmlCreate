package com.isb.vega.externalization.generator.xml;

import com.google.common.base.Objects;
import dependencies.MultiProfile;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MultisCategories {
  public static CharSequence doGenerateMultiCategories(final MultiProfile multiProfile) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<multisCategories>");
    _builder.newLine();
    {
      boolean _and = false;
      String _catGama = multiProfile.getCatGama();
      boolean _notEquals = (!Objects.equal(_catGama, null));
      if (!_notEquals) {
        _and = false;
      } else {
        String _catGama_1 = multiProfile.getCatGama();
        String _string = _catGama_1.toString();
        boolean _equals = _string.equals("");
        boolean _not = (!_equals);
        _and = (_notEquals && _not);
      }
      if (_and) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.Gama\">");
        String _catGama_2 = multiProfile.getCatGama();
        _builder.append(_catGama_2, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _and_1 = false;
      String _catIdioma = multiProfile.getCatIdioma();
      boolean _notEquals_1 = (!Objects.equal(_catIdioma, null));
      if (!_notEquals_1) {
        _and_1 = false;
      } else {
        String _catIdioma_1 = multiProfile.getCatIdioma();
        String _string_1 = _catIdioma_1.toString();
        boolean _equals_1 = _string_1.equals("");
        boolean _not_1 = (!_equals_1);
        _and_1 = (_notEquals_1 && _not_1);
      }
      if (_and_1) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.Idioma\">");
        String _catIdioma_2 = multiProfile.getCatIdioma();
        _builder.append(_catIdioma_2, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _and_2 = false;
      String _catCompany = multiProfile.getCatCompany();
      boolean _notEquals_2 = (!Objects.equal(_catCompany, null));
      if (!_notEquals_2) {
        _and_2 = false;
      } else {
        String _catCompany_1 = multiProfile.getCatCompany();
        String _string_2 = _catCompany_1.toString();
        boolean _equals_2 = _string_2.equals("");
        boolean _not_2 = (!_equals_2);
        _and_2 = (_notEquals_2 && _not_2);
      }
      if (_and_2) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.Empresa\">");
        String _catCompany_2 = multiProfile.getCatCompany();
        _builder.append(_catCompany_2, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _and_3 = false;
      String _catCanalMarco = multiProfile.getCatCanalMarco();
      boolean _notEquals_3 = (!Objects.equal(_catCanalMarco, null));
      if (!_notEquals_3) {
        _and_3 = false;
      } else {
        String _catCanalMarco_1 = multiProfile.getCatCanalMarco();
        String _string_3 = _catCanalMarco_1.toString();
        boolean _equals_3 = _string_3.equals("");
        boolean _not_3 = (!_equals_3);
        _and_3 = (_notEquals_3 && _not_3);
      }
      if (_and_3) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.CanalMarco\">");
        String _catCanalMarco_2 = multiProfile.getCatCanalMarco();
        _builder.append(_catCanalMarco_2, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _and_4 = false;
      String _catOrden = multiProfile.getCatOrden();
      boolean _notEquals_4 = (!Objects.equal(_catOrden, null));
      if (!_notEquals_4) {
        _and_4 = false;
      } else {
        String _catOrden_1 = multiProfile.getCatOrden();
        String _string_4 = _catOrden_1.toString();
        boolean _equals_4 = _string_4.equals("");
        boolean _not_4 = (!_equals_4);
        _and_4 = (_notEquals_4 && _not_4);
      }
      if (_and_4) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.orden\">");
        String _catOrden_2 = multiProfile.getCatOrden();
        _builder.append(_catOrden_2, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _and_5 = false;
      String _catEstructura = multiProfile.getCatEstructura();
      boolean _notEquals_5 = (!Objects.equal(_catEstructura, null));
      if (!_notEquals_5) {
        _and_5 = false;
      } else {
        String _catEstructura_1 = multiProfile.getCatEstructura();
        String _string_5 = _catEstructura_1.toString();
        boolean _equals_5 = _string_5.equals("");
        boolean _not_5 = (!_equals_5);
        _and_5 = (_notEquals_5 && _not_5);
      }
      if (_and_5) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.Estructura\">");
        String _catEstructura_2 = multiProfile.getCatEstructura();
        _builder.append(_catEstructura_2, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _and_6 = false;
      String _catNivelIU = multiProfile.getCatNivelIU();
      boolean _notEquals_6 = (!Objects.equal(_catNivelIU, null));
      if (!_notEquals_6) {
        _and_6 = false;
      } else {
        String _catNivelIU_1 = multiProfile.getCatNivelIU();
        String _string_6 = _catNivelIU_1.toString();
        boolean _equals_6 = _string_6.equals("");
        boolean _not_6 = (!_equals_6);
        _and_6 = (_notEquals_6 && _not_6);
      }
      if (_and_6) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.NivelUI\">");
        String _catNivelIU_2 = multiProfile.getCatNivelIU();
        _builder.append(_catNivelIU_2, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _and_7 = false;
      String _catEmpresaAsociada = multiProfile.getCatEmpresaAsociada();
      boolean _notEquals_7 = (!Objects.equal(_catEmpresaAsociada, null));
      if (!_notEquals_7) {
        _and_7 = false;
      } else {
        String _catEmpresaAsociada_1 = multiProfile.getCatEmpresaAsociada();
        String _string_7 = _catEmpresaAsociada_1.toString();
        boolean _equals_7 = _string_7.equals("");
        boolean _not_7 = (!_equals_7);
        _and_7 = (_notEquals_7 && _not_7);
      }
      if (_and_7) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.EmpresaAsociada\">");
        String _catEmpresaAsociada_2 = multiProfile.getCatEmpresaAsociada();
        _builder.append(_catEmpresaAsociada_2, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _and_8 = false;
      String _catRender = multiProfile.getCatRender();
      boolean _notEquals_8 = (!Objects.equal(_catRender, null));
      if (!_notEquals_8) {
        _and_8 = false;
      } else {
        String _catRender_1 = multiProfile.getCatRender();
        String _string_8 = _catRender_1.toString();
        boolean _equals_8 = _string_8.equals("");
        boolean _not_8 = (!_equals_8);
        _and_8 = (_notEquals_8 && _not_8);
      }
      if (_and_8) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.Render\">");
        String _catRender_2 = multiProfile.getCatRender();
        _builder.append(_catRender_2, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</multisCategories>");
    _builder.newLine();
    return _builder;
  }
}
