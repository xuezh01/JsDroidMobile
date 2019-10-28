package com.jsdroid.app.nsd;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

import com.jsdroid.app.App;

import java.util.ArrayList;
import java.util.List;

public class NsdClient implements NsdManager.DiscoveryListener {
    List<NsdServiceInfo> serviceInfos;

    public NsdClient() {
        serviceInfos = new ArrayList<>();
        NsdManager nsdManager = (NsdManager) App.getInstance().getSystemService(Context.NSD_SERVICE);
        nsdManager.discoverServices(NsdServer.SERVICE_TYPE, NsdManager.PROTOCOL_DNS_SD, this);
    }

    @Override
    public void onStartDiscoveryFailed(String serviceType, int errorCode) {

    }

    @Override
    public void onStopDiscoveryFailed(String serviceType, int errorCode) {

    }

    @Override
    public void onDiscoveryStarted(String serviceType) {

    }

    @Override
    public void onDiscoveryStopped(String serviceType) {

    }

    @Override
    public void onServiceFound(NsdServiceInfo serviceInfo) {
        serviceInfos.add(serviceInfo);

    }

    @Override
    public void onServiceLost(NsdServiceInfo serviceInfo) {
        serviceInfos.remove(serviceInfo);
    }

}

