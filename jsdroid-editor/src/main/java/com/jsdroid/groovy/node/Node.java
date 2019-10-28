package com.jsdroid.groovy.node;

import com.jsdroid.groovy.antlr4.parser.GroovyParser;
import com.jsdroid.groovy.info.ClassInfo;
import com.jsdroid.groovy.info.FieldInfo;
import com.jsdroid.groovy.info.ImportInfo;
import com.jsdroid.groovy.info.MethodInfo;
import com.jsdroid.groovy.info.VariableInfo;
import com.jsdroid.groovy.tip.GroovyTips;
import com.jsdroid.groovy.tip.TipModel;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node<T extends RuleContext> {

    public static final int CLASS = GroovyParser.RULE_classDeclaration;
    public static final int PKG = GroovyParser.RULE_packageDeclaration;
    public static final int IMPORT = GroovyParser.RULE_importDeclaration;
    public static final int FIELD = GroovyParser.RULE_fieldDeclaration;
    public static final int METHOD = GroovyParser.RULE_methodDeclaration;
    public static final int MEMBER = GroovyParser.RULE_memberDeclaration;
    public static final int PRIMITIVE_TYPE = GroovyParser.RULE_primitiveType;

    public static final Map<Integer, Class> typeMap = newTypeMap(
            GroovyParser.RULE_root, RootNode.class,
            GroovyParser.RULE_packageDeclaration, PkgNode.class,
            GroovyParser.RULE_importDeclaration, ImportNode.class,
            GroovyParser.RULE_methodOrFieldTip, MethodOrFieldTipNode.class,
            GroovyParser.RULE_classTip, ClassTipNode.class,
            GroovyParser.RULE_variableTip, VariableTipNode.class,
            GroovyParser.RULE_constructorTip, ConstructorTipNode.class,
            GroovyParser.RULE_classDeclaration, ClassNode.class,
            GroovyParser.RULE_methodDeclaration, MethodNode.class,
            GroovyParser.RULE_fieldDeclaration, FieldNode.class,
            GroovyParser.RULE_formalParameter, ParameterNode.class,
            GroovyParser.RULE_pathExpression, PathExpressionNode.class
    );


    public static Map<Integer, Class> newTypeMap(Object... objs) {
        Map<Integer, Class> map = new HashMap<>();
        for (int i = 0; i < objs.length; i++) {
            if (objs[i] instanceof Class) {
                map.put((Integer) objs[i - 1], (Class) objs[i]);
            }
        }
        return map;
    }

    public T rule;
    public int index;
    public Node parent;
    public int ruleIndex;
    public List<Node> children;
    public int depth;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node<?> node = (Node<?>) o;
        if (rule == null) {
            return false;
        }
        return rule.equals(node.rule);
    }

    public String getText() {
        if (rule != null) {
            return rule.getText();
        }
        return null;
    }

    public Node(Node parent, int ruleIndex) {
        this.parent = parent;
        if (parent != null) {
            parent.addChild(this);
        }
        this.ruleIndex = ruleIndex;
    }

    public void addChild(Node node) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(node);
    }

    public void visit(T ctx) {
        rule = ctx;
    }

    public <E> E searchNode(int ruleIndex) {
        if (children == null) {
            return null;
        }
        for (Node child : children) {
            if (child.ruleIndex == ruleIndex) {
                return (E) child;
            }
        }
        return null;
    }

    public Token getFistToken() {
        ParseTree temp = rule;
        if (temp instanceof ParserRuleContext) {
            return ((ParserRuleContext) temp).getStart();
        }
        return null;
//        for (; ; ) {
//            if (temp == null) {
//                return null;
//            }
//            if (temp instanceof TerminalNode) {
//                return ((TerminalNode) temp).getSymbol();
//            }
//            if (temp.getChildCount() == 0) {
//                return null;
//            }
//            temp = temp.getChild(0);
//        }
    }

    public Token getEndToken() {
        ParseTree temp = rule;
        if (temp instanceof ParserRuleContext) {
            return ((ParserRuleContext) temp).getStop();
        }
        return null;
    }

    private int a = -1;
    private int b = -1;

    public int a() {
        if (a != -1) {
            return a;
        }
        Token fistToken = getFistToken();
        if (fistToken == null) {
            return 0;
        }
        return a = fistToken.getStartIndex();
    }

    public int b() {
        if (b != -1) {
            return b;
        }
        Token endToken = getEndToken();
        if (endToken == null) {
            return 0;
        }
        b = endToken.getStopIndex();
        if (b < a()) {
            b = a();
        }
        return b;
    }

    public boolean contains(int pos) {
        if (pos > a() && pos <= b() + 1) {
            return true;
        }
        return false;
    }

    public Node cursorNode(int pos) {
        if (!contains(pos)) {
            return null;
        }
        if (children != null && children.size() != 0) {
            for (int i = children.size() - 1; i >= 0; i--) {
                Node child = children.get(i);
                Node node = child.cursorNode(pos);
                if (node != null) {
                    return node;
                }
            }
        }
        return this;
    }

    public boolean isRoot() {
        return parent == null;
    }

    public <E> List<E> searchNodes(int ruleIndex) {
        List<E> a = new ArrayList<>();
        if (children != null) {
            for (Node child : children) {
                if (child.ruleIndex == ruleIndex) {
                    a.add((E) child);
                }
            }
        }
        return a;
    }

    /**
     * 祖先
     *
     * @param ruleIndex
     * @param <E>
     * @return
     */
    public <E> E searchAncestor(int ruleIndex) {
        if (parent == null) {
            return null;
        }
        if (parent.ruleIndex == ruleIndex) {
            return (E) parent;
        }
        return (E) parent.searchAncestor(ruleIndex);
    }

    public <E> E searchAncestor(int ruleIndex, int depth) {
        if (parent == null) {
            return null;
        }
        if (parent.ruleIndex == ruleIndex && depth == 1) {
            return (E) parent;
        }
        return (E) parent.searchAncestor(ruleIndex, depth - 1);
    }

    public <E> E searchAncestor(int ruleIndex, int minDepth, int maxDepth) {
        if (parent == null) {
            return null;
        }
        if (parent.ruleIndex == ruleIndex && 1 >= maxDepth && 1 <= maxDepth) {
            return (E) parent;
        }
        return (E) parent.searchAncestor(ruleIndex, minDepth - 1, maxDepth - 1);
    }

    public boolean hasAncestor(int ruleIndex) {
        return searchAncestor(ruleIndex) != null;
    }

    public boolean hasAncestor(int ruleIndex, int depth) {
        return searchAncestor(ruleIndex, depth) != null;
    }

    public boolean hasAncestor(Node node) {
        if (a() < node.a()) {
            return false;
        }
        if (b() > node.b()) {
            return false;
        }
        return true;
    }

    public boolean hasAncestor(int ruleIndex, int minDepth, int maxDepth) {
        return searchAncestor(ruleIndex, minDepth, maxDepth) != null;
    }

    public boolean contains(Node node) {
        if (node == null) {
            return false;
        }
        if (a() > node.a()) {
            return false;
        }
        if (b() < node.b()) {
            return false;
        }
        return true;
    }

    public <E> E searchDescendant(int ruleIndex) {
        List<E> nodes = searchDescendants(ruleIndex);
        if (nodes == null || nodes.size() == 0) {
            return null;
        }
        return (E) nodes.get(0);
    }

    public <E> E searchDescendant(int ruleIndex, int depth) {
        List<E> nodes = searchDescendants(ruleIndex, depth);
        if (nodes == null || nodes.size() == 0) {
            return null;
        }
        return nodes.get(0);
    }

    public <E> E searchDescendant(int ruleIndex, int minDepth, int maxDepth) {
        List<E> nodes = searchDescendants(ruleIndex, minDepth, maxDepth);
        if (nodes == null || nodes.size() == 0) {
            return null;
        }
        return nodes.get(0);
    }

    /**
     * 子孙
     *
     * @param ruleIndex
     * @param <E>
     * @return
     */
    public <E> List<E> searchDescendants(int ruleIndex) {
        List<E> a = new ArrayList<>();
        if (children != null) {
            for (Node child : children) {
                if (child.ruleIndex == ruleIndex) {
                    a.add((E) child);
                }
                List list = child.searchDescendants(ruleIndex);
                if (list != null) {
                    a.addAll(list);
                }
            }
        }
        return a;
    }

    /**
     * 子孙限制深度
     *
     * @param ruleIndex
     * @param depth
     * @param <E>
     * @return
     */
    public <E> List<E> searchDescendants(int ruleIndex, int depth) {
        List<E> a = new ArrayList<>();
        if (depth <= 0) {
            return a;
        }
        if (children != null) {
            for (Node child : children) {
                if (depth == 1 && child.ruleIndex == ruleIndex) {
                    a.add((E) child);
                }
                a.addAll(child.searchDescendants(ruleIndex, depth - 1));
            }
        }
        return a;
    }

    public <E> List<E> searchDescendants(int ruleIndex, int minDepth, int maxDepth) {
        List<E> a = new ArrayList<>();
        if (children != null && 1 >= minDepth && 1 <= maxDepth) {
            for (Node child : children) {
                if (child.ruleIndex == ruleIndex) {
                    a.add((E) child);
                }
                a.addAll(child.searchDescendants(ruleIndex, minDepth - 1, maxDepth - 1));
            }
        }
        return a;
    }


    public <E extends Node> E getRootNode() {
        if (parent == null) {
            return (E) this;
        }
        return (E) parent.getRootNode();
    }

    public static Node create(int ruleIndex, Node parent) {
        if (typeMap.containsKey(ruleIndex)) {
            try {
                Constructor constructor = typeMap.get(ruleIndex).getConstructor(Node.class, int.class);
                return (Node) constructor.newInstance(parent, ruleIndex);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new Node(parent, ruleIndex);
    }

    public TipModel generateTip() {
        return null;
    }

    @Override
    public String toString() {
        if (rule != null) {
            try {
                return GroovyParser.ruleNames[ruleIndex] + "[" + a() + "," + b() + "]" + ":" + rule.getText().replace("\n", "\\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "error ruleIndex:" + ruleIndex;
    }

    public String searchRuleText(int ruleIndex, int depth) {
        Node node = searchDescendant(ruleIndex, depth);
        if (node != null) {
            return node.getText();
        }
        return null;
    }

    public String searchRuleText(int ruleIndex) {
        Node node = searchDescendant(ruleIndex);
        if (node != null) {
            return node.getText();
        }
        return null;
    }

    public List<String> searchRuleTexts(int ruleIndex, int depth) {
        List<String> ret = new ArrayList<>();
        List<Node> nodes = searchDescendants(ruleIndex, depth);
        for (Node node : nodes) {
            if (node != null) {
                ret.add(node.getText());
            }
        }
        return ret;
    }

    public List<String> searchRuleTexts(int ruleIndex) {
        List<String> ret = new ArrayList<>();
        List<Node> nodes = searchDescendants(ruleIndex);
        for (Node node : nodes) {
            if (node != null) {
                ret.add(node.getText());
            }
        }
        return ret;
    }

    /**
     * 判断节点作用域是否在root中
     *
     * @return
     */
    public boolean inRoot() {
        //属于类，则不属于root
        if (hasAncestor(GroovyParser.RULE_classDeclaration)) {
            return false;
        }
        return true;
    }

    private List<VariableInfo> treeVariableInfos;

    /**
     * 往上搜索局部变量
     *
     * @return
     */
    public List<VariableInfo> searchTreeVariables() {
        if (treeVariableInfos == null) {
            treeVariableInfos = new ArrayList<>();
            if (ruleIndex == GroovyParser.RULE_classDeclaration) {
                return treeVariableInfos;
            }
            if (ruleIndex == GroovyParser.RULE_methodDeclaration) {
                //将参数变量也解析
                List<Node> parameters = searchDescendants(GroovyParser.RULE_formalParameter);
                for (Node parameter : parameters) {
                    treeVariableInfos.addAll(generateVariables(parameter));
                }
                return treeVariableInfos;
            }

            if (ruleIndex == GroovyParser.RULE_statements || ruleIndex == GroovyParser.RULE_blockStatements) {
                List<Node> list = searchDescendants(GroovyParser.RULE_variableDeclaration, 3);
                for (Node node : list) {
                    treeVariableInfos.addAll(generateVariables(node));
                }
            }
            if (parent != null) {
                treeVariableInfos.addAll(parent.searchTreeVariables());
            }
        }
        return treeVariableInfos;
    }

    public VariableInfo searchTreeVariable(String name) {
        for (VariableInfo variableInfo : searchTreeVariables()) {
            if (variableInfo.name.equals(name)) {
                return variableInfo;
            }
        }
        return null;
    }

    private List<VariableInfo> generateVariables(Node variableNode) {
        List<VariableInfo> ret = new ArrayList<>();
        String type = variableNode.searchRuleText(GroovyParser.RULE_qualifiedClassName);
        List<String> names = variableNode.searchRuleTexts(GroovyParser.RULE_variableDeclaratorId);
        for (String name : names) {
            ret.add(new VariableInfo(searchType(type), name));
        }
        return ret;
    }

    private List<MethodInfo> treeMethodInfos;

    public List<MethodInfo> searchTreeMethods() {
        if (treeMethodInfos == null) {
            treeMethodInfos = new ArrayList<>();

            //如果深度为3以内，则说明在root中
            if (depth < 3) {
                return treeMethodInfos;
            }
            List<MethodNode> list = searchDescendants(GroovyParser.RULE_methodDeclaration, 3);
            for (MethodNode methodNode : list) {
                treeMethodInfos.add(methodNode.getMethodInfo());
            }
            if (parent != null) {
                treeMethodInfos.addAll(parent.searchTreeMethods());
            }
        }

        return treeMethodInfos;
    }

    public MethodInfo searchTreeMethod(String name) {
        List<MethodInfo> methodInfos = GroovyTips.searchCursorMethods(this);
        for (MethodInfo methodInfo : methodInfos) {
            if (methodInfo.methodName.equals(name)) {
                return methodInfo;
            }
        }
        return null;
    }

    private List<FieldInfo> treeFieldInfos;

    public List<FieldInfo> searchTreeFields() {
        if (treeFieldInfos == null) {
            treeFieldInfos = new ArrayList<>();
            //如果深度为3以内，则说明在root中
            if (depth < 3) {
                return treeFieldInfos;
            }
            List<FieldNode> list = searchDescendants(GroovyParser.RULE_fieldDeclaration, 3);
            for (FieldNode methodNode : list) {
                treeFieldInfos.addAll(methodNode.getFieldInfos());
            }
            if (parent != null) {
                treeFieldInfos.addAll(parent.searchTreeFields());
            }
        }

        return treeFieldInfos;
    }

    /**
     * 搜索当前位置能获取的成员变量field
     *
     * @param name
     * @return
     */
    public FieldInfo searchTreeField(String name) {
        List<FieldInfo> fieldInfos = GroovyTips.searchCursorFields(this);
        for (FieldInfo fieldInfo : fieldInfos) {
            if (fieldInfo.getFieldName().equals(name)) {
                return fieldInfo;
            }
        }
        return null;
    }


    public ClassInfo searchType(String name) {
        if (name == null) {
            return ClassInfo.OBJECT;
        }
        RootNode rootNode = getRootNode();
        rootNode.getClassInfos();
        //从编译环境搜索
        ClassInfo classInfo = ClassInfo.forName(name);
        if (classInfo != null) {
            return classInfo;
        }
        //从java.lang中搜索
        classInfo = ClassInfo.forName("java.lang." + name);
        if (classInfo != null) {
            return classInfo;
        }
        //import
        classInfo = rootNode.searchImportClass(name);
        if (classInfo != null) {
            return classInfo;
        }
        //带上包名搜索
        if (rootNode.getPkg() != null) {
            classInfo = ClassInfo.forName(rootNode.getPkg() + "." + name);
            if (classInfo != null) {
                return classInfo;
            }
        }

        return new ClassInfo(Object.class);
    }
}
