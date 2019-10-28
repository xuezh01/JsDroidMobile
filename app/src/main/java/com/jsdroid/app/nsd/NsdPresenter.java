package com.jsdroid.app.nsd;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.util.Log;

import com.jsdroid.app.App;
import com.jsdroid.mvp.presenter.BasePresenter;

class NsdPresenter extends BasePresenter<NsdActivity> implements NsdManager.DiscoveryListener {
    private static final String TAG = NsdPresenter.class.getName();
    NsdManager nsdManager;

    @Override
    protected void onCreate() {
        super.onCreate();
        nsdManager = (NsdManager) App.getInstance().getSystemService(Context.NSD_SERVICE);
        nsdManager.discoverServices("_ipp._tcp", NsdManager.PROTOCOL_DNS_SD, this);
    }

    @Override
    protected void onDestroyed() {
        super.onDestroyed();
        nsdManager.stopServiceDiscovery(this);
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
        Log.d(TAG, "onServiceFound: " + serviceInfo);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                getView().add(serviceInfo);
            }
        });
    }

    @Override
    public void onServiceLost(NsdServiceInfo serviceInfo) {
        Log.d(TAG, "onServiceLost: " + serviceInfo);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                getView().remove(serviceInfo);
            }
        });
    }
}
