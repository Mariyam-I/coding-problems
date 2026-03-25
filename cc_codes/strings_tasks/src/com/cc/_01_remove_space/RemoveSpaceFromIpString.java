package com.cc._01_remove_space;

public class RemoveSpaceFromIpString {

	public static void main(String[] args) {

		String s = "Hello World";
		String s1 = removeSpace(s);
		
		System.out.println("String After Removing space = " +s1);
	}

	public static String removeSpace(String s) {
		
		String[] srr = s.split(" ");
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0 ; i < srr.length ; i++) {
			sb.append(srr[i]);
		}
		return sb.toString();
	}

}

//String After Removing space = HelloWorld
