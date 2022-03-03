package com.sapient.aem.ui;

import com.sapient.aem.service.Account;
import com.sapient.aem.service.CurrentAccount;
import com.sapient.aem.service.Person;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p[] = {new Person("smith",22f),
				      new Person("Kathy",33f),
				      new Person("Naga",23f),
				};
		Account a[] = {new Account(2000.00,p[0]),
				new Account(2000.00,p[1])
		};
		a[0].deposit(2000);
		a[1].withdraw(2000);
		System.out.println(a[0].getAccHolder().getName()+" balance is : "+a[0].getBalance()+" and "+a[1].getAccHolder().getName() +" balance is : "+a[1].getBalance());
		CurrentAccount cn = new CurrentAccount(10000.00,p[2]);
//		cn.withdraw(15000);
	}

}
