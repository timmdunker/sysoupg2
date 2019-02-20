// Generated from D:/IntelliJ/projects/xpres/src/pew/grammar\Pew.g4 by ANTLR 4.5.1
package pew.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PewParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, ID = 8, INT = 9, WS = 10;
    public static final int
            RULE_program = 0, RULE_code = 1, RULE_statement = 2, RULE_declaration = 3,
            RULE_assignment = 4, RULE_loop = 5, RULE_print = 6, RULE_expression = 7,
            RULE_atomicExpression = 8, RULE_addExpression = 9;
    public static final String[] ruleNames = {
            "program", "code", "statement", "declaration", "assignment", "loop", "print",
            "expression", "atomicExpression", "addExpression"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'var'", "'='", "'loop'", "'times'", "'end'", "'print'", "'+'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, "ID", "INT", "WS"
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
    public String getGrammarFileName() {
        return "Pew.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public PewParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ProgramContext extends ParserRuleContext {
        public CodeContext code() {
            return getRuleContext(CodeContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(PewParser.EOF, 0);
        }

        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).exitProgram(this);
        }
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        try {
            setState(22);
            switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(20);
                    code();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(21);
                    match(EOF);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CodeContext extends ParserRuleContext {
        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public CodeContext code() {
            return getRuleContext(CodeContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(PewParser.EOF, 0);
        }

        public CodeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_code;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).enterCode(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).exitCode(this);
        }
    }

    public final CodeContext code() throws RecognitionException {
        CodeContext _localctx = new CodeContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_code);
        try {
            setState(29);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(24);
                    statement();
                    setState(25);
                    code();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(27);
                    statement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(28);
                    match(EOF);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext {
        public DeclarationContext declaration() {
            return getRuleContext(DeclarationContext.class, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public PrintContext print() {
            return getRuleContext(PrintContext.class, 0);
        }

        public LoopContext loop() {
            return getRuleContext(LoopContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).exitStatement(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_statement);
        try {
            setState(35);
            switch (_input.LA(1)) {
                case T__0:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(31);
                    declaration();
                }
                break;
                case ID:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(32);
                    assignment();
                }
                break;
                case T__5:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(33);
                    print();
                }
                break;
                case T__2:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(34);
                    loop();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DeclarationContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(PewParser.ID, 0);
        }

        public DeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).enterDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).exitDeclaration(this);
        }
    }

    public final DeclarationContext declaration() throws RecognitionException {
        DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_declaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(37);
                match(T__0);
                setState(38);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AssignmentContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(PewParser.ID, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public AssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).enterAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).exitAssignment(this);
        }
    }

    public final AssignmentContext assignment() throws RecognitionException {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_assignment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(40);
                match(ID);
                setState(41);
                match(T__1);
                setState(42);
                expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LoopContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public CodeContext code() {
            return getRuleContext(CodeContext.class, 0);
        }

        public LoopContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_loop;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).enterLoop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).exitLoop(this);
        }
    }

    public final LoopContext loop() throws RecognitionException {
        LoopContext _localctx = new LoopContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_loop);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(44);
                match(T__2);
                setState(45);
                expression();
                setState(46);
                match(T__3);
                setState(47);
                code();
                setState(48);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PrintContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public PrintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_print;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).enterPrint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).exitPrint(this);
        }
    }

    public final PrintContext print() throws RecognitionException {
        PrintContext _localctx = new PrintContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_print);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(50);
                match(T__5);
                setState(51);
                expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {
        public AtomicExpressionContext atomicExpression() {
            return getRuleContext(AtomicExpressionContext.class, 0);
        }

        public AddExpressionContext addExpression() {
            return getRuleContext(AddExpressionContext.class, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).exitExpression(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_expression);
        try {
            setState(55);
            switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(53);
                    atomicExpression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(54);
                    addExpression();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AtomicExpressionContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(PewParser.ID, 0);
        }

        public TerminalNode INT() {
            return getToken(PewParser.INT, 0);
        }

        public AtomicExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_atomicExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).enterAtomicExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).exitAtomicExpression(this);
        }
    }

    public final AtomicExpressionContext atomicExpression() throws RecognitionException {
        AtomicExpressionContext _localctx = new AtomicExpressionContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_atomicExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(57);
                _la = _input.LA(1);
                if (!(_la == ID || _la == INT)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AddExpressionContext extends ParserRuleContext {
        public AtomicExpressionContext atomicExpression() {
            return getRuleContext(AtomicExpressionContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public AddExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_addExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).enterAddExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PewListener) ((PewListener) listener).exitAddExpression(this);
        }
    }

    public final AddExpressionContext addExpression() throws RecognitionException {
        AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_addExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(59);
                atomicExpression();
                setState(60);
                match(T__6);
                setState(61);
                expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\fB\4\2\t\2\4\3\t" +
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3" +
                    "\2\3\2\5\2\31\n\2\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\5\4&\n" +
                    "\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t" +
                    "\3\t\5\t:\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20" +
                    "\22\24\2\3\3\2\n\13>\2\30\3\2\2\2\4\37\3\2\2\2\6%\3\2\2\2\b\'\3\2\2\2" +
                    "\n*\3\2\2\2\f.\3\2\2\2\16\64\3\2\2\2\209\3\2\2\2\22;\3\2\2\2\24=\3\2\2" +
                    "\2\26\31\5\4\3\2\27\31\7\2\2\3\30\26\3\2\2\2\30\27\3\2\2\2\31\3\3\2\2" +
                    "\2\32\33\5\6\4\2\33\34\5\4\3\2\34 \3\2\2\2\35 \5\6\4\2\36 \7\2\2\3\37" +
                    "\32\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \5\3\2\2\2!&\5\b\5\2\"&\5\n\6" +
                    "\2#&\5\16\b\2$&\5\f\7\2%!\3\2\2\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&\7\3" +
                    "\2\2\2\'(\7\3\2\2()\7\n\2\2)\t\3\2\2\2*+\7\n\2\2+,\7\4\2\2,-\5\20\t\2" +
                    "-\13\3\2\2\2./\7\5\2\2/\60\5\20\t\2\60\61\7\6\2\2\61\62\5\4\3\2\62\63" +
                    "\7\7\2\2\63\r\3\2\2\2\64\65\7\b\2\2\65\66\5\20\t\2\66\17\3\2\2\2\67:\5" +
                    "\22\n\28:\5\24\13\29\67\3\2\2\298\3\2\2\2:\21\3\2\2\2;<\t\2\2\2<\23\3" +
                    "\2\2\2=>\5\22\n\2>?\7\t\2\2?@\5\20\t\2@\25\3\2\2\2\6\30\37%9";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}