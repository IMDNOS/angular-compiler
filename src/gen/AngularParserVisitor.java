// Generated from /home/imdnos/Documents/java/compiler/angularCompiler/antlr/AngularParser.g4 by ANTLR 4.13.2

package gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssOption}
	 * labeled alternative in {@link AngularParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssOption(AngularParser.CssOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlOption}
	 * labeled alternative in {@link AngularParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlOption(AngularParser.HtmlOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs(AngularParser.TsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#globals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobals(AngularParser.GlobalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(AngularParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AngularParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AngularParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValuePair(AngularParser.KeyValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(AngularParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParams(AngularParser.MethodParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(AngularParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(AngularParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(AngularParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(AngularParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(AngularParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(AngularParser.CssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssProperty(AngularParser.CssPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyValue(AngularParser.PropertyValueContext ctx);
}