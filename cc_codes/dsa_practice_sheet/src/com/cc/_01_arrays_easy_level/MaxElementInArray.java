package com.cc._01_arrays_easy_level;

public class MaxElementInArray {

	public static void main(String[] args) {

	int[] arr = {10,45,32,67,89,12};
	
	int largestNum = largestNum(arr);
	
	System.out.println("Largest Number : "+ largestNum);
	}

	private static int largestNum(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}



//Largest Number : 89
