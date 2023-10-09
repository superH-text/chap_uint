package com.xxxy.lihang.chap_uint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aintent);
        //1.拿到控件   button editText
        Button btn_a_submit = findViewById(R.id.btn_a_submit);

        EditText et_messageA = findViewById(R.id.et_messageA);

        //2.点击事件   button做点击事件
        btn_a_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //3.通过intent  打开b活动  并携带edittext的输入的数据
                //3.1  new intent
                Intent intent = new Intent(AIntentActivity.this,BIntentActivity.class);

                //3.2  拿到editText的数据并 塞数据
                String msg = et_messageA.getText().toString();
                intent.putExtra("message",msg);
                //3.3  startActivity
                startActivity(intent);
            }
        });
    }
}