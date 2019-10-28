package com.jsdroid.groovy.node;

import android.util.Log;

import com.jsdroid.groovy.antlr4.parser.GroovyParser;
import com.jsdroid.groovy.info.FieldInfo;

import java.util.ArrayList;
import java.util.List;

public class FieldNode extends Node {
    public FieldNode(Node parent, int ruleIndex) {
        super(parent, ruleIndex);
    }

    /**
     * 获取变量信息
     *
     * @return
     */
    public List<FieldInfo> getFieldInfos() {
        String type = getType();
        List<FieldInfo> fieldInfos = new ArrayList<>();
        List<String> names = getNames();
        for (String name : names) {
            FieldInfo fieldInfo = new FieldInfo();
            fieldInfo.setFieldType(searchType(type));
            fieldInfo.setFieldName(name);
            fieldInfos.add(fieldInfo);
        }
        return fieldInfos;
    }

    public String getType() {
        return searchRuleText(GroovyParser.RULE_type);
    }

    public List<String> getNames() {
        List<String> ret = new ArrayList<>();
        List<Node> nodes = searchDescendants(GroovyParser.RULE_variableDeclaratorId);
        if (nodes != null) {
            for (Node node : nodes) {
                String text = node.getText();
                if (text != null) {
                    ret.add(text);
                }
            }
        }
        return ret;

    }
}
