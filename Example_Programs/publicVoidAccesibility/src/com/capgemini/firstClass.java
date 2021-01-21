package com.capgemini;


public class firstClass {
	private void show()
	{
		System.out.println("Show method");

	}
	public void method()
	{
		System.out.println("Method display");
		show();
		method1();
	}
	protected void method1()
	{
		System.out.println("Method1 shows");
	}
	

}
