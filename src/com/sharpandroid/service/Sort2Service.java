package com.sharpandroid.service;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.data.Sort1;
import com.example.data.Sort2;

public class Sort2Service {
	private DatabaseHelper databaseHelper;
	private Context context;
	public Sort2Service(Context context){
		this.context=context;
		databaseHelper=new DatabaseHelper(context);
	}
	//数据的查询方法
		public List<Sort2> find(Integer id){
			List<Sort2> sort2s = new ArrayList<Sort2>();
			SQLiteDatabase db=databaseHelper.getReadableDatabase();
			Cursor cursor=db.rawQuery("select id, name,inSort_1 from sort2 where inSort_1=?",new String[]{String.valueOf(id)});
			while(cursor.moveToNext()){
				Sort2 sort2=new Sort2();
				sort2.setName(cursor.getString(1));
				sort2s.add(sort2);
			}
			cursor.close();
			return sort2s;
		}
	//分页方法
	public List<Sort2> getScrollData(int firstResult,int maxResult){
		List<Sort2> sort2s=new ArrayList<Sort2>();
		SQLiteDatabase db = databaseHelper.getReadableDatabase();
		Cursor cursor = db.rawQuery("select id, name,inSort_1 from sort2 limit ?,?",new String[]{String.valueOf(firstResult),String.valueOf(maxResult)});
		while(cursor.moveToNext()){
			Sort2 sort2=new Sort2();
			sort2.setId(cursor.getInt(cursor.getColumnIndex("id")));
			sort2.setName(cursor.getString(1));
			sort2s.add(sort2);
		}
		cursor.close();
		return sort2s;
	}

}