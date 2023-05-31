package com.icbc.bcss.appcommon.application;


import android.content.Context;
import android.content.Intent;
import android.os.Build;

import com.icbc.bcss.commonlib.application.CWApplication;


public class MyApplication extends CWApplication {
    private static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;

    }

    public static Context getAppContext() {
        return appContext;
    }

}
