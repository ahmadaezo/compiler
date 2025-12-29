package ast.jinja;

import ast.ASTVisitor;
import java.util.List;

public class JinjaStatementNode extends JinjaNode {

    private final String keyword;
    private final List<String> arguments;

    public JinjaStatementNode(String keyword, int line, List<String> arguments) {
        super("JinjaStatement", line);
        this.keyword = keyword;
        this.arguments = arguments;
    }

    public String getKeyword() {
        return keyword;
    }

    public List<String> getArguments() {
        return arguments;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
