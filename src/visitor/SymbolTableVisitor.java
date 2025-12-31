package visitor;

import ast.*;
import ast.flask.*;
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
        // 1. Add the function to the current scope (Global)
        currentScope.define(new Symbol(node.getName(), "Function", node.getLine()));

        // 2. Create and enter a new local scope
        SymbolTable localScope = new SymbolTable("Function: " + node.getName(), currentScope);
        allScopes.add(localScope);

        SymbolTable previousScope = currentScope;
        currentScope = localScope;

        // 3. Visit function contents (to find local variables/parameters)
        for (ASTNode child : node.getChildren()) {
            child.accept(this);
        }

        // 4. Exit back to parent scope
        currentScope = previousScope;
    }

    @Override
    public void visit(FlaskHtmlNode node) {
        // If it's a template root, we treat it as a special definition
        if (node.getTagName().equals("template")) {
            currentScope.define(new Symbol("HTML_Template", "Static Content", node.getLine()));
        }
        for (ASTNode child : node.getChildren()) child.accept(this);
    }

    // Standard visits to keep the traversal going
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