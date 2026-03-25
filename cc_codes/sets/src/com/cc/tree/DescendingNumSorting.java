package com.cc.tree;

import java.util.Comparator;

public class DescendingNumSorting implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
/*		//1. changing sing 
		if(o1 > o2) {
			return -1;
		} else if(o1 < o2) {
			return 1;
		} else {
			return 0;
		}
		*/
		
		//2. changing conditions
		if(o1 < o2) {
			return 1;
		} else if(o1 > o2) {
			return -1;
		} else {
			return 0;
		}
	}

}
