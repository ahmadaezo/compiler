package ast.html;

import ast.ASTVisitor;

public class HtmlAttributeNode extends HtmlNode {

    private final String name;
    private final String value; // null for boolean attributes

    public HtmlAttributeNode(String name, String value, int line) {
        super("HtmlAttribute", line);
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
