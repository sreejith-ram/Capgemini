package com.capgemini.service;
import com.capgemini.model.Student;
import java.util.Scanner;
public class StudentSchedular {
	Scanner sc= new Scanner(System.in);
	int n;
	Student[] stdntData= null;
	public void addStudent()
	{
		System.out.println("Enter number of students:");
		n = sc.nextInt();
		stdntData=new Student[n];
		for(int i=0;i<n;i++)
		{	
			stdntData[i]=new Student();
			stdntData[i].setRollNo(validateRollNo());
			System.out.println("Enter Student's Name:" );
			stdntData[i].setName(sc.next());
			System.out.println("How many Courses did Student Registered for:");
			int num=sc.nextInt();
			String[] courses=new String[num];
			System.out.println("Enter names of Courses(s):");
			for(int j=0;j<num;j++)
			{
				courses[j]=sc.next();
			}
			stdntData[i].setCourses(courses);	
		}
	}

	int validateRollNo() 
	{
		System.out.println("Enter Roll Number:");
		int rollNum=sc.nextInt();
		int flag=0;
		for(Student s:stdntData)
		{
			if(rollNum==s.getRollNo())
				flag=1;
			break;
		}
		if(flag==1)
		{
			System.out.println("A Record exist with this roll number,"
					+ " Please enter some different number!");
			return validateRollNo();
		}

		else
			return rollNum;		
	}

	public void showAllStudent()
	{
		if(stdntData==null)
		System.out.println("No Records to show");
		else
		{
			System.out.println("Entered Details of Student Are:");
			for(int i=0;i<n;i++)
			{
				System.out.println("Roll Number: "+stdntData[i].getRollNo() );
				System.out.println("Name: "+stdntData[i].getName());
				System.out.print("Courses Registered: ");
				for(String course:stdntData[i].getCourses()) 
				{
					System.out.print(course+" ");
				}
				System.out.println("\n");
			}
		}

	}

	public void showByRollNumer()
	{
		if(stdntData==null)
			System.out.println("No Records Entered");
		else
		{
			System.out.println("Enter Roll Number to search Record:");
			int rollNum=sc.nextInt();
			int flag =0;
			for(Student s:stdntData)
			{
				if(rollNum==s.getRollNo())
				{
					System.out.println("Roll Number: "+s.getRollNo() );
					System.out.println("Name: "+s.getName());
					System.out.print("Courses Registered: ");
					for(String course:s.getCourses()) 
					{
						System.out.print(course+" ");
					}
					flag++;
					break;			
				}
			}
			if(flag==0)
			{
				System.out.println("No Record found!");
			}
		}

	}

	public void showByCourse() 
	{
		if(stdntData==null)
			System.out.println("No Records Entered");
		else
		{
			System.out.println("Enter Course:");
			String courseSearch=sc.next();
			int count=0;
			for(int i=0;i<stdntData.length;i++)
			{
				for(String course:stdntData[i].getCourses()) 
				{
					if(courseSearch.equalsIgnoreCase(course))
					{
						System.out.println("Roll Number: "+stdntData[i].getRollNo() );
						System.out.println("Name: "+stdntData[i].getName());
						System.out.print("Courses Registered: ");
						for(String course1:stdntData[i].getCourses()) 
						{
							System.out.print(course1+" ");
						}
						System.out.println("\n");
					}
				}
			}
		}	
	}

	public void countByCourse()
	{
		if(stdntData==null)
			System.out.println("No Records Entered");
		else 
		{
			System.out.println("Enter Course:");
			String courseSearch=sc.next();
			int count=0;
			for(int i=0;i<stdntData.length;i++)
			{
				for(String course:stdntData[i].getCourses()) 
				{
					if(courseSearch.equalsIgnoreCase(course))
						count++;
				}
			}
			System.out.println(count +" Students have registered for this course\n");
		}

	}
}