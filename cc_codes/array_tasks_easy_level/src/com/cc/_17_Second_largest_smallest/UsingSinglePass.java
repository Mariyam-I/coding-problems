package com.cc._17_Second_largest_smallest;

public class UsingSinglePass {

	public static void main(String[] args) {
		// Declaration, Creation & Initialization
		int arr[] = { 12, 5, 8, 19, 7, 25 };
//		 int arr[] = {1, 2, 3, 4, 5};
		// int arr[] = {99, 45, 12, 67, 34};
		// int arr[] = {10, 10, 10, 10};

		// find second Smallest element
		int small = secondSmallest(arr);
		System.out.println("Sec Smallest : " +small);

		// find second largest element
		int large = secondLargest(arr);
		System.out.println("Second Largest :  "  +large);

	}

	public static int secondLargest(int[] arr) {

		int small = Integer.MAX_VALUE;  //ssmall = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (small > arr[i]) {
				if (count < 2) {
					small = arr[i];
					count++;
				}
			}

		}
		return small;

	}

	public static int secondSmallest(int[] arr) {

		int large = Integer.MIN_VALUE, slarge = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (large < arr[i]) {
				if (count < 2) {
					large = arr[i];
					count++;
				}
			}
		}
		return slarge;

	}
	
	//find the second large 
}
