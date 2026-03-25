package com.cc._07_synchronize_demo;

public class MyThread extends Thread{

	Display d;
	String name;
	
	@Override
	public void run() {

		d.wish(name);
	}
	
	MyThread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
}
