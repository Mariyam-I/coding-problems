package com.cc.set_impl;

import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSortedSet {

	public static void main(String[] args) {

		SortedSet<Integer> sSet = new TreeSet<Integer>();
		
		sSet.add(10);
		sSet.add(15);
		sSet.add(20);
		sSet.add(25);
		sSet.add(30);
		sSet.add(35);
		
		System.out.println("First element -> "+sSet.first());
		System.out.println("Last element -> "+sSet.last());
		System.out.println("Subset -> "+sSet.subSet(15, 35));
		System.out.println("Return element Above headSet(25) - > "+sSet.headSet(25));
		System.out.println("Return element After tailSet(20) - > "+sSet.tailSet(20));
		System.out.println(sSet.comparator());
	}
}



/*
First element -> 10
Last element -> 35
Subset -> [15, 20, 25, 30]
Return element Above headSet(25) - > [10, 15, 20]
Return element After tailSet(20) - > [20, 25, 30, 35]
null
*/