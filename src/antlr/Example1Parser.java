// Generated from C:/Users/Zaid/Documents/Compiler/src/antlr/Example1Parser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Example1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, COMMENT=2, FROM=3, IMPORT=4, DEF=5, RETURN=6, IF=7, ELSE=8, 
		ELIF=9, CLASS=10, PASS=11, NONE=12, TRUE=13, FALSE=14, GLOBAL=15, ROUTE=16, 
		DJANGO_FOR=17, DJANGO_IN=18, DJANGO_ENDFOR=19, CLICK=20, IMAGE_SRC=21, 
		TRIPLE_QUOTE=22, OPEN_PAREN=23, CLOSE_PAREN=24, OPEN_BRACKET=25, CLOSE_BRACKET=26, 
		OPEN_CURLY_BRACE=27, CLOSE_CURLY_BRACE=28, OPEN_INTERP=29, CLOSE_INTERP=30, 
		OPEN_DJANGO=31, CLOSE_DJANGO=32, HTML_CLOSE_TAG=33, EQ=34, EQEQ=35, NOTEQ=36, 
		LE=37, GE=38, LT=39, GT=40, PLUS=41, MINUS=42, STAR=43, SLASH=44, AT=45, 
		PERCENT=46, EXCLAMATION=47, QUESTION=48, ANDAND=49, OROR=50, DOT=51, COMMA=52, 
		SEMICOLON=53, COLON=54, COLOR=55, PX=56, STRING_LITERAL=57, NUMERIC_LITERAL=58, 
		IDENTIFIER=59;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simpleStatement = 2, RULE_globalStatement = 3, 
		RULE_importStatement = 4, RULE_importList = 5, RULE_importItem = 6, RULE_assignment = 7, 
		RULE_returnStatement = 8, RULE_expression = 9, RULE_factor = 10, RULE_comprehension = 11, 
		RULE_generatorExpression = 12, RULE_literal = 13, RULE_collection = 14, 
		RULE_listLiteral = 15, RULE_dictLiteral = 16, RULE_dictPair = 17, RULE_callOrAccess = 18, 
		RULE_primaryAccess = 19, RULE_callArgs = 20, RULE_indexAccess = 21, RULE_callArguments = 22, 
		RULE_argument = 23, RULE_functionDef = 24, RULE_params = 25, RULE_parameter = 26, 
		RULE_classDef = 27, RULE_block = 28, RULE_ifStatement = 29, RULE_elifStatement = 30, 
		RULE_elseStatement = 31, RULE_exprStatement = 32, RULE_routeDecorator = 33, 
		RULE_routeMethods = 34, RULE_htmlElement = 35, RULE_htmlAttribute = 36, 
		RULE_basicAttribute = 37, RULE_booleanAttribute = 38, RULE_imageAttribute = 39, 
		RULE_eventAttribute = 40, RULE_htmlContentBody = 41, RULE_objectExpression = 42, 
		RULE_objectExpressionValue = 43, RULE_templateContent = 44, RULE_djangoForBlock = 45, 
		RULE_djangoEndBlock = 46, RULE_djangoGeneralBlock = 47, RULE_djangoArgs = 48, 
		RULE_cssBlock = 49, RULE_selector = 50, RULE_cssRule = 51, RULE_cssProperty = 52, 
		RULE_cssValueList = 53, RULE_cssValue = 54, RULE_ruleSeparator = 55, RULE_templateString = 56, 
		RULE_templateDocument = 57, RULE_textNode = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simpleStatement", "globalStatement", "importStatement", 
			"importList", "importItem", "assignment", "returnStatement", "expression", 
			"factor", "comprehension", "generatorExpression", "literal", "collection", 
			"listLiteral", "dictLiteral", "dictPair", "callOrAccess", "primaryAccess", 
			"callArgs", "indexAccess", "callArguments", "argument", "functionDef", 
			"params", "parameter", "classDef", "block", "ifStatement", "elifStatement", 
			"elseStatement", "exprStatement", "routeDecorator", "routeMethods", "htmlElement", 
			"htmlAttribute", "basicAttribute", "booleanAttribute", "imageAttribute", 
			"eventAttribute", "htmlContentBody", "objectExpression", "objectExpressionValue", 
			"templateContent", "djangoForBlock", "djangoEndBlock", "djangoGeneralBlock", 
			"djangoArgs", "cssBlock", "selector", "cssRule", "cssProperty", "cssValueList", 
			"cssValue", "ruleSeparator", "templateString", "templateDocument", "textNode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'from'", "'import'", "'def'", "'return'", "'if'", 
			"'else'", "'elif'", "'class'", "'pass'", "'None'", "'True'", "'False'", 
			"'global'", "'route'", "'for'", "'in'", "'endfor'", "'click'", "'src'", 
			"'''''", "'('", "')'", "'['", "']'", "'{'", "'}'", "'{{'", "'}}'", "'{%'", 
			"'%}'", null, "'='", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'+'", 
			"'-'", "'*'", "'/'", "'@'", "'%'", "'!'", "'?'", null, null, "'.'", "','", 
			"';'", "':'", null, "'px'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "COMMENT", "FROM", "IMPORT", "DEF", "RETURN", "IF", 
			"ELSE", "ELIF", "CLASS", "PASS", "NONE", "TRUE", "FALSE", "GLOBAL", "ROUTE", 
			"DJANGO_FOR", "DJANGO_IN", "DJANGO_ENDFOR", "CLICK", "IMAGE_SRC", "TRIPLE_QUOTE", 
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLY_BRACE", 
			"CLOSE_CURLY_BRACE", "OPEN_INTERP", "CLOSE_INTERP", "OPEN_DJANGO", "CLOSE_DJANGO", 
			"HTML_CLOSE_TAG", "EQ", "EQEQ", "NOTEQ", "LE", "GE", "LT", "GT", "PLUS", 
			"MINUS", "STAR", "SLASH", "AT", "PERCENT", "EXCLAMATION", "QUESTION", 
			"ANDAND", "OROR", "DOT", "COMMA", "SEMICOLON", "COLON", "COLOR", "PX", 
			"STRING_LITERAL", "NUMERIC_LITERAL", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Example1Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Example1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Example1Parser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008841501083497720L) != 0)) {
				{
				{
				setState(118);
				statement();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public RouteDecoratorContext routeDecorator() {
			return getRuleContext(RouteDecoratorContext.class,0);
		}
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				importStatement();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				functionDef();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				routeDecorator();
				setState(129);
				functionDef();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				classDef();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				ifStatement();
				}
				break;
			case GLOBAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				globalStatement();
				}
				break;
			case RETURN:
			case NONE:
			case TRUE:
			case FALSE:
			case TRIPLE_QUOTE:
			case OPEN_PAREN:
			case OPEN_BRACKET:
			case OPEN_CURLY_BRACE:
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				simpleStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprStatementContext exprStatement() {
			return getRuleContext(ExprStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleStatement);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				returnStatement();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(138);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				assignment();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(142);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				exprStatement();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(146);
					match(SEMICOLON);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalStatementContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(Example1Parser.GLOBAL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Example1Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Example1Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterGlobalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitGlobalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitGlobalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_globalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(GLOBAL);
			setState(152);
			match(IDENTIFIER);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				match(IDENTIFIER);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(160);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(Example1Parser.FROM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public TerminalNode IMPORT() { return getToken(Example1Parser.IMPORT, 0); }
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importStatement);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(FROM);
				setState(164);
				match(IDENTIFIER);
				setState(165);
				match(IMPORT);
				setState(166);
				importList();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(167);
					match(SEMICOLON);
					}
				}

				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(IMPORT);
				setState(171);
				importList();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(172);
					match(SEMICOLON);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportListContext extends ParserRuleContext {
		public List<ImportItemContext> importItem() {
			return getRuleContexts(ImportItemContext.class);
		}
		public ImportItemContext importItem(int i) {
			return getRuleContext(ImportItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitImportList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitImportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			importItem();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				importItem();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public ImportItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterImportItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitImportItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitImportItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemContext importItem() throws RecognitionException {
		ImportItemContext _localctx = new ImportItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(Example1Parser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(IDENTIFIER);
			setState(188);
			match(EQ);
			setState(189);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Example1Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(RETURN);
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(192);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQEQ() { return getToken(Example1Parser.EQEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(Example1Parser.NOTEQ, 0); }
		public TerminalNode LT() { return getToken(Example1Parser.LT, 0); }
		public TerminalNode LE() { return getToken(Example1Parser.LE, 0); }
		public TerminalNode GT() { return getToken(Example1Parser.GT, 0); }
		public TerminalNode GE() { return getToken(Example1Parser.GE, 0); }
		public BinaryComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterBinaryComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitBinaryComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitBinaryComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomicFactorContext extends ExpressionContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AtomicFactorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterAtomicFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitAtomicFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitAtomicFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryArithmeticContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(Example1Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Example1Parser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(Example1Parser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(Example1Parser.SLASH, 0); }
		public BinaryArithmeticContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterBinaryArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitBinaryArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitBinaryArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryLogicContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ANDAND() { return getToken(Example1Parser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(Example1Parser.OROR, 0); }
		public BinaryLogicContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterBinaryLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitBinaryLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitBinaryLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomicFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(196);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryLogicContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(199);
						_la = _input.LA(1);
						if ( !(_la==ANDAND || _la==OROR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(200);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new BinaryComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(202);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2164663517184L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new BinaryArithmeticContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(205);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985348833280L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public TemplateStringContext templateString() {
			return getRuleContext(TemplateStringContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(Example1Parser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(Example1Parser.CLOSE_PAREN, 0); }
		public GeneratorExpressionContext generatorExpression() {
			return getRuleContext(GeneratorExpressionContext.class,0);
		}
		public CallOrAccessContext callOrAccess() {
			return getRuleContext(CallOrAccessContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				collection();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				templateString();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(OPEN_PAREN);
				setState(216);
				expression(0);
				setState(217);
				match(CLOSE_PAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				match(OPEN_PAREN);
				setState(220);
				generatorExpression();
				setState(221);
				match(CLOSE_PAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(223);
				callOrAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComprehensionContext extends ParserRuleContext {
		public TerminalNode DJANGO_FOR() { return getToken(Example1Parser.DJANGO_FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public TerminalNode DJANGO_IN() { return getToken(Example1Parser.DJANGO_IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(Example1Parser.IF); }
		public TerminalNode IF(int i) {
			return getToken(Example1Parser.IF, i);
		}
		public ComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComprehensionContext comprehension() throws RecognitionException {
		ComprehensionContext _localctx = new ComprehensionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(DJANGO_FOR);
			setState(227);
			match(IDENTIFIER);
			setState(228);
			match(DJANGO_IN);
			setState(229);
			expression(0);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(230);
				match(IF);
				setState(231);
				expression(0);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GeneratorExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComprehensionContext comprehension() {
			return getRuleContext(ComprehensionContext.class,0);
		}
		public GeneratorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterGeneratorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitGeneratorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitGeneratorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratorExpressionContext generatorExpression() throws RecognitionException {
		GeneratorExpressionContext _localctx = new GeneratorExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_generatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			expression(0);
			setState(238);
			comprehension();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(Example1Parser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(Example1Parser.NUMERIC_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(Example1Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Example1Parser.FALSE, 0); }
		public TerminalNode NONE() { return getToken(Example1Parser.NONE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345564227596288L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CollectionContext extends ParserRuleContext {
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public DictLiteralContext dictLiteral() {
			return getRuleContext(DictLiteralContext.class,0);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_collection);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				listLiteral();
				}
				break;
			case OPEN_CURLY_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				dictLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(Example1Parser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(Example1Parser.CLOSE_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public ComprehensionContext comprehension() {
			return getRuleContext(ComprehensionContext.class,0);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listLiteral);
		int _la;
		try {
			int _alt;
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(OPEN_BRACKET);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316711374848L) != 0)) {
					{
					setState(247);
					expression(0);
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(248);
							match(COMMA);
							setState(249);
							expression(0);
							}
							} 
						}
						setState(254);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(255);
						match(COMMA);
						}
					}

					}
				}

				setState(260);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(OPEN_BRACKET);
				setState(262);
				expression(0);
				setState(263);
				comprehension();
				setState(264);
				match(CLOSE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DictLiteralContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACE() { return getToken(Example1Parser.OPEN_CURLY_BRACE, 0); }
		public TerminalNode CLOSE_CURLY_BRACE() { return getToken(Example1Parser.CLOSE_CURLY_BRACE, 0); }
		public List<DictPairContext> dictPair() {
			return getRuleContexts(DictPairContext.class);
		}
		public DictPairContext dictPair(int i) {
			return getRuleContext(DictPairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public DictLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterDictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitDictLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitDictLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictLiteralContext dictLiteral() throws RecognitionException {
		DictLiteralContext _localctx = new DictLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dictLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(OPEN_CURLY_BRACE);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316711374848L) != 0)) {
				{
				setState(269);
				dictPair();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(270);
					match(COMMA);
					setState(271);
					dictPair();
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(279);
			match(CLOSE_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DictPairContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Example1Parser.COLON, 0); }
		public DictPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterDictPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitDictPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitDictPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictPairContext dictPair() throws RecognitionException {
		DictPairContext _localctx = new DictPairContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dictPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			expression(0);
			setState(282);
			match(COLON);
			setState(283);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallOrAccessContext extends ParserRuleContext {
		public PrimaryAccessContext primaryAccess() {
			return getRuleContext(PrimaryAccessContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Example1Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Example1Parser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Example1Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Example1Parser.IDENTIFIER, i);
		}
		public List<CallArgsContext> callArgs() {
			return getRuleContexts(CallArgsContext.class);
		}
		public CallArgsContext callArgs(int i) {
			return getRuleContext(CallArgsContext.class,i);
		}
		public List<IndexAccessContext> indexAccess() {
			return getRuleContexts(IndexAccessContext.class);
		}
		public IndexAccessContext indexAccess(int i) {
			return getRuleContext(IndexAccessContext.class,i);
		}
		public CallOrAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callOrAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCallOrAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCallOrAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCallOrAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallOrAccessContext callOrAccess() throws RecognitionException {
		CallOrAccessContext _localctx = new CallOrAccessContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_callOrAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			primaryAccess();
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(290);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						setState(286);
						match(DOT);
						setState(287);
						match(IDENTIFIER);
						}
						break;
					case OPEN_PAREN:
						{
						setState(288);
						callArgs();
						}
						break;
					case OPEN_BRACKET:
						{
						setState(289);
						indexAccess();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAccessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public PrimaryAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterPrimaryAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitPrimaryAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitPrimaryAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryAccessContext primaryAccess() throws RecognitionException {
		PrimaryAccessContext _localctx = new PrimaryAccessContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primaryAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallArgsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(Example1Parser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(Example1Parser.CLOSE_PAREN, 0); }
		public CallArgumentsContext callArguments() {
			return getRuleContext(CallArgumentsContext.class,0);
		}
		public CallArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgsContext callArgs() throws RecognitionException {
		CallArgsContext _localctx = new CallArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_callArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(OPEN_PAREN);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316711374848L) != 0)) {
				{
				setState(298);
				callArguments();
				}
			}

			setState(301);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexAccessContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(Example1Parser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Example1Parser.CLOSE_BRACKET, 0); }
		public IndexAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterIndexAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitIndexAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitIndexAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAccessContext indexAccess() throws RecognitionException {
		IndexAccessContext _localctx = new IndexAccessContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_indexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(OPEN_BRACKET);
			setState(304);
			expression(0);
			setState(305);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public CallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentsContext callArguments() throws RecognitionException {
		CallArgumentsContext _localctx = new CallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_callArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			argument();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(308);
				match(COMMA);
				setState(309);
				argument();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(Example1Parser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComprehensionContext comprehension() {
			return getRuleContext(ComprehensionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argument);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(IDENTIFIER);
				setState(316);
				match(EQ);
				setState(317);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				expression(0);
				setState(319);
				comprehension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(Example1Parser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(Example1Parser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(Example1Parser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(Example1Parser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(DEF);
			setState(325);
			match(IDENTIFIER);
			setState(326);
			match(OPEN_PAREN);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(327);
				params();
				}
			}

			setState(330);
			match(CLOSE_PAREN);
			setState(331);
			match(COLON);
			setState(332);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			parameter();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(335);
				match(COMMA);
				setState(336);
				parameter();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(Example1Parser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(Example1Parser.EQ, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(IDENTIFIER);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(343);
				match(COLON);
				setState(344);
				expression(0);
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(347);
				match(EQ);
				setState(348);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(Example1Parser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(Example1Parser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_classDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(CLASS);
			setState(352);
			match(IDENTIFIER);
			setState(353);
			match(COLON);
			setState(354);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(356);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(359); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Example1Parser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Example1Parser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElifStatementContext> elifStatement() {
			return getRuleContexts(ElifStatementContext.class);
		}
		public ElifStatementContext elifStatement(int i) {
			return getRuleContext(ElifStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(IF);
			setState(362);
			expression(0);
			setState(363);
			match(COLON);
			setState(364);
			block();
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(365);
					elifStatement();
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(371);
				elseStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElifStatementContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(Example1Parser.ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Example1Parser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElifStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterElifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitElifStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitElifStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifStatementContext elifStatement() throws RecognitionException {
		ElifStatementContext _localctx = new ElifStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(ELIF);
			setState(375);
			expression(0);
			setState(376);
			match(COLON);
			setState(377);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(Example1Parser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(Example1Parser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(ELSE);
			setState(380);
			match(COLON);
			setState(381);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStatementContext exprStatement() throws RecognitionException {
		ExprStatementContext _localctx = new ExprStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exprStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RouteDecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Example1Parser.AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(Example1Parser.DOT, 0); }
		public TerminalNode ROUTE() { return getToken(Example1Parser.ROUTE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(Example1Parser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(Example1Parser.CLOSE_PAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Example1Parser.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public RouteMethodsContext routeMethods() {
			return getRuleContext(RouteMethodsContext.class,0);
		}
		public RouteDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeDecorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterRouteDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitRouteDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitRouteDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteDecoratorContext routeDecorator() throws RecognitionException {
		RouteDecoratorContext _localctx = new RouteDecoratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_routeDecorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(AT);
			setState(386);
			match(IDENTIFIER);
			setState(387);
			match(DOT);
			setState(388);
			match(ROUTE);
			setState(389);
			match(OPEN_PAREN);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(390);
				match(STRING_LITERAL);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(391);
					match(COMMA);
					setState(392);
					routeMethods();
					}
				}

				}
			}

			setState(397);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RouteMethodsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(Example1Parser.EQ, 0); }
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public RouteMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterRouteMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitRouteMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitRouteMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteMethodsContext routeMethods() throws RecognitionException {
		RouteMethodsContext _localctx = new RouteMethodsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_routeMethods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(IDENTIFIER);
			setState(400);
			match(EQ);
			setState(401);
			listLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Example1Parser.LT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public TerminalNode GT() { return getToken(Example1Parser.GT, 0); }
		public TerminalNode HTML_CLOSE_TAG() { return getToken(Example1Parser.HTML_CLOSE_TAG, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentBodyContext> htmlContentBody() {
			return getRuleContexts(HtmlContentBodyContext.class);
		}
		public HtmlContentBodyContext htmlContentBody(int i) {
			return getRuleContext(HtmlContentBodyContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(Example1Parser.SLASH, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_htmlElement);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(LT);
				setState(404);
				match(IDENTIFIER);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460752345366528L) != 0)) {
					{
					{
					setState(405);
					htmlAttribute();
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(411);
				match(GT);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 898986565257134080L) != 0)) {
					{
					{
					setState(412);
					htmlContentBody();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(418);
				match(HTML_CLOSE_TAG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(LT);
				setState(420);
				match(IDENTIFIER);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460752345366528L) != 0)) {
					{
					{
					setState(421);
					htmlAttribute();
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(427);
				match(SLASH);
				setState(428);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public BasicAttributeContext basicAttribute() {
			return getRuleContext(BasicAttributeContext.class,0);
		}
		public BooleanAttributeContext booleanAttribute() {
			return getRuleContext(BooleanAttributeContext.class,0);
		}
		public EventAttributeContext eventAttribute() {
			return getRuleContext(EventAttributeContext.class,0);
		}
		public ImageAttributeContext imageAttribute() {
			return getRuleContext(ImageAttributeContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_htmlAttribute);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				basicAttribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				booleanAttribute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				eventAttribute();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				imageAttribute();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BasicAttributeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Example1Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Example1Parser.IDENTIFIER, i);
		}
		public TerminalNode EQ() { return getToken(Example1Parser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Example1Parser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(Example1Parser.NUMERIC_LITERAL, 0); }
		public BasicAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterBasicAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitBasicAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitBasicAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicAttributeContext basicAttribute() throws RecognitionException {
		BasicAttributeContext _localctx = new BasicAttributeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_basicAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(IDENTIFIER);
			setState(438);
			match(EQ);
			setState(439);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316530991104L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public BooleanAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterBooleanAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitBooleanAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitBooleanAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanAttributeContext booleanAttribute() throws RecognitionException {
		BooleanAttributeContext _localctx = new BooleanAttributeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_booleanAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImageAttributeContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(Example1Parser.OPEN_BRACKET, 0); }
		public TerminalNode IMAGE_SRC() { return getToken(Example1Parser.IMAGE_SRC, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(Example1Parser.CLOSE_BRACKET, 0); }
		public TerminalNode EQ() { return getToken(Example1Parser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Example1Parser.STRING_LITERAL, 0); }
		public ImageAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterImageAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitImageAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitImageAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageAttributeContext imageAttribute() throws RecognitionException {
		ImageAttributeContext _localctx = new ImageAttributeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_imageAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(OPEN_BRACKET);
			setState(444);
			match(IMAGE_SRC);
			setState(445);
			match(CLOSE_BRACKET);
			setState(446);
			match(EQ);
			setState(447);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventAttributeContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(Example1Parser.OPEN_PAREN, 0); }
		public TerminalNode CLICK() { return getToken(Example1Parser.CLICK, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(Example1Parser.CLOSE_PAREN, 0); }
		public TerminalNode EQ() { return getToken(Example1Parser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Example1Parser.STRING_LITERAL, 0); }
		public EventAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterEventAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitEventAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitEventAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventAttributeContext eventAttribute() throws RecognitionException {
		EventAttributeContext _localctx = new EventAttributeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_eventAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(OPEN_PAREN);
			setState(450);
			match(CLICK);
			setState(451);
			match(CLOSE_PAREN);
			setState(452);
			match(EQ);
			setState(453);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentBodyContext extends ParserRuleContext {
		public CssBlockContext cssBlock() {
			return getRuleContext(CssBlockContext.class,0);
		}
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public ObjectExpressionContext objectExpression() {
			return getRuleContext(ObjectExpressionContext.class,0);
		}
		public DjangoForBlockContext djangoForBlock() {
			return getRuleContext(DjangoForBlockContext.class,0);
		}
		public DjangoGeneralBlockContext djangoGeneralBlock() {
			return getRuleContext(DjangoGeneralBlockContext.class,0);
		}
		public TextNodeContext textNode() {
			return getRuleContext(TextNodeContext.class,0);
		}
		public HtmlContentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterHtmlContentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitHtmlContentBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitHtmlContentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentBodyContext htmlContentBody() throws RecognitionException {
		HtmlContentBodyContext _localctx = new HtmlContentBodyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_htmlContentBody);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				cssBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				htmlElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				objectExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				djangoForBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(459);
				djangoGeneralBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(460);
				textNode();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_INTERP() { return getToken(Example1Parser.OPEN_INTERP, 0); }
		public ObjectExpressionValueContext objectExpressionValue() {
			return getRuleContext(ObjectExpressionValueContext.class,0);
		}
		public TerminalNode CLOSE_INTERP() { return getToken(Example1Parser.CLOSE_INTERP, 0); }
		public ObjectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionContext objectExpression() throws RecognitionException {
		ObjectExpressionContext _localctx = new ObjectExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_objectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(OPEN_INTERP);
			setState(464);
			objectExpressionValue();
			setState(465);
			match(CLOSE_INTERP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExpressionValueContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Example1Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Example1Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Example1Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Example1Parser.DOT, i);
		}
		public ObjectExpressionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpressionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterObjectExpressionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitObjectExpressionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitObjectExpressionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionValueContext objectExpressionValue() throws RecognitionException {
		ObjectExpressionValueContext _localctx = new ObjectExpressionValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_objectExpressionValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(IDENTIFIER);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(468);
				match(DOT);
				setState(469);
				match(IDENTIFIER);
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContentContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public CssBlockContext cssBlock() {
			return getRuleContext(CssBlockContext.class,0);
		}
		public ObjectExpressionContext objectExpression() {
			return getRuleContext(ObjectExpressionContext.class,0);
		}
		public DjangoForBlockContext djangoForBlock() {
			return getRuleContext(DjangoForBlockContext.class,0);
		}
		public DjangoGeneralBlockContext djangoGeneralBlock() {
			return getRuleContext(DjangoGeneralBlockContext.class,0);
		}
		public TextNodeContext textNode() {
			return getRuleContext(TextNodeContext.class,0);
		}
		public TemplateContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterTemplateContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitTemplateContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitTemplateContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContentContext templateContent() throws RecognitionException {
		TemplateContentContext _localctx = new TemplateContentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_templateContent);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				htmlElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				cssBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				objectExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(478);
				djangoForBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(479);
				djangoGeneralBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(480);
				textNode();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DjangoForBlockContext extends ParserRuleContext {
		public TerminalNode OPEN_DJANGO() { return getToken(Example1Parser.OPEN_DJANGO, 0); }
		public TerminalNode DJANGO_FOR() { return getToken(Example1Parser.DJANGO_FOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Example1Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Example1Parser.IDENTIFIER, i);
		}
		public TerminalNode DJANGO_IN() { return getToken(Example1Parser.DJANGO_IN, 0); }
		public TerminalNode CLOSE_DJANGO() { return getToken(Example1Parser.CLOSE_DJANGO, 0); }
		public DjangoEndBlockContext djangoEndBlock() {
			return getRuleContext(DjangoEndBlockContext.class,0);
		}
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public DjangoForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_djangoForBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterDjangoForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitDjangoForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitDjangoForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DjangoForBlockContext djangoForBlock() throws RecognitionException {
		DjangoForBlockContext _localctx = new DjangoForBlockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_djangoForBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(OPEN_DJANGO);
			setState(484);
			match(DJANGO_FOR);
			setState(485);
			match(IDENTIFIER);
			setState(486);
			match(DJANGO_IN);
			setState(487);
			match(IDENTIFIER);
			setState(488);
			match(CLOSE_DJANGO);
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(489);
					templateContent();
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(495);
			djangoEndBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DjangoEndBlockContext extends ParserRuleContext {
		public TerminalNode OPEN_DJANGO() { return getToken(Example1Parser.OPEN_DJANGO, 0); }
		public TerminalNode DJANGO_ENDFOR() { return getToken(Example1Parser.DJANGO_ENDFOR, 0); }
		public TerminalNode CLOSE_DJANGO() { return getToken(Example1Parser.CLOSE_DJANGO, 0); }
		public DjangoEndBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_djangoEndBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterDjangoEndBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitDjangoEndBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitDjangoEndBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DjangoEndBlockContext djangoEndBlock() throws RecognitionException {
		DjangoEndBlockContext _localctx = new DjangoEndBlockContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_djangoEndBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(OPEN_DJANGO);
			setState(498);
			match(DJANGO_ENDFOR);
			setState(499);
			match(CLOSE_DJANGO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DjangoGeneralBlockContext extends ParserRuleContext {
		public TerminalNode OPEN_DJANGO() { return getToken(Example1Parser.OPEN_DJANGO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_DJANGO() { return getToken(Example1Parser.CLOSE_DJANGO, 0); }
		public List<DjangoArgsContext> djangoArgs() {
			return getRuleContexts(DjangoArgsContext.class);
		}
		public DjangoArgsContext djangoArgs(int i) {
			return getRuleContext(DjangoArgsContext.class,i);
		}
		public DjangoGeneralBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_djangoGeneralBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterDjangoGeneralBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitDjangoGeneralBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitDjangoGeneralBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DjangoGeneralBlockContext djangoGeneralBlock() throws RecognitionException {
		DjangoGeneralBlockContext _localctx = new DjangoGeneralBlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_djangoGeneralBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(OPEN_DJANGO);
			setState(502);
			match(IDENTIFIER);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1011058116525060096L) != 0)) {
				{
				{
				setState(503);
				djangoArgs();
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
			match(CLOSE_DJANGO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DjangoArgsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Example1Parser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Example1Parser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(Example1Parser.NUMERIC_LITERAL, 0); }
		public TerminalNode DOT() { return getToken(Example1Parser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DjangoArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_djangoArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterDjangoArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitDjangoArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitDjangoArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DjangoArgsContext djangoArgs() throws RecognitionException {
		DjangoArgsContext _localctx = new DjangoArgsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_djangoArgs);
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				match(NUMERIC_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				match(DOT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(515);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssBlockContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode OPEN_CURLY_BRACE() { return getToken(Example1Parser.OPEN_CURLY_BRACE, 0); }
		public TerminalNode CLOSE_CURLY_BRACE() { return getToken(Example1Parser.CLOSE_CURLY_BRACE, 0); }
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public CssBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCssBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCssBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCssBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBlockContext cssBlock() throws RecognitionException {
		CssBlockContext _localctx = new CssBlockContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cssBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			selector();
			setState(519);
			match(OPEN_CURLY_BRACE);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(520);
				cssRule();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			match(CLOSE_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Example1Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Example1Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Example1Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Example1Parser.DOT, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_selector);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOT) {
						{
						setState(528);
						match(DOT);
						}
					}

					setState(531);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(534); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(536);
				match(DOT);
				setState(537);
				match(IDENTIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends ParserRuleContext {
		public CssPropertyContext cssProperty() {
			return getRuleContext(CssPropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Example1Parser.COLON, 0); }
		public CssValueListContext cssValueList() {
			return getRuleContext(CssValueListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_cssRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			cssProperty();
			setState(541);
			match(COLON);
			setState(542);
			cssValueList();
			setState(543);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssPropertyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Example1Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Example1Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Example1Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Example1Parser.MINUS, i);
		}
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCssProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCssProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(IDENTIFIER);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(546);
				match(MINUS);
				setState(547);
				match(IDENTIFIER);
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueListContext extends ParserRuleContext {
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public List<RuleSeparatorContext> ruleSeparator() {
			return getRuleContexts(RuleSeparatorContext.class);
		}
		public RuleSeparatorContext ruleSeparator(int i) {
			return getRuleContext(RuleSeparatorContext.class,i);
		}
		public CssValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCssValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCssValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCssValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueListContext cssValueList() throws RecognitionException {
		CssValueListContext _localctx = new CssValueListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_cssValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			cssValue();
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1049338713177325568L) != 0)) {
				{
				{
				setState(554);
				ruleSeparator();
				setState(555);
				cssValue();
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Example1Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Example1Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Example1Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Example1Parser.MINUS, i);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(Example1Parser.NUMERIC_LITERAL, 0); }
		public TerminalNode PX() { return getToken(Example1Parser.PX, 0); }
		public TerminalNode COLOR() { return getToken(Example1Parser.COLOR, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Example1Parser.STRING_LITERAL, 0); }
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_cssValue);
		int _la;
		try {
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				match(IDENTIFIER);
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(563);
					match(MINUS);
					setState(564);
					match(IDENTIFIER);
					}
					}
					setState(569);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(NUMERIC_LITERAL);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PX) {
					{
					setState(571);
					match(PX);
					}
				}

				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				match(COLOR);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSeparatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public RuleSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterRuleSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitRuleSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitRuleSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSeparatorContext ruleSeparator() throws RecognitionException {
		RuleSeparatorContext _localctx = new RuleSeparatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ruleSeparator);
		try {
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(COMMA);
				}
				break;
			case COLOR:
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStringContext extends ParserRuleContext {
		public List<TerminalNode> TRIPLE_QUOTE() { return getTokens(Example1Parser.TRIPLE_QUOTE); }
		public TerminalNode TRIPLE_QUOTE(int i) {
			return getToken(Example1Parser.TRIPLE_QUOTE, i);
		}
		public TemplateDocumentContext templateDocument() {
			return getRuleContext(TemplateDocumentContext.class,0);
		}
		public TemplateStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterTemplateString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitTemplateString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitTemplateString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStringContext templateString() throws RecognitionException {
		TemplateStringContext _localctx = new TemplateStringContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_templateString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(TRIPLE_QUOTE);
			setState(583);
			templateDocument();
			setState(584);
			match(TRIPLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateDocumentContext extends ParserRuleContext {
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public TemplateDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterTemplateDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitTemplateDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitTemplateDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDocumentContext templateDocument() throws RecognitionException {
		TemplateDocumentContext _localctx = new TemplateDocumentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_templateDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 898986565257134080L) != 0)) {
				{
				{
				setState(586);
				templateContent();
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextNodeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Example1Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Example1Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(Example1Parser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(Example1Parser.NUMERIC_LITERAL, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Example1Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Example1Parser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Example1Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Example1Parser.SEMICOLON, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Example1Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Example1Parser.DOT, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(Example1Parser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(Example1Parser.PERCENT, i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(Example1Parser.EXCLAMATION); }
		public TerminalNode EXCLAMATION(int i) {
			return getToken(Example1Parser.EXCLAMATION, i);
		}
		public List<TerminalNode> QUESTION() { return getTokens(Example1Parser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(Example1Parser.QUESTION, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Example1Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Example1Parser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Example1Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Example1Parser.PLUS, i);
		}
		public List<TerminalNode> EQ() { return getTokens(Example1Parser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(Example1Parser.EQ, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(Example1Parser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(Example1Parser.SLASH, i);
		}
		public List<TerminalNode> LT() { return getTokens(Example1Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(Example1Parser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(Example1Parser.GT); }
		public TerminalNode GT(int i) {
			return getToken(Example1Parser.GT, i);
		}
		public TextNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterTextNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitTextNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitTextNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextNodeContext textNode() throws RecognitionException {
		TextNodeContext _localctx = new TextNodeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_textNode);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(592);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 898986562572779520L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(595); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u0256\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0001\u0000\u0005\u0000"+
		"x\b\u0000\n\u0000\f\u0000{\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0088\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u008c\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0090\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0094\b\u0002\u0003\u0002\u0096"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u009c"+
		"\b\u0003\n\u0003\f\u0003\u009f\t\u0003\u0001\u0003\u0003\u0003\u00a2\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00a9\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ae"+
		"\b\u0004\u0003\u0004\u00b0\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00b5\b\u0005\n\u0005\f\u0005\u00b8\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0003\b\u00c2\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00d0\b\t\n\t\f\t\u00d3"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e1\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e9\b\u000b\n"+
		"\u000b\f\u000b\u00ec\t\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00f5\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00fb\b\u000f\n\u000f\f\u000f\u00fe\t\u000f"+
		"\u0001\u000f\u0003\u000f\u0101\b\u000f\u0003\u000f\u0103\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u010b\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0111\b\u0010\n\u0010\f\u0010\u0114\t\u0010\u0003\u0010\u0116\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0123\b\u0012\n\u0012\f\u0012\u0126\t\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u012c\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u0137\b\u0016\n\u0016\f\u0016\u013a\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0143\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0149\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0152\b\u0019\n"+
		"\u0019\f\u0019\u0155\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u015a\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u015e\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0004\u001c\u0166\b\u001c\u000b\u001c\f\u001c\u0167\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u016f\b\u001d\n"+
		"\u001d\f\u001d\u0172\t\u001d\u0001\u001d\u0003\u001d\u0175\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u018a\b!\u0003!\u018c\b!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u0197\b"+
		"#\n#\f#\u019a\t#\u0001#\u0001#\u0005#\u019e\b#\n#\f#\u01a1\t#\u0001#\u0001"+
		"#\u0001#\u0001#\u0005#\u01a7\b#\n#\f#\u01aa\t#\u0001#\u0001#\u0003#\u01ae"+
		"\b#\u0001$\u0001$\u0001$\u0001$\u0003$\u01b4\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u01ce\b)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0005+\u01d7\b+\n+\f+\u01da\t+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u01e2\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005"+
		"-\u01eb\b-\n-\f-\u01ee\t-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0005/\u01f9\b/\n/\f/\u01fc\t/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00030\u0205\b0\u00011\u00011\u00011\u00051\u020a"+
		"\b1\n1\f1\u020d\t1\u00011\u00011\u00012\u00032\u0212\b2\u00012\u00042"+
		"\u0215\b2\u000b2\f2\u0216\u00012\u00012\u00032\u021b\b2\u00013\u00013"+
		"\u00013\u00013\u00013\u00014\u00014\u00014\u00054\u0225\b4\n4\f4\u0228"+
		"\t4\u00015\u00015\u00015\u00015\u00055\u022e\b5\n5\f5\u0231\t5\u00016"+
		"\u00016\u00016\u00056\u0236\b6\n6\f6\u0239\t6\u00016\u00016\u00036\u023d"+
		"\b6\u00016\u00016\u00036\u0241\b6\u00017\u00017\u00037\u0245\b7\u0001"+
		"8\u00018\u00018\u00018\u00019\u00059\u024c\b9\n9\f9\u024f\t9\u0001:\u0004"+
		":\u0252\b:\u000b:\f:\u0253\u0001:\u0000\u0001\u0012;\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\u0000\u0006\u0001\u000012\u0001"+
		"\u0000#(\u0001\u0000),\u0002\u0000\f\u000e9:\u0001\u00009;\u0006\u0000"+
		"\"\"\'*,,.036:;\u0273\u0000y\u0001\u0000\u0000\u0000\u0002\u0087\u0001"+
		"\u0000\u0000\u0000\u0004\u0095\u0001\u0000\u0000\u0000\u0006\u0097\u0001"+
		"\u0000\u0000\u0000\b\u00af\u0001\u0000\u0000\u0000\n\u00b1\u0001\u0000"+
		"\u0000\u0000\f\u00b9\u0001\u0000\u0000\u0000\u000e\u00bb\u0001\u0000\u0000"+
		"\u0000\u0010\u00bf\u0001\u0000\u0000\u0000\u0012\u00c3\u0001\u0000\u0000"+
		"\u0000\u0014\u00e0\u0001\u0000\u0000\u0000\u0016\u00e2\u0001\u0000\u0000"+
		"\u0000\u0018\u00ed\u0001\u0000\u0000\u0000\u001a\u00f0\u0001\u0000\u0000"+
		"\u0000\u001c\u00f4\u0001\u0000\u0000\u0000\u001e\u010a\u0001\u0000\u0000"+
		"\u0000 \u010c\u0001\u0000\u0000\u0000\"\u0119\u0001\u0000\u0000\u0000"+
		"$\u011d\u0001\u0000\u0000\u0000&\u0127\u0001\u0000\u0000\u0000(\u0129"+
		"\u0001\u0000\u0000\u0000*\u012f\u0001\u0000\u0000\u0000,\u0133\u0001\u0000"+
		"\u0000\u0000.\u0142\u0001\u0000\u0000\u00000\u0144\u0001\u0000\u0000\u0000"+
		"2\u014e\u0001\u0000\u0000\u00004\u0156\u0001\u0000\u0000\u00006\u015f"+
		"\u0001\u0000\u0000\u00008\u0165\u0001\u0000\u0000\u0000:\u0169\u0001\u0000"+
		"\u0000\u0000<\u0176\u0001\u0000\u0000\u0000>\u017b\u0001\u0000\u0000\u0000"+
		"@\u017f\u0001\u0000\u0000\u0000B\u0181\u0001\u0000\u0000\u0000D\u018f"+
		"\u0001\u0000\u0000\u0000F\u01ad\u0001\u0000\u0000\u0000H\u01b3\u0001\u0000"+
		"\u0000\u0000J\u01b5\u0001\u0000\u0000\u0000L\u01b9\u0001\u0000\u0000\u0000"+
		"N\u01bb\u0001\u0000\u0000\u0000P\u01c1\u0001\u0000\u0000\u0000R\u01cd"+
		"\u0001\u0000\u0000\u0000T\u01cf\u0001\u0000\u0000\u0000V\u01d3\u0001\u0000"+
		"\u0000\u0000X\u01e1\u0001\u0000\u0000\u0000Z\u01e3\u0001\u0000\u0000\u0000"+
		"\\\u01f1\u0001\u0000\u0000\u0000^\u01f5\u0001\u0000\u0000\u0000`\u0204"+
		"\u0001\u0000\u0000\u0000b\u0206\u0001\u0000\u0000\u0000d\u0214\u0001\u0000"+
		"\u0000\u0000f\u021c\u0001\u0000\u0000\u0000h\u0221\u0001\u0000\u0000\u0000"+
		"j\u0229\u0001\u0000\u0000\u0000l\u0240\u0001\u0000\u0000\u0000n\u0244"+
		"\u0001\u0000\u0000\u0000p\u0246\u0001\u0000\u0000\u0000r\u024d\u0001\u0000"+
		"\u0000\u0000t\u0251\u0001\u0000\u0000\u0000vx\u0003\u0002\u0001\u0000"+
		"wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000|}\u0005\u0000\u0000\u0001}\u0001\u0001\u0000\u0000\u0000"+
		"~\u0088\u0003\b\u0004\u0000\u007f\u0088\u00030\u0018\u0000\u0080\u0081"+
		"\u0003B!\u0000\u0081\u0082\u00030\u0018\u0000\u0082\u0088\u0001\u0000"+
		"\u0000\u0000\u0083\u0088\u00036\u001b\u0000\u0084\u0088\u0003:\u001d\u0000"+
		"\u0085\u0088\u0003\u0006\u0003\u0000\u0086\u0088\u0003\u0004\u0002\u0000"+
		"\u0087~\u0001\u0000\u0000\u0000\u0087\u007f\u0001\u0000\u0000\u0000\u0087"+
		"\u0080\u0001\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087"+
		"\u0084\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0003\u0001\u0000\u0000\u0000\u0089"+
		"\u008b\u0003\u0010\b\u0000\u008a\u008c\u00055\u0000\u0000\u008b\u008a"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0096"+
		"\u0001\u0000\u0000\u0000\u008d\u008f\u0003\u000e\u0007\u0000\u008e\u0090"+
		"\u00055\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0096\u0001\u0000\u0000\u0000\u0091\u0093\u0003"+
		"@ \u0000\u0092\u0094\u00055\u0000\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000"+
		"\u0000\u0095\u0089\u0001\u0000\u0000\u0000\u0095\u008d\u0001\u0000\u0000"+
		"\u0000\u0095\u0091\u0001\u0000\u0000\u0000\u0096\u0005\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005\u000f\u0000\u0000\u0098\u009d\u0005;\u0000\u0000"+
		"\u0099\u009a\u00054\u0000\u0000\u009a\u009c\u0005;\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a1"+
		"\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a2"+
		"\u00055\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u0007\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0003\u0000\u0000\u00a4\u00a5\u0005;\u0000\u0000\u00a5\u00a6\u0005\u0004"+
		"\u0000\u0000\u00a6\u00a8\u0003\n\u0005\u0000\u00a7\u00a9\u00055\u0000"+
		"\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00b0\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0004\u0000"+
		"\u0000\u00ab\u00ad\u0003\n\u0005\u0000\u00ac\u00ae\u00055\u0000\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00a3\u0001\u0000\u0000\u0000"+
		"\u00af\u00aa\u0001\u0000\u0000\u0000\u00b0\t\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b6\u0003\f\u0006\u0000\u00b2\u00b3\u00054\u0000\u0000\u00b3\u00b5"+
		"\u0003\f\u0006\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u000b\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0005;\u0000\u0000\u00ba\r\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005;\u0000\u0000\u00bc\u00bd\u0005\"\u0000"+
		"\u0000\u00bd\u00be\u0003\u0012\t\u0000\u00be\u000f\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c1\u0005\u0006\u0000\u0000\u00c0\u00c2\u0003\u0012\t\u0000\u00c1"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u0011\u0001\u0000\u0000\u0000\u00c3\u00c4\u0006\t\uffff\uffff\u0000\u00c4"+
		"\u00c5\u0003\u0014\n\u0000\u00c5\u00d1\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\n\u0004\u0000\u0000\u00c7\u00c8\u0007\u0000\u0000\u0000\u00c8\u00d0\u0003"+
		"\u0012\t\u0005\u00c9\u00ca\n\u0003\u0000\u0000\u00ca\u00cb\u0007\u0001"+
		"\u0000\u0000\u00cb\u00d0\u0003\u0012\t\u0004\u00cc\u00cd\n\u0002\u0000"+
		"\u0000\u00cd\u00ce\u0007\u0002\u0000\u0000\u00ce\u00d0\u0003\u0012\t\u0003"+
		"\u00cf\u00c6\u0001\u0000\u0000\u0000\u00cf\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cc\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u0013\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d4\u00e1\u0003\u001a\r\u0000\u00d5\u00e1\u0003\u001c\u000e\u0000\u00d6"+
		"\u00e1\u0003p8\u0000\u00d7\u00d8\u0005\u0017\u0000\u0000\u00d8\u00d9\u0003"+
		"\u0012\t\u0000\u00d9\u00da\u0005\u0018\u0000\u0000\u00da\u00e1\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005\u0017\u0000\u0000\u00dc\u00dd\u0003\u0018"+
		"\f\u0000\u00dd\u00de\u0005\u0018\u0000\u0000\u00de\u00e1\u0001\u0000\u0000"+
		"\u0000\u00df\u00e1\u0003$\u0012\u0000\u00e0\u00d4\u0001\u0000\u0000\u0000"+
		"\u00e0\u00d5\u0001\u0000\u0000\u0000\u00e0\u00d6\u0001\u0000\u0000\u0000"+
		"\u00e0\u00d7\u0001\u0000\u0000\u0000\u00e0\u00db\u0001\u0000\u0000\u0000"+
		"\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u0015\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0005\u0011\u0000\u0000\u00e3\u00e4\u0005;\u0000\u0000\u00e4"+
		"\u00e5\u0005\u0012\u0000\u0000\u00e5\u00ea\u0003\u0012\t\u0000\u00e6\u00e7"+
		"\u0005\u0007\u0000\u0000\u00e7\u00e9\u0003\u0012\t\u0000\u00e8\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u0017\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003"+
		"\u0012\t\u0000\u00ee\u00ef\u0003\u0016\u000b\u0000\u00ef\u0019\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0007\u0003\u0000\u0000\u00f1\u001b\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f5\u0003\u001e\u000f\u0000\u00f3\u00f5\u0003 \u0010"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f5\u001d\u0001\u0000\u0000\u0000\u00f6\u0102\u0005\u0019\u0000"+
		"\u0000\u00f7\u00fc\u0003\u0012\t\u0000\u00f8\u00f9\u00054\u0000\u0000"+
		"\u00f9\u00fb\u0003\u0012\t\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00ff\u0101\u00054\u0000\u0000\u0100\u00ff"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103"+
		"\u0001\u0000\u0000\u0000\u0102\u00f7\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u010b"+
		"\u0005\u001a\u0000\u0000\u0105\u0106\u0005\u0019\u0000\u0000\u0106\u0107"+
		"\u0003\u0012\t\u0000\u0107\u0108\u0003\u0016\u000b\u0000\u0108\u0109\u0005"+
		"\u001a\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u00f6\u0001"+
		"\u0000\u0000\u0000\u010a\u0105\u0001\u0000\u0000\u0000\u010b\u001f\u0001"+
		"\u0000\u0000\u0000\u010c\u0115\u0005\u001b\u0000\u0000\u010d\u0112\u0003"+
		"\"\u0011\u0000\u010e\u010f\u00054\u0000\u0000\u010f\u0111\u0003\"\u0011"+
		"\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000"+
		"\u0000\u0115\u010d\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u001c\u0000"+
		"\u0000\u0118!\u0001\u0000\u0000\u0000\u0119\u011a\u0003\u0012\t\u0000"+
		"\u011a\u011b\u00056\u0000\u0000\u011b\u011c\u0003\u0012\t\u0000\u011c"+
		"#\u0001\u0000\u0000\u0000\u011d\u0124\u0003&\u0013\u0000\u011e\u011f\u0005"+
		"3\u0000\u0000\u011f\u0123\u0005;\u0000\u0000\u0120\u0123\u0003(\u0014"+
		"\u0000\u0121\u0123\u0003*\u0015\u0000\u0122\u011e\u0001\u0000\u0000\u0000"+
		"\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125%\u0001\u0000\u0000\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0127\u0128\u0005;\u0000\u0000\u0128\'"+
		"\u0001\u0000\u0000\u0000\u0129\u012b\u0005\u0017\u0000\u0000\u012a\u012c"+
		"\u0003,\u0016\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012b\u012c\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0005"+
		"\u0018\u0000\u0000\u012e)\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u0019"+
		"\u0000\u0000\u0130\u0131\u0003\u0012\t\u0000\u0131\u0132\u0005\u001a\u0000"+
		"\u0000\u0132+\u0001\u0000\u0000\u0000\u0133\u0138\u0003.\u0017\u0000\u0134"+
		"\u0135\u00054\u0000\u0000\u0135\u0137\u0003.\u0017\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139-\u0001\u0000"+
		"\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013c\u0005;\u0000"+
		"\u0000\u013c\u013d\u0005\"\u0000\u0000\u013d\u0143\u0003\u0012\t\u0000"+
		"\u013e\u013f\u0003\u0012\t\u0000\u013f\u0140\u0003\u0016\u000b\u0000\u0140"+
		"\u0143\u0001\u0000\u0000\u0000\u0141\u0143\u0003\u0012\t\u0000\u0142\u013b"+
		"\u0001\u0000\u0000\u0000\u0142\u013e\u0001\u0000\u0000\u0000\u0142\u0141"+
		"\u0001\u0000\u0000\u0000\u0143/\u0001\u0000\u0000\u0000\u0144\u0145\u0005"+
		"\u0005\u0000\u0000\u0145\u0146\u0005;\u0000\u0000\u0146\u0148\u0005\u0017"+
		"\u0000\u0000\u0147\u0149\u00032\u0019\u0000\u0148\u0147\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0005\u0018\u0000\u0000\u014b\u014c\u00056\u0000\u0000"+
		"\u014c\u014d\u00038\u001c\u0000\u014d1\u0001\u0000\u0000\u0000\u014e\u0153"+
		"\u00034\u001a\u0000\u014f\u0150\u00054\u0000\u0000\u0150\u0152\u00034"+
		"\u001a\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000"+
		"\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000"+
		"\u0000\u0000\u01543\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0156\u0159\u0005;\u0000\u0000\u0157\u0158\u00056\u0000\u0000\u0158"+
		"\u015a\u0003\u0012\t\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0005\"\u0000\u0000\u015c\u015e\u0003\u0012\t\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e5\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0005\n\u0000\u0000\u0160\u0161\u0005;\u0000"+
		"\u0000\u0161\u0162\u00056\u0000\u0000\u0162\u0163\u00038\u001c\u0000\u0163"+
		"7\u0001\u0000\u0000\u0000\u0164\u0166\u0003\u0002\u0001\u0000\u0165\u0164"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0165"+
		"\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u01689\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0005\u0007\u0000\u0000\u016a\u016b\u0003"+
		"\u0012\t\u0000\u016b\u016c\u00056\u0000\u0000\u016c\u0170\u00038\u001c"+
		"\u0000\u016d\u016f\u0003<\u001e\u0000\u016e\u016d\u0001\u0000\u0000\u0000"+
		"\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000"+
		"\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0175\u0003>\u001f\u0000\u0174"+
		"\u0173\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		";\u0001\u0000\u0000\u0000\u0176\u0177\u0005\t\u0000\u0000\u0177\u0178"+
		"\u0003\u0012\t\u0000\u0178\u0179\u00056\u0000\u0000\u0179\u017a\u0003"+
		"8\u001c\u0000\u017a=\u0001\u0000\u0000\u0000\u017b\u017c\u0005\b\u0000"+
		"\u0000\u017c\u017d\u00056\u0000\u0000\u017d\u017e\u00038\u001c\u0000\u017e"+
		"?\u0001\u0000\u0000\u0000\u017f\u0180\u0003\u0012\t\u0000\u0180A\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0005-\u0000\u0000\u0182\u0183\u0005;\u0000"+
		"\u0000\u0183\u0184\u00053\u0000\u0000\u0184\u0185\u0005\u0010\u0000\u0000"+
		"\u0185\u018b\u0005\u0017\u0000\u0000\u0186\u0189\u00059\u0000\u0000\u0187"+
		"\u0188\u00054\u0000\u0000\u0188\u018a\u0003D\"\u0000\u0189\u0187\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c\u0001"+
		"\u0000\u0000\u0000\u018b\u0186\u0001\u0000\u0000\u0000\u018b\u018c\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0005"+
		"\u0018\u0000\u0000\u018eC\u0001\u0000\u0000\u0000\u018f\u0190\u0005;\u0000"+
		"\u0000\u0190\u0191\u0005\"\u0000\u0000\u0191\u0192\u0003\u001e\u000f\u0000"+
		"\u0192E\u0001\u0000\u0000\u0000\u0193\u0194\u0005\'\u0000\u0000\u0194"+
		"\u0198\u0005;\u0000\u0000\u0195\u0197\u0003H$\u0000\u0196\u0195\u0001"+
		"\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019b\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019f\u0005"+
		"(\u0000\u0000\u019c\u019e\u0003R)\u0000\u019d\u019c\u0001\u0000\u0000"+
		"\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000"+
		"\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2\u01ae\u0005!\u0000\u0000"+
		"\u01a3\u01a4\u0005\'\u0000\u0000\u01a4\u01a8\u0005;\u0000\u0000\u01a5"+
		"\u01a7\u0003H$\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u0005,\u0000\u0000\u01ac\u01ae\u0005(\u0000"+
		"\u0000\u01ad\u0193\u0001\u0000\u0000\u0000\u01ad\u01a3\u0001\u0000\u0000"+
		"\u0000\u01aeG\u0001\u0000\u0000\u0000\u01af\u01b4\u0003J%\u0000\u01b0"+
		"\u01b4\u0003L&\u0000\u01b1\u01b4\u0003P(\u0000\u01b2\u01b4\u0003N\'\u0000"+
		"\u01b3\u01af\u0001\u0000\u0000\u0000\u01b3\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b4I\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005;\u0000\u0000\u01b6\u01b7"+
		"\u0005\"\u0000\u0000\u01b7\u01b8\u0007\u0004\u0000\u0000\u01b8K\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0005;\u0000\u0000\u01baM\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0005\u0019\u0000\u0000\u01bc\u01bd\u0005\u0015\u0000"+
		"\u0000\u01bd\u01be\u0005\u001a\u0000\u0000\u01be\u01bf\u0005\"\u0000\u0000"+
		"\u01bf\u01c0\u00059\u0000\u0000\u01c0O\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0005\u0017\u0000\u0000\u01c2\u01c3\u0005\u0014\u0000\u0000\u01c3\u01c4"+
		"\u0005\u0018\u0000\u0000\u01c4\u01c5\u0005\"\u0000\u0000\u01c5\u01c6\u0005"+
		"9\u0000\u0000\u01c6Q\u0001\u0000\u0000\u0000\u01c7\u01ce\u0003b1\u0000"+
		"\u01c8\u01ce\u0003F#\u0000\u01c9\u01ce\u0003T*\u0000\u01ca\u01ce\u0003"+
		"Z-\u0000\u01cb\u01ce\u0003^/\u0000\u01cc\u01ce\u0003t:\u0000\u01cd\u01c7"+
		"\u0001\u0000\u0000\u0000\u01cd\u01c8\u0001\u0000\u0000\u0000\u01cd\u01c9"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ca\u0001\u0000\u0000\u0000\u01cd\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ceS\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d0\u0005\u001d\u0000\u0000\u01d0\u01d1\u0003"+
		"V+\u0000\u01d1\u01d2\u0005\u001e\u0000\u0000\u01d2U\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d8\u0005;\u0000\u0000\u01d4\u01d5\u00053\u0000\u0000\u01d5"+
		"\u01d7\u0005;\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01da"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9W\u0001\u0000\u0000\u0000\u01da\u01d8\u0001"+
		"\u0000\u0000\u0000\u01db\u01e2\u0003F#\u0000\u01dc\u01e2\u0003b1\u0000"+
		"\u01dd\u01e2\u0003T*\u0000\u01de\u01e2\u0003Z-\u0000\u01df\u01e2\u0003"+
		"^/\u0000\u01e0\u01e2\u0003t:\u0000\u01e1\u01db\u0001\u0000\u0000\u0000"+
		"\u01e1\u01dc\u0001\u0000\u0000\u0000\u01e1\u01dd\u0001\u0000\u0000\u0000"+
		"\u01e1\u01de\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2Y\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0005\u001f\u0000\u0000\u01e4\u01e5\u0005\u0011\u0000\u0000\u01e5"+
		"\u01e6\u0005;\u0000\u0000\u01e6\u01e7\u0005\u0012\u0000\u0000\u01e7\u01e8"+
		"\u0005;\u0000\u0000\u01e8\u01ec\u0005 \u0000\u0000\u01e9\u01eb\u0003X"+
		",\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ef\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0003\\.\u0000\u01f0[\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f2\u0005\u001f\u0000\u0000\u01f2\u01f3\u0005\u0013\u0000\u0000\u01f3"+
		"\u01f4\u0005 \u0000\u0000\u01f4]\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005"+
		"\u001f\u0000\u0000\u01f6\u01fa\u0005;\u0000\u0000\u01f7\u01f9\u0003`0"+
		"\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fd\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0005 \u0000\u0000\u01fe_\u0001\u0000\u0000\u0000\u01ff"+
		"\u0205\u0005;\u0000\u0000\u0200\u0205\u00059\u0000\u0000\u0201\u0205\u0005"+
		":\u0000\u0000\u0202\u0205\u00053\u0000\u0000\u0203\u0205\u0003\u0012\t"+
		"\u0000\u0204\u01ff\u0001\u0000\u0000\u0000\u0204\u0200\u0001\u0000\u0000"+
		"\u0000\u0204\u0201\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000"+
		"\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0205a\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0003d2\u0000\u0207\u020b\u0005\u001b\u0000\u0000\u0208\u020a"+
		"\u0003f3\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000"+
		"\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000"+
		"\u0000\u0000\u020c\u020e\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000"+
		"\u0000\u0000\u020e\u020f\u0005\u001c\u0000\u0000\u020fc\u0001\u0000\u0000"+
		"\u0000\u0210\u0212\u00053\u0000\u0000\u0211\u0210\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000"+
		"\u0213\u0215\u0005;\u0000\u0000\u0214\u0211\u0001\u0000\u0000\u0000\u0215"+
		"\u0216\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0001\u0000\u0000\u0000\u0217\u021a\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u00053\u0000\u0000\u0219\u021b\u0005;\u0000\u0000\u021a\u0218\u0001"+
		"\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021be\u0001\u0000"+
		"\u0000\u0000\u021c\u021d\u0003h4\u0000\u021d\u021e\u00056\u0000\u0000"+
		"\u021e\u021f\u0003j5\u0000\u021f\u0220\u00055\u0000\u0000\u0220g\u0001"+
		"\u0000\u0000\u0000\u0221\u0226\u0005;\u0000\u0000\u0222\u0223\u0005*\u0000"+
		"\u0000\u0223\u0225\u0005;\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000"+
		"\u0225\u0228\u0001\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000"+
		"\u0226\u0227\u0001\u0000\u0000\u0000\u0227i\u0001\u0000\u0000\u0000\u0228"+
		"\u0226\u0001\u0000\u0000\u0000\u0229\u022f\u0003l6\u0000\u022a\u022b\u0003"+
		"n7\u0000\u022b\u022c\u0003l6\u0000\u022c\u022e\u0001\u0000\u0000\u0000"+
		"\u022d\u022a\u0001\u0000\u0000\u0000\u022e\u0231\u0001\u0000\u0000\u0000"+
		"\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000"+
		"\u0230k\u0001\u0000\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0232"+
		"\u0237\u0005;\u0000\u0000\u0233\u0234\u0005*\u0000\u0000\u0234\u0236\u0005"+
		";\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u0239\u0001\u0000"+
		"\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000"+
		"\u0000\u0000\u0238\u0241\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000"+
		"\u0000\u0000\u023a\u023c\u0005:\u0000\u0000\u023b\u023d\u00058\u0000\u0000"+
		"\u023c\u023b\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000"+
		"\u023d\u0241\u0001\u0000\u0000\u0000\u023e\u0241\u00057\u0000\u0000\u023f"+
		"\u0241\u00059\u0000\u0000\u0240\u0232\u0001\u0000\u0000\u0000\u0240\u023a"+
		"\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u023f"+
		"\u0001\u0000\u0000\u0000\u0241m\u0001\u0000\u0000\u0000\u0242\u0245\u0005"+
		"4\u0000\u0000\u0243\u0245\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000"+
		"\u0000\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0245o\u0001\u0000\u0000"+
		"\u0000\u0246\u0247\u0005\u0016\u0000\u0000\u0247\u0248\u0003r9\u0000\u0248"+
		"\u0249\u0005\u0016\u0000\u0000\u0249q\u0001\u0000\u0000\u0000\u024a\u024c"+
		"\u0003X,\u0000\u024b\u024a\u0001\u0000\u0000\u0000\u024c\u024f\u0001\u0000"+
		"\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000"+
		"\u0000\u0000\u024es\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000"+
		"\u0000\u0250\u0252\u0007\u0005\u0000\u0000\u0251\u0250\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254u\u0001\u0000\u0000\u0000"+
		"=y\u0087\u008b\u008f\u0093\u0095\u009d\u00a1\u00a8\u00ad\u00af\u00b6\u00c1"+
		"\u00cf\u00d1\u00e0\u00ea\u00f4\u00fc\u0100\u0102\u010a\u0112\u0115\u0122"+
		"\u0124\u012b\u0138\u0142\u0148\u0153\u0159\u015d\u0167\u0170\u0174\u0189"+
		"\u018b\u0198\u019f\u01a8\u01ad\u01b3\u01cd\u01d8\u01e1\u01ec\u01fa\u0204"+
		"\u020b\u0211\u0216\u021a\u0226\u022f\u0237\u023c\u0240\u0244\u024d\u0253";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}