parser grammar CssParser;

options { tokenVocab = Lexer; }

cssDeclaration: CSS_SELECTOR LBRACE (cssProperty (SEMICOLON cssProperty)*)? SEMICOLON?  RBRACE;

cssProperty: property COLON propertyValue;

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


