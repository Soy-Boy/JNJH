package com.example.jnjh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class jinengjieshaoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jinengjieshao);
		final String jinengname1;
		String jinengjianjie1;
		Intent inte = getIntent();
		jinengname1 = inte.getStringExtra("jinengname");
		jinengjianjie1 = inte.getStringExtra("jinengjianjie");

		TextView name1 = (TextView) findViewById(R.id.v1);
		TextView jianjie = (TextView) findViewById(R.id.jianjie);

		name1.setText(jinengname1);
		jianjie.setText(jinengjianjie1);

		ImageButton fanhui = (ImageButton) findViewById(R.id.fanhui);
		fanhui.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(jinengjieshaoActivity.this, jinengzhuyeActivity.class);
				startActivity(intent);
				jinengjieshaoActivity.this.finish();
			}
		});
		Button qushetuanba = (Button) findViewById(R.id.qushetuanba);
		qushetuanba.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				String jinengname2;
				Intent inte = getIntent();
				jinengname2 = inte.getStringExtra("jinengname");
				Intent intent = new Intent();
				Bundle bundle = new Bundle();
				bundle.putString("shetuanleibie", jinengname2);
				intent.putExtras(bundle);
				intent.setClass(jinengjieshaoActivity.this, sort_2.class);
				startActivity(intent);
				jinengjieshaoActivity.this.finish();
			}
		});
		ImageButton guanzhu = (ImageButton) findViewById(R.id.guanzhu);
		guanzhu.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(jinengjieshaoActivity.this,guanzhuActivity.class);
				startActivity(intent);
			}
		});

		Button jinengdaren = (Button) findViewById(R.id.jinengdaren);
		jinengdaren.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.putExtra("jinengname", jinengname1);
				intent.setClass(jinengjieshaoActivity.this,jinengdarenActivity.class);
				startActivity(intent);
			}
		});

		Button jinengwenti = (Button) findViewById(R.id.jinengwenti);
		jinengwenti.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(jinengjieshaoActivity.this,jinengwentiActivity.class);
				startActivity(intent);
			}
		});
	}
}
