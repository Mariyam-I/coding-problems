package com.cc._15_rotating_array;

public class RotatingArrayFromLeftByOne {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		//Method to rotate array by one from left
		int[] crr = rotateArrayByOne(arr);
		
		//Method to traverse & print array before & after rotating
		traverseArray(arr,crr);
	}

	//Metho to print array 
	public static void traverseArray(int[] arr, int[] crr) {
		System.out.println("---------------Before Rotating-----------------");
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("---------------After Rotating-----------------");
		for(int i = 0; i < crr.length ; i++) {
			System.out.print(crr[i] + " ");
		}
	}

	//Method to rotate array from left by one
	public static int[] rotateArrayByOne(int[] arr) {
		int[] brr = new int[arr.length];
		int temp = arr[0];
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			brr[i] = arr[i+1];
		}
		brr[brr.length-1] = temp;
		
		return brr;
	}

}



/*---------------Before Rotating-----------------
1 2 3 4 5 
---------------After Rotating-----------------
2 3 4 5 1 */