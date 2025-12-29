package ast;

public abstract class ASTNode {
    protected String nodeName;
    protected int line;

    public ASTNode(String nodeName, int line) {
        this.nodeName = nodeName;
        this.line = line;
    }

    public abstract void accept(ASTVisitor visitor);

    public String getNodeName() {
        return nodeName;
    }

    public int getLine() {
        return line;
    }
}
