package com.cc._07_array_list;

import java.util.ArrayList;

public class SearchElementInAlist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(5);
		
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		boolean found = list.contains("Red");
		
		if(found == true) {
			System.out.println("Found the Element");
		} else {
			System.out.println("Not Found the Element");
		}
		
	}

}


//Found the Element

