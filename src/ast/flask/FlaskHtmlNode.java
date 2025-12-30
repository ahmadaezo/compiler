package ast.flask;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

public class FlaskHtmlNode extends FlaskASTNode {
    private final String tagName;
    private final List<ASTNode> children = new ArrayList<>();

    public FlaskHtmlNode(String tagName, int line) {
        super(FlaskHtmlNode.class.getSimpleName(), line);
        this.tagName = tagName;
    }

    private List<ASTNode> attributes = new ArrayList<>();

    public void addAttribute(ASTNode attr) {
        this.attributes.add(attr);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    public String getTagName() { return tagName; }

    public void addChild(ASTNode node) { // Accept any ASTNode
        children.add(node);
    }

    public List<ASTNode> getChildren() { return children; }
}