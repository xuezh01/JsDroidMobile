package com.android.api;

import android.hardware.display.DisplayManagerGlobal;
import android.view.Display;
import android.view.DisplayInfo;

public class Screens {
    public static DisplayInfo getDisplayInfo() {

        return DisplayManagerGlobal.getInstance().getDisplayInfo(Display.DEFAULT_DISPLAY);
    }

    private static int naturalWidth, naturalHeight, dpi;

    private static void initNaturalSize() {
        DisplayInfo displayInfo = Screens.getDisplayInfo();
        naturalWidth = displayInfo.getNaturalWidth();
        naturalHeight = displayInfo.getNaturalHeight();
        dpi = displayInfo.logicalDensityDpi;
    }

    public static int getNaturalWidth() {
        if (naturalWidth == 0) {
            initNaturalSize();
        }
        return naturalWidth;
    }

    public static int getNaturalHeight() {
        if (naturalHeight == 0) {
            initNaturalSize();
        }
        return naturalHeight;
    }

    public static int getDpi() {
        if (dpi == 0) {
            initNaturalSize();
        }
        return dpi;
    }
    public static int getRotation() {
        return DisplayManagerGlobal.getInstance().getRealDisplay(Display.DEFAULT_DISPLAY).getRotation();
    }

}
