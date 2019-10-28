package com.jsdroid.adb;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;

import java.io.IOException;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;

public class Test {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InterruptedException {
        Socket socket = new Socket("192.168.1.4", 5555);
        AdbCrypto crypto = AdbCrypto.generateAdbKeyPair(new AdbBase64() {
            @Override
            public String encodeToString(byte[] data) {
                return StringUtils.newStringUtf8(Base64.encodeBase64(data, false));
            }
        });
        AdbConnection adbConnection = AdbConnection.create(socket, crypto);
        adbConnection.connect();
        AdbStream stream = adbConnection.open("shell:echo hello\n echo hello1");
        while (true) {
            byte[] read = stream.read();
            System.out.print(new String(read));
        }

    }
}
