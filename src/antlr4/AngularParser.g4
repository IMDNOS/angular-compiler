parser grammar AngularParser;

options { tokenVocab = Lexer; }

import CssParser, TypeScriptParser, HtmlParser;

program: componentDeclaration+ ;

componentDeclaration
    : AT_COMPONENT LPARENTHESIS componentOptions RPARENTHESIS EXPORT CLASS ID LBRACE ts RBRACE
    ;

componentOptions
    : LBRACE option (COMMA option)* COMMA? RBRACE
    ;

option
    : SELECTOR COLON STRING
    | STANDALONE COLON (TRUE | FALSE)
    | STYLES COLON LBRACKET BACKTICK cssDeclaration* BACKTICK RBRACKET
    |TEMPLATE COLON BACKTICK html BACKTICK
    ;
