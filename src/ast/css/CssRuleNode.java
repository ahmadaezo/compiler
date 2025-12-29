package ast.css;

import ast.ASTVisitor;
import ast.ASTNode;

public class CssRuleNode extends ASTNode {

    private final String property;
    private final String value;

    public CssRuleNode(String property, String value, int line) {
        super("CssRule", line);
        this.property = property;
        this.value = value;
    }

    public String getProperty() {
        return property;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
