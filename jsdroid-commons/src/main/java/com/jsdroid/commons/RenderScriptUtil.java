package com.jsdroid.commons;

import android.content.Context;
import android.os.Build;
import android.renderscript.RenderScript;

import java.lang.reflect.Method;

public class RenderScriptUtil {
    private static Method create;

    public static RenderScript create(Context context) {
        try {
            if (Build.VERSION.SDK_INT < 18) {
                return (RenderScript) create.invoke(null, new Object[]{context, Integer.valueOf(16)});
            }
            if (Build.VERSION.SDK_INT < 21) {
                return (RenderScript) create.invoke(null, new Object[]{context, Integer.valueOf(16), RenderScript.ContextType.NORMAL});
            }
            return (RenderScript) create.invoke(null, new Object[]{context, Integer.valueOf(16), RenderScript.ContextType.NORMAL, Integer.valueOf(0)});
        } catch (Exception e) {
        }
        return null;
    }
}
