package ast.jinja;

import ast.html.HtmlNode;

public abstract class JinjaNode extends HtmlNode {
    protected JinjaNode(String type, int line) {
        super(type, line);
    }
}
