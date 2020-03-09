package com.epam.creational_patterns;

import java.util.List;

public class PrototypePattern {
	
	public void getStudents() throws CloneNotSupportedException {
		
		Students studs = new Students();
		studs.getData();
		
		
		Students studModified1 = (Students) studs.clone();
		Students studModified2 = (Students) studs.clone();
		List<String> list1 = studModified1.getStudList();
		list1.add("Pavani");
		List<String> list2 = studModified2.getStudList();
		list2.remove("Dheeraj");
		
		System.out.println("Students List: "+studs.getStudList());
		System.out.println("Modified Students List1: "+list1);
		System.out.println("Modified Students List2: "+list2);
		
	}

}
