package com.cc._01_arrays_easy_level;

import java.util.Scanner;

public class CheckSortedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size = ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter " + (i+1) + " element = " );
			arr[i] = sc.nextInt();
		}
		
		boolean isSorted = checkSorted(arr);
		
		if(isSorted == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean checkSorted(int[] arr) {

		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		
		return true;
	}

}

/*
Enter array size = 4
Enter 1 element = 2
Enter 2 element = 5
Enter 3 element = 8
Enter 4 element = 11
true


Enter array size = 3
Enter 1 element = 10
Enter 2 element = 4
Enter 3 element = 5
false


*/
