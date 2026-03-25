package com.cc._06_synchronizedation;

public class MyThread1 extends Thread{

	Greet g;
	String name;
	
	@Override
	public void run() {
		g.wish(name);
	}

	MyThread1(Greet g, String name) {
		super();
		this.g = g;
		this.name = name;
	}
	
	
}
