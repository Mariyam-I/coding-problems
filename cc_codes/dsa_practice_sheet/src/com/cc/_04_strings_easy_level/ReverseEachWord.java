package com.cc._04_strings_easy_level;

public class ReverseEachWord {

	public static void main(String[] args) {

		String s = "Java is fun";
		String[] srr = s.split(" ");
		
		reverse(srr);
	}

	private static void reverse(String[] srr) {
		StringBuffer sb = new StringBuffer();
		
		for(int i = srr.length - 1; i >= 0; i--) {
			sb.append(srr[i] + " ");
		}
		
		System.out.println(sb.toString());
	}

}


//fun is Java 