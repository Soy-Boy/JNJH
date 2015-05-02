package com.yiwu.xiaoxi.adapter;

import java.util.List;

import com.example.jnjh.R;
import com.yiwu.utils.HttpUtils;
import com.yiwu.xiaoxis.Xiaoxis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class XiaoxiAdapter extends BaseAdapter {
	private Context context;
	private List<Xiaoxis> xiaoxisList;
	
	public XiaoxiAdapter(Context context, List<Xiaoxis> xiaoxisList){
		this.context = context;
		this.xiaoxisList = xiaoxisList;
	}

	@Override
	public int getCount() {
		return xiaoxisList.size();
	}

	@Override
	public Xiaoxis getItem(int position) {
		return xiaoxisList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null){
			convertView = LayoutInflater.from(context).inflate(R.layout.stxiaoxinlistform, null);
		}
		TextView name = (TextView) convertView.findViewById(R.id.shetuanming);
		TextView time = (TextView) convertView.findViewById(R.id.shijian);
		TextView xiaoxi = (TextView) convertView.findViewById(R.id.huodongxinxi);
		
		Xiaoxis xiaoxis = xiaoxisList.get(position);
		name.setText(xiaoxis.getName());
		time.setText(xiaoxis.getTime());
		xiaoxi.setText(xiaoxis.getXiaoxi());
		
		return convertView;
	}
}
