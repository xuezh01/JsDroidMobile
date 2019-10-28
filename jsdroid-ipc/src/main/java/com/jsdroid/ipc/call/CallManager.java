package com.jsdroid.ipc.call;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CallManager {
    private Map<String, Object> callMap;

    public CallManager() {
        callMap = new HashMap<>();
    }

    public Object getCall(String id) {
        return callMap.get(id);
    }

    public synchronized String addCall(Object call) {
        String id = Integer.toHexString(call.hashCode());
        callMap.put(id, call);
        return id;
    }


    public synchronized String addCall(String id, Object call) {
        callMap.put(id, call);
        return id;
    }


}
