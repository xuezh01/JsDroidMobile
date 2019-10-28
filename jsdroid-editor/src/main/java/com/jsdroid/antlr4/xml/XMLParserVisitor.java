// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/xml\XMLParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.xml;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a preParse tree produced
 * by {@link XMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a preParse tree produced by {@link XMLParser#document}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitDocument(XMLParser.DocumentContext ctx);
	/**
	 * Visit a preParse tree produced by {@link XMLParser#prolog}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitProlog(XMLParser.PrologContext ctx);
	/**
	 * Visit a preParse tree produced by {@link XMLParser#content}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitContent(XMLParser.ContentContext ctx);
	/**
	 * Visit a preParse tree produced by {@link XMLParser#element}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitElement(XMLParser.ElementContext ctx);
	/**
	 * Visit a preParse tree produced by {@link XMLParser#reference}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitReference(XMLParser.ReferenceContext ctx);
	/**
	 * Visit a preParse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Visit a preParse tree produced by {@link XMLParser#chardata}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitChardata(XMLParser.ChardataContext ctx);
	/**
	 * Visit a preParse tree produced by {@link XMLParser#misc}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitMisc(XMLParser.MiscContext ctx);
}