package visitors;

import gen.AngularParser;
import gen.AngularParserBaseVisitor;
import css.Css;
import html.Html;
import program.Program;
import ts.TypeScript;

public class AngularVisitor extends AngularParserBaseVisitor {

    @Override
    public Object visitProgram(AngularParser.ProgramContext ctx) {

        Css css = (Css) visitCssOption(ctx.cssOption());
        Html html = (Html) visitHtmlOption(ctx.htmlOption());
        TypeScript typeScript = (TypeScript) visitTs(ctx.ts());

        return new Program(html, css, typeScript);
    }

    @Override
    public Object visitCssOption(AngularParser.CssOptionContext ctx) {
        Css css = new Css((String) visitCss(ctx.css()));
        return css;
    }


    @Override
    public Object visitCss(AngularParser.CssContext ctx) {
        return ctx.getText();
    }

//     <<<<<<<<<<<<<    HTML


    @Override
    public Object visitHtmlOption(AngularParser.HtmlOptionContext ctx) {
        return null;
    }

    @Override
    public Object visitHtml(AngularParser.HtmlContext ctx) {
        return super.visitHtml(ctx);
    }

    @Override
    public Object visitElement(AngularParser.ElementContext ctx) {
        return super.visitElement(ctx);
    }

    @Override
    public Object visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx) {
        return super.visitHtmlAttribute(ctx);
    }

    @Override
    public Object visitContent(AngularParser.ContentContext ctx) {
        return super.visitContent(ctx);
    }

//    >>>>>>>>>>>>>>>>>>>>


// <<<<<<<<<<<<<<< TS

    @Override
    public Object visitTs(AngularParser.TsContext ctx) {
        return super.visitTs(ctx);
    }

    @Override
    public Object visitGlobals(AngularParser.GlobalsContext ctx) {
        return super.visitGlobals(ctx);
    }

    @Override
    public Object visitAttribute(AngularParser.AttributeContext ctx) {
        return super.visitAttribute(ctx);
    }

    @Override
    public Object visitDeclare(AngularParser.DeclareContext ctx) {
        return super.visitDeclare(ctx);
    }

    @Override
    public Object visitDeclareAndAssign(AngularParser.DeclareAndAssignContext ctx) {
        return super.visitDeclareAndAssign(ctx);
    }

    @Override
    public Object visitAssign(AngularParser.AssignContext ctx) {
        return super.visitAssign(ctx);
    }

    @Override
    public Object visitConstructor(AngularParser.ConstructorContext ctx) {
        return super.visitConstructor(ctx);
    }

    @Override
    public Object visitType(AngularParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Object visitLiteral(AngularParser.LiteralContext ctx) {
        return super.visitLiteral(ctx);
    }

    @Override
    public Object visitAny(AngularParser.AnyContext ctx) {
        return super.visitAny(ctx);
    }

    @Override
    public Object visitKeyValuePair(AngularParser.KeyValuePairContext ctx) {
        return super.visitKeyValuePair(ctx);
    }

    @Override
    public Object visitMethod(AngularParser.MethodContext ctx) {
        return super.visitMethod(ctx);
    }

    @Override
    public Object visitMethodParams(AngularParser.MethodParamsContext ctx) {
        return super.visitMethodParams(ctx);
    }

    @Override
    public Object visitParam(AngularParser.ParamContext ctx) {
        return super.visitParam(ctx);
    }

    @Override
    public Object visitBody(AngularParser.BodyContext ctx) {
        return super.visitBody(ctx);
    }

//    >>>>>>>>>>>>>>


}
