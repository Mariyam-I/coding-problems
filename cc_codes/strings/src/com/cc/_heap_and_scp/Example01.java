package com.cc._heap_and_scp;

public class Example01 {

	public static void main(String[] args) {

		String s1 = "Club Coder";
		String s2 = new String("Club Coder");
		String s3 = s2.intern();
		
		System.out.println(s1 == s3);       //true

	}

}
