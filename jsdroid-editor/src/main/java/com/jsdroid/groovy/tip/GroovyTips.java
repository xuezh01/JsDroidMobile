package com.jsdroid.groovy.tip;

import com.jsdroid.editor.tip.Tip;
import com.jsdroid.groovy.antlr4.parser.GroovyLexer;
import com.jsdroid.groovy.antlr4.parser.GroovyParser;
import com.jsdroid.groovy.info.ClassInfo;
import com.jsdroid.groovy.info.FieldInfo;
import com.jsdroid.groovy.info.MethodInfo;
import com.jsdroid.groovy.info.VariableInfo;
import com.jsdroid.groovy.node.FieldNode;
import com.jsdroid.groovy.node.MethodNode;
import com.jsdroid.groovy.node.Node;
import com.jsdroid.groovy.node.NodeVisitor;
import com.jsdroid.groovy.node.PathExpressionNode;
import com.jsdroid.groovy.node.RootNode;
import com.jsdroid.script.JsDroidScript;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GroovyTips {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //获取全部提示：类提示、方法提示
//        RootNode node = generateRootNode(new File(""), "C", null);
//        node.file = new File("view/MainView.groovy");
//        Node cursorNode = node.cursorNode("C".length());
//        if (cursorNode == null) {
//            return;
//        }
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            String code = "def name = {}\n";
            stringBuilder.append(code);
        }

        GroovyLexer groovyLexer = new GroovyLexer(CharStreams.fromString(stringBuilder.toString()));

        long st = System.currentTimeMillis();

        while (true) {
            Token token = groovyLexer.nextToken();
            if (token != null) {
                break;
            }
            if (token.getType() == Token.EOF) {
                break;
            }
        }

        System.out.println(System.currentTimeMillis() - st);

    }

    public static List<Tip> searchTips(String filename, String code, int cursorPos, NodeVisitor.StopFlag stopFlag) {
        List<Tip> tips = new ArrayList<>();
        RootNode root = (RootNode) generateRootNode(new File(filename), code, stopFlag);
        Node cursorNode = root.cursorNode(cursorPos);
        if (cursorNode != null) {
            if (cursorNode.hasAncestor(GroovyParser.RULE_pathElement, 0, 4)
                    ||
                    (cursorNode.ruleIndex == GroovyParser.RULE_pathEnd && cursorNode.getText().length() > 0) //DOT
            ) {
                System.out.println("path tips");
                //成员方法或者属性提示
                tips.addAll(searchPathTips(cursorNode));
            } else {
                if (cursorNode.hasAncestor(GroovyParser.RULE_commandExpression)) {
                    System.out.println("command tips");
                    //变量提示
                    tips.addAll(searchVariableTips(cursorNode));
                    //当前类变量提示
                    tips.addAll(searchCursorFieldTips(cursorNode));
                    //当前类方法提示
                    tips.addAll(searchCursorMethodTips(cursorNode));
                }
                System.out.println("keywords tips");
                //关键字提示
                tips.addAll(keywordsTips(keywords));

                if (cursorNode.hasAncestor(GroovyParser.RULE_constructorTip)) {
                    //构造方法提示
                    System.out.println("constructor tips");
                }

                if (cursorNode.ruleIndex == GroovyParser.RULE_classTip || cursorNode.hasAncestor(GroovyParser.RULE_classTip)) {
                    System.out.println("class tips");
                    //类提示
                    List<ClassInfo> classInfos = root.getClassInfos();
                    for (ClassInfo classInfo : classInfos) {
                        if (classInfo != null) {
                            tips.add(new TipModel.ClassTipModel(classInfo));
                        }
                    }
                    tips.addAll(getJsDroidApiClassTips());
                    System.out.println("class tips:" + tips.size());
                }
            }

        }
        return tips;
    }

    public final static String JS_DROID_API = "android.api";

    public static List<TipModel> getJsDroidApiClassTips() {
        return PackageMap.getInstance(JS_DROID_API).getTips();
    }

    //region Variable

    /**
     * 变量提示
     *
     * @param cursorPos
     * @return
     */
    static List<Tip> searchVariableTips(Node cursorPos) {
        List<Tip> tips = new ArrayList<>();
        List<VariableInfo> infos = cursorPos.searchTreeVariables();
        for (VariableInfo info : infos) {
            tips.add(new TipModel.VariableTipModel(info));
        }
        return tips;
    }
    //endregion
    //region Method

    /**
     * 搜索当前环境定义的方法
     *
     * @param cursorNode
     * @return
     */
    static List<Tip> searchCursorMethodTips(Node cursorNode) {
        List<Tip> result = new ArrayList<>();
        List<MethodInfo> methodInfos = searchCursorMethods(cursorNode);
        for (MethodInfo methodInfo : methodInfos) {
            result.add(new TipModel.MethodTipModel(methodInfo));
        }
        return result;

    }

    public static List<MethodInfo> searchCursorMethods(Node cursorNode) {
        List<MethodInfo> result = new ArrayList<>();
        if (cursorNode.inRoot()) {

            result.addAll(searchRootMethods(cursorNode));
        }
        result.addAll(cursorNode.searchTreeMethods());
        return result;
    }


    static List<MethodInfo> searchRootMethods(Node cursorPos) {
        List<MethodInfo> result = new ArrayList<>();
        RootNode rootNode = (RootNode) cursorPos.getRootNode();

        if (rootNode.file != null && rootNode.file.getParentFile().getName().equals("view")) {
            try {
                result.addAll(searchClassMethods(Class.forName("com.jsdroid.ui.ViewScript")));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        if (rootNode.file != null && rootNode.file.getParentFile().getName().equals("script")) {
            result.addAll(searchClassMethods(JsDroidScript.class));
        }


        List<MethodNode> list = rootNode.searchDescendants(GroovyParser.RULE_methodDeclaration, 3);
        for (MethodNode methodNode : list) {
            MethodInfo methodInfo = methodNode.getMethodInfo();
            result.add(methodInfo);
        }
        return result;
    }
    //endregion


    //region Field
    public static List<Tip> searchCursorFieldTips(Node cursorPos) {
        List<Tip> result = new ArrayList<>();
        List<FieldInfo> fieldInfos = searchCursorFields(cursorPos);
        for (FieldInfo fieldInfo : fieldInfos) {
            result.add(new TipModel.FieldTipModel(fieldInfo));
        }
        return result;
    }

    public static List<FieldInfo> searchCursorFields(Node cursorNode) {
        List<FieldInfo> result = new ArrayList<>();
        if (cursorNode.inRoot()) {
            result.addAll(searchRootFields(cursorNode));
        }
        result.addAll(cursorNode.searchTreeFields());
        return result;
    }

    static Class viewScriptClass;

    static void initViewScriptClass() {
        if (viewScriptClass == null) {
            try {
                viewScriptClass = Class.forName("com.jsdroid.ui.ViewScript");
            } catch (ClassNotFoundException e) {
            }
        }
    }

    static List<FieldInfo> searchRootFields(Node cursorPos) {
        List<FieldInfo> result = new ArrayList<>();
        RootNode rootNode = (RootNode) cursorPos.getRootNode();
        if (rootNode.file != null
                && rootNode.file.getParentFile() != null
                && rootNode.file.getParentFile().getName().equals("view")) {

            result.addAll(searchClassFields(viewScriptClass));
        }

        if (rootNode.file != null
                && rootNode.file.getParentFile() != null
                && rootNode.file.getParentFile().getName().equals("script")) {
            result.addAll(searchClassFields(JsDroidScript.class));
        }
        List<FieldNode> list = rootNode.searchDescendants(GroovyParser.RULE_fieldDeclaration, 3);
        for (FieldNode fieldNode : list) {
            result.addAll(fieldNode.getFieldInfos());
        }
        return result;
    }

    //endregion

    public static List<Tip> keywordsTips(String keywords[]) {
        List<Tip> tips = new ArrayList<>();
        for (String keyword : keywords) {
            tips.add(new Tip.DefaultTip(-1, keyword, "关键字"));
        }
        return tips;
    }

    private static String keywords[] = new String[]{
            "class", "interface", "trait", "enum",
            "package", "import", "extends", "implements", "def", "null",
            "true", "false", "new", "super", "this", "in", "for", "if",
            "else", "do", "while", "switch", "case", "default", "continue",
            "break", "return", "try", "catch", "finally", "throw", "throws",
            "assert", "const", "goto", "abstract", "static",
            "final", "transient", "native", "volatile", "synchronized",
            "void",
            "strictfp", "threadsafe", "as", "instanceof"
    };


    static List<Tip> searchPathTips(Node cursorNode) {
        //pathExpression{ primary.pathElement.pathElement}
        List<Tip> tips = new ArrayList<>();
        PathExpressionNode node = (PathExpressionNode) cursorNode.searchAncestor(GroovyParser.RULE_pathExpression);
        ClassInfo cursorPathType = node.getCursorPathType(cursorNode);
        if (cursorPathType != null) {
            tips.addAll(generateClassFieldTips(cursorPathType));
            tips.addAll(generateClassMethodTips(cursorPathType));

        }
        return tips;
    }

    public static RootNode generateRootNode(File file, String code, NodeVisitor.StopFlag stopFlag) throws NodeVisitor.StopException {
        GroovyLexer groovyLexer = new GroovyLexer(CharStreams.fromString(code));

        CommonTokenStream tokenStream = new CommonTokenStream(groovyLexer) {
            @Override
            public Token LT(int k) {
                if (stopFlag != null && stopFlag.stopFlag()) {
                    throw new NodeVisitor.StopException();
                }
                return super.LT(k);
            }
        };
        GroovyParser groovyParser = new GroovyParser(tokenStream);
        long st = System.currentTimeMillis();
        GroovyParser.RootContext root = groovyParser.root();
        System.out.println("use " + (System.currentTimeMillis() - st));
        Node node = root.accept(new NodeVisitor(stopFlag));
        RootNode rootNode = (RootNode) node.getRootNode();
        rootNode.file = file;
        return rootNode;
    }


    static List<MethodInfo> searchClassMethods(Class clazz) {
        List<MethodInfo> ret = new ArrayList<>();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            ret.add(new MethodInfo(method));
        }
        return ret;
    }

    static List<FieldInfo> searchClassFields(Class clazz) {
        List<FieldInfo> fieldInfos = new ArrayList<>();
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            fieldInfos.add(new FieldInfo(field));
        }
        return fieldInfos;
    }

    static List<Tip> generateClassMethodTips(Class scriptClass) {
        List<Tip> ret = new ArrayList<>();
        Method[] methods = scriptClass.getMethods();
        for (Method method : methods) {
            TipModel.MethodTipModel methodTipModel = new TipModel.MethodTipModel(method);
            ret.add(methodTipModel);
        }
        return ret;
    }


    static List<Tip> generateClassMethodTips(ClassInfo classInfo) {
        if (classInfo.isInnerClass()) {
            return generateClassMethodTips(classInfo.getInnerClass());
        } else {
            List<Tip> ret = new ArrayList<>();
            List<MethodInfo> methods = classInfo.getMethods();
            for (MethodInfo method : methods) {
                ret.add(new TipModel.MethodTipModel(method));
            }
            return ret;
        }
    }

    static List<Tip> generateClassFieldTips(Class scriptClass) {
        List<Tip> ret = new ArrayList<>();
        Field[] fields = scriptClass.getFields();
        for (Field field : fields) {
            ret.add(new TipModel.FieldTipModel(field));
        }
        return ret;
    }

    static List<Tip> generateClassFieldTips(ClassInfo scriptClass) {
        if (scriptClass.isInnerClass()) {
            return generateClassFieldTips(scriptClass.getInnerClass());
        }
        List<Tip> ret = new ArrayList<>();

        List<FieldInfo> fields = scriptClass.getFields();
        for (FieldInfo field : fields) {
            ret.add(new TipModel.FieldTipModel(field));
        }
        return ret;
    }

}