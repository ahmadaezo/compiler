lexer grammar Example1Lexer;

// ============================================================
// 1. Whitespace & Comments
// ============================================================
WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;

// ============================================================
// 2. Python Keywords (Must come before IDENTIFIER)
// ============================================================
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

// ============================================================
// 3. Flask & Template Keywords (الكلمات المفتاحية الحقيقية فقط)
// ============================================================
ROUTE: 'route'; // تبقى للديكور @app.route
DJANGO_FOR: 'for';
DJANGO_IN: 'in';
DJANGO_ENDFOR: 'endfor';

// تُستخدم في القوالب
CLICK : 'click';
IMAGE_SRC : 'src';

// ============================================================
// 4. Separators & Operators
// ============================================================
TRIPLE_QUOTE: '\'\'\'';

OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
OPEN_CURLY_BRACE: '{';
CLOSE_CURLY_BRACE: '}';

// Template Interpolation
OPEN_INTERP: '{{';
CLOSE_INTERP: '}}';
OPEN_DJANGO: '{%';
CLOSE_DJANGO: '%}';

// HTML Tag
HTML_CLOSE_TAG: '</' [a-zA-Z_][a-zA-Z0-9_-]* '>' ;

// Operators
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

// Logical Operators
ANDAND: '&&' | 'and';
OROR: '||' | 'or';

// Punctuation
DOT: '.';
COMMA: ',';
SEMICOLON: ';';
COLON: ':';

// ============================================================
// 5. Literals & Identifiers (Must come last)
// ============================================================
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

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]* ; // هذا سيتعرف الآن على 'app', 'request', 'redirect', إلخ.


