package com.sapient.aem.service;

public class Account {
	private Long accNum;
	private Double balance;
	private Person accHolder;
	
	private static long acc;
	
	public Account() {
		super();
		this.accNum =  ++acc;
	}
	public Account(Double balance, Person accHolder) {
		super();
		this.accNum = ++acc;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public Account(Long accNum, Double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public void deposit(double d) {
		System.out.println("deposit amount is : "+d);
		this.balance +=d; 
	}
	public void withdraw(double d) {
		if(this.balance<500) {
			System.out.println("minimum balance of INR 500 in a bank account should be is available.");
		}
		else if(this.balance-d<500) {
			System.out.println("we cann't withdraw more than : "+ ((this.balance)-500));
		}
		else {
		System.out.println("Withdraw amount is : "+d);
		this.balance-=d;
		}
		
	}
	public double getBalance() {
		return balance;
	}
	public Long getAccNum() {
		return accNum;
	}
	public void setAccNum(Long accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
