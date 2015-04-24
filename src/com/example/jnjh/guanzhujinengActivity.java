package com.example.jnjh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
 

public class guanzhujinengActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guanzhujineng);
		
		Button geren = (Button) findViewById(R.id.geren);
		/* 监听button的事件信息 */
		geren.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(guanzhujinengActivity.this, guanzhuzhuyeActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				guanzhujinengActivity.this.finish();
			}
		});
		Button shetuan = (Button) findViewById(R.id.shetuan);
		/* 监听button的事件信息 */
		shetuan.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(guanzhujinengActivity.this, guanzhushetuanActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				guanzhujinengActivity.this.finish();
			}
		});
		ImageButton person1 = (ImageButton) findViewById(R.id.person1);
		/* 监听button的事件信息 */
		person1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(guanzhujinengActivity.this, jinengjieshaoActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
			}
		});
		
		ImageButton person3 = (ImageButton) findViewById(R.id.person3);
		/* 监听button的事件信息 */
		person3.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(guanzhujinengActivity.this, jinengjieshaoActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
			}
		});
		ImageButton person4 = (ImageButton) findViewById(R.id.person4);
		/* 监听button的事件信息 */
		person4.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(guanzhujinengActivity.this, jinengjieshaoActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
			}
		});
		Button gerenbutton1 = (Button) findViewById(R.id.gerenbutton1);
		/* 监听button的事件信息 */
		gerenbutton1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(guanzhujinengActivity.this, jinengjieshaoActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
			}
		});
		Button gerenbutton2 = (Button) findViewById(R.id.gerenbutton2);
		/* 监听button的事件信息 */
		gerenbutton2.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(guanzhujinengActivity.this, jinengjieshaoActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
			}
		});
		Button gerenbutton3 = (Button) findViewById(R.id.gerenbutton3);
		/* 监听button的事件信息 */
		gerenbutton3.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(guanzhujinengActivity.this, jinengjieshaoActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
			}
		});
	}
	
}
  

  
