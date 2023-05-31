package com.icbc.bcss.commonlib.utils.sub;

import android.util.Log;

import java.io.File;
import java.io.RandomAccessFile;

public class CrashTextUtils {
    public static void writeTxtToFile(String strcontent, String filePath, String fileName) {
        makeFilePath(filePath, fileName);
        String strFilePath = filePath + fileName;
        String strContent = strcontent + System.lineSeparator();

        try {
            File file = new File(strFilePath);
            if (!file.exists()) {
                Log.w("TestFile", "Create the file:" + strFilePath);
                file.getParentFile().mkdirs();
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rwd");
            raf.seek(file.length());
            raf.write(strContent.getBytes());
            raf.close();
        } catch (Exception var7) {
            Log.e("TestFile", "Error on write File:" + var7);
        }

    }

    public static File makeFilePath(String filePath, String fileName) {
        File file = null;
        makeRootDirectory(filePath);

        try {
            file = new File(filePath + fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            Log.e("makeFilePath",var4+"");
        }

        return file;
    }

    public static void makeRootDirectory(String filePath) {
        File file = null;

        try {
            file = new File(filePath);
            if (!file.exists()) {
                file.mkdir();
            }
        } catch (Exception var3) {
            Log.e("error:", var3 + "");
        }

    }
}
