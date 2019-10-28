package com.jsdroid.groovy;


import android.util.Log;

import com.android.dx.dex.DexOptions;
import com.android.dx.dex.cf.CfOptions;
import com.android.dx.dex.cf.CfTranslator;
import com.android.dx.dex.code.PositionList;
import com.android.dx.dex.file.ClassDefItem;
import com.android.dx.dex.file.DexFile;

import org.apache.commons.io.FileUtils;
import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.control.BytecodeProcessor;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.UUID;

import dalvik.system.DexClassLoader;
import groovy.lang.Script;

public class JsdDexProcessor implements BytecodeProcessor {
    private DexFile dexFile;
    private final DexOptions dexOptions;
    private final CfOptions cfOptions;
    private ArrayList<String> classNames;
    private ClassLoader classLoader;

    public JsdDexProcessor(ClassLoader classLoader) {
        this.classLoader = classLoader;
        dexOptions = new DexOptions();
        dexFile = new DexFile(dexOptions);
        cfOptions = new CfOptions();
        classNames = new ArrayList<>();
        config();
    }

    private void config() {
        dexOptions.targetApiLevel = 13;
        cfOptions.positionInfo = PositionList.LINES;
        cfOptions.localInfo = true;
        cfOptions.strictNameCheck = true;
        cfOptions.optimize = false;
        cfOptions.optimizeListFile = null;
        cfOptions.dontOptimizeListFile = null;
        cfOptions.statistics = false;
    }

    @Override
    public byte[] processBytecode(ClassNode classNode, byte[] bytes) {
        String pkgName = classNode.getPackageName();
        String className = classNode.getName();
        String filePath;
        if (pkgName != null) {
            classNode.getPackageName().replace(".", "/");
            pkgName = pkgName.replace(".", "/");
            className = className.substring(pkgName.length() + 1);
            filePath = pkgName + "/" + className + ".class";
        } else {
            filePath = className + ".class";
        }
        ClassDefItem classDefItem = CfTranslator.translate(filePath, bytes, cfOptions, dexOptions);
        dexFile.add(classDefItem);
        classNames.add(classNode.getName());
        return bytes;
    }

    public void writeDexToFile(OutputStream outputStream) throws IOException {
        try {
            dexFile.writeTo(outputStream, new OutputStreamWriter(new ByteArrayOutputStream()), false);
        } finally {
            outputStream.close();
        }
    }
}