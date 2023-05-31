// ElectronicScaleListener.aidl
package com.icbc.selfserviceticketing.deviceservice;

// Declare any non-default types here with import statements

interface ElectronicScaleListener {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
//    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
//            double aDouble, String aString);

    /**
    * 设备称重后回调
    *
    */
    void onResult(int code, String msg , in Bundle param);
}
