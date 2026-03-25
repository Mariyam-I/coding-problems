package com.cc._04_calling_start_again;

public class StartDemo {

	public static void main(String[] args) {

		StartAgain sa1 = new StartAgain();
		
		sa1.start();
//		sa1.start();            //Can't start thread again and again 

		for(int i = 1; i <= 10; i++) {
			System.out.println(i+" ---------------> main Thread");
		}
		
	}

}
