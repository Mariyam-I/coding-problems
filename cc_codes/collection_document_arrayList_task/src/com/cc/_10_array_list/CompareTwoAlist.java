package com.cc._10_array_list;

import java.util.ArrayList;

public class CompareTwoAlist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(5);

		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");

		ArrayList<String> list1 = new ArrayList<>(5);

		list1.add("Red");
		list1.add("Green");
		list1.add("Black");
		list1.add("Pink");
		
		System.out.println(list.equals(list1));

	}

}


//false
