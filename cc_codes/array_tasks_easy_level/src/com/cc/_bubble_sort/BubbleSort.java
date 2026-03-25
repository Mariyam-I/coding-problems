package com.cc._bubble_sort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = {15,16,6,8,5};
		
		System.out.println("----------Original Array--------");
		traverseArray(arr);
		
		arr = sortArray(arr);
		
		System.out.println();
		System.out.println("----------Array after Sorting--------");
		traverseArray(arr);
	}

	public static void traverseArray(int[] arr) {

		System.out.print("[");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.print("]");
	}

	public static int[] sortArray(int[] arr) {

		int temp = 0 ;
		for(int j = 0 ; j < arr.length-1 ; j++) {
			for(int i = 0 ; i < arr.length-1 ; i++) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		return arr;
	}

}




/*----------Original Array--------
[15 16 6 8 5 ]
----------Array after Sorting--------
[5 6 8 15 16 ]*/