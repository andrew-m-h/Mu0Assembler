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
		JNE=11, STP=12, MEM=13, NUMBER=14, PLUS=15, MINUS=16, LABEL=17, LABLEVAR=18, 
		WS=19, NL=20;
	public static final int
		RULE_expr = 0, RULE_instruction = 1, RULE_program = 2;
	public static final String[] ruleNames = {
		"expr", "instruction", "program"
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
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(17);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(11);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(12);
						match(PLUS);
						setState(13);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(14);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(15);
						match(MINUS);
						setState(16);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(21);
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
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				_la = _input.LA(1);
				if (_la==LABEL) {
					{
					setState(22);
					match(LABEL);
					setState(23);
					match(T__0);
					}
				}

				setState(26);
				match(LDA);
				setState(27);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				match(STO);
				setState(33);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				match(ADD);
				setState(39);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
				match(SUB);
				setState(45);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
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
				match(JMP);
				setState(51);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
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
				match(JGE);
				setState(57);
				expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
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
				match(JNE);
				setState(63);
				expr(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
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
				match(STP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
				match(MEM);
				setState(70);
				match(LABEL);
				setState(71);
				match(T__0);
				setState(72);
				match(T__1);
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(73);
						match(NUMBER);
						setState(74);
						match(T__2);
						}
						} 
					}
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(80);
				match(NUMBER);
				setState(81);
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
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				instruction();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LDA) | (1L << STO) | (1L << ADD) | (1L << SUB) | (1L << JMP) | (1L << JGE) | (1L << JNE) | (1L << STP) | (1L << MEM) | (1L << LABEL))) != 0) );
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
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\\\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\5\2\f\n\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\24\n\2"+
		"\f\2\16\2\27\13\2\3\3\3\3\5\3\33\n\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\3\3\3"+
		"\3\3\3\3\5\3\'\n\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\3\3\3\5\3\63\n\3"+
		"\3\3\3\3\3\3\3\3\5\39\n\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3\3\3\3\3\5\3"+
		"E\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16\3Q\13\3\3\3\3\3\5\3"+
		"U\n\3\3\4\6\4X\n\4\r\4\16\4Y\3\4\2\3\2\5\2\4\6\2\2m\2\13\3\2\2\2\4T\3"+
		"\2\2\2\6W\3\2\2\2\b\t\b\2\1\2\t\f\7\24\2\2\n\f\7\20\2\2\13\b\3\2\2\2\13"+
		"\n\3\2\2\2\f\25\3\2\2\2\r\16\f\6\2\2\16\17\7\21\2\2\17\24\5\2\2\7\20\21"+
		"\f\5\2\2\21\22\7\22\2\2\22\24\5\2\2\6\23\r\3\2\2\2\23\20\3\2\2\2\24\27"+
		"\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\25\3\2\2\2\30\31"+
		"\7\23\2\2\31\33\7\3\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35"+
		"\7\7\2\2\35U\5\2\2\2\36\37\7\23\2\2\37!\7\3\2\2 \36\3\2\2\2 !\3\2\2\2"+
		"!\"\3\2\2\2\"#\7\b\2\2#U\5\2\2\2$%\7\23\2\2%\'\7\3\2\2&$\3\2\2\2&\'\3"+
		"\2\2\2\'(\3\2\2\2()\7\t\2\2)U\5\2\2\2*+\7\23\2\2+-\7\3\2\2,*\3\2\2\2,"+
		"-\3\2\2\2-.\3\2\2\2./\7\n\2\2/U\5\2\2\2\60\61\7\23\2\2\61\63\7\3\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\13\2\2\65U\5\2\2\2\66"+
		"\67\7\23\2\2\679\7\3\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\f\2\2;U\5"+
		"\2\2\2<=\7\23\2\2=?\7\3\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\r\2\2AU"+
		"\5\2\2\2BC\7\23\2\2CE\7\3\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FU\7\16\2\2"+
		"GH\7\17\2\2HI\7\23\2\2IJ\7\3\2\2JO\7\4\2\2KL\7\20\2\2LN\7\5\2\2MK\3\2"+
		"\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\20\2\2SU\7"+
		"\6\2\2T\32\3\2\2\2T \3\2\2\2T&\3\2\2\2T,\3\2\2\2T\62\3\2\2\2T8\3\2\2\2"+
		"T>\3\2\2\2TD\3\2\2\2TG\3\2\2\2U\5\3\2\2\2VX\5\4\3\2WV\3\2\2\2XY\3\2\2"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z\7\3\2\2\2\20\13\23\25\32 &,\628>DOTY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}