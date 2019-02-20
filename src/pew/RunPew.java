package pew;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pew.grammar.PewLexer;
import pew.grammar.PewParser;
import java.io.FileInputStream;
import java.io.IOException;
//import java.util.Scanner;
/**
 * Created by Timm Dunker, Nils Kautto, Niklas Larsson Hultgren on 2017-01-18.
 *
 */
public class RunPew {
    public static void main(String[] args) throws IOException {
        String infnam;
        if (args.length > 0) {
            infnam = args[0];
        } else {
            //System.out.println("Vilken fil vill du köra?");
            //Scanner scanner = new Scanner(System.in);
            //infnam = scanner.nextLine();
            infnam = "programs/loop.x"; // kör program direkt
        }
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(infnam));
        PewLexer lexer = new PewLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PewParser parser = new PewParser(tokens);
        ParseTree tree = parser.code();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new Interpreter(infnam), tree);
    }
}
