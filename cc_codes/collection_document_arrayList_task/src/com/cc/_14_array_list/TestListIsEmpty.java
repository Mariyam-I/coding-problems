package com.cc._14_array_list;

import java.util.ArrayList;

public class TestListIsEmpty {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(5);
		
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		
		System.out.println("Before Removing Elements");
		System.out.println("Empty : "+list.isEmpty());
		
		System.out.println();
		list.removeAll(list);
		
		System.out.println("After Removing Elements");
		System.out.println("Empty : "+list.isEmpty());
	}

}


/*
Before Removing Elements
Empty : false

After Removing Elements
Empty : true

*/