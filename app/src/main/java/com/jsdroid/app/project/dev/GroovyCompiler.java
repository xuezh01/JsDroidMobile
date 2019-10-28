package com.jsdroid.app.project.dev;

import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.control.BytecodeProcessor;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.tools.FileSystemCompiler;

import groovy.lang.GroovyClassLoader;

public class GroovyCompiler {
    public void compile() {

        FileSystemCompiler f;
        CompilerConfiguration configuration = new CompilerConfiguration();
        configuration.setBytecodePostprocessor(new BytecodeProcessor() {
            @Override
            public byte[] processBytecode(ClassNode classNode, byte[] bytes) {
                return bytes;
            }
        });
        GroovyClassLoader groovyClassLoader = new GroovyClassLoader();

    }
}
