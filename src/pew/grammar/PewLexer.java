// Generated from D:/IntelliJ/projects/xpres/src/pew/grammar\Pew.g4 by ANTLR 4.5.1
package pew.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PewLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, ID = 8, INT = 9, WS = 10;
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ID", "INT", "WS"
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


    public PewLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fE\b\1\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3" +
                    "\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\6\t\66\n\t\r\t" +
                    "\16\t\67\3\n\6\n;\n\n\r\n\16\n<\3\13\6\13@\n\13\r\13\16\13A\3\13\3\13" +
                    "\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\3\5\2\13\f\17" +
                    "\17\"\"G\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2" +
                    "\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27" +
                    "\3\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t\"\3\2\2\2\13(\3\2\2\2\r,\3\2\2\2" +
                    "\17\62\3\2\2\2\21\65\3\2\2\2\23:\3\2\2\2\25?\3\2\2\2\27\30\7x\2\2\30\31" +
                    "\7c\2\2\31\32\7t\2\2\32\4\3\2\2\2\33\34\7?\2\2\34\6\3\2\2\2\35\36\7n\2" +
                    "\2\36\37\7q\2\2\37 \7q\2\2 !\7r\2\2!\b\3\2\2\2\"#\7v\2\2#$\7k\2\2$%\7" +
                    "o\2\2%&\7g\2\2&\'\7u\2\2\'\n\3\2\2\2()\7g\2\2)*\7p\2\2*+\7f\2\2+\f\3\2" +
                    "\2\2,-\7r\2\2-.\7t\2\2./\7k\2\2/\60\7p\2\2\60\61\7v\2\2\61\16\3\2\2\2" +
                    "\62\63\7-\2\2\63\20\3\2\2\2\64\66\4c|\2\65\64\3\2\2\2\66\67\3\2\2\2\67" +
                    "\65\3\2\2\2\678\3\2\2\28\22\3\2\2\29;\4\62;\2:9\3\2\2\2;<\3\2\2\2<:\3" +
                    "\2\2\2<=\3\2\2\2=\24\3\2\2\2>@\t\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2A" +
                    "B\3\2\2\2BC\3\2\2\2CD\b\13\2\2D\26\3\2\2\2\6\2\67<A\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}