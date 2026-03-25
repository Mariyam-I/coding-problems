package com.cc._quiz;

public class Quiz03 {

	public static void main(String[] args) {

		String a = "A";
		a = a.concat("B");
		String b = "C";
		a = a.concat(b);
		a.replace('C', 'D');
		a = a.concat(b);
		
		System.out.println(a);
		
//ABCC

	}

}
