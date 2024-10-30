package com.example.asd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SelectActivity extends AppCompatActivity implements View.OnClickListener {
private Button b1,b2,b3,b4,b5,b6,b7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.first_layout);

       b1=findViewById(R.id.sy2_1);
       b1.setOnClickListener(this);
        b2=findViewById(R.id.sy2_2);
        b2.setOnClickListener(this);
        b3=findViewById(R.id.sy2_3);
        b3.setOnClickListener(this);
        b4=findViewById(R.id.sy3_1);
        b4.setOnClickListener(this);
        b5=findViewById(R.id.sy3_2);
        b5.setOnClickListener(this);
        b6=findViewById(R.id.sy3_3);
        b6.setOnClickListener(this);
        b7=findViewById(R.id.sy3_4);
        b7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.sy2_1){
            Intent intent=new Intent(this,sy2and1.class);
            startActivity(intent);
        }else if(v.getId()==R.id.sy2_2){
            Intent intent=new Intent(this,sy2and2.class);
            startActivity(intent);
        }else if(v.getId()==R.id.sy2_3){
            Intent intent=new Intent(this,sy2and3.class);
            startActivity(intent);
        }else if(v.getId()==R.id.sy3_1){
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }else if(v.getId()==R.id.sy3_2){
            Intent intent=new Intent(this,sy3and2.class);
            startActivity(intent);
        }else if(v.getId()==R.id.sy3_3){
            Intent intent=new Intent(this,LoginActivity.class);
            startActivity(intent);
        }else if(v.getId()==R.id.sy3_4){
            Intent intent=new Intent(this,test.class);
            startActivity(intent);
        }else if(v.getId()==R.id.videotest){
            Intent intent=new Intent(this,LoginActivity.class);
            startActivity(intent);
        }





    }
}