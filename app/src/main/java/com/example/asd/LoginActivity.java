package com.example.asd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.HashMap;
import java.util.Map;

import Const.SomeConst;
import Utils.OkHttpClientUtil;

public class LoginActivity extends AppCompatActivity {

    private Button log_bt;
    private EditText user_act;
    private EditText user_pwd;
    private OkHttpClientUtil okHttpClientUtil=new OkHttpClientUtil();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        log_bt=findViewById(R.id.btnLogin);
        user_act=findViewById(R.id.etUsername);
        user_pwd=findViewById(R.id.etPassword);


        log_bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String account=user_act.getText().toString().trim();
                String pwd=user_pwd.getText().toString().trim();
                login(account,pwd);

            }
        });


    }

    public void showToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

    }

    public void login(String account,String pwd){
        if(account.length()<=0||account==null){
            showToast("请输入账号");
            return ;
        }
        if(pwd.length()<=0||pwd==null){
            showToast("请输入密码");
            return ;
        }

        Map m=new HashMap();
         m.put("username",account);
        m.put("password",pwd);

        String url= SomeConst.BASE_URL+"/login";
        okHttpClientUtil.send_post(url,m);

    }
}