package com.sapient.aem.service;

public class CurrentAccount  extends Account{
	public static final Double OVERDRAFT_LIMT = 20000.00;
	public static double total = 0;


	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CurrentAccount(Double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void withdraw(double d) {
		total = total +d;
		if(total>OVERDRAFT_LIMT) {
			System.out.println("overdraft limit");
		}
		else if(this.getBalance()<d) {
			System.out.println("sorry balance is: "+ this.getBalance());
		}
		else {
			System.out.println("Withdraw amount is : "+d);
			this.setBalance(this.getBalance()-d);
		}
	}

}
