package com.jsdroid.app.design.tree;

import com.jsdroid.app.R;
import com.jsdroid.app.capture.tree.LayoutItemType;
import com.jsdroid.ui.parser.ViewMap;

import java.util.ArrayList;
import java.util.List;

public class DesignItem implements LayoutItemType {
    private ViewMap viewMap;
    public List<DesignItem> children;

    public DesignItem(ViewMap viewMap) {
        this.viewMap = viewMap;
        if (viewMap.containsKey("children")) {
            this.children = new ArrayList<>();
            List<ViewMap> children = (List<ViewMap>) viewMap.get("children");
            for (ViewMap child : children) {
                this.children.add(new DesignItem(child));
            }
        }
    }


    public ViewMap getViewMap() {
        if (children != null) {
            List<ViewMap> arr = new ArrayList<>();
            for (DesignItem child : children) {
                ViewMap viewMap = child.getViewMap();
                arr.add(viewMap);
            }
            viewMap.put("children", arr);
        }
        return viewMap;
    }

    @Override
    public int getLayoutId() {
        return R.layout.tree_item_design;
    }
}