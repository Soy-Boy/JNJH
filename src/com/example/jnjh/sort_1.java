package com.example.jnjh;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import com.sharpandroid.service.DatabaseHelper;

import android.view.LayoutInflater;
import android.view.View;  

import java.util.List;
import android.content.Intent;
import android.widget.Toast; 
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ListView;


public class sort_1 extends Activity {
	public SQLiteDatabase sq;
	private ListView list;
	public ArrayList<HashMap<String, String>> arr;
	public Integer id;
	public String jinengleibie;
	private LayoutInflater inflater;
	private LinearLayout list_form;
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sort1_item);
		list = (ListView) findViewById(R.id.list);
       //查询数据库里面的内容
		Intent inte = getIntent();
		Bundle name = inte.getExtras();
		jinengleibie = inte.getStringExtra("jinengleibie");
		
		    DatabaseHelper dbHelper = new DatabaseHelper(this);
		    sq = dbHelper.getReadableDatabase();
			final Cursor cs= sq.rawQuery("select id, name,jianjie,inSort_2 from sort3 where inSort_2=?",new String[]{String.valueOf(jinengleibie)});		
        //把内容添加到List里面显示出来
		list.setAdapter(new CursorAdapter(this, cs));
		

		      
		list.setOnItemClickListener(new OnItemClickListener(){   
			           @Override  
			           public void onItemClick(AdapterView<?> parent, View view, int position,
		                         long id) {
		                 // TODO Auto-generated method stub
			        	   

			        	   cs.moveToPosition(position);
			        	   String name = cs.getString(cs.getColumnIndex("name"));
			               String jianjie = cs.getString(cs.getColumnIndex("jianjie"));   
			                Toast.makeText(getApplicationContext(),    
			                        "你选择了"+name+"。",   
			                       Toast.LENGTH_SHORT).show();
			                
			                 Intent intent=new Intent();
			            	 Bundle bundle = new Bundle();
			    	         bundle.putString("jinengname",name);
			    	         bundle.putString("jinengjianjie",jianjie);
			    	         intent.putExtras(bundle);	 
			                intent.setClass(sort_1.this,jinengjieshaoActivity.class);
		                    startActivity(intent);
		         }
			           
			               
			        });   

		
	}
}
