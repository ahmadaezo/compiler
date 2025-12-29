package ast.css;

import ast.ASTNode;

public abstract class CssNode extends ASTNode {
    public CssNode(String name, int line) {
        super(name, line);
    }
}
