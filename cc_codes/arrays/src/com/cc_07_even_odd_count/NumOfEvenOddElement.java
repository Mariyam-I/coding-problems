package com.cc_07_even_odd_count;

import java.util.Scanner;

public class NumOfEvenOddElement {

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
		
		//Counting the even and odd number in array
		countEvenOddNum(arr);
		
		//Release resources
		keyboard.close();
	}

	//Method to find the number of even and odd elements in an array
	public static void countEvenOddNum(int[] arr) {

		int eCount = 0 , oCount = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] % 2 == 0) {      
				eCount++ ;         //Increase the even Counter if condition is true
			} else {
				oCount++;          //Else Increase the odd Counter
			}
		}
		System.out.println();
		System.out.println("Number of Even Elements = " +eCount);
		System.out.println("Number of Odd Element  = " +oCount);
	}

}



/*
Enter the element 1 =11
Enter the element 2 =22
Enter the element 3 =33
Enter the element 4 =44
Enter the element 5 =55

Number of Even Elements = 2
Number of Odd Element  = 3
*/