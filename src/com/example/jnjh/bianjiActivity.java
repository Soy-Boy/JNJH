package com.example.jnjh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;  
import android.widget.EditText;
import android.widget.ImageButton;

public class bianjiActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bianjixiaoxi);
		Button fasongbutton = (Button) findViewById(R.id.fasongbutton);
		fasongbutton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				Intent intent = new Intent();
				intent.setClass(bianjiActivity.this, fasongActivity.class);
				startActivity(intent);
				
			}
		});
	}
}
  

  
