lexer grammar Example1Lexer;

WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;

FROM: 'from';
IMPORT: 'import';
DEF: 'def';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
ELIF: 'elif';
CLASS: 'class';
PASS: 'pass';
NONE: 'None';
TRUE: 'True';
FALSE: 'False';
GLOBAL: 'global';

ROUTE: 'route'; // تبقى للديكور @app.route
DJANGO_FOR: 'for';
DJANGO_IN: 'in';
DJANGO_ENDFOR: 'endfor';

CLICK : 'click';
IMAGE_SRC : 'src';

TRIPLE_QUOTE: '\'\'\'';

OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
OPEN_CURLY_BRACE: '{';
CLOSE_CURLY_BRACE: '}';

OPEN_INTERP: '{{';
CLOSE_INTERP: '}}';
OPEN_DJANGO: '{%';
CLOSE_DJANGO: '%}';

HTML_CLOSE_TAG: '</' [a-zA-Z_][a-zA-Z0-9_-]* '>' ;

EQ: '=';
EQEQ: '==';
NOTEQ: '!=';
LE: '<=';
GE: '>=';
LT: '<';
GT: '>';
PLUS: '+';
MINUS: '-';
STAR : '*';
SLASH: '/';
AT: '@';
PERCENT: '%';
EXCLAMATION: '!';
QUESTION: '?';

ANDAND: '&&' | 'and';
OROR: '||' | 'or';

DOT: '.';
COMMA: ',';
SEMICOLON: ';';
COLON: ':';

COLOR
    : '#' [a-fA-F0-9] [a-fA-F0-9] [a-fA-F0-9]
      [a-fA-F0-9]? [a-fA-F0-9]? [a-fA-F0-9]?
    ;

PX: 'px';

STRING_LITERAL
    : '"' ( ~["\\\r\n] | '\\' . )* '"'
    | '\'' ( ~['\\\r\n] | '\\' . )* '\''
    ;

NUMERIC_LITERAL: [0-9]+ ('.' [0-9]+)? ;

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]* ;


