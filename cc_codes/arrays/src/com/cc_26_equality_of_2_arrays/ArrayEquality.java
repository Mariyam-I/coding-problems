package com.cc_26_equality_of_2_arrays;

import java.util.Scanner;

public class ArrayEquality {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Declaration & Creations of 2 arrays
		System.out.print("Enter size of first array : ");
		int[] first = new int[sc.nextInt()];
		System.out.print("Enter size of second array : ");
		int[] second = new int[sc.nextInt()];
		
		//Initialization of array 1 
		System.out.println("---------Enter first array elements---------");
		for(int i = 0 ; i < first.length ; i++) {
			System.out.print("Enter element " + (i+1) + " = ");
			first[i] = sc.nextInt();
		}
		//Initialization of array 2
		System.out.println("---------Enter second array elements---------");
		for(int i = 0 ; i < second.length ; i++) {
			System.out.print("Enter element " + (i+1) + " = ");
			second[i] = sc.nextInt();
		}
		
		//Method to check Equality of 2 arrays 
		
		boolean equal = checkEquality(first , second);
		System.out.println("---------Equality checking---------");
		//Checking boolean value 
		if(equal == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
		//Release resources
		sc.close();
		
	}

	//Method for checking array equality
	public static boolean checkEquality(int[] first, int[] second) {

		if(first.length != second.length) {
			for(int i = 0 ; i < first.length ; i++) {
				if(first[i] != second[i]) {
					return false;
				}
			}
		}
		return true;
	}

}


/*
Enter size of first array : 3
Enter size of second array : 3
---------Enter first array elements---------
Enter element 1 = 1
Enter element 2 = 2
Enter element 3 = 3
---------Enter second array elements---------
Enter element 1 = 1
Enter element 2 = 2
Enter element 3 = 3
---------Equality checking---------
Arrays are equal
*/

/*Enter size of first array : 4
Enter size of second array : 4
---------Enter first array elements---------
Enter element 1 = 2
Enter element 2 = 1
Enter element 3 = 4
Enter element 4 = 5
---------Enter second array elements---------
Enter element 1 = 4
Enter element 2 = 2
Enter element 3 = 2
Enter element 4 = 6
---------Equality checking---------
Arrays are not equal
*/