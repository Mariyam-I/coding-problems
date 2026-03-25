package com.cc._07_synchronize_demo;

public class Display {

	synchronized public void wish(String name) {
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Good Morning : ");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
		
	}
}
