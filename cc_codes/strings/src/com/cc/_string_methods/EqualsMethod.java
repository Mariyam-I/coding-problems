package com.cc._string_methods;

public class EqualsMethod {

	public static void main(String[] args) {

//						== Vs equals()
		
		/*
		==        ---->     is for reference comparison
		equals()  ---->     for content comparison
		
		*/
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = "Java";
		
		System.out.println(s1 == s2);    		//false
		
		System.out.println(s3 == s4);    		//true
		 
		System.out.println(s1.equals(s2));		//true
		
		System.out.println(s1.equals(s3));		//true
		
		System.out.println(s4.equals(s3));		//true
		
		System.out.println(s4.equals(s2));		//true
	}

}
