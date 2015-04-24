package com.example.jnjh;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
  

public class shetuanzhuyeActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shetuanzhuye);
		
	    String shetuanname;
		String shetuanjianjie;
		Intent inte = getIntent();
		Bundle name = inte.getExtras();
		shetuanname = inte.getStringExtra("shetuanname");
		shetuanjianjie = inte.getStringExtra("shetuanjianjie");
		
		TextView name1 = (TextView) findViewById(R.id.shetuanmingcheng); 
		TextView jianjie = (TextView) findViewById(R.id.shetuanjieshao); 
		
		name1.setText(shetuanname);
		jianjie.setText(shetuanjianjie);
		
		ImageButton fanhuibutton = (ImageButton) findViewById(R.id.fanhuibutton);
		/* 监听button的事件信息 */
		fanhuibutton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(shetuanzhuyeActivity.this, jinengjieshaoActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
			}
		});
		ImageButton guanzhu = (ImageButton) findViewById(R.id.guanzhu);
		/* 监听button的事件信息 */
		guanzhu.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(shetuanzhuyeActivity.this, guanzhuActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
			}
		});
		
		
	
		
		
		
	}

	
}
  

  
