package com.example.jnjh;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;   
import java.util.HashMap;     
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.yiwu.jingtai.jingtai;
import com.yiwu.utils.HttpUtils;
import com.yiwu.xiaoxi.adapter.XiaoxiAdapter;
import com.yiwu.xiaoxis.Xiaoxis;

import android.widget.AdapterView;   
import android.widget.AdapterView.OnItemClickListener;   
import android.widget.ListView;   
import android.widget.SimpleAdapter;   
import android.widget.Toast;  

public class stxiaoxinpingtaiActivity extends Activity  implements OnItemClickListener {
	private ListView list; 
	private XiaoxiAdapter adapter;
	private List<Xiaoxis> xiaoxisList;
	
	public String URL = jingtai.URL + "yiwu/stxiaoxipingtai.php";
	
	private Handler getNewsHandler = new Handler(){
		public void handleMessage(android.os.Message msg) {
			String jsonData = (String) msg.obj;
			System.out.println(jsonData);
			try {
				JSONArray jsonArray = new JSONArray(jsonData);
				for (int i=0;i<jsonArray.length();i++){
					JSONObject object = jsonArray.getJSONObject(i);
					String name = object.getString("name");
					String time = object.getString("time");
					String xiaoxi = object.getString("xiaoxi");
					String xiaoxiurl = object.getString("xiaoxiurl");
					xiaoxisList.add(new Xiaoxis(name, time, xiaoxi,xiaoxiurl));
				}
				adapter.notifyDataSetChanged();
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shetuanxiaoxipingtai);
		
		list = (ListView) findViewById(R.id.list);
		xiaoxisList = new ArrayList<Xiaoxis>();
		adapter = new XiaoxiAdapter(this, xiaoxisList);
		
		list.setAdapter(adapter);
		list.setOnItemClickListener(this);
		
		HttpUtils.getGerenzhuyeJson(URL, getNewsHandler);
		
		//-----------------------------------------------------------------Ìø×ª
		Button guanzhushezhi = (Button) findViewById(R.id.guanzhushezhi);
		guanzhushezhi.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(stxiaoxinpingtaiActivity.this, shezhizhuyeActivity.class);
				startActivity(intent);
				stxiaoxinpingtaiActivity.this.finish();
			}
		});
		Button guanzhugeren = (Button) findViewById(R.id.guanzhugeren);
		guanzhugeren.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(stxiaoxinpingtaiActivity.this, gerenzhuyeActivity.class);
				startActivity(intent);
				stxiaoxinpingtaiActivity.this.finish();
			}
		});
		Button guanzhujineng = (Button) findViewById(R.id.guanzhujineng);
		guanzhujineng.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(stxiaoxinpingtaiActivity.this, jinengzhuyeActivity.class);
				startActivity(intent);
				stxiaoxinpingtaiActivity.this.finish();
			}
		});
		//-----------------------------------------------------------------Ìø×ª
	}
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		Xiaoxis xiaoxis = xiaoxisList.get(position);
		Intent intent = new Intent(this, BrowseShetuanxiaoxiActivity.class);
		intent.putExtra("xiaoxiurl", xiaoxis.getXiaoxiurl());
		startActivity(intent);
	}
	
}
  

  
