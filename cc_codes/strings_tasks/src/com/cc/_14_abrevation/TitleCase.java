package com.cc._14_abrevation;

public class TitleCase {

	public static void main(String[] args) {
		String input = "hello hi by";
		String[] srr = input.split(" ");
		String result = "";

		for (String w : srr) {
			if (!w.isEmpty()) {
				result += w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase() + " ";
			}
		}

		System.out.println(result.trim());
	}
}



//Hello Hi By
