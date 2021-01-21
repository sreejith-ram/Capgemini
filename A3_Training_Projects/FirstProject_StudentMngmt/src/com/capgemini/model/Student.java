package com.capgemini.model;

public class Student {
	private int RollNumber;
	private String StudentName;
	private String[] Courses;
	public int getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String[] getCourses() {
		return Courses;
	}
	public void setCourses(String[] courses) {
		Courses = courses;
	}
	public Student(int rollNumber, String studentName, String[] courses) {
		super();
		RollNumber = rollNumber;
		StudentName = studentName;
		Courses = courses;
	}

}
