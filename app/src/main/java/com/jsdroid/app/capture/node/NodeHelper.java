package com.jsdroid.app.capture.node;

import java.util.ArrayList;
import java.util.List;

public class NodeHelper {
    // 得到一个获取其节点的函数
    public static String getFindFunction(Node root, Node node, String linestart) {
        if (root == null) {
            return null;
        }
        if (node == null) {
            return null;
        }
        root.setParentAndDepth(0);
        if (linestart == null) {
            linestart = "";
        }
        if (linestart == null) {
            linestart = "";
        }
        String linestart2 = linestart + "    ";
        Node parent = getTheOnlyParent(root, node);
        String functionString = "";
        functionString += linestart + "//" + node.getNote() + "\n";
        functionString += linestart + "try{\n";
        String findNodeCode = parent.getFindNodeCode();
        String findNode = linestart2 + "node = " + findNodeCode + "\n";
        String getChild = "";

        Node temp = node;
        for (; ; ) {
            if (temp == parent || temp == null) {
                break;
            }
            getChild = linestart2 + "node = node.children[" + temp.index + "]\n"
                    + getChild;
            temp = temp.parent;
        }
        functionString += findNode + getChild;
        functionString += linestart + "    if(node){\n" +
                linestart2 + "    //找到节点，点击节点\n" +
                linestart2 + "    //node.click()\n" +
                "    }else{\n" +
                linestart2 + "    //定位失败\n" +
                "    }\n";
        functionString += linestart + "} catch (Exception e) {\n" +
                linestart + "    //定位错误\n" +
                "}\n";
        return functionString;
    }

    // 点击一个点，获取节点
    public static Node getTapNode(Node root, int x, int y) {
        List<Node> nodes = new ArrayList<>();
        getTapNodeList(root, x, y, nodes);
        Node last = null;
        for (int i = 0; i < nodes.size(); i++) {
            Node node = nodes.get(i);

            if (last == null || last.rect.contains(node.rect) || last.rect.width() > node.rect.width()) {
                last = node;
            }
        }
        return last;
    }

    public static void getTapNodeList(Node root, int x, int y, List<Node> nodeList) {
        if (root.rect == null) {
            for (int i = 0; i < root.getChildCount(); i++) {
                Node node = getTapNode(root.getChild(i), x, y);
                if (node != null) {
                    getTapNodeList(node, x, y, nodeList);
                }
            }
        } else {
            if (root.rect.contains(x, y)) {
                for (int i = 0; i < root.getChildCount(); i++) {
                    Node node = getTapNode(root.getChild(i), x, y);
                    if (node != null) {
                        getTapNodeList(node, x, y, nodeList);
                    }
                }
                nodeList.add(root);
            }
        }
    }

    // 得到唯一性的父节点
    static Node getTheOnlyParent(Node root, Node node) {
        Node temp = node;
        for (; ; ) {
            BySelector selector = temp.getSelector();
            if (isTheOnlySelector(root, selector)) {
                return temp;
            }
            if (temp.parent == null || temp.parent == root) {
                return temp;
            }
            temp = temp.parent;
        }

    }

    // 判断是否是唯一选择器
    static boolean isTheOnlySelector(Node root, BySelector selector) {
        if (root.findNodes(selector).size() == 1) {
            return true;
        }
        return false;
    }
}
