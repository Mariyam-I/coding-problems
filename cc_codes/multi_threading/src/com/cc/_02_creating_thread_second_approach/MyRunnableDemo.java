package com.cc._02_creating_thread_second_approach;

public class MyRunnableDemo {

	public static void main(String[] args) {

		System.out.println("@@@@@@@@@@@@@@@@@@@@@ main Thread Started @@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);          //Thread instantiation 
		
		t1.start();                          //t1 thread will start from here
		
		for(int i = 51; i <= 100; i++) {
			System.out.println(i+" ----------------> main Thread");
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@ main Thread Ended @@@@@@@@@@@@@@@@@@@@@@@@@@@@");

	}

}
