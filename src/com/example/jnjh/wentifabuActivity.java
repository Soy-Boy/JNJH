package com.example.jnjh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
 

public class wentifabuActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wentifabu);
		
		Button xiangguan = (Button) findViewById(R.id.xiangguan);
		/* ����button���¼���Ϣ */
		xiangguan.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(wentifabuActivity.this, jinengwentiActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
				/* �رյ�ǰ��Activity */
				wentifabuActivity.this.finish();
			}
		});
	}

	
	
}
  

  
