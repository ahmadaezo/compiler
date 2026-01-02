package visitor;

import ast.*;
import ast.flask.*;
import ast.html.HtmlAttributeNode;
import symbol.Symbol;
import symbol.SymbolTable;
import java.util.ArrayList;
import java.util.List;

public class SymbolTableVisitor implements ASTVisitor {
    private SymbolTable currentScope = new SymbolTable("Global", null);
    private List<SymbolTable> allScopes = new ArrayList<>();

    public SymbolTableVisitor() {
        allScopes.add(currentScope);
    }

    public List<SymbolTable> getAllScopes() { return allScopes; }

    @Override
    public void visit(FlaskProgramNode node) {
        for (ASTNode child : node.getChildren()) {
            child.accept(this);
        }
    }

    @Override
    public void visit(FunctionNode node) {

        currentScope.define(new Symbol(node.getName(), "Function", node.getLine()));

        SymbolTable localScope = new SymbolTable("Function: " + node.getName(), currentScope);
        allScopes.add(localScope);

        SymbolTable previousScope = currentScope;
        currentScope = localScope;

        for (ASTNode child : node.getChildren()) {
            child.accept(this);
        }

        currentScope = previousScope;
    }

    @Override
    public void visit(FlaskHtmlNode node) {
        if (node.getTagName().equals("template")) {
            currentScope.define(new Symbol("HTML_Template", "Static Content", node.getLine()));
        }

        for (ASTNode attr : node.getAttributes()) {
            if (attr instanceof HtmlAttributeNode) {
                String val = ((HtmlAttributeNode) attr).getValue();
                if (val.contains("{{")) {
                    currentScope.define(new Symbol(val, "DynamicAttr", node.getLine()));
                }
            }
        }

        for (ASTNode child : node.getChildren()) child.accept(this);
    }

    @Override public void visit(RouteNode node) {
        currentScope.define(new Symbol(node.getRoute(), "RoutePath", node.getLine()));
    }

    @Override public void visit(ProgramNode node) { /* ... */ }
    @Override public void visit(ast.html.HtmlElementNode node) {}
    @Override public void visit(ast.html.HtmlAttributeNode node) {}
    @Override public void visit(ast.html.TextNode node) {}
    @Override public void visit(ast.css.CssBlockNode node) {}
    @Override public void visit(ast.css.CssRuleNode node) {}
    @Override public void visit(ast.jinja.JinjaExpressionNode node) {}
    @Override public void visit(ast.jinja.JinjaForNode node) {}
    @Override public void visit(ast.jinja.JinjaStatementNode node) {}
    @Override public void visit(FlaskTextNode node) {}
}