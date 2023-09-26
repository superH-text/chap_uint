package com.xxxy.lihang.chap_uint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class CheckBoxDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_demo);
        //拿到控件对象  checkbox 4个  button  1个     textview    1个
        CheckBox cb_sing = findViewById(R.id.cb_sing);
        CheckBox cb_dance = findViewById(R.id.cb_dance);
        CheckBox cb_rap = findViewById(R.id.cb_rap);
        CheckBox cb_basketball = findViewById(R.id.cb_basketball);

        Button btn_cb_submit = findViewById(R.id.btn_cb_submit);

        TextView tv_cb_show = findViewById(R.id.tv_cb_show);

        //1.button按钮的点击事件
        btn_cb_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //2.判断四个checkbox是否被选中  如果被选中   拿到选中的值，拼接到一个字符串中  “您的选择是：XX XX XX XX”
                String text_show = "您的选择是：";
                if (cb_sing.isChecked()){
                    text_show += cb_sing.getText().toString() +",";
                }if (cb_dance.isChecked()){
                    text_show += cb_dance.getText().toString() +",";
                }if (cb_rap.isChecked()){
                    text_show += cb_rap.getText().toString() +",";
                }if (cb_basketball.isChecked()){
                    text_show += cb_basketball.getText().toString() +",";
                }
                //3.把第二步 拼接的字符串 显示到textview
                if ("您的爱好是：".equals(text_show)){
                    tv_cb_show.setText(text_show);
                }else {
                    tv_cb_show.setText(text_show.substring(0,text_show.length()-1));
                }
                //Toast.makeText(CheckBoxDemoActivity.this,text_show,Toast.LENGTH_LONG).show();
            }
        });
    }
}