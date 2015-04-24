package com.example.jnjh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;      
import android.widget.ImageButton; 

public class pingjialiuyanActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gerenpingjialiuyan);
		ImageButton pingjialiuyanfanhui = (ImageButton) findViewById(R.id.pingjialiuyanfanhui);
		/* 监听button的事件信息 */
		pingjialiuyanfanhui.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(pingjialiuyanActivity.this, gerenzhuyeActivity.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				pingjialiuyanActivity.this.finish();
			}
		});
		
	}

	
	
}
  

  
