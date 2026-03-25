package com.cc.set_impl;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet lSet = new LinkedHashSet<>();
		
		lSet.add(10);
		lSet.add(13.56);
		lSet.add(true);
		lSet.add("M");
		lSet.add('m');
		lSet.add(null);
		
		System.out.println(lSet);
	}

}



//[10, 13.56, true, M, m, null]