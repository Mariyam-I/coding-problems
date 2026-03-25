package com.cc._03_replace_vowels;

public class ReplaceVowel {

	public static void main(String[] args) {

		String s = "Banana";
		char[] crr = s.toCharArray();

		String s1 = replaceVowelByStar(crr);

		System.out.println("String After replacing Vowels : " + s1);
	}

	// Method for replacing vowels by star(*)
	public static String replaceVowelByStar(char[] crr) {

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < crr.length; i++) {
			if (crr[i] == 'a' || crr[i] == 'e' || crr[i] == 'i' || crr[i] == 'o' || crr[i] == 'u' || crr[i] == 'A'
					|| crr[i] == 'E' || crr[i] == 'I' || crr[i] == 'O' || crr[i] == 'U') {

				sb.append(crr[i] = '*');

			} else {
				sb.append(crr[i]);
			}
		}
		return sb.toString();
	}
}

// String After replacing Vowels : B*n*n*