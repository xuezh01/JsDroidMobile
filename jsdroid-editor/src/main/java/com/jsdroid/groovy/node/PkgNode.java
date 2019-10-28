package com.jsdroid.groovy.node;

import com.jsdroid.groovy.antlr4.parser.GroovyParser;

public class PkgNode extends Node<GroovyParser.PackageDeclarationContext> {
    public String pkg;

    public PkgNode(Node parent, int ruleIndex) {
        super(parent, ruleIndex);
    }


    @Override
    public void visit(GroovyParser.PackageDeclarationContext ctx) {
        pkg = ctx.qualifiedName().getText();
    }
}
