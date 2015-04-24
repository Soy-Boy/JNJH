package com.example.jnjh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
 

public class jinengwentiActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jinengwenti);
		
		ImageButton jinengwentifanhui = (ImageButton) findViewById(R.id.jinengwentifanhui);
		/* 监听button的事件信息 */
		jinengwentifanhui.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(jinengwentiActivity.this, jinengjieshaoActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				jinengwentiActivity.this.finish();
			}
		});
		Button fabu = (Button) findViewById(R.id.fabu);
		/* 监听button的事件信息 */
		fabu.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(jinengwentiActivity.this, wentifabuActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				jinengwentiActivity.this.finish();
			}
		});
	}

	
	
}
  

  
