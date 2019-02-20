// Generated from D:/IntelliJ/projects/xpres/src/pew/grammar\Pew.g4 by ANTLR 4.5.1
package pew.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PewParser}.
 */
public interface PewListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link PewParser#program}.
     *
     * @param ctx the parse tree
     */
    void enterProgram(PewParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link PewParser#program}.
     *
     * @param ctx the parse tree
     */
    void exitProgram(PewParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link PewParser#code}.
     *
     * @param ctx the parse tree
     */
    void enterCode(PewParser.CodeContext ctx);

    /**
     * Exit a parse tree produced by {@link PewParser#code}.
     *
     * @param ctx the parse tree
     */
    void exitCode(PewParser.CodeContext ctx);

    /**
     * Enter a parse tree produced by {@link PewParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(PewParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PewParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(PewParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PewParser#declaration}.
     *
     * @param ctx the parse tree
     */
    void enterDeclaration(PewParser.DeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link PewParser#declaration}.
     *
     * @param ctx the parse tree
     */
    void exitDeclaration(PewParser.DeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link PewParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void enterAssignment(PewParser.AssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link PewParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void exitAssignment(PewParser.AssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link PewParser#loop}.
     *
     * @param ctx the parse tree
     */
    void enterLoop(PewParser.LoopContext ctx);

    /**
     * Exit a parse tree produced by {@link PewParser#loop}.
     *
     * @param ctx the parse tree
     */
    void exitLoop(PewParser.LoopContext ctx);

    /**
     * Enter a parse tree produced by {@link PewParser#print}.
     *
     * @param ctx the parse tree
     */
    void enterPrint(PewParser.PrintContext ctx);

    /**
     * Exit a parse tree produced by {@link PewParser#print}.
     *
     * @param ctx the parse tree
     */
    void exitPrint(PewParser.PrintContext ctx);

    /**
     * Enter a parse tree produced by {@link PewParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(PewParser.ExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link PewParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(PewParser.ExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link PewParser#atomicExpression}.
     *
     * @param ctx the parse tree
     */
    void enterAtomicExpression(PewParser.AtomicExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link PewParser#atomicExpression}.
     *
     * @param ctx the parse tree
     */
    void exitAtomicExpression(PewParser.AtomicExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link PewParser#addExpression}.
     *
     * @param ctx the parse tree
     */
    void enterAddExpression(PewParser.AddExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link PewParser#addExpression}.
     *
     * @param ctx the parse tree
     */
    void exitAddExpression(PewParser.AddExpressionContext ctx);
}