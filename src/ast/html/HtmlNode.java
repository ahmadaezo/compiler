package ast.html;

import ast.ASTNode;

public abstract class HtmlNode extends ASTNode {
    public HtmlNode(String name, int line) {
        super(name, line);
    }
}
