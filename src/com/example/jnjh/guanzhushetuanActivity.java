package com.example.jnjh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
 

public class guanzhushetuanActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guanzhushetuan);
		
		Button geren = (Button) findViewById(R.id.geren);
		/* ����button���¼���Ϣ */
		geren.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhushetuanActivity.this, guanzhuzhuyeActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
				/* �رյ�ǰ��Activity */
				guanzhushetuanActivity.this.finish();
			}
		});
		Button jineng = (Button) findViewById(R.id.jineng);
		/* ����button���¼���Ϣ */
		jineng.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhushetuanActivity.this, guanzhujinengActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
				/* �رյ�ǰ��Activity */
				guanzhushetuanActivity.this.finish();
			}
		});
		ImageButton fasongxinxi1 = (ImageButton) findViewById(R.id.fasongxinxi1);
		/* ����button���¼���Ϣ */
		fasongxinxi1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhushetuanActivity.this, bianjiActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
			}
		});
		
		ImageButton fasongxinxi3 = (ImageButton) findViewById(R.id.fasongxinxi3);
		/* ����button���¼���Ϣ */
		fasongxinxi3.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhushetuanActivity.this, bianjiActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
			}
		});
		ImageButton fasongxinxi4 = (ImageButton) findViewById(R.id.fasongxinxi4);
		/* ����button���¼���Ϣ */
		fasongxinxi4.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(guanzhushetuanActivity.this, bianjiActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
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
				intent.setClass(guanzhushetuanActivity.this, shetuanzhuyeActivity.class);
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
				intent.setClass(guanzhushetuanActivity.this, shetuanzhuyeActivity.class);
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
				intent.setClass(guanzhushetuanActivity.this, shetuanzhuyeActivity.class);
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
				intent.setClass(guanzhushetuanActivity.this, shetuanzhuyeActivity.class);
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
				intent.setClass(guanzhushetuanActivity.this, shetuanzhuyeActivity.class);
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
				intent.setClass(guanzhushetuanActivity.this, shetuanzhuyeActivity.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
			}
		});
	}

	
}
  

  
