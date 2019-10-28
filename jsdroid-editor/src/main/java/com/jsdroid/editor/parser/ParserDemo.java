package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.groovy.GroovyLexer;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;
import java.util.List;

public class ParserDemo {
    public static void main(String[] args) {
        String code = "interface IUser {\n" +
                "    void say();\n" +
                "}\n" +
                "/**\n" +
                " * 666\n" +
                " */\n" +
                "class User {\n" +
                "    void hello() {\n" +
                "        new IUser() {\n" +
                "\n" +
                "            @Override\n" +
                "            void say() {\n" +
                "                {**}\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    void haha(){\n" +
                "        \n" +
                "    }\n" +
                "    class User1{\n" +
                "\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "User user = new User();\n" +
                "user.hello();";
        System.out.println(code);
        GroovyLexer groovyLexer = new GroovyLexer(CharStreams.fromString(code));
        CommonTokenStream commonTokenStream = new CommonTokenStream(groovyLexer);
        com.jsdroid.antlr4.groovy.GroovyParser parser = new com.jsdroid.antlr4.groovy.GroovyParser(commonTokenStream);
//        System.out.println(Arrays.toString(parser.getRuleNames()));
//        for (String s : parser.getRuleNames()) {
//            System.out.println(s);
//        }
        parser.compilationUnit().accept(new ParseTreeVisitor<Object>() {
            @Override
            public Object visit(ParseTree tree) {
                System.out.println("-----------------------" + tree.getClass() + "-------------------------\n" + tree.getText());

                System.out.println();
                System.out.println();
                int childCount = tree.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    ParseTree child = tree.getChild(i);
                    if (child instanceof RuleNode) {
                        visitChildren((RuleNode) child);
                    }
                    if (child instanceof TerminalNode) {
                        visitTerminal((TerminalNode) child);
                    }
                    if (child instanceof ErrorNode) {
                        visitErrorNode((ErrorNode) child);
                    }
                }
                return null;
            }

            @Override
            public Object visitChildren(RuleNode node) {
//                System.out.println("visitChildren：");
                if (node instanceof TerminalNode) {
                    return visitTerminal((TerminalNode) node);
                }
                if (node instanceof ErrorNode) {
                    return visitErrorNode((ErrorNode) node);
                }
                return visit(node);
            }

            @Override
            public Object visitTerminal(TerminalNode node) {
                System.out.println("visitTerminal");
                visit(node);
                return null;
            }

            @Override
            public Object visitErrorNode(ErrorNode node) {
                System.out.println("visitErrorNode");
                visit(node);
                return null;
            }
        });
    }
}
