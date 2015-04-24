package com.example.jnjh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;      
import android.widget.ImageButton; 

public class gerenwoderenwuActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gerenwoderenwu);
		ImageButton woderenwufanhui = (ImageButton) findViewById(R.id.woderenwufanhui);
		/* 监听button的事件信息 */
		woderenwufanhui.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(gerenwoderenwuActivity.this, gerenzhuyeActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				gerenwoderenwuActivity.this.finish();
			}
		});
		
	}

	
	
}
  

  
