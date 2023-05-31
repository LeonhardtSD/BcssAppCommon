package com.icbc.bcss.commonlib.utils.sub;

public class RandomInt {
    public static String getRandomInt(int n){
        Integer num=1;
        for(int i=1;i<n;i++){
            num=num*10;
        }
        num=(int)(num*Math.random());
        return Lpad(num.toString(),"0",n);
    }

    public static  String Lpad(String i,String fillStr,int lenght){
        if(i==null){
            return null;
        }
        String num=i;
        while(num.length()<lenght){
            num=fillStr+num;
        }
        return num;
    }

}
