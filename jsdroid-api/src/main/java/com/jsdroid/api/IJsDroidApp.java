package com.jsdroid.api;

import com.jsdroid.api.entity.GlobalField;
import com.jsdroid.api.entity.GlobalMethod;
import com.jsdroid.api.entity.Log;
import com.jsdroid.api.entity.Script;
import com.jsdroid.ipc.annotations.Timeout;
import com.jsdroid.ipc.call.IpcCall;

import java.util.List;

/**
 * 需要app进行输入，toast
 */
public interface IJsDroidApp extends IpcCall {

    /**
     * 弹出消息
     *
     * @param text
     */
    @Timeout(1000)
    void toast(String text);

    @Timeout(1000)
    String getPkg();

    @Timeout(1000)
    String getVersion();

    @Timeout(1000)
    void tips(String xml);

    @Timeout(1000)
    String readConfig(String name);

    @Timeout(1000)
    void saveConfig(String name, String value);

    /**
     * 输入文字
     *
     * @param text
     */
    @Timeout(1000)
    void inputText(String text);

    /**
     * 清除文字
     *
     * @param before
     * @param after
     */
    @Timeout(1000)
    void clearText(int before, int after);

    /**
     * 即时预览
     *
     * @param xml
     */
    @Timeout(6000)
    void showXml(String xml);

    /**
     * 预览界面
     */
    @Timeout(1000)
    void preView(String jsdFile);

    /**
     * 调试
     */
    @Timeout(60000)
    void debug(String jsdFile);

    //安装脚本
    @Timeout(60000)
    String install(String jsdFile);

    @Timeout(1000)
    void saveScriptLog(String text, String filename, int line);

    @Timeout(1000)
    void onScriptStop(String result);

    @Timeout(1000)
    void saveScriptError(String error, String filename, int line);

    GlobalField[] getGlobalViewFields();

    GlobalMethod[] getGlobalViewMethods();

    @Timeout(1000)
    int playMusic(String musicFile);

    @Timeout(1000)
    void stopMusic();

    String getInputId();

    @Timeout(1000)
    void onVolumeDown(boolean scriptRunning);

    @Timeout(6000)
    void uninstall(String pkg);

    @Timeout(6000)
    boolean runScript(String pkg);

    @Timeout(1000)
    void stopScript();

    @Timeout(6000)
    List<Script> getScriptList();

    @Timeout(6000)
    List<Log> getLog();
}
