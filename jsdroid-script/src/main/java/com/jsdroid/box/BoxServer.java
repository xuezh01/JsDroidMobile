package com.jsdroid.box;

import android.graphics.Bitmap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jsdroid.api.IJsDroidApp;
import com.jsdroid.api.entity.Log;
import com.jsdroid.api.entity.Script;
import com.jsdroid.commons.BitmapUtil;
import com.jsdroid.commons.Capture;
import com.jsdroid.commons.ScreenUtil;
import com.jsdroid.script.JsDroidScript;
import com.jsdroid.script.JsDroidShellImpl;
import com.jsdroid.script.builder.JsdScriptBuilder;
import com.jsdroid.server2_5.JsdPath2_5;
import com.jsdroid.uiautomator2.InteractionController;
import com.jsdroid.uiautomator2.UiDevice;
import com.jsdroid.uiautomator2.node.Node;
import com.koushikdutta.async.ByteBufferList;
import com.koushikdutta.async.DataEmitter;
import com.koushikdutta.async.callback.DataCallback;
import com.koushikdutta.async.http.Headers;
import com.koushikdutta.async.http.Multimap;
import com.koushikdutta.async.http.WebSocket;
import com.koushikdutta.async.http.body.AsyncHttpRequestBody;
import com.koushikdutta.async.http.body.JSONObjectBody;
import com.koushikdutta.async.http.server.AsyncHttpServer;
import com.koushikdutta.async.http.server.AsyncHttpServerRequest;
import com.koushikdutta.async.http.server.AsyncHttpServerResponse;
import com.koushikdutta.async.http.server.HttpServerRequestCallback;
import com.koushikdutta.async.http.server.UnknownRequestBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxServer {

    public BoxServer(final int port) {
        AsyncHttpServer httpServer = new AsyncHttpServer();
        httpServer.post("/api/installScript", new HttpServerRequestCallback() {
            @Override
            public void onRequest(AsyncHttpServerRequest request, AsyncHttpServerResponse response) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("state", "err");
                AsyncHttpRequestBody body = request.getBody();
                if (body instanceof JSONObjectBody) {
                    org.json.JSONObject json = (org.json.JSONObject) body.get();
                    try {
                        IJsDroidApp defaultApp = JsDroidShellImpl.getInstance().getDefaultApp();
                        String file = json.getString("file");
                        String pkg = defaultApp.install(file);
                        jsonObject.put("state", "ok");
                        jsonObject.put("pkg", pkg);
                    } catch (Exception e) {
                        jsonObject.put("err", e.getMessage());
                    }
                }
                response.send("application/json", jsonObject.toString());
            }
        });
        httpServer.post("/api/uninstallScript", new HttpServerRequestCallback() {
            @Override
            public void onRequest(AsyncHttpServerRequest request, AsyncHttpServerResponse response) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("state", "err");
                AsyncHttpRequestBody body = request.getBody();
                if (body instanceof JSONObjectBody) {
                    org.json.JSONObject json = (org.json.JSONObject) body.get();
                    try {
                        IJsDroidApp defaultApp = JsDroidShellImpl.getInstance().getDefaultApp();
                        String pkg = json.getString("pkg");
                        defaultApp.uninstall(pkg);
                        jsonObject.put("state", "ok");
                    } catch (Exception e) {
                        jsonObject.put("err", e.getMessage());
                    }
                }
                response.send("application/json", jsonObject.toString());
            }
        });
        httpServer.post("/api/runScript", new HttpServerRequestCallback() {
            @Override
            public void onRequest(AsyncHttpServerRequest request, AsyncHttpServerResponse response) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("state", "err");
                AsyncHttpRequestBody body = request.getBody();
                if (body instanceof JSONObjectBody) {
                    org.json.JSONObject json = (org.json.JSONObject) body.get();
                    try {
                        IJsDroidApp defaultApp = JsDroidShellImpl.getInstance().getDefaultApp();
                        String defaultAppPkg = defaultApp.getPkg();
                        String type = json.getString("type");
                        if ("js".equals(type)) {
                            String code = json.getString("code");
                            JsDroidShellImpl.getInstance().runJs(defaultAppPkg, code);
                        } else if ("groovy".equals(type)) {
                            String code = json.getString("code");
                            JsDroidShellImpl.getInstance().runGroovy(defaultAppPkg, code);
                        } else {
                            String pkg = json.getString("pkg");
                            defaultApp.runScript(pkg);
                        }
                        jsonObject.put("state", "ok");
                    } catch (Exception e) {
                        jsonObject.put("err", e.getMessage());
                    }
                }
                response.send("application/json", jsonObject.toString());
            }
        });
        httpServer.get("/api/stopScript", new HttpServerRequestCallback() {
            @Override
            public void onRequest(AsyncHttpServerRequest request, AsyncHttpServerResponse response) {
                try {
                    IJsDroidApp defaultApp = JsDroidShellImpl.getInstance().getDefaultApp();
                    defaultApp.stopScript();
                } catch (Exception e) {
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("state", "err");
                    jsonObject.put("err", e.getMessage());
                    response.send("application/json", jsonObject.toString());
                }
            }
        });
        httpServer.get("/api/scriptList", new HttpServerRequestCallback() {
            @Override
            public void onRequest(AsyncHttpServerRequest request, AsyncHttpServerResponse response) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("state", "err");
                try {
                    IJsDroidApp defaultApp = JsDroidShellImpl.getInstance().getDefaultApp();
                    List<Script> scriptList = defaultApp.getScriptList();
                    jsonObject.put("state", "ok");
                    jsonObject.put("scripts", JSON.toJSON(scriptList));
                } catch (Exception e) {
                    jsonObject.put("err", e.getMessage());
                }
                response.send("application/json", jsonObject.toString());

            }
        });

        httpServer.get("/api/node", new HttpServerRequestCallback() {
            @Override
            public void onRequest(AsyncHttpServerRequest request, AsyncHttpServerResponse response) {
                com.alibaba.fastjson.JSONObject json = new com.alibaba.fastjson.JSONObject();
                json.put("state", "err");
                try {
                    //获取节点的json信息
                    List<Node> nodes = UiDevice.getInstance().getNodes();
                    json.put("state", "ok");
                    json.put("nodes", JSON.toJSON(nodes));
                } catch (Exception e) {
                    json.put("err", e.getMessage());
                }
                response.send("application/json", json.toString());

            }
        });
        httpServer.get("/api/snap", new HttpServerRequestCallback() {
            @Override
            public void onRequest(AsyncHttpServerRequest request, AsyncHttpServerResponse response) {
                Bitmap screenshot = ScreenUtil.screenshot(ScreenUtil.getScale(300));
                if (screenshot != null) {
                    byte[] bytes = BitmapUtil.getBytes(screenshot, Bitmap.CompressFormat.JPEG, 80);
                    response.send("image/jpeg", bytes);
                }
            }
        });
        httpServer.get("/api/cap", new HttpServerRequestCallback() {
            @Override
            public void onRequest(AsyncHttpServerRequest request, AsyncHttpServerResponse response) {
                //获取截屏
                Bitmap cap = Capture.getInstance().capture(1.0f);
                Multimap query = request.getQuery();
                ScreenUtil.screenshot(1.0f);
                if (query != null) {
                    try {
                        int left = Integer.parseInt(query.getString("left"));
                        int top = Integer.parseInt(query.getString("top"));
                        int right = Integer.parseInt(query.getString("right"));
                        int bottom = Integer.parseInt(query.getString("bottom"));
                        assert cap != null;
                        cap = Bitmap.createBitmap(cap,
                                left,
                                top,
                                right - left,
                                bottom - top);
                    } catch (Throwable e) {
                    }
                } else {
                }
                if (cap != null) {
                    byte[] bytes = BitmapUtil.getBytes(cap, Bitmap.CompressFormat.PNG, 100);
                    response.send("image/png", bytes);
                } else {
                    Map<String, String> result = new HashMap<>();
                    result.put("err", "截屏失败~");
                    result.put("state", "err");
                    response.send("application/json", JSON.toJSONString(result));
                }
            }
        });

        httpServer.get("/api/log", new HttpServerRequestCallback() {
            @Override
            public void onRequest(AsyncHttpServerRequest request, AsyncHttpServerResponse response) {
                //获取最新5条日志
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("state", "err");
                try {
                    IJsDroidApp defaultApp = JsDroidShellImpl.getInstance().getDefaultApp();
                    List<Log> logs = defaultApp.getLog();
                    jsonObject.put("state", "ok");
                    jsonObject.put("logs", JSON.toJSON(logs));
                } catch (Exception e) {
                    jsonObject.put("err", e.getMessage());
                }
                response.send("application/json", jsonObject.toString());
            }
        });
        httpServer.post("/api/js", new HttpServerRequestCallback() {
            @Override
            public void onRequest(AsyncHttpServerRequest request, AsyncHttpServerResponse response) {
                //获取最新5条日志
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("state", "err");
                try {
                    String jsCode = request.getBody().toString();
                    JsdScriptBuilder.JsCodeBuilder scriptBuilder = new JsdScriptBuilder.JsCodeBuilder();
                    scriptBuilder.setAppPkg("com.jsdroid.app");
                    scriptBuilder.setCode(jsCode);
                    Object obj = scriptBuilder.build().run();
                    jsonObject.put("state", "ok");
                    jsonObject.put("logs", JSON.toJSON(obj));
                } catch (Exception e) {
                    jsonObject.put("err", e.getMessage());
                }
                response.send("application/json", jsonObject.toString());
            }
        });
        httpServer.websocket("/api/screen", new AsyncHttpServer.WebSocketRequestCallback() {
            @Override
            public void onConnected(WebSocket webSocket, AsyncHttpServerRequest request) {
                Capture.getInstance().addListener(new WebScreen(webSocket));

            }
        });


        httpServer.listen(port);
    }
}
