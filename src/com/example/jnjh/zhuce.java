package com.example.jnjh;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import com.example.net.DialogUtil;
import com.example.net.JSONParser;
import com.yiwu.jingtai.jingtai;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class zhuce extends Activity{
	private ProgressDialog pDialog;
    JSONParser jsonParser = new JSONParser();
    EditText zhuce_youxiang;
    EditText zhuce_mima;
    EditText zhuce_qr_mima;
	Button zhuce;
	ImageButton zhuce_fanhui;
	
	private static String url = jingtai.URL + "yiwu/zhuce.php";
    private static final String TAG_MESSAGE = "message";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zhuce);
		zhuce_youxiang = (EditText)findViewById(R.id.zhuce_youxiang);
		zhuce_mima = (EditText)findViewById(R.id.zhuce_mima);
		zhuce = (Button)findViewById(R.id.zhuce);
		zhuce_qr_mima = (EditText)findViewById(R.id.zhuce_qr_mima);
		
		zhuce.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View view) {
				if(validate()){
	            new Up().execute();
				}
			}
		});
		
		//--------------------------------------------------------��ת
		zhuce_fanhui = (ImageButton)findViewById(R.id.zhuce_fanhui);
        zhuce_fanhui.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent intent = new Intent();
				intent.setClass(zhuce.this, denglu.class);
				startActivity(intent);
				finish();
			}
		});
      //--------------------------------------------------------��ת
        
	}
	private boolean validate()
    {
        String youxiang = zhuce_youxiang.getText().toString().trim();
        if (youxiang.equals(""))
        {
            DialogUtil.showDialog(this, "����û����д����", false);
            return false;
        }
        String mima = zhuce_mima.getText().toString().trim();
        if (mima.equals(""))
        {
            DialogUtil.showDialog(this, "����û����д����", false);
            return false;
        }
        String qr_mima = zhuce_qr_mima.getText().toString().trim();
        if(!mima.equals(qr_mima))
        {
        	DialogUtil.showDialog(this, "������������벻��ȷ", false);
        	return false;
        }
        
        return true;
    }
	
    class Up extends AsyncTask<String, String, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(zhuce.this);
            pDialog.setMessage("����ע��...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }
        protected String doInBackground(String... args) {
            String youxiang = zhuce_youxiang.getText().toString();
            String  mima = zhuce_mima.getText().toString();
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
           //message Ϊ����doInbackground�ķ���ֵ
            Toast.makeText(getApplicationContext(), message, 8000).show();
        }
        }
}
