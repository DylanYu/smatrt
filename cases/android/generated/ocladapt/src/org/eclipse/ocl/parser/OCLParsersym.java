/**
* <copyright>
*
* Copyright (c) 2005, 2007 IBM Corporation and others.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   IBM - Initial API and implementation
*   E.D.Willink - Elimination of some shift-reduce conflicts
*
* </copyright>
*
* $Id: OCLParsersym.java,v 1.1 2007/10/11 23:05:00 cdamus Exp $
*/

package org.eclipse.ocl.parser;

@SuppressWarnings("nls")
public interface OCLParsersym {
    public final static int
      TK_NUMERIC_OPERATION = 60,
      TK_STRING_LITERAL = 61,
      TK_INTEGER_LITERAL = 62,
      TK_REAL_LITERAL = 63,
      TK_PLUS = 34,
      TK_MINUS = 35,
      TK_MULTIPLY = 16,
      TK_DIVIDE = 17,
      TK_GREATER = 18,
      TK_LESS = 19,
      TK_EQUAL = 4,
      TK_GREATER_EQUAL = 20,
      TK_LESS_EQUAL = 21,
      TK_NOT_EQUAL = 5,
      TK_LPAREN = 1,
      TK_RPAREN = 2,
      TK_LBRACE = 69,
      TK_RBRACE = 80,
      TK_LBRACKET = 81,
      TK_RBRACKET = 75,
      TK_ARROW = 83,
      TK_BAR = 71,
      TK_COMMA = 36,
      TK_COLON = 24,
      TK_COLONCOLON = 67,
      TK_SEMICOLON = 84,
      TK_DOT = 85,
      TK_DOTDOT = 86,
      TK_ATPRE = 72,
      TK_CARET = 87,
      TK_CARETCARET = 88,
      TK_QUESTIONMARK = 89,
      TK_self = 25,
      TK_inv = 76,
      TK_pre = 77,
      TK_post = 78,
      TK_context = 73,
      TK_package = 90,
      TK_endpackage = 91,
      TK_def = 79,
      TK_if = 70,
      TK_then = 92,
      TK_else = 93,
      TK_endif = 94,
      TK_and = 26,
      TK_or = 27,
      TK_xor = 28,
      TK_not = 51,
      TK_implies = 95,
      TK_let = 68,
      TK_in = 96,
      TK_true = 64,
      TK_false = 65,
      TK_body = 6,
      TK_derive = 22,
      TK_init = 23,
      TK_null = 37,
      TK_attr = 97,
      TK_oper = 98,
      TK_Set = 29,
      TK_Bag = 30,
      TK_Sequence = 31,
      TK_Collection = 32,
      TK_OrderedSet = 33,
      TK_iterate = 38,
      TK_forAll = 39,
      TK_exists = 40,
      TK_isUnique = 41,
      TK_any = 42,
      TK_one = 43,
      TK_collect = 44,
      TK_select = 45,
      TK_reject = 46,
      TK_collectNested = 47,
      TK_sortedBy = 48,
      TK_closure = 49,
      TK_oclIsKindOf = 52,
      TK_oclIsTypeOf = 53,
      TK_oclAsType = 54,
      TK_oclIsNew = 55,
      TK_oclIsUndefined = 56,
      TK_oclIsInvalid = 57,
      TK_oclIsInState = 58,
      TK_allInstances = 50,
      TK_String = 7,
      TK_Integer = 8,
      TK_UnlimitedNatural = 9,
      TK_Real = 10,
      TK_Boolean = 11,
      TK_Tuple = 59,
      TK_OclAny = 12,
      TK_OclVoid = 13,
      TK_Invalid = 14,
      TK_OclMessage = 15,
      TK_OclInvalid = 66,
      TK_EOF_TOKEN = 74,
      TK_IDENTIFIER = 3,
      TK_INTEGER_RANGE_START = 82,
      TK_ERROR_TOKEN = 99;

      public final static String orderedTerminalSymbols[] = {
                 "",
                 "LPAREN",
                 "RPAREN",
                 "IDENTIFIER",
                 "EQUAL",
                 "NOT_EQUAL",
                 "body",
                 "String",
                 "Integer",
                 "UnlimitedNatural",
                 "Real",
                 "Boolean",
                 "OclAny",
                 "OclVoid",
                 "Invalid",
                 "OclMessage",
                 "MULTIPLY",
                 "DIVIDE",
                 "GREATER",
                 "LESS",
                 "GREATER_EQUAL",
                 "LESS_EQUAL",
                 "derive",
                 "init",
                 "COLON",
                 "self",
                 "and",
                 "or",
                 "xor",
                 "Set",
                 "Bag",
                 "Sequence",
                 "Collection",
                 "OrderedSet",
                 "PLUS",
                 "MINUS",
                 "COMMA",
                 "null",
                 "iterate",
                 "forAll",
                 "exists",
                 "isUnique",
                 "any",
                 "one",
                 "collect",
                 "select",
                 "reject",
                 "collectNested",
                 "sortedBy",
                 "closure",
                 "allInstances",
                 "not",
                 "oclIsKindOf",
                 "oclIsTypeOf",
                 "oclAsType",
                 "oclIsNew",
                 "oclIsUndefined",
                 "oclIsInvalid",
                 "oclIsInState",
                 "Tuple",
                 "NUMERIC_OPERATION",
                 "STRING_LITERAL",
                 "INTEGER_LITERAL",
                 "REAL_LITERAL",
                 "true",
                 "false",
                 "OclInvalid",
                 "COLONCOLON",
                 "let",
                 "LBRACE",
                 "if",
                 "BAR",
                 "ATPRE",
                 "context",
                 "EOF_TOKEN",
                 "RBRACKET",
                 "inv",
                 "pre",
                 "post",
                 "def",
                 "RBRACE",
                 "LBRACKET",
                 "INTEGER_RANGE_START",
                 "ARROW",
                 "SEMICOLON",
                 "DOT",
                 "DOTDOT",
                 "CARET",
                 "CARETCARET",
                 "QUESTIONMARK",
                 "package",
                 "endpackage",
                 "then",
                 "else",
                 "endif",
                 "implies",
                 "in",
                 "attr",
                 "oper",
                 "ERROR_TOKEN"
             };

    public final static boolean isValidForParser = true;
}
