package com.jsdroid.app.design.tree;

import android.view.View;

import com.jsdroid.app.R;
import com.jsdroid.app.capture.tree.TreeNode;
import com.jsdroid.app.capture.tree.TreeViewBinder;

/**
 * 界面设计树适配器
 */
public class DesignTreeViewBinder extends TreeViewBinder<DesignTreeViewHolder> {


    @Override
    public DesignTreeViewHolder provideViewHolder(View itemView) {
        return new DesignTreeViewHolder(itemView);
    }

    @Override
    public void bindView(DesignTreeViewHolder holder, int position, TreeNode node) {
        DesignItem content = (DesignItem) node.getContent();
        holder.setTextInfo(content.getViewMap().getView().getName());
        holder.setArrow(node.isExpand());

        holder.showArrow(!node.isLeaf());
        if (node instanceof DesignTreeNode) {
            holder.setSelected(((DesignTreeNode) node).isSelected());
        }

    }

    @Override
    public int getLayoutId() {
        return R.layout.tree_item_design;
    }

}
