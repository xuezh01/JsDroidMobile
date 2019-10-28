package com.jsdroid.adb;

import android.content.Context;
import android.util.Log;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.List;

public class AdbShell {
    // This implements the AdbBase64 interface required for AdbCrypto
    public static AdbBase64 getBase64Impl() {
        return new AdbBase64() {
            @Override
            public String encodeToString(byte[] data) {
                return StringUtils.newStringUtf8(Base64.encodeBase64(data, false));
            }
        };
    }

    // This function loads a keypair from the specified files if one exists, and if not,
    // it creates a new keypair and saves it in the specified files
    private static AdbCrypto setupCrypto(String pubKeyFile, String privKeyFile)
            throws NoSuchAlgorithmException, InvalidKeySpecException, IOException {
        File pub = new File(pubKeyFile);
        File priv = new File(privKeyFile);
        AdbCrypto c = null;

        // Try to load a key pair from the files
        if (pub.exists() && priv.exists()) {
            try {
                c = AdbCrypto.loadAdbKeyPair(getBase64Impl(), priv, pub);
            } catch (IOException e) {
                // Failed to loop from file
                c = null;
            } catch (InvalidKeySpecException e) {
                // Key spec was invalid
                c = null;
            } catch (NoSuchAlgorithmException e) {
                // RSA algorithm was unsupported with the crypo packages available
                c = null;
            }
        }

        if (c == null) {
            // We couldn't load a key, so let's generate a new one
            c = AdbCrypto.generateAdbKeyPair(getBase64Impl());

            // Save it
            c.saveAdbKeyPair(priv, pub);
            Log.e("adb", "Generated new keypair.");
        } else {
            Log.e("adb", "Loaded existing keypair.");
        }

        return c;
    }

    public interface OnEndListener {
        void onEnd(String result);
    }


    public static boolean shell(Context context, String commands, int timeout, final OnEndListener onEndListener) throws NoSuchAlgorithmException, IOException, InvalidKeySpecException, InterruptedException {
        //结束标志
        AdbCrypto crypto;
        Socket sock;
        final AdbConnection adb;
        crypto = AdbCrypto.loadAdbKeyPair(getBase64Impl(), context);
        sock = new Socket("127.0.0.1", 5555);
        adb = AdbConnection.create(sock, crypto);
        final AdbStream stream;
        adb.connect();
        stream = adb.open("shell:" + commands);
        final Object waitLock = new Object();
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                try {
                    while (!stream.isClosed() && !Thread.currentThread().isInterrupted()) {
                        byte[] read = stream.read();
                        if (read == null) {
                            break;
                        }
                        outputStream.write(read);

                    }
                } catch (Exception e) {
                }
                try {
                    stream.close();
                } catch (Exception e) {
                }
                try {
                    adb.close();
                } catch (Exception e) {
                }

                if (onEndListener != null) {
                    onEndListener.onEnd(outputStream.toString());
                }
                synchronized (waitLock) {
                    waitLock.notifyAll();
                }
            }
        });
        thread.start();

        synchronized (waitLock) {
            try {
                waitLock.wait(timeout);
            } catch (InterruptedException e) {
            }
        }
        //结束线程
        thread.interrupt();
        return true;
    }
}
