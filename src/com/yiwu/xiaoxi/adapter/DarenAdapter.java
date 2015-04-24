package com.yiwu.xiaoxi.adapter;

import java.util.List;

import com.example.jnjh.R;
import com.yiwu.xiaoxis.Darens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class DarenAdapter extends BaseAdapter {
	
	private Context context;
	private List<Darens> darensList;
	
	public DarenAdapter(Context context , List<Darens> darensList)
	{
		this.context = context;
		this.darensList = darensList;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return darensList.size();
	}
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return darensList.get(position);
	}
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		if (convertView == null){
			convertView = LayoutInflater.from(context).inflate(R.layout.jinengdaren_list, null);
		}
		TextView name = (TextView) convertView.findViewById(R.id.name);
		TextView intro = (TextView) convertView.findViewById(R.id.intro);
		
		Darens darens = darensList.get(position);
		name.setText(darens.getName());
		intro.setText(darens.getIntro());
		
		return convertView;
	}
	
	

}
