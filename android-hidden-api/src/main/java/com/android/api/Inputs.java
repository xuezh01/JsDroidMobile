package com.android.api;

import android.os.RemoteException;
import android.os.ServiceManager;
import android.view.inputmethod.InputMethodInfo;

import com.android.internal.view.IInputMethodManager;

import java.util.ArrayList;
import java.util.List;

public class Inputs {
    public static List<String> list() {
        List<String> ret = new ArrayList<String>();
        IInputMethodManager mImm;
        mImm = IInputMethodManager.Stub.asInterface(ServiceManager
                .getService("input_method"));
        try {

            for (InputMethodInfo info : mImm.getInputMethodList()) {
                ret.add(info.getId());
            }
        } catch (RemoteException e) {
        }
        return ret;
    }

    public static void setIME(String id) {
        IInputMethodManager mImm;
        mImm = IInputMethodManager.Stub.asInterface(ServiceManager
                .getService("input_method"));
        try {
            mImm.setInputMethod(null, id);
        } catch (Throwable e) {
        }
    }
}
