package com.example.jnjh;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import com.example.net.JSONParser;
import com.yiwu.jingtai.jingtai;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
  
public class gerenzhuyeActivity extends Activity {
    private TextView nicheng;
    private TextView dengji;
    private TextView qianming;
	private String URL = jingtai.URL + "yiwu/gerenzhuye.php";
	JSONParser jsonParser = new JSONParser();
	String youxiang;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gerenzhuye);
		nicheng = (TextView)findViewById(R.id.fangkezhuye_nicheng);
		dengji = (TextView)findViewById(R.id.fangkezhuye_dengji);
		qianming = (TextView)findViewById(R.id.fangkezhuye_qianming);
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>跳转功能
		ImageButton guanzhu = (ImageButton) findViewById(R.id.guanzhu);
		guanzhu.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(gerenzhuyeActivity.this, guanzhuActivity.class);
				startActivity(intent);
			}
		});
		Button gerenjineng = (Button) findViewById(R.id.gerenjineng);
		gerenjineng.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(gerenzhuyeActivity.this, jinengzhuyeActivity.class);
				startActivity(intent);
				gerenzhuyeActivity.this.finish();
			}
		});
		Button gerenguanzhu = (Button) findViewById(R.id.gerenguanzhu);
		gerenguanzhu.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(gerenzhuyeActivity.this, stxiaoxinpingtaiActivity.class);
				startActivity(intent);
				gerenzhuyeActivity.this.finish();
			}
		});
		Button gerenshezhi = (Button) findViewById(R.id.gerenshezhi);
		gerenshezhi.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(gerenzhuyeActivity.this, shezhizhuyeActivity.class);
				startActivity(intent);
				gerenzhuyeActivity.this.finish();
			}
		});
		Button xiangxiziliao = (Button) findViewById(R.id.xiangxiziliao);
		xiangxiziliao.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(gerenzhuyeActivity.this, gerenxiangxiziliaoActivity.class);
				startActivity(intent);
			}
		});
		Button pingjialiuyan = (Button) findViewById(R.id.pingjialiuyan);
		pingjialiuyan.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(gerenzhuyeActivity.this, pingjialiuyanActivity.class);
				startActivity(intent);
			}
		});
		Button woderenwu = (Button) findViewById(R.id.woderenwu);
		woderenwu.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(gerenzhuyeActivity.this, gerenwoderenwuActivity.class);
				startActivity(intent);
			}
		});
		Button wodeshoucang = (Button) findViewById(R.id.wodeshoucang);
		wodeshoucang.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(gerenzhuyeActivity.this, guanzhuzhuyeActivity.class);
				startActivity(intent);
			}
		});
		Button faxiaoxi = (Button) findViewById(R.id.faxiaoxi);
		faxiaoxi.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(gerenzhuyeActivity.this, bianjiActivity.class);
				startActivity(intent);
			}
		});
	//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<跳转功能
		
		SharedPreferences sharedPreferences= getSharedPreferences("test",Activity.MODE_PRIVATE); 
		youxiang = sharedPreferences.getString("youxiang", ""); 
		String[] message1 = new String[3];
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
			nicheng.setText(message1[0]);
			dengji.setText(message1[1]);
			qianming.setText(message1[2]);
			
	}
	
	class Yibu extends AsyncTask<String, String, String[]> {
		
        protected String[] doInBackground(String... args) {
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("youxiang", youxiang));
           try{
            JSONObject json = jsonParser.makeHttpRequest(URL,
                    "POST", params);
            String[] message = new String[3];
            message[0] = json.getString("name");
            message[1] = json.getString("dengji");
            message[2] = json.getString("intro");
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