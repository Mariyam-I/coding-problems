package com.cc._06_synchronizedation;

public class TreadDemo {

	public static void main(String[] args) {

		Greet g1 = new Greet();
		Greet g2 = new Greet();
		
		MyThread1 t1 = new MyThread1(g1, "Mariyam");
		MyThread1 t2 = new MyThread1(g1, "Nikhat");
		MyThread1 t3 = new MyThread1(g2, "Misba");
		MyThread1 t4 = new MyThread1(g2, "Maheen");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

/*
Good Morning : Mariyam
Good Morning : Maheen
Good Morning : Maheen
Good Morning : Mariyam
Good Morning : Mariyam
Good Morning : Mariyam
Good Morning : Mariyam
Good Morning : Maheen
Good Morning : Maheen
Good Morning : Maheen
Good Morning : Nikhat
Good Morning : Nikhat
Good Morning : Nikhat
Good Morning : Nikhat
Good Morning : Nikhat
Good Morning : Misba
Good Morning : Misba
Good Morning : Misba
Good Morning : Misba
Good Morning : Misba
*/