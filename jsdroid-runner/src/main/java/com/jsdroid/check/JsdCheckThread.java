package com.jsdroid.check;

import java.util.ArrayList;
import java.util.List;

public class JsdCheckThread extends Thread {
    private List<JsdCheckStep> stepList;
    private JsdCheckActivity activity;

    public JsdCheckThread(JsdCheckActivity activity) {
        this.activity = activity;
        stepList = new ArrayList<>();
    }

    public void addStep(JsdCheckStep step) {
        stepList.add(step);
    }

    @Override
    public void run() {
        super.run();
        for (JsdCheckStep jsdCheckStep : stepList) {
            if (!jsdCheckStep.isOk()) {
                jsdCheckStep.check(activity);
            }
        }
    }
}
