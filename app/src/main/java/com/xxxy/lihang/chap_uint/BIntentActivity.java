package com.xxxy.lihang.chap_uint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.xxxy.lihang.chap_uint.model.User;

import java.util.ArrayList;
import java.util.Map;

public class BIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bintent);
//基本类型的传值
        //如何拿到intent的值
        Intent intent = getIntent();
        //String message = intent.getStringExtra("message");
        //Toast.makeText(BIntentActivity.this,message,Toast.LENGTH_LONG).show();
        //把message的值绑定到  textView上即可
        //TextView tv_b_show = findViewById(R.id.tv_b_show);
        //tv_b_show.setText("A:      "+message);
//对象类型的传输
        //User user = (User) intent.getSerializableExtra("user");
        //String u = String.valueOf(user.getId())+"|"+user.getUsername()+"|"+String.valueOf(user.getAge())+user.getPassword()+user.getAddress();
        //Toast.makeText( BIntentActivity.this,u,Toast.LENGTH_LONG).show();
//对象类型的传输 json的方式传输
        //String user = intent.getStringExtra("user");
        //User user1 = new Gson().fromJson(user, User.class);
        //String u = String.valueOf(user1.getId())+"|"+user1.getUsername()+"|"+String.valueOf(user1.getAge())+user1.getPassword()+user1.getAddress();
        //Toast.makeText( BIntentActivity.this,u,Toast.LENGTH_LONG).show();
//ArrayList的传输
        String str= intent.getStringExtra("list");
        ArrayList<User> list=new Gson().fromJson(str, ArrayList.class );

//Map
        String str1= intent.getStringExtra("map");
        Map<Integer,String> map =new Gson().fromJson(str1, Map.class );

//show
        TextView textView = findViewById(R.id.tv_b_show);
        textView.setText("A:        ArrayList:  "+list+"        HashMap:  "+map);
    }
}