package com.xxxy.lihang.chap_uint;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class BirthdayDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_demo);

        EditText et_date=findViewById(R.id.et_date);
        EditText et_time=findViewById(R.id.et_time);

        //通过Calendar类把年月日搞出来
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        //给年月日绑定dialog  怎么弹出来的年月日框框   （点击et_date控件）

        et_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //打开一个dialog  年月日的dialog
                DatePickerDialog datePickerDialog = new DatePickerDialog(BirthdayDemoActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        //我们应该把  i i1 i2 显示到et_date上
                        et_date.setText(i+"年"+(i1+1)+"月"+i2+"日");
                    }
                },year, month, day);
                datePickerDialog.show();
            }
        });
        et_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(BirthdayDemoActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        et_time.setText(i+"时"+i1+"分钟");
                    }
                },hour,minute,true);
                timePickerDialog.show();
            }
        });
    }
}