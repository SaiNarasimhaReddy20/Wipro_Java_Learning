package com.customexceptions;

public class BankAccount {
	private String accountHolder;
	private double balance;
	public BankAccount(String accountHolder, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void witdraw(double amount) throws InsufficientFundsException {
		if (amount < 0) {
			throw new IllegalArgumentException("Withdrawble amount cannot be negative");
		}
		if (amount > balance) {
			throw new InsufficientFundsException("have insufficient funds ! "+ balance);
		}
		balance -= amount;
		System.out.println( amount + " Rs. Amount debited"  + " and Now balance is : " +  balance+" Rs." );
		
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}
	
	
	
}
