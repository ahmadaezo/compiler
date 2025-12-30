package ast.flask;

import ast.ASTVisitor;

public class FlaskTextNode extends FlaskASTNode {

    private final String text;

    public FlaskTextNode(String text, int line) {
        super(FlaskTextNode.class.getSimpleName(), line);
        this.text = text;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    public String getText() {
        return text;
    }
}
