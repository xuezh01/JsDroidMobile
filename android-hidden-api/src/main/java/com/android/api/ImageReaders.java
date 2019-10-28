package com.android.api;

import android.media.Image;
import android.media.ImageReader;

public class ImageReaders {
    public static Image acquireNextImageNoThrowISE(ImageReader imageReader) {
        return imageReader.acquireNextImageNoThrowISE();
    }
}
