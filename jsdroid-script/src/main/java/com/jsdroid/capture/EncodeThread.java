package com.jsdroid.capture;

import android.graphics.Bitmap;
import android.util.Log;

import com.jsdroid.api.IJpgReceiver;
import com.jsdroid.commons.Capture;
import com.jsdroid.commons.ScreenUtil;

import java.io.ByteArrayOutputStream;

public class EncodeThread extends Thread {
    static EncodeThread encodeThread = new EncodeThread();
    IJpgReceiver receiver;
    float scale = 0.6f;
    int quality = 100;
    boolean start;

    public EncodeThread() {
        start();
    }


    @Override
    public void run() {
        while (true) {

            synchronized (this) {
                if (!start) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                    }
                }

            }
            Bitmap img = ScreenUtil.screenshot(scale);
            if (img == null) {
                try {
                    sleep(1000 / 30);
                } catch (InterruptedException e) {
                }
                continue;
            }

            try {
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                img.compress(Bitmap.CompressFormat.JPEG, quality, out);
                try {
                    receiver.onReceive(out.toByteArray());
                } catch (Exception e) {
                    start = false;
                }
            } catch (Throwable e) {
                e.printStackTrace();

            }
        }

    }

    public void startCapture() {
        synchronized (this) {
            start = true;
            this.notifyAll();
        }
    }

    public synchronized static void receiveJpg(final IJpgReceiver receiver, final float scale, final int quality) {
        encodeThread.receiver = receiver;
        encodeThread.quality = quality;
        encodeThread.scale = scale;
        encodeThread.startCapture();

    }
}
