package com.capgemini.view;
import java.util.Scanner;
import com.capgemini.service.StudentSchedular;

public class Admin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentScheduler sch = new StudentScheduler();
		while(true)
		{
			System.out.println("MENU:");
			System.out.println("1.Insert Student Record\n2.Show all Records\n3.Search a Record by "
					+ "Roll NO\n4.Show Students Details By Course Name\n5.Show Count By Course\n"
					+ "6.Exit\nENTER YOUR CHOICE");
			int choice= sc.nextInt();
			switch (choice)
			{
			case 1:
				sch.addStudent();
				break;
			case 2:
				sch.showAllStudent();
				break;
			case 3:
				sch.showByRollNumer();
				break;
			case 4:
				sch.showByCourse();
				break;
			case 5:
				sch.countByCourse();
				break;	
			case 6:
				System.exit(0);
			default:
				System.out.println("Please Enter Valid Choice!");
			}
		}
	}

}
