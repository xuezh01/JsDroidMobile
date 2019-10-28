package com.jsdroid.uiautomator2.commons;

import android.graphics.Bitmap;

import junit.framework.TestCase;

public class ScreenUtilTest extends TestCase {

    public void testScreenshot() {
        Capture capture = new Capture("haha");
        Bitmap capture1 = capture.capture(1.0f);
        assertNotNull(capture1);
    }
}