// Generated from /home/imdnos/Documents/java/compiler/angularCompiler/antlr/AngularParser.g4 by ANTLR 4.13.2

package gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AT_COMPONENT=1, EXPORT=2, CLASS=3, SELECTOR=4, STANDALONE=5, IMPORTS=6, 
		STYLES=7, TEMPLATE=8, TRUE=9, FALSE=10, LBRACE=11, RBRACE=12, LPARENTHESIS=13, 
		RPARENTHESIS=14, LBRACKET=15, RBRACKET=16, COLON=17, COMMA=18, STRING=19, 
		BACKTICK=20, SEMICOLON=21, DISPLAY=22, MARGIN=23, FONT_FAMILY=24, PADDING=25, 
		WIDTH=26, BORDER_RIGHT=27, OVERFLOW_Y=28, BORDER=29, CURSOR=30, TRANSITION=31, 
		HEIGHT=32, MARGIN_RIGHT=33, BORDER_SOLID=34, COLOR=35, NUMERIC_VALUE=36, 
		COLOR_VALUE=37, CSS_SELECTOR=38, EQUAL_SIGN=39, NUMBER=40, STRINGDL=41, 
		BOOLEAN=42, ANY=43, VOID=44, NULL=45, THIS=46, LET=47, ANGULAR_DIRECTIVE=48, 
		ANGULAR_EVENT=49, ANGULAR_PROPERTY=50, ANGULAR_BINDING=51, TAG_OPEN=52, 
		TAG_CLOSE=53, TAG_OPEN_SELF=54, ATTRIBUTE=55, ANGULAR_ATTRIBUTE_DIRECTIVE=56, 
		ANGULAR_ATTRIBUTE_PROPERTY=57, ANGULAR_ATTRIBUTE_EVENT=58, ID=59, WS=60, 
		COMMENT=61;
	public static final int
		RULE_program = 0, RULE_componentDeclaration = 1, RULE_option = 2, RULE_ts = 3, 
		RULE_globals = 4, RULE_attribute = 5, RULE_expression = 6, RULE_constructor = 7, 
		RULE_type = 8, RULE_literal = 9, RULE_array = 10, RULE_keyValuePair = 11, 
		RULE_method = 12, RULE_methodParams = 13, RULE_param = 14, RULE_body = 15, 
		RULE_html = 16, RULE_element = 17, RULE_htmlAttribute = 18, RULE_content = 19, 
		RULE_cssDeclaration = 20, RULE_cssProperty = 21, RULE_property = 22, RULE_propertyValue = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "componentDeclaration", "option", "ts", "globals", "attribute", 
			"expression", "constructor", "type", "literal", "array", "keyValuePair", 
			"method", "methodParams", "param", "body", "html", "element", "htmlAttribute", 
			"content", "cssDeclaration", "cssProperty", "property", "propertyValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@Component'", "'export'", "'class'", "'selector'", "'standalone'", 
			"'imports'", "'styles'", "'template'", "'true'", "'false'", "'{'", "'}'", 
			"'('", "')'", "'['", "']'", "':'", "','", null, "'`'", "';'", "'display'", 
			"'margin'", "'font-family'", "'padding'", "'width'", "'border-right'", 
			"'overflow-y'", "'border'", "'cursor'", "'transition'", "'height'", "'margin-right'", 
			"'border-solid'", "'color'", null, null, null, "'='", "'number'", "'string'", 
			"'boolean'", "'any'", "'void'", "'null'", "'this.'", "'let'", null, null, 
			null, null, "'<'", "'>'", "'</'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AT_COMPONENT", "EXPORT", "CLASS", "SELECTOR", "STANDALONE", "IMPORTS", 
			"STYLES", "TEMPLATE", "TRUE", "FALSE", "LBRACE", "RBRACE", "LPARENTHESIS", 
			"RPARENTHESIS", "LBRACKET", "RBRACKET", "COLON", "COMMA", "STRING", "BACKTICK", 
			"SEMICOLON", "DISPLAY", "MARGIN", "FONT_FAMILY", "PADDING", "WIDTH", 
			"BORDER_RIGHT", "OVERFLOW_Y", "BORDER", "CURSOR", "TRANSITION", "HEIGHT", 
			"MARGIN_RIGHT", "BORDER_SOLID", "COLOR", "NUMERIC_VALUE", "COLOR_VALUE", 
			"CSS_SELECTOR", "EQUAL_SIGN", "NUMBER", "STRINGDL", "BOOLEAN", "ANY", 
			"VOID", "NULL", "THIS", "LET", "ANGULAR_DIRECTIVE", "ANGULAR_EVENT", 
			"ANGULAR_PROPERTY", "ANGULAR_BINDING", "TAG_OPEN", "TAG_CLOSE", "TAG_OPEN_SELF", 
			"ATTRIBUTE", "ANGULAR_ATTRIBUTE_DIRECTIVE", "ANGULAR_ATTRIBUTE_PROPERTY", 
			"ANGULAR_ATTRIBUTE_EVENT", "ID", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			componentDeclaration();
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
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode AT_COMPONENT() { return getToken(AngularParser.AT_COMPONENT, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(AngularParser.LPARENTHESIS, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(AngularParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(AngularParser.LBRACE, i);
		}
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(AngularParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(AngularParser.RBRACE, i);
		}
		public TerminalNode RPARENTHESIS() { return getToken(AngularParser.RPARENTHESIS, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TsContext ts() {
			return getRuleContext(TsContext.class,0);
		}
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode STANDALONE() { return getToken(AngularParser.STANDALONE, 0); }
		public TerminalNode TRUE() { return getToken(AngularParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AngularParser.FALSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_componentDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(AT_COMPONENT);
			setState(51);
			match(LPARENTHESIS);
			setState(52);
			match(LBRACE);
			{
			setState(53);
			match(SELECTOR);
			setState(54);
			match(COLON);
			setState(55);
			match(STRING);
			setState(56);
			match(STANDALONE);
			setState(57);
			match(COLON);
			setState(58);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			setState(60);
			option();
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					match(COMMA);
					setState(62);
					option();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(68);
				match(COMMA);
				}
			}

			setState(71);
			match(RBRACE);
			setState(72);
			match(RPARENTHESIS);
			setState(73);
			match(EXPORT);
			setState(74);
			match(CLASS);
			setState(75);
			match(ID);
			setState(76);
			match(LBRACE);
			setState(77);
			ts();
			setState(78);
			match(RBRACE);
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
	public static class OptionContext extends ParserRuleContext {
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
	 
		public OptionContext() { }
		public void copyFrom(OptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssOptionContext extends OptionContext {
		public TerminalNode STYLES() { return getToken(AngularParser.STYLES, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(AngularParser.LBRACKET, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public TerminalNode RBRACKET() { return getToken(AngularParser.RBRACKET, 0); }
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public CssOptionContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssOption(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlOptionContext extends OptionContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public HtmlOptionContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_option);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLES:
				_localctx = new CssOptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(STYLES);
				setState(81);
				match(COLON);
				setState(82);
				match(LBRACKET);
				setState(83);
				match(BACKTICK);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_SELECTOR) {
					{
					{
					setState(84);
					cssDeclaration();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(BACKTICK);
				setState(91);
				match(RBRACKET);
				}
				break;
			case TEMPLATE:
				_localctx = new HtmlOptionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(TEMPLATE);
				setState(93);
				match(COLON);
				setState(94);
				match(BACKTICK);
				setState(95);
				html();
				setState(96);
				match(BACKTICK);
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
	public static class TsContext extends ParserRuleContext {
		public List<GlobalsContext> globals() {
			return getRuleContexts(GlobalsContext.class);
		}
		public GlobalsContext globals(int i) {
			return getRuleContext(GlobalsContext.class,i);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsContext ts() throws RecognitionException {
		TsContext _localctx = new TsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					globals();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPARENTHESIS) {
				{
				setState(106);
				constructor();
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(109);
				globals();
				}
				}
				setState(114);
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
	public static class GlobalsContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public GlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGlobals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGlobals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGlobals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_globals);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				method();
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(120);
			match(COLON);
			setState(121);
			type();
			setState(122);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode EQUAL_SIGN() { return getToken(AngularParser.EQUAL_SIGN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(LET);
				setState(125);
				match(ID);
				setState(126);
				match(COLON);
				setState(127);
				type();
				setState(128);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(LET);
				setState(131);
				match(ID);
				setState(132);
				match(COLON);
				setState(133);
				type();
				setState(134);
				match(EQUAL_SIGN);
				setState(137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case LBRACE:
				case STRING:
				case NUMERIC_VALUE:
				case ID:
					{
					setState(135);
					literal();
					}
					break;
				case LBRACKET:
					{
					setState(136);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(141);
					match(THIS);
					}
				}

				setState(144);
				match(ID);
				setState(145);
				match(EQUAL_SIGN);
				setState(148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case LBRACE:
				case STRING:
				case NUMERIC_VALUE:
				case ID:
					{
					setState(146);
					literal();
					}
					break;
				case LBRACKET:
					{
					setState(147);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150);
				match(SEMICOLON);
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
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode LPARENTHESIS() { return getToken(AngularParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(AngularParser.RPARENTHESIS, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(LPARENTHESIS);
			setState(155);
			match(RPARENTHESIS);
			setState(156);
			match(LBRACE);
			setState(157);
			body();
			setState(158);
			match(RBRACE);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode STRINGDL() { return getToken(AngularParser.STRINGDL, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674416640L) != 0)) ) {
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(AngularParser.NUMERIC_VALUE, 0); }
		public TerminalNode TRUE() { return getToken(AngularParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AngularParser.FALSE, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<KeyValuePairContext> keyValuePair() {
			return getRuleContexts(KeyValuePairContext.class);
		}
		public KeyValuePairContext keyValuePair(int i) {
			return getRuleContext(KeyValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(STRING);
				}
				break;
			case NUMERIC_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(NUMERIC_VALUE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(FALSE);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				match(LBRACE);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(168);
					keyValuePair();
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(169);
						match(COMMA);
						setState(170);
						keyValuePair();
						}
						}
						setState(175);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(178);
				match(RBRACE);
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
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(AngularParser.LBRACKET, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(AngularParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LBRACKET);
			setState(182);
			literal();
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					match(COMMA);
					setState(184);
					literal();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(190);
				match(COMMA);
				}
			}

			setState(193);
			match(RBRACKET);
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
	public static class KeyValuePairContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public KeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterKeyValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitKeyValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitKeyValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValuePairContext keyValuePair() throws RecognitionException {
		KeyValuePairContext _localctx = new KeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_keyValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID);
			setState(196);
			match(COLON);
			setState(197);
			literal();
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
	public static class MethodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(AngularParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(AngularParser.RPARENTHESIS, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public MethodParamsContext methodParams() {
			return getRuleContext(MethodParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(AngularParser.VOID, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ID);
			setState(200);
			match(LPARENTHESIS);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(201);
				methodParams();
				}
			}

			setState(204);
			match(RPARENTHESIS);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(205);
				match(COLON);
				setState(208);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
				case STRINGDL:
				case BOOLEAN:
				case ANY:
					{
					setState(206);
					type();
					}
					break;
				case VOID:
					{
					setState(207);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(212);
			match(LBRACE);
			setState(213);
			body();
			setState(214);
			match(RBRACE);
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
	public static class MethodParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public MethodParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParamsContext methodParams() throws RecognitionException {
		MethodParamsContext _localctx = new MethodParamsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			param();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(217);
				match(COMMA);
				setState(218);
				param();
				}
				}
				setState(223);
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
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ID);
			setState(225);
			match(COLON);
			setState(226);
			type();
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
	public static class BodyContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576671858535956480L) != 0)) {
				{
				{
				setState(228);
				expression();
				}
				}
				setState(233);
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
	public static class HtmlContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_html);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_OPEN) {
				{
				{
				setState(234);
				element();
				}
				}
				setState(239);
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
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(AngularParser.TAG_OPEN, 0); }
		public List<TerminalNode> TAG_CLOSE() { return getTokens(AngularParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(AngularParser.TAG_CLOSE, i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<TerminalNode> TAG_OPEN_SELF() { return getTokens(AngularParser.TAG_OPEN_SELF); }
		public TerminalNode TAG_OPEN_SELF(int i) {
			return getToken(AngularParser.TAG_OPEN_SELF, i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_element);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(TAG_OPEN);
			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241);
				content();
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 583216151745003520L) != 0) );
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 540431955284459520L) != 0)) {
				{
				{
				setState(246);
				htmlAttribute();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			match(TAG_CLOSE);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(253);
							content();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(256); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(258);
							match(TAG_OPEN_SELF);
							setState(260); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(259);
								content();
								}
								}
								setState(262); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 583216151745003520L) != 0) );
							setState(264);
							match(TAG_CLOSE);
							}
							} 
						}
						setState(270);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					}
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(AngularParser.ATTRIBUTE, 0); }
		public TerminalNode ANGULAR_ATTRIBUTE_DIRECTIVE() { return getToken(AngularParser.ANGULAR_ATTRIBUTE_DIRECTIVE, 0); }
		public TerminalNode ANGULAR_ATTRIBUTE_PROPERTY() { return getToken(AngularParser.ANGULAR_ATTRIBUTE_PROPERTY, 0); }
		public TerminalNode ANGULAR_ATTRIBUTE_EVENT() { return getToken(AngularParser.ANGULAR_ATTRIBUTE_EVENT, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 540431955284459520L) != 0)) ) {
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
	public static class ContentContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode ANGULAR_BINDING() { return getToken(AngularParser.ANGULAR_BINDING, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_content);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				element();
				}
				break;
			case ANGULAR_BINDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(ANGULAR_BINDING);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				match(ID);
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
	public static class CssDeclarationContext extends ParserRuleContext {
		public TerminalNode CSS_SELECTOR() { return getToken(AngularParser.CSS_SELECTOR, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public List<CssPropertyContext> cssProperty() {
			return getRuleContexts(CssPropertyContext.class);
		}
		public CssPropertyContext cssProperty(int i) {
			return getRuleContext(CssPropertyContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AngularParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngularParser.SEMICOLON, i);
		}
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cssDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(CSS_SELECTOR);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(285);
				match(ID);
				}
			}

			setState(288);
			match(LBRACE);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68715282432L) != 0)) {
				{
				setState(289);
				cssProperty();
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(290);
						match(SEMICOLON);
						setState(291);
						cssProperty();
						}
						} 
					}
					setState(296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
			}

			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(299);
				match(SEMICOLON);
				}
			}

			setState(302);
			match(RBRACE);
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
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<PropertyValueContext> propertyValue() {
			return getRuleContexts(PropertyValueContext.class);
		}
		public PropertyValueContext propertyValue(int i) {
			return getRuleContext(PropertyValueContext.class,i);
		}
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			property();
			setState(305);
			match(COLON);
			setState(307); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306);
				propertyValue();
				}
				}
				setState(309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 576460958462377984L) != 0) );
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
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(AngularParser.DISPLAY, 0); }
		public TerminalNode MARGIN() { return getToken(AngularParser.MARGIN, 0); }
		public TerminalNode FONT_FAMILY() { return getToken(AngularParser.FONT_FAMILY, 0); }
		public TerminalNode PADDING() { return getToken(AngularParser.PADDING, 0); }
		public TerminalNode WIDTH() { return getToken(AngularParser.WIDTH, 0); }
		public TerminalNode BORDER_RIGHT() { return getToken(AngularParser.BORDER_RIGHT, 0); }
		public TerminalNode OVERFLOW_Y() { return getToken(AngularParser.OVERFLOW_Y, 0); }
		public TerminalNode BORDER() { return getToken(AngularParser.BORDER, 0); }
		public TerminalNode CURSOR() { return getToken(AngularParser.CURSOR, 0); }
		public TerminalNode TRANSITION() { return getToken(AngularParser.TRANSITION, 0); }
		public TerminalNode HEIGHT() { return getToken(AngularParser.HEIGHT, 0); }
		public TerminalNode MARGIN_RIGHT() { return getToken(AngularParser.MARGIN_RIGHT, 0); }
		public TerminalNode BORDER_SOLID() { return getToken(AngularParser.BORDER_SOLID, 0); }
		public TerminalNode COLOR() { return getToken(AngularParser.COLOR, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68715282432L) != 0)) ) {
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
	public static class PropertyValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(AngularParser.NUMERIC_VALUE, 0); }
		public TerminalNode COLOR_VALUE() { return getToken(AngularParser.COLOR_VALUE, 0); }
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_propertyValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460958462377984L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001=\u013c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001@\b\u0001\n\u0001\f\u0001C\t\u0001\u0001\u0001"+
		"\u0003\u0001F\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002V\b\u0002"+
		"\n\u0002\f\u0002Y\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002c\b\u0002"+
		"\u0001\u0003\u0005\u0003f\b\u0003\n\u0003\f\u0003i\t\u0003\u0001\u0003"+
		"\u0003\u0003l\b\u0003\u0001\u0003\u0005\u0003o\b\u0003\n\u0003\f\u0003"+
		"r\t\u0003\u0001\u0004\u0001\u0004\u0003\u0004v\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008a"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008f\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0095\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0099\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00ac\b\t\n\t\f\t\u00af\t\t\u0003\t\u00b1\b\t\u0001\t\u0003\t\u00b4"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ba\b\n\n\n\f\n\u00bd\t"+
		"\n\u0001\n\u0003\n\u00c0\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00cb\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00d1\b\f\u0003\f\u00d3\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00dc\b\r\n\r\f\r\u00df"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0005"+
		"\u000f\u00e6\b\u000f\n\u000f\f\u000f\u00e9\t\u000f\u0001\u0010\u0005\u0010"+
		"\u00ec\b\u0010\n\u0010\f\u0010\u00ef\t\u0010\u0001\u0011\u0001\u0011\u0004"+
		"\u0011\u00f3\b\u0011\u000b\u0011\f\u0011\u00f4\u0001\u0011\u0005\u0011"+
		"\u00f8\b\u0011\n\u0011\f\u0011\u00fb\t\u0011\u0001\u0011\u0001\u0011\u0004"+
		"\u0011\u00ff\b\u0011\u000b\u0011\f\u0011\u0100\u0001\u0011\u0001\u0011"+
		"\u0004\u0011\u0105\b\u0011\u000b\u0011\f\u0011\u0106\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u010b\b\u0011\n\u0011\f\u0011\u010e\t\u0011\u0005\u0011"+
		"\u0110\b\u0011\n\u0011\f\u0011\u0113\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u011b\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u011f\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0125\b\u0014\n\u0014\f\u0014\u0128\t\u0014"+
		"\u0003\u0014\u012a\b\u0014\u0001\u0014\u0003\u0014\u012d\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u0134"+
		"\b\u0015\u000b\u0015\f\u0015\u0135\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000"+
		"\u0005\u0001\u0000\t\n\u0001\u0000(+\u0001\u00007:\u0001\u0000\u0016#"+
		"\u0003\u0000\u0013\u0013$%;;\u014d\u00000\u0001\u0000\u0000\u0000\u0002"+
		"2\u0001\u0000\u0000\u0000\u0004b\u0001\u0000\u0000\u0000\u0006g\u0001"+
		"\u0000\u0000\u0000\bu\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000"+
		"\f\u0098\u0001\u0000\u0000\u0000\u000e\u009a\u0001\u0000\u0000\u0000\u0010"+
		"\u00a0\u0001\u0000\u0000\u0000\u0012\u00b3\u0001\u0000\u0000\u0000\u0014"+
		"\u00b5\u0001\u0000\u0000\u0000\u0016\u00c3\u0001\u0000\u0000\u0000\u0018"+
		"\u00c7\u0001\u0000\u0000\u0000\u001a\u00d8\u0001\u0000\u0000\u0000\u001c"+
		"\u00e0\u0001\u0000\u0000\u0000\u001e\u00e7\u0001\u0000\u0000\u0000 \u00ed"+
		"\u0001\u0000\u0000\u0000\"\u00f0\u0001\u0000\u0000\u0000$\u0114\u0001"+
		"\u0000\u0000\u0000&\u011a\u0001\u0000\u0000\u0000(\u011c\u0001\u0000\u0000"+
		"\u0000*\u0130\u0001\u0000\u0000\u0000,\u0137\u0001\u0000\u0000\u0000."+
		"\u0139\u0001\u0000\u0000\u000001\u0003\u0002\u0001\u00001\u0001\u0001"+
		"\u0000\u0000\u000023\u0005\u0001\u0000\u000034\u0005\r\u0000\u000045\u0005"+
		"\u000b\u0000\u000056\u0005\u0004\u0000\u000067\u0005\u0011\u0000\u0000"+
		"78\u0005\u0013\u0000\u000089\u0005\u0005\u0000\u00009:\u0005\u0011\u0000"+
		"\u0000:;\u0007\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<A\u0003\u0004"+
		"\u0002\u0000=>\u0005\u0012\u0000\u0000>@\u0003\u0004\u0002\u0000?=\u0001"+
		"\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000DF\u0005\u0012\u0000\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0005\f\u0000\u0000HI\u0005\u000e"+
		"\u0000\u0000IJ\u0005\u0002\u0000\u0000JK\u0005\u0003\u0000\u0000KL\u0005"+
		";\u0000\u0000LM\u0005\u000b\u0000\u0000MN\u0003\u0006\u0003\u0000NO\u0005"+
		"\f\u0000\u0000O\u0003\u0001\u0000\u0000\u0000PQ\u0005\u0007\u0000\u0000"+
		"QR\u0005\u0011\u0000\u0000RS\u0005\u000f\u0000\u0000SW\u0005\u0014\u0000"+
		"\u0000TV\u0003(\u0014\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\u0014\u0000\u0000[c\u0005"+
		"\u0010\u0000\u0000\\]\u0005\b\u0000\u0000]^\u0005\u0011\u0000\u0000^_"+
		"\u0005\u0014\u0000\u0000_`\u0003 \u0010\u0000`a\u0005\u0014\u0000\u0000"+
		"ac\u0001\u0000\u0000\u0000bP\u0001\u0000\u0000\u0000b\\\u0001\u0000\u0000"+
		"\u0000c\u0005\u0001\u0000\u0000\u0000df\u0003\b\u0004\u0000ed\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"jl\u0003\u000e\u0007\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lp\u0001\u0000\u0000\u0000mo\u0003\b\u0004\u0000nm\u0001\u0000\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000q\u0007\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"sv\u0003\n\u0005\u0000tv\u0003\u0018\f\u0000us\u0001\u0000\u0000\u0000"+
		"ut\u0001\u0000\u0000\u0000v\t\u0001\u0000\u0000\u0000wx\u0005;\u0000\u0000"+
		"xy\u0005\u0011\u0000\u0000yz\u0003\u0010\b\u0000z{\u0005\u0015\u0000\u0000"+
		"{\u000b\u0001\u0000\u0000\u0000|}\u0005/\u0000\u0000}~\u0005;\u0000\u0000"+
		"~\u007f\u0005\u0011\u0000\u0000\u007f\u0080\u0003\u0010\b\u0000\u0080"+
		"\u0081\u0005\u0015\u0000\u0000\u0081\u0099\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005/\u0000\u0000\u0083\u0084\u0005;\u0000\u0000\u0084\u0085\u0005"+
		"\u0011\u0000\u0000\u0085\u0086\u0003\u0010\b\u0000\u0086\u0089\u0005\'"+
		"\u0000\u0000\u0087\u008a\u0003\u0012\t\u0000\u0088\u008a\u0003\u0014\n"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0015\u0000"+
		"\u0000\u008c\u0099\u0001\u0000\u0000\u0000\u008d\u008f\u0005.\u0000\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0005;\u0000\u0000\u0091"+
		"\u0094\u0005\'\u0000\u0000\u0092\u0095\u0003\u0012\t\u0000\u0093\u0095"+
		"\u0003\u0014\n\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0005"+
		"\u0015\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098|\u0001\u0000"+
		"\u0000\u0000\u0098\u0082\u0001\u0000\u0000\u0000\u0098\u008e\u0001\u0000"+
		"\u0000\u0000\u0099\r\u0001\u0000\u0000\u0000\u009a\u009b\u0005\r\u0000"+
		"\u0000\u009b\u009c\u0005\u000e\u0000\u0000\u009c\u009d\u0005\u000b\u0000"+
		"\u0000\u009d\u009e\u0003\u001e\u000f\u0000\u009e\u009f\u0005\f\u0000\u0000"+
		"\u009f\u000f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0007\u0001\u0000\u0000"+
		"\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2\u00b4\u0005;\u0000\u0000\u00a3"+
		"\u00b4\u0005\u0013\u0000\u0000\u00a4\u00b4\u0005$\u0000\u0000\u00a5\u00b4"+
		"\u0005\t\u0000\u0000\u00a6\u00b4\u0005\n\u0000\u0000\u00a7\u00b0\u0005"+
		"\u000b\u0000\u0000\u00a8\u00ad\u0003\u0016\u000b\u0000\u00a9\u00aa\u0005"+
		"\u0012\u0000\u0000\u00aa\u00ac\u0003\u0016\u000b\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00a8\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b4\u0005\f\u0000\u0000\u00b3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00b3\u00a3\u0001\u0000\u0000\u0000\u00b3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00b3\u00a5\u0001\u0000\u0000\u0000\u00b3\u00a6\u0001\u0000"+
		"\u0000\u0000\u00b3\u00a7\u0001\u0000\u0000\u0000\u00b4\u0013\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0005\u000f\u0000\u0000\u00b6\u00bb\u0003\u0012"+
		"\t\u0000\u00b7\u00b8\u0005\u0012\u0000\u0000\u00b8\u00ba\u0003\u0012\t"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00be\u00c0\u0005\u0012\u0000\u0000\u00bf\u00be\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005\u0010\u0000\u0000\u00c2\u0015\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005;\u0000\u0000\u00c4\u00c5\u0005\u0011\u0000\u0000"+
		"\u00c5\u00c6\u0003\u0012\t\u0000\u00c6\u0017\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0005;\u0000\u0000\u00c8\u00ca\u0005\r\u0000\u0000\u00c9\u00cb"+
		"\u0003\u001a\r\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00d2\u0005"+
		"\u000e\u0000\u0000\u00cd\u00d0\u0005\u0011\u0000\u0000\u00ce\u00d1\u0003"+
		"\u0010\b\u0000\u00cf\u00d1\u0005,\u0000\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u000b"+
		"\u0000\u0000\u00d5\u00d6\u0003\u001e\u000f\u0000\u00d6\u00d7\u0005\f\u0000"+
		"\u0000\u00d7\u0019\u0001\u0000\u0000\u0000\u00d8\u00dd\u0003\u001c\u000e"+
		"\u0000\u00d9\u00da\u0005\u0012\u0000\u0000\u00da\u00dc\u0003\u001c\u000e"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000"+
		"\u0000\u00de\u001b\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005;\u0000\u0000\u00e1\u00e2\u0005\u0011\u0000\u0000"+
		"\u00e2\u00e3\u0003\u0010\b\u0000\u00e3\u001d\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e6\u0003\f\u0006\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u001f\u0001\u0000\u0000\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ec\u0003\"\u0011\u0000\u00eb\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee!\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f2\u00054\u0000"+
		"\u0000\u00f1\u00f3\u0003&\u0013\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f8\u0003$\u0012\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fc\u0111\u00055\u0000\u0000\u00fd\u00ff"+
		"\u0003&\u0013\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001"+
		"\u0000\u0000\u0000\u0101\u010c\u0001\u0000\u0000\u0000\u0102\u0104\u0005"+
		"6\u0000\u0000\u0103\u0105\u0003&\u0013\u0000\u0104\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u00055\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000"+
		"\u010a\u0102\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000"+
		"\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"+
		"\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000"+
		"\u010f\u00fe\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000"+
		"\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000"+
		"\u0112#\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0007\u0002\u0000\u0000\u0115%\u0001\u0000\u0000\u0000\u0116\u011b"+
		"\u0003\"\u0011\u0000\u0117\u011b\u00053\u0000\u0000\u0118\u011b\u0005"+
		"\u0013\u0000\u0000\u0119\u011b\u0005;\u0000\u0000\u011a\u0116\u0001\u0000"+
		"\u0000\u0000\u011a\u0117\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\'\u0001\u0000\u0000"+
		"\u0000\u011c\u011e\u0005&\u0000\u0000\u011d\u011f\u0005;\u0000\u0000\u011e"+
		"\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0001\u0000\u0000\u0000\u0120\u0129\u0005\u000b\u0000\u0000\u0121"+
		"\u0126\u0003*\u0015\u0000\u0122\u0123\u0005\u0015\u0000\u0000\u0123\u0125"+
		"\u0003*\u0015\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0128\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001"+
		"\u0000\u0000\u0000\u0129\u0121\u0001\u0000\u0000\u0000\u0129\u012a\u0001"+
		"\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u012d\u0005"+
		"\u0015\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0005"+
		"\f\u0000\u0000\u012f)\u0001\u0000\u0000\u0000\u0130\u0131\u0003,\u0016"+
		"\u0000\u0131\u0133\u0005\u0011\u0000\u0000\u0132\u0134\u0003.\u0017\u0000"+
		"\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000"+
		"\u0136+\u0001\u0000\u0000\u0000\u0137\u0138\u0007\u0003\u0000\u0000\u0138"+
		"-\u0001\u0000\u0000\u0000\u0139\u013a\u0007\u0004\u0000\u0000\u013a/\u0001"+
		"\u0000\u0000\u0000#AEWbgkpu\u0089\u008e\u0094\u0098\u00ad\u00b0\u00b3"+
		"\u00bb\u00bf\u00ca\u00d0\u00d2\u00dd\u00e7\u00ed\u00f4\u00f9\u0100\u0106"+
		"\u010c\u0111\u011a\u011e\u0126\u0129\u012c\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}