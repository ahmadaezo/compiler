package ast.jinja;

import ast.ASTVisitor;

public class JinjaExpressionNode extends JinjaNode {

    private final String expression;

    public JinjaExpressionNode(String expression, int line) {
        super("JinjaExpression", line);
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
