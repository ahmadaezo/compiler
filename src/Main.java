import antlr.Example1Lexer;
import antlr.Example1Parser;
import ast.flask.FlaskProgramNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import symbol.SymbolTable;
import visitor.ASTBuilder;
import visitor.ASTPrinter;
import visitor.SymbolTableVisitor;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        String source = Files.readString(
                Paths.get("src/test/test.txt")
        );

        CharStream input = CharStreams.fromString(source);

        Example1Lexer lexer = new Example1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Example1Parser parser = new Example1Parser(tokens);

        ParseTree tree = parser.program();

        ASTBuilder builder = new ASTBuilder();
        FlaskProgramNode program = (FlaskProgramNode) builder.visit(tree);

        System.out.println("=====================================================");
        System.out.println("         ABSTRACT SYNTAX TREE (AST)                  ");
        System.out.println("=====================================================");
        ASTPrinter printer = new ASTPrinter();
        program.accept(printer);
        System.out.println();

        System.out.println("=====================================================");
        System.out.println("              SYMBOL TABLE REPORT                    ");
        System.out.println("=====================================================");

        SymbolTableVisitor stVisitor = new SymbolTableVisitor();
        program.accept(stVisitor);

        List<SymbolTable> allScopes = stVisitor.getAllScopes();
        for (SymbolTable scope : allScopes) {
            System.out.println("\nSCOPE: " + scope.getScopeName());
            System.out.println("-----------------------------------------------------");
            System.out.printf("%-20s | %-15s | %-10s\n", "Identifier", "Type", "Line");
            System.out.println("-----------------------------------------------------");

            if (scope.getSymbols().isEmpty()) {
                System.out.println("  (No symbols in this scope)");
            } else {
                scope.getSymbols().forEach((name, symbol) -> {
                    System.out.printf("%-20s | %-15s | Line: %d\n",
                            symbol.getName(), symbol.getType(), symbol.getLine());
                });
            }
        }
        System.out.println("=====================================================");
    }
}