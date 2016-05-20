// Generated from Mu0.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Mu0Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, LDA=5, STO=6, ADD=7, SUB=8, JMP=9, JGE=10, 
		JNE=11, STP=12, PRINT=13, MEM=14, NUMBER=15, PLUS=16, MINUS=17, TIMES=18, 
		DIVIDE=19, LABEL=20, LABLEVAR=21, WS=22, NL=23;
	public static final int
		RULE_expr = 0, RULE_instruction = 1, RULE_program = 2;
	public static final String[] ruleNames = {
		"expr", "instruction", "program"
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

	@Override
	public String getGrammarFileName() { return "Mu0.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Mu0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LABLEVAR() { return getToken(Mu0Parser.LABLEVAR, 0); }
		public TerminalNode NUMBER() { return getToken(Mu0Parser.NUMBER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(Mu0Parser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(Mu0Parser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(Mu0Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Mu0Parser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mu0Listener ) ((Mu0Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mu0Listener ) ((Mu0Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			switch (_input.LA(1)) {
			case LABLEVAR:
				{
				setState(7);
				match(LABLEVAR);
				}
				break;
			case NUMBER:
				{
				setState(8);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(23);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(11);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(12);
						match(TIMES);
						setState(13);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(14);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(15);
						match(DIVIDE);
						setState(16);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(17);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(18);
						match(PLUS);
						setState(19);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(20);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(21);
						match(MINUS);
						setState(22);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode LDA() { return getToken(Mu0Parser.LDA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LABEL() { return getToken(Mu0Parser.LABEL, 0); }
		public TerminalNode STO() { return getToken(Mu0Parser.STO, 0); }
		public TerminalNode ADD() { return getToken(Mu0Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(Mu0Parser.SUB, 0); }
		public TerminalNode JMP() { return getToken(Mu0Parser.JMP, 0); }
		public TerminalNode JGE() { return getToken(Mu0Parser.JGE, 0); }
		public TerminalNode JNE() { return getToken(Mu0Parser.JNE, 0); }
		public TerminalNode STP() { return getToken(Mu0Parser.STP, 0); }
		public TerminalNode PRINT() { return getToken(Mu0Parser.PRINT, 0); }
		public TerminalNode MEM() { return getToken(Mu0Parser.MEM, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(Mu0Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Mu0Parser.NUMBER, i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mu0Listener ) ((Mu0Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mu0Listener ) ((Mu0Listener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		int _la;
		try {
			int _alt;
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				_la = _input.LA(1);
				if (_la==LABEL) {
					{
					setState(28);
					match(LABEL);
					setState(29);
					match(T__0);
					}
				}

				setState(32);
				match(LDA);
				setState(33);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				_la = _input.LA(1);
				if (_la==LABEL) {
					{
					setState(34);
					match(LABEL);
					setState(35);
					match(T__0);
					}
				}

				setState(38);
				match(STO);
				setState(39);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				_la = _input.LA(1);
				if (_la==LABEL) {
					{
					setState(40);
					match(LABEL);
					setState(41);
					match(T__0);
					}
				}

				setState(44);
				match(ADD);
				setState(45);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				_la = _input.LA(1);
				if (_la==LABEL) {
					{
					setState(46);
					match(LABEL);
					setState(47);
					match(T__0);
					}
				}

				setState(50);
				match(SUB);
				setState(51);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				_la = _input.LA(1);
				if (_la==LABEL) {
					{
					setState(52);
					match(LABEL);
					setState(53);
					match(T__0);
					}
				}

				setState(56);
				match(JMP);
				setState(57);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				_la = _input.LA(1);
				if (_la==LABEL) {
					{
					setState(58);
					match(LABEL);
					setState(59);
					match(T__0);
					}
				}

				setState(62);
				match(JGE);
				setState(63);
				expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				_la = _input.LA(1);
				if (_la==LABEL) {
					{
					setState(64);
					match(LABEL);
					setState(65);
					match(T__0);
					}
				}

				setState(68);
				match(JNE);
				setState(69);
				expr(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				_la = _input.LA(1);
				if (_la==LABEL) {
					{
					setState(70);
					match(LABEL);
					setState(71);
					match(T__0);
					}
				}

				setState(74);
				match(STP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(77);
				_la = _input.LA(1);
				if (_la==LABEL) {
					{
					setState(75);
					match(LABEL);
					setState(76);
					match(T__0);
					}
				}

				setState(79);
				match(PRINT);
				setState(80);
				expr(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(81);
				match(MEM);
				setState(82);
				match(LABEL);
				setState(83);
				match(T__0);
				setState(84);
				match(T__1);
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(85);
						match(NUMBER);
						setState(86);
						match(T__2);
						}
						} 
					}
					setState(91);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(92);
				match(NUMBER);
				setState(93);
				match(T__3);
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

	public static class ProgramContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mu0Listener ) ((Mu0Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mu0Listener ) ((Mu0Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				instruction();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LDA) | (1L << STO) | (1L << ADD) | (1L << SUB) | (1L << JMP) | (1L << JGE) | (1L << JNE) | (1L << STP) | (1L << PRINT) | (1L << MEM) | (1L << LABEL))) != 0) );
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
		case 0:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\5\2\f\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\5\3!\n\3\3\3\3\3\3\3\3"+
		"\3\5\3\'\n\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3\3\3"+
		"\3\3\3\3\3\5\39\n\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3\3\3\3\3\5\3E\n\3"+
		"\3\3\3\3\3\3\3\3\5\3K\n\3\3\3\3\3\3\3\5\3P\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\3\3\5\3a\n\3\3\4\6\4d\n\4\r\4\16"+
		"\4e\3\4\2\3\2\5\2\4\6\2\2}\2\13\3\2\2\2\4`\3\2\2\2\6c\3\2\2\2\b\t\b\2"+
		"\1\2\t\f\7\27\2\2\n\f\7\21\2\2\13\b\3\2\2\2\13\n\3\2\2\2\f\33\3\2\2\2"+
		"\r\16\f\b\2\2\16\17\7\24\2\2\17\32\5\2\2\t\20\21\f\7\2\2\21\22\7\25\2"+
		"\2\22\32\5\2\2\b\23\24\f\6\2\2\24\25\7\22\2\2\25\32\5\2\2\7\26\27\f\5"+
		"\2\2\27\30\7\23\2\2\30\32\5\2\2\6\31\r\3\2\2\2\31\20\3\2\2\2\31\23\3\2"+
		"\2\2\31\26\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2"+
		"\2\2\35\33\3\2\2\2\36\37\7\26\2\2\37!\7\3\2\2 \36\3\2\2\2 !\3\2\2\2!\""+
		"\3\2\2\2\"#\7\7\2\2#a\5\2\2\2$%\7\26\2\2%\'\7\3\2\2&$\3\2\2\2&\'\3\2\2"+
		"\2\'(\3\2\2\2()\7\b\2\2)a\5\2\2\2*+\7\26\2\2+-\7\3\2\2,*\3\2\2\2,-\3\2"+
		"\2\2-.\3\2\2\2./\7\t\2\2/a\5\2\2\2\60\61\7\26\2\2\61\63\7\3\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\n\2\2\65a\5\2\2\2\66\67\7"+
		"\26\2\2\679\7\3\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\13\2\2;a\5\2\2"+
		"\2<=\7\26\2\2=?\7\3\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\f\2\2Aa\5\2"+
		"\2\2BC\7\26\2\2CE\7\3\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\r\2\2Ga\5"+
		"\2\2\2HI\7\26\2\2IK\7\3\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2La\7\16\2\2M"+
		"N\7\26\2\2NP\7\3\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\17\2\2Ra\5\2\2"+
		"\2ST\7\20\2\2TU\7\26\2\2UV\7\3\2\2V[\7\4\2\2WX\7\21\2\2XZ\7\5\2\2YW\3"+
		"\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\21\2\2"+
		"_a\7\6\2\2` \3\2\2\2`&\3\2\2\2`,\3\2\2\2`\62\3\2\2\2`8\3\2\2\2`>\3\2\2"+
		"\2`D\3\2\2\2`J\3\2\2\2`O\3\2\2\2`S\3\2\2\2a\5\3\2\2\2bd\5\4\3\2cb\3\2"+
		"\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\7\3\2\2\2\21\13\31\33 &,\628>DJO["+
		"`e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}