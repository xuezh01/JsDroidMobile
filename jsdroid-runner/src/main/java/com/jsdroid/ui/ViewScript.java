package com.jsdroid.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.Toast;

import com.jsdroid.api.annotations.FieldName;
import com.jsdroid.api.context.JsdContext;
import com.jsdroid.commons.FileUtil;
import com.jsdroid.commons.Http;
import com.jsdroid.shell.JsDroidApp;
import com.jsdroid.ui.closure.XmlActivity;
import com.jsdroid.ui.closure.XmlDialog;
import com.jsdroid.ui.closure.XmlFloat;
import com.jsdroid.ui.parser.ViewParser;
import com.jsdroid.ui.parser.ViewParser.ViewContainer;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import groovy.lang.Binding;
import groovy.lang.Closure;
import groovy.lang.Script;

public abstract class ViewScript extends Script {

    private static Map<String, Object> globalProperties = new HashMap<>();

    public interface IApp {
        void showFloatMenu();

        void hideFloatMenu();
    }

    public Activity activity;
    public IApp app;
    public String dir;
    public String pkg;
    public JsdContext jsdContext;
    private Closure createClosure;
    private Closure resumeClosure;
    private Closure pauseClosure;
    private Closure stopClosure;
    private Closure scriptStopClosure;
    private Closure destroyed;

    protected ViewScript() {

    }

    protected ViewScript(Binding binding) {
        super(binding);
    }

    public void finish() {
        activity.finish();
    }

    public XmlActivity showView(@FieldName("map") Map map) {
        return new XmlActivity(activity, map).showView();
    }

    public XmlActivity showView(@FieldName("xmlFile") String xmlFile) throws IOException, SAXException, ParserConfigurationException {
        return new XmlActivity(activity, jsdContext, xmlFile).showView();
    }

    public XmlActivity showView(StringBuilder xmlSource) throws ParserConfigurationException, SAXException, IOException {
        return new XmlActivity(activity, jsdContext, xmlSource).showView();
    }

    public boolean isStart() {
        return JsDroidApp.getInstance().isRunning();
    }

    public void startScript() {
        JsDroidApp.getInstance().addApkScriptTask(pkg);
    }

    public XmlDialog showDialog(@FieldName("xmlFile") String xmlFile) throws IOException, SAXException, ParserConfigurationException {
        return new XmlDialog(activity, jsdContext, xmlFile).showDialog();
    }

    public XmlDialog showDialog(@FieldName("map") Map map) {
        return new XmlDialog(activity, map).showDialog();
    }

    public XmlFloat showFloatView(@FieldName("tag") final String tag,
                                  @FieldName("map") Map map) {
        return new XmlFloat(activity.getApplicationContext(), map).setTag(tag).show();
    }

    public XmlFloat showFloatView(@FieldName("tag") final String tag,
                                  @FieldName("xmlFile") String xmlFile) throws IOException, SAXException, ParserConfigurationException {
        return new XmlFloat(activity.getApplicationContext(), jsdContext, xmlFile).setTag(tag).show();
    }

    private Closure tips(ViewContainer viewContainer) {
        viewContainer.rootView.initView(activity);
        final Toast toast = new Toast(activity);
        toast.setView(viewContainer.rootView.view);
        toast.show();
        toast.setGravity(Gravity.CENTER,
                0,
                0);
        Closure closure = new Closure(new Binding()) {
            public void close() {
                toast.cancel();
            }
        };
        for (String name : viewContainer.viewMap.keySet()) {
            closure.setProperty(name,
                    viewContainer.viewMap.get(name));
        }
        return closure;
    }

    public Closure tips(@FieldName("map") Map map) {
        ViewContainer viewContainer = ViewParser.parseMap(jsdContext, map);
        return tips(viewContainer);
    }

    public Closure tips(@FieldName("map") String xmlFile) throws IOException, SAXException, ParserConfigurationException {
        ViewContainer viewContainer = ViewParser.parseXml(jsdContext, jsdContext.read(xmlFile));
        return tips(viewContainer);
    }

    public void thread(@FieldName("closure") final Closure closure) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                closure.call();
            }
        }).start();
    }

    public void uiThread(@FieldName("closure") final Closure closure) {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                closure.call();
            }
        });
    }

    public void fireCreate() {
        if (createClosure != null) {
            createClosure.call();
        }
    }

    public void onCreate(@FieldName("file") Closure closure) {
        createClosure = closure;
    }

    public void onResume() {
        if (resumeClosure != null) {
            resumeClosure.call();
        }
    }

    public boolean isConnected() {
        return JsDroidApp.getInstance().isConnected();
    }

    public void onResume(@FieldName("closure") Closure closure) {
        resumeClosure = closure;
    }

    public void firePause() {
        if (pauseClosure != null) {
            pauseClosure.call();
        }
    }

    public void onPause(@FieldName("closure") Closure closure) {
        pauseClosure = closure;
    }

    public void toast(@FieldName("text") final String text) {
        JsDroidApp.getInstance().toast(text);
    }

    public void fireStop() {
        if (stopClosure != null) {
            stopClosure.call();
        }
    }

    public void onStop(@FieldName("closure") Closure closure) {
        stopClosure = closure;
    }

    public void fireDestroyed() {
        if (destroyed != null) {
            destroyed.call();
        }
    }

    public void onDestroyed(@FieldName("closure") Closure closure) {
        destroyed = closure;
    }

    public void stopScript() {
        JsDroidApp.getInstance().stopScript();
    }


    public void fireScriptStop() {
        if (scriptStopClosure != null) {
            scriptStopClosure.call();
        }
    }

    public void onScriptStop(@FieldName("closure") Closure closure) {
        scriptStopClosure = closure;
    }

    public String read(@FieldName("file") String file) {
        return jsdContext.read(file);
    }

    public void write(@FieldName("file") String file, @FieldName("content") String content) {
        FileUtil.write(file, content);
    }

    public Http get(@FieldName("url") String url) {
        return Http.get(url);
    }

    public Http post(@FieldName("url") String url) {
        return Http.post(url);
    }

    public Object getGlobalProperty(@FieldName("key") String key) {
        return globalProperties.get(key);
    }

    public void setGlobalProperty(@FieldName("key") String key, @FieldName("property") Object property) {
        globalProperties.put(key, property);
    }

    private Closure onKeyDown;

    public boolean fireKeyDown(int keyCode, KeyEvent event) {
        try {
            if (onKeyDown != null) {
                Object call = onKeyDown.call(keyCode, event);
                if (call instanceof Boolean) {
                    return (boolean) call;
                }
            }
        } catch (Exception e) {
        }
        return false;
    }

    public void onKeyDown(Closure onKeyDown) {
        this.onKeyDown = onKeyDown;
    }

    public void goHome() {
        Intent home = new Intent(Intent.ACTION_MAIN);
        home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        home.addCategory(Intent.CATEGORY_HOME);
        activity.startActivity(home);
    }

    public void showFloatMenu() {
        if (app != null) {
            app.showFloatMenu();
        }
    }

    public void hideFloatMenu() {
        if (app != null) {
            app.hideFloatMenu();
        }
    }

    public void setStatusBarColor(int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (activity != null) {
                Window window = activity.getWindow();
                window.setStatusBarColor(color);   //这里动态修改颜色
            }
        }
    }

    public void print(Object log) {
        if (app != null) {
            Throwable exception = new Throwable();
            StackTraceElement[] stackTrace = exception.getStackTrace();
            StackTraceElement element = stackTrace[1];
            int count = 0;
            for (StackTraceElement stackTraceElement : stackTrace) {
                String fileName = stackTraceElement.getFileName();
                if (fileName != null && fileName.endsWith(".groovy")) {
                    element = stackTraceElement;
                }
                if (count++ > 20) {
                    break;
                }
            }
            String fileName = element.getFileName();
            int lineNumber = element.getLineNumber();
            JsDroidApp.getInstance().saveScriptLog(log + "", fileName, lineNumber);
        }
    }

    public void log(Object log) {
        print(log);
    }

    private Closure logClosure;

    public void fireLog(String log) {
        if (logClosure != null) {
            logClosure.call(log);
        }
    }

    public void onLog(Closure closure) {
        logClosure = closure;
    }

    private Closure connectedClosure;

    public void onConnected(Closure connectedClosure) {
        this.connectedClosure = connectedClosure;
    }

    public void fireConnected() {
        if (connectedClosure != null) {
            connectedClosure.call();
        }
    }

    private Closure disconnectedClosure;

    public void onDisconnected(Closure disconnectedClosure) {
        this.disconnectedClosure = disconnectedClosure;
    }

    public void fireDisconnected() {
        if (disconnectedClosure != null) {
            disconnectedClosure.call();
        }

    }

    private Closure scriptStartClosure;

    public void onScriptStart(Closure scriptStartClosure) {
        this.scriptStartClosure = scriptStartClosure;
    }

    public void fireScriptStart() {
        if (scriptStartClosure != null) {
            scriptStartClosure.call();
        }
    }

}

