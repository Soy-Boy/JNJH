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
		/* ����button���¼���Ϣ */
		jinengwentifanhui.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(jinengwentiActivity.this, jinengjieshaoActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
				/* �رյ�ǰ��Activity */
				jinengwentiActivity.this.finish();
			}
		});
		Button fabu = (Button) findViewById(R.id.fabu);
		/* ����button���¼���Ϣ */
		fabu.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(jinengwentiActivity.this, wentifabuActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
				/* �رյ�ǰ��Activity */
				jinengwentiActivity.this.finish();
			}
		});
	}

	
	
}
  

  
