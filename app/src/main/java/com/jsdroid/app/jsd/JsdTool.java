package com.jsdroid.app.jsd;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jsdroid.app.dao.ToolDao;
import com.jsdroid.app.database.Db;
import com.jsdroid.app.entity.Tool;
import com.jsdroid.shell.JsDroidApp;
import com.jsdroid.active.JsdShell;
import com.jsdroid.script.ScriptInstaller;
import com.jsdroid.ui.ViewScript;

import net.lingala.zip4j.exception.ZipException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.greenrobot.greendao.query.QueryBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import dalvik.system.DexClassLoader;

public class JsdTool {


    public List<Tool> list() {
        return Db.getInstance().getDaoSession().getToolDao().loadAll();
    }

    public boolean hasInstall(String pkg, String version) {
        QueryBuilder<Tool> toolQueryBuilder = Db.getInstance().getDaoSession().getToolDao().queryBuilder();
        Tool unique = toolQueryBuilder.where(ToolDao.Properties.Pkg.eq(pkg), ToolDao.Properties.Version.eq(version)).build().unique();
        if (unique != null) {
            return true;
        }
        return false;
    }

    public interface JsdListener {
        void onToolChanged() throws Exception;
    }

    private static JsdTool instance = new JsdTool();

    public static JsdTool getInstance() {
        return instance;
    }

    private Map<String, DexClassLoader> classLoaderMap;

    private JsdTool() {
        classLoaderMap = new HashMap<>();
        jsdListeners = new ArrayList<>();
    }

    private final List<JsdListener> jsdListeners;

    public void addListener(JsdListener jsdListener) {
        synchronized (jsdListeners) {
            jsdListeners.add(jsdListener);
        }
    }

    public void removeListener(JsdListener jsdListener) {
        synchronized (jsdListeners) {
            jsdListeners.remove(jsdListener);
        }
    }

    protected void fireChanged() {
        Looper mainLooper = Looper.getMainLooper();
        Handler handler = new Handler(mainLooper);
        synchronized (jsdListeners) {
            for (JsdListener jsdListener : jsdListeners) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            jsdListener.onToolChanged();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }
        }
    }

    public DexClassLoader getClassLoader(String pkg) {
        DexClassLoader dexClassLoader = classLoaderMap.get(pkg);
        if (dexClassLoader == null) {
            return initClassLoader(pkg);
        }
        return dexClassLoader;
    }


    private DexClassLoader initClassLoader(String pkg) {
        ScriptInstaller scriptInstaller = JsdShell.getInstance().getScriptInstaller();
        String scriptInstallDir = scriptInstaller.getScriptInstallDir(pkg);
        //base.apk
        File apkFile = new File(scriptInstallDir, "base.apk");
        File optDir = new File(scriptInstallDir, "opt_dex");
        DexClassLoader dexClassLoader = new DexClassLoader(apkFile.getPath(), optDir.getPath(),
                getLibPath(scriptInstallDir), ViewScript.class.getClassLoader());
        classLoaderMap.put(pkg, dexClassLoader);
        return dexClassLoader;
    }


    /**
     * 文件结构如下
     * -lib
     * --x86
     * --arm
     * -assets
     * --用户文件
     * -config.json
     * -icon.png
     * -classes.dex
     *
     * @param apkFile
     * @throws IOException
     * @throws ZipException
     */
    //安装Jsd文件
    public Tool install(String apkFile) throws Exception {
        ToolDao toolDao = Db.getInstance().getDaoSession().getToolDao();
        Tool toolInfo = getToolInfo(apkFile);
        QueryBuilder<Tool> where = toolDao.queryBuilder().where(ToolDao.Properties.Pkg.eq(toolInfo.pkg));
        Tool find = null;
        try {
            find = where.build().unique();
        } catch (Exception e) {
        }
        if (find != null) {
            toolInfo.id = find.id;
        }
        JsDroidApp.getInstance().installScript(apkFile);
        String installDir = JsDroidApp.getInstance().getScriptInstallDir(toolInfo.pkg);
        toolInfo.icon = new File(installDir, "icon.png").getPath();
        initClassLoader(toolInfo.pkg);
        //保存
        toolDao.save(toolInfo);
        //通知更新
        fireChanged();
        return toolInfo;
    }

    /**
     * 卸载
     *
     * @param pkg
     * @throws IOException
     */
    public void uninstall(String pkg) throws Exception {
        ToolDao toolDao = Db.getInstance().getDaoSession().getToolDao();
        Tool tool = toolDao.queryBuilder().where(ToolDao.Properties.Pkg.eq(pkg)).build().unique();
        if (tool != null) {
            try {
                FileUtils.deleteDirectory(new File(getInstallDir(tool.pkg)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //删除加载器
        classLoaderMap.remove(tool.pkg);
        //删除数据
        toolDao.delete(tool);
        //通知更新
        fireChanged();
    }

    public String getInstallDir(String pkg) {
        return JsdShell.getInstance().getScriptInstaller().getScriptInstallDir(pkg);
    }

    public File getApkFile(String pkg) {
        return new File(getInstallDir(pkg), "base.apk");
    }

    private String getLibPath(String scriptDir) {
        File libDir = new File(scriptDir, "lib");
        return new File(libDir, Build.CPU_ABI).getPath() +
                File.pathSeparator +
                new File(libDir, Build.CPU_ABI2).getPath();
    }

    private Tool getToolInfo(String apkFile) throws IOException {
        Tool tool = new Tool();
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(apkFile));
        try {
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                if (nextEntry.getName().equals("config.json")) {
                    String read = IOUtils.toString(zipInputStream);
                    JSONObject jsonObject = JSON.parseObject(read);
                    //获取版本，包名，脚本名
                    if (jsonObject.containsKey("name")) {
                        tool.setName(jsonObject.getString("name"));
                    }
                    if (jsonObject.containsKey("ver")) {
                        tool.setVersion(jsonObject.getString("ver"));
                    }
                    if (jsonObject.containsKey("version")) {
                        tool.setVersion(jsonObject.getString("version"));
                    }
                    if (jsonObject.containsKey("pkg")) {
                        tool.setPkg(jsonObject.getString("pkg"));
                    }
                    if (jsonObject.containsKey("note")) {
                        tool.setNote(jsonObject.getString("note"));
                    }
                }
            }

        } finally {
            if (zipInputStream != null) {
                zipInputStream.close();
            }
        }
        return tool;
    }


    public File getSourceDir(String pkg) {
        String scriptInstallDir = getInstallDir(pkg);
        return new File(scriptInstallDir, "assets");
    }

    public void update(Tool tool) {
        Db.getInstance().getDaoSession().getToolDao().update(tool);
        fireChanged();
    }

    public List<Tool> loadFavorites() {
        ToolDao toolDao = Db.getInstance().getDaoSession().getToolDao();
        List<Tool> list = toolDao.queryBuilder().where(ToolDao.Properties.Favorite.eq(true))
                .list();
        return list;
    }

    public List<Tool> loadHistories() {
        ToolDao toolDao = Db.getInstance().getDaoSession().getToolDao();
        List<Tool> list = toolDao.queryBuilder()
                .orderDesc(ToolDao.Properties.LastRunTime)
                .limit(10)
                .list();
        List<Tool> ret = new ArrayList<>();
        for (Tool tool : list) {
            if (tool.lastRunTime != null) {
                ret.add(tool);
            }
        }
        return ret;
    }

    public void updateRuntime(String pkg) {
        Tool tool = getByPkg(pkg);
        if (tool != null) {
            tool.lastRunTime = new Date();
            update(tool);
        }
    }

    public Tool getByPkg(String pkg) {
        try {
            ToolDao toolDao = Db.getInstance().getDaoSession().getToolDao();
            Tool tool = toolDao.queryBuilder().where(ToolDao.Properties.Pkg.eq(pkg)).build().unique();
            return tool;
        } catch (Exception e) {
            return null;
        }
    }
}
