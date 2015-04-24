package com.example.jnjh;



import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CursorAdapter extends BaseAdapter{
	private Context context;
	private Cursor cursor;
	private LayoutInflater inflater;
	private LinearLayout list_form;
	public CursorAdapter(Context context, Cursor cursor) {
		super();
		this.context=context;
		this.cursor=cursor;
		inflater=LayoutInflater.from(context);
		
	}
	public int getCount(){
		return cursor.getCount();
		
	}
	public Object getItem(int position) {
		return position;
	}
	public long getItemId(int position) {
		return position;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) { 
		
		cursor.moveToPosition(position);
		list_form = (LinearLayout) inflater.inflate(R.layout.list_form, null); 
		TextView name = (TextView) list_form.findViewById(R.id.list_name); 
		TextView jianjie = (TextView) list_form.findViewById(R.id.list_jianjie); 
		
		name.setText("Ãû³Æ£º"+cursor.getString(1));
		jianjie.setText("¼ò½é£º"+cursor.getString(2));
		
		return list_form;
		
	}
	
	

}
