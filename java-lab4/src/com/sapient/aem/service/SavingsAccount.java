package com.sapient.aem.service;

public class SavingsAccount extends Account {
	 private static final double MIN_BAL=500.0;

	@Override
	public void withdraw(double d) {
		// TODO Auto-generated method stub
		if(this.getBalance()<500) {
			System.out.println("minimum balance of INR 500 in a bank account should be is available.");
		}
		else if(this.getBalance()-d<500) {
			System.out.println("we cann't withdraw more than : "+ ((this.getBalance())-500));
		}
		else {
		System.out.println("Withdraw amount is : "+d);
		this.setBalance(this.getBalance()-d);
		}
	}
	 
}
