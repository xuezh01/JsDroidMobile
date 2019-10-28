package com.jsdroid.active.step;

import com.jsdroid.adb.AdbShell;
import com.jsdroid.commons.RootHelper;
import com.jsdroid.commons.ShellUtil;
import com.jsdroid.shell.ShellHelper;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class ShellPortStep extends BaseStep {
    @Override
    public boolean skip() {
        //如果已经开启，则跳过
        return ShellHelper.waitPort(10666, 1);
    }

    @Override
    public void run() {

        if (RootHelper.isDeviceRooted()) {
            try {
                //启动jsdshell
                ShellUtil.rootShell(getShellInstaller().getShellSoPath(), null);
            } catch (Exception e) {
            }
        } else {
            ShellHelper.waitPort(5555, Integer.MAX_VALUE);
            try {
                AdbShell.shell(getContext(), getShellInstaller().getShellSoPath(),
                        3000, new AdbShell.OnEndListener() {
                            @Override
                            public void onEnd(String result) {
                                if (result != null) {
                                    print(result.trim());
                                }
                            }
                        });
            } catch (Exception e) {
                error(e);
            }
        }
        ShellHelper.waitPort(10666, Integer.MAX_VALUE);
    }
}
