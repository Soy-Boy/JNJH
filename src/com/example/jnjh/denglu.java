package com.example.jnjh;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import com.example.net.DialogUtil;
import com.example.net.JSONParser;
import com.yiwu.jingtai.jingtai;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class denglu extends Activity{
	EditText denglu_youxiang;
	EditText denglu_mima;
	Button denglu_zhuce;
	Button denglu_denglu;
	private ProgressDialog pDialog;
	JSONParser jsonParser = new JSONParser();
	private SharedPreferences sp = null;
	String name = "";
	
	private static String url = jingtai.URL + "yiwu/denglu.php";
    private static final String TAG_MESSAGE = "message";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		sp = getSharedPreferences("test", MODE_PRIVATE);
		name = sp.getString("youxiang", "");
		setContentView(R.layout.denglu);
		if(!name.equals(""))
		{
			Intent intent = new Intent();
			intent.setClass(denglu.this, jinengzhuyeActivity.class);
			startActivity(intent);
			denglu.this.finish();
		}
		else{
		denglu_youxiang = (EditText)findViewById(R.id.denglu_youxiang);
		denglu_mima = (EditText)findViewById(R.id.denglu_mima);
		denglu_zhuce = (Button)findViewById(R.id.denglu_zhuce);
		denglu_zhuce.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(denglu.this, zhuce.class);
				startActivity( intent);
				denglu.this.finish();
			}
		});
		denglu_denglu = (Button)findViewById(R.id.denglu_denglu);
		denglu_denglu.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				if(validate()){
					SharedPreferences mySharedPreferences= getSharedPreferences("test",Activity.MODE_PRIVATE); 
					SharedPreferences.Editor editor = mySharedPreferences.edit(); 
					editor.putString("youxiang",denglu_youxiang.getText().toString());
					editor.commit();
					Intent intent = new Intent();
					intent.setClass(denglu.this, gerenzhuyeActivity.class);
					startActivity( intent);
					denglu.this.finish();
					}
			}
		});
		}
	}
	private boolean validate()
    {
        String youxiang = denglu_youxiang.getText().toString().trim();
        if (youxiang.equals(""))
        {
            DialogUtil.showDialog(this, "您还没有填写邮箱", false);
            return false;
        }
        String mima = denglu_mima.getText().toString().trim();
        if (mima.equals(""))
        {
            DialogUtil.showDialog(this, "您还没有填写密码", false);
            return false;
        }
        String message1 = "";
        Up up = new Up();
			try {
				message1 = up.execute().get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
        if(message1.equals("error"))
        {
        	DialogUtil.showDialog(this, "密码不正确！", false);
        	return false;
        }
        if(message1.equals("none"))
        {
        	DialogUtil.showDialog(this, "账号不存在！", false);
        	return false;
        }
        return true;
    }
	
	class Up extends AsyncTask<String, String, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(denglu.this);
            pDialog.setMessage("正在登陆...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }
        protected String doInBackground(String... args) {
            String youxiang = denglu_youxiang.getText().toString();
            String  mima = denglu_mima.getText().toString();
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("youxiang", youxiang));
            params.add(new BasicNameValuePair("mima", mima));
           try{
            JSONObject json = jsonParser.makeHttpRequest(url,
                    "POST", params);
            String message = json.getString(TAG_MESSAGE);
            return message; 
           }catch(Exception e){
               e.printStackTrace(); 
               return "";   
           }
        }
        protected void onPostExecute(String message) {                  
            pDialog.dismiss();
           //message 为接收doInbackground的返回值
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        }
        }
}
