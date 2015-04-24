package com.example.jnjh;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import com.example.jnjh.gerenzhuyeActivity.Yibu;
import com.example.net.JSONParser;
import com.yiwu.jingtai.jingtai;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;      
import android.widget.ImageButton; 
import android.widget.TextView;

public class gerenxiangxiziliaoActivity extends Activity {
	private String youxiang;
	JSONParser jsonParser = new JSONParser();
	private String URL = jingtai.URL + "yiwu/xiangxiziliao.php";
	private TextView name;
	private TextView sex;
	private TextView dengji;
	private TextView age;
	private TextView major;
	private TextView QQ;
	private TextView phone;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gerenxiangxiziliao);
		name = (TextView) findViewById(R.id.v9);
		sex = (TextView) findViewById(R.id.v11);
		dengji = (TextView) findViewById(R.id.v5);
		age = (TextView) findViewById(R.id.v6);
		major = (TextView) findViewById(R.id.v12);
		QQ = (TextView) findViewById(R.id.v10);
		phone = (TextView) findViewById(R.id.v8);
		ImageButton xiangxiziliaofanhui = (ImageButton) findViewById(R.id.xiangxiziliaofanhui);
		xiangxiziliaofanhui.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(gerenxiangxiziliaoActivity.this, gerenzhuyeActivity.class);
				startActivity(intent);
				gerenxiangxiziliaoActivity.this.finish();
			}
		});
		SharedPreferences sharedPreferences= getSharedPreferences("test",Activity.MODE_PRIVATE); 
		youxiang = sharedPreferences.getString("youxiang", ""); 
		
		String[] message1 = new String[7];
        Yibu yibu = new Yibu();
			try {
				message1 = yibu.execute().get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
			name.setText("姓名："+message1[0]);
			sex.setText("性别："+message1[1]);
			dengji.setText("等级："+message1[2]);
			age.setText("年龄："+message1[3]);
			major.setText("专业："+message1[4]);
			QQ.setText("QQ："+message1[5]);
			phone.setText("电话："+message1[6]);
	}
class Yibu extends AsyncTask<String, String, String[]> {
		
        protected String[] doInBackground(String... args) {
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("youxiang", youxiang));
           try{
            JSONObject json = jsonParser.makeHttpRequest(URL,
                    "POST", params);
            String[] message = new String[7];
            message[0] = json.getString("name");
            message[1] = json.getString("sex");
            message[2] = json.getString("dengji");
            message[3] = json.getString("age");
            message[4] = json.getString("major");
            message[5] = json.getString("QQ");
            message[6] = json.getString("phone");
            return message; 
           }catch(Exception e){
               e.printStackTrace();
               return null;
           }
        }
      protected void onPostExecute(String[] message) {                  
        }
    }
}
