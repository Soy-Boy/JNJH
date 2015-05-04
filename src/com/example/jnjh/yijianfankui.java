package com.example.jnjh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class yijianfankui extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yijianfankui);
		findViewById(R.id.yijian_fasong).setOnClickListener(new Button.OnClickListener() {
			 
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "·¢ËÍ³É¹¦", Toast.LENGTH_LONG).show();
				Intent intent = new Intent();
				intent.setClass(yijianfankui.this,shezhizhuyeActivity.class);
				startActivity(intent);
			}
		});
	}
	

}
