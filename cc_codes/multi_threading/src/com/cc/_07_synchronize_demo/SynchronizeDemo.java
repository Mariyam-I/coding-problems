package com.cc._07_synchronize_demo;

public class SynchronizeDemo {

	public static void main(String[] args) {

		Display d1 = new Display();	
		Display d2 = new Display();	
		
		MyThread t1 = new MyThread(d1, "Mariyam");
		MyThread t2 = new MyThread(d1, "Nikhat");
		MyThread t3 = new MyThread(d2, "Misba");
		MyThread t4 = new MyThread(d2, "Maheen");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}


/*
Good Morning : Good Morning : Misba
Good Morning : Mariyam
Good Morning : Mariyam
Good Morning : Misba
Good Morning : Mariyam
Good Morning : Misba
Good Morning : Misba
Good Morning : Mariyam
Good Morning : Misba
Mariyam
Good Morning : Good Morning : Maheen
Good Morning : Nikhat
Good Morning : Nikhat
Good Morning : Maheen
Good Morning : Maheen
Good Morning : Nikhat
Good Morning : Maheen
Good Morning : Nikhat
Good Morning : Nikhat
Maheen
*/