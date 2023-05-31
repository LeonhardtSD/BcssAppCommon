package com.icbc.bcss.commonlib.utils;


import android.os.Environment;
import android.os.Looper;
import android.os.Process;
import android.util.Log;


import com.icbc.bcss.commonlib.utils.sub.SpecialFileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//打印日志
// https://github.com/orhanobut/logger/blob/master/README.md
public class UsefulUtils {
    private static final String TAG= UsefulUtils.class.getSimpleName();

    private static Boolean MYLOG_SWITCH = true; // 日志文件总开关
    private static Boolean MYLOG_WRITE_TO_FILE = true;// 日志写入文件开关
    private static char MYLOG_TYPE = 'v';// 输入日志类型，w代表只输出告警信息等，v代表输出所有信息
    private static int SDCARD_LOG_FILE_SAVE_DAYS = 10;// sd卡中日志文件的最多保存天数

    public static String MYLOG_FILEPACKET="middlelog";//存储日志的文件夹
    public static String MYLOG_FILENAME = "Log.txt";// 本类输出的日志文件名称

    private static String SPACE_SEPARATOR="  "; //每一行日志的间隔距离

    private static SimpleDateFormat myLogSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 日志的输出格式
    private static SimpleDateFormat logfile = new SimpleDateFormat("yyyy-MM-dd");// 日志文件格式
//    public Context context;

    //全路径的目录所在位置
    private static String MYLOG_FILEPACKET_NAME=Environment.getExternalStorageDirectory().getAbsolutePath()+ File.separator+
            "cw"+File.separator+MYLOG_FILEPACKET;

    //日志打印级别及对应打印方法
    public static void w(String tag, Object msg) { // 警告信息
        if(tag==null||msg==null){
            System.out.println("warning---日志打印异常！异常！异常！传入对象是空"+tag+"||"+msg);
            log("日志打印异常warning","warning---日志打印异常！异常！异常！传入对象是空"+tag+"||"+msg,'e');
            return;
        }
        log(tag, msg.toString(), 'w');
    }

    public static void e(String tag, Object msg) { // 错误信息
        if(tag==null||msg==null){
            System.out.println("error---日志打印异常！异常！异常！传入对象是空"+tag+"||"+msg);
            log("日志打印异常error","error---日志打印异常！异常！异常！传入对象是空"+tag+"||"+msg,'e');
            return;
        }
        log(tag, msg.toString(), 'e');
    }

    public static void d(String tag, Object msg) {// 调试信息
        if(tag==null||msg==null){
            System.out.println("debug---日志打印异常！异常！异常！传入对象是空"+tag+"||"+msg);
            log("日志打印异常debug","debug---日志打印异常！异常！异常！传入对象是空"+tag+"||"+msg,'e');
            return;
        }
        log(tag, msg.toString(), 'd');
    }

    public static void i(String tag, Object msg) {//通知信息
        if(tag==null||msg==null){
            System.out.println("info---日志打印异常！异常！异常！传入对象是空"+tag+"||"+msg);
            log("日志打印异常info","info---日志打印异常！异常！异常！传入对象是空"+tag+"||"+msg,'e');
            return;
        }
        log(tag, msg.toString(), 'i');
    }

    public static void v(String tag, Object msg) {//冗余信息
        if(tag==null||msg==null){
            System.out.println("verbose---日志打印异常！异常！异常！传入对象是空"+tag+"||"+msg);
            log("日志打印异常verbose","verbose---日志打印异常！异常！异常！传入对象是空"+tag+"||"+msg,'e');
            return;
        }
        log(tag, msg.toString(), 'v');
    }


    //    //日志打印级别及对应打印方法--String
    public static void w(String tag, String text) {
        if(tag==null||text==null){
            System.out.println("warning---日志打印异常！异常！异常！传入对象是空"+tag+"||"+text);
            log("日志打印异常warning","warning---日志打印异常！异常！异常！传入对象是空"+tag+"||"+text,'e');
            return;
        }
        log(tag, text, 'w');
    }

    public static void e(String tag, String text) {
        if(tag==null||text==null){
            System.out.println("error---日志打印异常！异常！异常！传入对象是空"+tag+"||"+text);
            log("日志打印异常error","error---日志打印异常！异常！异常！传入对象是空"+tag+"||"+text,'e');
            return;
        }
        log(tag, text, 'e');
    }

    public static void d(String tag, String text) {
        if(tag==null||text==null){
            System.out.println("debug---日志打印异常！异常！异常！传入对象是空"+tag+"||"+text);
            log("日志打印异常debug","debug---日志打印异常！异常！异常！传入对象是空"+tag+"||"+text,'e');
            return;
        }
        log(tag, text, 'd');
    }

    public static void i(String tag, String text) {
        if(tag==null||text==null){
            System.out.println("info---日志打印异常！异常！异常！传入对象是空"+tag+"||"+text);
            log("日志打印异常info","info---日志打印异常！异常！异常！传入对象是空"+tag+"||"+text,'e');
            return;
        }
        log(tag, text, 'i');
    }

    public static void v(String tag, String text) {
        if(tag==null||text==null){
            System.out.println("verbose---日志打印异常！异常！异常！传入对象是空"+tag+"||"+text);
            log("日志打印异常verbose","verbose---日志打印异常！异常！异常！传入对象是空"+tag+"||"+text,'e');
            return;
        }
        log(tag, text, 'v');
    }

    /**
     * 根据tag, msg和等级，输出日志
     * @param tag
     * @param msg
     * @param level
     */
    private static void log(String tag, String msg, char level) {
        if (MYLOG_SWITCH) {//日志文件总开关
            if ('e' == level && ('e' == MYLOG_TYPE || 'v' == MYLOG_TYPE)) { // 输出错误信息
                Log.e(tag, msg);
            } else if ('w' == level && ('w' == MYLOG_TYPE || 'v' == MYLOG_TYPE)) {
                Log.w(tag, msg);
            } else if ('d' == level && ('d' == MYLOG_TYPE || 'v' == MYLOG_TYPE)) {
                Log.d(tag, msg);
            } else if ('i' == level && ('d' == MYLOG_TYPE || 'v' == MYLOG_TYPE)) {
                Log.i(tag, msg);
            } else {
                Log.v(tag, msg);
            }
            if (MYLOG_WRITE_TO_FILE)//日志写入文件开关
                writeLogtoFile(String.valueOf(level), tag, msg);
        }
    }

    /**
     * 打开日志文件并写入日志
     * @param mylogtype
     * @param tag
     * @param text
     */
    private static void writeLogtoFile(String mylogtype, String tag, String text) {// 新建或打开日志文件
        //增加获取当前线程Id，以及主线程
//        Long mainid=Looper.getMainLooper().getThread().getId();
        String mainName=Looper.getMainLooper().getThread().getName();
        int currentId= Process.myPid();
        long currentThreadId=Thread.currentThread().getId();
        String threadName=Thread.currentThread().getName();
//        getM
//        Date nowtime = new Date();
//        String needWriteFiel = logfile.format(nowtime);

        //需要打印的完整一行信息
        String fileNameDate= TransNoUtils.getInstance().getDate();
        String currentDateTime=TransNoUtils.getInstance().getTimeStampWithMillSecond();
//        String needWriteMessage =mainName+"   "+"currentId-"+currentId+" "+ myLogSdf.format(nowtime) + "   " + mylogtype + "   " + tag + "   " + text;
        String needWriteMessage=currentDateTime+SPACE_SEPARATOR+mainName+SPACE_SEPARATOR+
                                "["+currentId+"]"+SPACE_SEPARATOR+currentThreadId+"--"+threadName+SPACE_SEPARATOR+
                                mylogtype+SPACE_SEPARATOR+
                                tag+SPACE_SEPARATOR+text;


 //        File dirPath = Environment.getExternalStorageDirectory();
//        File dirsFile = new File(MYLOG_PATH_SDCARD_DIR);
//        Log.v("UsefulUtils","dirPath："+dirPath);
//        File dirsFile = new File(dirPath+File.separator+MYLOG_FILEPACKET_NAME); //自动获取外部存储的路径+自定义文件夹

        //判断是否创建文件夹
        File dirsFile = new File(MYLOG_FILEPACKET_NAME); //自动获取外部存储的路径+自定义文件夹
        if (!dirsFile.exists()){
            dirsFile.mkdirs();
        }

        //Log.i("创建文件","创建文件");
        File file = new File(MYLOG_FILEPACKET_NAME, fileNameDate + MYLOG_FILENAME);// MYLOG_PATH_SDCARD_DIR
        if (!file.exists()) {
            try {
                //在指定的文件夹中创建文件
                file.createNewFile();
            } catch (Exception e) {
//                e.printStackTrace();
                Log.i("---UsefulUtils---","创建文件异常");
                Log.i("---UsefulUtils---","具体原因："+Log.getStackTraceString(e));
                return;
            }
        }

        try {
            FileWriter filerWriter = new FileWriter(file, true);// 后面这个参数代表是不是要接上文件中原来的数据，不进行覆盖
            BufferedWriter bufWriter = new BufferedWriter(filerWriter);
            bufWriter.write(needWriteMessage);
            bufWriter.newLine();
            bufWriter.close();
            filerWriter.close();
        } catch (Exception e) {
//            e.printStackTrace();
            Log.i("---UsefulUtils---","保持日志异常");
            Log.i("---UsefulUtils---","具体原因："+Log.getStackTraceString(e));
        }
    }

    /**
     * 删除制定的日志文件
     */
//    Environment.getExternalStorageDirectory()获取的手机存储路径是/storage/emulated/0
    public static void delFile() {// 删除日志文件
//        String needDelFiel = logfile.format(getDateBefore());
//        File dirPath = Environment.getExternalStorageDirectory();
        String needDelFileDate=TransNoUtils.getInstance().getDate(getDateBefore());
        File dirPath = new File(MYLOG_FILEPACKET_NAME); //自动获取外部存储的路径+自定义文件夹
        File file = new File(dirPath, needDelFileDate + MYLOG_FILENAME);// MYLOG_PATH_SDCARD_DIR
        if (file.exists()) {
            file.delete();
        }
    }

    /**
     * 得到现在时间前的几天日期，用来得到需要删除的日志文件名
     */
    private static Date getDateBefore() {
        Date nowtime = new Date();
        Calendar now = Calendar.getInstance();
        now.setTime(nowtime);
        now.set(Calendar.DATE, now.get(Calendar.DATE) - SDCARD_LOG_FILE_SAVE_DAYS);
        return now.getTime();
    }


/////////////////////////////////////////
    /**
     * 循环删除日志
     */
    public static void delFileByforeach(){
        File dirPath = new File(MYLOG_FILEPACKET_NAME); //自动获取外部存储的路径+自定义文件夹
        File[]  files=dirPath.listFiles();
        if(files==null){
            UsefulUtils.e(TAG,"当前读取的路径为空，具体路径："+MYLOG_FILEPACKET_NAME);
            UsefulUtils.e(TAG,"不进行(人脸)日志文件删除");
            return;
        }

        long currentMills=System.currentTimeMillis();
        for(File temp:files){
            //文件夹也跳过
            if (temp.isDirectory()){
                UsefulUtils.w(TAG,"当前为目录，跳过，具体路径："+temp.getAbsolutePath());
                continue;
            }

            if( !(temp.getName().endsWith(".txt")||temp.getName().endsWith(".log")) ){
                UsefulUtils.w(TAG,"当前文件类型非txt或者非log，跳过处理，具体路径："+temp.getAbsolutePath()+"||"+temp.getName());
                continue;
            }


            //判断长度
            if(temp.getName().length()<10){
                UsefulUtils.e(TAG,"当前文件的文件名长度小于，跳过："+temp.getName());
                continue;
            }

            String name=temp.getName().substring(0,10);
            Date nameDate=TransNoUtils.getInstance().convertDate(name);
            if(nameDate==null){
                continue;
            }

            //当前文件+30天
            Calendar now = Calendar.getInstance();
            now.setTime(nameDate);
            now.set(Calendar.DATE, now.get(Calendar.DATE) + SDCARD_LOG_FILE_SAVE_DAYS);
            long fileMills=now.getTimeInMillis();
            if(fileMills<currentMills){
                UsefulUtils.w(TAG,"删除文件："+temp.getName());
                temp.delete();
            }
        }
    }

    /*
    * 检测cw文件下的所有文件,大于10M就清空
    * @param parentFilePath 文件夹路径
    * */
    public static void cleanTxtWithOverCapacity(String parentFilePath){
        if(parentFilePath==null||parentFilePath.isEmpty()){
            UsefulUtils.e(TAG,"cleanTxtWithOverCapacity--当前路径为空，具体父路径："+parentFilePath);
            return;
        }

        //不为空的情况下，循环cw文件下
        File dirPath=new File(parentFilePath);
        File[]  files=dirPath.listFiles();

        if(files==null){
            UsefulUtils.e(TAG,"当前读取的路径为空，具体路径："+parentFilePath);
            UsefulUtils.e(TAG,"cleanTxtWithOverCapacity不进行日志文件清空");
            return;
        }
        //循环
        for(File temp:files){
            if (temp.isDirectory()){
                UsefulUtils.w(TAG,"当前为目录，跳过，具体路径："+temp.getAbsolutePath());
                continue;
            }

            if( !(temp.getName().endsWith(".txt")||temp.getName().endsWith(".log")) ){
                UsefulUtils.w(TAG,"当前文件类型非txt或者非log，跳过处理，具体路径："+temp.getAbsolutePath()+"||"+temp.getName());
                continue;
            }

            String fullPath=temp.getAbsolutePath();
            //获取文件大小
            long fileSize= SpecialFileUtils.getFileSize(fullPath);
            if(fileSize<1){
                UsefulUtils.w(TAG,"当前文件为空，具体路径："+fullPath);
                continue;
            }

            if(fileSize<=15 * 1024 * 1024L){
                UsefulUtils.w(TAG,"当前文件的大小为："+fileSize+"不需要清空里面的内容，具体路径："+fullPath);
                continue;
            }

            //当前文件大于指定的文件大小
            UsefulUtils.e(TAG,"当前文件的大小为："+fileSize+"清空里面的内容，具体路径："+fullPath);
            SpecialFileUtils.clearInfoForFile(fullPath);
        }
        return;
    }
}
