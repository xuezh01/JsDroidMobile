package com.jsdroid.script.builder;

import android.util.Log;

import com.jsdroid.api.context.JsdContext;
import com.jsdroid.commons.FileUtil;
import com.jsdroid.groovy.JsDroidShell;
import com.jsdroid.groovy.ScriptClassLoader;
import com.jsdroid.script.JsDroidScript;
import com.jsdroid.server2_5.JsdPath2_5;

import java.io.File;
import java.io.IOException;

public abstract class JsdScriptBuilder {
    protected String code;
    protected String appPkg;
    protected String scriptDir;
    protected String scriptFile;
    protected String scriptOptDexDir;
    protected String scriptLibDir;


    public static class ApkBuilder extends JsdScriptBuilder {

        public ApkBuilder setAppPkg(String appPkg) {
            this.appPkg = appPkg;
            return this;
        }


        public ApkBuilder setScriptDir(String scriptDir) {
            this.scriptDir = scriptDir;
            return this;
        }

        public ApkBuilder setScriptOptDexDir(String scriptOptDexDir) {
            this.scriptOptDexDir = scriptOptDexDir;
            return this;
        }

        public ApkBuilder setScriptFile(String scriptFile) {
            this.scriptFile = scriptFile;
            return this;
        }

        public ApkBuilder setScriptLibDir(String scriptLibDir) {
            this.scriptLibDir = scriptLibDir;
            return this;
        }

        @Override
        public JsDroidScript build() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
            try {
                new File(scriptOptDexDir).delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
            ScriptClassLoader dexClassLoader = new ScriptClassLoader(scriptFile,
                    scriptOptDexDir,
                    scriptLibDir, JsdScriptBuilder.class.getClassLoader());
            Class<?> mainScript = dexClassLoader.loadClass("MainScript");
            JsDroidScript script = (JsDroidScript) mainScript.newInstance();
            script.setAppPkg(appPkg);
            script.setJsdContext(JsdContext.getInstance(appPkg));
            JsdContext.getInstance(appPkg).addDirectory(new File(scriptDir, "assets"));
            script.setScriptDir(scriptDir);
            return script;
        }
    }

    public static class GroovyCodeBuilder extends JsdScriptBuilder {

        public GroovyCodeBuilder setCode(String code) {
            this.code = code;
            return this;
        }


        public GroovyCodeBuilder setAppPkg(String appPkg) {
            this.appPkg = appPkg;
            return this;
        }
        public GroovyCodeBuilder setScriptDir(String scriptDir){
            this.scriptDir = scriptDir;
            return this;
        }

        @Override
        public JsDroidScript build() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {

            JsDroidShell jsDroidShell = new JsDroidShell(
                    JsDroidScript.class,
                    JsdPath2_5.getGroovyTmpDexDir().getAbsolutePath(),
                    JsdPath2_5.getGroovyOptDexCacheDir().getAbsolutePath()
            );
            JsDroidScript script = (JsDroidScript) jsDroidShell.buildScript(code, "script.groovy");
            script.setAppPkg(appPkg);
            script.setJsdContext(JsdContext.getInstance(appPkg));
            JsdContext.getInstance(appPkg).addDirectory(new File(scriptDir, "assets"));
            script.setScriptDir(scriptDir);
            return script;
        }
    }

    public static class GroovyFileBuilder extends JsdScriptBuilder {


        public GroovyFileBuilder setAppPkg(String appPkg) {
            this.appPkg = appPkg;
            return this;
        }


        public GroovyFileBuilder setScriptDir(String scriptDir) {
            this.scriptDir = scriptDir;
            return this;
        }


        public GroovyFileBuilder setScriptFile(String scriptFile) {
            this.scriptFile = scriptFile;
            return this;
        }

        @Override
        public JsDroidScript build() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {

            JsDroidShell jsDroidShell = new JsDroidShell(
                    JsDroidScript.class,
                    JsdPath2_5.getGroovyTmpDexDir().getAbsolutePath(),
                    JsdPath2_5.getGroovyOptDexCacheDir().getAbsolutePath()
            );
            JsDroidScript script = (JsDroidScript) jsDroidShell.buildScript(FileUtil.read(scriptFile), scriptFile);
            script.setAppPkg(appPkg);
            script.setJsdContext(JsdContext.getInstance(appPkg));
            JsdContext.getInstance(appPkg).addDirectory(new File(scriptDir, "assets"));
            script.setScriptDir(scriptDir);
            return script;
        }
    }

    public static class JsCodeBuilder extends JsdScriptBuilder {

        public JsCodeBuilder setCode(String code) {
            this.code = code;
            return this;
        }


        public JsCodeBuilder setAppPkg(String appPkg) {
            this.appPkg = appPkg;
            return this;
        }


        @Override
        public JsDroidScript build() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
            JsDroidScript script = new JsDroidScript() {
                @Override
                public Object run() {
                    return runJs(code);
                }
            };
            script.setAppPkg(appPkg);
            return script;
        }
    }

    public static class JsFileBuilder extends JsdScriptBuilder {


        public JsFileBuilder setAppPkg(String appPkg) {
            this.appPkg = appPkg;
            return this;
        }


        public JsFileBuilder setScriptFile(String scriptFile) {
            this.scriptFile = scriptFile;
            return this;
        }

        @Override
        public JsDroidScript build() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
            JsDroidScript script = new JsDroidScript() {
                @Override
                public Object run() {
                    return runJs(FileUtil.read(scriptFile));
                }
            };
            script.setAppPkg(appPkg);
            return script;
        }
    }

    public abstract JsDroidScript build() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException;
}
