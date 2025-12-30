package visitor;

import antlr.Example1Parser;
import antlr.Example1ParserBaseVisitor;
import ast.ASTNode;
import ast.ProgramNode;
import ast.html.*;
import ast.css.*;
import ast.jinja.*;
import ast.flask.*;

import java.util.ArrayList;
import java.util.List;

public class ASTBuilder extends Example1ParserBaseVisitor<ASTNode> {

    // ================= PROGRAM =================
    @Override
    public ASTNode visitProgram(Example1Parser.ProgramContext ctx) {
        FlaskProgramNode program = new FlaskProgramNode("FlaskProgram", ctx.start.getLine());
        for (var stmt : ctx.statement()) {
            ASTNode node = visit(stmt);
            if (node != null) {
                // FLATTENING LOGIC:
                // If the parser accidentally nested functions, we extract them
                // and add them as siblings to the main program root.
                if (node instanceof FunctionNode) {
                    flattenFunctions(program, (FunctionNode) node);
                } else {
                    program.add(node);
                }
            }
        }
        return program;
    }

    private void flattenFunctions(FlaskProgramNode root, FunctionNode currentFunc) {
        root.add(currentFunc);
        List<ASTNode> children = new ArrayList<>(currentFunc.getChildren());
        for (ASTNode child : children) {
            if (child instanceof FunctionNode) {
                // Remove from nested position and move to root
                currentFunc.getChildren().remove(child);
                flattenFunctions(root, (FunctionNode) child);
            }
        }
    }

    @Override
    public ASTNode visitStatement(Example1Parser.StatementContext ctx) {
        // Correctly handle the combination of @app.route and def function()
        if (ctx.routeDecorator() != null && ctx.functionDef() != null) {
            RouteNode route = (RouteNode) visit(ctx.routeDecorator());
            FunctionNode func = (FunctionNode) visit(ctx.functionDef());
            if (func != null && route != null) {
                func.addChild(route); // Attach route to its function
                return func;
            }
        }
        return super.visitStatement(ctx);
    }

    // ================= ROUTES =================
    @Override
    public ASTNode visitRouteDecorator(Example1Parser.RouteDecoratorContext ctx) {
        // Removes quotes from the route string
        String path = ctx.STRING_LITERAL().getText().replace("\"", "").replace("'", "");
        return new RouteNode(path, ctx.start.getLine());
    }

    // ================= FUNCTIONS =================
    @Override
    public ASTNode visitFunctionDef(Example1Parser.FunctionDefContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        FunctionNode fn = new FunctionNode(name, ctx.start.getLine());

        // Visit only the statements strictly inside this function's block [cite: 41, 45]
        if (ctx.block() != null) {
            for (var s : ctx.block().statement()) {
                ASTNode child = visit(s);
                if (child != null) {
                    fn.addChild(child);
                }
            }
        }
        return fn;
    }

    // ================= TEMPLATE STRINGS =================
    @Override
    public ASTNode visitTemplateString(Example1Parser.TemplateStringContext ctx) {
        FlaskHtmlNode root = new FlaskHtmlNode("template", ctx.start.getLine());
        if (ctx.templateDocument() != null) {
            for (var t : ctx.templateDocument().templateContent()) {
                ASTNode node = visit(t);
                if (node != null) root.addChild(node);
            }
        }
        return root;
    }

    // ================= HTML & ATTRIBUTES =================
    @Override
    public ASTNode visitHtmlElement(Example1Parser.HtmlElementContext ctx) {
        String tag = ctx.IDENTIFIER().getText();
        FlaskHtmlNode el = new FlaskHtmlNode(tag, ctx.start.getLine());

        // Visit Attributes [cite: 52, 53]
        for (var attrCtx : ctx.htmlAttribute()) {
            ASTNode attr = visit(attrCtx);
            if (attr != null) el.addAttribute(attr);
        }

        // Visit Body Content [cite: 59]
        for (var b : ctx.htmlContentBody()) {
            ASTNode n = visit(b);
            if (n != null) el.addChild(n);
        }
        return el;
    }

    @Override
    public ASTNode visitHtmlAttribute(Example1Parser.HtmlAttributeContext ctx) {
        if (ctx.basicAttribute() != null) {
            // Updated to handle IDENTIFIER properly based on your .g4
            String name = ctx.basicAttribute().IDENTIFIER().get(0).getText();
            String val = ctx.basicAttribute().getChild(2).getText().replace("\"", "").replace("'", "");
            return new FlaskTextNode("Attribute: " + name + "=" + val, ctx.start.getLine());
        }
        if (ctx.booleanAttribute() != null) {
            return new FlaskTextNode("Attribute: " + ctx.booleanAttribute().IDENTIFIER().getText(), ctx.start.getLine());
        }
        if (ctx.imageAttribute() != null) {
            return new FlaskTextNode("Attribute: src=" + ctx.imageAttribute().STRING_LITERAL().getText(), ctx.start.getLine());
        }
        return null;
    }

    @Override
    public ASTNode visitTextNode(Example1Parser.TextNodeContext ctx) {
        return new FlaskTextNode(ctx.getText().trim(), ctx.start.getLine());
    }

    // ================= JINJA / DJANGO =================
    @Override
    public ASTNode visitObjectExpression(Example1Parser.ObjectExpressionContext ctx) {
        return new JinjaExpressionNode(ctx.objectExpressionValue().getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitDjangoForBlock(Example1Parser.DjangoForBlockContext ctx) {
        String var = ctx.IDENTIFIER(0).getText();
        String list = ctx.IDENTIFIER(1).getText();

        FlaskHtmlNode forNode = new FlaskHtmlNode("JinjaFor: " + var + " in " + list, ctx.start.getLine());
        for (var t : ctx.templateContent()) {
            ASTNode n = visit(t);
            if (n != null) forNode.addChild(n);
        }
        return forNode;
    }

    // ================= CSS =================
    @Override
    public ASTNode visitCssBlock(Example1Parser.CssBlockContext ctx) {
        String selector = ctx.selector().getText();
        FlaskHtmlNode cssContainer = new FlaskHtmlNode("style_block_for_" + selector, ctx.start.getLine());
        for (var r : ctx.cssRule()) {
            ASTNode rule = visit(r);
            if (rule != null) cssContainer.addChild(rule);
        }
        return cssContainer;
    }

    @Override
    public ASTNode visitCssRule(Example1Parser.CssRuleContext ctx) {
        String prop = ctx.cssProperty().getText();
        String val = ctx.cssValueList().getText();
        return new FlaskTextNode("CSS_Rule: " + prop + ":" + val, ctx.start.getLine());
    }

    // ================= DISPATCH =================
    @Override
    public ASTNode visitTemplateContent(Example1Parser.TemplateContentContext ctx) {
        if (ctx.htmlElement() != null) return visit(ctx.htmlElement());
        if (ctx.cssBlock() != null) return visit(ctx.cssBlock());
        if (ctx.objectExpression() != null) return visit(ctx.objectExpression());
        if (ctx.djangoForBlock() != null) return visit(ctx.djangoForBlock());
        if (ctx.textNode() != null) return visit(ctx.textNode());
        return null;
    }
}