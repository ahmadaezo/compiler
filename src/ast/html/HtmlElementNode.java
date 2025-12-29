package ast.html;

import ast.ASTVisitor;
import java.util.List;

public class HtmlElementNode extends HtmlNode {

    private final String tagName;
    private final List<HtmlAttributeNode> attributes;
    private final List<HtmlNode> children;

    public HtmlElementNode(
            String tagName,
            int line,
            List<HtmlAttributeNode> attributes,
            List<HtmlNode> children
    ) {
        super("HtmlElement", line);
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
    }

    // ===== GETTERS (REQUIRED) =====

    public String getTagName() {
        return tagName;
    }

    public List<HtmlAttributeNode> getAttributes() {
        return attributes;
    }

    public List<HtmlNode> getChildren() {
        return children;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HtmlElement: <").append(tagName).append("> (line ").append(getLine()).append(")\n");
        for (HtmlNode child : children) {
            sb.append("  ").append(child.toString().replace("\n", "\n  ")).append("\n");
        }
        return sb.toString();
    }

}
