package com.jsdroid.commons;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PixelFormat;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Log;
import android.view.Surface;

import com.android.api.SurfaceControls;

import java.util.ArrayList;
import java.util.List;

//api 19 android4.4
public class Capture {

    private class FireImageThread extends Thread {

        @Override
        public void run() {
            while (true) {
                synchronized (FireImageThread.this) {
                    try {
                        FireImageThread.this.wait();
                    } catch (InterruptedException e) {
                        break;
                    }
                }
                try {
                    for (CaptureListener captureListener : captureListeners) {
                        captureListener.onFrameUpdate(Capture.this);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void fireUpdate() {
            synchronized (FireImageThread.this) {
                FireImageThread.this.notifyAll();
            }
        }
    }

    private int screenWidth;
    private int screenHeight;
    private IBinder display;
    private ImageReader imageReader;
    private Bitmap cache;
    private int cacheWidth;
    private int cacheHeight;
    private HandlerThread handlerThread;
    private Handler handler;
    private FireImageThread fireImageThread;
    private static Capture instance = new Capture();

    public static Capture getInstance() {
        return instance;
    }

    public interface CaptureListener {
        void onFrameUpdate(Capture capture);
    }

    private final List<CaptureListener> captureListeners;

    private Capture() {
        captureListeners = new ArrayList<>();
        handlerThread = new HandlerThread("capture");
        handlerThread.start();
        fireImageThread = new FireImageThread();
        fireImageThread.start();
        display = SurfaceControls.createDisplay("capture", false);
        handler = new Handler(handlerThread.getLooper());
        postCheckImageReader();
    }

    private void postCheckImageReader() {
        handler.post(new Runnable() {
            @Override
            public void run() {
                checkImageReader();
            }
        });
    }

    public void print(Object oj) {
    }

    private void checkImageReader() {
        getScreenSize();
        if (imageReader == null) {
            imageReader = createImageReader();
        } else {
            if (screenWidth != imageReader.getWidth() || screenHeight != imageReader.getHeight()) {
                try {
                    imageReader.close();
                } catch (Throwable e) {
                }
                imageReader = createImageReader();
            }
        }

    }

    public Bitmap capture(float scale) {
        if (cache == null) {
            synchronized (Capture.this) {
                try {
                    Capture.this.wait(1000);
                } catch (InterruptedException e) {
                }
            }
        }
        synchronized (Capture.this) {
            if (cache != null) {
                return scaleBitmap(cache, cacheWidth, cacheHeight, scale);
            }
        }
        return null;
    }

    private Bitmap readBitmap(Image image) {
        Image.Plane[] planes = image.getPlanes();
        Image.Plane plane = planes[0];
        int stride = plane.getPixelStride();
        int rowStride = plane.getRowStride();
        int rowPadding = rowStride - stride * image.getWidth();
        Bitmap bitmap = Bitmap.createBitmap(
                image.getWidth() + rowPadding / stride,
                image.getHeight(), Bitmap.Config.ARGB_8888);
        bitmap.copyPixelsFromBuffer(plane.getBuffer());
        return bitmap;
    }


    private void getScreenSize() {
        int rotation = ScreenUtil.getRotation();
        if (rotation == Surface.ROTATION_0 || rotation == Surface.ROTATION_180) {
            screenWidth = ScreenUtil.getNaturalWidth();
            screenHeight = ScreenUtil.getNaturalHeight();
        } else {
            screenHeight = ScreenUtil.getNaturalWidth();
            screenWidth = ScreenUtil.getNaturalHeight();
        }
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void addListener(CaptureListener captureListener) {
        captureListeners.add(captureListener);
    }


    public void removeListener(CaptureListener captureListener) {
        captureListeners.remove(captureListener);
    }

    private ImageReader createImageReader() {
        ImageReader imageReader = ImageReader.newInstance(screenWidth, screenHeight, PixelFormat.RGBA_8888, 1);

        SurfaceControls.openTransaction();
        SurfaceControls.setDisplaySurface(display, imageReader.getSurface());
        SurfaceControls.setDisplayLayerStack(display, 0);
        SurfaceControls.closeTransaction();

        imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
            @Override
            public void onImageAvailable(ImageReader imageReader) {
                try {
                    Image image = imageReader.acquireLatestImage();
                    if (image != null) {
                        try {
                            synchronized (Capture.this) {
                                if (cache != null) {
                                    cache.recycle();
                                }
                                cacheWidth = image.getWidth();
                                cacheHeight = image.getHeight();
                                Bitmap bitmap = readBitmap(image);
                                if (bitmap == null) {
                                    if (cache != null) {
                                        Canvas canvas = new Canvas(cache);
                                        canvas.drawRGB(0, 0, 0);
                                    }
                                } else {
                                    cache = bitmap;
                                }
                                Capture.this.notifyAll();
                            }
                            if (cache != null) {
                                fireImageThread.fireUpdate();
                            }
                        } finally {
                            image.close();
                        }
                        postCheckImageReader();
                    }

                } catch (Throwable e) {
                    print(ExceptionUtil.dumpException(e));
                }
            }
        }, new Handler(handlerThread.getLooper()));
        return imageReader;
    }


    private Bitmap scaleBitmap(Bitmap bitmap, int originWidth, int originHeight, float scale) {
        if (originWidth == 0 || originHeight == 0) {
            return null;
        }
        if (scale == 1) {
            return Bitmap.createBitmap(bitmap, 0, 0, originWidth, originHeight);
        }
        Matrix matrix = new Matrix();
        matrix.postScale(scale, scale);
        return Bitmap.createBitmap(bitmap, 0, 0, originWidth, originHeight, matrix, false);
    }

}
