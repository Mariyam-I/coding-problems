package com.cc._heap_and_scp;

public class Example14 {

	public static void main(String[] args) {

		String s1 = "Club Coder";
		String s2 = "Club" + " Coder";
		String s3 = new String("Club Coder").intern();
		
		System.out.println((s1 == s2) + " " + (s1 == s3));
//		true true
	}

}
