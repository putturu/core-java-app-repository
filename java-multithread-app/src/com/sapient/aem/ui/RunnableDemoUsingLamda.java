package com.sapient.aem.ui;

public class RunnableDemoUsingLamda {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		Runnable runnable = ()->{
			System.out.println(Thread.currentThread());
			System.out.println(Thread.currentThread().getPriority());
			//simulating a situation where worker thread takes 12 ms to complete task
			try {
				Thread.sleep(12);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println("End of run() method");
		};
				
		
		Thread t1 = new Thread( runnable,"worker-1" );
		//doesn't guarantee high priority, its only a request
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
//		try {
//			//making the main() to sleep/pause for 10 ms
//			Thread.sleep(10);
//		} catch (InterruptedException e) {			
//			e.printStackTrace();
//		}	
		
//		try {
//			//join me, worker thread telling main thread to join me
//			t1.join();
//		} catch (InterruptedException e) {			
//			e.printStackTrace();
//		}
		
		
		try {
			//join me, worker thread telling main thread to join me
			//main thread waits for maximum 1 min
			t1.join(1000*60);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		System.out.println("End of main() method");

	}



}
