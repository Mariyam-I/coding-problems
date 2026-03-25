package com.cc._05_array_list;

import java.util.ArrayList;

public class UpdateByGivenIndex {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(5);
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Black");
		
		System.out.println("Before Updating -> \n" + list);
		list.set(2, "Yellow");
		System.out.println("\nAfter Updating -> \n" + list);
	}

}


/*
Before Updating -> 
[Red, Blue, Green, Black]

After Updating -> 
[Red, Blue, Yellow, Black]
*/