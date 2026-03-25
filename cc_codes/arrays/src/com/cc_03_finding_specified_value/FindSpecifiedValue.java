package com.cc_03_finding_specified_value;

import java.util.Scanner;

public class FindSpecifiedValue {

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
		
		//Take the specified element from the user for finding  
		System.out.print("Enter the element to be search = ");
		int specifiedElement = keyboard.nextInt();
		
		//Traverse the array
		boolean found = isNumFound(arr , specifiedElement);
		
		//Return true if number is present or false if not
		if(found == true) {
			System.out.println("number found....");
		} else {
			System.out.println("number not found!!!");
		}
		
		//Release resources
		keyboard.close();
}

	//Method to search the element in the given array
	public static boolean isNumFound(int[] arr, int specifiedElement) {

		for(int i = 0 ; i < arr.length ; i++)  {
			if(specifiedElement == arr[i]) {
				return true ;
			} 
		}
		return false;
	}
}



/*Enter the size of array = 5
Enter the element 1 =1
Enter the element 2 =2
Enter the element 3 =3
Enter the element 4 =4
Enter the element 5 =5
Enter the element to be search = 5
number found....



Enter the size of array = 3
Enter the element 1 =10
Enter the element 2 =20
Enter the element 3 =30
Enter the element to be search = 50
number not found!!!

*/