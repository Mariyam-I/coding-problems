package com.cc._03_arrays_hard_level;

public class CountInversions {

	public static void main(String[] args) {

		int[] arr = {2,4,1,3,5};
		
		System.out.println(inversionCount(arr));
	}

	private static int inversionCount(int[] arr) {

		int countInversion = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					countInversion++;
				}
			}
		}
		return countInversion;
	}

}
//3