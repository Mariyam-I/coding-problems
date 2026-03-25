package com.cc._01_creating_thread_first_approach;

public class MythreadDemo {

	public static void main(String[] args) {

		System.out.println("@@@@@@@@@@@@@@@@@@@@@ main Thread Started @@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Mythread t1 = new Mythread();  //Thread istantiation
		
		t1.start();   // t1 Thread will start from here
		
		for(int i = 51; i <= 100; i++) {
			System.out.println(i+" ---------------> main Thread");
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@ main Thread Ended @@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}
