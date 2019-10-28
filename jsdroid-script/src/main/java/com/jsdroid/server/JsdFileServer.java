package com.jsdroid.server;

import com.koushikdutta.async.ByteBufferList;
import com.koushikdutta.async.DataEmitter;
import com.koushikdutta.async.callback.CompletedCallback;
import com.koushikdutta.async.callback.DataCallback;
import com.koushikdutta.async.http.body.AsyncHttpRequestBody;
import com.koushikdutta.async.http.body.FileBody;
import com.koushikdutta.async.http.body.MultipartFormDataBody;
import com.koushikdutta.async.http.body.Part;
import com.koushikdutta.async.http.server.AsyncHttpServer;
import com.koushikdutta.async.http.server.AsyncHttpServerRequest;
import com.koushikdutta.async.http.server.AsyncHttpServerResponse;
import com.koushikdutta.async.http.server.HttpServerRequestCallback;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class JsdFileServer {
    private File saveDir;
    String TAG = "jsd_file_server";

    public JsdFileServer(final String fileDir, int port) {

        this.saveDir = new File(fileDir);
        this.saveDir.mkdirs();
        AsyncHttpServer server = new AsyncHttpServer();
        server.post("/upload", new HttpServerRequestCallback() {
            @Override
            public void onRequest(AsyncHttpServerRequest request, final AsyncHttpServerResponse response) {
                final AsyncHttpRequestBody body = request.getBody();
                if (body instanceof MultipartFormDataBody) {
                    final FileHolder fileHolder = new FileHolder(saveDir);
                    MultipartFormDataBody multipartFormDataBody = (MultipartFormDataBody) body;
                    multipartFormDataBody.setMultipartCallback(new MultipartFormDataBody.MultipartCallback() {
                        @Override
                        public void onPart(final Part part) {
                            if (part.isFile()) {
                                try {
                                    fileHolder.openFileOutput(part.getFilename());
                                } catch (FileNotFoundException e) {
                                }
                                ((MultipartFormDataBody) body).setDataCallback(new DataCallback() {
                                    @Override
                                    public void onDataAvailable(DataEmitter emitter, ByteBufferList bb) {
                                        byte[] allByteArray = bb.getAllByteArray();
                                        fileHolder.write(allByteArray);
                                    }
                                });
                            }
                        }
                    });
                    request.setEndCallback(new CompletedCallback() {
                        @Override
                        public void onCompleted(Exception ex) {
                            fileHolder.close();
                            response.send("ok");
                        }
                    });

                }

            }
        });
        server.get("/up", new HttpServerRequestCallback() {
            @Override
            public void onRequest(AsyncHttpServerRequest request, AsyncHttpServerResponse response) {
                response.send("<form action=\"upload\" method=\"post\" enctype=\"multipart/form-data\">\n" +
                        "    <input type=\"file\" name=\"file1\" />\n" +
                        "    <input type=\"file\" name=\"file2\" />\n" +
                        "    <input type=\"submit\" value=\"上传文件\" />\n" +
                        "    </form>");
            }
        });

        server.directory("/*", this.saveDir);
        server.listen(port);
    }

    class FileHolder {
        File outputDir;

        public FileHolder(File output) {
            this.outputDir = output;
        }

        FileOutputStream outputStream;

        public synchronized void openFileOutput(String filename) throws FileNotFoundException {
            close();
            outputStream = new FileOutputStream(new File(outputDir, filename));
        }

        public synchronized void write(byte[] data) {
            if (outputStream != null) {
                try {
                    outputStream.write(data);
                } catch (IOException e) {
                }
            }
        }

        public synchronized void close() {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                }
                outputStream = null;
            }
        }
    }
}
