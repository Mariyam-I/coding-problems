package com.cc._05_thread_priority;

public class GuessOutput {

	public static void main(String[] args) {
		
//		System.out.println("Main Thread " + Thread.currentThread().getPriority());
		
//		Thread.currentThread().setPriority(15);   //Exception in thread "main" java.lang.IllegalArgumentException
		//Max Priority is 10
		
		/*Thread.currentThread().setPriority(7);
		System.out.println("Main Thread " + Thread.currentThread().getPriority());*/
		
		
		ThreadPriorityRange t1 = new ThreadPriorityRange();
		t1.start();
		t1.setPriority(10);
		
		Thread.currentThread().setPriority(1);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(" -----> Main Thread");
		}
		
		System.out.println("Main : " +Thread.currentThread().getPriority() + "  " + " Child : " + t1.getPriority());
	}

}


/*
Main Thread 5
Main Thread 7
Child Thread 7
*/



/*
-----> Main Thread
-----> Main Thread
-----> Main Thread
-----> Main Thread
-----> Main Thread
Child Thread 10
Main : 1   Child : 10
*/