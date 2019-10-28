package com.jsdroid.editor.tip;

import com.jsdroid.editor.widget.CodeEditText;

public interface Tip {


    default int getIcon() {
        return -1;
    }

    String getShow();

    String getDesc();

    String getReplace();

    default void replace(CodeEditText codeEditText) {
        String inputText = codeEditText.getCursorReplaceText();
        int pos = codeEditText.getSelectionStart();
        codeEditText.getText().replace(pos - inputText.length(), pos, getReplace());
    }

    default boolean compare(String inputText) {
        if (getShow() == null) {
            return false;
        }

        return getShow().startsWith(inputText);
    }

    class DefaultTip implements Tip {
        int icon;
        String show;
        String desc;
        String replace;

        public DefaultTip(int icon, String show, String desc) {
            this.icon = icon;
            this.show = show;
            this.desc = desc;
            this.replace = show;
        }

        @Override
        public int getIcon() {
            return icon;
        }

        @Override
        public String getShow() {
            return show;
        }

        @Override
        public String getDesc() {
            return desc;
        }

        @Override
        public String getReplace() {
            return replace;
        }
    }

}
