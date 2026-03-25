package com.cc._15_rotating_array;

public class RotatingArrayFormRightByOne {
	
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		//Method to rotate array by one from right
		int[] brr = rotateArrayByOne(arr);
		
		//Method to traverse & print array before & after rotating
		traverseArray(arr,brr);
	}

	//Method to print array 
	public static void traverseArray(int[] arr, int[] brr) {
		System.out.println("---------------Before Rotating-----------------");
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("---------------After Rotating-----------------");
		for(int i = 0; i < brr.length ; i++) {
			System.out.print(brr[i] + " ");
		}
	}
	
	//Method to rotate array from right by one
	public static int[] rotateArrayByOne(int[] arr) {
		int[] brr = new int[arr.length];
//		int temp = arr[arr.length-1];
		brr[0] = arr[arr.length-1];
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			brr[i+1] = arr[i];
		}
//		brr[0] = temp;
		
		return brr;
	}	
}


/*
---------------Before Rotating-----------------
1 2 3 4 5 
---------------After Rotating-----------------
5 1 2 3 4 
*/