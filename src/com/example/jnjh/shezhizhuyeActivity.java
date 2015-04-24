package com.example.jnjh;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shezhizhuyeActivity extends Activity { 

	private SharedPreferences sp = null;
	private SharedPreferences.Editor editor;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shezhizhuye);
		sp = getSharedPreferences("test", MODE_PRIVATE);
		findViewById(R.id.shezhizhuye_zhuxiao).setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String youxiang = sp.getString("youxiang","");
				editor = sp.edit();
				editor.remove("youxiang");
				editor.commit();
				System.out.println("youxiang:"+youxiang);
				Intent intent = new Intent();
				intent.setClass(shezhizhuyeActivity.this,denglu.class);
				startActivity(intent);
				shezhizhuyeActivity.this.finish();
			}
		});
		
		//----------------------------------------------------------------------Ìø×ª
		Button jinengzhuyejineng = (Button) findViewById(R.id.jinengzhuyejineng);
		jinengzhuyejineng.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(shezhizhuyeActivity.this,jinengzhuyeActivity.class);
				startActivity(intent);
				shezhizhuyeActivity.this.finish();
			}
		});
		Button jinengzhuyexiaoxi = (Button) findViewById(R.id.jinengzhuyexiaoxi);
		jinengzhuyexiaoxi.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(shezhizhuyeActivity.this,stxiaoxinpingtaiActivity.class);
				startActivity(intent);
				shezhizhuyeActivity.this.finish();
			}
		});
		Button jinengzhuyegerenzhuye = (Button) findViewById(R.id.jinengzhuyegerenzhuye);
		jinengzhuyegerenzhuye.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(shezhizhuyeActivity.this,gerenzhuyeActivity.class);
				startActivity(intent);
				shezhizhuyeActivity.this.finish();
			}
		});
		//----------------------------------------------------------------------Ìø×ª
	}
}