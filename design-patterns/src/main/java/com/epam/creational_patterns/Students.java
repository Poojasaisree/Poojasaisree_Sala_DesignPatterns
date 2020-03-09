package com.epam.creational_patterns;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable {
	private List<String> StudList;

	public Students(){
		StudList = new ArrayList<String>();
	}

	public Students(List<String> list){
		this.StudList=list;
	}
	public void getData(){
		
		StudList.add("Pooja");
		StudList.add("Anil");
		StudList.add("Dheeraj");
		StudList.add("Madhu");
	}

	public List<String> getStudList() {
		return StudList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> tempList = new ArrayList<String>();
		for(String s : this.getStudList()){
			tempList.add(s);
		}
		return new Students(tempList);
	}


}
