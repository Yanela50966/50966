// Generated from c:/Users/nahuu/50966/grammar/JavaScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaScriptParser}.
 */
public interface JavaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JavaScriptParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JavaScriptParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(JavaScriptParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(JavaScriptParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(JavaScriptParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(JavaScriptParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(JavaScriptParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(JavaScriptParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#consoleStatement}.
	 * @param ctx the parse tree
	 */
	void enterConsoleStatement(JavaScriptParser.ConsoleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#consoleStatement}.
	 * @param ctx the parse tree
	 */
	void exitConsoleStatement(JavaScriptParser.ConsoleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(JavaScriptParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(JavaScriptParser.TermContext ctx);
}