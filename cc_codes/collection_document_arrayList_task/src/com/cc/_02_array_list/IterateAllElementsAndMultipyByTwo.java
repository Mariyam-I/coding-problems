package com.cc._02_array_list;

import java.util.ArrayList;

public class IterateAllElementsAndMultipyByTwo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(5);
		
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		
		System.out.print("[");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) *2 +", ");
		}
		System.out.print("]");
	}

}


//[4, 8, 12, 16, ]