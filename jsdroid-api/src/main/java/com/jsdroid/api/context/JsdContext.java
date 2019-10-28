package com.jsdroid.api.context;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;

import com.jsdroid.commons.FileUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsdContext {
    private List<File> directories;
    private ClassLoader classLoader = ClassLoader.getSystemClassLoader();

    public JsdContext() {
        directories = new ArrayList<>();
    }

    public JsdContext(File resDir) {
        this();
        addDirectory(resDir);
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public void addDirectory(File directory) {
        if (directories.contains(directory)) {
            directories.remove(directory);
        }
        directories.add(directory);
    }

    public void removeDirectory(File directory) {
        directories.remove(directory);
    }


    public String read(String path) {
        InputStream resourceAsStream = open(path);
        return FileUtil.read(resourceAsStream);
    }

    public InputStream open(String path) {
        if (new File(path).exists()) {
            try {
                return new FileInputStream(new File(path));
            } catch (FileNotFoundException e) {
            }
        } else if (new File(path).getAbsoluteFile().exists()) {
            try {
                return new FileInputStream(new File(path).getAbsoluteFile());
            } catch (FileNotFoundException e) {
            }
        }
        for (int i = 0; i < directories.size(); i++) {
            File directory = directories.get(directories.size() - i - 1);
            File file = new File(directory, path);
            if (file.exists()) {
                try {
                    return new FileInputStream(file);
                } catch (FileNotFoundException e) {
                }
            }
        }
        try {
            InputStream resourceAsStream = classLoader.getResourceAsStream(path);
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
            resourceAsStream = classLoader.getResourceAsStream("assets/" + path);
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Bitmap getImage(String url) {
        InputStream input = null;
        try {
            input = open(url);
            return BitmapFactory.decodeStream(input);
        } catch (Exception e) {
        } finally {
            try {
                input.close();
            } catch (Exception e) {
            }
        }
        return null;
    }

    public Bitmap getImage(String url, int width, int height) {
        Bitmap image = getImage(url);
        if (image != null) {
            Matrix m = new Matrix();
            m.postScale(width * 1.0f / image.getWidth(), height * 1.0f / image.getHeight());
            return Bitmap.createBitmap(image, 0, 0, image.getWidth(), image.getHeight(), m, true);
        }
        return null;
    }

    private static Map<String, JsdContext> contextMap = new HashMap<>();
    public static JsdContext DEFAULT = getInstance("default");

    public static JsdContext getInstance(String pkg) {
        if (contextMap.containsKey(pkg)) {
            return contextMap.get(pkg);
        }
        synchronized (contextMap) {
            if (contextMap.containsKey(pkg)) {
                return contextMap.get(pkg);
            }
            JsdContext jsdContext = new JsdContext();
            contextMap.put(pkg, jsdContext);
            return jsdContext;
        }
    }
}
