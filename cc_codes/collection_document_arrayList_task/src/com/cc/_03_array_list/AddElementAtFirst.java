package com.cc._03_array_list;

import java.util.ArrayList;

public class AddElementAtFirst {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println("Before Adding \n"+ list);
		list.add(0, "pink");
		System.out.println("\nAfter Adding \n" + list);
	}

}


/*
Before Adding 
[Red, Green, Orange, White, Black]

After Adding 
[pink, Red, Green, Orange, White, Black]
*/