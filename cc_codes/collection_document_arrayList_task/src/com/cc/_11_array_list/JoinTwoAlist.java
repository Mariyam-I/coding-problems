package com.cc._11_array_list;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoAlist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(5);
		
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		System.out.println("List1 \n" +list);
		
		ArrayList<String> list1 = new ArrayList<>(5);
		
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");
		list1.add("Pink");
		System.out.println("\nList2 \n" +list1);
		
		List<String> joinList = new ArrayList<>(10);
		
		joinList.addAll(list);
		joinList.addAll(list1);
		
		System.out.println("\nJoint List");
		System.out.println(joinList);
		
	}

}





/*
List1 
[Red, Green, Black, White, Pink]

List2 
[Red, Green, Black, Pink]

Joint List
[Red, Green, Black, White, Pink, Red, Green, Black, Pink]
*/