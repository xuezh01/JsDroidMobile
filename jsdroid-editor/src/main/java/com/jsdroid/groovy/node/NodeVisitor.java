package com.jsdroid.groovy.node;

import com.jsdroid.groovy.antlr4.parser.GroovyParserBaseVisitor;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.RuleNode;

public class NodeVisitor extends GroovyParserBaseVisitor<Node> {
    Node parent;
    int depth;
    StopFlag stopFlag;

    public interface StopFlag {
        boolean stopFlag();
    }

    public NodeVisitor(StopFlag stopFlag) {
        this.stopFlag = stopFlag;
    }

    public static class StopException extends RuntimeException {

    }

    public Node visitNode(RuleContext ctx, Node node) {
        try {
            node.visit(ctx);
            parent = node;
            parent.depth = depth++;
//
//            for (int i = 0; i < parent.depth; i++) {
//                System.out.print("-");
//            }
//            System.out.print("[" + parent.depth + "] ");
//            System.out.println(node);
            super.visitChildren(ctx);
            return node;
        } finally {
            parent = node.parent;
            depth--;
        }
    }

    @Override
    public Node visitChildren(RuleNode ruleNode) {
        if (stopFlag != null) {
            if (stopFlag.stopFlag()) {
                throw new StopException();
            }
        }
        RuleContext ruleContext = ruleNode.getRuleContext();
        int ruleIndex = ruleContext.getRuleIndex();
        Node node = Node.create(ruleIndex, parent);
        return visitNode(ruleContext, node);
    }
}
