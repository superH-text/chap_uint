package com.xxxy.lihang.chap_uint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        View viewByid = findViewById(R.id.btn_tv);
        viewByid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TextViewDemoActivity.class);
                startActivity(intent);
            }
        });
        View viewbyid = findViewById(R.id.btn_et);
        viewbyid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EditTextDemoActivity.class);
                startActivity(intent);
            }
        });
        View viewbyid1 = findViewById(R.id.btn_imgv);
        viewbyid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ImageViewDemoActivity.class);
                startActivity(intent);
            }
        });
        View viewbyid2 = findViewById(R.id.btn_btn);
        viewbyid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ButtonDemoActivity.class);
                startActivity(intent);
            }
        });

        View viewbyid3 = findViewById(R.id.btn_radio);
        viewbyid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RadioButtonDemoActivity.class);
                startActivity(intent);
            }
        });
        View viewbyid4 = findViewById(R.id.btn_radio1);
        viewbyid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RadioButtonChose.class);
                startActivity(intent);
            }
        });


        //多选框
        View viewbyid5 = findViewById(R.id.btn_checkbox);
        viewbyid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CheckBoxDemoActivity.class);
                startActivity(intent);
            }
        });
        View viewbyid6 = findViewById(R.id.btn_datepicker);
        viewbyid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DatePicketDemoActivity.class);
                startActivity(intent);
            }
        });
        View viewbyid7 = findViewById(R.id.btn_chronometer);
        viewbyid7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChronometerDemoActivity.class);
                startActivity(intent);
            }
        });
        View viewbyid8 = findViewById(R.id.btn_birthday);
        viewbyid8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BirthdayDemoActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}