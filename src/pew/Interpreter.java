package pew;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pew.grammar.PewBaseListener;
import pew.grammar.PewParser;
import java.util.HashMap;
import java.util.Stack;
/**
 * Created by Timm Dunker, Nils Kautto, Niklas Larsson Hultgren on 2017-01-18.
 *
 */
public class Interpreter extends PewBaseListener {

    private static class Var {
        int val;
    }

    private final String infnam;
    private final HashMap<String, Var> vars = new HashMap<String, Var>();
    private Stack<Integer> stack = new Stack<Integer>();


    public Interpreter(String infnam) {

        this.infnam = infnam;
    }

    private Var getVar(Token tok) {

        String name = tok.getText();
        Var var = vars.get(name);

        if (var == null) {

            error(tok.getLine(), "undefined " + name);
            return new Var();   // avoid null pointer exception

        } else {
            return var;
        }
    }

    private void error(int line, String msg) {

        System.err.println(infnam + ":" + line + ": " + msg);
    }


    @Override
    public void enterStatement(PewParser.StatementContext ctx) {
    }

    @Override
    public void exitStatement(PewParser.StatementContext ctx) {
    }

    @Override
    public void enterDeclaration(PewParser.DeclarationContext ctx) {

        String name = ctx.ID().getText();

        Var old = vars.put(name, new Var());

        if (old != null) {
            error(ctx.ID().getSymbol().getLine(), "redefined " + name);
        }
    }

    @Override
    public void exitDeclaration(PewParser.DeclarationContext ctx) {
    }

    @Override
    public void enterAssignment(PewParser.AssignmentContext ctx) {

    }

    @Override
    public void exitAssignment(PewParser.AssignmentContext ctx) {

        getVar(ctx.ID().getSymbol()).val = stack.pop();

    }

    @Override
    public void enterLoop(PewParser.LoopContext ctx) {

    }

    @Override
    public void exitLoop(PewParser.LoopContext ctx) {

        ParseTreeWalker walker = new ParseTreeWalker();

        int times = stack.pop();

        for (int i = 0; i < times - 1; i++) {
            walker.walk(this, ctx.code());
        }

    }

    @Override
    public void enterPrint(PewParser.PrintContext ctx) {
    }

    @Override
    public void exitPrint(PewParser.PrintContext ctx) {
        System.out.println(stack.pop());
    }

    @Override
    public void enterExpression(PewParser.ExpressionContext ctx) {
    }

    @Override
    public void exitExpression(PewParser.ExpressionContext ctx) {

    }

    @Override
    public void enterAtomicExpression(PewParser.AtomicExpressionContext ctx) {

        if (ctx.ID() != null) {

            stack.push(getVar(ctx.ID().getSymbol()).val);

        } else if (ctx.INT() != null) {

            stack.push(Integer.parseInt(ctx.INT().getText()));
        }
    }

    @Override
    public void exitAtomicExpression(PewParser.AtomicExpressionContext ctx) {
    }

    @Override
    public void enterAddExpression(PewParser.AddExpressionContext ctx) {
    }

    @Override
    public void exitAddExpression(PewParser.AddExpressionContext ctx) {

        if (ctx.atomicExpression() != null) {

            stack.push(stack.pop() + stack.pop());
        }
    }
}