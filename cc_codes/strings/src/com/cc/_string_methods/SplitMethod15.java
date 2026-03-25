package com.cc._string_methods;

public class SplitMethod15 {

	public static void main(String[] args) {

		String s = "Java is fun";
		String[] srr = s.split(" ");
		
		for(int i = srr.length-1 ; i >=0 ; i--) {
			System.out.print(srr[i] + " ");
		}
		
	}

}


//fun is Java 