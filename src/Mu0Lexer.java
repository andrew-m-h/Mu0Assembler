// Generated from Mu0.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Mu0Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, LDA=5, STO=6, ADD=7, SUB=8, JMP=9, JGE=10, 
		JNE=11, STP=12, MEM=13, NUMBER=14, PLUS=15, MINUS=16, LABEL=17, LABLEVAR=18, 
		WS=19, NL=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "LDA", "STO", "ADD", "SUB", "JMP", "JGE", 
		"JNE", "STP", "MEM", "DIGIT", "NUMBER", "PLUS", "MINUS", "LOWER", "UPPER", 
		"LABEL", "LABLEVAR", "WS", "NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'{'", "','", "'}'", "'LDA'", "'STO'", "'ADD'", "'SUB'", 
		"'JMP'", "'JGE'", "'JNE'", "'STP'", "'mem'", null, "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "LDA", "STO", "ADD", "SUB", "JMP", "JGE", 
		"JNE", "STP", "MEM", "NUMBER", "PLUS", "MINUS", "LABEL", "LABLEVAR", "WS", 
		"NL"
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


	public Mu0Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mu0.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\6\20a\n\20\r\20"+
		"\16\20b\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\6\25o\n\25\r"+
		"\25\16\25p\3\26\3\26\3\26\6\26v\n\26\r\26\16\26w\3\26\3\26\3\27\6\27}"+
		"\n\27\r\27\16\27~\3\27\3\27\3\30\3\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\20!\21#\22%\2"+
		"\'\2)\23+\24-\25/\26\3\2\4\4\2\13\13\"\"\4\2\f\f\16\17\u0088\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3"+
		"\2\2\2\139\3\2\2\2\r=\3\2\2\2\17A\3\2\2\2\21E\3\2\2\2\23I\3\2\2\2\25M"+
		"\3\2\2\2\27Q\3\2\2\2\31U\3\2\2\2\33Y\3\2\2\2\35]\3\2\2\2\37`\3\2\2\2!"+
		"d\3\2\2\2#f\3\2\2\2%h\3\2\2\2\'j\3\2\2\2)n\3\2\2\2+r\3\2\2\2-|\3\2\2\2"+
		"/\u0082\3\2\2\2\61\62\7<\2\2\62\4\3\2\2\2\63\64\7}\2\2\64\6\3\2\2\2\65"+
		"\66\7.\2\2\66\b\3\2\2\2\678\7\177\2\28\n\3\2\2\29:\7N\2\2:;\7F\2\2;<\7"+
		"C\2\2<\f\3\2\2\2=>\7U\2\2>?\7V\2\2?@\7Q\2\2@\16\3\2\2\2AB\7C\2\2BC\7F"+
		"\2\2CD\7F\2\2D\20\3\2\2\2EF\7U\2\2FG\7W\2\2GH\7D\2\2H\22\3\2\2\2IJ\7L"+
		"\2\2JK\7O\2\2KL\7R\2\2L\24\3\2\2\2MN\7L\2\2NO\7I\2\2OP\7G\2\2P\26\3\2"+
		"\2\2QR\7L\2\2RS\7P\2\2ST\7G\2\2T\30\3\2\2\2UV\7U\2\2VW\7V\2\2WX\7R\2\2"+
		"X\32\3\2\2\2YZ\7o\2\2Z[\7g\2\2[\\\7o\2\2\\\34\3\2\2\2]^\4\62;\2^\36\3"+
		"\2\2\2_a\5\35\17\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c \3\2\2\2d"+
		"e\7-\2\2e\"\3\2\2\2fg\7/\2\2g$\3\2\2\2hi\4c|\2i&\3\2\2\2jk\4C\\\2k(\3"+
		"\2\2\2lo\5\'\24\2mo\5%\23\2nl\3\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq"+
		"\3\2\2\2q*\3\2\2\2ru\7]\2\2sv\5\'\24\2tv\5%\23\2us\3\2\2\2ut\3\2\2\2v"+
		"w\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7_\2\2z,\3\2\2\2{}\t\2\2\2|"+
		"{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\b\27\2\2\u0081.\3\2\2\2\u0082\u0083\t\3\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\b\30\2\2\u0085\60\3\2\2\2\t\2bnpuw~\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}