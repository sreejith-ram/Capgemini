import java.util.Scanner;
public class ElectricityBill 
{

	public static void main(String[] args) 
	{
		int unit;
		double billAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter unit(s) of Current used: ");
		unit=sc.nextInt();
		if(unit<=100)
		{
			billAmount=unit*2;
			System.out.println("Your ElectricityBill is "+billAmount);
		}
		else if(unit<=200)
		{
			billAmount=unit*3;
			System.out.println("Your ElectricityBill is "+billAmount);
		}
		else if(unit<=300)
		{
			billAmount=unit*4;
			System.out.println("Your ElectricityBill is "+billAmount);
		}
		else if(unit<=400)
		{
			billAmount=unit*5;
			System.out.println("Your ElectricityBill is "+billAmount);
		}
		else
		{
			billAmount=unit*6;
			System.out.println("Your ElectricityBill is "+billAmount);
		}
	

	}

}
