package com.isb.vega.externalization.generator.xml;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MultisCategories {
  public static CharSequence doGenerateMultiCategories() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<multisCategories>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<category name=\"Perfil.Gama\">");
    _builder.append("</category>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<category name=\"Perfil.Idioma\">");
    _builder.append("</category>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<category name=\"Perfil.Empresa\">");
    _builder.append("</category>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<category name=\"Perfil.CanalMarco\">");
    _builder.append("</category>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<category name=\"Perfil.orden\">");
    _builder.append("</category>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<category name=\"Perfil.Estructura\">");
    _builder.append("</category>");
    _builder.newLine();
    _builder.append("</multisCategories>");
    _builder.newLine();
    return _builder;
  }
}
