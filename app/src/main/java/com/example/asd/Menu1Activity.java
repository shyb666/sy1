package com.example.asd;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class Menu1Activity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sy3and3);
        textView = findViewById(R.id.textView);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
if(id==R.id.action_font_small){
    textView.setTextSize(10);
    return true;
}else if(id==R.id.action_font_medium){
    textView.setTextSize(16);
    return true;
}else if(id==R.id.action_font_large){
    textView.setTextSize(20);
    return true;
}else if(id==R.id.action_font_color_red){
    textView.setTextColor(Color.RED);
    return true;
}else if(id==R.id.action_font_color_black){
    textView.setTextSize(Color.BLACK);
    return true;
}else if(id==R.id.action_toast){
    Toast.makeText(this, "这是一个Toast提示", Toast.LENGTH_SHORT).show();
    return true;
}
return true;
    }
}
