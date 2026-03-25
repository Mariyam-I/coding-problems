package com.cc._06_array_list;

import java.util.ArrayList;

public class RemoveThirdElementFromAList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(5);
		
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println("Before Removing -> \n" +list);
		list.remove(2);
		System.out.println("\nAfter Removing -> \n" +list);
		
	}

}


/*
Before Removing -> 
[Red, Green, Orange, White, Black]

After Removing -> 
[Red, Green, White, Black]
*/