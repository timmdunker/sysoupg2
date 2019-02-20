package pew;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pew.grammar.PewLexer;
import pew.grammar.PewParser;
import java.io.*;
/**
 * Created by Timm Dunker, Nils Kautto, Niklas Larsson Hultgren on 2017-01-18.
 *
 */
public class CompilePew {
    public static void main(String[] args) throws IOException {
        String infnam = "programs/loop.x";
        String outfnam = "programs/loop.hack";
        boolean traceOn = args.length < 3 || "traceOn".equalsIgnoreCase(args[2]);

        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(infnam));
        PewLexer lexer = new PewLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PewParser parser = new PewParser(tokens);
        ParseTree tree = parser.code();
        ParseTreeWalker walker = new ParseTreeWalker();
//        HackGen out = new HackGen(1024, 2048, 1025);
        HackGen out = new HackGen(2, 16, 3);
        walker.walk(new Compiler(infnam, out, traceOn), tree);
        Writer w = new OutputStreamWriter(new FileOutputStream(outfnam), "US-ASCII");
        out.outputCode(w);
        w.close();
    }
}
