package com.example.jnjh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;  

public class guanzhuActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guanzhuchenggong);
		Button queding = (Button) findViewById(R.id.queding);
		/* ����button���¼���Ϣ */
		queding.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhuActivity.this, gerenzhuyeActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
				/* �رյ�ǰ��Activity */
				guanzhuActivity.this.finish();
			}
		});
		
	}

	
	
}
  

  
