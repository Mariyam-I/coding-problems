package com.cc._14_abrevation;

public class Abrevation {

	public static void main(String[] args) {
		
		String input = "Hyper Text Markup Langauge";
		
		String[] srr = input.split(" ");
		
		isAbbreviation(srr);

	}

	public static void isAbbreviation(String[] srr) {
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < srr.length; i++) {
			sb.append(srr[i].charAt(0));
		}
		
		System.out.println("Abbreviation = " + sb);

	}

}


/*
OUTPUT====> Abbreviation = HTML
*/
