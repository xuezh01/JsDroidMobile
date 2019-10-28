package com.jsdroid.box;

import android.graphics.Bitmap;
import android.util.Log;

import com.jsdroid.commons.BitmapUtil;
import com.jsdroid.commons.Capture;
import com.jsdroid.commons.ScreenUtil;
import com.jsdroid.uiautomator2.InteractionController;
import com.jsdroid.uiautomator2.UiDevice;
import com.koushikdutta.async.ByteBufferList;
import com.koushikdutta.async.DataEmitter;
import com.koushikdutta.async.callback.DataCallback;
import com.koushikdutta.async.http.WebSocket;

public class WebScreen implements Capture.CaptureListener {
    WebSocket webSocket;

    public WebScreen(WebSocket webSocket) {
        this.webSocket = webSocket;
        listenEvent();
        try {
            //连接上后发送第一张图片
            screen(Capture.getInstance());
        } catch (Exception e) {
        }
    }

    private void listenEvent() {
        //模拟控制
        webSocket.setDataCallback(new DataCallback() {
            InteractionController touch = UiDevice.getInstance().getInteractionController();

            @Override
            public void onDataAvailable(DataEmitter emitter, ByteBufferList bb) {
                try {
                    int type = bb.get();
                    int x = bb.getShort();
                    int y = bb.getShort();
                    //screenX*scale=x
                    float scale = scale();
                    switch (type) {
                        case 1:
                            touch.touchDown((int) (x / scale + 0.5f), (int) (y / scale + 0.5f));
                            break;
                        case 2:
                            touch.touchMove((int) (x / scale + 0.5f), (int) (y / scale + 0.5f));
                            break;
                        case 3:
                            touch.touchUp((int) (x / scale + 0.5f), (int) (y / scale + 0.5f));
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    //注意此时截屏会不断进行，不管界面有没有更新，需要前往处理
    public void screen(Capture capture) {
        if (webSocket.isOpen()) {
            long t = System.currentTimeMillis();
            //压缩jpg，发送
            Bitmap screenshot = capture.capture(scale());
            if (screenshot != null) {
                byte[] bytes = BitmapUtil.getBytes(screenshot, Bitmap.CompressFormat.JPEG, 80);
                webSocket.send(bytes);

            }
            long l = System.currentTimeMillis() - t - 1000 / 30;
            try {
                if (l > 0) {
                    Thread.sleep(l);
                }
            } catch (InterruptedException e) {
            }
        } else {
            capture.removeListener(this);
        }
    }

    private float scale() {
        try {
            int screenWidth = Capture.getInstance().getScreenWidth();
            int screenHeight = Capture.getInstance().getScreenHeight();
            float scale;
            //横屏缩放到960，竖屏缩放到800
            if (screenWidth > screenHeight) {
                scale = 960f / screenWidth;
            } else {
                scale = 800f / screenHeight;
            }
            if (scale > 1) {
                scale = 1;
            }
            scale = 1;
            return scale;
        } catch (Exception e) {
            return 1f;
        }
    }


    @Override
    public void onFrameUpdate(Capture capture) {
        try {
            screen(capture);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
