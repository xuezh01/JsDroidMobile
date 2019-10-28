package com.jsdroid.groovy.node;

import com.jsdroid.groovy.antlr4.parser.GroovyParser;
import com.jsdroid.groovy.info.ClassInfo;
import com.jsdroid.groovy.info.FieldInfo;
import com.jsdroid.groovy.info.MethodInfo;
import com.jsdroid.groovy.info.VariableInfo;
import com.jsdroid.groovy.tip.GroovyTips;

import java.util.List;

public class PathExpressionNode extends Node {
    public PathExpressionNode(Node parent, int ruleIndex) {
        super(parent, ruleIndex);
    }

    public String getPrimary() {
        return searchRuleText(GroovyParser.RULE_primary, 1);
    }

    private ClassInfo getPrimaryType(String primary, List<Node> paths) {
        //局部变量
        VariableInfo variableInfo = searchTreeVariable(primary);
        if (variableInfo != null) {
            return variableInfo.type;
        }
        //方法
        if (paths.size() > 0 && paths.get(0).getText() != null && paths.get(0).getText().startsWith("(")) {
            MethodInfo methodInfo = searchTreeMethod(primary);
            if (methodInfo != null) {
                return methodInfo.returnType;
            }

        }
        //变量
        FieldInfo fieldInfo = searchTreeField(primary);
        if (fieldInfo != null) {
            return fieldInfo.getFieldType();
        }
        //类
        return searchType(primary);
    }

    public ClassInfo getCursorPathType(Node cursor) {
        List<Node> paths = searchDescendants(GroovyParser.RULE_pathElement, 1);
        String primary = getPrimary();
        ClassInfo type = getPrimaryType(primary, paths);

        for (Node path : paths) {
            if (path.contains(cursor)) {
                break;
            }
            if (path.ruleIndex == GroovyParser.RULE_pathEnd) {
                break;
            }
            String text = path.getText();
            if (text == null) {
                continue;
            }
            if (text.startsWith("(")) {
                continue;
            }
            if (text.startsWith(".")) {
                String name = text.substring(1);
                ClassInfo method = type.searchMethodType(name);
                if (method != null) {
                    type = method;
                } else {
                    type = type.searchFieldType(name);
                }
                if (type == null) {
                    type = ClassInfo.OBJECT;
                }
            }
        }
        if (type != null) {
            return type;
        }

        return ClassInfo.OBJECT;
    }

}
