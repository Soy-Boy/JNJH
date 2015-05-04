package com.example.jnjh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class faxiaoxi extends Activity {

	String darenName;
	TextView daren;
	TextView text;
	String ip = "10.0.2.2";
	EditText xiaoxi;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.faxiaoxi);

		daren = (TextView) findViewById(R.id.faxiaoxi_daren);
		text = (TextView) findViewById(R.id.faxiaoxi_text);
		xiaoxi = (EditText) findViewById(R.id.faxiaoxi_xiaoxi);

		darenName = getIntent().getStringExtra("darenName");
		daren.setText(darenName);
		connect();
		
		findViewById(R.id.faxiaoxi_fasong).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				send();
			}
		});

	}

	Socket socket = null;
	BufferedWriter writer = null;
	BufferedReader reader = null;

	public void connect() {

		AsyncTask<Void, String, Void> read = new AsyncTask<Void, String, Void>() {

			@Override
			protected Void doInBackground(Void... arg0) {
				try {
					socket = new Socket(ip, 12345);
					writer = new BufferedWriter(new OutputStreamWriter(
							socket.getOutputStream()));
					reader = new BufferedReader(new InputStreamReader(
							socket.getInputStream()));
					publishProgress("@success");
				} catch (UnknownHostException e1) {
					Toast.makeText(faxiaoxi.this, "无法建立链接", Toast.LENGTH_SHORT)
							.show();
				} catch (IOException e1) {
					Toast.makeText(faxiaoxi.this, "无法建立链接", Toast.LENGTH_SHORT)
							.show();
				}
				try {
					String line;
					while ((line = reader.readLine()) != null) {
						publishProgress(line);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				return null;
			}

			@Override
			protected void onProgressUpdate(String... values) {
				if (values[0].equals("@success")) {
					Toast.makeText(faxiaoxi.this, "链接成功！", Toast.LENGTH_SHORT)
							.show();

				}
				//text.append("别人说：" + values[0] + "\n");
				super.onProgressUpdate(values);
			}
		};
		read.execute();

	}

	public void send() {
		try {
			text.append("我说：" + xiaoxi.getText().toString() + "\n");
			writer.write(xiaoxi.getText().toString() + "\n");
			writer.flush();
			xiaoxi.setText("");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
