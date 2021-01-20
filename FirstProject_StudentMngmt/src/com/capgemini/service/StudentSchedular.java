package com.capgemini.service;
import com.capgemini.model.Student;

public class StudentSchedular {
	private Student[] student=new Student[10];
	private int counterStudent;
	
	public String addStudent(int rollNumber,String name)
	{
		student[counterStudent++]=new Student(rollNumber,studentName);
		return "Student added successfully";
	}
	
	public void ShowAllStudents() 
	{
		for(int i=0;i<counterStudent;i++)
		{
			System.out.println(student[i].getRollNumber());
			System.out.println(student[i].getStudentName);
		}
	}
	public void DetailByRollno()
	{
		
	}
	public void StudentNoByCourseName()
	{
		
	}
	public void CountByCourseName()
	{
		
	}
}