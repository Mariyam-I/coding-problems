package com.cc._heap_and_scp;

public class Example19 {

	public static void main(String[] args) {

		String s1 = "Club Coder";
		String s2 = new String("Club Coder");
		s2.intern();
		s2 = null;
		
		System.gc();

		System.out.println(s1);       //Club Coder

	}

}
