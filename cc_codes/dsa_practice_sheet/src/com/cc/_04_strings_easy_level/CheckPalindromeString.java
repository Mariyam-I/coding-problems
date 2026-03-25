package com.cc._04_strings_easy_level;

import java.util.Scanner;

public class CheckPalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string : ");
		String str = sc.nextLine();

		boolean result = isPalindrome(str);

		if (result == true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	private static boolean isPalindrome(String str) {

		char[] crr = str.toCharArray();
		StringBuffer sb = new StringBuffer();

		for (int i = crr.length - 1; i >= 0; i--) {
			sb.append(crr[i]);
		}
		
		if (str.equals(sb.toString())) {
			return true;
		} else {

			return false;
		}

	}

}




/*
Enter string : madam
True



Enter string : hello
False

*/