package com.cg.di;

public class Student {
	
	private String name;
	private int id;
	
	

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}



	public void Display() {
	System.out.println("Student name is: "+ name);
	System.out.println("Student ID is: "+ id);
	
}
	
}