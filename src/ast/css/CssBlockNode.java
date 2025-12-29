package ast.css;

import ast.ASTVisitor;
import ast.ASTNode;
import java.util.List;

public class CssBlockNode extends ASTNode {

    private final String selector;
    private final List<CssRuleNode> rules;

    public CssBlockNode(String selector, int line, List<CssRuleNode> rules) {
        super("CssBlock", line);
        this.selector = selector;
        this.rules = rules;
    }

    public String getSelector() {
        return selector;
    }

    public List<CssRuleNode> getRules() {
        return rules;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
