package com.jsdroid.active.step;

public class InstallStep extends BaseStep {
    boolean skip;

    @Override
    public boolean skip() {
        return skip;
    }

    @Override
    public void run() {
        try {
            getShellInstaller().install();
            skip = true;
        } catch (Exception e) {
            error(e);
        }
    }

}
