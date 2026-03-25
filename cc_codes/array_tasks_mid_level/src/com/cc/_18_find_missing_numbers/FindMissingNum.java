package com.cc._18_find_missing_numbers;

public class FindMissingNum {

	public static void main(String[] args) {

		int[] arr = {1, 2, 4, 6, 7, 8}; 
//		int[] arr = {1, 3, 5}; 
//		int[] arr = {2, 4, 5, 1}; 
		
		findNumber(arr);
	}

	public static void findNumber(int[] arr) { 
			
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
			
		for(int i=1; i<=max; i++) {
			boolean found = false;
			for(int j=0; j<arr.length; j++) {
				if(arr[j] == i) {
					found = true;
					break;
				}
			}
			if(found == false) {
				System.out.print(" " + i);
			}
		}
	}

}



//3 5