package ast.flask;

import ast.ASTNode; // Import the base class
import ast.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

public class FlaskProgramNode extends FlaskASTNode {
    // Change list type to ASTNode
    private final List<ASTNode> children = new ArrayList<>();

    public FlaskProgramNode(String flaskProgram, int line) {
        super(flaskProgram, line);
    }

    public void add(ASTNode node) { // Change parameter type
        children.add(node);
    }

    public List<ASTNode> getChildren() { // Change return type
        return children;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}