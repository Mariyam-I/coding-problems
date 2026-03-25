package com.cc._quiz;

public class Quiz01 {

	public static void main(String[] args) {

		String[] srr = {"A","AA","AAA"};
		
		System.out.println(srr.length);       //3
		
		
//		System.out.println(srr[0].length);       //java.lang.Error: Unresolved compilation problem: 
		
		 
//		System.out.println(srr.length());        //Error: Unresolved compilation problem: 
		
		
		System.out.println(srr[0].length());     //1
		
		
//		System.out.println(srr[3].length());    //Exception : java.lang.ArrayIndexOutOfBoundsException: 3
	}

}
