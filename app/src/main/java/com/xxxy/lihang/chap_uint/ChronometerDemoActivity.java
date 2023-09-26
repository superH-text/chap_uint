package com.xxxy.lihang.chap_uint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class ChronometerDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chronometer_demo);
        //拿到所有控件
        Button btn_start =findViewById(R.id.btn_start);
        Button btn_stop =findViewById(R.id.btn_stop);
        Button btn_restart =findViewById(R.id.btn_restart);
        Chronometer  chr_time = findViewById(R.id.chr_time);
        //按钮  开始
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chr_time.start();
            }
        });
        //按钮  停止
        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chr_time.stop();
            }
        });
        //按钮  重置
        btn_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chr_time.setBase(SystemClock.elapsedRealtime());
            }
        });
    }
}