package com.capgemini.ui;

import com.capgemini.exception.*;
import com.capgemini.service.*;

public class Client {
	public static void main(String[] args){
	Bank bank=new ICICIBank();
	try {
		System.out.println("Create Account=");
		System.out.println(bank.createAccount(1, 1000));
		System.out.println(bank.createAccount(2, 30000));
	}catch(InsufficientOpeningAmountException iob)
	{
		System.out.println("Insufficient Opening Balance..Minimum Balance 500Rs Required");
	}
	try
	{
		System.out.println("\nWithdraw Amount=");
		System.out.println("Balance="+bank.withdrawAmount(1, 10000));
	}catch(InsufficientBalanceException ibe) {
		System.out.println("Insufficient Balance Exception");
		}
	catch(InvalidAccountNumberException iab) {
		System.out.println("Invalid Account Number");
	}try
	{
		System.out.println("\nDepositing Amount=");
		System.out.println("Balance="+bank.deposit(1, 500));
	}catch(InvalidAccountNumberException ian)
	{
		System.out.println("Invalid Account Number");
	}try {
		System.out.println("\nFund Transferring=");
		int[] amount=bank.fundTransfer(1, 2, 100);
		System.out.println("Balance of Account Number 1="+amount[0]);
		System.out.println("Balance of Account Number 2="+amount[1]);
	}catch(InvalidAccountNumberException iane)
	{
		System.out.println("Invalid Account Number");

	}catch(InsufficientBalanceException e)
	{
		System.out.println("Insufficient Balance Exception");
	}
		}
}
