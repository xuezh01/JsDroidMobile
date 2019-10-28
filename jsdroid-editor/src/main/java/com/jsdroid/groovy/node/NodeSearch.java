package com.jsdroid.groovy.node;

import java.util.ArrayList;
import java.util.List;

public class NodeSearch {
    class Rule {
        public int ruleIndex;
        public Integer minDepth;
        public Integer maxDepth;

        public Rule(int ruleIndex, Integer minDepth, Integer maxDepth) {
            this.ruleIndex = ruleIndex;
            this.minDepth = minDepth;
            this.maxDepth = maxDepth;
        }
    }

    Node cursorNode;

    private NodeSearch(Node cursorNode) {
        this.cursorNode = cursorNode;
    }

    List<Rule> ancestorsRules = new ArrayList<>();//祖先节点需要满足
    List<Rule> descendantsRules = new ArrayList<>();//后代节点需要满足

    public NodeSearch ancestor(int ruleIndex, Integer minDepth, Integer maxDepth) {
        ancestorsRules.add(new Rule(ruleIndex, minDepth, maxDepth));
        return this;
    }

    public NodeSearch ancestor(int ruleIndex, Integer depth) {
        return ancestor(ruleIndex, depth, depth);
    }

    public NodeSearch ancestor(int ruleIndex) {
        return ancestor(ruleIndex, null, null);
    }

    public NodeSearch descendant(int ruleIndex, Integer minDepth, Integer maxDepth) {
        descendantsRules.add(new Rule(ruleIndex, minDepth, maxDepth));
        return this;
    }

    public NodeSearch descendant(int ruleIndex, Integer depth) {
        return descendant(ruleIndex, depth, depth);
    }

    public NodeSearch descendant(int ruleIndex) {
        return descendant(ruleIndex, null, null);
    }

    public static NodeSearch create(Node root, int cursor) {
        Node cursorNode = root.cursorNode(cursor);
        return new NodeSearch(cursorNode);
    }

    public static NodeSearch create(Node cursorNode) {
        return new NodeSearch(cursorNode);
    }


    private Node searchAncestorRule(Rule rule) {
        Node temp = cursorNode.parent;
        //祖先搜索
        for (int depth = 1; ; depth++) {
            if (rule.minDepth != null && depth < rule.maxDepth) {
                continue;
            }
            if (rule.maxDepth != null && depth > rule.maxDepth) {
                break;
            }

            if (temp.ruleIndex == rule.ruleIndex) {
                return temp;
            }
            temp = temp.parent;
            if (temp == null) {
                break;
            }
        }
        return null;
    }


}
