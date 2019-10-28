package com.jsdroid.commons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ShellReader {

    public String output;
    public String error;

    public interface Output {
        void onReadLine(String line);
    }

    public ShellReader(Process process, Output output, Output error) throws InterruptedException {
        new ReaderThread(process.getInputStream(), output);
        new ReaderThread(process.getInputStream(), error);
    }

    class ReaderThread extends Thread {
        InputStream inputStream;
        Output output;

        public ReaderThread(InputStream inputStream, Output output) {
            this.inputStream = inputStream;
            this.output = output;
            start();
        }

        @Override
        public void run() {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                String line;
                while ((line = reader.readLine()) != null) {
                    if (output != null) {
                        output.onReadLine(line);
                    }
                }
            } catch (IOException e) {
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                    }
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
    }

}
