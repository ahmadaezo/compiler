package ast;

import java.util.*;

public class ProgramNode extends ASTNode {

    private final List<ASTNode> children = new ArrayList<>();

    public ProgramNode(int line) {
        super(ProgramNode.class.getSimpleName(), line);
    }

    public void add(ASTNode node) {
        children.add(node);
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
