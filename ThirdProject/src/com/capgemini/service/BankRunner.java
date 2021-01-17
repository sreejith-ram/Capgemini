package com.capgemini.service;

import com.capgemini.exception.InsufficientBalanceException;
import com.capgemini.exception.InvalidAccountNumberException;

public class BankRunner implements Runnable {
	
	Bank bank;
	

	public BankRunner(ICICIBank bank) 
	{
		super();
		this.bank = bank;
	}

	public void run() {
		try
		{
			if(Thread.currentThread().getName().equals("first"))
			{
				System.out.println("\nWithdraw");
				System.out.println("Balanca: "+bank.withdrawAmount(1, 100));
			}
			else
			{
				System.out.println("Balanca: "+bank.withdrawAmount(2, 1000));
			}
		}
		catch(InsufficientBalanceException ibe) 
		{
				System.out.println("Insufficient Balance Exception");
		}
		catch(InvalidAccountNumberException iab) 
		{
			System.out.println("Invalid Account Number");
		}
	}
}
