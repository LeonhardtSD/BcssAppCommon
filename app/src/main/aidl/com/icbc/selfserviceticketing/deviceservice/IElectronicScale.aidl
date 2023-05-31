// IElectronicScale.aidl
package com.icbc.selfserviceticketing.deviceservice;

// Declare any non-default types here with import statements
import com.icbc.selfserviceticketing.deviceservice.ElectronicScaleListener;
interface IElectronicScale {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
//    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
//            double aDouble, String aString);

    /**
    * 打开电子秤设备
    * @return 1-已经打开设备
    *         0--已经关闭设备
    *         -1--设备操作异常
    * */
    int openESDevice ();

    /**
    * 关闭电子秤设备
    * @return 1-已经打开设备
    *         0--已经关闭设备
    *         -1--设备操作异常
    * */
    int closeESDevice();

    /**
    * 获取电子秤设备当前状态
    * @return 1-已经打开设备
    *         0--已经关闭设备
    *         -1--设备处于异常状态
    * */
    int getESDeviceStatus();


    /**
    * 电子秤设备对当前物品称重（同步）--推荐使用
    *
    * */
    Bundle getWeightByESDevice(in Bundle param);

    /**
    * 电子秤设备对当前物品称重（异步）
    *
    * */
    void getWeightByESDeviceWithAsync(in Bundle param,ElectronicScaleListener listener);
}
