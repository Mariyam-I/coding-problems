package com.cc._quiz;

public class Quiz07 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Java");
		String s = new String("Java");
		
		if(s.equals(sb)) {
			System.out.println("Match 01");
		} else if(sb.toString().equals(s)) {
			System.out.println("Match 02");        //Match 02
		} else {
			System.out.println("Not Matched");
		}
	}
}
