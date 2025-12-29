// Generated from C:/Users/Zaid/Documents/Compiler/src/antlr/Example1Parser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Example1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Example1ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Example1Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Example1Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Example1Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(Example1Parser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#globalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStatement(Example1Parser.GlobalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(Example1Parser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(Example1Parser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#importItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItem(Example1Parser.ImportItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Example1Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Example1Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryComparison}
	 * labeled alternative in {@link Example1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComparison(Example1Parser.BinaryComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomicFactor}
	 * labeled alternative in {@link Example1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicFactor(Example1Parser.AtomicFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryArithmetic}
	 * labeled alternative in {@link Example1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryArithmetic(Example1Parser.BinaryArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryLogic}
	 * labeled alternative in {@link Example1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLogic(Example1Parser.BinaryLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Example1Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#comprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComprehension(Example1Parser.ComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#generatorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratorExpression(Example1Parser.GeneratorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Example1Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(Example1Parser.CollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(Example1Parser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#dictLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteral(Example1Parser.DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#dictPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictPair(Example1Parser.DictPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#callOrAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallOrAccess(Example1Parser.CallOrAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#primaryAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAccess(Example1Parser.PrimaryAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#callArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArgs(Example1Parser.CallArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#indexAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccess(Example1Parser.IndexAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#callArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArguments(Example1Parser.CallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(Example1Parser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(Example1Parser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(Example1Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(Example1Parser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(Example1Parser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Example1Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Example1Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#elifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStatement(Example1Parser.ElifStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(Example1Parser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#exprStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(Example1Parser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#routeDecorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteDecorator(Example1Parser.RouteDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#routeMethods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteMethods(Example1Parser.RouteMethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(Example1Parser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(Example1Parser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#basicAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicAttribute(Example1Parser.BasicAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#booleanAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAttribute(Example1Parser.BooleanAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#imageAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageAttribute(Example1Parser.ImageAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#eventAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAttribute(Example1Parser.EventAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#htmlContentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentBody(Example1Parser.HtmlContentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#objectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpression(Example1Parser.ObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#objectExpressionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpressionValue(Example1Parser.ObjectExpressionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateContent(Example1Parser.TemplateContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#djangoForBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDjangoForBlock(Example1Parser.DjangoForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#djangoEndBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDjangoEndBlock(Example1Parser.DjangoEndBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#djangoGeneralBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDjangoGeneralBlock(Example1Parser.DjangoGeneralBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#djangoArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDjangoArgs(Example1Parser.DjangoArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlock(Example1Parser.CssBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(Example1Parser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(Example1Parser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssProperty(Example1Parser.CssPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#cssValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueList(Example1Parser.CssValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValue(Example1Parser.CssValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#ruleSeparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSeparator(Example1Parser.RuleSeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#templateString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateString(Example1Parser.TemplateStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#templateDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDocument(Example1Parser.TemplateDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#textNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextNode(Example1Parser.TextNodeContext ctx);
}