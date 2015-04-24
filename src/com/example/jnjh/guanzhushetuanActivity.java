package com.example.jnjh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
 

public class guanzhushetuanActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guanzhushetuan);
		
		Button geren = (Button) findViewById(R.id.geren);
		/* 监听button的事件信息 */
		geren.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(guanzhushetuanActivity.this, guanzhuzhuyeActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				guanzhushetuanActivity.this.finish();
			}
		});
		Button jineng = (Button) findViewById(R.id.jineng);
		/* 监听button的事件信息 */
		jineng.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(guanzhushetuanActivity.this, guanzhujinengActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				guanzhushetuanActivity.this.finish();
			}
		});
		ImageButton fasongxinxi1 = (ImageButton) findViewById(R.id.fasongxinxi1);
		/* 监听button的事件信息 */
		fasongxinxi1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(guanzhushetuanActivity.this, bianjiActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
			}
		});
		
		ImageButton fasongxinxi3 = (ImageButton) findViewById(R.id.fasongxinxi3);
		/* 监听button的事件信息 */
		fasongxinxi3.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(guanzhushetuanActivity.this, bianjiActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
			}
		});
		ImageButton fasongxinxi4 = (ImageButton) findViewById(R.id.fasongxinxi4);
		/* 监听button的事件信息 */
		fasongxinxi4.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(guanzhushetuanActivity.this, bianjiActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
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
				intent.setClass(guanzhushetuanActivity.this, shetuanzhuyeActivity.class);
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
				intent.setClass(guanzhushetuanActivity.this, shetuanzhuyeActivity.class);
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
				intent.setClass(guanzhushetuanActivity.this, shetuanzhuyeActivity.class);
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
				intent.setClass(guanzhushetuanActivity.this, shetuanzhuyeActivity.class);
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
				intent.setClass(guanzhushetuanActivity.this, shetuanzhuyeActivity.class);
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
				intent.setClass(guanzhushetuanActivity.this, shetuanzhuyeActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
			}
		});
	}

	
}
  

  
