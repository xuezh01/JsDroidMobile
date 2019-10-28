package com.jsdroid.app;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.jsdroid.app.activity.CheckServerActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void testMainActivity() throws IOException {
        // Context of the app under test.
        final Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("com.jsdroid.app", appContext.getPackageName());
        Intent intent = new Intent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClassName(appContext.getPackageName(), CheckServerActivity.class.getName());
        appContext.startActivity(intent);

    }

}
