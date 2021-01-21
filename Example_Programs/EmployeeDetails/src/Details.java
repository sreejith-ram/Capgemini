import java.util.Scanner;
public class Details {
	public static void main(String[] args) {
		
	
		Employee[] emps=new Employee[5];
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee no and Employee name:");
		
		for(int i=0;i<emps.length;i++)
		{
			emps[i] =new Employee();
			emps[i].setEmployeeNumber(sc.nextInt());
			emps[i].setEmployeeName(sc.next());
		}
	
		System.out.println("Employee details");
		
		for(int i=0;i<emps.length;i++)
		{
			System.out.println(emps[i].getEmployeeNumber());
			System.out.println(emps[i].getEmployeeName());
		}
	}

}
