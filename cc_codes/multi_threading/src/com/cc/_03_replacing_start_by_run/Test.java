package com.cc._03_replacing_start_by_run;

public class Test {

	public static void main(String[] args) {

		System.out.println("@@@@@@@@@@@@@@@@@@@@@ main Thread Started @@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		StartRun sr1 = new StartRun();
			
//		sr1.start();
//		sr1.run();    //Not recommended (in this senario only one thread will work)  
//		sr1.run(10);
		sr1.start();
		
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+" ---------------> main Thread");
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@ main Thread Ended @@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	
}