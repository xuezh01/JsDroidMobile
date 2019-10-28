package com.jsdroid.server;

import com.jsdroid.commons.FileUtil;
import com.jsdroid.script.JsDroidScript;
import com.jsdroid.script.builder.JsdScriptBuilder;
import com.jsdroid.script.JsGlobal;

import java.io.IOException;
import java.util.Map;

public class JsdHttpServer extends NanoHTTPD {
    enum JsType {
        JSD, JS, GROOVY, JS_FILE, GROOVY_FILE;
    }

    public JsdHttpServer(int port) {
        super(port);
    }

    @Override
    public Response serve(IHTTPSession session) throws IOException {
        Object result = null;
        JsType type = null;
        String uri = session.getUri();
        if (uri.contains("js_file")) {
            type = JsType.JS_FILE;
        } else if (uri.contains("groovy_file")) {
            type = JsType.GROOVY_FILE;
        } else if (uri.contains("jsd")) {
            type = JsType.JSD;
        } else if (uri.contains("groovy")) {
            type = JsType.GROOVY;
        } else if (uri.contains("js")) {
            type = JsType.JS;
        }
        Map<String, String> headers = session.getHeaders();
        String len = headers.get("content-length");
        byte[] data = new byte[Integer.parseInt(len)];
        session.getInputStream().read(data);
        String content = new String(data, "UTF-8");

        try {
            switch (type) {
                case JS: {
                    result = JsGlobal.getInstance().runJs(content.trim());
                    break;
                }

                case JSD: {
//                    JsDroidScript fromApk = JsdScriptBuilder.buildFromApk(content.trim());
//                    result = fromApk.run();
                    break;
                }

                case GROOVY: {
//                    JsDroidScript fromText = JsdScriptBuilder.buildFromText(content.trim());
//                    result = fromText.run();
                    break;
                }

                case JS_FILE: {
                    String read = FileUtil.read(content.trim());
                    result = JsGlobal.getInstance().runJs(read);
                    break;
                }

                case GROOVY_FILE: {
//                    String read = FileUtil.read(content.trim());
//                    JsDroidScript fromText = JsdScriptBuilder.buildFromText(read);
//                    result = fromText.run();
                    break;
                }

            }
        } catch (Throwable e) {
            result = "error:" + e.getMessage();
        }
        return newFixedLengthResponse(result + "");
    }
}
