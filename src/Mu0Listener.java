// Generated from Mu0.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Mu0Parser}.
 */
public interface Mu0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Mu0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Mu0Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mu0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Mu0Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mu0Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(Mu0Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mu0Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(Mu0Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mu0Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Mu0Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mu0Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Mu0Parser.ProgramContext ctx);
}