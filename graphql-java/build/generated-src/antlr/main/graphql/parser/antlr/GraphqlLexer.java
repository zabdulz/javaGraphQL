// Generated from Graphql.g4 by ANTLR 4.7.2

    package graphql.parser.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BooleanValue=15, NullValue=16, 
		FRAGMENT=17, QUERY=18, MUTATION=19, SUBSCRIPTION=20, SCHEMA=21, SCALAR=22, 
		TYPE=23, INTERFACE=24, IMPLEMENTS=25, ENUM=26, UNION=27, INPUT=28, EXTEND=29, 
		DIRECTIVE=30, ON_KEYWORD=31, NAME=32, IntValue=33, FloatValue=34, Sign=35, 
		IntegerPart=36, NonZeroDigit=37, ExponentPart=38, Digit=39, StringValue=40, 
		TripleQuotedStringValue=41, Comment=42, LF=43, CR=44, LineTerminator=45, 
		Space=46, Tab=47, Comma=48, UnicodeBOM=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "BooleanValue", "NullValue", 
			"FRAGMENT", "QUERY", "MUTATION", "SUBSCRIPTION", "SCHEMA", "SCALAR", 
			"TYPE", "INTERFACE", "IMPLEMENTS", "ENUM", "UNION", "INPUT", "EXTEND", 
			"DIRECTIVE", "ON_KEYWORD", "NAME", "IntValue", "FloatValue", "Sign", 
			"IntegerPart", "NonZeroDigit", "ExponentPart", "Digit", "StringValue", 
			"TripleQuotedStringValue", "TripleQuotedStringPart", "EscapedTripleQuote", 
			"ExtendedSourceCharacter", "ExtendedSourceCharacterWitoutLineFeed", "Comment", 
			"EscapedChar", "Unicode", "Hex", "LF", "CR", "LineTerminator", "Space", 
			"Tab", "Comma", "UnicodeBOM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "'&'", "'('", "')'", "'='", "'|'", "'@'", 
			"'['", "']'", "'$'", "'!'", "'...'", null, "'null'", "'fragment'", "'query'", 
			"'mutation'", "'subscription'", "'schema'", "'scalar'", "'type'", "'interface'", 
			"'implements'", "'enum'", "'union'", "'input'", "'extend'", "'directive'", 
			"'on'", null, null, null, "'-'", null, null, null, null, null, null, 
			null, null, null, null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "BooleanValue", "NullValue", "FRAGMENT", "QUERY", "MUTATION", 
			"SUBSCRIPTION", "SCHEMA", "SCALAR", "TYPE", "INTERFACE", "IMPLEMENTS", 
			"ENUM", "UNION", "INPUT", "EXTEND", "DIRECTIVE", "ON_KEYWORD", "NAME", 
			"IntValue", "FloatValue", "Sign", "IntegerPart", "NonZeroDigit", "ExponentPart", 
			"Digit", "StringValue", "TripleQuotedStringValue", "Comment", "LF", "CR", 
			"LineTerminator", "Space", "Tab", "Comma", "UnicodeBOM"
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


	public GraphqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Graphql.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u019d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u009b\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\7!\u0116"+
		"\n!\f!\16!\u0119\13!\3\"\5\"\u011c\n\"\3\"\3\"\3#\5#\u0121\n#\3#\3#\3"+
		"#\6#\u0126\n#\r#\16#\u0127\5#\u012a\n#\3#\5#\u012d\n#\3$\3$\3%\3%\3%\3"+
		"%\6%\u0135\n%\r%\16%\u0136\5%\u0139\n%\3&\3&\3\'\3\'\5\'\u013f\n\'\3\'"+
		"\6\'\u0142\n\'\r\'\16\'\u0143\3(\3(\3)\3)\3)\7)\u014b\n)\f)\16)\u014e"+
		"\13)\3)\3)\3*\3*\3*\3*\3*\5*\u0157\n*\3*\3*\3*\3*\3+\3+\6+\u015f\n+\r"+
		"+\16+\u0160\3,\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\7/\u016e\n/\f/\16/\u0171"+
		"\13/\3/\3/\3\60\3\60\3\60\5\60\u0178\n\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\3\u0160"+
		"\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W\2Y\2[\2],_\2a\2c\2e-g.i/k\60m\61o\62"+
		"q\63\3\2\17\5\2C\\aac|\6\2\62;C\\aac|\4\2GGgg\4\2--//\7\2\f\f\17\17$$"+
		"^^\u202a\u202b\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\f\f\3\2\17\17\3"+
		"\2\u202a\u202b\3\2\"\"\3\2\13\13\3\2\uff01\uff01\4\5\2\13\2\f\2\17\2\17"+
		"\2\"\2\1\22\5\2\13\2\13\2\17\2\17\2\"\2\1\22\u01a8\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2]\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3"+
		"\2\2\2\5u\3\2\2\2\7w\3\2\2\2\ty\3\2\2\2\13{\3\2\2\2\r}\3\2\2\2\17\177"+
		"\3\2\2\2\21\u0081\3\2\2\2\23\u0083\3\2\2\2\25\u0085\3\2\2\2\27\u0087\3"+
		"\2\2\2\31\u0089\3\2\2\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u009a\3\2"+
		"\2\2!\u009c\3\2\2\2#\u00a1\3\2\2\2%\u00aa\3\2\2\2\'\u00b0\3\2\2\2)\u00b9"+
		"\3\2\2\2+\u00c6\3\2\2\2-\u00cd\3\2\2\2/\u00d4\3\2\2\2\61\u00d9\3\2\2\2"+
		"\63\u00e3\3\2\2\2\65\u00ee\3\2\2\2\67\u00f3\3\2\2\29\u00f9\3\2\2\2;\u00ff"+
		"\3\2\2\2=\u0106\3\2\2\2?\u0110\3\2\2\2A\u0113\3\2\2\2C\u011b\3\2\2\2E"+
		"\u0120\3\2\2\2G\u012e\3\2\2\2I\u0138\3\2\2\2K\u013a\3\2\2\2M\u013c\3\2"+
		"\2\2O\u0145\3\2\2\2Q\u0147\3\2\2\2S\u0151\3\2\2\2U\u015e\3\2\2\2W\u0162"+
		"\3\2\2\2Y\u0167\3\2\2\2[\u0169\3\2\2\2]\u016b\3\2\2\2_\u0174\3\2\2\2a"+
		"\u0179\3\2\2\2c\u017f\3\2\2\2e\u0181\3\2\2\2g\u0185\3\2\2\2i\u0189\3\2"+
		"\2\2k\u018d\3\2\2\2m\u0191\3\2\2\2o\u0195\3\2\2\2q\u0199\3\2\2\2st\7}"+
		"\2\2t\4\3\2\2\2uv\7\177\2\2v\6\3\2\2\2wx\7<\2\2x\b\3\2\2\2yz\7(\2\2z\n"+
		"\3\2\2\2{|\7*\2\2|\f\3\2\2\2}~\7+\2\2~\16\3\2\2\2\177\u0080\7?\2\2\u0080"+
		"\20\3\2\2\2\u0081\u0082\7~\2\2\u0082\22\3\2\2\2\u0083\u0084\7B\2\2\u0084"+
		"\24\3\2\2\2\u0085\u0086\7]\2\2\u0086\26\3\2\2\2\u0087\u0088\7_\2\2\u0088"+
		"\30\3\2\2\2\u0089\u008a\7&\2\2\u008a\32\3\2\2\2\u008b\u008c\7#\2\2\u008c"+
		"\34\3\2\2\2\u008d\u008e\7\60\2\2\u008e\u008f\7\60\2\2\u008f\u0090\7\60"+
		"\2\2\u0090\36\3\2\2\2\u0091\u0092\7v\2\2\u0092\u0093\7t\2\2\u0093\u0094"+
		"\7w\2\2\u0094\u009b\7g\2\2\u0095\u0096\7h\2\2\u0096\u0097\7c\2\2\u0097"+
		"\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099\u009b\7g\2\2\u009a\u0091\3\2\2"+
		"\2\u009a\u0095\3\2\2\2\u009b \3\2\2\2\u009c\u009d\7p\2\2\u009d\u009e\7"+
		"w\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7n\2\2\u00a0\"\3\2\2\2\u00a1\u00a2"+
		"\7h\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7i\2\2\u00a5"+
		"\u00a6\7o\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2"+
		"\u00a9$\3\2\2\2\u00aa\u00ab\7s\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7g\2"+
		"\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7{\2\2\u00af&\3\2\2\2\u00b0\u00b1\7"+
		"o\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5"+
		"\7v\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7p\2\2\u00b8"+
		"(\3\2\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7d\2\2\u00bc"+
		"\u00bd\7u\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7k\2\2"+
		"\u00c0\u00c1\7r\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4"+
		"\7q\2\2\u00c4\u00c5\7p\2\2\u00c5*\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8"+
		"\7e\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7o\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc,\3\2\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7e\2\2\u00cf"+
		"\u00d0\7c\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7t\2\2"+
		"\u00d3.\3\2\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7{\2\2\u00d6\u00d7\7r\2"+
		"\2\u00d7\u00d8\7g\2\2\u00d8\60\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db"+
		"\7p\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7t\2\2\u00de"+
		"\u00df\7h\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7g\2\2"+
		"\u00e2\62\3\2\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7o\2\2\u00e5\u00e6\7"+
		"r\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea"+
		"\7g\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7u\2\2\u00ed"+
		"\64\3\2\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7w\2\2\u00f1"+
		"\u00f2\7o\2\2\u00f2\66\3\2\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7p\2\2\u00f5"+
		"\u00f6\7k\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7p\2\2\u00f88\3\2\2\2\u00f9"+
		"\u00fa\7k\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7r\2\2\u00fc\u00fd\7w\2\2"+
		"\u00fd\u00fe\7v\2\2\u00fe:\3\2\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7z\2"+
		"\2\u0101\u0102\7v\2\2\u0102\u0103\7g\2\2\u0103\u0104\7p\2\2\u0104\u0105"+
		"\7f\2\2\u0105<\3\2\2\2\u0106\u0107\7f\2\2\u0107\u0108\7k\2\2\u0108\u0109"+
		"\7t\2\2\u0109\u010a\7g\2\2\u010a\u010b\7e\2\2\u010b\u010c\7v\2\2\u010c"+
		"\u010d\7k\2\2\u010d\u010e\7x\2\2\u010e\u010f\7g\2\2\u010f>\3\2\2\2\u0110"+
		"\u0111\7q\2\2\u0111\u0112\7p\2\2\u0112@\3\2\2\2\u0113\u0117\t\2\2\2\u0114"+
		"\u0116\t\3\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118B\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c"+
		"\5G$\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\5I%\2\u011eD\3\2\2\2\u011f\u0121\5G$\2\u0120\u011f\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0129\5I%\2\u0123\u0125\7\60"+
		"\2\2\u0124\u0126\5O(\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0123\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u012d\5M\'\2\u012c\u012b\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012dF\3\2\2\2\u012e\u012f\7/\2\2\u012fH\3\2"+
		"\2\2\u0130\u0139\7\62\2\2\u0131\u0139\5K&\2\u0132\u0134\5K&\2\u0133\u0135"+
		"\5O(\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0130\3\2\2\2\u0138\u0131\3\2"+
		"\2\2\u0138\u0132\3\2\2\2\u0139J\3\2\2\2\u013a\u013b\4\63;\2\u013bL\3\2"+
		"\2\2\u013c\u013e\t\4\2\2\u013d\u013f\t\5\2\2\u013e\u013d\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u0142\5O(\2\u0141\u0140\3\2\2"+
		"\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144N"+
		"\3\2\2\2\u0145\u0146\4\62;\2\u0146P\3\2\2\2\u0147\u014c\7$\2\2\u0148\u014b"+
		"\n\6\2\2\u0149\u014b\5_\60\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7$\2\2\u0150R\3\2\2\2\u0151\u0152"+
		"\7$\2\2\u0152\u0153\7$\2\2\u0153\u0154\7$\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0157\5U+\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2"+
		"\2\u0158\u0159\7$\2\2\u0159\u015a\7$\2\2\u015a\u015b\7$\2\2\u015bT\3\2"+
		"\2\2\u015c\u015f\5W,\2\u015d\u015f\5Y-\2\u015e\u015c\3\2\2\2\u015e\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"V\3\2\2\2\u0162\u0163\7^\2\2\u0163\u0164\7$\2\2\u0164\u0165\7$\2\2\u0165"+
		"\u0166\7$\2\2\u0166X\3\2\2\2\u0167\u0168\t\17\2\2\u0168Z\3\2\2\2\u0169"+
		"\u016a\t\20\2\2\u016a\\\3\2\2\2\u016b\u016f\7%\2\2\u016c\u016e\5[.\2\u016d"+
		"\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\b/\2\2\u0173"+
		"^\3\2\2\2\u0174\u0177\7^\2\2\u0175\u0178\t\7\2\2\u0176\u0178\5a\61\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178`\3\2\2\2\u0179\u017a\7w\2\2\u017a"+
		"\u017b\5c\62\2\u017b\u017c\5c\62\2\u017c\u017d\5c\62\2\u017d\u017e\5c"+
		"\62\2\u017eb\3\2\2\2\u017f\u0180\t\b\2\2\u0180d\3\2\2\2\u0181\u0182\t"+
		"\t\2\2\u0182\u0183\3\2\2\2\u0183\u0184\b\63\3\2\u0184f\3\2\2\2\u0185\u0186"+
		"\t\n\2\2\u0186\u0187\3\2\2\2\u0187\u0188\b\64\3\2\u0188h\3\2\2\2\u0189"+
		"\u018a\t\13\2\2\u018a\u018b\3\2\2\2\u018b\u018c\b\65\3\2\u018cj\3\2\2"+
		"\2\u018d\u018e\t\f\2\2\u018e\u018f\3\2\2\2\u018f\u0190\b\66\3\2\u0190"+
		"l\3\2\2\2\u0191\u0192\t\r\2\2\u0192\u0193\3\2\2\2\u0193\u0194\b\67\3\2"+
		"\u0194n\3\2\2\2\u0195\u0196\7.\2\2\u0196\u0197\3\2\2\2\u0197\u0198\b8"+
		"\3\2\u0198p\3\2\2\2\u0199\u019a\t\16\2\2\u019a\u019b\3\2\2\2\u019b\u019c"+
		"\b9\3\2\u019cr\3\2\2\2\25\2\u009a\u0117\u011b\u0120\u0127\u0129\u012c"+
		"\u0136\u0138\u013e\u0143\u014a\u014c\u0156\u015e\u0160\u016f\u0177\4\2"+
		"\4\2\2\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}