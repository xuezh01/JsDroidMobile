package com.jsdroid.groovy;

import android.content.Context;
import android.util.Log;

import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.control.CompilationFailedException;
import org.codehaus.groovy.control.CompilationUnit;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.control.ProcessingUnit;
import org.codehaus.groovy.control.SourceUnit;

import java.io.File;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedAction;

import groovy.lang.GroovyClassLoader;
import groovy.lang.Script;
import groovyjarjarasm.asm.ClassVisitor;
import groovyjarjarasm.asm.ClassWriter;

public class JsdClassLoader extends GroovyClassLoader {

    private static final String TAG = JsDroidShell.JGroovyClassLoader.class.getName();
    private static ClassPath classPath = new ClassPath();

    public static void addJar(Context context, String jarFile) {
        try {
            classPath.addJar(context, jarFile);
        } catch (Exception e) {
            Log.d("woaini", "addJar: ", e);
        }
    }

    public JsdClassLoader() {
    }

    public JsdClassLoader(ClassLoader loader) {
        super(loader);
    }

    public JsdClassLoader(GroovyClassLoader parent) {
        super(parent);
    }

    public JsdClassLoader(ClassLoader parent, CompilerConfiguration config, boolean useConfigurationClasspath) {
        super(parent, config, useConfigurationClasspath);
    }

    public JsdClassLoader(ClassLoader loader, CompilerConfiguration config) {
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
        }
        return classPath.loadClass(name);
    }

    @Override
    public Class loadClass(String name, boolean lookupScriptFiles, boolean preferClassOverScript) throws ClassNotFoundException, CompilationFailedException {
        try {
            return super.loadClass(name, lookupScriptFiles, preferClassOverScript);
        } catch (Throwable e) {
        }
        return classPath.loadClass(name);
    }

    @Override
    protected Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
        try {
            return super.loadClass(name, resolve);
        } catch (Throwable e) {
        }
        return classPath.loadClass(name);
    }

    private String sourceDirs[];

    @Override
    protected void addSource(CompilationUnit unit) {
        super.addSource(unit);
        if (classgenCallback != null) {
            unit.setClassgenCallback(classgenCallback);
        }
        if (sourceDirs != null) {
            for (String dir : sourceDirs) {
                scanSource(unit, new File(dir));
            }
        }
    }


    private CompilationUnit.ClassgenCallback classgenCallback;

    public void setClassgenCallback(CompilationUnit.ClassgenCallback classgenCallback) {
        this.classgenCallback = classgenCallback;
    }

    public void setSourceDirs(String[] sourceDirs) {
        this.sourceDirs = sourceDirs;
    }

    private static void scanSource(CompilationUnit unit, File file) {
        if (file == null) {
            return;
        }
        if (!file.exists()) {
            return;
        }
        if (file.isFile()) {
            if (file.getName().endsWith(".groovy")) {
                unit.addSource(file);
            }
        } else {
            File[] files = file.listFiles();
            if (files != null) {
                for (File child : files) {
                    scanSource(unit, child);
                }
            }
        }
    }

    @Override
    protected GroovyClassLoader.ClassCollector createCollector(CompilationUnit unit, SourceUnit su) {
        GroovyClassLoader.InnerLoader loader = AccessController.doPrivileged(new PrivilegedAction<GroovyClassLoader.InnerLoader>() {
            public GroovyClassLoader.InnerLoader run() {
                return new GroovyClassLoader.InnerLoader(JsdClassLoader.this);
            }
        });
        return new GroovyClassLoader.ClassCollector(loader, unit, su) {
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
