package com.cc.tree;

import java.util.Comparator;

public class AscendingNumSorting implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
	
		//1. Natural order sorting 
	/*	if(o1 > o2) {
			return 1;
		} else if(o1 < o2) {
			return -1;
		} else {
			return 0;
		}*/
		
		
		//2. Customized 
		if(o1 < o2) {
			return -1;
		} else if(o1 > o2) {  //GAP(greater after positive) obj1 should come after boj2 
			return 1;
		} else {
			return 0;
		}
	}

}
