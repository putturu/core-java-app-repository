package com.sapient.aem.service;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		//returns current Thread object
		System.out.println(Thread.currentThread());
		System.out.println("End of run() method");		
	}


}
