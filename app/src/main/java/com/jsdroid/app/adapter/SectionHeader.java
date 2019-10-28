package com.jsdroid.app.adapter;

import com.qmuiteam.qmui.widget.section.QMUISection;

public class SectionHeader implements QMUISection.Model<SectionHeader> {
    public enum Type {
        PROJECT, TOOL_FAVORITE, TOOL_RECENT
    }

    public String text;
    public Type type;

    public SectionHeader(String text) {
        this.text = text;
    }

    @Override
    public SectionHeader cloneForDiff() {
        return new SectionHeader(text);
    }

    @Override
    public boolean isSameItem(SectionHeader other) {
        return text == other.text || (text != null && text.equals(other.text));
    }

    @Override
    public boolean isSameContent(SectionHeader other) {
        return true;
    }
}
