package com.example.jnjh;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.yiwu.jingtai.jingtai;
import com.yiwu.utils.HttpUtils;
import com.yiwu.xiaoxi.adapter.DarenAdapter;
import com.yiwu.xiaoxis.Darens;
import com.yiwu.xiaoxis.Xiaoxis;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.internal.view.menu.MenuBuilder.ItemInvoker;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class jinengdarenActivity extends Activity implements
		OnItemClickListener {

	private ListView list;
	private DarenAdapter adapter;
	private List<Darens> darensList;

	public String URL = jingtai.URL + "yiwu/jinengdaren.php";

	private Handler getDarensHandler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			String jsonData = (String) msg.obj;
			System.out.println(jsonData);
			try {
				JSONArray jsonArray = new JSONArray(jsonData);
				for (int i = 0; i < jsonArray.length(); i++) {
					JSONObject object = jsonArray.getJSONObject(i);
					String name = object.getString("name");
					String intro = object.getString("intro");
					darensList.add(new Darens(name, intro));
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
		setContentView(R.layout.jinengdaren);

		list = (ListView) findViewById(R.id.daren_list);
		darensList = new ArrayList<Darens>();
		adapter = new DarenAdapter(this, darensList);

		list.setAdapter(adapter);
		list.setOnItemClickListener(this);

		HttpUtils.getGerenzhuyeJson(URL, getDarensHandler);

		// ---------------------------------------------------------------------------Ìø×ª
		ImageButton jinengdarenfanhui = (ImageButton) findViewById(R.id.jinengdarenfanhui);
		jinengdarenfanhui.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(jinengdarenActivity.this,
						jinengjieshaoActivity.class);
				startActivity(intent);
				jinengdarenActivity.this.finish();
			}
		});
		// ---------------------------------------------------------------------------Ìø×ª
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position,
			long arg3) {
		Darens darens = darensList.get(position);
		Intent intent = new Intent(this, fangkezhuye.class);
		intent.putExtra("darenName", darens.getName());
		System.out.println(darens.getName());
		startActivity(intent);
	}
}
