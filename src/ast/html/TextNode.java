package ast.html;

import ast.ASTVisitor;

public class TextNode extends HtmlNode {

    private final String text;

    public TextNode(String text, int line) {
        super(TextNode.class.getSimpleName(), line);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
