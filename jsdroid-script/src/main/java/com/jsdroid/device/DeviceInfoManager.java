package com.jsdroid.device;

import android.os.Build;

import com.alibaba.fastjson.JSON;
import com.jsdroid.api.entity.DeviceInfo;
import com.jsdroid.commons.FileUtil;
import com.jsdroid.commons.ScreenUtil;

import java.util.UUID;

public class DeviceInfoManager {
    private static DeviceInfo deviceInfo;

    private static DeviceInfo create() {
        DeviceInfo info = new DeviceInfo();
        info.brand = Build.BRAND;
        info.model = Build.MODEL;
        info.sdk = Build.VERSION.SDK_INT;
        info.abi = Build.CPU_ABI;
        info.screenWidth = ScreenUtil.getNaturalWidth();
        info.screenHeight = ScreenUtil.getNaturalHeight();
        info.dpi = ScreenUtil.getDpi();
        info.uuid = UUID.randomUUID().toString();
        return info;
    }

    public static void init() {
        deviceInfo = create();
        String info = FileUtil.read("/data/local/tmp/deviceInfo");
        if (info == null || info.trim().length() == 0) {
            info = JSON.toJSONString(deviceInfo);
        }
        FileUtil.write("/data/local/tmp/deviceInfo", info);

    }

    public static DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }
}
