package com.jsdroid.editor.parser;

import com.jsdroid.editor.tip.Tip;
import com.jsdroid.editor.widget.CodeEditText;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class AbstractParser implements Parser {
    protected static ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();

    protected CodeEditText codeEditText;
    private List<String> names;

    public AbstractParser() {
        names = new ArrayList<>();
    }

    public CodeEditText getCodeEditText() {
        return codeEditText;
    }

    public void setEditText(CodeEditText codeEditText) {
        this.codeEditText = codeEditText;
    }

    class ParserRunnable implements Runnable {
        public int colors[];
        public String text;
        public boolean stop_flag;
        public int cursorPos;
        public String filename;

        @Override
        public void run() {
            onParse(this, text, colors);
            postInvalidate();
        }
    }

    ParserRunnable parserRunnable;

    @Override
    public final void preParse(final int start, final int before, final int count) {
        preParse(start, before, count, codeEditText.getCodeColors());
    }

    /**
     * 预解析
     *
     * @param start      改变的位置
     * @param before     删除的数量
     * @param count      添加的数量
     * @param codeColors
     */
    private void preParse(int start, int before, int count, int codeColors[]) {
        //如果代码长度太大，为了避免卡死，不给予预先高亮
//        if (codeColors.length > 100_0000) {
//            return;
//        }
        if (count > before) {
            //添加
            //右移动[1,2,3,0,0] >> [0,0,1,2,3]
            int off = count - before;
            for (int i = codeColors.length - 1; i > start + off && i > 1; i--) {
                codeColors[i] = codeColors[i - off];
            }
        } else {
            //删除
            //左移动 [0,0,1,2,3] >> [1,2,3,0,0]
            int off = before - count;
            for (int i = start; i + off < codeColors.length; i++) {
                codeColors[i] = codeColors[i + off];
            }
        }
        codeEditText.setColors(codeColors);
        postInvalidate();

    }

    @Override
    public void parse() {
        if (parserRunnable != null) {
            parserRunnable.stop_flag = true;
        }
        parserRunnable = new ParserRunnable();
        parserRunnable.colors = codeEditText.getCodeColors();
        parserRunnable.text = codeEditText.getText().toString();
        parserRunnable.cursorPos = codeEditText.getSelectionStart();
        parserRunnable.filename = codeEditText.getFilename();
        singleThreadPool.execute(parserRunnable);
    }

    protected final void postInvalidate() {
        codeEditText.postInvalidate();
    }


    protected void onParse(ParserRunnable runnable, String text, int codeColors[]) {
//
        int select = codeEditText.getSelectionStart();
        try {
            int last_end = 0;
            Lexer lexer = getLexer(text);
            List<String> names = new ArrayList<>();
            Token token = lexer.nextToken();
            while (token.getType() != Token.EOF) {
                if (runnable.stop_flag) {
                    return;
                }
                int start = token.getStartIndex();
                for (int i = last_end; i < start; i++) {
                    codeColors[i] = Colors.comment;
                }
                int end = token.getStopIndex();
                last_end = end + 1;
                int color = getTokenColor(token);
                for (int i = start; i <= end && i < codeColors.length; i++) {
                    codeColors[i] = color;
                }
                //添加提示
                if (select < start - 1 || select > end + 1) {
                    String name = getName(token);
                    if (name != null && !names.contains(name)) {
                        names.add(name);
                    }
                }
                token = lexer.nextToken();
            }
            this.names = names;
        } catch (Exception e) {
        }
    }

    protected abstract Lexer getLexer(String text) throws IOException;

    protected abstract int getTokenColor(Token token);

    protected abstract String getName(Token token);

    public boolean in(int type, int min, int max) {
        return (type >= min && type <= max);
    }

    @Override
    public List<String> getNames() {
        return names;
    }

    @Override
    public String format() {
        return null;
    }

    public CharStream createCharStream(String text) {
        return CharStreams.fromString(text);
    }

    @Override
    public List<Tip> getTips() {
        List<Tip> tips = new ArrayList<>();
        if (getNames() != null) {
            for (String name : getNames()) {
                Tip tip = new Tip.DefaultTip(-1, name, "变量");
                tips.add(tip);
            }
        }
        //keywords
        if (getKeyWords() != null) {
            for (String keyword : getKeyWords()) {
                tips.add(new Tip.DefaultTip(-1, keyword, "关键字"));
            }
        }

        //templates
        Tip templates[] = getTemplates();
        if (templates != null) {
            for (int i = 0; i < templates.length; i++) {
                tips.add(templates[i]);
            }
        }
        return tips;
    }

    @Override
    public String[] getKeyWords() {
        return new String[0];
    }

    @Override
    public List<Tip> searchTips(String inputText) {
        List<Tip> tips = getTips();
        Iterator<Tip> iterator = tips.iterator();
        List<Tip> searchResult = new ArrayList<>();
        while (iterator.hasNext()) {
            Tip next = iterator.next();
            if (!next.compare(inputText)) {
                continue;
            }
            searchResult.add(next);

        }
        return searchResult;
    }

}
