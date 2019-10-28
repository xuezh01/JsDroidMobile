package com.jsdroid.app.design.tree;

import android.support.annotation.NonNull;

import com.jsdroid.app.capture.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class DesignTreeNode extends TreeNode<DesignItem> {
    private boolean selected;

    public DesignTreeNode(@NonNull DesignItem content) {
        super(content);
        if (content.children != null) {
            for (DesignItem child : content.children) {
                addChild(new DesignTreeNode(child));
            }
        }
    }


    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public DesignTreeNode getRoot() {
        DesignTreeNode parent = (DesignTreeNode) getParent();
        if (parent != null) {
            return parent.getRoot();
        }
        return this;
    }

    @Override
    public DesignItem getContent() {
        DesignItem content = super.getContent();
        List<TreeNode> childList = getChildList();
        content.children = new ArrayList<>();
        for (TreeNode treeNode : childList) {
            DesignTreeNode child = (DesignTreeNode) treeNode;
            content.children.add(child.getContent());
        }
        return content;
    }

    /**
     * 取消所有选择项
     */
    public void unSelectAll() {
        List<TreeNode> childList = getChildList();
        for (TreeNode treeNode : childList) {
            if (treeNode instanceof DesignTreeNode) {
                ((DesignTreeNode) treeNode).unSelectAll();
            }
        }
        setSelected(false);
    }

    @Override
    public boolean isLeaf() {
        return getContent().getViewMap().getView().isLeaf();
    }
}