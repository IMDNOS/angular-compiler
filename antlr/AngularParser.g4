parser grammar AngularParser;

@header{
package gen;
}

options { tokenVocab = AngularLexer; }

//   <<<<<< Angular parser


program: componentDeclaration ;

componentDeclaration
    : AT_COMPONENT LPARENTHESIS LBRACE (SELECTOR COLON STRING COMMA  STANDALONE COLON (TRUE | FALSE) COMMA) option (COMMA option)* COMMA? RBRACE RPARENTHESIS EXPORT CLASS ID LBRACE ts RBRACE
    ;

option
    :STYLES COLON LBRACKET BACKTICK cssDeclaration* BACKTICK RBRACKET       #CssOption
    |TEMPLATE COLON BACKTICK html BACKTICK                                  #HtmlOption
    ;

  // <<<<<<< ts parser

  ts: globals* constructor? globals* ;

  globals
            :attribute
            | method;

  attribute : ID COLON type SEMICOLON;


  expression:
           LET ID COLON type SEMICOLON                              #Declare
          |LET ID COLON type EQUAL_SIGN (literal|array) SEMICOLON   #DeclareAndAssign
          | (THIS)? ID EQUAL_SIGN (literal|array) SEMICOLON         #Assign
  ;

  constructor:LPARENTHESIS /*methodParams?*/ RPARENTHESIS  LBRACE body RBRACE ;


  type: NUMBER | STRINGDL | BOOLEAN | ANY  ;

  literal
      :ID
      | STRING
      | NUMERIC_VALUE
      | TRUE
      | FALSE
      | LBRACE (keyValuePair (COMMA keyValuePair)*)? RBRACE
      ;

  array: LBRACKET literal (COMMA literal)* COMMA? RBRACKET   #Any;

  keyValuePair
      : ID COLON literal
      ;

  method
      : ID LPARENTHESIS methodParams? RPARENTHESIS (COLON VOID)? LBRACE body RBRACE
      ;


  methodParams
      : param (COMMA param)*
      ;

  param
      : ID COLON type
      ;

  body
      : expression*
      ;

// <<<<<    html parser


html
    : element*
    ;


element
    : TAG_OPEN content+ htmlAttribute* TAG_CLOSE ( content+ ( TAG_OPEN_SELF content+ TAG_CLOSE )* )*
    ;


htmlAttribute
    : ATTRIBUTE
    | ANGULAR_ATTRIBUTE_DIRECTIVE
    | ANGULAR_ATTRIBUTE_PROPERTY
    | ANGULAR_ATTRIBUTE_EVENT
    ;


content
    : element
    | ANGULAR_BINDING
    | STRING
    | ID
    ;

// <<<<<<<<<<<<< css parser



cssDeclaration: CSS_SELECTOR (ID)? LBRACE (cssProperty (SEMICOLON cssProperty)*)? SEMICOLON?  RBRACE;

cssProperty: property  COLON propertyValue+;

property: DISPLAY
        | MARGIN
        | FONT_FAMILY
        | PADDING
        | WIDTH
        | BORDER_RIGHT
        | OVERFLOW_Y
        | BORDER
        | CURSOR
        | TRANSITION
        | HEIGHT
        | MARGIN_RIGHT
        | BORDER_SOLID
        | COLOR
        ;

propertyValue: STRING
             | ID
             | NUMERIC_VALUE
             | COLOR_VALUE
//             | LBRACKET cssDeclaration RBRACKET
             ;


