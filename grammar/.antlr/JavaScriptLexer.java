// Generated from c:/Users/nahuu/50966/grammar/JavaScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JavaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		StringLiteral=18, Identifier=19, Number=20, WS=21, COMMENT=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"StringLiteral", "Identifier", "Number", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'switch'", "'('", "')'", "'{'", "'}'", "'case'", "':'", "'default'", 
			"'='", "';'", "'console'", "'.'", "'log'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "StringLiteral", "Identifier", "Number", 
			"WS", "COMMENT"
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


	public JavaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaScript.g4"; }

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
		"\u0004\u0000\u0016\u008e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011j\b\u0011\n\u0011\f\u0011m\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012s\b\u0012"+
		"\n\u0012\f\u0012v\t\u0012\u0001\u0013\u0004\u0013y\b\u0013\u000b\u0013"+
		"\f\u0013z\u0001\u0014\u0004\u0014~\b\u0014\u000b\u0014\f\u0014\u007f\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0088\b\u0015\n\u0015\f\u0015\u008b\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001k\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014"+
		")\u0015+\u0016\u0001\u0000\u0006\u0002\u0000\"\"\\\\\u0003\u0000AZ__a"+
		"z\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"\n\n\r\r\u0093\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000"+
		"\u0000\u00034\u0001\u0000\u0000\u0000\u00056\u0001\u0000\u0000\u0000\u0007"+
		"8\u0001\u0000\u0000\u0000\t:\u0001\u0000\u0000\u0000\u000b<\u0001\u0000"+
		"\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000fC\u0001\u0000\u0000\u0000"+
		"\u0011K\u0001\u0000\u0000\u0000\u0013M\u0001\u0000\u0000\u0000\u0015O"+
		"\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000"+
		"\u0000\u0000\u001b]\u0001\u0000\u0000\u0000\u001d_\u0001\u0000\u0000\u0000"+
		"\u001fa\u0001\u0000\u0000\u0000!c\u0001\u0000\u0000\u0000#e\u0001\u0000"+
		"\u0000\u0000%p\u0001\u0000\u0000\u0000\'x\u0001\u0000\u0000\u0000)}\u0001"+
		"\u0000\u0000\u0000+\u0083\u0001\u0000\u0000\u0000-.\u0005s\u0000\u0000"+
		"./\u0005w\u0000\u0000/0\u0005i\u0000\u000001\u0005t\u0000\u000012\u0005"+
		"c\u0000\u000023\u0005h\u0000\u00003\u0002\u0001\u0000\u0000\u000045\u0005"+
		"(\u0000\u00005\u0004\u0001\u0000\u0000\u000067\u0005)\u0000\u00007\u0006"+
		"\u0001\u0000\u0000\u000089\u0005{\u0000\u00009\b\u0001\u0000\u0000\u0000"+
		":;\u0005}\u0000\u0000;\n\u0001\u0000\u0000\u0000<=\u0005c\u0000\u0000"+
		"=>\u0005a\u0000\u0000>?\u0005s\u0000\u0000?@\u0005e\u0000\u0000@\f\u0001"+
		"\u0000\u0000\u0000AB\u0005:\u0000\u0000B\u000e\u0001\u0000\u0000\u0000"+
		"CD\u0005d\u0000\u0000DE\u0005e\u0000\u0000EF\u0005f\u0000\u0000FG\u0005"+
		"a\u0000\u0000GH\u0005u\u0000\u0000HI\u0005l\u0000\u0000IJ\u0005t\u0000"+
		"\u0000J\u0010\u0001\u0000\u0000\u0000KL\u0005=\u0000\u0000L\u0012\u0001"+
		"\u0000\u0000\u0000MN\u0005;\u0000\u0000N\u0014\u0001\u0000\u0000\u0000"+
		"OP\u0005c\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005n\u0000\u0000RS\u0005"+
		"s\u0000\u0000ST\u0005o\u0000\u0000TU\u0005l\u0000\u0000UV\u0005e\u0000"+
		"\u0000V\u0016\u0001\u0000\u0000\u0000WX\u0005.\u0000\u0000X\u0018\u0001"+
		"\u0000\u0000\u0000YZ\u0005l\u0000\u0000Z[\u0005o\u0000\u0000[\\\u0005"+
		"g\u0000\u0000\\\u001a\u0001\u0000\u0000\u0000]^\u0005+\u0000\u0000^\u001c"+
		"\u0001\u0000\u0000\u0000_`\u0005-\u0000\u0000`\u001e\u0001\u0000\u0000"+
		"\u0000ab\u0005*\u0000\u0000b \u0001\u0000\u0000\u0000cd\u0005/\u0000\u0000"+
		"d\"\u0001\u0000\u0000\u0000ek\u0005\"\u0000\u0000fj\b\u0000\u0000\u0000"+
		"gh\u0005\\\u0000\u0000hj\t\u0000\u0000\u0000if\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000no\u0005\"\u0000\u0000o$\u0001\u0000\u0000\u0000pt\u0007\u0001"+
		"\u0000\u0000qs\u0007\u0002\u0000\u0000rq\u0001\u0000\u0000\u0000sv\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"u&\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wy\u0007\u0003\u0000"+
		"\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{(\u0001\u0000\u0000\u0000|~\u0007"+
		"\u0004\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0006\u0014\u0000\u0000"+
		"\u0082*\u0001\u0000\u0000\u0000\u0083\u0084\u0005/\u0000\u0000\u0084\u0085"+
		"\u0005/\u0000\u0000\u0085\u0089\u0001\u0000\u0000\u0000\u0086\u0088\b"+
		"\u0005\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0006\u0015\u0000\u0000\u008d,\u0001\u0000"+
		"\u0000\u0000\u0007\u0000iktz\u007f\u0089\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}