package com.sapient.aem.ui;

public class SharedMutableObject {

//		//StringBuilder object is mutable and not thread-safe
//		private static StringBuilder object= new StringBuilder("Welcome");	
//
//		public static void main(String[] args) {		
//			Runnable runnable = ()->{				   
//				int length= object.length();
//				//					System.out.println(length);
//				synchronized(object) {
//					for(int i=0;i<length;i++) {
//						//all the threads are entering into append() method at a time
//						System.out.println(Thread.currentThread().getName()+" "+ object.append("x"));
//					}
//				}
//			};
//
//			//Worker threads t1 and t2 are binded to same runnable object
//			Thread t1= new Thread(runnable,"worker-1");
//			Thread t2= new Thread(runnable,"worker-2");
//			Thread t3= new Thread(runnable,"worker-3");
//
//			t1.start();
//			t2.start();
//			t3.start();
//		}
	//StringBuilder object is mutable and not thread-safe
		private static StringBuilder object= new StringBuilder("Welcome");	

		public static void main(String[] args) {		
			Runnable runnable = ()->{	
//				synchronized(object) {
					int length= object.length();
					//					System.out.println(length);
					//only one thread enters into synchronized block at a time
					//avoiding thread interference

				synchronized(object) {
					for(int i=0;i<length;i++) {
						//all the threads are entering into append() method at a time
						System.out.println(Thread.currentThread().getName()+" "+ object.append("x"));
					}
				}
			};

			//Worker threads t1 and t2 are binded to same runnable object
			Thread t1= new Thread(runnable,"worker-1");
			Thread t2= new Thread(runnable,"worker-2");
			Thread t3= new Thread(runnable,"worker-3");

			t1.start();
			t2.start();
			t3.start();
		}


}
