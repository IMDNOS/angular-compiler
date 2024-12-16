parser grammar TypeScriptParser;

options { tokenVocab = Lexer; }

ts: expression* ;

expression: decl | method;

decl
    : ID EQUAL_SIGN literal SEMICOLON
    ;

method
    : ID LPARENTHESIS methodParams? RPARENTHESIS (COLON ID)? LBRACE methodBody RBRACE
    ;

methodParams
    : param (COMMA param)*
    ;

param
    : ID COLON ID
    ;

methodBody
    : expression*
    ;

literal
    :ID
    |STRING
    | NUMERIC_VALUE
    | TRUE
    | FALSE
    | LBRACE (keyValuePair (COMMA keyValuePair)*)? RBRACE
    |array
    ;

array: LBRACKET literal (COMMA literal)* COMMA? RBRACKET;


keyValuePair
    : ID COLON literal
    ;
