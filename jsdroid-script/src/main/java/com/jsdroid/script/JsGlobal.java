package com.jsdroid.script;

import com.jsdroid.uiautomator2.UiDevice;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ImporterTopLevel;

public class JsGlobal extends ImporterTopLevel {
    private static JsGlobal instance = new JsGlobal();
    private static final long serialVersionUID = 7197662993041453531L;

    public static JsGlobal getInstance() {
        return instance;
    }


    public JsGlobal() {
        this(Context.enter());

    }

    public JsGlobal(Context context) {
        super(context);
        context.setOptimizationLevel(-1);
    }

    public void bindScript(final JsDroidScript script) {
        putProperty(this, "jsd", script);
        putProperty(this, "device", UiDevice.getInstance());
    }

    public Object runJs(String js) {
        Context enter = Context.enter();
        enter.setOptimizationLevel(-1);
        try {
            Object o = enter.evaluateString(this, js, "main.js", 1, null);
            return o;
        } finally {
            Context.exit();
        }
    }

}
