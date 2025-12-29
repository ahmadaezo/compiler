// Generated from C:/Users/Lenovo/Desktop/2 10;20/untitled29 (3)/untitled29/src/antlr/Example1Parser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Example1Parser}.
 */
public interface Example1ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Example1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Example1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Example1Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Example1Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Example1Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(Example1Parser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(Example1Parser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#globalStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStatement(Example1Parser.GlobalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#globalStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStatement(Example1Parser.GlobalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(Example1Parser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(Example1Parser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(Example1Parser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(Example1Parser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItem(Example1Parser.ImportItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItem(Example1Parser.ImportItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Example1Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Example1Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(Example1Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(Example1Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryComparison}
	 * labeled alternative in {@link Example1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComparison(Example1Parser.BinaryComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryComparison}
	 * labeled alternative in {@link Example1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComparison(Example1Parser.BinaryComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicFactor}
	 * labeled alternative in {@link Example1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicFactor(Example1Parser.AtomicFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicFactor}
	 * labeled alternative in {@link Example1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicFactor(Example1Parser.AtomicFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryArithmetic}
	 * labeled alternative in {@link Example1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryArithmetic(Example1Parser.BinaryArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryArithmetic}
	 * labeled alternative in {@link Example1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryArithmetic(Example1Parser.BinaryArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryLogic}
	 * labeled alternative in {@link Example1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLogic(Example1Parser.BinaryLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryLogic}
	 * labeled alternative in {@link Example1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLogic(Example1Parser.BinaryLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(Example1Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(Example1Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#comprehension}.
	 * @param ctx the parse tree
	 */
	void enterComprehension(Example1Parser.ComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#comprehension}.
	 * @param ctx the parse tree
	 */
	void exitComprehension(Example1Parser.ComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#generatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorExpression(Example1Parser.GeneratorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#generatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorExpression(Example1Parser.GeneratorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Example1Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Example1Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(Example1Parser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(Example1Parser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(Example1Parser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(Example1Parser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(Example1Parser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(Example1Parser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#dictPair}.
	 * @param ctx the parse tree
	 */
	void enterDictPair(Example1Parser.DictPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#dictPair}.
	 * @param ctx the parse tree
	 */
	void exitDictPair(Example1Parser.DictPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#callOrAccess}.
	 * @param ctx the parse tree
	 */
	void enterCallOrAccess(Example1Parser.CallOrAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#callOrAccess}.
	 * @param ctx the parse tree
	 */
	void exitCallOrAccess(Example1Parser.CallOrAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#primaryAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAccess(Example1Parser.PrimaryAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#primaryAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAccess(Example1Parser.PrimaryAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#callArgs}.
	 * @param ctx the parse tree
	 */
	void enterCallArgs(Example1Parser.CallArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#callArgs}.
	 * @param ctx the parse tree
	 */
	void exitCallArgs(Example1Parser.CallArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#indexAccess}.
	 * @param ctx the parse tree
	 */
	void enterIndexAccess(Example1Parser.IndexAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#indexAccess}.
	 * @param ctx the parse tree
	 */
	void exitIndexAccess(Example1Parser.IndexAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#callArguments}.
	 * @param ctx the parse tree
	 */
	void enterCallArguments(Example1Parser.CallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#callArguments}.
	 * @param ctx the parse tree
	 */
	void exitCallArguments(Example1Parser.CallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(Example1Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(Example1Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(Example1Parser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(Example1Parser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(Example1Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(Example1Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(Example1Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(Example1Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(Example1Parser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(Example1Parser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Example1Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Example1Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Example1Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Example1Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#elifStatement}.
	 * @param ctx the parse tree
	 */
	void enterElifStatement(Example1Parser.ElifStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#elifStatement}.
	 * @param ctx the parse tree
	 */
	void exitElifStatement(Example1Parser.ElifStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(Example1Parser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(Example1Parser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#exprStatement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(Example1Parser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#exprStatement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(Example1Parser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#routeDecorator}.
	 * @param ctx the parse tree
	 */
	void enterRouteDecorator(Example1Parser.RouteDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#routeDecorator}.
	 * @param ctx the parse tree
	 */
	void exitRouteDecorator(Example1Parser.RouteDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#routeMethods}.
	 * @param ctx the parse tree
	 */
	void enterRouteMethods(Example1Parser.RouteMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#routeMethods}.
	 * @param ctx the parse tree
	 */
	void exitRouteMethods(Example1Parser.RouteMethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(Example1Parser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(Example1Parser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(Example1Parser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(Example1Parser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#basicAttribute}.
	 * @param ctx the parse tree
	 */
	void enterBasicAttribute(Example1Parser.BasicAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#basicAttribute}.
	 * @param ctx the parse tree
	 */
	void exitBasicAttribute(Example1Parser.BasicAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#booleanAttribute}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAttribute(Example1Parser.BooleanAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#booleanAttribute}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAttribute(Example1Parser.BooleanAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#imageAttribute}.
	 * @param ctx the parse tree
	 */
	void enterImageAttribute(Example1Parser.ImageAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#imageAttribute}.
	 * @param ctx the parse tree
	 */
	void exitImageAttribute(Example1Parser.ImageAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#eventAttribute}.
	 * @param ctx the parse tree
	 */
	void enterEventAttribute(Example1Parser.EventAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#eventAttribute}.
	 * @param ctx the parse tree
	 */
	void exitEventAttribute(Example1Parser.EventAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#htmlContentBody}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentBody(Example1Parser.HtmlContentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#htmlContentBody}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentBody(Example1Parser.HtmlContentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#objectExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpression(Example1Parser.ObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#objectExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpression(Example1Parser.ObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#objectExpressionValue}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpressionValue(Example1Parser.ObjectExpressionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#objectExpressionValue}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpressionValue(Example1Parser.ObjectExpressionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterTemplateContent(Example1Parser.TemplateContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitTemplateContent(Example1Parser.TemplateContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#djangoForBlock}.
	 * @param ctx the parse tree
	 */
	void enterDjangoForBlock(Example1Parser.DjangoForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#djangoForBlock}.
	 * @param ctx the parse tree
	 */
	void exitDjangoForBlock(Example1Parser.DjangoForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#djangoEndBlock}.
	 * @param ctx the parse tree
	 */
	void enterDjangoEndBlock(Example1Parser.DjangoEndBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#djangoEndBlock}.
	 * @param ctx the parse tree
	 */
	void exitDjangoEndBlock(Example1Parser.DjangoEndBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#djangoGeneralBlock}.
	 * @param ctx the parse tree
	 */
	void enterDjangoGeneralBlock(Example1Parser.DjangoGeneralBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#djangoGeneralBlock}.
	 * @param ctx the parse tree
	 */
	void exitDjangoGeneralBlock(Example1Parser.DjangoGeneralBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#djangoArgs}.
	 * @param ctx the parse tree
	 */
	void enterDjangoArgs(Example1Parser.DjangoArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#djangoArgs}.
	 * @param ctx the parse tree
	 */
	void exitDjangoArgs(Example1Parser.DjangoArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssBlock(Example1Parser.CssBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssBlock(Example1Parser.CssBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(Example1Parser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(Example1Parser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(Example1Parser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(Example1Parser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterCssProperty(Example1Parser.CssPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitCssProperty(Example1Parser.CssPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#cssValueList}.
	 * @param ctx the parse tree
	 */
	void enterCssValueList(Example1Parser.CssValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#cssValueList}.
	 * @param ctx the parse tree
	 */
	void exitCssValueList(Example1Parser.CssValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValue(Example1Parser.CssValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValue(Example1Parser.CssValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#ruleSeparator}.
	 * @param ctx the parse tree
	 */
	void enterRuleSeparator(Example1Parser.RuleSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#ruleSeparator}.
	 * @param ctx the parse tree
	 */
	void exitRuleSeparator(Example1Parser.RuleSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#templateString}.
	 * @param ctx the parse tree
	 */
	void enterTemplateString(Example1Parser.TemplateStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#templateString}.
	 * @param ctx the parse tree
	 */
	void exitTemplateString(Example1Parser.TemplateStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#templateDocument}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDocument(Example1Parser.TemplateDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#templateDocument}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDocument(Example1Parser.TemplateDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#textNode}.
	 * @param ctx the parse tree
	 */
	void enterTextNode(Example1Parser.TextNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#textNode}.
	 * @param ctx the parse tree
	 */
	void exitTextNode(Example1Parser.TextNodeContext ctx);
}