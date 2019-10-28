package com.jsdroid.groovy.tips;

import org.codehaus.groovy.antlr.parser.GroovyLexer;
import org.codehaus.groovy.antlr.parser.GroovyTokenTypes;
import org.codehaus.groovy.ast.ModuleNode;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.control.ErrorCollector;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.syntax.ParserException;
import org.codehaus.groovy.syntax.Token;

import java.io.StringReader;
import java.util.List;

import groovy.lang.GroovyClassLoader;
import groovyjarjarantlr.InputBuffer;
import groovyjarjarantlr.RecognitionException;
import groovyjarjarantlr.TokenStreamException;
import groovyjarjaropenbeans.beancontext.BeanContextServiceRevokedEvent;

public class JsdTip {
    private List classes;
    private List trees;

    public static void main(String[] args) throws ParserException, TokenStreamException, RecognitionException {
        //编译成功，则用编译成功的时间的树来解析当前的提示
        //解析所有
        GroovyLexer groovyLexer = new GroovyLexer(new StringReader("class  Hello{}"));
        for (; ; ) {
            groovyjarjarantlr.Token token = groovyLexer.nextToken();
            if (token == null) {
                break;
            }
            if (token.getType() == groovyjarjarantlr.Token.EOF_TYPE){
                break;
            }
            switch (token.getType()){
                case GroovyTokenTypes.CLASS_DEF:
                    System.out.println("class:"+token.getText());
                    break;
                case GroovyTokenTypes.LITERAL_class:
                    System.out.println("literal class:"+token.getText());
                    break;
                case GroovyTokenTypes.IDENTICAL:
                    System.out.println("identical:"+token.getText());
                    break;
                case GroovyTokenTypes.IDENT:
                    System.out.println("ident:"+token.getText());
                    break;
                default:
                    System.out.println("type:"+token.getType());
                    break;
            }

        }

    }

    static void testGroovy() {
        CompilerConfiguration config = new CompilerConfiguration();
        config.setDebug(true);
        GroovyClassLoader gloader = new GroovyClassLoader();
        ErrorCollector error = new ErrorCollector(config);
        SourceUnit src = new SourceUnit("main.groovy", "print(1)\nclass Hello{}\n" +
                "def s = new Hello()", config, gloader, error);
        src.parse();
        src.gotoPhase(3);
        src.convert();
    }
}
