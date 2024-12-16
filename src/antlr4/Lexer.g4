lexer grammar Lexer;

// angular
AT_COMPONENT: '@Component';
EXPORT: 'export';
CLASS: 'class';
SELECTOR: 'selector';
STANDALONE: 'standalone';
IMPORTS: 'imports';
STYLES: 'styles';
TEMPLATE:'template';
TRUE: 'true';
FALSE: 'false';

LBRACE: '{';
RBRACE: '}';
LPARENTHESIS: '(';
RPARENTHESIS: ')';
LBRACKET: '[';
RBRACKET: ']';
COLON: ':';
COMMA: ',';
STRING: ('\'' .*? '\''|'"' .*? '"' ) ;
BACKTICK : '`';
SEMICOLON: ';';




// <<<<<-----CSS-----
// Properties
DISPLAY: 'display';
MARGIN: 'margin';
FONT_FAMILY: 'font-family';
PADDING: 'padding';
WIDTH: 'width';
BORDER_RIGHT: 'border-right';
OVERFLOW_Y: 'overflow-y';
BORDER: 'border';
CURSOR: 'cursor';
TRANSITION: 'transition';
HEIGHT: 'height';
MARGIN_RIGHT: 'margin-right';
BORDER_SOLID: 'border-solid';
COLOR: 'color';

// Property values
NUMERIC_VALUE: [0-9]+ ('.' [0-9]+)? (('px' | 'em' | 'rem' | '%')?);
COLOR_VALUE: '#' [0-9a-fA-F]+
           | 'rgb(' [0-9]+ ',' [0-9]+ ',' [0-9]+ ')'
           | 'rgba(' [0-9]+ ',' [0-9]+ ',' [0-9]+ ',' [0-9]+ ')';


// css
CSS_SELECTOR: ('.'|'#') [a-zA-Z_][a-zA-Z_0-9]*;


//>>>>>

//TypeScript
EQUAL_SIGN : '=';









// Identifiers and literals
ID: [a-zA-Z_][a-zA-Z_0-9]*;
WS: [ \t\r\n]+ -> skip;  // Skipping whitespace
