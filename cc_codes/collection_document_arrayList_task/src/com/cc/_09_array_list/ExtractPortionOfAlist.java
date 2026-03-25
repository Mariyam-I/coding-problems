package com.cc._09_array_list;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortionOfAlist {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(5);
		
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println("Original List ");
		System.out.println(list);
		
		List<String> subList = list.subList(0, 3);
		
		System.out.println("\nExtracted portion from original List");
		System.out.println(subList);
	}

}


/*
Original List 
[Red, Green, Orange, White, Black]

Extracted portion from original List
[Red, Green, Orange]
*/