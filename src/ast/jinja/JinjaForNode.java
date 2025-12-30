package ast.jinja;

import ast.html.HtmlNode;
import ast.ASTVisitor;
import java.util.List;

public class JinjaForNode extends JinjaNode {

    private final String variable;
    private final String iterable;
    private final List<HtmlNode> body;

    public JinjaForNode(String variable, String iterable, int line, List<HtmlNode> body) {
        super(JinjaForNode.class.getSimpleName(), line);
        this.variable = variable;
        this.iterable = iterable;
        this.body = body;
    }

    public String getVariable() {
        return variable;
    }

    public String getIterable() {
        return iterable;
    }

    public List<HtmlNode> getBody() {
        return body;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
