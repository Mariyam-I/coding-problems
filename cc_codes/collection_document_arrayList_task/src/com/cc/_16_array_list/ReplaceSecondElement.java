package com.cc._16_array_list;

import java.util.ArrayList;

public class ReplaceSecondElement {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(5);
		
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		
		System.out.println("Before Replacing ---> "+list);
		
		list.set(1, "White");
		
		System.out.println("After Replacing ---> "+list);
	}

}


/*
Before Replacing ---> [Red, Green, Blue]
After Replacing ---> [Red, White, Blue]
*/