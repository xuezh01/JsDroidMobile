package com.jsdroid.ipc.call;

import android.util.Log;

import com.jsdroid.ipc.annotations.Timeout;
import com.jsdroid.ipc.data.CallIpcData;
import com.jsdroid.ipc.data.DataInput;
import com.jsdroid.ipc.data.DataOutput;
import com.jsdroid.ipc.service.IHeart;
import com.jsdroid.ipc.service.ISocket;
import com.jsdroid.ipc.data.Input;
import com.jsdroid.ipc.data.Message;
import com.jsdroid.ipc.data.Output;
import com.jsdroid.ipc.data.Result;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Time;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;


/**
 * 代理调用
 * Interface in = Proxy.createProxy
 * in.method();
 */
public class CallProxy {
    private CallManager callManager;
    //远程调用的socket
    private ISocket socket;
    //回调缓存
    private Map<Long, Object> resultMap;
    private Object resultLock;
    private ExecutorService threadPool;
    private Input input;
    private Output output;

    public CallProxy(ExecutorService threadPool, final ISocket socket) {
        this.callManager = new CallManager();
        this.threadPool = threadPool;
        this.socket = socket;
        this.resultMap = new HashMap<>();
        this.resultLock = new Object();
        addCall("heart", new IHeart() {
            @Timeout(1000)
            @Override
            public boolean heart() {
                return true;
            }

            @Timeout(3000)
            @Override
            public boolean heart3000() {
                return true;
            }
        });
    }

    public void prepare() {
        try {
            output = new DataOutput(socket.getOutPutStream());
            input = new DataInput(socket.getInputStream());
        } catch (Exception e) {
        }
    }

    public void loop() {
        //读写
        try {

            while (true) {
                final Message message = input.read();
                switch (message.type) {
                    case Message.CALL:
                        //被调用
                        final CallIpcData callData = (CallIpcData) message.ipcData;
                        threadPool.execute(new Runnable() {
                            @Override
                            public void run() {
                                Object ret = null;
                                try {
                                    ret = call(callData);
                                } catch (Throwable e) {
                                    e.printStackTrace();
                                }
                                Result result = new Result();
                                result.id = callData.id;
                                result.data = ret;
                                message.type = Message.RESULT;
                                message.ipcData = null;
                                message.ipcData = result;
                                //发送结果
                                sendTransfer(message);
                            }
                        });

                        break;
                    case Message.RESULT:
                        Result result = (Result) message.ipcData;
                        onResult(result.id, result.data);
                        break;
                }
            }
        } catch (Exception e) {
        } finally {
            close();
        }
    }


    protected Object invoke(String name, Method method, Object args[]) throws InterruptedException {
        CallIpcData callData = createCallInfo(name, method, args);
        Message message = new Message();
        message.type = Message.CALL;
        message.ipcData = callData;
        //发送callinfo
        sendTransfer(message);
        int timeout = 10000;
        Timeout annotation = method.getAnnotation(Timeout.class);
        if (annotation != null) {
            timeout = annotation.value();
        }
        return waitResult(callData.id, timeout);
    }

    //收到call命令，需要返回结果
    protected Object call(CallIpcData callData) throws Exception {
        Object call = callManager.getCall(callData.name);
        //反射调用
        if (callData.paramTypes != null && callData.paramTypes.length > 0) {
            Class[] types = ReflectHelper.getTypes(callData.paramTypes);
            for (int i = 0; i < types.length; i++) {
                if (IpcCall.class.isAssignableFrom(types[i])) {
                    //传过来一个hashcode，调用的时候，创建一个CallInfo即可调用
                    if (callData.params[i] != null) {
                        Object callback = createService((String) callData.params[i], types[i]);
                        callData.params[i] = callback;
                    }
                }
            }
            Method method = ReflectHelper.getDeclaredMethod(call.getClass(), callData.methodName, types);
            method.setAccessible(true);
            Object[] params = callData.params;
            return method.invoke(call, params);
        } else {
            Method method = ReflectHelper.getDeclaredMethod(call.getClass(), callData.methodName);
            method.setAccessible(true);
            return method.invoke(call);
        }
    }

    public Object createService(final String name, final Class callClass) {
        ClassLoader classLoader = callClass.getClassLoader();
        Class<?>[] interfaces = new Class[]{callClass};
        return Proxy.newProxyInstance(classLoader, interfaces, new CallInvocationHandler(name));
    }

    private class CallInvocationHandler implements InvocationHandler {
        private String name;

        public CallInvocationHandler(String name) {
            this.name = name;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return CallProxy.this.invoke(name, method, args);
        }
    }

    public String addCall(Object call) {
        return callManager.addCall(call);
    }

    public String addCall(String id, Object call) {
        return callManager.addCall(id, call);
    }

    public Object waitResult(long id, long timeout) throws InterruptedException {
        //最多等10秒
        long endtime = System.currentTimeMillis() + timeout;
        synchronized (resultLock) {
            while (true) {
                resultLock.wait(1000);
                if (resultMap.containsKey(id)) {
                    return resultMap.remove(id);
                } else if (System.currentTimeMillis() > endtime) {
                    throw new InterruptedException("timeout");
                }
            }
        }

    }


    private void onResult(long id, Object result) {
        resultMap.put(id, result);
        synchronized (resultLock) {
            resultLock.notifyAll();
        }
    }

    private Object sendLock = new Object();

    //发送数据
    private void sendTransfer(final Message message) {
        synchronized (sendLock) {
            try {
                output.write(message);
                output.flush();
            } catch (Exception e) {
            }
        }

    }


    public CallIpcData createCallInfo(String name, Method method, Object[] args) {
        CallIpcData callData = new CallIpcData();
        callData.id = callData.hashCode();
        callData.name = name;
        callData.params = args;
        callData.methodName = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes != null) {
            callData.paramTypes = new String[parameterTypes.length];
            for (int i = 0; i < parameterTypes.length; i++) {
                callData.paramTypes[i] = parameterTypes[i].getName();
            }
        }
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                Object arg = args[i];
                if (arg instanceof IpcCall) {
                    String callbackId = addCall(arg);
                    args[i] = callbackId;
                }
            }
        }

        return callData;
    }

    public void close() {
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception e) {
            }
        }
        if (input != null) {
            try {
                input.close();
            } catch (Exception e) {
            }
        }
        if (output != null) {
            try {
                output.close();
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        synchronized (o) {
            o.wait(1000);
            System.out.println("stop");
        }
    }
}
