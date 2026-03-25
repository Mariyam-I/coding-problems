package com.cc._13_array_list;

import java.util.ArrayList;

public class EmptyAnAlist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(5);
		
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		
		System.out.println("Before Removing Elements\n" +list);
		
		list.removeAll(list);
		
		System.out.println("\nAfter Removing All Elements\n" +list);
	}

}




/*
Before Removing Elements
[Red, Green, Black, White, Pink]

After Removing All Elements
[]
*/