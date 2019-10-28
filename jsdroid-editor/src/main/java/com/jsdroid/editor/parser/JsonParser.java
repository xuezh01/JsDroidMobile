package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.json.JSONLexer;
import com.jsdroid.editor.js.JSBeautifier;
import com.jsdroid.editor.js.JSBeautifierOptions;
import com.jsdroid.editor.tip.Tip;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class JsonParser extends JsParser {
    @Override
    protected Lexer getLexer(String text) throws IOException {
        return new JSONLexer(createCharStream(text));
    }


    @Override
    protected String getName(Token token) {
        switch (token.getType()) {
            case JSONLexer.STRING:
                String text = token.getText();
                if (text.length() > 2) {

                    return text.substring(1, text.length() - 1);
                }
        }
        return null;
    }

    @Override
    public String[] getKeyWords() {
        return new String[0];
    }

    @Override
    public Tip[] getTemplates() {
        return new Tip[0];
    }

    @Override
    public String format() {
        JSBeautifierOptions opts = new JSBeautifierOptions();
        JSBeautifier jsBeautifier = new JSBeautifier();
        String result = jsBeautifier.js_beautify(getCodeEditText().getText().toString(), opts);
        return result;
    }
}
