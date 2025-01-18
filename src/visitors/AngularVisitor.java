package visitors;

import gen.AngularParser;
import gen.AngularParserBaseVisitor;
import css.Css;
import html.Html;
import program.Program;
import ts.*;
import ts.Number;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AngularVisitor extends AngularParserBaseVisitor {

    Program program;


    @Override
    public Object visitProgram(AngularParser.ProgramContext ctx) {

        program = new Program();

        Css css = (Css) visitCssOption(ctx.cssOption());
        Html html = (Html) visitHtmlOption(ctx.htmlOption());
        TypeScript typeScript = (TypeScript) visitTs(ctx.ts());

        program.setCss(css);
        program.setHtml(html);
        program.setTypeScript(typeScript);

        return program;

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


        TypeScript typeScript = program.typeScript;

//        Map<String, Type> attributes = new HashMap<>();
        for (AngularParser.AttributeContext attributeContext : ctx.attribute()) {
            Attribute attribute = (Attribute) visitAttribute(attributeContext);
            typeScript.addAttribute(attribute.getName(), attribute.getType());
        }

        Constructor constructor = (Constructor) visitConstructor(ctx.constructor());

        typeScript.setConstructor(constructor);

        return typeScript;
    }

    @Override
    public Object visitAttribute(AngularParser.AttributeContext ctx) {

        String name = ctx.ID().toString();

        Type type = (Type) visitType(ctx.type());

        return new Attribute(name, type);

    }

    @Override
    public Object visitDeclareVariable(AngularParser.DeclareVariableContext ctx) {

        String name = ctx.ID().toString();

        Type type = (Type) visitType(ctx.type());

        return new Variable(name, type);
    }

    @Override
    public Object visitDeclareAndAssign(AngularParser.DeclareAndAssignContext ctx) {

        Type type;

        if (ctx.array() != null) {
            type = new Any((Listable) visitArray(ctx.array()));
        } else {
            type = (Type) visitLiteral(ctx.literal());

            if (ctx.type().ANY() != null) {
                type = new Any(type);
            }

        }

        return new Variable(ctx.ID().toString(), type);

    }


    @Override
    public Object visitConstructor(AngularParser.ConstructorContext ctx) {

        Constructor constructor = new Constructor();

        for (var expressionContext : ctx.expression()) {

            if (expressionContext instanceof AngularParser.DeclareVariableContext) {
//                 Handle DeclareVariable
                Variable variable = (Variable) visitDeclareVariable((AngularParser.DeclareVariableContext) expressionContext);

                constructor.addVariable(variable.getName(), variable.getType());

            } else if (expressionContext instanceof AngularParser.DeclareAndAssignContext) {
                // Handle DeclareAndAssign
                Variable variable = (Variable) visitDeclareAndAssign((AngularParser.DeclareAndAssignContext) expressionContext);

                constructor.addVariable(variable.getName(), variable.getType());
            } else if (expressionContext instanceof AngularParser.AssignVariableContext) {
                // Handle AssignVariable
                Variable variable = (Variable) visitAssignVariable((AngularParser.AssignVariableContext) expressionContext);

                constructor.addVariable(variable.getName(), variable.getType());


            } else if (expressionContext instanceof AngularParser.AssignAttributeContext) {
                // Handle AssignAttribute

                if (((AngularParser.AssignAttributeContext) expressionContext).literal() != null) {
                    Attribute attribute = (Attribute) visitAssignAttribute((AngularParser.AssignAttributeContext) expressionContext);
                program.typeScript.addAttribute(attribute.getName(), attribute.getType());
                }
                else if (((AngularParser.AssignAttributeContext) expressionContext).array() != null) {
                    Array attribute= (Array) visitAssignAttribute((AngularParser.AssignAttributeContext) expressionContext);
                program.typeScript.addAttribute(((AngularParser.AssignAttributeContext) expressionContext).ID().getText(), attribute);
                }


            }


        }

        return constructor;
    }

    @Override
    public Object visitType(AngularParser.TypeContext ctx) {

        if (ctx.ANY() != null) {
            return new Any();
        }
        if (ctx.BOOLEAN() != null) {
            return new Bool();
        }
        if (ctx.NUMBER() != null) {
            return new Number();
        }
        if (ctx.STRINGDL() != null) {
            return new Text();
        }
        return null;
    }

    @Override
    public Object visitLiteral(AngularParser.LiteralContext ctx) {

        if (ctx.LBRACE() == null && ctx.ID() != null) {

        }
        if (ctx.STRING() != null) {
            return new Text(ctx.STRING().toString());
        }
        if (ctx.NUMERIC_VALUE() != null) {
            return new Number(Integer.parseInt(ctx.NUMERIC_VALUE().toString()));
        }
        if (ctx.TRUE() != null) {
            return new Bool(true);
        }
        if (ctx.FALSE() != null) {
            return new Bool(false);
        }

        if (ctx.LBRACE() != null) {
            KeyValuePair keyValuePair = new KeyValuePair();

            for (int i = 0; i < ctx.STRING().size(); i++) {
                keyValuePair.addToKeyValue(ctx.ID(i).toString(), ctx.STRING(i).toString());
            }
            return keyValuePair;
        }

        return null;
    }

    @Override
    public Object visitArray(AngularParser.ArrayContext ctx) {
        Array array = new Array();
        for (int i = 0; i < ctx.literal().size(); i++) {
            array.addToArray((Listable) visitLiteral(ctx.literal(i)));
        }
        return array;
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
        LinkedList<ID> expressions = new LinkedList<>();
        for (AngularParser.ExpressionContext expression : ctx.expression()) {
//            expressions.add(v)

        }
        return super.visitBody(ctx);
    }

    @Override
    public Object visitAssignVariable(AngularParser.AssignVariableContext ctx) {
        return new Variable(ctx.ID().toString(), (Type) visitLiteral(ctx.literal()));
    }

    @Override
    public Object visitAssignAttribute(AngularParser.AssignAttributeContext ctx) {

        if (ctx.array() != null) {
            return (Array) visitArray(ctx.array());
        } else {
            Type type = (Type) visitLiteral(ctx.literal());
            return new Attribute(ctx.ID().toString(), type);
        }
    }

    //    >>>>>>>>>>>>>>


}
