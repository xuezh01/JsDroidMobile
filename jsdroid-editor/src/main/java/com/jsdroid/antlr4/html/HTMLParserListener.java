// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/html\HTMLParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.html;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a preParse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the preParse tree
	 */
	void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the preParse tree
	 */
	void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the preParse tree
	 */
	void enterHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the preParse tree
	 */
	void exitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the preParse tree
	 */
	void enterHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the preParse tree
	 */
	void exitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the preParse tree
	 */
	void enterHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the preParse tree
	 */
	void exitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the preParse tree
	 */
	void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the preParse tree
	 */
	void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#htmlAttributeName}.
	 * @param ctx the preParse tree
	 */
	void enterHtmlAttributeName(HTMLParser.HtmlAttributeNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#htmlAttributeName}.
	 * @param ctx the preParse tree
	 */
	void exitHtmlAttributeName(HTMLParser.HtmlAttributeNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#htmlAttributeValue}.
	 * @param ctx the preParse tree
	 */
	void enterHtmlAttributeValue(HTMLParser.HtmlAttributeValueContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#htmlAttributeValue}.
	 * @param ctx the preParse tree
	 */
	void exitHtmlAttributeValue(HTMLParser.HtmlAttributeValueContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#htmlTagName}.
	 * @param ctx the preParse tree
	 */
	void enterHtmlTagName(HTMLParser.HtmlTagNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#htmlTagName}.
	 * @param ctx the preParse tree
	 */
	void exitHtmlTagName(HTMLParser.HtmlTagNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the preParse tree
	 */
	void enterHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the preParse tree
	 */
	void exitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the preParse tree
	 */
	void enterHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the preParse tree
	 */
	void exitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the preParse tree
	 */
	void enterHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the preParse tree
	 */
	void exitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#xhtmlCDATA}.
	 * @param ctx the preParse tree
	 */
	void enterXhtmlCDATA(HTMLParser.XhtmlCDATAContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#xhtmlCDATA}.
	 * @param ctx the preParse tree
	 */
	void exitXhtmlCDATA(HTMLParser.XhtmlCDATAContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#dtd}.
	 * @param ctx the preParse tree
	 */
	void enterDtd(HTMLParser.DtdContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#dtd}.
	 * @param ctx the preParse tree
	 */
	void exitDtd(HTMLParser.DtdContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#xml}.
	 * @param ctx the preParse tree
	 */
	void enterXml(HTMLParser.XmlContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#xml}.
	 * @param ctx the preParse tree
	 */
	void exitXml(HTMLParser.XmlContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#scriptlet}.
	 * @param ctx the preParse tree
	 */
	void enterScriptlet(HTMLParser.ScriptletContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#scriptlet}.
	 * @param ctx the preParse tree
	 */
	void exitScriptlet(HTMLParser.ScriptletContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#script}.
	 * @param ctx the preParse tree
	 */
	void enterScript(HTMLParser.ScriptContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#script}.
	 * @param ctx the preParse tree
	 */
	void exitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Enter a preParse tree produced by {@link HTMLParser#style}.
	 * @param ctx the preParse tree
	 */
	void enterStyle(HTMLParser.StyleContext ctx);
	/**
	 * Exit a preParse tree produced by {@link HTMLParser#style}.
	 * @param ctx the preParse tree
	 */
	void exitStyle(HTMLParser.StyleContext ctx);
}