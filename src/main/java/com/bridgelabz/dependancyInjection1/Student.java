package com.bridgelabz.dependancyInjection1;

public class Student {
	private String studentName;
	private int id;
	
	/*
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; System.out.println("setter method call:  setName"); }
	 * 
	 * 
	 * public void setId(int id) { this.id = id;
	 * System.out.println("setter method call:  setId"); }
	 * 
	 * 
	 *
	 */

	public Student(String studentName, int id) {
		super();
		this.studentName = studentName;
		this.id = id;
	}
	 public void displayStudentInfo()
{
	System.out.println("Student name is:"+studentName+",  id is :"+id);
	
}


}
