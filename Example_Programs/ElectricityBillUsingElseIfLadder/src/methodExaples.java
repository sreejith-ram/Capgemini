import java.util.Scanner;

public class methodExaples {
	
	static void multiplication(int a,int b)
	{
		System.out.println("Multiplication of numbers are "+(a*b));
	}
	void squareroot(double a)
	{
		System.out.println("Square root for the number is "+(Math.sqrt(a)));
	}

	public static void main(String[] args) {
		
		methodExaples m=new methodExaples();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two number for Multiplication: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		multiplication(num1, num2);
		
		System.out.println("Enter number for square root: ");
		int num3=sc.nextInt();
		m.squareroot(num3);
		

	}

}
