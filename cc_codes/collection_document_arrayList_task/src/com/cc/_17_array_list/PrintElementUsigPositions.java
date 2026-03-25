package com.cc._17_array_list;

import java.util.ArrayList;

public class PrintElementUsigPositions {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(5);
		
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
	}

}


/*
0 : Red
1 : Green
2 : Black
3 : White
4 : Pink
*/