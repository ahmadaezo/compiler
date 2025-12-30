package visitor;

import ast.*;
import ast.html.*;
import ast.css.*;
import ast.jinja.*;
import ast.flask.*;
import java.util.List;

public class ASTPrinter implements ASTVisitor {

    private String prefix = "";

    // Helper to format the line: NodeName (Line: X) [Detail]
    private String getFormattedNode(ASTNode node) {
        String info = "";
        if (node instanceof FlaskHtmlNode) info = " [Tag: " + ((FlaskHtmlNode) node).getTagName() + "]";
        else if (node instanceof FunctionNode) info = " [Name: " + ((FunctionNode) node).getName() + "]";
        else if (node instanceof RouteNode) info = " [Path: " + ((RouteNode) node).getRoute() + "]";
        else if (node instanceof JinjaExpressionNode) info = " [Expr: " + ((JinjaExpressionNode) node).getExpression() + "]";
        else if (node instanceof CssBlockNode) info = " [Selector: " + ((CssBlockNode) node).getSelector() + "]";
        else if (node instanceof CssRuleNode) info = " [Prop: " + ((CssRuleNode) node).getProperty() + "]";
        else if (node instanceof FlaskTextNode) {
            String txt = ((FlaskTextNode) node).getText().trim().replace("\n", " ");
            if (txt.length() > 20) txt = txt.substring(0, 17) + "...";
            info = " [Text: " + txt + "]";
        }
        return node.getNodeName() + " (Line: " + node.getLine() + ")" + info;
    }

    // Central logic to handle indentation and tree lines
    private void visitChildren(List<? extends ASTNode> children) {
        if (children == null || children.isEmpty()) return;

        String oldPrefix = prefix;
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = (i == children.size() - 1);
            ASTNode child = children.get(i);

            // Print the current node with the correct branch character
            System.out.println(prefix + (isLast ? "└── " : "├── ") + getFormattedNode(child));

            // Update prefix for the next level of depth
            prefix = oldPrefix + (isLast ? "    " : "│   ");
            child.accept(this);

            // Restore prefix after returning from recursion
            prefix = oldPrefix;
        }
    }

    // ================= VISIT METHODS =================

    @Override
    public void visit(FlaskProgramNode node) {
        // Root node has no prefix or branch characters
        System.out.println(node.getNodeName() + " (Line: " + node.getLine() + ")");
        visitChildren(node.getChildren());
    }

    @Override
    public void visit(FlaskHtmlNode node) {
        visitChildren(node.getChildren());
    }

    @Override
    public void visit(FunctionNode node) {
        visitChildren(node.getChildren());
    }

    @Override
    public void visit(RouteNode node) {
        visitChildren(node.getChildren());
    }

    @Override
    public void visit(CssBlockNode node) {
        visitChildren(node.getRules());
    }

    @Override
    public void visit(JinjaForNode node) {
        visitChildren(node.getBody());
    }

    @Override
    public void visit(ProgramNode node) {
        System.out.println(node.getNodeName() + " (Line: " + node.getLine() + ")");
        visitChildren(node.getChildren());
    }

    // These terminal nodes don't have children to visit,
    // their logic is handled in getFormattedNode and visitChildren
    @Override public void visit(HtmlElementNode node) { visitChildren(node.getChildren()); }
    @Override public void visit(HtmlAttributeNode node) {}
    @Override public void visit(TextNode node) {}
    @Override public void visit(CssRuleNode node) {}
    @Override public void visit(JinjaExpressionNode node) {}
    @Override public void visit(JinjaStatementNode node) {}
    @Override public void visit(FlaskTextNode node) {}
}