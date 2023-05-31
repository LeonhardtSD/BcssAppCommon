package com.icbc.bcss.appcommon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    //云从激活sdk
    private TextView tv_begin_detect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_begin_detect = findViewById(R.id.tv_begin_detect);
        tv_begin_detect.setOnClickListener(this::onViewClicked);
    }

    private void onViewClicked(View view) {
        System.out.println("开始");
        try{
            System.out.println("开始------");
//            String mac=BcssMacUtils.getMac(getApplicationContext());
//            System.out.println("结束------"+mac);
//            BASEyeCoolFaceApi.getVersion();
        }catch (Exception e){
            System.out.println("捕捉到了异常----------------");
            System.out.println(Log.getStackTraceString(e));
        }

    }


}