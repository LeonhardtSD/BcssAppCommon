package com.icbc.bcss.commonlib.utils;


import android.util.Log;

import com.icbc.bcss.commonlib.utils.sub.RandomInt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TransNoUtils {
    private static final String TAG=TransNoUtils.class.getSimpleName();

    private static TransNoUtils instance;

    private static TimeZone china=TimeZone.getTimeZone("GMT+08:00");

    public static TransNoUtils getInstance(){
        if(instance==null){
            return new TransNoUtils();
        }
        return instance;
    }

    //默认30+random位长度
    //corpId+17位时间戳+行业标识+随机位数
    public  String getTransNoWithCorpId(String corpId,String industryFull,int randomNum){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        simpleDateFormat.setTimeZone(china);
        String clientTransNoPre = simpleDateFormat.format(new Date());
        //判断industryFull
        if(industryFull==null||industryFull.isEmpty()){
            StringBuilder stringBuilder=new StringBuilder();
            for(int i=0;i<3;i++){
                stringBuilder.append("0");
            }
            industryFull=stringBuilder.toString();
        }
        //随机数五位
        String ran= RandomInt.getRandomInt(randomNum);
        if(ran==null||ran.isEmpty()){
            StringBuilder stringBuilder=new StringBuilder();
            for(int i=1;i<=randomNum;i++){
                stringBuilder.append(i);
            }
            ran=stringBuilder.toString();
        }
        String clientTransNo=corpId+clientTransNoPre+ industryFull+ran;
        return clientTransNo;
    }


    public  String getTransNo(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        simpleDateFormat.setTimeZone(china);
        String cientTransNo = simpleDateFormat.format(new Date());
        String randomNum="3";//三位随机数
        cientTransNo=cientTransNo+ RandomInt.getRandomInt(Integer.parseInt(randomNum));
        return cientTransNo;
    }

    public String getTimeStampWithMillSecond(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        simpleDateFormat.setTimeZone(china);
        String timeStamp =simpleDateFormat.format(new Date());
        return timeStamp;
    }
    public String getTimeStampWithMillSecond(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        simpleDateFormat.setTimeZone(china);
        String timeStamp = simpleDateFormat.format(date);
        return timeStamp;
    }


    public String getTimeStamp(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(china);
        String timeStamp =simpleDateFormat.format(new Date());
        return timeStamp;
    }

    public String getTimeStamp(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(china);
        String timeStamp = simpleDateFormat.format(date);
        return timeStamp;
    }

    //判断
    public Date convertTimeStamp(String date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(china);
        simpleDateFormat.setLenient(false);// 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
        Date result=null;
        try {
            result=simpleDateFormat.parse(date);
        } catch (ParseException e) {
            UsefulUtils.e(TAG,"标准日期时间转换错误，所以即将插入null");
            UsefulUtils.e(TAG,e.toString());
            UsefulUtils.e(TAG, Log.getStackTraceString(e));
            return null;
        }
        return result;
    }

/*日期（不含时间）*/
    public String getDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(china);
        String timeStamp =simpleDateFormat.format(new Date());
        return timeStamp;
    }

    public String getDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(china);
        String timeStamp = simpleDateFormat.format(date);
        return timeStamp;
    }



    //判断
    public Date convertDate(String date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(china);
        simpleDateFormat.setLenient(false);// 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
        Date result=null;
        try {
            result=simpleDateFormat.parse(date);
        } catch (ParseException e) {
            UsefulUtils.e(TAG,"日期转换错误，所以即将插入null");
            UsefulUtils.e(TAG,e.toString());
            UsefulUtils.e(TAG, Log.getStackTraceString(e));
            return null;
        }
        return result;
    }



    /*日期（不含时间）*/
    public String getTimeDetail(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(china);
        String timeStamp =simpleDateFormat.format(new Date());
        return timeStamp;
    }

    public String getTimeDetail(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(china);
        String timeStamp = simpleDateFormat.format(date);
        return timeStamp;
    }

}
