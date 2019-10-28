package com.jsdroid.script;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.jsdroid.commons.FileUtil;
import com.jsdroid.commons.ZipUtil;
import com.jsdroid.shell.JsDroidApp;
import com.jsdroid.shell.util.FilePermissions;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * 安装脚本到/data/data/[pkg]/script
 * <p>
 * 读取文件的包名pkg、名字name、版本version、简介note、类型type
 * 创建文件夹/data/data/[pkg]/script/[scriptPkg]
 * 将文件夹/data/data/[pkg]/script/[scriptPkg]设为可读写
 * 将文件复制到/data/data/[pkg]/script/[scriptPkg]/base.apk
 * 将文件解压到/data/data/[pkg]/script/[scriptPkg]/
 */
public class ScriptInstaller {
    private Context context;
    private File appDir;
    private File scriptDir;


    public ScriptInstaller(Context context) {
        this.context = context;
        //appDir = new File(context.getFilesDir(), "/..");
        appDir = new File("/data/data/" + JsDroidApp.getInstance().getApplication().getPackageName());
        Log.d("nmsl", "ScriptInstaller: "+appDir);
        scriptDir = new File(appDir, "script");
    }

    private String getJsonString(JSONObject object, String key) throws JSONException {
        if (object.has(key)) {
            return object.getString(key);
        }
        return null;
    }

    /**
     * 安装脚本到/data/data/[pkg]/script
     * <p>
     * 读取文件的包名pkg、名字name、版本version、简介note、类型type
     * 创建文件夹/data/data/[pkg]/script/[scriptPkg]
     * 将文件夹/data/data/[pkg]/script/[scriptPkg]设为可读写
     * 将文件复制到/data/data/[pkg]/script/[scriptPkg]/base.apk
     * 将文件解压到/data/data/[pkg]/script/[scriptPkg]/
     */
    public ScriptInfo install(String file) throws InstallException, IOException, JSONException {
        ScriptInfo scriptInfo = readScriptInfo(file);
        if (scriptInfo.getPkg() == null) {
            throw new InstallException("包名不存在，安装错误！");
        }
        if (scriptInfo.getName() == null) {
            throw new InstallException("名字不存在，安装错误！");
        }
        if (scriptInfo.getVersion() == null) {
            throw new InstallException("版本不存在，安装错误！");
        }
        File currentDir = new File(scriptDir, scriptInfo.getPkg());
        currentDir.mkdir();
        FileUtil.copyFile(new File(file), new File(currentDir, "base.apk"));
        ZipUtil.unzipFile(file, currentDir.getPath());
        new File(currentDir, "opt_dex").mkdir();
        FilePermissions.openExecutables(currentDir);
        return scriptInfo;
    }

    @NonNull
    public ScriptInfo readScriptInfo(String file) throws IOException, JSONException {
        String config = readConfig(file);
        ScriptInfo scriptInfo = new ScriptInfo();
        JSONObject jsonObject = new JSONObject(config);
        String name = getJsonString(jsonObject, "name");
        String pkg = getJsonString(jsonObject, "pkg");
        String version = getJsonString(jsonObject, "version");
        scriptInfo.setName(name);
        scriptInfo.setPkg(pkg);
        scriptInfo.setVersion(version);
        scriptInfo.setNote(getJsonString(jsonObject, "note"));
        scriptInfo.setType(getJsonString(jsonObject, "type"));

        return scriptInfo;
    }

    private String readConfig(String file) throws IOException {
        String config = null;
        FileInputStream fileInputStream = new FileInputStream(file);
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                break;
            }
            String name = new File(nextEntry.getName()).getName();
            if (name.equals("config.json")) {
                config = readStream(zipInputStream);
                break;
            }
        }
        zipInputStream.close();
        fileInputStream.close();
        return config;
    }

    private String readStream(ZipInputStream zipInputStream) throws IOException {
        byte[] buff = new byte[1024];
        ByteArrayOutputStream cache = new ByteArrayOutputStream();
        for (; ; ) {
            int readLen = zipInputStream.read(buff);
            if (readLen < 0) {
                break;
            }
            cache.write(buff, 0, readLen);
        }
        return cache.toString("utf-8");
    }

    public File getScriptDir() {
        return scriptDir;
    }

    public String getScriptInstallDir(String pkg) {
        return new File(scriptDir, pkg).getAbsolutePath();
    }

    public String getScriptFile(String scriptPkg) {
        return new File(getScriptInstallDir(scriptPkg), "base.apk").getAbsolutePath();
    }

    public static class InstallException extends Exception {
        public InstallException() {
        }

        public InstallException(String message) {
            super(message);
        }

        public InstallException(String message, Throwable cause) {
            super(message, cause);
        }

        public InstallException(Throwable cause) {
            super(cause);
        }

    }
}
