package com.cc._14_employee_shifts;

public class RotateEmployeeShiftsbyKPositions {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int k = 2;
		
		System.out.println("---------------Before Rotating-----------------");
		traverseArray(arr);

		System.out.println();		
				
		arr = rotateArrayByTwo(arr,k);
		
		System.out.println("---------------After Rotating-----------------");
		traverseArray(arr);
	}
	
	public static void traverseArray(int[] arr) {
		
		System.out.print("[");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}
		
	public static int[] rotateArrayByTwo(int[] arr, int k) {
		
		int[] brr = new int[arr.length];
		int temp = 0;
		
		for(int j = 0 ; j < k ; j++) {
			temp = arr[0];
		
			for(int i = 0 ; i < arr.length-1 ; i++) {
				brr[i] = arr[i+1];
			}
		brr[brr.length-1] = temp;
		}
		return brr;
	}	

}
