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
		/* ����button���¼���Ϣ */
		fanhuibutton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(shetuanzhuyeActivity.this, jinengjieshaoActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
			}
		});
		ImageButton guanzhu = (ImageButton) findViewById(R.id.guanzhu);
		/* ����button���¼���Ϣ */
		guanzhu.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(shetuanzhuyeActivity.this, guanzhuActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
			}
		});
		
		
	
		
		
		
	}

	
}
  

  
