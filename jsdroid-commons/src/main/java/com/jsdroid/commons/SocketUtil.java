package com.jsdroid.commons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class SocketUtil {
    Socket socket;

    public Socket getSocket() {
        return socket;
    }

    BufferedReader reader;

    public SocketUtil(Socket socket) {
        this.socket = socket;
    }

    public SocketUtil(String host, int port) throws UnknownHostException,
            IOException {
        socket = new Socket(host, port);
    }

    public void setTimeout(int timeout) {
        try {
            socket.setSoTimeout(timeout);
        } catch (SocketException e) {
        }
    }

    public synchronized void sendLine(String line) throws IOException {
        OutputStream out = socket.getOutputStream();
        out.write((line + "\n").getBytes());
        out.flush();

    }

    public void close() throws IOException {
        if (socket != null) {
            socket.close();
        }
    }

    public BufferedReader getReader() {
        return reader;
    }

    public String readLine() throws IOException {
        if (reader == null) {
            reader = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
        }
        return reader.readLine();
    }

    public String readLine(String charset) throws IOException {
        if (reader == null) {
            reader = new BufferedReader(new InputStreamReader(
                    socket.getInputStream(), charset));
        }
        return reader.readLine();
    }

}
