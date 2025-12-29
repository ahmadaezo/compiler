package ast;

import ast.flask.*;
import ast.html.*;
import ast.css.*;
import ast.jinja.*;

public interface ASTVisitor {
    void visit(HtmlElementNode node);
    void visit(HtmlAttributeNode node);
    void visit(TextNode node);
    void visit(CssBlockNode node);
    void visit(CssRuleNode node);
    void visit(JinjaExpressionNode node);
    void visit(JinjaForNode node);
    void visit(JinjaStatementNode node);
    void visit(ProgramNode node);
    void visit(FlaskProgramNode node);
    void visit(RouteNode node);
    void visit(FunctionNode node);
    void visit(FlaskHtmlNode node);
    void visit(FlaskTextNode node);
}
