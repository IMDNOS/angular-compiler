package visitors;

import gen.AngularParser;
import gen.AngularParserBaseVisitor;
import css.Css;
import html.*;
import program.Program;
import ts.*;
import ts.Number;

import java.util.*;

public class AngularVisitor extends AngularParserBaseVisitor {

    Program program;


    @Override
    public Object visitProgram(AngularParser.ProgramContext ctx) {

        program = new Program();

        Css css = (Css) visitCssOption(ctx.cssOption());
        TypeScript typeScript = (TypeScript) visitTs(ctx.ts());
        Html html = (Html) visitHtmlOption(ctx.htmlOption());

        program.setCss(css);
        program.setHtml(html);
//        program.setTypeScript(typeScript);

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
    public Html visitHtmlOption(AngularParser.HtmlOptionContext ctx) {
        return (Html) visit(ctx.html());
    }

    @Override
    public Html visitHtml(AngularParser.HtmlContext ctx) {
        List<DivNode> divs = new ArrayList<>();
        if (ctx.div() != null) {
            divs.add((DivNode) visit(ctx.div()));
        }
        return new HtmlNode(divs);
    }

    @Override
    public Html visitDiv(AngularParser.DivContext ctx) {
        String id = null;
        String classValue = null;
        List<Html> children = new ArrayList<>();

        for (var attributeContext : ctx.classid()) {
            String[] parts = attributeContext.getText().split("=");
            if (parts.length == 2) {
                String attributeName = parts[0].trim();
                String attributeValue = parts[1].replace("\"", "").trim();

                if ("id".equals(attributeName)) {
                    id = attributeValue;
                } else if ("class".equals(attributeName)) {
                    classValue = attributeValue;
                }
            }
        }

        String directive = null;
        if (ctx.ng() != null && !ctx.ng().isEmpty()) {
            directive = ctx.ng().get(0).getText();

            for (var ngContext : ctx.ng()) {
                directive = ngContext.getText();
                break;
            }
        }

        String event = null;
        if (ctx.event() != null && !ctx.event().isEmpty()) {
            event = ctx.event().get(0).getText();

            for (var eventContext : ctx.event()) {
                event = eventContext.getText();
                break;
            }
        }

        if (ctx.img() != null) {
            for (var imgContext : ctx.img()) {
                children.add((Html) visit(imgContext));
            }
        }
        if (ctx.div() != null) {
            for (var divContext : ctx.div()) {
                children.add((Html) visit(divContext));
            }
        }
        if (ctx.br() != null) {
            for (var brContext : ctx.br()) {
                children.add((Html) visit(brContext));
            }
        }
        if (ctx.paragragh() != null) {
            for (var paragraphContext : ctx.paragragh()) {
                Html child = visitParagragh(paragraphContext);
                if (child != null) {
                    children.add(child);
                }
            }
        }

        return new DivNode(id, classValue, directive, event, children);
    }

    @Override
    public Html visitImg(AngularParser.ImgContext ctx) {
        String property = ctx.ANGULAR_ATTRIBUTE_PROPERTY() != null ? ctx.ANGULAR_ATTRIBUTE_PROPERTY().getText() : "";
        return new ImgNode(property);
    }

    @Override
    public Html visitBr(AngularParser.BrContext ctx) {
        String binding = ctx.ANGULAR_BINDING() != null ? ctx.ANGULAR_BINDING().getText() : "";
        return new BrNode(binding);
    }

    @Override
    public Html visitParagragh(AngularParser.ParagraghContext ctx) {
        if (ctx.h2Element() != null) {
            String h2Text = ctx.h2Element().ANGULAR_BINDING().getText();
            return new H2Node(h2Text);
        } else if (ctx.pElement() != null) {
            String pText = ctx.pElement().ANGULAR_BINDING().getText();
            return new ParagraphNode(pText);
        }
        return null;
    }


    @Override
    public Html visitClassid(AngularParser.ClassidContext ctx) {
        return new ClassidNode(ctx.ATTRIBUTE().getText());
    }

    @Override
    public Html visitNg(AngularParser.NgContext ctx) {
        return new NgNode(ctx.ANGULAR_ATTRIBUTE_DIRECTIVE().getText());
    }

    @Override
    public Html visitEvent(AngularParser.EventContext ctx) {
        return new EventNode(ctx.ANGULAR_ATTRIBUTE_EVENT().getText());
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

        /* Constructor constructor = (Constructor) */
        visitConstructor(ctx.constructor());


        for (AngularParser.MethodContext methodContext : ctx.method()) {
            Method method = (Method) visitMethod(methodContext);
//            typeScript.methods.add(method);
        }


//        typeScript.setConstructor(constructor);

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

    Map<String, Listable> currentScope;

    @Override
    public Object visitConstructor(AngularParser.ConstructorContext ctx) {

        Constructor constructor = program.typeScript.constructor;

        currentScope = constructor.getVariables();

        for (var expressionContext : ctx.expression()) {

            if (expressionContext instanceof AngularParser.DeclareVariableContext) {
                Variable variable = (Variable) visitDeclareVariable((AngularParser.DeclareVariableContext) expressionContext);
                constructor.addVariable(variable.getName(), variable.getType());
            } else if (expressionContext instanceof AngularParser.DeclareAndAssignContext) {
                Variable variable = (Variable) visitDeclareAndAssign((AngularParser.DeclareAndAssignContext) expressionContext);
                constructor.addVariable(variable.getName(), variable.getType());
            } else if (expressionContext instanceof AngularParser.AssignVariableContext) {
                Variable variable = (Variable) visitAssignVariable((AngularParser.AssignVariableContext) expressionContext);
                constructor.addVariable(variable.getName(), variable.getType());
            } else if (expressionContext instanceof AngularParser.AssignAttributeContext) {

                if (((AngularParser.AssignAttributeContext) expressionContext).literal() != null) {
                    Attribute attribute = (Attribute) visitAssignAttribute((AngularParser.AssignAttributeContext) expressionContext);
                    program.typeScript.addAttribute(attribute.getName(), attribute.getType());
                } else if (((AngularParser.AssignAttributeContext) expressionContext).array() != null) {
                    Array attribute = (Array) visitAssignAttribute((AngularParser.AssignAttributeContext) expressionContext);
                    program.typeScript.addAttribute(((AngularParser.AssignAttributeContext) expressionContext).ID().getText(), attribute);
                }


            }


        }

        return constructor;
    }

    @Override
    public Object visitType(AngularParser.TypeContext ctx) {

        if (ctx.BOOLEAN() != null) {
            return new Bool();
        }
        if (ctx.NUMBER() != null) {
            return new Number();
        }
        if (ctx.STRINGDL() != null) {
            return new Text();
        }
        if (ctx.ANY() != null) {
            return new Any();
        }
        return null;
    }

    @Override
    public Object visitLiteral(AngularParser.LiteralContext ctx) {

        if (ctx.LBRACE() == null && ctx.ID().size() == 1) {
            Listable t = currentScope.get(ctx.ID(0).toString());
            if (t == null) {
                System.out.println("no such variable found: " + ctx.ID(0).toString());
                System.exit(0);
            }
            return t;
        }
        if (ctx.LBRACE() != null) {
            KeyValuePair keyValuePair = new KeyValuePair();

            for (int i = 0; i < ctx.STRING().size(); i++) {
                keyValuePair.addToKeyValue(ctx.ID(i).toString(), ctx.STRING(i).toString());
            }
            return keyValuePair;
        }
        if (ctx.STRING(0) != null) {
            return new Text(ctx.STRING(0).toString());
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

        return null;
    }

    @Override
    public Object visitArray(AngularParser.ArrayContext ctx) {

//        System.out.println(visitLiteral(ctx.literal(1)));

        Array array = new Array();
        for (int i = 0; i < ctx.literal().size(); i++) {
            array.addToArray((Listable) visitLiteral(ctx.literal(i)));
        }
        return array;
    }

    @Override
    public Object visitMethod(AngularParser.MethodContext ctx) {

        String name = ctx.ID().toString();

        Method method = new Method(name);
        program.typeScript.methods.add(method);

        ArrayList<Variable> params = (ArrayList<Variable>) visitMethodParams(ctx.methodParams());

        for (var param : params) {
            method.addVariable(param.getName(), param.getType());
        }


        currentScope = method.getVariables();

        for (var expressionContext : ctx.expression()) {

            if (expressionContext instanceof AngularParser.DeclareVariableContext) {
                Variable variable = (Variable) visitDeclareVariable((AngularParser.DeclareVariableContext) expressionContext);
                method.addVariable(variable.getName(), variable.getType());
            } else if (expressionContext instanceof AngularParser.DeclareAndAssignContext) {
                Variable variable = (Variable) visitDeclareAndAssign((AngularParser.DeclareAndAssignContext) expressionContext);
                method.addVariable(variable.getName(), variable.getType());
//                System.out.println(variable);
            } else if (expressionContext instanceof AngularParser.AssignVariableContext) {
                Variable variable = (Variable) visitAssignVariable((AngularParser.AssignVariableContext) expressionContext);
                method.addVariable(variable.getName(), variable.getType());
            } else if (expressionContext instanceof AngularParser.AssignAttributeContext) {

                if (((AngularParser.AssignAttributeContext) expressionContext).literal() != null) {
                    System.out.println(program.typeScript.methods.get(0));
                    Attribute attribute = (Attribute) visitAssignAttribute((AngularParser.AssignAttributeContext) expressionContext);
                    program.typeScript.addAttribute(attribute.getName(), attribute.getType());
                } else if (((AngularParser.AssignAttributeContext) expressionContext).array() != null) {
                    Array attribute = (Array) visitAssignAttribute((AngularParser.AssignAttributeContext) expressionContext);
                    program.typeScript.addAttribute(((AngularParser.AssignAttributeContext) expressionContext).ID().getText(), attribute);
                }


            }


        }


//        for (Variable variable : variables) {
//            method.addVariable(variable.getName(), variable.getType());
//        }

        return method;

    }

    @Override
    public Object visitMethodParams(AngularParser.MethodParamsContext ctx) {

        int c = ctx.ID().size();

        ArrayList<Variable> variables = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            String name = ctx.ID(i).toString();
            Type type = (Type) visitType(ctx.type(i));
            variables.add(new Variable(name, type));
        }
        return variables;

    }


    @Override
    public Object visitAssignVariable(AngularParser.AssignVariableContext ctx) {
        return new Variable(ctx.ID().toString(), (Type) visitLiteral(ctx.literal()));
    }

    @Override
    public Object visitAssignAttribute(AngularParser.AssignAttributeContext ctx) {

        if (ctx.array() != null) {
            Array array = (Array) visitArray(ctx.array());
//            System.out.println(array.toString());
            return array;
        } else {
            Type type = (Type) visitLiteral(ctx.literal());
            return new Attribute(ctx.ID().toString(), type);
        }
    }

    //    >>>>>>>>>>>>>>


}
