package com.jsdroid.groovy.node;

import com.jsdroid.groovy.antlr4.parser.GroovyParser;
import com.jsdroid.groovy.info.ImportInfo;

public class ImportNode extends Node<GroovyParser.ImportDeclarationContext> {
    public ImportNode(Node parent, int ruleIndex) {
        super(parent, ruleIndex);
    }

    public ImportInfo getImportInfo() {
        if (rule == null) {
            return null;
        }
        ImportInfo importInfo = new ImportInfo();
        importInfo.STATIC = rule.STATIC() != null;
        importInfo.MUL = rule.MUL() != null;
        importInfo.alias = rule.alias == null ? null : rule.alias.getText();
        Node node = searchDescendant(GroovyParser.RULE_qualifiedName);
        if (node != null) {
            importInfo.qualifiedName = node.getText();
        }
        return importInfo;
    }
}
