package com.icbc.bcss.commonlib.utils.sub;

import android.util.Log;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SpecialFileUtils {
    private static final String TAG = SpecialFileUtils.class.getSimpleName();
    private static SpecialFileUtils INSTANCE = new SpecialFileUtils();

    //默认构造函数
    public SpecialFileUtils() {
    }

    //单例
    public static SpecialFileUtils getInstance() {
        return INSTANCE;
    }




    /**
     * 清空文件内容
     *
     * @param fileName
     */
    public static void clearInfoForFile(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            Log.e(TAG,"清空txt文件，发生异常");
            Log.e(TAG,Log.getStackTraceString(e));
        }
    }


    /**
     * 获取文件大小
     *
     * @param fileName
     */
    public static long getFileSize(String fileName) {
        File file = new File(fileName);
        if (!file.exists() || !file.isFile()) {
            Log.e(TAG, "当前文件不存在：" + fileName);
            return -1;
        }
        return file.length();
    }



}
