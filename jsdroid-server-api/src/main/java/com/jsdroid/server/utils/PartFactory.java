package com.jsdroid.server.utils;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class PartFactory {
    public static MultipartBody.Part createPart(String name, File file) {
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/otcet-stream"), file);
        return MultipartBody.Part.createFormData(name, file.getName(), requestBody);
    }

    public static RequestBody createParam(String value) {
        return RequestBody.create(MediaType.parse("text/plain"), value);
    }
}
