package com.jsdroid.groovy.node;

import com.jsdroid.groovy.antlr4.parser.GroovyParser;
import com.jsdroid.groovy.info.ClassInfo;
import com.jsdroid.groovy.info.ImportInfo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RootNode extends Node<GroovyParser.RootContext> {
    public File file;

    public RootNode(Node parent, int ruleIndex) {
        super(parent, ruleIndex);
    }

    private String pkg;

    public String getPkg() {
        if (pkg == null) {
            PkgNode node = searchNode(Node.PKG);
            if (node != null) {
                pkg = node.pkg;
            }
        }

        return pkg;
    }

    private List<ImportInfo> importInfos;

    public List<ImportInfo> getImports() {
        if (importInfos == null) {
            importInfos = new ArrayList<>();
            List<ImportNode> importNodes = searchDescendants(Node.IMPORT);
            if (importNodes != null) {
                for (ImportNode importNode : importNodes) {
                    ImportInfo importInfo = importNode.getImportInfo();
                    if (importInfo != null) {
                        importInfos.add(importInfo);
                    }
                }
            }
        }
        return importInfos;
    }

    public ClassInfo searchImportClass(String name) {
        ClassInfo classInfo;
        List<ImportInfo> imports = getImports();
        if (imports != null) {
            for (ImportInfo anImport : imports) {
                if (anImport.qualifiedName.endsWith(name)
                        || (anImport.alias != null && anImport.alias.equals(name))) {
                    //import xxx.xxx;
                    //import xxx.xxx as XXX;
                    classInfo = ClassInfo.forName(anImport.qualifiedName);
                    if (classInfo != null) {
                        return classInfo;
                    }
                } else if (anImport.MUL) { //import xxx.xxx.*;
                    classInfo = ClassInfo.forName(anImport.qualifiedName + "." + name);
                    if (classInfo != null) {
                        return classInfo;
                    }
                }
            }
        }
        return null;

    }


    public ClassInfo searchSourceClassInfo(String name) {
        ClassInfo classInfo = ClassInfoMap.getInstance().searchClassInfo(name);
        if (classInfo == null) {
            classInfo = ClassInfoMap.getInstance().searchClassInfo(getPkg() + "." + name);
        }
        if (classInfo == null) {
            for (ImportInfo importInfo : getImports()) {
                String qualifiedName = importInfo.qualifiedName;
                if (importInfo.qualifiedName.endsWith(name)) {
                    classInfo = ClassInfoMap.getInstance().searchClassInfo(qualifiedName);
                    if (classInfo != null) {
                        return classInfo;
                    }
                }
            }
        }
        return classInfo;
    }

    public ClassInfo searchClassInfo(String name) {
        ClassInfo classInfo = searchSourceClassInfo(name);
        if (classInfo != null) {
            return classInfo;
        }
        return searchInnerClassInfo(name);
    }

    public ClassInfo searchInnerClassInfo(String name) {
        try {
            return new ClassInfo(Class.forName(name));
        } catch (Throwable e) {
        }
        try {
            return new ClassInfo(Class.forName(getPkg() + "." + name));
        } catch (Throwable e) {
        }
        try {
            for (ImportInfo importInfo : getImports()) {
                String qualifiedName = importInfo.qualifiedName;
                if (importInfo.qualifiedName.endsWith("." + name)) {
                    return new ClassInfo(Class.forName(qualifiedName));
                }
            }
        } catch (Throwable e) {
        }
        return null;
    }

    public List<ClassInfo> getClassInfos() {
        List<ClassNode> classes = getClasses();
        if (classes == null) {
            return new ArrayList<>();
        }
        List<ClassInfo> infos = new ArrayList<>();
        for (ClassNode aClass : classes) {
            infos.add(aClass.getClassInfo());
        }
        return infos;
    }

    List<ClassNode> getClasses() {
        return searchDescendants(Node.CLASS);
    }

    List<FieldNode> getFields() {
        return searchNodes(Node.FIELD);
    }

    List<MethodNode> getMethods() {
        return searchNodes(Node.METHOD);
    }

    @Override
    public void visit(GroovyParser.RootContext ctx) {
        super.visit(ctx);
    }
}
