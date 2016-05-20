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
		JNE=11, STP=12, PRINT=13, MEM=14, NUMBER=15, PLUS=16, MINUS=17, TIMES=18, 
		DIVIDE=19, LABEL=20, LABLEVAR=21, WS=22, NL=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "LDA", "STO", "ADD", "SUB", "JMP", "JGE", 
		"JNE", "STP", "PRINT", "MEM", "DIGIT", "NUMBER", "PLUS", "MINUS", "TIMES", 
		"DIVIDE", "LOWER", "UPPER", "LABEL", "LABLEVAR", "WS", "NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'{'", "','", "'}'", "'LDA'", "'STO'", "'ADD'", "'SUB'", 
		"'JMP'", "'JGE'", "'JNE'", "'STP'", "'PRINT'", "'mem'", null, "'+'", "'-'", 
		"'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "LDA", "STO", "ADD", "SUB", "JMP", "JGE", 
		"JNE", "STP", "PRINT", "MEM", "NUMBER", "PLUS", "MINUS", "TIMES", "DIVIDE", 
		"LABEL", "LABLEVAR", "WS", "NL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\6\21m\n\21\r\21\16\21n\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\6"+
		"\30\177\n\30\r\30\16\30\u0080\3\31\3\31\3\31\6\31\u0086\n\31\r\31\16\31"+
		"\u0087\3\31\3\31\3\32\6\32\u008d\n\32\r\32\16\32\u008e\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\2!\21#\22%\23\'\24)\25+\2-\2/\26\61\27\63\30\65"+
		"\31\3\2\4\4\2\13\13\"\"\4\2\f\f\16\17\u0098\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2"+
		"\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rC\3\2\2\2\17G\3\2\2\2\21K\3\2"+
		"\2\2\23O\3\2\2\2\25S\3\2\2\2\27W\3\2\2\2\31[\3\2\2\2\33_\3\2\2\2\35e\3"+
		"\2\2\2\37i\3\2\2\2!l\3\2\2\2#p\3\2\2\2%r\3\2\2\2\'t\3\2\2\2)v\3\2\2\2"+
		"+x\3\2\2\2-z\3\2\2\2/~\3\2\2\2\61\u0082\3\2\2\2\63\u008c\3\2\2\2\65\u0092"+
		"\3\2\2\2\678\7<\2\28\4\3\2\2\29:\7}\2\2:\6\3\2\2\2;<\7.\2\2<\b\3\2\2\2"+
		"=>\7\177\2\2>\n\3\2\2\2?@\7N\2\2@A\7F\2\2AB\7C\2\2B\f\3\2\2\2CD\7U\2\2"+
		"DE\7V\2\2EF\7Q\2\2F\16\3\2\2\2GH\7C\2\2HI\7F\2\2IJ\7F\2\2J\20\3\2\2\2"+
		"KL\7U\2\2LM\7W\2\2MN\7D\2\2N\22\3\2\2\2OP\7L\2\2PQ\7O\2\2QR\7R\2\2R\24"+
		"\3\2\2\2ST\7L\2\2TU\7I\2\2UV\7G\2\2V\26\3\2\2\2WX\7L\2\2XY\7P\2\2YZ\7"+
		"G\2\2Z\30\3\2\2\2[\\\7U\2\2\\]\7V\2\2]^\7R\2\2^\32\3\2\2\2_`\7R\2\2`a"+
		"\7T\2\2ab\7K\2\2bc\7P\2\2cd\7V\2\2d\34\3\2\2\2ef\7o\2\2fg\7g\2\2gh\7o"+
		"\2\2h\36\3\2\2\2ij\4\62;\2j \3\2\2\2km\5\37\20\2lk\3\2\2\2mn\3\2\2\2n"+
		"l\3\2\2\2no\3\2\2\2o\"\3\2\2\2pq\7-\2\2q$\3\2\2\2rs\7/\2\2s&\3\2\2\2t"+
		"u\7,\2\2u(\3\2\2\2vw\7\61\2\2w*\3\2\2\2xy\4c|\2y,\3\2\2\2z{\4C\\\2{.\3"+
		"\2\2\2|\177\5-\27\2}\177\5+\26\2~|\3\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\60\3\2\2\2\u0082\u0085\7]\2"+
		"\2\u0083\u0086\5-\27\2\u0084\u0086\5+\26\2\u0085\u0083\3\2\2\2\u0085\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\7_\2\2\u008a\62\3\2\2\2\u008b\u008d\t\2\2\2"+
		"\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\32\2\2\u0091\64\3\2\2\2\u0092"+
		"\u0093\t\3\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\33\2\2\u0095\66\3\2\2"+
		"\2\t\2n~\u0080\u0085\u0087\u008e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}