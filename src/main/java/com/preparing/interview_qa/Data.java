package com.preparing.interview_qa;

//POJO yo hold SAMPLE Student DATA from CSV
public class Data {

	private String name;
	private int mark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	public Data(String name,int mark) {
		this.name=name;
		this.mark=mark;
	}
	 
	@Override
	public String toString() {
		return "name: "+name +" mark: "+mark;
	}

}
