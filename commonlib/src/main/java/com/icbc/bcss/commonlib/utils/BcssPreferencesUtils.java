package com.icbc.bcss.commonlib.utils;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/*
* 封装的持久化存储工具
* */
public class BcssPreferencesUtils {
    public BcssPreferencesUtils() {
    }

    public static boolean putString(Context var0, String var1, String var2) {
        SharedPreferences.Editor var10000 = PreferenceManager.getDefaultSharedPreferences(var0).edit();
        var10000.putString(var1, var2);
        return var10000.commit();
    }

    public static String getString(Context var0, String var1) {
        return PreferenceManager.getDefaultSharedPreferences(var0).getString(var1, null);
    }

    public static String getString(Context var0, String var1, String var2) {
        return PreferenceManager.getDefaultSharedPreferences(var0).getString(var1, var2);
    }

    public static boolean putLong(Context var0, String var1, long var2) {
        SharedPreferences.Editor var10000 = PreferenceManager.getDefaultSharedPreferences(var0).edit();
        var10000.putLong(var1, var2);
        return var10000.commit();
    }

    public static boolean putFloat(Context var0, String var1, float var2) {
        SharedPreferences.Editor var10000 = PreferenceManager.getDefaultSharedPreferences(var0).edit();
        var10000.putFloat(var1, var2);
        return var10000.commit();
    }

    public static boolean putInt(Context var0, String var1, int var2) {
        SharedPreferences.Editor var10000 = PreferenceManager.getDefaultSharedPreferences(var0).edit();
        var10000.putInt(var1, var2);
        return var10000.commit();
    }

    public static boolean putBoolean(Context var0, String var1, boolean var2) {
        SharedPreferences.Editor var10000 = PreferenceManager.getDefaultSharedPreferences(var0).edit();
        var10000.putBoolean(var1, var2);
        return var10000.commit();
    }

    public static long getLong(Context var0, String var1) {
        long var2 = -1L;
        return PreferenceManager.getDefaultSharedPreferences(var0).getLong(var1, var2);
    }

    public static int getInt(Context var0, String var1, int var2) {
        return PreferenceManager.getDefaultSharedPreferences(var0).getInt(var1, var2);
    }

    public static float getFloat(Context var0, String var1, float var2) {
        return PreferenceManager.getDefaultSharedPreferences(var0).getFloat(var1, var2);
    }

    public static long getLong(Context var0, String var1, long var2) {
        return PreferenceManager.getDefaultSharedPreferences(var0).getLong(var1, var2);
    }

    public static boolean getBoolean(Context var0, String var1, boolean var2) {
        return PreferenceManager.getDefaultSharedPreferences(var0).getBoolean(var1, var2);
    }

    public static boolean getBoolean(Context var0, String var1) {
        return PreferenceManager.getDefaultSharedPreferences(var0).getBoolean(var1, false);
    }

    public static int getInt(Context var0, String var1) {
        return PreferenceManager.getDefaultSharedPreferences(var0).getInt(var1, 0);
    }

    public static boolean removeSharedPreferenceByKey(Context var0, String var1) {
        SharedPreferences.Editor var10000 = PreferenceManager.getDefaultSharedPreferences(var0).edit();
        var10000.remove(var1);
        return var10000.commit();
    }
}

