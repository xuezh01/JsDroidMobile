package com.jsdroid.groovy.node;

import com.jsdroid.groovy.antlr4.parser.GroovyParser;
import com.jsdroid.groovy.info.ClassInfo;
import com.jsdroid.groovy.info.FieldInfo;
import com.jsdroid.groovy.info.ImportInfo;
import com.jsdroid.groovy.info.MethodInfo;
import com.jsdroid.groovy.tip.TipModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取成员变量、方法
 */
public class ClassNode extends Node<GroovyParser.ClassDeclarationContext> {

    private ClassInfo extendsClass;
    private List<ClassInfo> implementsClasses;

    public ClassNode(Node parent, int ruleIndex) {
        super(parent, ruleIndex);
    }

    private TipModel tipModel;
    private ClassInfo classInfo;

    @Override
    public TipModel generateTip() {
        if (tipModel == null) {
            tipModel = new TipModel.ClassTipModel(getClassInfo());
        }
        return tipModel;
    }


    public ClassInfo getClassInfo() {
        if (classInfo == null) {
            RootNode root = getRootNode();
            classInfo = new ClassInfo();
            ClassInfoMap.getInstance().putClassInfo(root.file.getPath(), classInfo);
            classInfo.pkg = root.getPkg();
            classInfo.simpleName = getClassName();
            classInfo.extendsClass = getExtendsClass();
            classInfo.implementsClasses = getImplementsClasses();
            classInfo.fields = getFields();
            classInfo.methods = getMethods();
        }
        return classInfo;
    }

    public String getClassName() {
        GroovyParser.IdentifierContext identifier = rule.identifier();
        if (identifier != null) {
            return identifier.getText();
        }
        return null;
    }


    @Override
    public void visit(GroovyParser.ClassDeclarationContext ctx) {
        super.visit(ctx);

    }

    List<MethodNode> getMethodNodes() {
        return searchDescendants(Node.METHOD, 4);
    }

    List<FieldNode> getFieldNodes() {
        return searchDescendants(Node.FIELD, 4);
    }

    public List<MethodInfo> getMethods() {
        List<MethodInfo> methodInfos = new ArrayList<>();
        List<MethodNode> methodNodes = getMethodNodes();
        if (methodNodes != null) {
            for (MethodNode methodNode : methodNodes) {
                MethodInfo methodInfo = methodNode.getMethodInfo();
                if (methodInfo != null) {
                    methodInfos.add(methodInfo);
                }
            }
        }
        return methodInfos;
    }

    public List<FieldInfo> getFields() {
        List<FieldInfo> fieldInfos = new ArrayList<>();
        List<FieldNode> fieldNodes = getFieldNodes();
        if (fieldNodes != null) {
            for (FieldNode fieldNode : fieldNodes) {
                List<FieldInfo> infos = fieldNode.getFieldInfos();
                if (infos != null) {
                    fieldInfos.addAll(infos);
                }
            }
        }
        return fieldInfos;
    }

    public ClassInfo getExtendsClass() {
        if (extendsClass == null) {
            String type = searchRuleText(GroovyParser.RULE_type, 1);
            if (type == null) {
                return null;
            }
            RootNode rootNode = getRootNode();
            extendsClass = rootNode.searchClassInfo(type);
        }
        return extendsClass;
    }

    public List<ClassInfo> getImplementsClasses() {
        if (implementsClasses == null) {
            implementsClasses = new ArrayList<>();
            List<Node> nodes = searchDescendants(GroovyParser.RULE_type, 2);
            if (nodes == null || nodes.size() == 0) {
                return implementsClasses;
            }
            for (Node node : nodes) {
                RootNode rootNode = getRootNode();
                ClassInfo classInfo = rootNode.searchClassInfo(node.getText());
                if (classInfo != null) {
                    implementsClasses.add(classInfo);
                }
            }
        }
        return implementsClasses;
    }
}
