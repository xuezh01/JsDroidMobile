package com.jsdroid.app.adapter;

import android.support.v7.widget.GridLayoutManager;

import com.qmuiteam.qmui.widget.section.QMUIDefaultStickySectionAdapter;
import com.qmuiteam.qmui.widget.section.QMUISection;

/**
 * 用于GridLayoutManager自动设置Item占据列
 */
public class SectionGridSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {
    QMUIDefaultStickySectionAdapter adapter;
    GridLayoutManager layoutManager;

    public SectionGridSpanSizeLookup(QMUIDefaultStickySectionAdapter adapter, GridLayoutManager layoutManager) {
        this.adapter = adapter;
        this.layoutManager = layoutManager;
    }

    /**
     * 如果是标题，占据全列
     * 如果是1个Item占据全列！
     *
     * @param position
     * @return
     */
    @Override
    public int getSpanSize(int position) {

        QMUISection section = adapter.getSection(position);
        //非分组
        if (section == null) {
            //占据全宽

            return layoutManager.getSpanCount();
        }
        //当前组的数量只有1个
        int itemCount = section.getItemCount();
        if (itemCount <= 1) {
            //占据全宽
            return layoutManager.getSpanCount();
        }
        return adapter.getItemIndex(position) < 0 ? layoutManager.getSpanCount() : 1;
    }
}
