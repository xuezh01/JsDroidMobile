// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/go\GoParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.go;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a preParse tree produced
 * by {@link GoParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GoParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#srcFile}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitSrcFile(GoParserParser.SrcFileContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#statement}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitStatement(GoParserParser.StatementContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#imports}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitImports(GoParserParser.ImportsContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#variableDec}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitVariableDec(GoParserParser.VariableDecContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#variableInit}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitVariableInit(GoParserParser.VariableInitContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#arrayAccess}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(GoParserParser.ArrayAccessContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#functionDec}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitFunctionDec(GoParserParser.FunctionDecContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#funcArgs}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(GoParserParser.FuncArgsContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#funcOut}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitFuncOut(GoParserParser.FuncOutContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#functionCall}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GoParserParser.FunctionCallContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#block}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitBlock(GoParserParser.BlockContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#insideBlockStat}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitInsideBlockStat(GoParserParser.InsideBlockStatContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#typeConversion}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(GoParserParser.TypeConversionContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#ifStatement}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GoParserParser.IfStatementContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#forStatement}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitForStatement(GoParserParser.ForStatementContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#switchStat}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitSwitchStat(GoParserParser.SwitchStatContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#switchCase}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(GoParserParser.SwitchCaseContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#expression}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitExpression(GoParserParser.ExpressionContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#boolOp}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitBoolOp(GoParserParser.BoolOpContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#type}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitType(GoParserParser.TypeContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#value}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitValue(GoParserParser.ValueContext ctx);
	/**
	 * Visit a preParse tree produced by {@link GoParserParser#eos}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitEos(GoParserParser.EosContext ctx);
}