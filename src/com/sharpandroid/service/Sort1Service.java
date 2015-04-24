package com.sharpandroid.service;

import java.util.ArrayList;
import java.util.List;

import com.example.data.Sort1;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Sort1Service {
	private DatabaseHelper databaseHelper;
	private Context context;
	public Sort1Service(Context context){
		this.context=context;
		databaseHelper=new DatabaseHelper(context);
	}
	//���ݿ�ı��淽��
	public void save(Sort1 sort1){
		SQLiteDatabase db=databaseHelper.getWritableDatabase();
		db.execSQL("insert into person(name,age) values(?,?)",new Object[]{sort1.getName()});
	}
	//���ݿ�ĸ��·���
	public void update(Sort1 sort1){
		SQLiteDatabase db=databaseHelper.getWritableDatabase();
		db.execSQL("update person set name=?,age=? where id=?",
				new Object[]{sort1.getName(),sort1.getId()});
	}
	//���ݵĲ�ѯ����
	public Sort1 find(Integer id){
		SQLiteDatabase db=databaseHelper.getReadableDatabase();
		Cursor cursor=db.rawQuery("select id, name from sort_1 where id=?",new String[]{String.valueOf(id)});
		if(cursor.moveToNext()){
			Sort1 sort1=new Sort1();
			sort1.setId(cursor.getInt(cursor.getColumnIndex("id")));
			sort1.setName(cursor.getString(1));
			return sort1;
		}
		cursor.close();
		return null;
	}
	//���ݵ�ɾ������
	public void delete(Integer id){
		SQLiteDatabase db=databaseHelper.getWritableDatabase();
		db.execSQL("delete from sort1 where id=?",
				new Object[]{id});
	}
	//��ҳ����
	public List<Sort1> getScrollData(int firstResult,int maxResult){
		List<Sort1> sort1s=new ArrayList<Sort1>();
		SQLiteDatabase db = databaseHelper.getReadableDatabase();
		Cursor cursor = db.rawQuery("select id, name from sort1 limit ?,?",new String[]{String.valueOf(firstResult),String.valueOf(maxResult)});
		while(cursor.moveToNext()){
			Sort1 sort1=new Sort1();
			sort1.setId(cursor.getInt(cursor.getColumnIndex("id")));
			sort1.setName(cursor.getString(1));
			sort1s.add(sort1);
		}
		cursor.close();
		return sort1s;
	}
	//��ȡ��¼����
	public long getCount(){
		SQLiteDatabase db = databaseHelper.getReadableDatabase();
		Cursor cursor = db.rawQuery("select count(*) from sort1",null);
		cursor.moveToFirst();
		long count = cursor.getLong(0);
		cursor.close();
		return count;
	}

}
