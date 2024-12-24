// Generated from /home/imdnos/Documents/java/compiler/angularCompiler/antlr/AngularParser.g4 by ANTLR 4.13.2

package gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssOption}
	 * labeled alternative in {@link AngularParser#option}.
	 * @param ctx the parse tree
	 */
	void enterCssOption(AngularParser.CssOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssOption}
	 * labeled alternative in {@link AngularParser#option}.
	 * @param ctx the parse tree
	 */
	void exitCssOption(AngularParser.CssOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlOption}
	 * labeled alternative in {@link AngularParser#option}.
	 * @param ctx the parse tree
	 */
	void enterHtmlOption(AngularParser.HtmlOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlOption}
	 * labeled alternative in {@link AngularParser#option}.
	 * @param ctx the parse tree
	 */
	void exitHtmlOption(AngularParser.HtmlOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ts}.
	 * @param ctx the parse tree
	 */
	void enterTs(AngularParser.TsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ts}.
	 * @param ctx the parse tree
	 */
	void exitTs(AngularParser.TsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(AngularParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(AngularParser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(AngularParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(AngularParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AngularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AngularParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngularParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngularParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(AngularParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(AngularParser.KeyValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(AngularParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(AngularParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodParams}.
	 * @param ctx the parse tree
	 */
	void enterMethodParams(AngularParser.MethodParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodParams}.
	 * @param ctx the parse tree
	 */
	void exitMethodParams(AngularParser.MethodParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(AngularParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(AngularParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(AngularParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(AngularParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(AngularParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(AngularParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(AngularParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(AngularParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(AngularParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(AngularParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(AngularParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(AngularParser.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterCssProperty(AngularParser.CssPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitCssProperty(AngularParser.CssPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(AngularParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValue(AngularParser.PropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValue(AngularParser.PropertyValueContext ctx);
}