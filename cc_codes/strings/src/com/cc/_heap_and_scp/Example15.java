package com.cc._heap_and_scp;

public class Example15 {

	public static void main(String[] args) {
    
		String s1 = "Club Coder";
		String s2 = new String(s1);
		s1 = null;
		
		System.out.println(s2);      //Club Coder

	}

}
