package com.cc_01_forward_traversing;

import java.util.Scanner;

public class ForwardTraversing {

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
		
		//Forward Traversing the array
		traverseArray(arr);
		
		//Release the resources
		keyboard.close();
	}

	//Metohd of forward traversing
	public static void traverseArray(int[] arr) {

		for(int i=0; i<arr.length; i++)
		{
			System.out.println("arr[" + i + "] = " +arr[i]);	
		}	
	}

}


/*
Enter array size = 4
Enter Element 1 = 10
Enter Element 2 = 20
Enter Element 3 = 30
Enter Element 4 = 40
arr[0] = 10
arr[1] = 20
arr[2] = 30
arr[3] = 40
*/
