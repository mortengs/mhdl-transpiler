// Generated from /Users/Jesper/Documents/DTU/Bachelor thesis/mhdl-transpiler/src/parser/MHDL.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MHDLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, IDENTIFIER=13, INTEGER=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "IDENTIFIER", "INTEGER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'DEFINE'", "':'", "'END DEFINE;'", "'ENTITY LIST:'", "'OF TYPE'", 
		"';'", "'END LIST;'", "'COMPONENT LIST:'", "'OF'", "'CONNECTION LIST:'", 
		"'CONNECTS TO'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "IDENTIFIER", "INTEGER", "WS"
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


	public MHDLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MHDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\7\16\u008c\n\16\f\16\16\16\u008f\13\16\3\17\5\17\u0092\n\17\3\17"+
		"\6\17\u0095\n\17\r\17\16\17\u0096\3\20\6\20\u009a\n\20\r\20\16\20\u009b"+
		"\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f"+
		"\17\17\"\"\2\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3"+
		"!\3\2\2\2\5(\3\2\2\2\7*\3\2\2\2\t\66\3\2\2\2\13C\3\2\2\2\rK\3\2\2\2\17"+
		"M\3\2\2\2\21W\3\2\2\2\23g\3\2\2\2\25j\3\2\2\2\27{\3\2\2\2\31\u0087\3\2"+
		"\2\2\33\u0089\3\2\2\2\35\u0091\3\2\2\2\37\u0099\3\2\2\2!\"\7F\2\2\"#\7"+
		"G\2\2#$\7H\2\2$%\7K\2\2%&\7P\2\2&\'\7G\2\2\'\4\3\2\2\2()\7<\2\2)\6\3\2"+
		"\2\2*+\7G\2\2+,\7P\2\2,-\7F\2\2-.\7\"\2\2./\7F\2\2/\60\7G\2\2\60\61\7"+
		"H\2\2\61\62\7K\2\2\62\63\7P\2\2\63\64\7G\2\2\64\65\7=\2\2\65\b\3\2\2\2"+
		"\66\67\7G\2\2\678\7P\2\289\7V\2\29:\7K\2\2:;\7V\2\2;<\7[\2\2<=\7\"\2\2"+
		"=>\7N\2\2>?\7K\2\2?@\7U\2\2@A\7V\2\2AB\7<\2\2B\n\3\2\2\2CD\7Q\2\2DE\7"+
		"H\2\2EF\7\"\2\2FG\7V\2\2GH\7[\2\2HI\7R\2\2IJ\7G\2\2J\f\3\2\2\2KL\7=\2"+
		"\2L\16\3\2\2\2MN\7G\2\2NO\7P\2\2OP\7F\2\2PQ\7\"\2\2QR\7N\2\2RS\7K\2\2"+
		"ST\7U\2\2TU\7V\2\2UV\7=\2\2V\20\3\2\2\2WX\7E\2\2XY\7Q\2\2YZ\7O\2\2Z[\7"+
		"R\2\2[\\\7Q\2\2\\]\7P\2\2]^\7G\2\2^_\7P\2\2_`\7V\2\2`a\7\"\2\2ab\7N\2"+
		"\2bc\7K\2\2cd\7U\2\2de\7V\2\2ef\7<\2\2f\22\3\2\2\2gh\7Q\2\2hi\7H\2\2i"+
		"\24\3\2\2\2jk\7E\2\2kl\7Q\2\2lm\7P\2\2mn\7P\2\2no\7G\2\2op\7E\2\2pq\7"+
		"V\2\2qr\7K\2\2rs\7Q\2\2st\7P\2\2tu\7\"\2\2uv\7N\2\2vw\7K\2\2wx\7U\2\2"+
		"xy\7V\2\2yz\7<\2\2z\26\3\2\2\2{|\7E\2\2|}\7Q\2\2}~\7P\2\2~\177\7P\2\2"+
		"\177\u0080\7G\2\2\u0080\u0081\7E\2\2\u0081\u0082\7V\2\2\u0082\u0083\7"+
		"U\2\2\u0083\u0084\7\"\2\2\u0084\u0085\7V\2\2\u0085\u0086\7Q\2\2\u0086"+
		"\30\3\2\2\2\u0087\u0088\7.\2\2\u0088\32\3\2\2\2\u0089\u008d\t\2\2\2\u008a"+
		"\u008c\t\3\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\34\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092"+
		"\7/\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0095\t\4\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\36\3\2\2\2\u0098\u009a\t\5\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\b\20\2\2\u009e \3\2\2\2\7\2\u008d\u0091\u0096"+
		"\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}