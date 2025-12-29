package ast.flask;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

public class FunctionNode extends FlaskASTNode {
    private final String name;
    private final List<ASTNode> children = new ArrayList<>(); // Use ASTNode

    public FunctionNode(String name, int line) {
        super("Function", line);
        this.name = name;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() { return name; }

    public void addChild(ASTNode node) { // Accept any ASTNode
        children.add(node);
    }

    public List<ASTNode> getChildren() { return children; }
}