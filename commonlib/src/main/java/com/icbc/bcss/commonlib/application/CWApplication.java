/*
 * Copyright (c) 2019 Cloudwalk, Inc. All rights reserved
 * 项目名称：liveness
 * 文件名称：CWApplication.java
 * Date: 19-7-17 下午2:31
 * Author: Jia
 */

package com.icbc.bcss.commonlib.application;

import android.app.Application;
import android.os.Environment;
import android.support.annotation.Nullable;

import com.icbc.bcss.commonlib.utils.sub.CrashTextUtils;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * Create by Tao on 2019/6/26
 */
public class CWApplication extends Application {
    public static final String TAG = CWApplication.class.getSimpleName();

    private static CWApplication mApp = null;

    public static CWApplication instance() {
        return mApp;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)  // (Optional) Whether to show thread info or not. Default true
                .methodCount(0)         // (Optional) How many method line to show. Default 2
                .methodOffset(7)        // (Optional) Hides internal method calls up to offset. Default 5
//                .logStrategy(customLog) // (Optional) Changes the log strategy to print out. Default LogCat
//                .tag("My custom tag")   // (Optional) Global tag for every log. Default PRETTY_LOGGER
                .build();

        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy) {
            @Override
            public boolean isLoggable(int priority, @Nullable String tag) {
                return true;
            }
        });
//        LeakCanary.install(this);

    }

    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler = new Thread.UncaughtExceptionHandler() {

        @Override
        public void uncaughtException(Thread thread, Throwable ex) {
            String info = null;
            ByteArrayOutputStream baos = null;
            PrintStream printStream = null;
            try {
                baos = new ByteArrayOutputStream();
                printStream = new PrintStream(baos);
                ex.printStackTrace(printStream);
                byte[] data = baos.toByteArray();
                info = new String(data);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (printStream != null) {
                        printStream.close();
                    }
                    if (baos != null) {
                        baos.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
//            LogUtils.LOGI(TAG, "info:" + info);
            System.out.println(TAG+"###info:" + info);
            SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String datetime=dateformat.format(new Date());
            datetime="\r\n"+datetime; //换行符

            //存储路径
//            String filePath= Environment.getExternalStorageDirectory().getAbsolutePath()+ File.separator+
//                    BcssMemberConstant.LOCALLOG_PATH_DEFAULT+File.separator;
//            Utils.writeTxtToFile(datetime, "/sdcard/cw/", "crash.txt");
//            Utils.writeTxtToFile(info, "/sdcard/cw/", "crash.txt");
//            String filePath=BcssMemberConstant.LOCALLOG_PATH_DEFAULT_FULL+File.separator;
            String filePath= Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator +"cw"+File.separator;
            CrashTextUtils.writeTxtToFile(datetime, filePath, "crash.txt");
            CrashTextUtils.writeTxtToFile(info, filePath, "crash.txt");

        }
    };


}
