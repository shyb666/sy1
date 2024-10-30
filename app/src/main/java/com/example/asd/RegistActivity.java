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

public class RegistActivity extends AppCompatActivity {

    private Button btn_regist;
    private EditText user_act;
    private EditText user_pwd;
    private EditText user_id;
    private EditText user_sex;
    private EditText user_idno;
    private OkHttpClientUtil okHttpClientUtil=new OkHttpClientUtil();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        btn_regist=findViewById(R.id.btnRegist);
        user_act=findViewById(R.id.etUsername_rt);
        user_pwd=findViewById(R.id.etPassword_rt);
        user_id =findViewById(R.id.etId_rt);
        user_sex=findViewById(R.id.etSex_rt);
        user_idno=findViewById(R.id.etIdNumber_rt);


        btn_regist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String account=user_act.getText().toString().trim();
                String pwd=user_pwd.getText().toString().trim();
                String id=user_id.getText().toString().trim();
                String sex=user_sex.getText().toString().trim();
                String idno=user_idno.getText().toString().trim();
                regist(account,pwd,id,sex,idno);

            }
        });


    }

    public void showToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

    }

    public void regist(String account,String pwd,String id,String sex,String idno){
        if(account.length()<=0||account==null){
            showToast("请输入账号");
            return ;
        }
        if(pwd.length()<=0||pwd==null){
            showToast("请输入密码");
            return ;
        }

        Map m=new HashMap();
        m.put("id",account);
        m.put("password",pwd);
        m.put("password",pwd);
        m.put("password",pwd);
        m.put("password",pwd);


        String url= SomeConst.BASE_URL;
        okHttpClientUtil.send_post(url,m);

    }
}