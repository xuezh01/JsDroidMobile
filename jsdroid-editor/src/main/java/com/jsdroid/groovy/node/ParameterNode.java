package com.jsdroid.groovy.node;

import com.jsdroid.groovy.antlr4.parser.GroovyParser;
import com.jsdroid.groovy.info.ParameterInfo;

public class ParameterNode extends Node<GroovyParser.FormalParameterContext> {
    public ParameterNode(Node parent, int ruleIndex) {
        super(parent, ruleIndex);
    }

    public ParameterInfo getParameter() {
        ParameterInfo parameterInfo = new ParameterInfo();
        parameterInfo.parameterType = searchType(getParameterType());
        parameterInfo.parameterName = getParameterName();
        return parameterInfo;
    }

    String getParameterType() {
        return searchRuleText(GroovyParser.RULE_generalClassOrInterfaceType);
    }

    String getParameterName() {
        return searchRuleText(GroovyParser.RULE_variableDeclaratorId);
    }

}
