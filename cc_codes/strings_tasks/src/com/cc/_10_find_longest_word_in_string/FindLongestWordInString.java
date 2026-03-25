package com.cc._10_find_longest_word_in_string;

public class FindLongestWordInString {

	public static void main(String[] args) {
		String s1 = "I am learning javascript";
		String[] srr = s1.split(" ");

		longestword(srr);

	}

	public static void longestword(String[] srr) {
		int maxLength = 0;
		String longestString = "";

		for (int i = 0; i < srr.length; i++) {
			
			if (srr[i].length() > maxLength) {
				maxLength = srr[i].length();
				longestString = srr[i];
			}

		}
		System.out.println("Longest word = " + longestString + " ,having " + longestString.length() + " alphabets");

	}
}

//Longest word = javascript ,having 10 alphabets

