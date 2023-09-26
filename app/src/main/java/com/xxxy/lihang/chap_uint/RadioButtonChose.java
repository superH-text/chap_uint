package com.xxxy.lihang.chap_uint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonChose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_chose);
        //拿到RadioGroup组对象
        RadioGroup rg_text = findViewById(R.id.rg_text);
        //拿到button确定按钮对象
        Button btn_submit = findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //循环遍历组里的每个小项 判断那个小项是被选中的  如果被选中直接取出它的text值
                for (int i = 0; i < rg_text.getChildCount(); i++) {
                    RadioButton radioButton = (RadioButton) rg_text.getChildAt(i);
                    //判断此对象是否被选中
                    if (radioButton.isChecked()) {
                        String text = (String) radioButton.getText();
                        Toast.makeText(RadioButtonChose.this,text,Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}