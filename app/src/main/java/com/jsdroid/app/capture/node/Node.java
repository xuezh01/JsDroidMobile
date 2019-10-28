package com.jsdroid.app.capture.node;


import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Node implements Cloneable {

    private Node root = this;

    public static Node clone(Node node) {
        try {
            return (Node) node.clone();
        } catch (Exception e) {
        }
        return null;
    }

    public static Node parseNode(String json) {
        return JSON.parseObject(json, Node.class);
    }

    public Node(Object treeNode) {
        this.treeNode = treeNode;
    }

    public Node() {
    }

    public Node(String clazz) {
        this.clazz = clazz;
    }

    public Object treeNode;
    public int depth;
    public int index;
    public String pkg;
    public String clazz;
    public String text;
    public String desc;
    public String res;
    public boolean checkable;
    public boolean checked;
    public boolean clickable;
    public boolean enabled;
    public boolean focusable;
    public boolean focused;
    public boolean longClickable;
    public boolean scrollable;
    public boolean selected;
    public Rect rect;
    public Node parent;
    public List<Node> children;
    public boolean password;

    public String getBy() {
        String by = "By";
        if (res != null && res.trim().length() > 0) {
            by += ".res('" + res + "')";
        }
        if (text != null && text.trim().length() > 0) {
            by += ".text('" + text + "')";
        }
        if (desc != null && desc.trim().length() > 0) {
            by += ".desc('" + desc + "')";
        }
        if (clazz != null && clazz.trim().length() > 0) {
            by += ".clazz('" + clazz + "')";
        }
        return by;
    }

    public Node getChild(int i) {
        return children == null ? null : children.get(i);
    }


    // 给子节点赋值深度和parent属性，获取json数据的时候parent不赋值，因为解析parent属性时候会产生死循环
    public void setParentAndDepth(int depth) {
        this.depth = depth;
        for (int i = 0; i < getChildCount(); i++) {
            getChild(i).parent = this;
            getChild(i).index = i;
            getChild(i).root = root;
            getChild(i).setParentAndDepth(depth + 1);
        }
    }

    public int getChildCount() {
        return children == null ? 0 : children.size();
    }

    // 查询
    public List<Node> findNodes(BySelector selector) {
        List<Node> ret = new ArrayList<Node>();
        for (Node node : ByMatcher.findMatches(selector, this)) {
            ret.add(node);
        }
        return ret;
    }

    public String toString() {
        if (clazz != null) {
            //序号 类名 :文字 {简介} 矩阵
            StringBuilder result = new StringBuilder();
            result.append("(" + index + ") ");
            if (clazz.startsWith("android.widget") || clazz.startsWith("android.view")) {
                int dotCount = 0;
                int lastDot = 0;
                for (int i = 0; i < clazz.length(); i++) {
                    if (clazz.charAt(i) == '.') {
                        lastDot = i;
                        dotCount++;
                    }
                }
                if (dotCount == 2) {
                    result.append(clazz.substring(lastDot + 1));
                } else {
                    result.append(clazz);
                }
            } else {
                result.append(clazz);
            }
            if (this.text != null && this.text.trim().length() > 0) {
                if (this.text.length() > 10) {
                    result.append(":" + this.text.substring(0, 10));
                } else {
                    result.append(":" + this.text);
                }
            }
            if (this.desc != null && this.desc.trim().length() > 0) {
                if (this.desc.length() > 10) {
                    result.append("{" + this.desc.substring(0, 10) + "}");
                } else {
                    result.append("{" + this.desc + "}");
                }
            }
            if (rect != null) {
                result.append(String.format(" [%d,%d][%d,%d]", rect.left, rect.top, rect.right, rect.bottom));
            }
            return result.toString();
        }
        return "节点信息";
    }

    public void copyFromNode(Node node) {
        text = node.text;
        res = node.res;
        clazz = node.clazz;
        pkg = node.pkg;
        desc = node.desc;
        checkable = node.checkable;
        checked = node.checked;
        clickable = node.clickable;
        enabled = node.enabled;
        focusable = node.focusable;
        focused = node.focused;
        scrollable = node.scrollable;
        longClickable = node.longClickable;
        password = node.password;
        selected = node.selected;
    }

    public BySelector getSelector() {
        return By.text(text).res(res).desc(desc).clazz(clazz);
    }


    public String getClickCode() {
        //click clazz:'',text:'',res:''
        StringBuilder code = new StringBuilder("click clazz:'" + clazz + "'");
        if (text != null) {
            code.append(",text:'" + text + "'");
        }
        if (res != null) {
            code.append(",res:'" + res + "'");
        }
        if (desc != null) {
            code.append(",desc:'" + desc + "'");
        }
        code.append(",timeout:1001");
        return code.toString();
    }

    public String getFindNodeCode() {
        //click clazz:'',text:'',res:''
        StringBuilder code = new StringBuilder("findNode(clazz:'" + clazz + "'");
        if (text != null && text.trim().length() > 0) {
            code.append(",text:'" + text + "'");
        }
        if (res != null && res.trim().length() > 0) {
            code.append(",res:'" + res + "'");
        }
        if (desc != null && desc.trim().length() > 0) {
            code.append(",desc:'" + desc + "'");
        }
        code.append(",timeout:1001)");
        return code.toString();
    }

    public String getNote() {
        StringBuilder note = new StringBuilder("查找节点 clazz:'" + clazz + "'");
        if (text != null && text.trim().length() > 0) {
            note.append(",text:'" + text + "'");
        }
        if (res != null && res.trim().length() > 0) {
            note.append(",res:'" + res + "'");
        }
        if (desc != null && desc.trim().length() > 0) {
            note.append(",desc:'" + desc + "'");
        }
        return note.toString();
    }

    public Rect getScreenRect() {
        if (parent == null) {
            int with = 0;
            int height = 0;
            if (children != null) {
                for (Node child : children) {
                    int right = child.rect.right;
                    int bottom = child.rect.bottom;
                    if (right > with) {
                        with = right;
                    }
                    if (bottom > height) {
                        height = bottom;
                    }
                }
            }
            return new Rect(0, 0, with, height);
        } else {
            return parent.getScreenRect();
        }
    }

    public Node getRoot() {
        return root;
    }

    public Node findNode(int depth, int index) {
        if (this.depth == depth && this.index == index) {
            return this;
        }
        if (children != null) {
            for (Node child : children) {
                Node node = child.findNode(depth, index);
                if (node != null) {
                    return node;
                }
            }
        }
        return null;
    }

    public String getSelectIndex() {
        List<Integer> arr = new LinkedList<>();
        arr.add(index);
        Node temp = parent;
        while (temp != null) {
            arr.add(temp.index);
            temp = temp.parent;
        }
        //将最后一个去掉
        arr.remove(arr.size() - 1);
        Collections.reverse(arr);
        return JSON.toJSONString(arr.toArray(new Integer[0]));
    }

    public Node get(String selectIndex) {
        int[] index = new int[0];
        try {
            index = JSON.parseObject(selectIndex, int[].class);
        } catch (Exception e) {
        }
        if (index == null) {
            return root;
        }
        Node temp = root;
        for (Integer i : index) {
            if (temp == null) {
                break;
            }
            if (temp.children == null) {
                return null;
            }
            temp = temp.children.get(i);
        }
        return temp;
    }
}
