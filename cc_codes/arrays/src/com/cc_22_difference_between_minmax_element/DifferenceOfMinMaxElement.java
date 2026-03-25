package com.cc_22_difference_between_minmax_element;

import java.util.Scanner;

public class DifferenceOfMinMaxElement {
	
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
		System.out.println("***************************");
		System.out.println("Maximum element is " +max);
	
		//Method to find max elememnt in array
		int min = minElement(arr);
		System.out.println("Minimum element is " +min);
		
		//Difference between min and max element 
		System.out.println("Difference between MIN & MAX element is = " +(max - min));
		
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
Enter the size of array = 5
Enter the element 1 =23
Enter the element 2 =342
Enter the element 3 =12
Enter the element 4 =23
Enter the element 5 =31
***************************
Maximum element is 342
Minimum element is 12
Difference between MIN & MAX element is = 330



Enter the size of array = 3
Enter the element 1 =21
Enter the element 2 =32
Enter the element 3 =54
***************************
Maximum element is 54
Minimum element is 21
Difference between MIN & MAX element is = 33

*/