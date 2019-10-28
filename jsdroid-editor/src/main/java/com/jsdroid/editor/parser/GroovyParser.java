package com.jsdroid.editor.parser;

import android.app.ProgressDialog;
import android.util.Log;

import com.jsdroid.antlr4.groovy.GroovyLangLexer;
import com.jsdroid.antlr4.groovy.GroovyLexer;
import com.jsdroid.editor.js.JSBeautifier;
import com.jsdroid.editor.js.JSBeautifierOptions;
import com.jsdroid.editor.tip.Tip;
import com.jsdroid.editor.widget.CodeEditText;
import com.jsdroid.groovy.node.NodeVisitor;
import com.jsdroid.groovy.tip.GroovyTips;
import com.jsdroid.groovy.tip.PackageMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GroovyParser extends AbstractParser {

    @Override
    public void setEditText(CodeEditText codeEditText) {
        super.setEditText(codeEditText);
        initPackageMap();
    }

    private void initPackageMap() {
        if (!PackageMap.getInstance("android.api").isReadContext()) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        PackageMap.getInstance("android.api").readReadApi(codeEditText.getContext());
                    } catch (Exception e) {
                    }
                }
            }).start();
        }


    }

    @Override
    protected Lexer getLexer(String text) throws IOException {
        return new GroovyLexer(createCharStream(text));
    }

    @Override
    protected int getTokenColor(Token token) {
        int type = token.getType();
        if (in(type, 17, 51)) {
            return Colors.keyword;
        }
        if (in(type, 104, 105) || in(type, 108, 116)) {
            return Colors.keyword;
        }
        switch (type) {
            case GroovyLexer.DECIMAL:
            case GroovyLangLexer.INTEGER:
                return Colors.number;
            case GroovyLexer.STRING:
                return Colors.string;

        }

        return 0;
    }


    @Override
    protected String getName(Token token) {
        switch (token.getType()) {
            case GroovyLangLexer.IDENTIFIER:
                return token.getText();
        }
        return null;
    }

    private List<Tip> tips;

    @Override
    public Tip[] getTemplates() {
        if (tips != null) {
            return tips.toArray(new Tip[0]);
        }
        return new Tip[0];
    }

    @Override
    public List<Tip> getTips() {
        if (tips == null) {
            return new ArrayList<>();
        }
        return tips;
    }

    @Override
    public String format() {
        JSBeautifierOptions opts = new JSBeautifierOptions();
        JSBeautifier jsBeautifier = new JSBeautifier();
        return jsBeautifier.js_beautify(getCodeEditText().getText().toString(), opts);
    }

    @Override
    protected void onParse(ParserRunnable runnable, String text, int[] codeColors) {
        super.onParse(runnable, text, codeColors);
        //解析自动提示
        long st = System.currentTimeMillis();
        try {

            tips = GroovyTips.searchTips(runnable.filename, text, runnable.cursorPos, new NodeVisitor.StopFlag() {
                @Override
                public boolean stopFlag() {
                    return runnable.stop_flag;
                }
            });
            codeEditText.postShowTips();
        } catch (Throwable e) {
        }
    }

}
