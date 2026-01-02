parser grammar Example1Parser;

options {tokenVocab=Example1Lexer;}

program
    : statement* EOF
    ;

statement
    : importStatement
    | functionDef
    | routeDecorator functionDef
    | classDef
    | ifStatement
    | globalStatement
    | simpleStatement
    ;

simpleStatement
    : returnStatement SEMICOLON?
    | assignment SEMICOLON?
    | exprStatement SEMICOLON?
    ;

globalStatement
    : GLOBAL IDENTIFIER (COMMA IDENTIFIER)* SEMICOLON? ;

importStatement
    : FROM IDENTIFIER IMPORT importList SEMICOLON?
    | IMPORT importList SEMICOLON?
    ;

importList
    : importItem (COMMA importItem)*
    ;

importItem
    : IDENTIFIER
    ;

assignment
    : IDENTIFIER EQ expression
    ;

returnStatement
    : RETURN expression?
    ;

expression
    : expression (ANDAND | OROR) expression        # BinaryLogic
    | expression (EQEQ | NOTEQ | LT | LE | GT | GE) expression # BinaryComparison
    | expression (PLUS | MINUS | STAR | SLASH) expression # BinaryArithmetic
    | factor                                      # AtomicFactor
    ;

factor
    : literal
    | collection
    | templateString
    | OPEN_PAREN expression CLOSE_PAREN
    | OPEN_PAREN generatorExpression CLOSE_PAREN
    | callOrAccess
    ;

comprehension
    : DJANGO_FOR IDENTIFIER DJANGO_IN expression (IF expression)*
    ;

generatorExpression
    : expression comprehension
    ;

literal
    : STRING_LITERAL
    | NUMERIC_LITERAL
    | TRUE
    | FALSE
    | NONE
    ;

collection
    : listLiteral
    | dictLiteral
    ;

listLiteral
    : OPEN_BRACKET (expression (COMMA expression)* COMMA?)? CLOSE_BRACKET
    | OPEN_BRACKET expression comprehension CLOSE_BRACKET
    ;

dictLiteral
    : OPEN_CURLY_BRACE (dictPair (COMMA dictPair)*)? CLOSE_CURLY_BRACE
    ;

dictPair
    : expression COLON expression
    ;

callOrAccess
    : primaryAccess (DOT IDENTIFIER | callArgs | indexAccess)*
    ;

primaryAccess
    : IDENTIFIER
    ;

callArgs
    : OPEN_PAREN callArguments? CLOSE_PAREN
    ;

indexAccess
    : OPEN_BRACKET expression CLOSE_BRACKET
    ;

callArguments
    : argument (COMMA argument)*
    ;

argument
    : IDENTIFIER EQ expression
    | expression comprehension
    | expression
    ;

functionDef
    : DEF IDENTIFIER OPEN_PAREN params? CLOSE_PAREN COLON block
    ;

params
    : parameter (COMMA parameter)*
    ;

parameter
    : IDENTIFIER (COLON expression)? (EQ expression)?
    ;

classDef
    : CLASS IDENTIFIER COLON block
    ;

block
    : statement+
    ;

ifStatement
    : IF expression COLON block (elifStatement)* (elseStatement)?
    ;

elifStatement
    : ELIF expression COLON block
    ;

elseStatement
    : ELSE COLON block
    ;

exprStatement
    : expression
    ;

routeDecorator
    : AT IDENTIFIER DOT ROUTE OPEN_PAREN (STRING_LITERAL (COMMA routeMethods)?)? CLOSE_PAREN
    ;

routeMethods
    : IDENTIFIER EQ listLiteral
    ;

htmlElement
    : LT IDENTIFIER htmlAttribute* GT htmlContentBody* HTML_CLOSE_TAG
    | LT IDENTIFIER htmlAttribute* SLASH? GT
    ;

htmlAttribute
    : basicAttribute
    | booleanAttribute
    | eventAttribute
    | imageAttribute
    ;

basicAttribute
    : (IDENTIFIER | IMAGE_SRC) EQ (STRING_LITERAL | NUMERIC_LITERAL | IDENTIFIER | objectExpression)
    ;

booleanAttribute
    : IDENTIFIER
    ;

imageAttribute
    : OPEN_BRACKET IMAGE_SRC CLOSE_BRACKET EQ (STRING_LITERAL | objectExpression)
    ;

eventAttribute
    : OPEN_PAREN CLICK CLOSE_PAREN EQ STRING_LITERAL
    ;

htmlContentBody
    : cssBlock
    | htmlElement
    | objectExpression
    | djangoForBlock
    | djangoGeneralBlock
    | textNode
    ;

objectExpression
    : OPEN_INTERP objectExpressionValue CLOSE_INTERP
    ;


objectExpressionValue
    : IDENTIFIER (DOT IDENTIFIER)*
    ;

templateContent
    : htmlElement
    | cssBlock
    | objectExpression
    | djangoForBlock
    | djangoGeneralBlock
    | textNode
    ;

djangoForBlock
    : OPEN_DJANGO DJANGO_FOR IDENTIFIER DJANGO_IN IDENTIFIER CLOSE_DJANGO
      templateContent*
      djangoEndBlock
    ;

djangoEndBlock
    : OPEN_DJANGO DJANGO_ENDFOR CLOSE_DJANGO
    ;

djangoGeneralBlock
    : OPEN_DJANGO IDENTIFIER djangoArgs* CLOSE_DJANGO
    ;

djangoArgs
    : IDENTIFIER
    | STRING_LITERAL
    | NUMERIC_LITERAL
    | DOT
    | expression
    ;

cssBlock
    : selector OPEN_CURLY_BRACE cssRule* CLOSE_CURLY_BRACE
    ;

selector
    : (DOT? IDENTIFIER)+ (DOT IDENTIFIER)?
    ;

cssRule
    : cssProperty COLON cssValueList SEMICOLON
    ;

cssProperty
    : IDENTIFIER (MINUS IDENTIFIER)*
    ;

cssValueList
    : cssValue (ruleSeparator cssValue)*
    ;

cssValue
    : IDENTIFIER (MINUS IDENTIFIER)*
    | NUMERIC_LITERAL PX?
    | COLOR
    | STRING_LITERAL
    ;

ruleSeparator
    : COMMA
    |
    ;

templateString
    : TRIPLE_QUOTE templateDocument TRIPLE_QUOTE
    ;

templateDocument
    : templateContent*
    ;

textNode
    : (IDENTIFIER | NUMERIC_LITERAL | COLON | COMMA | SEMICOLON | DOT | PERCENT | EXCLAMATION | QUESTION | MINUS | PLUS | EQ | SLASH | LT | GT)+
    ;