package com.cc._15_array_list;

import java.util.ArrayList;

public class TrimCapacityOfAlist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(10);
		
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		
		System.out.println("Before : "+list.size());
		System.out.println(list);
		list.trimToSize();
		System.out.println("After : "+list.size());
		System.out.println(list);
	}

}


/*
Before : 5
[Red, Green, Black, White, Pink]
After : 5
[Red, Green, Black, White, Pink]
*/