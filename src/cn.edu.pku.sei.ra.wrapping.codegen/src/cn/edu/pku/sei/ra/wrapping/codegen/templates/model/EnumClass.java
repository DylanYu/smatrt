package cn.edu.pku.sei.ra.wrapping.codegen.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class EnumClass
{
  protected static String nl;
  public static synchronized EnumClass create(String lineSeparator)
  {
    nl = lineSeparator;
    EnumClass result = new EnumClass();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " * <copyright>" + NL + " * </copyright>";
  protected final String TEXT_5 = NL + " *" + NL + " * ";
  protected final String TEXT_6 = "Id";
  protected final String TEXT_7 = NL + " */" + NL + "package ";
  protected final String TEXT_8 = ";" + NL;
  protected final String TEXT_9 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the literals of the enumeration '<em><b>";
  protected final String TEXT_10 = "</b></em>'," + NL + " * and utility methods for working with them." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_11 = NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_12 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_13 = NL + " * @see ";
  protected final String TEXT_14 = "#get";
  protected final String TEXT_15 = "()";
  protected final String TEXT_16 = NL + " * @model ";
  protected final String TEXT_17 = NL + " *        ";
  protected final String TEXT_18 = NL + " * @model";
  protected final String TEXT_19 = NL + " * @generated" + NL + " */" + NL + "public ";
  protected final String TEXT_20 = "enum";
  protected final String TEXT_21 = "final class";
  protected final String TEXT_22 = " ";
  protected final String TEXT_23 = " ";
  protected final String TEXT_24 = "implements";
  protected final String TEXT_25 = "extends";
  protected final String TEXT_26 = " ";
  protected final String TEXT_27 = NL + "{";
  protected final String TEXT_28 = NL + "\t;" + NL;
  protected final String TEXT_29 = NL + "\t/**" + NL + "\t * The '<em><b>";
  protected final String TEXT_30 = "</b></em>' literal object." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_31 = NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\t";
  protected final String TEXT_32 = "(";
  protected final String TEXT_33 = ", \"";
  protected final String TEXT_34 = "\", \"";
  protected final String TEXT_35 = "\")";
  protected final String TEXT_36 = ",";
  protected final String TEXT_37 = ";";
  protected final String TEXT_38 = NL;
  protected final String TEXT_39 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_40 = " copyright = ";
  protected final String TEXT_41 = ";";
  protected final String TEXT_42 = NL;
  protected final String TEXT_43 = NL + "\t/**" + NL + "\t * The '<em><b>";
  protected final String TEXT_44 = "</b></em>' literal value." + NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_45 = NL + "\t * <p>" + NL + "\t * If the meaning of '<em><b>";
  protected final String TEXT_46 = "</b></em>' literal object isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_47 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_48 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_49 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_50 = NL + "\t * @see #";
  protected final String TEXT_51 = NL + "\t * @model ";
  protected final String TEXT_52 = NL + "\t *        ";
  protected final String TEXT_53 = NL + "\t * @model";
  protected final String TEXT_54 = NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tpublic static final int ";
  protected final String TEXT_55 = " = ";
  protected final String TEXT_56 = ";" + NL;
  protected final String TEXT_57 = NL + "\t/**" + NL + "\t * The '<em><b>";
  protected final String TEXT_58 = "</b></em>' literal object." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_59 = NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_60 = " ";
  protected final String TEXT_61 = " = new ";
  protected final String TEXT_62 = "(";
  protected final String TEXT_63 = ", \"";
  protected final String TEXT_64 = "\", \"";
  protected final String TEXT_65 = "\");";
  protected final String TEXT_66 = NL;
  protected final String TEXT_67 = NL + "\t/**" + NL + "\t * An array of all the '<em><b>";
  protected final String TEXT_68 = "</b></em>' enumerators." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final ";
  protected final String TEXT_69 = "[] VALUES_ARRAY =" + NL + "\t\tnew ";
  protected final String TEXT_70 = "[]" + NL + "\t\t{";
  protected final String TEXT_71 = NL + "\t\t\t";
  protected final String TEXT_72 = ",";
  protected final String TEXT_73 = NL + "\t\t};" + NL + "" + NL + "\t/**" + NL + "\t * A public read-only list of all the '<em><b>";
  protected final String TEXT_74 = "</b></em>' enumerators." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final List";
  protected final String TEXT_75 = "<";
  protected final String TEXT_76 = ">";
  protected final String TEXT_77 = " VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));" + NL + "" + NL + "\t/**" + NL + "\t * Returns the '<em><b>";
  protected final String TEXT_78 = "</b></em>' literal with the specified literal value." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_79 = " get(";
  protected final String TEXT_80 = " literal)" + NL + "\t{" + NL + "\t\tfor (int i = 0; i < VALUES_ARRAY.length; ++i)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_81 = " result = VALUES_ARRAY[i];" + NL + "\t\t\tif (result.toString().equals(literal))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Returns the '<em><b>";
  protected final String TEXT_82 = "</b></em>' literal with the specified name." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_83 = " getByName(";
  protected final String TEXT_84 = " name)" + NL + "\t{" + NL + "\t\tfor (int i = 0; i < VALUES_ARRAY.length; ++i)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_85 = " result = VALUES_ARRAY[i];" + NL + "\t\t\tif (result.getName().equals(name))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Returns the '<em><b>";
  protected final String TEXT_86 = "</b></em>' literal with the specified integer value." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_87 = " get(int value)" + NL + "\t{" + NL + "\t\tswitch (value)" + NL + "\t\t{";
  protected final String TEXT_88 = NL + "\t\t\tcase ";
  protected final String TEXT_89 = ": return ";
  protected final String TEXT_90 = ";";
  protected final String TEXT_91 = NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_92 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate final int value;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate final ";
  protected final String TEXT_93 = " name;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate final ";
  protected final String TEXT_94 = " literal;" + NL;
  protected final String TEXT_95 = NL + "\t/**" + NL + "\t * Only this class can construct instances." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_96 = "(int value, ";
  protected final String TEXT_97 = " name, ";
  protected final String TEXT_98 = " literal)" + NL + "\t{";
  protected final String TEXT_99 = NL + "\t\tthis.value = value;" + NL + "\t\tthis.name = name;" + NL + "\t\tthis.literal = literal;";
  protected final String TEXT_100 = NL + "\t\tsuper(value, name, literal);";
  protected final String TEXT_101 = NL + "\t}" + NL;
  protected final String TEXT_102 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getValue()" + NL + "\t{" + NL + "\t  return value;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_103 = " getName()" + NL + "\t{" + NL + "\t  return name;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_104 = " getLiteral()" + NL + "\t{" + NL + "\t  return literal;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Returns the literal value of the enumerator, which is its string representation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_105 = NL + "\t@Override";
  protected final String TEXT_106 = NL + "\tpublic ";
  protected final String TEXT_107 = " toString()" + NL + "\t{" + NL + "\t\treturn literal;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_108 = NL + "} //";
  protected final String TEXT_109 = NL;
  protected final String TEXT_110 = NL + "/**" + NL + " * A private implementation interface used to hide the inheritance from Enumerator." + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "interface Internal";
  protected final String TEXT_111 = " extends org.eclipse.emf.common.util.Enumerator" + NL + "{" + NL + "\t// Empty " + NL + "}";
  protected final String TEXT_112 = NL + "/**" + NL + " * A private implementation class to construct the instances." + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "class Internal";
  protected final String TEXT_113 = " extends org.eclipse.emf.common.util.AbstractEnumerator" + NL + "{" + NL + "\t/**" + NL + "\t * Only this class can construct instances." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Internal";
  protected final String TEXT_114 = "(int value, ";
  protected final String TEXT_115 = " name, ";
  protected final String TEXT_116 = " literal)" + NL + "\t{" + NL + "\t\tsuper(value, name, literal);" + NL + "\t}" + NL + "}";
  protected final String TEXT_117 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    GenEnum genEnum = (GenEnum)argument; GenPackage genPackage = genEnum.getGenPackage(); GenModel genModel=genPackage.getGenModel();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_4);
    }}
    stringBuffer.append(TEXT_5);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_6);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_8);
    genModel.addImport("java.util.Arrays");
    genModel.addImport("java.util.List");
    genModel.addImport("java.util.Collections");
    genModel.markImportLocation(stringBuffer, genPackage);
    boolean isEnum = genModel.useGenerics();
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_10);
    if (genEnum.hasDocumentation()) {
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genEnum.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_12);
    }
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_15);
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genEnum.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_16);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_18);
    }}
    stringBuffer.append(TEXT_19);
    if (isEnum) {
    stringBuffer.append(TEXT_20);
    } else {
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_23);
    if (isEnum) {
    stringBuffer.append(TEXT_24);
    } else {
    stringBuffer.append(TEXT_25);
    }
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genModel.isSuppressEMFMetaData() && !genModel.isSuppressInterfaces() ? "Internal" + genEnum.getName() : genModel.getImportedName(isEnum ? "org.eclipse.emf.common.util.Enumerator" : "org.eclipse.emf.common.util.AbstractEnumerator"));
    stringBuffer.append(TEXT_27);
    if (isEnum) {
    if (genEnum.getGenEnumLiterals().isEmpty()) {
    stringBuffer.append(TEXT_28);
    }else {
    for (Iterator<GenEnumLiteral> l = genEnum.getGenEnumLiterals().iterator(); l.hasNext(); ) { GenEnumLiteral genEnumLiteral = l.next(); 
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genEnumLiteral.getFormattedName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genEnumLiteral.getEnumLiteralValueConstantName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genEnumLiteral.getValue());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genEnumLiteral.getName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genEnumLiteral.getLiteral());
    stringBuffer.append(TEXT_35);
    if (l.hasNext()) {
    stringBuffer.append(TEXT_36);
    } else {
    stringBuffer.append(TEXT_37);
    }
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_38);
    }
    }
    }
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_42);
    }
    for (GenEnumLiteral genEnumLiteral : genEnum.getGenEnumLiterals()) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genEnumLiteral.getFormattedName());
    stringBuffer.append(TEXT_44);
    if (!genEnumLiteral.hasDocumentation()) {
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genEnumLiteral.getFormattedName());
    stringBuffer.append(TEXT_46);
    }
    stringBuffer.append(TEXT_47);
    if (genEnumLiteral.hasDocumentation()) {
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genEnumLiteral.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_49);
    }
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genEnumLiteral.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_51);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_52);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_53);
    }}
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genEnumLiteral.getEnumLiteralValueConstantName());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genEnumLiteral.getValue());
    stringBuffer.append(TEXT_56);
    }
    if (!isEnum) for (GenEnumLiteral genEnumLiteral : genEnum.getGenEnumLiterals()) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genEnumLiteral.getFormattedName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genEnumLiteral.getEnumLiteralValueConstantName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genEnumLiteral.getEnumLiteralValueConstantName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genEnumLiteral.getName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genEnumLiteral.getLiteral());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_66);
    }
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_70);
    for (GenEnumLiteral genEnumLiteral : genEnum.getGenEnumLiterals()) {
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    stringBuffer.append(TEXT_72);
    }
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_74);
    if (isEnum) {
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_76);
    }
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_87);
    for (GenEnumLiteral genEnumLiteral : genEnum.getUniqueValuedGenEnumLiterals()) {
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genEnumLiteral.getEnumLiteralValueConstantName());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_91);
    if (isEnum) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_94);
    }
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_98);
    if (isEnum) {
    stringBuffer.append(TEXT_99);
    } else {
    stringBuffer.append(TEXT_100);
    }
    stringBuffer.append(TEXT_101);
    if (isEnum) {
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_104);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_105);
    }
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_107);
    }
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genEnum.getName());
    if (genModel.isSuppressEMFMetaData()&& !genModel.isSuppressInterfaces() ) {
    stringBuffer.append(TEXT_109);
    if (isEnum) {
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_111);
    } else {
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_116);
    }
    }
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_117);
    return stringBuffer.toString();
  }
}
