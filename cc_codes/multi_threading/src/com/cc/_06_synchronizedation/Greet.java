package com.cc._06_synchronizedation;

public class Greet {

	synchronized public void wish(String name) {
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Good Morning : ");
			System.out.println(name);
		}
		
	}
}
