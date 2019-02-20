package pew;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import pew.grammar.PewBaseListener;
import pew.grammar.PewParser;
import java.util.HashMap;
/**
 * Created by Timm Dunker, Nils Kautto, Niklas Larsson Hultgren on 2017-01-18.
 *
 */
public class Compiler extends PewBaseListener {
    private final String infnam;
    private final boolean traceOn;
    private final HackGen out;
    private final HashMap<String, Integer> varMap = new HashMap<String, Integer>();
    private int loopAddExpression;
    private int jumpEndInstructionAddExpression;

    public static final int SCREEN = 16384;

    public Compiler(String infnam, HackGen out, boolean traceOn) {
        this.infnam = infnam;
        this.out = out;
        this.traceOn = traceOn;
    }

    private void tracePrint(String message) {
        if (traceOn)
            System.out.println("At operation " + out.currentCodeAddress() + ": " + message);
    }

    private int getVarAddExpression(Token tok) {

        String name = tok.getText();
        Integer a = varMap.get(name);

        if (a == null) {
            return 0;
        } else {
            return a;
        }
    }

    private void error(int line, String msg) {
        System.err.println(infnam + ":" + line + ": " + msg);
    }

    @Override
    public void enterCode(PewParser.CodeContext ctx) {
        tracePrint("Initialize SP");
        out.emitInitSP();
    }

    @Override
    public void enterDeclaration(PewParser.DeclarationContext ctx) {
        String name = ctx.ID().getText();
        int AddExpression = out.newVarAddr();
        Integer old = varMap.put(name, AddExpression);

        if (old != null) {
            error(ctx.ID().getSymbol().getLine(), "redefined " + name);
        }
    }

    @Override
    public void exitAssignment(PewParser.AssignmentContext ctx) {
        int a = getVarAddExpression(ctx.ID().getSymbol());
        tracePrint("Pop from stack and put in " + a);
        out.emitPopStack2D();
        out.emitAInstr(a);
        out.emitCInstr(HackGen.DestM, HackGen.CompD, 0);
    }

    @Override
    public void exitAddExpression(PewParser.AddExpressionContext ctx) {
        ParseTree operator = ctx.getChild(1);
        if (operator != null && "+".equals(operator.getText())) {

            tracePrint("Add two numbers");
            out.emitGetTwoOperands();
            out.emitCInstr(HackGen.DestD, HackGen.DPlusM, 0);
            out.emitReplaceTopWithD();
        } else {
            //Not an add expression
        }
    }

    @Override
    public void exitPrint(PewParser.PrintContext ctx) {
        out.emitPopStack2D();
        out.emitAInstr(SCREEN);
        out.emitCInstr(HackGen.DestM, HackGen.CompD, 0);
    }

    @Override
    public void enterAtomicExpression(PewParser.AtomicExpressionContext ctx) {

        if (ctx.ID() != null) {

            int a = getVarAddExpression(ctx.ID().getSymbol());
            tracePrint("Push contents of " + a + " on stack");
            out.emitAInstr(a);
            out.emitCInstr(HackGen.DestD, HackGen.CompM, 0);
            out.emitPushD2Stack();

        } else if (ctx.INT() != null) {

            int i = Integer.parseInt(ctx.INT().getText());
            tracePrint("Push " + i + " on stack");
            out.emitAInstr(i);
            out.emitCInstr(HackGen.DestD, HackGen.CompA, 0);
            out.emitPushD2Stack();
        }
    }

    @Override
    public void enterLoop(PewParser.LoopContext ctx) {
        int iAdress = varMap.get(ctx.expression().atomicExpression().getChild(0).getText());
        loopAddExpression = out.currentCodeAddress();

        out.emitAInstr(iAdress); //Load A with iAdress
        out.emitCInstr(HackGen.DestD, HackGen.CompM, HackGen.NoJump); //Push iAdress into D
        out.emitPushD2Stack();

        out.emitPopStack2D();
        jumpEndInstructionAddExpression = out.emitAInstr(0);
        out.emitCInstr(HackGen.DestD, HackGen.DMinus1, HackGen.JLT);

        out.emitAInstr(iAdress);
        out.emitCInstr(HackGen.DestM, HackGen.CompD, HackGen.NoJump);
    }

    @Override
    public void exitLoop(PewParser.LoopContext ctx) {
        out.emitAInstr(loopAddExpression);
        out.emitCInstr(HackGen.DestNone, HackGen.CompNone, HackGen.JMP);
        int endAddExpression = out.currentCodeAddress();
        out.reviseAInstr(jumpEndInstructionAddExpression, endAddExpression);
    }
}