package com.example.jnjh;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import com.example.net.JSONParser;
import com.yiwu.jingtai.jingtai;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class fangkezhuye extends Activity {

	JSONParser jsonParser = new JSONParser();
	private String URL = jingtai.URL + "yiwu/fangkezhuye.php";
	private String URL1 = jingtai.URL + "yiwu/skillmatch.php";
	TextView name;
	TextView dengji;
	TextView sex;
	TextView age;
	TextView major;
	TextView phone;
	TextView QQ;
	TextView intro;
	ImageButton fanhui;
	Button faxiaoxi;
	Button baishi;
	String jinengName;
	String darenName;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fangkezhuye);
		
		name = (TextView) findViewById(R.id.fangkezhuye_nicheng);
		dengji = (TextView) findViewById(R.id.fangkezhuye_dengji);
		sex = (TextView) findViewById(R.id.fangkezhuye_sex);
		age = (TextView) findViewById(R.id.fangkezhuye_age);
		major = (TextView) findViewById(R.id.fangkezhuye_major);
		phone = (TextView) findViewById(R.id.fangkezhuye_phone);
		QQ = (TextView) findViewById(R.id.fangkezhuye_QQ);
		intro = (TextView) findViewById(R.id.fangkezhuye_qianming);
		faxiaoxi = (Button) findViewById(R.id.fangkezhuye_faxiaoxi);
		baishi = (Button) findViewById(R.id.fangkezhuye_baishi); 
		
		baishi.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				Yibu1 yibu1 = new Yibu1();
				System.out.println("222222222222222222222222222222");
				yibu1.execute();
				System.out.println("3333333333333333333333333333333");
			}
		});
		
		String[] message1 = new String[8];
        Yibu yibu = new Yibu();
			try {
				message1 = yibu.execute().get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
			System.out.println("11111111111");
			System.out.println("22222222");
			name.setText("姓名："+message1[0]);
			dengji.setText("等级："+message1[1]);
			sex.setText("性别："+message1[2]);
			age.setText("年龄："+message1[3]);
			major.setText("专业："+message1[4]);
			phone.setText("电话："+message1[5]);
			QQ.setText("QQ："+message1[6]);
			intro.setText(message1[7]);
	}
	
	class Yibu extends AsyncTask<String, String, String[]> {
		
        protected String[] doInBackground(String... args) {
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            String darenName = getIntent().getStringExtra("darenName");
            System.out.println("darenName:"+darenName);
            params.add(new BasicNameValuePair("name", darenName));
           try{
            JSONObject json = jsonParser.makeHttpRequest(URL,
                    "POST", params);
            String[] message = new String[8];
            message[0] = json.getString("name");
            message[1] = json.getString("dengji");
            message[2] = json.getString("sex");
            message[3] = json.getString("age");
            message[4] = json.getString("major");
            message[5] = json.getString("phone");
            message[6] = json.getString("QQ");
            message[7] = json.getString("intro");
            return message; 
           }catch(Exception e){
               e.printStackTrace();
               return null;
           }
        }
      protected void onPostExecute(String[] message) {                  
        }
    }
	
	class Yibu1 extends AsyncTask<String, String, String> {
		
        protected String doInBackground(String... args) {
        	String message = "";
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            
            jinengName = getIntent().getStringExtra("jinengname");
    		darenName = getIntent().getStringExtra("darenName");
    		SharedPreferences sharedPreferences= getSharedPreferences("test", Activity.MODE_PRIVATE); 
			String youxiang =sharedPreferences.getString("youxiang", "");
			
            params.add(new BasicNameValuePair("darenName", darenName));
            params.add(new BasicNameValuePair("jinengName", jinengName));
            params.add(new BasicNameValuePair("youxiang", youxiang));
            System.out.println(darenName+jinengName+youxiang);
           try{
            JSONObject json = jsonParser.makeHttpRequest(URL1,
                    "POST", params);
            System.out.println("11111111111111111111111111111111111111111111");
            message = json.getString("message");
            return message; 
           }catch(Exception e){
               e.printStackTrace();
               return "";
           }
        }
      protected void onPostExecute(String message) {  
    	  Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
        }
    }
}