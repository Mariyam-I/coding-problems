package com.cc._string_demo;

public class StringDemo {

	public static void main(String[] args) {

		//Heap & SCP(String constructor Pool)
		
		String s1 = new String ("Java");
		String s2 = "Java";
		
		System.out.println("s1 = " +s1);
		System.out.println("s2 = " +s2);
	}

}
