package com.jsdroid.groovy;

import org.codehaus.groovy.antlr.parser.GroovyLexer;
import org.codehaus.groovy.antlr.parser.GroovyRecognizer;
import org.codehaus.groovy.ast.CompileUnit;
import org.codehaus.groovy.ast.GroovyCodeVisitor;
import org.codehaus.groovy.ast.ModuleNode;
import org.codehaus.groovy.ast.expr.ArgumentListExpression;
import org.codehaus.groovy.ast.expr.ArrayExpression;
import org.codehaus.groovy.ast.expr.AttributeExpression;
import org.codehaus.groovy.ast.expr.BinaryExpression;
import org.codehaus.groovy.ast.expr.BitwiseNegationExpression;
import org.codehaus.groovy.ast.expr.BooleanExpression;
import org.codehaus.groovy.ast.expr.CastExpression;
import org.codehaus.groovy.ast.expr.ClassExpression;
import org.codehaus.groovy.ast.expr.ClosureExpression;
import org.codehaus.groovy.ast.expr.ClosureListExpression;
import org.codehaus.groovy.ast.expr.ConstantExpression;
import org.codehaus.groovy.ast.expr.ConstructorCallExpression;
import org.codehaus.groovy.ast.expr.DeclarationExpression;
import org.codehaus.groovy.ast.expr.ElvisOperatorExpression;
import org.codehaus.groovy.ast.expr.FieldExpression;
import org.codehaus.groovy.ast.expr.GStringExpression;
import org.codehaus.groovy.ast.expr.ListExpression;
import org.codehaus.groovy.ast.expr.MapEntryExpression;
import org.codehaus.groovy.ast.expr.MapExpression;
import org.codehaus.groovy.ast.expr.MethodCallExpression;
import org.codehaus.groovy.ast.expr.MethodPointerExpression;
import org.codehaus.groovy.ast.expr.NotExpression;
import org.codehaus.groovy.ast.expr.PostfixExpression;
import org.codehaus.groovy.ast.expr.PrefixExpression;
import org.codehaus.groovy.ast.expr.PropertyExpression;
import org.codehaus.groovy.ast.expr.RangeExpression;
import org.codehaus.groovy.ast.expr.SpreadExpression;
import org.codehaus.groovy.ast.expr.SpreadMapExpression;
import org.codehaus.groovy.ast.expr.StaticMethodCallExpression;
import org.codehaus.groovy.ast.expr.TernaryExpression;
import org.codehaus.groovy.ast.expr.TupleExpression;
import org.codehaus.groovy.ast.expr.UnaryMinusExpression;
import org.codehaus.groovy.ast.expr.UnaryPlusExpression;
import org.codehaus.groovy.ast.expr.VariableExpression;
import org.codehaus.groovy.ast.stmt.AssertStatement;
import org.codehaus.groovy.ast.stmt.BlockStatement;
import org.codehaus.groovy.ast.stmt.BreakStatement;
import org.codehaus.groovy.ast.stmt.CaseStatement;
import org.codehaus.groovy.ast.stmt.CatchStatement;
import org.codehaus.groovy.ast.stmt.ContinueStatement;
import org.codehaus.groovy.ast.stmt.DoWhileStatement;
import org.codehaus.groovy.ast.stmt.ExpressionStatement;
import org.codehaus.groovy.ast.stmt.ForStatement;
import org.codehaus.groovy.ast.stmt.IfStatement;
import org.codehaus.groovy.ast.stmt.ReturnStatement;
import org.codehaus.groovy.ast.stmt.SwitchStatement;
import org.codehaus.groovy.ast.stmt.SynchronizedStatement;
import org.codehaus.groovy.ast.stmt.ThrowStatement;
import org.codehaus.groovy.ast.stmt.TryCatchStatement;
import org.codehaus.groovy.ast.stmt.WhileStatement;
import org.codehaus.groovy.classgen.BytecodeExpression;
import org.codehaus.groovy.cli.GroovyPosixParser;
import org.codehaus.groovy.control.CompilationUnit;
import org.codehaus.groovy.control.CompilerConfiguration;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.security.CodeSource;
import java.util.List;

import groovy.lang.GroovyClassLoader;
import groovy.lang.Script;
import groovyjarjarantlr.CommonAST;
import groovyjarjarantlr.RecognitionException;
import groovyjarjarantlr.TokenStream;
import groovyjarjarantlr.TokenStreamException;
import groovyjarjarantlr.collections.AST;
import groovyjarjarantlr.collections.ASTEnumeration;

public class Test {
    public static void main(String[] args) throws IOException {
//        com.android.dx.command.dexer.Main.Arguments arguments = new com.android.dx.command.dexer.Main.Arguments();
//        String file = new File("jsdroid-groovy/bin/classes.jar").getPath();
//        String dexFile = new File("jsdroid-groovy/bin/colors.dex").getPath();
//        arguments.parse(new String[]{"--output=" + dexFile, file});
//        arguments.targetApiLevel = 14;
//        arguments.dexOptions.targetApiLevel = 14;
//        com.android.dx.command.dexer.Main.run(arguments);
        long st = System.currentTimeMillis();
        CompilationUnit compilationUnit = new CompilationUnit();
        String code = "import android.webkit.WebSettings\n" +
                "import android.webkit.WebView\n" +
                "import android.webkit.WebViewClient\n" +
                "import android.widget.LinearLayout\n" +
                "v = showView \"main.xml\"\n" +
                "WebView webView=new WebView(activity)\n" +
                "WebSettings webSettings = webView.getSettings();\n" +
                "webSettings.setJavaScriptEnabled(true);\n" +
                "//webSettings.setSupportZoom(true);\n" +
                "\n" +
                "webView.setWebViewClient(new WebViewClient() {\n" +
                "    @Override\n" +
                "    public boolean shouldOverrideUrlLoading(WebView view, String url) {\n" +
                "        view.loadUrl(url);\n" +
                "        v.url.text=url\n" +
                "        return true;\n" +
                "    }\n" +
                "});\n" +
                "\n" +
                "\n" +
                "v.content.view.addView(webView)\n" +
                "v.open.onClick {\n" +
                "    String url = v.url.text\n" +
                "    if(!url.startsWith(\"http://\")){\n" +
                "        url=\"http://\"+url\n" +
                "    }\n" +
                "    toast(url)\n" +
                "    webView.loadUrl(url)\n" +
                "}\n" +
                "webView.loadUrl(\"https://gitee.com/who2018/JsDroidDoc\")\n" +
                "onKeyDown{\n" +
                "    key,event->\n" +
                "        log key\n" +
                "        return true\n" +
                "}";

        compilationUnit.addSource("code.groovy", code);
        compilationUnit.compile();
        CompileUnit ast = compilationUnit.getAST();

        System.out.println(ast);
        List<ModuleNode> modules = ast.getModules();
        ModuleNode moduleNode = modules.get(0);
        System.out.println(moduleNode.getClasses().size());
        System.out.println(moduleNode.getStatementBlock().getText());

        moduleNode.visit(new GroovyCodeVisitor() {
            @Override
            public void visitBlockStatement(BlockStatement blockStatement) {
                System.out.println("block");
            }

            @Override
            public void visitForLoop(ForStatement forStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitWhileLoop(WhileStatement whileStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitDoWhileLoop(DoWhileStatement doWhileStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitIfElse(IfStatement ifStatement) {
                System.out.println("if");
            }

            @Override
            public void visitExpressionStatement(ExpressionStatement expressionStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitReturnStatement(ReturnStatement returnStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitAssertStatement(AssertStatement assertStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitTryCatchFinally(TryCatchStatement tryCatchStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitSwitch(SwitchStatement switchStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitCaseStatement(CaseStatement caseStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitBreakStatement(BreakStatement breakStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitContinueStatement(ContinueStatement continueStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitThrowStatement(ThrowStatement throwStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitSynchronizedStatement(SynchronizedStatement synchronizedStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitCatchStatement(CatchStatement catchStatement) {
                System.out.println("ss");
            }

            @Override
            public void visitMethodCallExpression(MethodCallExpression methodCallExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitStaticMethodCallExpression(StaticMethodCallExpression staticMethodCallExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitConstructorCallExpression(ConstructorCallExpression constructorCallExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitTernaryExpression(TernaryExpression ternaryExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitShortTernaryExpression(ElvisOperatorExpression elvisOperatorExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitBinaryExpression(BinaryExpression binaryExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitPrefixExpression(PrefixExpression prefixExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitPostfixExpression(PostfixExpression postfixExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitBooleanExpression(BooleanExpression booleanExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitClosureExpression(ClosureExpression closureExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitTupleExpression(TupleExpression tupleExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitMapExpression(MapExpression mapExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitMapEntryExpression(MapEntryExpression mapEntryExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitListExpression(ListExpression listExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitRangeExpression(RangeExpression rangeExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitPropertyExpression(PropertyExpression propertyExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitAttributeExpression(AttributeExpression attributeExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitFieldExpression(FieldExpression fieldExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitMethodPointerExpression(MethodPointerExpression methodPointerExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitConstantExpression(ConstantExpression constantExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitClassExpression(ClassExpression classExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitVariableExpression(VariableExpression variableExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitDeclarationExpression(DeclarationExpression declarationExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitGStringExpression(GStringExpression gStringExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitArrayExpression(ArrayExpression arrayExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitSpreadExpression(SpreadExpression spreadExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitSpreadMapExpression(SpreadMapExpression spreadMapExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitNotExpression(NotExpression notExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitUnaryMinusExpression(UnaryMinusExpression unaryMinusExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitUnaryPlusExpression(UnaryPlusExpression unaryPlusExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitBitwiseNegationExpression(BitwiseNegationExpression bitwiseNegationExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitCastExpression(CastExpression castExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitArgumentlistExpression(ArgumentListExpression argumentListExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitClosureListExpression(ClosureListExpression closureListExpression) {
                System.out.println("ss");
            }

            @Override
            public void visitBytecodeExpression(BytecodeExpression bytecodeExpression) {
                System.out.println("ss");
            }
        });


        System.out.println(System.currentTimeMillis() - st);
    }
}
