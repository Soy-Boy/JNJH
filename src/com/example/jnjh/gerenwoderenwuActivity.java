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
		/* ����button���¼���Ϣ */
		woderenwufanhui.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(gerenwoderenwuActivity.this, gerenzhuyeActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
				/* �رյ�ǰ��Activity */
				gerenwoderenwuActivity.this.finish();
			}
		});
		
	}

	
	
}
  

  
