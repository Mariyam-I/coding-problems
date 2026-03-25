package com.cc._heap_and_scp;

public class Example20 {

	public static void main(String[] args) {
   
		String s1 = "Club";
		String s2 = "Coder";
		String s3 = s1 + s2;
		String s4 = "ClubCoder";
		String s5 = s3.intern();
		
		System.out.println(s5 == s4);     //true
	}

}
