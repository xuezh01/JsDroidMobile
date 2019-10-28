package com.jsdroid.app.design;

import com.jsdroid.api.context.JsdContext;
import com.jsdroid.app.capture.tree.TreeNode;
import com.jsdroid.app.design.tree.DesignItem;
import com.jsdroid.app.design.tree.DesignTreeNode;
import com.jsdroid.ui.parser.ViewMap;
import com.jsdroid.mvp.presenter.BasePresenter;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

/**
 * 展现xml树
 * 获取xml
 * 添加控件
 * 删除控件
 * 控件上移
 * 控件下移
 * 设置控件属性
 */
class UiDesignTreePresenter extends BasePresenter<UiDesignTreeView> {


    public void selectNode(DesignTreeNode node) {
        if (node.isSelected()) {
            return;
        }
        UiDesignTreeView view = getView();
        if (view == null) {
            return;
        }
        //树滑动到指定节点
        view.showSelectNode(node);

    }

    private static ViewMap elementToMap(JsdContext jsdContext, Node node) {
        ViewMap map = new ViewMap(jsdContext, node.getNodeName());
        map.put("type", node.getNodeName());
        NamedNodeMap attributes = node.getAttributes();
        if (attributes != null) {
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                Node item = attributes.item(i);
                map.put(item.getNodeName(), item.getNodeValue());
            }
        }
        List children = new ArrayList();

        NodeList childNodes = node.getChildNodes();
        int childCount = childNodes.getLength();
        for (int i = 0; i < childCount; i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                children.add(elementToMap(jsdContext, item));
            }
        }
        map.put("children", children);
        return map;
    }

    //将节点解析为树
    public ViewMap parseXml(JsdContext jsdContext, String xml) throws IOException, SAXException, ParserConfigurationException {
        return ViewMap.parseXml(jsdContext, xml);
    }

    //将树保存为xml
    public void saveXml(String filename) {
        List<TreeNode> roots = getView().treeViewAdapter.getRoots();
        if (roots.size() > 0) {
            TreeNode treeNode = roots.get(0);
            if (treeNode instanceof DesignTreeNode) {
                ViewMap view = ((DesignTreeNode) treeNode).getContent().getViewMap();
                try {
                    view.dumpXml(new FileOutputStream(filename));
                } catch (IOException e) {
                }
            }
        }
    }

    public void add(DesignTreeNode selectNode, ViewMap viewMap) {
        if (selectNode == null) {
            return;
        }
        selectNode.addChild(new DesignTreeNode(new DesignItem(viewMap)));
        updateTree();
    }

    public void delete(DesignTreeNode selectNode) {
        TreeNode parent = selectNode.getParent();
        if (parent == null) {
            return;
        }
        parent.removeChild(selectNode);
        updateTree();
    }

    public void up(DesignTreeNode selectNode)  {
        TreeNode parent = selectNode.getParent();
        if (parent == null) {
            return;
        }
        List childList = parent.getChildList();
        for (int i = 1; i < childList.size(); i++) {
            if (childList.get(i).equals(selectNode)) {
                childList.remove(i);
                childList.add(i - 1, selectNode);
                break;
            }
        }
        updateTree();
    }

    public void down(DesignTreeNode selectNode)  {
        TreeNode parent = selectNode.getParent();
        if (parent == null) {
            return;
        }
        List childList = parent.getChildList();
        for (int i = 0; i < childList.size() - 1; i++) {
            if (childList.get(i).equals(selectNode)) {
                childList.remove(i);
                childList.add(i + 1, selectNode);
                break;
            }
        }
        updateTree();
    }


    private void updateTree()  {
        getView().treeViewAdapter.refresh();

    }


    /**
     * 刷新
     */
    public void refreshDesignView() {


    }
}
