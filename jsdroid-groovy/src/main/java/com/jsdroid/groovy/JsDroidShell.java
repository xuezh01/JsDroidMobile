package com.jsdroid.groovy;

import com.android.dx.dex.DexOptions;
import com.android.dx.dex.cf.CfOptions;
import com.android.dx.dex.cf.CfTranslator;
import com.android.dx.dex.code.PositionList;
import com.android.dx.dex.file.ClassDefItem;
import com.android.dx.dex.file.DexFile;

import org.apache.commons.io.FileUtils;
import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.control.BytecodeProcessor;
import org.codehaus.groovy.control.CompilationFailedException;
import org.codehaus.groovy.control.CompilationUnit;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.control.SourceUnit;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.UUID;

import dalvik.system.DexClassLoader;
import groovy.lang.GroovyClassLoader;
import groovy.lang.Script;
import groovyjarjarasm.asm.ClassWriter;

public class JsDroidShell {

    private Class scriptClass;
    private String groovyTmpDexDir;
    private String groovyOptDexDir;

    public JsDroidShell(Class scriptClass, String groovyTmpDexDir, String groovyOptDexDir) {
        this.scriptClass = scriptClass;
        this.groovyTmpDexDir = groovyTmpDexDir;
        this.groovyOptDexDir = groovyOptDexDir;
    }


    public Script buildScript(String sourceText, String sourceName) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        return buildScript(sourceText, sourceName, null);
    }

    public Script buildScript(String sourceText, String sourceName, final Script parent) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        CompilerConfiguration configuration = new CompilerConfiguration();
        if (scriptClass != null) {
            configuration.setScriptBaseClass(scriptClass.getName());
        }
        ClassLoader classLoader;
        if (parent == null) {
            classLoader = JsDroidShell.class.getClassLoader();
        } else {
            classLoader = parent.getClass().getClassLoader();
        }
        DexProcessor dexProcessor = new DexProcessor(classLoader);
        configuration.setBytecodePostprocessor(dexProcessor);
        final GroovyClassLoader groovyClassLoader = new JGroovyClassLoader(classLoader, configuration);
        try {
            groovyClassLoader.parseClass(sourceText, sourceName);
        } catch (Throwable e) {
        }
        Script script = dexProcessor.createScript(groovyTmpDexDir, groovyOptDexDir);
        if (parent != null) {
            script.setBinding(parent.getBinding());
        }
        return script;
    }

    public Script buildScript(File sourceFile, Script parent) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        return buildScript(FileUtils.readFileToString(sourceFile), sourceFile.getPath(), parent);
    }

    public Script buildScript(File sourceFile) throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        return buildScript(sourceFile, null);
    }

    public static class JGroovyClassLoader extends GroovyClassLoader {

        private static final String TAG = JGroovyClassLoader.class.getName();

        public JGroovyClassLoader() {
        }

        public JGroovyClassLoader(ClassLoader loader) {
            super(loader);
        }

        public JGroovyClassLoader(GroovyClassLoader parent) {
            super(parent);
        }

        public JGroovyClassLoader(ClassLoader parent, CompilerConfiguration config, boolean useConfigurationClasspath) {
            super(parent, config, useConfigurationClasspath);
        }

        public JGroovyClassLoader(ClassLoader loader, CompilerConfiguration config) {
            super(loader, config);
        }

        @Override
        public Class<?> loadClass(String name) throws ClassNotFoundException {
            return super.loadClass(name);
        }

        @Override
        public Class loadClass(String name, boolean lookupScriptFiles, boolean preferClassOverScript, boolean resolve) throws ClassNotFoundException, CompilationFailedException {
            try {
                return super.loadClass(name, lookupScriptFiles, preferClassOverScript, resolve);
            } catch (Throwable e) {
                throw new ClassNotFoundException();
            }
        }

        @Override
        public Class loadClass(String name, boolean lookupScriptFiles, boolean preferClassOverScript) throws ClassNotFoundException, CompilationFailedException {
            try {
                return super.loadClass(name, lookupScriptFiles, preferClassOverScript);
            } catch (Throwable e) {
                throw new ClassNotFoundException();
            }
        }

        @Override
        protected Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
            try {
                return super.loadClass(name, resolve);
            } catch (Throwable e) {
                throw new ClassNotFoundException();
            }
        }


        @Override
        protected ClassCollector createCollector(CompilationUnit unit, SourceUnit su) {
            InnerLoader loader = AccessController.doPrivileged(new PrivilegedAction<InnerLoader>() {
                public InnerLoader run() {
                    return new InnerLoader(JGroovyClassLoader.this);
                }
            });
            return new ClassCollector(loader, unit, su) {
                @Override
                protected Class onClassNode(ClassWriter classWriter, ClassNode classNode) {
                    try {
                        Class result = super.onClassNode(classWriter, classNode);
                        return result;
                    } catch (Exception e) {
                    }

                    return null;
                }
            };
        }
    }

    public static class DexProcessor implements BytecodeProcessor {
        private DexFile dexFile;
        private final DexOptions dexOptions;
        private final CfOptions cfOptions;
        private ArrayList<String> classNames;
        private ClassLoader classLoader;

        public DexProcessor(ClassLoader classLoader) {
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

        public Script createScript(String groovyCodeTmpDir, String groovyOptDexCachePath) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
            File tmpDex = new File(groovyCodeTmpDir, UUID.randomUUID() + ".dex");
            byte[] bytes = dexFile.toDex(new OutputStreamWriter(new ByteArrayOutputStream()), false);
            FileUtils.writeByteArrayToFile(tmpDex, bytes);
            try {
                Class scriptClass = null;
                ScriptClassLoader loader = new ScriptClassLoader(tmpDex.getPath(), groovyOptDexCachePath,
                        null,
                        classLoader);
                for (String className : classNames) {
                    Class<?> aClass = loader.loadClass(className);
                    if (Script.class.isAssignableFrom(aClass)) {
                        scriptClass = aClass;
                    }
                }
                if (scriptClass != null) {
                    return (Script) scriptClass.newInstance();
                }
                return null;
            } finally {
                tmpDex.delete();
                //删除缓存文件
                new File(groovyOptDexCachePath, tmpDex.getName()).delete();
            }
        }

        public byte[] getDexBytes() throws IOException {
            byte[] bytes = dexFile.toDex(new OutputStreamWriter(new ByteArrayOutputStream()), false);
            return bytes;
        }

        public void writeDexToFile(OutputStream outputStream) throws IOException {
            dexFile.writeTo(outputStream, new OutputStreamWriter(new ByteArrayOutputStream()), false);
        }
    }

}
