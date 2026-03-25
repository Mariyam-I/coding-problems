package com.cc._bubble_sort;

public class BubbleSortOptimization {
	
	public static void main(String[] args) {

		int[] arr = {16,14,5,6,8};
		
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
			System.out.print(arr[i] +" ");
		}
		System.out.print("]");
	}
	
	public static int[] sortArray(int[] arr) {
	
		int temp = 0 ;
		//for loop for no.of passes 
		for(int j = 0 ; j < arr.length-1 ; j++) {
			boolean isSwap = false;             
			//for loop for no.of comparison
			for(int i = 0 ; i < arr.length-1-j ; i++) {
				//condition to check if first element is greater than second 
				if(arr[i] > arr[i+1]) {
					//if condition is true swap the two element 
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					//update the swap to true 
					isSwap = true;
				}
			}
			//if remains swap false then numbers are already sorted 
			if(isSwap == false) {
				break;
			}
		}
		
		/*for(int j = 0 ; j < arr.length-1 ; j++) {
			int count = 0;
			for(int i = 0 ; i < arr.length-1-j ; i++) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					count++;
				}
			}
			if(count == 0) {
				break;
			}
		}*/
		return arr;
	}
}


/*
----------Original Array--------
[16 14 5 6 8 ]
----------Array after Sorting--------
[5 6 8 14 16 ]*/