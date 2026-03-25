package com.cc._heap_and_scp;

public class Example12 {

	public static void main(String[] args) {

		String s1 = "Club Coder";
		String s2 = s1.substring(5);
		String s3 = "Coder";
		
		System.out.println(s2.intern() == s3);      //true

	}

}
