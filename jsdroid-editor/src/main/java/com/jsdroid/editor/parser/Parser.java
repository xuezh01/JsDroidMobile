package com.jsdroid.editor.parser;

import com.jsdroid.editor.tip.Tip;
import com.jsdroid.editor.widget.CodeEditText;

import java.util.List;

public interface Parser {
    void preParse(int start, int before,
                  int count);

    void parse();

    /**
     * 获取变量表
     *
     * @return
     */
    List<String> getNames();

    void setEditText(CodeEditText codeEditText);

    String[] getKeyWords();

    Tip[] getTemplates();

    String format();

    List<Tip> getTips();

    List<Tip> searchTips(String inputText);
}
