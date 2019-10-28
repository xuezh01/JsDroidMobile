package com.jsdroid.app.nsd;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.util.Log;

import com.jsdroid.app.App;
import com.jsdroid.commons.SocketUtil;
import com.jsdroid.shell.JsDroidApp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.UUID;

public class NsdServer extends Thread {
    public static final String SERVICE_TYPE = "_http._tcp.";
    private static final String TAG = NsdServer.class.getName();
    private NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
    private String serviceName;

    public NsdServer() {
        serviceName = "Jsd设备-" + Build.MODEL + "-" + UUID.randomUUID().toString().substring(0, 4);
        start();
    }

    @Override
    public void run() {
        super.run();
        try {
            ServerSocket serverSocket = new ServerSocket(0);
            SocketAddress localSocketAddress = serverSocket.getLocalSocketAddress();

            init(serverSocket.getLocalPort(), serviceName, SERVICE_TYPE);
            while (true) {
                Socket accept = serverSocket.accept();
                SocketUtil socketUtil = new SocketUtil(accept);
                while (true) {
                    String line = socketUtil.readLine();
                    if (line == null) {
                        break;
                    }
                    JsDroidApp.getInstance().toast(line);
                }
            }
        } catch (IOException e) {
        }
    }

    private void init(int port, String serviceName, String serviceType) {
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setPort(port);
        nsdServiceInfo.setServiceName(serviceName);
        nsdServiceInfo.setServiceType(serviceType);
        init(nsdServiceInfo);
    }

    private void init(NsdServiceInfo nsdServiceInfo) {
        this.nsdServiceInfo = nsdServiceInfo;
        NsdManager nsdManager = (NsdManager) App.getInstance().getSystemService(Context.NSD_SERVICE);
        nsdManager.registerService(nsdServiceInfo, NsdManager.PROTOCOL_DNS_SD, new NsdManager.RegistrationListener() {
            @Override
            public void onRegistrationFailed(NsdServiceInfo serviceInfo, int errorCode) {
                Log.d(TAG, "onRegistrationFailed: " + errorCode);
            }

            @Override
            public void onUnregistrationFailed(NsdServiceInfo serviceInfo, int errorCode) {
                Log.d(TAG, "onUnregistrationFailed: " + errorCode);
            }

            @Override
            public void onServiceRegistered(NsdServiceInfo serviceInfo) {
                Log.d(TAG, "onServiceRegistered: " + serviceInfo + ":");
            }

            @Override
            public void onServiceUnregistered(NsdServiceInfo serviceInfo) {
                Log.d(TAG, "onServiceUnregistered: " + serviceInfo);

            }
        });
    }
}
