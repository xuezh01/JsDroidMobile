package com.jsdroid.groovy.node;

import com.jsdroid.groovy.antlr4.parser.GroovyParser;
import com.jsdroid.groovy.info.MethodInfo;
import com.jsdroid.groovy.info.ParameterInfo;

import java.util.ArrayList;
import java.util.List;

public class MethodNode extends Node<GroovyParser.MethodDeclarationContext> {
    public MethodNode(Node parent, int ruleIndex) {
        super(parent, ruleIndex);
    }


    public MethodInfo getMethodInfo() {
        MethodInfo methodInfo = new MethodInfo();
        methodInfo.returnType = searchType(getReturnType());
        methodInfo.methodName = getMethodName();
        methodInfo.parameters = getParameters();
        return methodInfo;
    }

    String getMethodName() {
        return searchRuleText(GroovyParser.RULE_methodName, 1);
    }

    boolean VOID() {
        GroovyParser.ReturnTypeContext returnTypeContext = rule.returnType();
        if (returnTypeContext == null) {
            return false;
        }
        return returnTypeContext.VOID() != null;
    }


    String getReturnType() {
        if (VOID()) {
            return "void";
        }

        Node node = searchDescendant(GroovyParser.RULE_primitiveType, 3);
        if (node != null) {
            return node.getText();
        }
        node = searchDescendant(GroovyParser.RULE_standardClassOrInterfaceType, 3);
        if (node != null) {
            return node.getText();
        }
        return "Object";
    }

    List<ParameterNode> getParameterNodes() {
        return searchDescendants(GroovyParser.RULE_formalParameter, 3);
    }

    List<ParameterInfo> getParameters() {
        List<ParameterInfo> infos = new ArrayList<>();
        List<ParameterNode> parameterNodes = getParameterNodes();
        if (parameterNodes != null) {
            for (ParameterNode parameterNode : parameterNodes) {
                ParameterInfo parameter = parameterNode.getParameter();
                if (parameter != null) {
                    infos.add(parameter);
                }
            }
        }
        return infos;
    }
}
