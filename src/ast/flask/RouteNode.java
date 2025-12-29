package ast.flask;

import ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class RouteNode extends FlaskASTNode {

    private final String route;
    private final List<FlaskASTNode> children = new ArrayList<>();

    public RouteNode(String route, int line) {
        super("Route", line);
        this.route = route;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    public String getRoute() {
        return route;
    }

    public void addChild(FlaskASTNode node) {
        children.add(node);
    }

    public List<FlaskASTNode> getChildren() {
        return children;
    }
}
