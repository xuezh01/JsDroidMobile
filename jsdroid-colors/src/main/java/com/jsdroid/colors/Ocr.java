package com.jsdroid.colors;

import android.graphics.Bitmap;
import android.graphics.Rect;

import com.googlecode.tesseract.android.ResultIterator;
import com.googlecode.tesseract.android.TessBaseAPI;

import java.util.ArrayList;
import java.util.List;

public class Ocr {
    static {
        try {
            System.loadLibrary("colors");
        } catch (Exception e) {
        }
    }

    public static void loadLibrary() {
        try {
            System.loadLibrary("colors");
        } catch (Exception e) {
        }
    }

    /**
     * 识别文字
     *
     * @param img      图片
     * @param fonts    字体id数组:[id,id,id...]
     * @param color    文字颜色:0x10101010
     * @param offset   文字色差:0x10101010
     * @param sim      相似度:0.9f
     * @param distance 扫描文字间距:1
     * @return [id, x, y, id, x, y, id, x, y...]
     */
    static native long[] nativeOcr(Bitmap img, long[] fonts, int color, int offset, float sim, int distance);

    public static class Result {
        public String text;
        public long id;
        public int x;
        public int y;
        public int width;
        public int height;

        @Override
        public String toString() {
            return "[" +
                    "text='" + text + '\'' +
                    ", x=" + x +
                    ", y=" + y +
                    ", width=" + width +
                    ", height=" + height +
                    ']';
        }
    }

    private static void fillResult(List<Font> fonts, List<Result> results) {
        for (Font font : fonts) {
            for (Result result : results) {
                if (result.id == font.id) {
                    result.text = font.code;
                    result.width = font.width;
                    result.height = font.height;
                }
                break;
            }
        }
    }


    /**
     * 使用自带的方法识别文字，比较麻烦，速度比较快，可以替换找图方法
     *
     * @param fonts
     * @param img
     * @param color
     * @param offset
     * @param sim
     * @param distance
     * @return
     */
    public static List<Result> ocr(List<Font> fonts, Bitmap img, int color, int offset, float sim, int distance) {
        long font[] = new long[fonts.size()];
        for (int i = 0; i < font.length; i++) {
            font[i] = fonts.get(i).getId();
        }
        List<Result> result = new ArrayList<>();
        long[] ret = Ocr.nativeOcr(img, font, color, offset, sim, distance);
        if (ret == null) {
            return result;
        }
        int count = ret.length / 3;
        for (int i = 0; i < count; i++) {
            Result code = new Result();
            code.id = ret[i * 3];
            code.x = (int) ret[i * 3 + 1];
            code.y = (int) ret[i * 3 + 2];
            result.add(code);
        }
        fillResult(fonts, result);
        return result;
    }

    /**
     * 将traineddata文件放到/sdcard/tessdata文件夹中，例如：/sdcard/tessdata/eng.traineddata
     *
     * @param lang 语言名字，即不带traineddata后缀的文件名字，例如：eng
     * @return
     */
    public static TessBaseAPI createTessApi(String lang) {
        TessBaseAPI tessBaseAPI = new TessBaseAPI();
        tessBaseAPI.init("/sdcard/", lang);
        return tessBaseAPI;
    }

    /**
     * 使用Tess进行文字识别
     *
     * @param api
     * @param img
     * @return
     */
    public static List<Result> tess_ocr(TessBaseAPI api, Bitmap img) {
        api.setImage(img);
        api.getUTF8Text();
        List<Result> results = new ArrayList<>();
        ResultIterator resultIterator = api.getResultIterator();
        resultIterator.begin();
        while (resultIterator.next(TessBaseAPI.PageIteratorLevel.RIL_WORD)) {
            String utf8Text = resultIterator.getUTF8Text(TessBaseAPI.PageIteratorLevel.RIL_WORD);
            Rect rect = resultIterator.getBoundingRect(TessBaseAPI.PageIteratorLevel.RIL_WORD);
            Result result = new Result();
            result.text = utf8Text;
            result.x = rect.left;
            result.y = rect.top;
            result.width = rect.width();
            result.height = rect.height();
            results.add(result);
        }
        return results;
    }

}
