import antlr.Example1Lexer;
import antlr.Example1Parser;

import ast.flask.FlaskProgramNode;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import visitor.ASTBuilder;
import visitor.ASTPrinter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception {

        // 1. Read source file
        String source = Files.readString(
                Paths.get("src/Test/test.txt")
        );

        // 2. Create ANTLR input
        CharStream input = CharStreams.fromString(source);

        // 3. Lexer
        Example1Lexer lexer = new Example1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 4. Parser
        Example1Parser parser = new Example1Parser(tokens);

        // 5. Parse
        ParseTree tree = parser.program();

        // 6. Build AST (⚠️ يرجّع FlaskProgramNode مباشرة)
        ASTBuilder builder = new ASTBuilder();
        FlaskProgramNode program =
                (FlaskProgramNode) builder.visit(tree);

        // 7. Print AST
        ASTPrinter printer = new ASTPrinter();
        program.accept(printer);
    }
}
