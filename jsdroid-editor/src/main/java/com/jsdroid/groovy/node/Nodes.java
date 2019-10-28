package com.jsdroid.groovy.node;

import com.jsdroid.editor.tip.Tip;
import com.jsdroid.groovy.tip.GroovyTips;
import com.jsdroid.groovy.tip.TipModel;

import java.io.File;
import java.util.List;

public class Nodes {
    public static void getClassTips(Node thisNode, List<TipModel> tipModels) {
        tipModels.addAll(GroovyTips.getJsDroidApiClassTips());
        List<Node> nodes = thisNode.searchDescendants(Node.CLASS);
        for (Node node : nodes) {
            TipModel tipModel = node.generateTip();
            if (tipModel != null && !tipModels.contains(tipModel)) {
                tipModels.add(tipModel);
            }
        }
    }

    public static void main(String[] args) {
        List<Tip> tips = GroovyTips.searchTips("xxx", "def hello(){}\n device.findObjects()",

                "def hello(){".length(), null);
        for (Tip tip : tips) {
            System.out.println(tip.getClass());
        }

    }
}
