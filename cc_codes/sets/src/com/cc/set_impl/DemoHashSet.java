package com.cc.set_impl;

import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {

		HashSet set = new HashSet<>();
		
//		set.add(null);
		set.add(10);
		set.add(30);
		set.add("A");
		set.add(null);
		set.add('A');
		set.add(true);
		set.add(11.45);
//		set.add(null);
		
		System.out.println(set.add(30));
		System.out.println(set);
	}

}

/*
null added at last
[11.45, null, A, A, 10, 30, true]
*/


/*
null added at first
[null, 11.45, A, A, 10, 30, true]
*/


/*
null added in middle
[null, 11.45, A, A, 10, 30, true]
*/