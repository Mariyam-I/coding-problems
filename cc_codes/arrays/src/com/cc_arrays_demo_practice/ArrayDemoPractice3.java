package com.cc_arrays_demo_practice;

import java.util.Scanner;

public class ArrayDemoPractice3 {
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter array size = ");
		int size =keyboard.nextInt();
		
		int[] arr = new int[size];
		System.out.println("----------BEFOR---------");
		
		iterateArrayElements(arr);
	
		
		System.out.println("----------Initialization---------");
		for(int i=0; i<size; i++)
		{
			System.out.print("Enter arr[" + (i+1) + "] = ");	
			arr[i] = keyboard.nextInt();
		}
		
		System.out.println("----------AFTER---------");
		
		iterateArrayElements(arr);
		
		keyboard.close();
	
	}
		
		public static void iterateArrayElements(int arr[]) {
			
			for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] = " +arr[i]);	
		    }
		}
}



/*
Enter array size = 3
----------BEFOR---------
arr[0] = 0
arr[1] = 0
arr[2] = 0
----------Initialization---------
Enter arr[1] = 11
Enter arr[2] = 22
Enter arr[3] = 33
----------AFTER---------
arr[0] = 11
arr[1] = 22
arr[2] = 33
*/