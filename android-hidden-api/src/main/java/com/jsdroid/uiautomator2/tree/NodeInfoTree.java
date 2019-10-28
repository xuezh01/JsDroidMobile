package com.jsdroid.uiautomator2.tree;

import android.os.Build;
import android.util.LongArray;
import android.view.accessibility.AccessibilityNodeInfo;

import com.jsdroid.uiautomator2.AccessibilityNodeInfoHelper;
import com.jsdroid.uiautomator2.UiDevice;
import com.jsdroid.uiautomator2.node.Rect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 通过树来缓存节点信息
 */
public class NodeInfoTree {
    /**
     * 缓存表
     */
    private static Map<Long, NodeInfoTree> nodeInfoTreeMap = new HashMap<>();

    public long sourceId;
    public Integer depth;
    public Integer index;
    public String pkg;
    public String clazz;
    public String text;
    public String desc;
    public String res;
    public Boolean checkable;
    public Boolean checked;
    public Boolean clickable;
    public Boolean enabled;
    public Boolean focusable;
    public Boolean focused;
    public Boolean longClickable;
    public Boolean scrollable;
    public Boolean selected;
    public Rect rect;
    public Boolean password;

    public NodeInfoTree parent;

    public List<NodeInfoTree> children;
    private AccessibilityNodeInfo nodeInfo;

    public NodeInfoTree(AccessibilityNodeInfo nodeInfo) {
        //缓存起来
        nodeInfoTreeMap.put(nodeInfo.getSourceNodeId(), this);
        children = new ArrayList<>();
        this.nodeInfo = nodeInfo;
        //读取子节点
        readChild();
    }

    private void readChild() {
        if (nodeInfo == null) {
            return;
        }
        int childCount = nodeInfo.getChildCount();
        for (int i = 0; i < childCount; i++) {
            NodeInfoTree child = new NodeInfoTree(nodeInfo.getChild(i));
            if (!children.contains(child)) {
                children.add(child);
            }
            child.parent = this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeInfoTree that = (NodeInfoTree) o;

        return nodeInfo != null ? nodeInfo.equals(that.nodeInfo) : that.nodeInfo == null;
    }

    private static String safeCharSeqToString(CharSequence cs) {
        if (cs == null)
            return "";
        else {
            return cs.toString();
        }
    }

    public void refreshInfo() {
        sourceId = nodeInfo.getSourceNodeId();
        index = index;
        text = safeCharSeqToString(nodeInfo.getText());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
            res = safeCharSeqToString(nodeInfo.getViewIdResourceName());
        }
        clazz = safeCharSeqToString(nodeInfo.getClassName());
        pkg = safeCharSeqToString(nodeInfo.getPackageName());
        desc = safeCharSeqToString(nodeInfo.getContentDescription());
        checkable = nodeInfo.isCheckable();
        checked = nodeInfo.isChecked();
        clickable = nodeInfo.isClickable();
        enabled = nodeInfo.isEnabled();
        focusable = nodeInfo.isFocusable();
        focused = nodeInfo.isFocused();
        scrollable = nodeInfo.isScrollable();
        longClickable = nodeInfo.isLongClickable();
        password = nodeInfo.isPassword();
        selected = nodeInfo.isSelected();
        int width = UiDevice.getInstance().getDisplayWidth();
        int height = UiDevice.getInstance().getDisplayHeight();
        android.graphics.Rect r = AccessibilityNodeInfoHelper
                .getVisibleBoundsInScreen(nodeInfo, width, height);
        rect = new Rect(r.left, r.top, r.right, r.bottom);
    }
}
