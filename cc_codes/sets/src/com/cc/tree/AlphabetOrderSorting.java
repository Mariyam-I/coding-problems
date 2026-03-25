package com.cc.tree;

import java.util.Comparator;

public class AlphabetOrderSorting implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
//		return o1.compareTo(o2);     	--> Ascending Order 
		return -o1.compareTo(o2);    //	--> Descending Order 
	}
	

}
