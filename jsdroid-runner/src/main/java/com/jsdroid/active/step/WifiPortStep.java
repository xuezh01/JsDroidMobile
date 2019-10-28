package com.jsdroid.active.step;

import com.jsdroid.commons.RootHelper;
import com.jsdroid.shell.ShellHelper;

public class WifiPortStep extends BaseStep {
    @Override
    public boolean skip() {
        //如果设备已经root，则跳过
        if (RootHelper.isDeviceRooted()) {
            return true;
        }
        //如果已经开启，则跳过
        return ShellHelper.waitPort(5555, 1);
    }

    @Override
    public void run() {
        print("手机未root,请开启usb调试连接电脑...");
        ShellHelper.waitPort(5555, Integer.MAX_VALUE);
        print("wifi调试已经打开...");
    }

}
