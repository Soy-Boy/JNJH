package com.example.jnjh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
 

public class guanzhujinengActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guanzhujineng);
		
		Button geren = (Button) findViewById(R.id.geren);
		/* ����button���¼���Ϣ */
		geren.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhujinengActivity.this, guanzhuzhuyeActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
				/* �رյ�ǰ��Activity */
				guanzhujinengActivity.this.finish();
			}
		});
		Button shetuan = (Button) findViewById(R.id.shetuan);
		/* ����button���¼���Ϣ */
		shetuan.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhujinengActivity.this, guanzhushetuanActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
				/* �رյ�ǰ��Activity */
				guanzhujinengActivity.this.finish();
			}
		});
		ImageButton person1 = (ImageButton) findViewById(R.id.person1);
		/* ����button���¼���Ϣ */
		person1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhujinengActivity.this, jinengjieshaoActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
			}
		});
		
		ImageButton person3 = (ImageButton) findViewById(R.id.person3);
		/* ����button���¼���Ϣ */
		person3.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhujinengActivity.this, jinengjieshaoActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
			}
		});
		ImageButton person4 = (ImageButton) findViewById(R.id.person4);
		/* ����button���¼���Ϣ */
		person4.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhujinengActivity.this, jinengjieshaoActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
			}
		});
		Button gerenbutton1 = (Button) findViewById(R.id.gerenbutton1);
		/* ����button���¼���Ϣ */
		gerenbutton1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhujinengActivity.this, jinengjieshaoActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
			}
		});
		Button gerenbutton2 = (Button) findViewById(R.id.gerenbutton2);
		/* ����button���¼���Ϣ */
		gerenbutton2.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhujinengActivity.this, jinengjieshaoActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
			}
		});
		Button gerenbutton3 = (Button) findViewById(R.id.gerenbutton3);
		/* ����button���¼���Ϣ */
		gerenbutton3.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhujinengActivity.this, jinengjieshaoActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
			}
		});
	}
	
}
  

  
