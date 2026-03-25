package com.cc._08_array_list;

import java.util.ArrayList;

public class CopyAlistToOtherList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>(5);
		
		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
		list1.add("White");
		list1.add("Black");
		
		System.out.println("List 1 -> " +list1);
		
		ArrayList<String> list2 = new ArrayList<>(5);
		
		for(int i = 0; i < list1.size(); i++) {
			list2.add(list1.get(i));
		}
		
		System.out.println("\nlist 1 Copied into list 2 -> "+list2);
	}

}



/*
List 1 -> [Red, Green, Orange, White, Black]

list 1 Copied into list 2 -> [Red, Green, Orange, White, Black]
*/