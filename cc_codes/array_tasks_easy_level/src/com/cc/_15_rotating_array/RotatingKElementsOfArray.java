package com.cc._15_rotating_array;

import java.util.Scanner;

public class RotatingKElementsOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 1, 2, 3, 4, 5 };

		// Method to traverse & print array before rotating
		System.out.println("---------------Before Rotating-----------------");
		traverseArray(arr);

		System.out.println();

		/*
		 * System.out.print("Enter the number of elements to be rotate : "); int k =
		 * sc.nextInt();
		 */

		// Method to rotate array by two from right
		arr = rotateArrayByTwo(arr);

		// Method to traverse & print array after rotating
		System.out.println("---------------After Rotating-----------------");
		traverseArray(arr);

		// Release resources
		sc.close();
	}

	// Method to print array
	public static void traverseArray(int[] arr) {

		System.out.print("[");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}

	// Method to rotate array from right by k
	public static int[] rotateArrayByTwo(int[] arr) {

		/*
		 * int[] brr = new int[arr.length]; int temp = 0;
		 * 
		 * for(int j = 0 ; j < k ; j++) { temp = arr[0];
		 * 
		 * for(int i = 0 ; i < arr.length-1 ; i++) { brr[i] = arr[i+1]; }
		 * brr[brr.length-1] = temp; }
		 */

		int left = 0;
		int right = arr.length - 1;
		int temp = 0;

		while (left <= right) {
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		return arr;
	}
}