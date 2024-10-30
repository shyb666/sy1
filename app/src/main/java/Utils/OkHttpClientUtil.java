package Utils;

import android.app.DownloadManager;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import Const.SomeConst;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpClientUtil {

    public void send_post(String url_to_post,Map m){
        //第一步，创建okhttpclient
        OkHttpClient client=new OkHttpClient.Builder().build();

       // Map m=new HashMap();
       // m.put("username","admin");
        //m.put("password","123456");
        JSONObject jsonObject=new JSONObject(m);
        String jsonStr =jsonObject.toString();
        RequestBody requestBody=RequestBody.create(MediaType
                .parse("application/json;charset=utf-8"), jsonStr);
        //创建request
        Request request =new Request.Builder()
                .url(url_to_post)
                .addHeader("contentType","application/json;charset=utf-8")
                .post(requestBody)
                .build();
        //创建call回调对象
        final Call call =client.newCall(request);
        //发起请求
        call.enqueue(new Callback() {
            @Override
            //失败回调
            public void onFailure(Call call, IOException e) {
                Log.e("onFailure",e.getMessage());

            }
            //成功回调
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result=response.body().string();


            }
        });

    }

    public void send_get(String url_to_post,Map m){
        //第一步，创建okhttpclient
        OkHttpClient client=new OkHttpClient.Builder().build();

        // Map m=new HashMap();
        // m.put("username","admin");
        //m.put("password","123456");
        JSONObject jsonObject=new JSONObject(m);
        String jsonStr =jsonObject.toString();
        RequestBody requestBody=RequestBody.create(MediaType
                .parse("application/json;charset=utf-8"), jsonStr);
        //创建request
        Request request =new Request.Builder()
                .url(url_to_post)
                .addHeader("contentType","application/json;charset=utf-8")
                .post(requestBody)
                .build();
        //创建call回调对象
        final Call call =client.newCall(request);
        //发起请求
        call.enqueue(new Callback() {
            @Override
            //失败回调
            public void onFailure(Call call, IOException e) {
                Log.e("onFailure",e.getMessage());

            }
            //成功回调
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result=response.body().string();


            }
        });

    }
}
