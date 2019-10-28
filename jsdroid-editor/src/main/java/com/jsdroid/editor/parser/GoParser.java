package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.go.GoParserLexer;
import com.jsdroid.editor.tip.Tip;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class GoParser extends AbstractParser {
    static String keywords[] = new String[]{
            "int", "uint", "bool", "string", "float32",
            "float64", "rune", "byte", "complex64", "complex128", "var",
            "const", "import", "func",
            "go", "return", "if",
            "else if", "else", "for", "switch", "case", "default", "make",
            "chan", "fmt.Println"
    };

    @Override
    protected Lexer getLexer(String text) throws IOException {
        return new GoParserLexer(createCharStream(text));
    }

    @Override
    protected int getTokenColor(Token token) {
        int type = token.getType();
        if (in(type, 2, 2)) {
            return Colors.keyword;
        }
        if (in(type, 15, 23) || in(type, 54, 65)) {
            return Colors.keyword;
        }
        return Colors.white;
    }


    @Override
    protected String getName(Token token) {
        switch (token.getType()) {
            case GoParserLexer.ID:
            case GoParserLexer.INT:
                return token.getText();
        }
        return null;
    }

    @Override
    public String[] getKeyWords() {
        return keywords;
    }

    @Override
    public Tip[] getTemplates() {
        return new Tip[0];
    }
}
