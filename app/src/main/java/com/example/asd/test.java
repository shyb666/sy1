package com.example.asd;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class test extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_regist);
    }

    //用onCreateOptionsMenu（）显示菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options,menu);//getMenuInflater()方法得到MenuInflater
        //调用inflate接收两个参数
        //R.menu.main指调用menu文件下的main资源文件
        return true;//返回true，允许创建的菜单显示,返回false不显示
    }
    //定义菜单响应事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_font_small){
            Toast.makeText(this, "FIRST", Toast.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId()==R.id.action_font_medium){
            Toast.makeText(this, "FIRST", Toast.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId()==R.id.action_font_large){
            Toast.makeText(this, "FIRST", Toast.LENGTH_SHORT).show();
            return true;
    }
        return true;
}}



