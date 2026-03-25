package com.cc._04_array_list;

import java.util.ArrayList;

public class RetrieveElementFromIndex {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(5);
		
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println("First Element -> "+ list.get(0));
	}

}


//First Element -> Red
