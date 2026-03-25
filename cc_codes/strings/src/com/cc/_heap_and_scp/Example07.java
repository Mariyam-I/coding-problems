package com.cc._heap_and_scp;

public class Example07 {

	public static void main(String[] args) {

		String s1 = new String("Club Coder").intern();
		String s2 = "Club Coder";
		
		System.out.println(s1 == s2);         //true

	}

}
