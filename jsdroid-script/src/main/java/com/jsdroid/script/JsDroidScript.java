package com.jsdroid.script;

import android.app.KeyguardManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Vibrator;

import com.jsdroid.api.IJsDroidApp;
import com.jsdroid.api.annotations.FieldName;
import com.jsdroid.api.annotations.MethodDoc;
import com.jsdroid.api.context.JsdContext;
import com.jsdroid.commons.ActivityUtil;
import com.jsdroid.commons.BitmapUtil;
import com.jsdroid.commons.FileUtil;
import com.jsdroid.commons.Http;
import com.jsdroid.commons.HttpUtil;
import com.jsdroid.commons.ScreenUtil;
import com.jsdroid.commons.ShellUtil;
import com.jsdroid.event.JsDroidEvent;
import com.jsdroid.findimg.FindImg;
import com.jsdroid.findpic.FindPic;
import com.jsdroid.groovy.JsDroidShell;
import com.jsdroid.script.builder.JsdScriptBuilder;
import com.jsdroid.script.log.LogPrint;
import com.jsdroid.script.log.PrintQueue;
import com.jsdroid.server2_5.JsdPath2_5;
import com.jsdroid.uiautomator2.By;
import com.jsdroid.uiautomator2.BySelector;
import com.jsdroid.uiautomator2.PointerGesture;
import com.jsdroid.uiautomator2.UiDevice;
import com.jsdroid.uiautomator2.UiObject2;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.codehaus.groovy.control.CompilationFailedException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import groovy.lang.Binding;
import groovy.lang.Script;

public abstract class JsDroidScript extends Script {

    private static Map<String, Object> globalProperties = new HashMap<>();
    public static final String VERSION = "2.5";

    private int findTimeout = 2000;
    private int findSleep = 300;
    private String scriptDir;
    private String appPkg;//用于判断将运行日志发送给谁
    public UiDevice device;
    private PrintQueue printQueue;
    //每个脚本唯一
    private JsdContext jsdContext = JsdContext.DEFAULT;

    public JsDroidScript() {
        init();
    }

    public JsDroidScript(Binding binding) {
        super(binding);
        init();
    }

    public void setJsdContext(JsdContext jsdContext) {
        this.jsdContext = jsdContext;
    }

    private void init() {
        printQueue = new PrintQueue();
        device = UiDevice.getInstance();
    }


    public void setAppPkg(String appPkg) {
        this.appPkg = appPkg;
    }

    public String getAppPkg() {
        return appPkg;
    }

    public void setScriptDir(String scriptDir) {
        this.scriptDir = scriptDir;
    }

    public String getScriptDir() {
        return scriptDir;
    }

    @MethodDoc("获取版本号")
    public String getVersion() {
        IJsDroidApp jsDroidApp = getJsDroidApp();
        if (jsDroidApp != null) {
            jsDroidApp.getVersion();
        }
        return VERSION;
    }

    @Override
    public void run(@FieldName("file") File file,
                    @FieldName("args") String[] arguments) throws CompilationFailedException,
            IOException {
    }

    private boolean closeDebug;

    @MethodDoc("关闭输出函数")
    public void closeDebug() {
        closeDebug = true;
    }

    /**
     * 执行字符串
     *
     * @param code
     * @return
     * @throws Exception
     */
    @MethodDoc("执行groovy代码")
    public Object eval(@FieldName("code") String code) throws Exception {
        JsDroidScript build = new JsdScriptBuilder.GroovyCodeBuilder().setAppPkg(appPkg).setCode(code).setScriptDir(scriptDir).build();
        return build.run();
    }

    @MethodDoc("加载groovy脚本文件")
    public Object load(@FieldName("file") String file) throws Exception {
        JsDroidScript build = new JsdScriptBuilder.GroovyFileBuilder().setAppPkg(appPkg).setScriptFile(file).setScriptDir(scriptDir).build();
        return build.run();
    }

    /**
     * 执行shell命令
     *
     * @param shell
     * @return
     */
    @MethodDoc("执行shell")
    public String exec(@FieldName("command") String shell) {
        try {
            return ShellUtil.exec(shell);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 按下
     *
     * @param x
     * @param y
     */
    @MethodDoc("按下")
    public void touchDown(@FieldName("x") int x,
                          @FieldName("y") int y) {
        try {
            device.getInteractionController().touchDown(x,
                    y);
        } catch (Exception e) {
        }
    }

    /**
     * 抬起
     *
     * @param x
     * @param y
     */
    @MethodDoc("抬起")
    public void touchUp(@FieldName("x") int x,
                        @FieldName("y") int y) {
        try {
            device.getInteractionController().touchUp(x,
                    y);
        } catch (Exception e) {
        }
    }

    /**
     * 滑动
     *
     * @param x
     * @param y
     */
    @MethodDoc("移动")
    public void touchMove(@FieldName("x") int x,
                          @FieldName("y") int y) {
        try {
            device.getInteractionController().touchMove(x,
                    y);
        } catch (Exception e) {
        }
    }

    @MethodDoc("截取图片")
    public Bitmap screenshot() {
        try {
            return ScreenUtil.screenshot(1.0f);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获取屏幕某点颜色
     *
     * @param x
     * @param y
     * @return
     */
    @MethodDoc("获取颜色")
    public int getColor(@FieldName("x") int x,
                        @FieldName("y") int y) {
        try {
            if (screen != null) {
                return screen.getPixel(x,
                        y);
            }
            return screenshot().getPixel(x,
                    y);
        } catch (Exception e) {
            return 0;
        }
    }

    @MethodDoc("获取颜色的红色分量")
    public int red(@FieldName("color") int color) {
        return Color.red(color);
    }

    @MethodDoc("获取颜色的绿色分量")
    public int green(@FieldName("color") int color) {
        return Color.green(color);
    }

    @MethodDoc("获取颜色的蓝色分量")
    public int blue(@FieldName("color") int color) {
        return Color.blue(color);
    }

    Bitmap screen;

    /**
     * 锁定屏幕
     */
    @MethodDoc("锁定截图")
    public synchronized void lockScreen() {
        screen = screenshot();
    }

    /**
     * 解锁屏幕
     */
    @MethodDoc("解锁截图")
    public synchronized void unlockScreen() {
        screen = null;
    }

    public void release(@FieldName("file") String file,
                        @FieldName("out") String out) {
        try {
            FileUtil.cpyStream(jsdContext.open(file),
                    new FileOutputStream(out));
        } catch (Exception e) {
        }
    }

    /**
     * 区域找图
     *
     * @param pngFile
     * @param left
     * @param top
     * @param right
     * @param bottom
     * @param offset
     * @param sim
     * @return
     */
    @MethodDoc("普通找图")
    public Point findPic(@FieldName("pngFile") String pngFile,
                         @FieldName("left") int left,
                         @FieldName("top") int top,
                         @FieldName("right") int right,
                         @FieldName("bottom") int bottom,
                         @FieldName("offset") int offset,
                         @FieldName("sim") float sim) {
        Bitmap image = readBitmap(pngFile);
        return findPic(image,
                (int) left,
                (int) top,
                (int) right,
                (int) bottom,
                (int) offset,
                (float) sim);
    }

    @MethodDoc("普通找图")
    public Point findPic(@FieldName("bitmap") Bitmap image,
                         @FieldName("left") int left,
                         @FieldName("top") int top,
                         @FieldName("right") int right,
                         @FieldName("bottom") int bottom,
                         @FieldName("offset") int offset,
                         @FieldName("sim") float sim) {
        Bitmap screen;
        if (this.screen != null) {
            screen = this.screen;
        } else {
            screen = screenshot();
        }
        return findPic(screen,
                image,
                (int) left,
                (int) top,
                (int) right,
                (int) bottom,
                (int) offset,
                (float) sim);
    }

    @MethodDoc("普通找图")
    public Point findPic(@FieldName("big") Bitmap screen,
                         @FieldName("small") Bitmap image,
                         @FieldName("left") int left,
                         @FieldName("top") int top,
                         @FieldName("right") int right,
                         @FieldName("bottom") int bottom,
                         @FieldName("offset") int offset,
                         @FieldName("sim") float sim) {
        try {
            if (image == null) {
                return null;
            }
            return FindPic.findPic(screen,
                    image,
                    (int) left,
                    (int) top,
                    (int) right,
                    (int) bottom,
                    (int) offset,
                    (float) sim);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 高级找图
     *
     * @param pngFile
     * @param left
     * @param top
     * @param right
     * @param bottom
     * @param offset
     * @param sim
     * @return
     */
    @MethodDoc("高级找图")
    public FindImg.Rect findImg(@FieldName("pngFile") String pngFile,
                                @FieldName("left") int left,
                                @FieldName("top") int top,
                                @FieldName("right") int right,
                                @FieldName("bottom") int bottom,
                                @FieldName("offset") int offset,
                                @FieldName("sim") float sim) {
        Bitmap image = readBitmap(pngFile);
        return findImg(image,
                left,
                top,
                right,
                bottom,
                offset,
                sim);
    }

    @MethodDoc("高级找图")
    public FindImg.Rect findImg(@FieldName("bitmap") Bitmap image,
                                @FieldName("left") int left,
                                @FieldName("top") int top,
                                @FieldName("right") int right,
                                @FieldName("bottom") int bottom,
                                @FieldName("offset") int offset,
                                @FieldName("sim") float sim) {
        Bitmap screen;
        if (this.screen != null) {
            screen = this.screen;
        } else {
            screen = screenshot();
        }
        return findImg(screen,
                image,
                left,
                top,
                right,
                bottom,
                offset,
                sim);
    }

    @MethodDoc("高级找图")
    public FindImg.Rect findImg(@FieldName("big") Bitmap screen,
                                @FieldName("small") Bitmap image,
                                @FieldName("left") int left,
                                @FieldName("top") int top,
                                @FieldName("right") int right,
                                @FieldName("bottom") int bottom,
                                @FieldName("offset") int offset,
                                @FieldName("sim") float sim) {
        int distance = 1;
        int level = 8;
        if (sim > 0.7) {
            distance = 2;
            level = 16;
        }
        if (image == null) {
            return null;
        }
        return FindImg.findImg(screen,
                image,
                level,
                left,
                top,
                right,
                bottom,
                offset,
                distance,
                sim);
    }

    /**
     * 区域截图
     *
     * @param left
     * @param top
     * @param right
     * @param bottom
     * @return
     */
    @MethodDoc("截屏")
    public Bitmap cap(@FieldName("left") int left,
                      @FieldName("top") int top,
                      @FieldName("right") int right,
                      @FieldName("bottom") int bottom) {
        try {
            Bitmap bitmap = screenshot();
            return Bitmap.createBitmap(bitmap,
                    left,
                    top,
                    right - left,
                    bottom - top);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 保存图片
     *
     * @param file
     * @param image
     */
    @MethodDoc("保存图片")
    public void saveBitmap(@FieldName("file") String file,
                           @FieldName("bitmap") Bitmap image) {
        try {
            BitmapUtil.save(file,
                    image);
        } catch (Exception e) {
        }
    }

    /**
     * 读取图片
     *
     * @param file
     * @return
     */
    @MethodDoc("读取图片")
    public Bitmap readBitmap(@FieldName("file") String file) {
        try {
            byte[] data = FileUtil.readBytes(jsdContext.open(file));
            return BitmapFactory.decodeByteArray(data, 0, data.length);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 图片转为jpg
     *
     * @param bitmap
     * @return
     */
    @MethodDoc("图片转bytes")
    public byte[] bitmapToJpg(@FieldName("bitmap") Bitmap bitmap) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG,
                80,
                out);
        return out.toByteArray();
    }

    @MethodDoc("获取屏幕宽度")
    public int getScreenWidth() {
        return device.getDisplayWidth();
    }

    @MethodDoc("获取屏幕高度")
    public int getScreenHeight() {
        return device.getDisplayHeight();
    }

    @MethodDoc("获取屏幕旋转方向")
    public int getRotation() {
        return device.getRotation();
    }

    @MethodDoc("获取屏幕未旋转的宽度")
    public int getNaturalWidth() {
        return ScreenUtil.getNaturalWidth();
    }

    @MethodDoc("获取屏幕未旋转的高度")
    public int getNaturalHeight() {
        return ScreenUtil.getNaturalHeight();
    }


    /**
     * 截图
     *
     * @param file    保存的文件为准
     * @param left
     * @param top
     * @param right
     * @param bottom
     * @param quality
     * @param type    保存的类型：png/jpg
     */
    @MethodDoc("截屏到文件")
    public void screenshot(@FieldName("saveFile") String file,
                           @FieldName("left") int left,
                           @FieldName("top") int top,
                           @FieldName("right") int right,
                           @FieldName("bottom") int bottom,
                           @FieldName("quality") int quality,
                           @FieldName("type") String type) {

        FileOutputStream out = null;
        try {
            Bitmap bitmap = screenshot();
            Bitmap bitmap1 = Bitmap.createBitmap(bitmap,
                    left,
                    top,
                    right - left,
                    bottom - top);
            out = new FileOutputStream(file);
            bitmap1.compress(type.equals("png") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG,
                    quality,
                    out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (Exception e) {
            }
        }
    }

    /**
     * 截图
     *
     * @param file
     * @param left
     * @param top
     * @param right
     * @param bottom
     */
    @MethodDoc("截屏到文件")
    public void screenshot(@FieldName("file") String file,
                           @FieldName("left") int left,
                           @FieldName("top") int top,
                           @FieldName("right") int right,
                           @FieldName("bottom") int bottom) {
        screenshot(file,
                left,
                top,
                right,
                bottom,
                100);
    }

    /**
     * 截图
     *
     * @param file
     * @param left
     * @param top
     * @param right
     * @param bottom
     * @param quality
     */
    @MethodDoc("截屏到文件")
    public void screenshot(@FieldName("file") String file,
                           @FieldName("left") int left,
                           @FieldName("top") int top,
                           @FieldName("right") int right,
                           @FieldName("bottom") int bottom,
                           @FieldName("quality") int quality) {
        screenshot(file,
                left,
                top,
                right,
                bottom,
                quality,
                "png");
    }


    /**
     * 启动app
     *
     * @param pkg 包名
     */
    @MethodDoc("启动app")
    public void runApp(@FieldName("pkg") String pkg) {
        try {
            ActivityUtil.launch(pkg);
        } catch (Exception e) {
        }
    }

    /**
     * 启动activity
     *
     * @param intent
     */
    @MethodDoc("启动activity")
    public void startActivity(@FieldName("intent") Intent intent) {
        try {
            ActivityUtil.startActivity(intent);
        } catch (Exception e) {
        }
    }

    /**
     * 锁定屏幕
     */
    @MethodDoc("锁定屏幕")
    public void lockDevice() {
        try {
            device.sleep();
        } catch (Exception e) {
        }
    }

    /**
     * 解锁屏幕
     */
    @MethodDoc("解锁屏幕")
    public void unlockDevice() {
        try {
            device.wakeUp();
            KeyguardManager keyguardManager = (KeyguardManager) device.getContext().getSystemService(Context.KEYGUARD_SERVICE);
            keyguardManager.newKeyguardLock("unLock").disableKeyguard();
        } catch (Throwable e) {
        }

    }

    /**
     * 找节点
     *
     * @param by
     * @return
     */
    @MethodDoc("查找节点")
    public UiObject2 findObject(@FieldName("by") BySelector by) {
        try {
            return device.findObject(by);
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 线程等待一段时间，单位：毫秒
     *
     * @param time
     * @throws InterruptedException
     */
    @MethodDoc("线程睡眠")
    public void delay(@FieldName("time") long time) throws InterruptedException {
        Thread.sleep(time);
    }

    /**
     * 线程等待一段时间，单位：毫秒
     *
     * @param time
     * @throws InterruptedException
     */
    @MethodDoc("线程睡眠")
    public void sleep(@FieldName("time") long time) throws InterruptedException {
        delay(time);
    }

    /**
     * 点击屏幕
     *
     * @param x
     * @param y
     */
    @MethodDoc("点击坐标")
    public void tap(@FieldName("x") int x,
                    @FieldName("y") int y) {
        device.click(x,
                y);
    }

    /**
     * 点击屏幕
     *
     * @param x
     * @param y
     */
    @MethodDoc("点击坐标")
    public void click(@FieldName("x") int x,
                      @FieldName("y") int y) {
        device.click(x,
                y);
    }

    /**
     * 滑动
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param steps
     */
    @MethodDoc("滑动")
    public void swipe(@FieldName("x1") int x1,
                      @FieldName("y1") int y1,
                      @FieldName("x2") int x2,
                      @FieldName("y2") int y2,
                      @FieldName("steps") int steps) {
        device.swipe(x1,
                y1,
                x2,
                y2,
                steps);
    }

    /**
     * 滑动
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    @MethodDoc("滑动")
    public void swipe(@FieldName("x1") int x1,
                      @FieldName("y1") int y1,
                      @FieldName("x2") int x2,
                      @FieldName("y2") int y2) {
        swipe(x1,
                y1,
                x2,
                y2,
                (Math.abs(x1 - x2) + Math.abs(y1 - y2)) / 20);
    }

    /**
     * 拖动，精准滑动
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param steps
     */
    @MethodDoc("拖动")
    public void drag(@FieldName("x1") int x1,
                     @FieldName("y1") int y1,
                     @FieldName("x2") int x2,
                     @FieldName("y2") int y2,
                     @FieldName("steps") int steps) {
        device.drag(x1,
                y1,
                x2,
                y2,
                steps);
    }

    /**
     * 拖动，精准滑动
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    @MethodDoc("拖动")
    public void drag(@FieldName("x1") int x1,
                     @FieldName("y1") int y1,
                     @FieldName("x2") int x2,
                     @FieldName("y2") int y2) {
        drag(x1,
                y1,
                x2,
                y2,
                (Math.abs(x1 - x2) + Math.abs(y1 - y2)) / 20);
    }

    /**
     * 获取当前activity组件名
     *
     * @return
     */
    @MethodDoc("获取当前activity")
    public String getActivity() {
        try {
            return UiDevice.getInstance().getAct();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获取系统时间，单位毫秒
     *
     * @return
     */
    @MethodDoc("获取系统时间戳(毫秒)")
    public long time() {
        return System.currentTimeMillis();
    }


    @MethodDoc("读取文件为字符串")
    public String read(@FieldName("file") String file) {
        try {
            return jsdContext.read(file);
        } catch (Exception e) {
            return null;
        }
    }

    @MethodDoc("写入内容到文件")
    public void write(@FieldName("file") String file,
                      @FieldName("content") String content) {
        try {
            FileUtil.write(file, content);
        } catch (Exception e) {
        }
    }

    @MethodDoc("向文件追加一行内容")
    public void append(@FieldName("file") String file,
                       @FieldName("content") String content) {
        try {
            FileUtil.append(file, content);
        } catch (Exception e) {
        }
    }

    @MethodDoc("移动文件到文件")
    public void moveFileToFile(@FieldName("from") String from,
                               @FieldName("to") String to) {
        try {
            File fromFile = new File(from);
            FileUtils.copyFile(fromFile,
                    new File(to));
        } catch (Exception e) {
        }
    }

    @MethodDoc("移动文件到文件夹")
    public void moveFileToDir(@FieldName("from") String from,
                              @FieldName("dir") String dir) {
        try {
            File fromFile = new File(from);
            File toFile = new File(dir);
            FileUtils.copyFileToDirectory(fromFile,
                    toFile);
            fromFile.delete();
        } catch (Exception e) {
        }

    }

    @MethodDoc("复制文件到文件")
    public void copyFileToFile(@FieldName(value = "from") String from,
                               @FieldName("to") String to) {
        try {
            FileUtils.copyFile(new File(from), new File(to));
        } catch (Exception e) {
        }
    }

    @MethodDoc("复制文件到文件夹")
    public void copyFileToDir(@FieldName("from") String from,
                              @FieldName("dir") String dir) {
        try {
            FileUtils.copyFileToDirectory(new File(from), new File(dir));
        } catch (Exception e) {
        }

    }

    @MethodDoc("删除文件")
    public void deleteFile(@FieldName(value = "file", note = "文件路径") String file) {
        try {
            new File(file).delete();
        } catch (Exception e) {
        }
    }

    @MethodDoc("创建文件")
    public void createFile(@FieldName(value = "file", note = "文件路径") String file) {
        try {
            new File(file).createNewFile();
        } catch (Exception e) {
        }
    }

    @MethodDoc("创建文件夹")
    public void mkdir(@FieldName(value = "dir", note = "文件路径") String file) {
        try {
            new File(file).mkdir();
        } catch (Exception e) {
        }
    }

    @MethodDoc("创建文件夹，多层递归创建")
    public void mkdirs(@FieldName(value = "dir", note = "文件路径") String file) {
        try {
            new File(file).mkdirs();
        } catch (Exception e) {
        }
    }

    @MethodDoc("get请求")
    public String httpGet(@FieldName("url") String url) {
        try {
            return HttpUtil.get(url);
        } catch (Exception e) {
        }
        return null;
    }

    @MethodDoc("get请求")
    public String httpGet(@FieldName(value = "url", note = "地址") String url,
                          @FieldName(value = "params", note = "参数表") Map<String,
                                  String> params) {
        try {
            return HttpUtil.get(url,
                    params);
        } catch (Exception e) {
        }
        return null;
    }

    @MethodDoc("post请求")
    public String httpPost(@FieldName(value = "url", note = "地址") String url,
                           @FieldName(value = "params", note = "参数表") Map<String,
                                   String> params) {
        try {
            return HttpUtil.post(url,
                    params);
        } catch (Exception e) {
        }
        return null;
    }

    @MethodDoc("杀死App进程")
    public void killApp(@FieldName(value = "pkg", note = "App包名") String pkg) {
        try {
            exec("am force-stop " + pkg);
        } catch (Exception e) {
        }
    }

    @MethodDoc("弹出toast文字")
    public void toast(@FieldName(value = "text", note = "弹出的文字") String text) {
        IJsDroidApp jsDroidApp = getJsDroidApp();
        if (jsDroidApp != null) {
            try {
                jsDroidApp.toast(text);
            } catch (Exception e) {
            }
        }
    }

    /**
     * 打开输入法
     */
    @MethodDoc("打开输入法")
    public void openInputMethod() throws InterruptedException {
        try {
            JsDroidShellImpl.getInstance().openInputMethod();
        } catch (Exception e) {
        }
    }

    /**
     * 关闭输入法
     */
    @MethodDoc("关闭输入法")
    public void closeInputMethod() {
        try {
            JsDroidShellImpl.getInstance().closeInputMethod();
        } catch (Exception e) {
        }
    }

    /**
     * 输入文字
     *
     * @param text
     */
    @MethodDoc("输入文字")
    public void inputText(@FieldName(value = "text", note = "要输入的文字") String text) {
        try {
            JsDroidShellImpl.getInstance().input(text);
        } catch (Exception e) {
        }
    }

    /**
     * 清除文字
     *
     * @param before
     * @param after
     */
    @MethodDoc("清除文字")
    public void clearText(@FieldName(value = "before", note = "输入光标前数量") int before,
                          @FieldName(value = "after", note = "输入光标后数量") int after) {
        try {
            JsDroidShellImpl.getInstance().clear(before,
                    after);
        } catch (Exception e) {
        }
    }

    /**
     * 输出日志
     *
     * @param data
     */
    @MethodDoc("输出结果")
    public void print(@FieldName(value = "content", note = "输出的内容") final Object data) {
        if (closeDebug) {
            return;
        }
        if (data == null) {
            return;
        }
        Throwable exception = new Throwable();
        StackTraceElement[] stackTrace = exception.getStackTrace();
        StackTraceElement element = stackTrace[1];
        for (StackTraceElement stackTraceElement : stackTrace) {
            String fileName = stackTraceElement.getFileName();
            if (fileName != null && fileName.endsWith(".groovy")) {
                element = stackTraceElement;
            }
        }
        String fileName = element.getFileName();
        int lineNumber = element.getLineNumber();
        String log = data == null ? "" : data.toString();
        printQueue.enqueue(new LogPrint(log, fileName, lineNumber, getJsDroidApp()));
    }


    @MethodDoc("输出日志")
    public void log(@FieldName(value = "content", note = "输出的内容") Object content) {
        print(content);
    }

    /**
     * 手势操作
     *
     * @param pointerGestures
     */
    @MethodDoc("手势操作")
    public void gestures(@FieldName("pointerGestures") PointerGesture... pointerGestures) {
        try {
            device.performGesture(pointerGestures);
        } catch (Exception e) {
        }
    }

    /**
     * click res:"",text:""
     *
     * @param map
     * @return
     * @throws InterruptedException
     */
    @MethodDoc("点击节点")
    public boolean click(@FieldName("map") Map map) throws InterruptedException {
        try {
            UiObject2 node = findNode(map);
            if (node != null) {
                node.click();
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    /**
     * findNode res:"",text:""
     *
     * @param map
     * @return
     * @throws InterruptedException
     */
    @MethodDoc("查找节点")
    public UiObject2 findNode(@FieldName("map") Map map) throws InterruptedException {
        int timeout = findTimeout;
        try {
            timeout = (int) map.get("timeout");
        } catch (Exception e) {
        }
        long endtime = timeout + System.currentTimeMillis();
        try {
            while (endtime >= System.currentTimeMillis()) {
                UiObject2 object = device.findObject(By.map(map));
                if (object != null) {
                    return object;
                }
                sleep(findSleep);

            }
        } catch (Exception e) {
        }
        return null;
    }

    /**
     * findNodes res:"",text:""
     *
     * @param map
     * @return
     */
    @MethodDoc("查找全部节点")
    public List<UiObject2> findNodes(@FieldName("map") Map map) {
        try {
            return device.findObjects(By.map(map));
        } catch (Exception e) {
            return new LinkedList<>();
        }
    }

    @MethodDoc("显示xml提示")
    public void tips(@FieldName("xml") String xml) {
        IJsDroidApp jsDroidApp = getJsDroidApp();
        if (jsDroidApp != null) {
            try {
                jsDroidApp.tips(xml);
            } catch (Exception e) {
            }
        }
    }

    @MethodDoc("获取连接的app")
    public IJsDroidApp getJsDroidApp() {
        return JsDroidShellImpl.getInstance().getJsDroidApp(appPkg);
    }

    @MethodDoc("读取配置")
    public String readConfig(@FieldName("name") String name) {
        try {
            IJsDroidApp jsDroidApp = getJsDroidApp();
            if (jsDroidApp != null) {
                return jsDroidApp.readConfig(name);
            }
        } catch (Exception e) {
        }
        return null;
    }

    @MethodDoc("得到当前路径")
    public String getDir() {
        return new File("").getAbsolutePath();
    }

    @MethodDoc("get链")
    public Http get(@FieldName("url") String url) {
        return Http.get(url);
    }

    @MethodDoc("post链")
    public Http post(@FieldName("url") String url) {
        return Http.post(url);
    }

    @MethodDoc("获取全局参数")
    public Object getGlobalProperty(@FieldName("key") String key) {
        return globalProperties.get(key);
    }

    @MethodDoc("设置全局参数")
    public void setGlobalProperty(@FieldName("key") String key, @FieldName("property") Object property) {
        globalProperties.put(key, property);
    }

    @MethodDoc("播放音乐,返回音乐时长")
    public int playMusic(@FieldName("file") String file) {
        try {
            IJsDroidApp jsDroidApp = getJsDroidApp();
            if (jsDroidApp != null) {
                return jsDroidApp.playMusic(file);
            }
        } catch (Exception e) {
        }
        return 0;

    }

    @MethodDoc("停止播放音乐")
    public void stopMusic() {
        try {
            IJsDroidApp jsDroidApp = getJsDroidApp();
            if (jsDroidApp != null) {
                jsDroidApp.stopMusic();
            }
        } catch (Exception e) {
        }
    }

    /**
     * 手机震动ms秒
     *
     * @param ms
     */
    @MethodDoc("手机震动")
    public void vibrate(int ms) {
        try {
            Vibrator vibrator = (Vibrator) device.getContext().getSystemService(Service.VIBRATOR_SERVICE);
            vibrator.vibrate(ms);
        } catch (Exception e) {
        }
    }

    @MethodDoc("设置查询节点休眠时间")
    public void setFindSleep(int findSleep) {
        this.findSleep = findSleep;
    }

    @MethodDoc("设置查询节点超时时间")
    public void setFindTimeout(int findTimeout) {
        this.findTimeout = findTimeout;
    }

    @MethodDoc("监听手机按键事件")
    public void onEvent(JsDroidEvent.EventListener eventListener) {
        JsDroidEvent.getInstance().setListener(eventListener);
    }

    @MethodDoc("运行js代码，返回运行结果")
    public Object runJs(String js) {
        JsGlobal jsGlobal = new JsGlobal();
        jsGlobal.bindScript(this);
        return jsGlobal.runJs(js);
    }

    @MethodDoc("退出脚本")
    public void exit() {
        System.exit(0);
    }


    public PrintQueue getPrintQueue() {
        return printQueue;
    }

    private boolean exitOnEnd;

    public void setExitOnEnd(boolean exitOnEnd) {
        this.exitOnEnd = exitOnEnd;
    }

    public boolean isExitOnEnd() {
        return exitOnEnd;
    }
}
