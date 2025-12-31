package symbol;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private String scopeName;
    private SymbolTable parent;
    private Map<String, Symbol> symbols = new HashMap<>();

    public SymbolTable(String scopeName, SymbolTable parent) {
        this.scopeName = scopeName;
        this.parent = parent;
    }

    public void define(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol resolve(String name) {
        if (symbols.containsKey(name)) {
            return symbols.get(name);
        }
        if (parent != null) {
            return parent.resolve(name);
        }
        return null;
    }

    public SymbolTable getParent() { return parent; }
    public String getScopeName() { return scopeName; }
    public Map<String, Symbol> getSymbols() { return symbols; }
}