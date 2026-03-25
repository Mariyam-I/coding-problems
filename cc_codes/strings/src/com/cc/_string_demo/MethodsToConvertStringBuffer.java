package com.cc._string_demo;

public class MethodsToConvertStringBuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("java is fun");
		
		System.out.println(sb.toString());
		System.out.println(new String(sb));
		System.out.println(sb + " ");
	}

}
/*
java is fun
java is fun
java is fun 

*/