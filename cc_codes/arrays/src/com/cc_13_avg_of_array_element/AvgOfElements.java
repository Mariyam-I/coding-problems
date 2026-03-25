package com.cc_13_avg_of_array_element;

import java.util.Scanner;

public class AvgOfElements {

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
		
		//Return the average of array elements by calculating the sum and dividing by arr.length
		double avg = sumOfElements(arr);
		System.out.println("Aerage of array elements is = " +avg);
		
		//Release resources
		keyboard.close();
	}

	//Method to find average of array elements
	public static double sumOfElements(int[] arr) {
		double sum = 0 , avg = 0;
		for(int i = 0; i < arr.length; i++) {
			sum =  sum + arr [i];
		}
		avg = sum / (arr.length);
		return avg;
	}
}



/*
Enter the size of array = 5
Enter the element 1 =3
Enter the element 2 =4
Enter the element 3 =5
Enter the element 4 =7
Enter the element 5 =9
Aerage of array elements is = 5.6


Enter the size of array = 5
Enter the element 1 =12
Enter the element 2 =21
Enter the element 3 =34
Enter the element 4 =32
Enter the element 5 =17
Aerage of array elements is = 23.2

*/