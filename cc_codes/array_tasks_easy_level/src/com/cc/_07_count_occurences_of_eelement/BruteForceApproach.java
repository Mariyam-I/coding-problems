package com.cc._07_count_occurences_of_eelement;

import java.util.Scanner;

public class BruteForceApproach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = {1,2,3,4,1,1,5,4,6,5,2,3,5,6};
		
		//Method to print array element 
		System.out.println("-----------Array elements are---------");
		traverseArray(arr);
		
		System.out.println();
		System.out.print("Enter element for counting occurrence = ");
		int element = sc.nextInt();
		
		//Method to count the occurrence of element 
		int count = countOccurenceOfSpecificElement(arr,element);
		
		System.out.println("Number of specific element " + element + " occurred is = " +count);
		
		//Release resources
		sc.close();
	}

	//Method to print array elements 
	public static void traverseArray(int[] arr) {
		System.out.print("[");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}

	//Method to calculate the number of occurrence of given element 
	public static int countOccurenceOfSpecificElement(int[] arr, int element) {

		int count = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			if(element == arr[i]) {
				count++;	
			}
		}
		return count ;
	}

}


/*
-----------Array elements are---------
[1 2 3 4 1 1 5 4 6 5 2 3 5 6 ]
Enter element for counting occurrence = 1
Number of specific element 1 occurred is = 3
*/


/*
-----------Array elements are---------
[1 2 3 4 1 1 5 4 6 5 2 3 5 6 ]
Enter element for counting occurrence = 3
Number of specific element 3 occurred is = 2

*/