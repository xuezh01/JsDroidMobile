package com.jsdroid.app.adapter;

import com.qmuiteam.qmui.widget.section.QMUISection;

public class  SectionItem  implements QMUISection.Model<SectionItem> {
    public Object item;

    public SectionItem(Object item) {
        this.item = item;
    }

    @Override
    public SectionItem cloneForDiff() {
        return new SectionItem(item);
    }

    @Override
    public boolean isSameItem(SectionItem other) {
        return item == other.item || (item != null && item.equals(other.item));
    }

    @Override
    public boolean isSameContent(SectionItem other) {
        return true;
    }
}
