package com.example.data;

public class Sort2 {
	private Integer id;
	private String name;
	private Integer inSort_1;
	
	public Sort2(){}
	
	public Sort2(String name){
		this.name=name;
	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Integer getInSort_1(){
		return inSort_1;
	}
	public void setInSort_1(Integer inSort_1){
		this.inSort_1=inSort_1;
	}
@Override
public String toString(){
	return "Person[id="+id+",name="+name+"]";
}
}
