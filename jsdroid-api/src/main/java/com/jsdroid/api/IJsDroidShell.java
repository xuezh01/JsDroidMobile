package com.jsdroid.api;

import com.jsdroid.api.entity.DeviceInfo;
import com.jsdroid.api.entity.File;
import com.jsdroid.ipc.annotations.Timeout;

public interface IJsDroidShell {

    @Timeout(60000)
    void debug(String jsdFile) throws InterruptedException;

    @Timeout(1000)
    boolean runFile(String appPkg, String scriptDir, String scriptFile) throws InterruptedException;

    @Timeout(1000)
    boolean runGroovy(String appPkg, String groovy) throws InterruptedException;

    @Timeout(1000)
    boolean runJs(String appPkg, String js) throws InterruptedException;

    @Timeout(1000)
    void exit();

    /**
     * ide 连接
     *
     * @param ide
     */
    @Timeout(1000)
    void ideConnect(IJsDroidIde ide) throws InterruptedException;

    @Timeout(3000)
    void appConnect(String pkg, IJsDroidApp app) throws InterruptedException;

    /**
     * png截图
     *
     * @param scale   缩放
     * @param quality 质量
     * @return
     */
    @Timeout(5000)
    byte[] capturePng(float scale, int quality) throws InterruptedException;

    /**
     * jpg截图
     *
     * @param scale   缩放
     * @param quality 质量
     * @return
     */
    @Timeout(1000)
    byte[] captureJpg(float scale, int quality) throws InterruptedException;

    @Timeout(3000)
    byte[] cap(int left, int top, int right, int bottom) throws InterruptedException;

    /**
     * 获取屏幕节点信息
     *
     * @return
     */
    @Timeout(5000)
    String getNodes() throws InterruptedException;

    @Timeout(1000)
    void touchDown(int x, int y) throws InterruptedException;

    @Timeout(1000)
    void touchUp(int x, int y) throws InterruptedException;

    @Timeout(1000)
    void touchMove(int x, int y) throws InterruptedException;

    @Timeout(3000)
    DeviceInfo getDeviceInfo() throws InterruptedException;

    /**
     * 即时预览,发送给com.jsdroid.app
     */
    @Timeout(1000)
    void showXml(String xml) throws InterruptedException;

    /**
     * 预览,发送给com.jsdroid.app
     */
    @Timeout(1000)
    void preView(String apk) throws InterruptedException;

    @Timeout(1000)
    void input(String text) throws InterruptedException;

    @Timeout(1000)
    void clear(int before, int after) throws InterruptedException;


    @Timeout(1000)
    void pressKeyCode(int keyCode) throws InterruptedException;

    @Timeout(1000)
    void pressBack() throws InterruptedException;

    @Timeout(1000)
    void pressHome() throws InterruptedException;

    @Timeout(1000)
    void pressRecent() throws InterruptedException;

    @Timeout(1000)
    void receiveJpg(IJpgReceiver jpgReceiver, float scale, int quality) throws InterruptedException;

    @Timeout(1000)
    void wakeUp() throws InterruptedException;

    @Timeout(1000)
    File[] getFiles(String path) throws InterruptedException;

    @Timeout(20000)
    void pushFile(String name, byte[] data) throws InterruptedException;

    @Timeout(20000)
    byte[] pullFile(String name) throws InterruptedException;

    @Timeout(20000)
    String exec(String shell) throws InterruptedException;

    @Timeout(1000)
    void openInputMethod() throws InterruptedException;

    @Timeout(1000)
    void closeInputMethod() throws InterruptedException;

    @Timeout(1000)
    void unzipFile(String file, String dir) throws InterruptedException;

    @Timeout(1000)
    void zipDir(String dir) throws InterruptedException;

    @Timeout(1000)
    void deleteFile(String file) throws InterruptedException;

    @Timeout(1000)
    void copyFile(String file, String toFile) throws InterruptedException;

    //ping一下，看是否连接正常
    @Timeout(1000)
    boolean ping() throws InterruptedException;

    @Timeout(5000)
        //测试minicap
    boolean testMinicap() throws InterruptedException;


    @Timeout(1000)
    void setMinicapEnable(boolean enable);

    /**
     * 是否在运行中
     *
     * @return
     */
    @Timeout(1000)
    boolean isRunning(String appPkg);

    /**
     * 监听音量键
     *
     * @param flag
     */
    @Timeout(1000)
    void setVolumeDownControl(boolean flag);
}