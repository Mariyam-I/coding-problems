package com.cc_02_backward_traversing;

import java.util.Scanner;

public class BackwardTraversing {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		//Declaration & Creation
		System.out.print("Enter array size = ");
		int arr[] = new int[keyboard.nextInt()];
		
		//Initialization
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("Enter Element " + (i+1) + " = ");	
			arr[i] = keyboard.nextInt();
		}
		
		//Backward Traversing the array
		traverseArray(arr);
		
		//Release the resources
		keyboard.close();
	}

	//Metohd of backward traversing
	public static void traverseArray(int[] arr) {

		for(int i = arr.length-1; i >= 0 ; i--)
		{
			System.out.println("arr[" + i + "] = " +arr[i]);	
		}	
	}

}



/*
Enter array size = 4
Enter Element 1 = 1
Enter Element 2 = 2
Enter Element 3 = 3
Enter Element 4 = 4
arr[3] = 4
arr[2] = 3
arr[1] = 2
arr[0] = 1
*/