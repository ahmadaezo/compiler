package ast.flask;

import ast.ASTNode;

public abstract class FlaskASTNode extends ASTNode {

    public FlaskASTNode(String nodeName, int line) {
        super(nodeName, line);
    }
}
