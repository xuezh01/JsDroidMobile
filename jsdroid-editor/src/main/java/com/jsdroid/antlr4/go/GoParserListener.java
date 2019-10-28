// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/go\GoParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.go;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a preParse tree produced by
 * {@link GoParserParser}.
 */
public interface GoParserListener extends ParseTreeListener {
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#srcFile}.
	 * @param ctx the preParse tree
	 */
	void enterSrcFile(GoParserParser.SrcFileContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#srcFile}.
	 * @param ctx the preParse tree
	 */
	void exitSrcFile(GoParserParser.SrcFileContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterStatement(GoParserParser.StatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitStatement(GoParserParser.StatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#imports}.
	 * @param ctx the preParse tree
	 */
	void enterImports(GoParserParser.ImportsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#imports}.
	 * @param ctx the preParse tree
	 */
	void exitImports(GoParserParser.ImportsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#variableDec}.
	 * @param ctx the preParse tree
	 */
	void enterVariableDec(GoParserParser.VariableDecContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#variableDec}.
	 * @param ctx the preParse tree
	 */
	void exitVariableDec(GoParserParser.VariableDecContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#variableInit}.
	 * @param ctx the preParse tree
	 */
	void enterVariableInit(GoParserParser.VariableInitContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#variableInit}.
	 * @param ctx the preParse tree
	 */
	void exitVariableInit(GoParserParser.VariableInitContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#arrayAccess}.
	 * @param ctx the preParse tree
	 */
	void enterArrayAccess(GoParserParser.ArrayAccessContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#arrayAccess}.
	 * @param ctx the preParse tree
	 */
	void exitArrayAccess(GoParserParser.ArrayAccessContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#functionDec}.
	 * @param ctx the preParse tree
	 */
	void enterFunctionDec(GoParserParser.FunctionDecContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#functionDec}.
	 * @param ctx the preParse tree
	 */
	void exitFunctionDec(GoParserParser.FunctionDecContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#funcArgs}.
	 * @param ctx the preParse tree
	 */
	void enterFuncArgs(GoParserParser.FuncArgsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#funcArgs}.
	 * @param ctx the preParse tree
	 */
	void exitFuncArgs(GoParserParser.FuncArgsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#funcOut}.
	 * @param ctx the preParse tree
	 */
	void enterFuncOut(GoParserParser.FuncOutContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#funcOut}.
	 * @param ctx the preParse tree
	 */
	void exitFuncOut(GoParserParser.FuncOutContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#functionCall}.
	 * @param ctx the preParse tree
	 */
	void enterFunctionCall(GoParserParser.FunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#functionCall}.
	 * @param ctx the preParse tree
	 */
	void exitFunctionCall(GoParserParser.FunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#block}.
	 * @param ctx the preParse tree
	 */
	void enterBlock(GoParserParser.BlockContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#block}.
	 * @param ctx the preParse tree
	 */
	void exitBlock(GoParserParser.BlockContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#insideBlockStat}.
	 * @param ctx the preParse tree
	 */
	void enterInsideBlockStat(GoParserParser.InsideBlockStatContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#insideBlockStat}.
	 * @param ctx the preParse tree
	 */
	void exitInsideBlockStat(GoParserParser.InsideBlockStatContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#typeConversion}.
	 * @param ctx the preParse tree
	 */
	void enterTypeConversion(GoParserParser.TypeConversionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#typeConversion}.
	 * @param ctx the preParse tree
	 */
	void exitTypeConversion(GoParserParser.TypeConversionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#ifStatement}.
	 * @param ctx the preParse tree
	 */
	void enterIfStatement(GoParserParser.IfStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#ifStatement}.
	 * @param ctx the preParse tree
	 */
	void exitIfStatement(GoParserParser.IfStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#forStatement}.
	 * @param ctx the preParse tree
	 */
	void enterForStatement(GoParserParser.ForStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#forStatement}.
	 * @param ctx the preParse tree
	 */
	void exitForStatement(GoParserParser.ForStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#switchStat}.
	 * @param ctx the preParse tree
	 */
	void enterSwitchStat(GoParserParser.SwitchStatContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#switchStat}.
	 * @param ctx the preParse tree
	 */
	void exitSwitchStat(GoParserParser.SwitchStatContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#switchCase}.
	 * @param ctx the preParse tree
	 */
	void enterSwitchCase(GoParserParser.SwitchCaseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#switchCase}.
	 * @param ctx the preParse tree
	 */
	void exitSwitchCase(GoParserParser.SwitchCaseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterExpression(GoParserParser.ExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitExpression(GoParserParser.ExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#boolOp}.
	 * @param ctx the preParse tree
	 */
	void enterBoolOp(GoParserParser.BoolOpContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#boolOp}.
	 * @param ctx the preParse tree
	 */
	void exitBoolOp(GoParserParser.BoolOpContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#type}.
	 * @param ctx the preParse tree
	 */
	void enterType(GoParserParser.TypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#type}.
	 * @param ctx the preParse tree
	 */
	void exitType(GoParserParser.TypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#value}.
	 * @param ctx the preParse tree
	 */
	void enterValue(GoParserParser.ValueContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#value}.
	 * @param ctx the preParse tree
	 */
	void exitValue(GoParserParser.ValueContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GoParserParser#eos}.
	 * @param ctx the preParse tree
	 */
	void enterEos(GoParserParser.EosContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GoParserParser#eos}.
	 * @param ctx the preParse tree
	 */
	void exitEos(GoParserParser.EosContext ctx);
}