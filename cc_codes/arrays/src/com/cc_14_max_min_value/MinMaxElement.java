package com.cc_14_max_min_value;

import java.util.Scanner;

public class MinMaxElement {
	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		//Declaration & Creation
		System.out.print("Enter the size of array = ");
		int arr[] = new int[keyboard.nextInt()];
		
		//Initialization
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print("Enter the element " + (i+1) + " =");
			arr[i] = keyboard.nextInt();
		}
		
		//Method to find min element in array
		int max = maxElement(arr);
		System.out.println("Maximum element is " +max);

		//Method to find max elememnt in array
		int min = minElement(arr);
		System.out.println("Minimum element is " +min);
		
		//Release resources
		keyboard.close();
	}

	//Method to find max element
	public static int maxElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length ; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	//Method to find min element
	public static int minElement(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < arr.length ; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
}


/*
Enter the size of array = 4
Enter the element 1 =1
Enter the element 2 =2
Enter the element 3 =3
Enter the element 4 =4
Maximum element is 4
Minimum element is 1


*Enter the size of array = 5
Enter the element 1 =11
Enter the element 2 =22
Enter the element 3 =343
Enter the element 4 =13
Enter the element 5 =0
Maximum element is 343
Minimum element is 0

*/