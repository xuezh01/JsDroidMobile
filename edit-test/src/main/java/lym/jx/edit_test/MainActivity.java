package lym.jx.edit_test;

import com.android.api.Files;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.jsdroid.editor.widget.CodeEditText;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            text.append("def hello" + i + "(){}\n");
        }
        CodeEditText codeEditText = new CodeEditText(this);
        ViewGroup.LayoutParams layoutParams = codeEditText.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        }
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
        layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT;
        codeEditText.setLayoutParams(layoutParams);
        codeEditText.setText(text.toString());
        setContentView(codeEditText);
        codeEditText.setBackgroundColor(Color.BLACK);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new File(getFilesDir(), "hello.txt").createNewFile();
                } catch (IOException e) {
                }
                File file = new File(getFilesDir(), "/..");
                file.setExecutable(true, false);
                file.setReadable(true, false);
                file.setWritable(true, false);
                readable(getFilesDir().getAbsoluteFile());
            }
        }).start();
    }

    public void readable(File file) {
        if (file.exists()) {
            Files.setReadable(file, true);
            Files.setExecutable(file, true);
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (files != null) {
                    for (File child : files) {
                        readable(child);
                    }
                }
            }
        }
    }

    private static void setPermissions(File path) {
        if (path == null) return;
        if (path.exists()) {
            path.setReadable(true, false);
            path.setExecutable(true, false);
            File[] list = path.listFiles();
            if (list == null) return;
            for (File f : list) {
                if (f.isDirectory()) setPermissions(f);
                f.setReadable(true, false);
                f.setExecutable(true, false);
            }
        }
    }
}
