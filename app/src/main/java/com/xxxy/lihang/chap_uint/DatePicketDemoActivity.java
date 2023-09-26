package com.xxxy.lihang.chap_uint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class DatePicketDemoActivity extends AppCompatActivity {
    int year,month,day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picket_demo);
        //第一步：拿到控件对象
        Button btn_time = findViewById(R.id.btn_time);
        DatePicker dp_time = findViewById(R.id.dp_time);
        //第二步：给datepick对象设置监听事件
            //1拿到 年 月 日
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
            //2给datePick初始化  第一步的 年 月 日
        dp_time.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                DatePicketDemoActivity.this.year = i;
                DatePicketDemoActivity.this.month = i1;
                DatePicketDemoActivity.this.day = i2;
            }
        });
            //3改变datePick的监听事件
        //通过监听事件获取选择的乃年月日  然后通过Toast显示出来
        btn_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = year +"年" +(month+1)+"月"+day+"日";
                Toast.makeText(DatePicketDemoActivity.this,str.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}