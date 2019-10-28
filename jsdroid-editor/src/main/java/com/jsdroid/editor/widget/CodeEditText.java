package com.jsdroid.editor.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.text.BoringLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import android.widget.Toast;

import com.jsdroid.editor.UndoStack;
import com.jsdroid.editor.parser.Parser;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CodeEditText extends KeyDownEditText {
    private UndoStack undoStack;
    private TipsWindow tipsWindow;
    private TextWatcher textWatcher;
    private Parser parser;
    private String filename;

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public Parser getParser() {
        return parser;
    }

    public void setTextWatcher(TextWatcher textWatcher) {
        this.textWatcher = textWatcher;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public CodeEditText(Context context) {
        super(context);
        init();
    }

    public CodeEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    public UndoStack getUndoStack() {
        return undoStack;
    }


    @Override
    protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
    }

    class TextListener implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            if (textWatcher != null) {
                textWatcher.beforeTextChanged(s, start, count, after);
            }
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            // 动态解析js代码更新文字颜色
            if (parser != null) {
                parser.preParse(start, before, count);
            }
            if (textWatcher != null) {
                textWatcher.onTextChanged(s, start, before, count);
            }
        }

        Handler handler;
        Runnable showTipsRunnable = new Runnable() {
            @Override
            public void run() {
                showTips();
            }
        };

        @Override
        public void afterTextChanged(Editable s) {
            if (parser != null) {
                parser.parse();
            }
            if (textWatcher != null) {
                textWatcher.afterTextChanged(s);
            }
            if (handler == null) {
                handler = new Handler();
            }
            // 显示提示
            handler.postDelayed(showTipsRunnable, 100);
        }
    }

    private void init() {
        //关闭联想功能
        addTextChangedListener(new TextListener());
        undoStack = new UndoStack(this);
        tipsWindow = new TipsWindow(this);
    }

    /**
     * 获取选择行开头
     *
     * @return
     */
    public int getSelectLineStart() {
        int pos = getSelectionStart();
        for (; ; ) {
            pos--;
            if (pos < 0) {
                pos = 0;
                return pos;
            }
            if (getText().charAt(pos) == '\n') {
                return pos + 1;
            }
        }
    }

    /**
     * 获取选择行结尾
     *
     * @return
     */
    public int getSelectLineEnd() {

        int pos = getSelectionStart();
        for (; ; pos++) {

            if (pos >= getText().length()) {
                return getText().length();
            }

            if (getText().charAt(pos) == '\n') {
                return pos;
            }
        }
    }

    /**
     * 跳转到home
     */
    public void goHome() {
        int lineStart = getSelectLineStart();
        int codeLineStart = lineStart;

        for (int i = codeLineStart; i < getText().length(); i++) {
            if (getText().charAt(i) == ' ') {
                codeLineStart = i + 1;
            } else {
                break;
            }
        }
        int start = getSelectionStart();
        if (codeLineStart == start) {
            setSelection(lineStart);
        } else {
            setSelection(codeLineStart);
        }


    }


    /**
     * 跳转到end
     */
    public void goEnd() {
        int lineEnd = getSelectLineEnd();
        int codeLineEnd = lineEnd;
        for (int i = lineEnd - 1; i >= 0 && i < getText().length(); i--) {
            if (getText().charAt(i) == ' ') {
                codeLineEnd = i;
            } else {
                break;
            }
        }
        int start = getSelectionStart();
        if (codeLineEnd == start) {
            setSelection(lineEnd);
        } else {
            setSelection(codeLineEnd);
        }
    }

    /**
     * 跳转到行
     *
     * @param line
     */
    public void goLine(int line) {
        if (line <= 0) {
            Toast.makeText(getContext(), "最小值：1", Toast.LENGTH_SHORT).show();
        }
        int pos = -1;
        int lineCount = 0;
        int lineStart = 0;
        for (int i = 0; i < getText().length(); i++) {
            if (getText().charAt(i) == '\n') {
                lineCount++;
                if (line == lineCount) {
                    pos = lineStart;
                    break;
                }
                lineStart = i + 1;
            }
        }
        if (pos == -1) {
            pos = getText().length();
        }
        setSelection(pos);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        updateTips();
        undoStack.clearHistory();
    }

    @Override
    public void sendAccessibilityEventUnchecked(AccessibilityEvent event) {

    }

    @Override
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        AccessibilityNodeInfo info = AccessibilityNodeInfo.obtain(this);
        return info;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        closeTips();
        return super.onTouchEvent(event);
    }

    public void showTips() {
        // 显示提示
        if (tipsWindow != null) {
            tipsWindow.showTips(parser);
        }
    }

    public void postShowTips() {
        post(new Runnable() {
            @Override
            public void run() {
                showTips();
            }
        });
    }

    public void updateTips() {
        if (tipsWindow != null) {
            if (tipsWindow.isShowing()) {
                tipsWindow.updateTips();
            }
        }
    }

    public void closeTips() {
        if (tipsWindow != null) {
            tipsWindow.dismiss();
        }
    }

    public void openFile(File file) throws IOException {
        String code = "";
        setFilename(file.getPath());
        code = FileUtils.readFileToString(file);
        getUndoStack().setDefaultText(code);

    }

    public String getCursorReplaceText() {
        String cursorInputText = getCursorInputText();
        if (cursorInputText.startsWith(".")) {
            return cursorInputText.substring(1);
        }
        return cursorInputText;
    }

    public String getCursorInputText() {
        String inputText = "";
        int off = getSelectionStart();
        //英文字符范围：65-90；97-122；数字范围：48-57
        for (int i = off - 1; i >= 0 && i < getText().length(); i--) {
            char c = getText().charAt(i);
            if (c == '.') {
                inputText = c + inputText;
                break;
            }
            if ((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122) || c < 0 || c > 127) {
                inputText = c + inputText;
            } else {
                break;
            }
        }
        return inputText;
    }


}
