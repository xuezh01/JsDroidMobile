package com.jsdroid.uiautomator2;

import android.accessibilityservice.AccessibilityService;
import android.app.IUiAutomationConnection;
import android.app.UiAutomationConnection;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理UiAtuomation.mClient.mCallback
public class UiAutomationEvent {
    public interface OnKeyEventListener {
        boolean onKeyEvent(KeyEvent event);
    }

    public static IUiAutomationConnection proxyUiAutomationConnection(final OnKeyEventListener onKeyEventListener, final Looper looper) {
        final UiAutomationConnection uiAutomationConnection = new UiAutomationConnection();
        final IUiAutomationConnection connection = (IUiAutomationConnection) Proxy.newProxyInstance(
                IUiAutomationConnection.class.getClassLoader(), new Class[]{IUiAutomationConnection.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("connect")) {
                            Object arg = args[0];
                            if (arg instanceof AccessibilityService.IAccessibilityServiceClientWrapper) {
                                //获取callback
                                AccessibilityService.Callbacks callback = getCallback((AccessibilityService.IAccessibilityServiceClientWrapper) arg);
                                args[0] = new IAccessibilityServiceClientImpl(null, looper, callback, onKeyEventListener);
                            }
                        }
                        return method.invoke(uiAutomationConnection, args);
                    }
                });
        return connection;
    }

    private static AccessibilityService.Callbacks getCallback(AccessibilityService.IAccessibilityServiceClientWrapper wrapper) throws NoSuchFieldException, IllegalAccessException {
        Field mCallback = AccessibilityService.IAccessibilityServiceClientWrapper.class.getDeclaredField("mCallback");
        mCallback.setAccessible(true);
        return (AccessibilityService.Callbacks) mCallback.get(wrapper);
    }

    public static class IAccessibilityServiceClientImpl extends AccessibilityService.IAccessibilityServiceClientWrapper {
        private OnKeyEventListener onKeyEventListener;

        public IAccessibilityServiceClientImpl(Context context, Looper looper, AccessibilityService.Callbacks callback, OnKeyEventListener onKeyEventListener) {
            super(context, looper, callback);
            this.onKeyEventListener = onKeyEventListener;

        }

        @Override
        public void executeMessage(Message message) {
            super.executeMessage(message);
            System.out.println(message.what);
            if (message.obj instanceof KeyEvent) {
                onKeyEventListener.onKeyEvent((KeyEvent) message.obj);
            }
        }
    }
}
