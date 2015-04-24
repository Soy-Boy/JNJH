package com.example.jnjh;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.net.JSONParser;
import com.yiwu.jingtai.jingtai;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class fangkezhuye extends Activity {

	JSONParser jsonParser = new JSONParser();
	private String URL = jingtai.URL + "yiwu/fangkezhuye.php";
	TextView name;
	TextView dengji;
	TextView intro;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fangkezhuye);
		
		name = (TextView) findViewById(R.id.fangkezhuye_nicheng);
		dengji = (TextView) findViewById(R.id.fangkezhuye_dengji);
		intro = (TextView) findViewById(R.id.fangkezhuye_qianming);
		
		// 得到达人推荐页面的达人姓名
		String darenName = getIntent().getStringExtra("darenName");
		
		JSONObject object = doInBackground(darenName);
		
		String name1 = null;
		try {
			name1 = object.getString("name");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		name.setText(name1);
		
	}

	public JSONObject doInBackground(String name) {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("name", name));
		try {
			JSONObject json = jsonParser.makeHttpRequest(URL, "POST", params);
			System.out.println(json);
			System.out.println("JSON--------------");
			return json;
		} catch (Exception e) {
			System.out.println("JSON+++++++++++++");
			e.printStackTrace();
			return null;
		}
	}
}