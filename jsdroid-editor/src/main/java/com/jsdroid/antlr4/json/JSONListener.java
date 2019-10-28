// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/json\JSON.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.json;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a preParse tree produced by
 * {@link JSONParser}.
 */
public interface JSONListener extends ParseTreeListener {
	/**
	 * Enter a preParse tree produced by {@link JSONParser#json}.
	 * @param ctx the preParse tree
	 */
	void enterJson(JSONParser.JsonContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JSONParser#json}.
	 * @param ctx the preParse tree
	 */
	void exitJson(JSONParser.JsonContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JSONParser#object}.
	 * @param ctx the preParse tree
	 */
	void enterObject(JSONParser.ObjectContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JSONParser#object}.
	 * @param ctx the preParse tree
	 */
	void exitObject(JSONParser.ObjectContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JSONParser#pair}.
	 * @param ctx the preParse tree
	 */
	void enterPair(JSONParser.PairContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JSONParser#pair}.
	 * @param ctx the preParse tree
	 */
	void exitPair(JSONParser.PairContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JSONParser#array}.
	 * @param ctx the preParse tree
	 */
	void enterArray(JSONParser.ArrayContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JSONParser#array}.
	 * @param ctx the preParse tree
	 */
	void exitArray(JSONParser.ArrayContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JSONParser#value}.
	 * @param ctx the preParse tree
	 */
	void enterValue(JSONParser.ValueContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JSONParser#value}.
	 * @param ctx the preParse tree
	 */
	void exitValue(JSONParser.ValueContext ctx);
}