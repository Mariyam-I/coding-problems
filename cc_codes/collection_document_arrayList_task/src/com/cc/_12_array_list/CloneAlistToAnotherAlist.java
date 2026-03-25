package com.cc._12_array_list;

import java.util.ArrayList;
import java.util.List;

public class CloneAlistToAnotherAlist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(5);
		
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		
		System.out.println("Original List ---> " +list);
		
//		List<String> clone1 = (List<String>) list.clone();
		List<String> clone = new ArrayList<>(list);
		
		
		System.out.println("\nCloned List ---> " +clone);
		

	}

}



/*
Original List ---> [Red, Green, Black, White, Pink]

Cloned List ---> [Red, Green, Black, White, Pink]
*/