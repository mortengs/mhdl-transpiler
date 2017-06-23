// Generated from MHDL.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MHDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, IDENTIFIER=15, INTEGER=16, 
		WS=17;
	public static final int
		RULE_design = 0, RULE_entity = 1, RULE_components = 2, RULE_connections = 3, 
		RULE_connection_end = 4;
	public static final String[] ruleNames = {
		"design", "entity", "components", "connections", "connection_end"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'DEFINE'", "'END DEFINE;'", "'ENTITY LIST:'", "'WITH'", "'WITHOUT'", 
		"'CONTROL;'", "'COMPONENT LIST:'", "'OF'", "';'", "':'", "'END LIST;'", 
		"'CONNECTION LIST:'", "'CONNECTS TO'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "IDENTIFIER", "INTEGER", "WS"
	};
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
	public String getGrammarFileName() { return "MHDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MHDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DesignContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MHDLParser.IDENTIFIER, 0); }
		public ComponentsContext components() {
			return getRuleContext(ComponentsContext.class,0);
		}
		public ConnectionsContext connections() {
			return getRuleContext(ConnectionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MHDLParser.EOF, 0); }
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public DesignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_design; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MHDLListener ) ((MHDLListener)listener).enterDesign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MHDLListener ) ((MHDLListener)listener).exitDesign(this);
		}
	}

	public final DesignContext design() throws RecognitionException {
		DesignContext _localctx = new DesignContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_design);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			match(IDENTIFIER);
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(12);
				entity();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			components();
			setState(19);
			connections();
			setState(20);
			match(T__1);
			setState(21);
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

	public static class EntityContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MHDLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MHDLParser.IDENTIFIER, i);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MHDLListener ) ((MHDLListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MHDLListener ) ((MHDLListener)listener).exitEntity(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(T__2);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				match(IDENTIFIER);
				setState(25);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(26);
				match(T__5);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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

	public static class ComponentsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MHDLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MHDLParser.IDENTIFIER, i);
		}
		public ComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_components; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MHDLListener ) ((MHDLListener)listener).enterComponents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MHDLListener ) ((MHDLListener)listener).exitComponents(this);
		}
	}

	public final ComponentsContext components() throws RecognitionException {
		ComponentsContext _localctx = new ComponentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_components);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__6);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(32);
					match(IDENTIFIER);
					setState(33);
					match(T__7);
					setState(34);
					match(IDENTIFIER);
					setState(35);
					match(T__8);
					}
					break;
				case 2:
					{
					setState(36);
					match(IDENTIFIER);
					setState(37);
					match(T__9);
					}
					break;
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(42);
			match(T__10);
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

	public static class ConnectionsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MHDLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MHDLParser.IDENTIFIER, i);
		}
		public List<Connection_endContext> connection_end() {
			return getRuleContexts(Connection_endContext.class);
		}
		public Connection_endContext connection_end(int i) {
			return getRuleContext(Connection_endContext.class,i);
		}
		public ConnectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MHDLListener ) ((MHDLListener)listener).enterConnections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MHDLListener ) ((MHDLListener)listener).exitConnections(this);
		}
	}

	public final ConnectionsContext connections() throws RecognitionException {
		ConnectionsContext _localctx = new ConnectionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_connections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__11);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				match(IDENTIFIER);
				setState(46);
				match(T__12);
				setState(47);
				connection_end();
				setState(48);
				match(T__8);
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(54);
			match(T__10);
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

	public static class Connection_endContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MHDLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MHDLParser.IDENTIFIER, i);
		}
		public Connection_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MHDLListener ) ((MHDLListener)listener).enterConnection_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MHDLListener ) ((MHDLListener)listener).exitConnection_end(this);
		}
	}

	public final Connection_endContext connection_end() throws RecognitionException {
		Connection_endContext _localctx = new Connection_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_connection_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(56);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(57);
					match(IDENTIFIER);
					setState(58);
					match(T__13);
					}
					break;
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\6\4)\n\4\r\4\16\4*\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\6\5"+
		"\65\n\5\r\5\16\5\66\3\5\3\5\3\6\3\6\3\6\6\6>\n\6\r\6\16\6?\3\6\2\2\7\2"+
		"\4\6\b\n\2\3\3\2\6\7C\2\f\3\2\2\2\4\31\3\2\2\2\6!\3\2\2\2\b.\3\2\2\2\n"+
		"=\3\2\2\2\f\r\7\3\2\2\r\21\7\21\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23"+
		"\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\25"+
		"\5\6\4\2\25\26\5\b\5\2\26\27\7\4\2\2\27\30\7\2\2\3\30\3\3\2\2\2\31\35"+
		"\7\5\2\2\32\33\7\21\2\2\33\34\t\2\2\2\34\36\7\b\2\2\35\32\3\2\2\2\36\37"+
		"\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \5\3\2\2\2!(\7\t\2\2\"#\7\21\2\2#$"+
		"\7\n\2\2$%\7\21\2\2%)\7\13\2\2&\'\7\21\2\2\')\7\f\2\2(\"\3\2\2\2(&\3\2"+
		"\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\r\2\2-\7\3\2\2\2.\64"+
		"\7\16\2\2/\60\7\21\2\2\60\61\7\17\2\2\61\62\5\n\6\2\62\63\7\13\2\2\63"+
		"\65\3\2\2\2\64/\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678"+
		"\3\2\2\289\7\r\2\29\t\3\2\2\2:>\7\21\2\2;<\7\21\2\2<>\7\20\2\2=:\3\2\2"+
		"\2=;\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\13\3\2\2\2\t\21\37(*\66=?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}