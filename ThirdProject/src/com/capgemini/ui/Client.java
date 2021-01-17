package com.capgemini.ui;

import com.capgemini.exception.InsufficientBalanceException;
import com.capgemini.exception.InsufficientOpeningAmountException;
import com.capgemini.exception.InvalidAccountNumberException;
import com.capgemini.service.*;

public class Client {
	public static void main(String[] args){
	ICICIBank bank=new ICICIBank();
	
	BankRunner bankRunner=new BankRunner(bank);
	
	Thread firstThread=new Thread(bankRunner, "first");
	firstThread.start();
	
		try {
			System.out.println("Create Account");
			System.out.println(bank.createAccount(1, 1000));
			System.out.println(bank.createAccount(2, 30000));
		}
		catch(InsufficientOpeningAmountException iob)
		{
			System.out.println("Insufficient Opening Balance..Minimum Balance 500Rs Required");
		}
		try
		{
			if(Thread.currentThread().getName().equals("first"))
			{
				System.out.println("\nDepositing Amount=");
				System.out.println("Balance="+bank.deposit(1, 100));
			}
			else
			{
				System.out.println("Balance="+bank.deposit(1, 1000));
			}
		}
		catch(InvalidAccountNumberException ian)
		{
			System.out.println("Invalid Account Number");
		}
		
		try
		{
			System.out.println("\nFund Transferring=");
			int[] amount=bank.fundTransfer(1, 2, 100);
			System.out.println("Balance of Account Number 1="+amount[0]);
			System.out.println("Balance of Account Number 2="+amount[1]);
		}
		catch(InvalidAccountNumberException iane)
		{
			System.out.println("Invalid Account Number");

		}
		catch(InsufficientBalanceException e)
		{
			System.out.println("Insufficient Balance Exception");
		}
	

	}
}
