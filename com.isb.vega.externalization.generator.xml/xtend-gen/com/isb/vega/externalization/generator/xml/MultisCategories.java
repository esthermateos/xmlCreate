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
      String _catGama = multiProfile.getCatGama();
      boolean _notEquals = (!Objects.equal(_catGama, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.Gama\">");
        String _catGama_1 = multiProfile.getCatGama();
        String _string = _catGama_1.toString();
        _builder.append(_string, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.Gama\"></category>");
        _builder.newLine();
      }
    }
    {
      String _catIdioma = multiProfile.getCatIdioma();
      boolean _notEquals_1 = (!Objects.equal(_catIdioma, null));
      if (_notEquals_1) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.Idioma\">");
        String _catIdioma_1 = multiProfile.getCatIdioma();
        String _string_1 = _catIdioma_1.toString();
        _builder.append(_string_1, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.Idioma\"></category>");
        _builder.newLine();
      }
    }
    {
      String _catCompany = multiProfile.getCatCompany();
      boolean _notEquals_2 = (!Objects.equal(_catCompany, null));
      if (_notEquals_2) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.Empresa\">");
        String _catCompany_1 = multiProfile.getCatCompany();
        String _string_2 = _catCompany_1.toString();
        _builder.append(_string_2, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.Empresa\"></category>");
        _builder.newLine();
      }
    }
    {
      String _catCanalMarco = multiProfile.getCatCanalMarco();
      boolean _notEquals_3 = (!Objects.equal(_catCanalMarco, null));
      if (_notEquals_3) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.CanalMarco\">");
        String _catCanalMarco_1 = multiProfile.getCatCanalMarco();
        String _string_3 = _catCanalMarco_1.toString();
        _builder.append(_string_3, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.CanalMarco\"></category>");
        _builder.newLine();
      }
    }
    {
      String _catOrden = multiProfile.getCatOrden();
      boolean _notEquals_4 = (!Objects.equal(_catOrden, null));
      if (_notEquals_4) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.orden\">");
        String _catOrden_1 = multiProfile.getCatOrden();
        String _string_4 = _catOrden_1.toString();
        _builder.append(_string_4, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.orden\"></category>");
        _builder.newLine();
      }
    }
    {
      String _catEstructura = multiProfile.getCatEstructura();
      boolean _notEquals_5 = (!Objects.equal(_catEstructura, null));
      if (_notEquals_5) {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.Estructura\">");
        String _catEstructura_1 = multiProfile.getCatEstructura();
        String _string_5 = _catEstructura_1.toString();
        _builder.append(_string_5, "	");
        _builder.append("</category>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        _builder.append("<category name=\"Perfil.Estructura\"></category>");
        _builder.newLine();
      }
    }
    _builder.append("</multisCategories>");
    _builder.newLine();
    return _builder;
  }
}
