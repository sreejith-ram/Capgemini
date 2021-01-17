package com.capgemini.service;

import java.util.LinkedList;
import com.capgemini.bean.Account;
import com.capgemini.exception.*;


public class ICICIBank implements Bank
{
	private LinkedList<Account> accounts=new LinkedList<>();
	
	public String createAccount(int accountNumber, int amount) throws InsufficientOpeningAmountException
	{
		if(amount>=500)
		{
		Account account=new Account();
		account.setAccountNumber(accountNumber);
		account.setAmount(amount);
		accounts.add(account);
		return "Account created succefully";
		}
		else throw new InsufficientOpeningAmountException();
	}
	
	private Account searchAccount(int accountNumber) throws InvalidAccountNumberException
	{
		for(Account account:accounts)
		{
			if(accountNumber==account.getAccountNumber())
			{
				return account;
			}
		}
		throw new InvalidAccountNumberException();
	}
	
	public int withdrawAmount(int accountNumber, int amount) throws InvalidAccountNumberException, InsufficientBalanceException
	{
		Account account = searchAccount(accountNumber);
		
		synchronized(account) 
		{
			if((account.getAmount()-amount)>=0)
			{
				account.setAmount(account.getAmount()-amount);
				return account.getAmount();
			}
			throw new InsufficientBalanceException();
		}
	}
	
	public int deposit(int accountNumber, int amount) throws InvalidAccountNumberException
	{
		Account account=searchAccount(accountNumber);

		account.setAmount(account.getAmount()+amount);
		return account.getAmount();
	}
	public int[] fundTransfer(int accountNumberOne, int accountNumberTwo, int amount)throws InvalidAccountNumberException, InsufficientBalanceException 
	{
		Account accountOne=searchAccount(accountNumberOne);
		Account accountTwo=searchAccount(accountNumberTwo);
		if((accountOne.getAmount()-amount)>=0)
		{
			accountOne.setAmount(accountOne.getAmount()-amount);
			accountTwo.setAmount(accountTwo.getAmount()+amount);
			int[] amounts= {accountOne.getAmount(),accountTwo.getAmount()};
			return amounts;
		}
		throw new InsufficientBalanceException();
	}
}
