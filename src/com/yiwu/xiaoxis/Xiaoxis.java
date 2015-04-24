package com.yiwu.xiaoxis;

public class Xiaoxis {
	private String name;
	private String time;
	private String xiaoxi;
	private String xiaoxiurl;
	
	public Xiaoxis(String name,String time,String xiaoxi,String xiaoxiurl)
	{
		setName(name);
		setTime(time);
		setXiaoxi(xiaoxi);
		setXiaoxiurl(xiaoxiurl);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getXiaoxi() {
		return xiaoxi;
	}

	public void setXiaoxi(String xiaoxi) {
		this.xiaoxi = xiaoxi;
	}

	public String getXiaoxiurl() {
		return xiaoxiurl;
	}

	public void setXiaoxiurl(String xiaoxiurl) {
		this.xiaoxiurl = xiaoxiurl;
	}
	

}
