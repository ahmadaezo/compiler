package visitor;

import ast.*;
import ast.html.*;
import ast.css.*;
import ast.jinja.*;
import ast.flask.*;

public class ASTPrinter implements ASTVisitor {

    private int indent = 0;

    private void printLine(String s) {
        System.out.println("  ".repeat(indent) + s);
    }

    private void down() { indent++; }
    private void up() { indent--; }

    // ================= GENERAL AST =================

    @Override
    public void visit(ProgramNode node) {
        printLine("PROGRAM");
        down();
        for (ASTNode n : node.getChildren()) {
            n.accept(this);
        }
        up();
    }

    // ================= HTML =================

    @Override
    public void visit(HtmlElementNode node) {
        printLine("<" + node.getTagName() + ">");
        down();

        for (HtmlAttributeNode a : node.getAttributes()) {
            a.accept(this);
        }

        for (HtmlNode c : node.getChildren()) {
            c.accept(this);
        }

        up();
        printLine("</" + node.getTagName() + ">");
    }

    @Override
    public void visit(HtmlAttributeNode node) {
        if (node.getValue() == null)
            printLine("@" + node.getName());
        else
            printLine("@" + node.getName() + " = " + node.getValue());
    }

    @Override
    public void visit(TextNode node) {
        printLine("TEXT: " + node.getText());
    }

    // ================= CSS =================

    @Override
    public void visit(CssBlockNode node) {
        printLine("CSS " + node.getSelector());
        down();
        for (CssRuleNode r : node.getRules()) {
            r.accept(this);
        }
        up();
    }

    @Override
    public void visit(CssRuleNode node) {
        printLine(node.getProperty() + " = " + node.getValue());
    }

    // ================= JINJA =================

    @Override
    public void visit(JinjaExpressionNode node) {
        printLine("{{ " + node.getExpression() + " }}");
    }

    @Override
    public void visit(JinjaForNode node) {
        printLine("{% for " + node.getVariable() + " in " + node.getIterable() + " %}");
        down();
        for (HtmlNode c : node.getBody()) {
            c.accept(this);
        }
        up();
        printLine("{% endfor %}");
    }

    @Override
    public void visit(JinjaStatementNode node) {
        printLine("{% " + node.getKeyword() + " " +
                String.join(" ", node.getArguments()) + " %}");
    }

    // ================= FLASK AST =================

    @Override
    public void visit(FlaskProgramNode node) {
        printLine("FLASK PROGRAM");
        down();
        for (ASTNode child : node.getChildren()) { // Change to ASTNode
            child.accept(this);
        }
        up();
    }

    @Override
    public void visit(RouteNode node) {
        printLine("Route: " + node.getRoute());
        down();
        for (FlaskASTNode child : node.getChildren()) {
            child.accept(this);
        }
        up();
    }

    @Override
    public void visit(FunctionNode node) {
        printLine("Function: " + node.getName());
        down();
        for (ASTNode child : node.getChildren()) { // Change to ASTNode
            child.accept(this);
        }
        up();
    }

    @Override
    public void visit(FlaskHtmlNode node) {
        printLine("HTML: <" + node.getTagName() + ">");
        down();
        for (ASTNode child : node.getChildren()) { // Change to ASTNode
            child.accept(this);
        }
        up();
    }

    @Override
    public void visit(FlaskTextNode node) {
        printLine("Text: " + node.getText());
    }
}
