// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/xml\XMLParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.xml;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a preParse tree produced by
 * {@link XMLParser}.
 */
public interface XMLParserListener extends ParseTreeListener {
	/**
	 * Enter a preParse tree produced by {@link XMLParser#document}.
	 * @param ctx the preParse tree
	 */
	void enterDocument(XMLParser.DocumentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link XMLParser#document}.
	 * @param ctx the preParse tree
	 */
	void exitDocument(XMLParser.DocumentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link XMLParser#prolog}.
	 * @param ctx the preParse tree
	 */
	void enterProlog(XMLParser.PrologContext ctx);
	/**
	 * Exit a preParse tree produced by {@link XMLParser#prolog}.
	 * @param ctx the preParse tree
	 */
	void exitProlog(XMLParser.PrologContext ctx);
	/**
	 * Enter a preParse tree produced by {@link XMLParser#content}.
	 * @param ctx the preParse tree
	 */
	void enterContent(XMLParser.ContentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link XMLParser#content}.
	 * @param ctx the preParse tree
	 */
	void exitContent(XMLParser.ContentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link XMLParser#element}.
	 * @param ctx the preParse tree
	 */
	void enterElement(XMLParser.ElementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link XMLParser#element}.
	 * @param ctx the preParse tree
	 */
	void exitElement(XMLParser.ElementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link XMLParser#reference}.
	 * @param ctx the preParse tree
	 */
	void enterReference(XMLParser.ReferenceContext ctx);
	/**
	 * Exit a preParse tree produced by {@link XMLParser#reference}.
	 * @param ctx the preParse tree
	 */
	void exitReference(XMLParser.ReferenceContext ctx);
	/**
	 * Enter a preParse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the preParse tree
	 */
	void enterAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the preParse tree
	 */
	void exitAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link XMLParser#chardata}.
	 * @param ctx the preParse tree
	 */
	void enterChardata(XMLParser.ChardataContext ctx);
	/**
	 * Exit a preParse tree produced by {@link XMLParser#chardata}.
	 * @param ctx the preParse tree
	 */
	void exitChardata(XMLParser.ChardataContext ctx);
	/**
	 * Enter a preParse tree produced by {@link XMLParser#misc}.
	 * @param ctx the preParse tree
	 */
	void enterMisc(XMLParser.MiscContext ctx);
	/**
	 * Exit a preParse tree produced by {@link XMLParser#misc}.
	 * @param ctx the preParse tree
	 */
	void exitMisc(XMLParser.MiscContext ctx);
}