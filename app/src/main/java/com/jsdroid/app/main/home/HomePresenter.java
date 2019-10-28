package com.jsdroid.app.main.home;

import android.content.Intent;

import com.jsdroid.app.adapter.SectionHeader;
import com.jsdroid.app.adapter.SectionItem;
import com.jsdroid.app.entity.Tool;
import com.jsdroid.app.eye.ToolActivity;
import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.mvp.presenter.BasePresenter;
import com.qmuiteam.qmui.widget.section.QMUISection;

import java.util.ArrayList;
import java.util.List;

class HomePresenter extends BasePresenter<HomePage> implements JsdTool.JsdListener {
    @Override
    protected void onCreate() {
        super.onCreate();
        loadData();
        JsdTool.getInstance().addListener(this);
    }

    @Override
    protected void onDestroyed() {
        super.onDestroyed();
        JsdTool.getInstance().removeListener(this);
    }

    /**
     * 工程
     */
    public void loadData() {
        List<QMUISection<SectionHeader, SectionItem>> data = new ArrayList<>();
        data.add(loadFavoriteSection());
        data.add(loadHistoriesSection());
        getView().sectionAdapter.setData(data);
        getView().sectionAdapter.notifyDataSetChanged();

    }


    private QMUISection<SectionHeader, SectionItem> loadFavoriteSection() {
        SectionHeader header = new SectionHeader("我的收藏");
        header.type = SectionHeader.Type.TOOL_FAVORITE;
        List<SectionItem> items = new ArrayList<>();
        List<Tool> tools = JsdTool.getInstance().loadFavorites();
        for (Tool tool : tools) {
            items.add(new SectionItem(tool));
        }
        return new QMUISection<>(header, items);
    }

    private QMUISection<SectionHeader, SectionItem> loadHistoriesSection() {
        SectionHeader header = new SectionHeader("最近运行");
        header.type = SectionHeader.Type.TOOL_RECENT;
        List<SectionItem> items = new ArrayList<>();
        List<Tool> tools = JsdTool.getInstance().loadHistories();
        for (Tool tool : tools) {
            items.add(new SectionItem(tool));
        }
        return new QMUISection<>(header, items);
    }

    @Override
    public void onToolChanged() {
        loadData();
    }

    public void openTool(Tool tool) {
        Intent intent = new Intent(getView().getContext(), ToolActivity.class);
        intent.putExtra("pkg", tool.pkg);
        getView().getContext().startActivity(intent);
    }
}
