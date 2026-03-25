package com.cc._05_update_Specific_elements;

import java.util.Scanner;

public class UpdateMultipleElements {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		//Declaration & Creation
		System.out.print("Enter array size = ");
		int arr[] = new int[keyboard.nextInt()];
		
		//Initialization
		System.out.println("---------Array Elements are---------");
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter Element " + (i+1) + " = ");	
			arr[i] = keyboard.nextInt();
		}
		
		System.out.println("---------Enter Same Size of both index[] & newValue[]---------");
		
		//Declaration & Creation of index[] and newValue[]
		System.out.print("Enter Size of Index array = ");
		int[] indexs = new int[keyboard.nextInt()];
		
		System.out.print("Enter Size of new Values array = ");
		int[] newValue = new int[keyboard.nextInt()];
		
		//Initialization of index[] and newValue[]
		System.out.println("---------Index array Elements---------");
		for(int i=0; i<indexs.length; i++) {
			System.out.print("Enter Element " + (i+1) + " = ");	
			indexs[i] = keyboard.nextInt();
		}
		
		System.out.println("---------new Value array Elements---------");
		for(int i=0; i<newValue.length; i++) {
			System.out.print("Enter Element " + (i+1) + " = ");	
			newValue[i] = keyboard.nextInt();
		}
		
		//Method to Update Element at multiple position
		int[] brr = updateElement(arr, indexs , newValue);
		
		//Method to traverse the array and print the elements
		traverseArray(brr);
		
		//Release resources
		keyboard.close();
		
	}

	public static void traverseArray(int[] brr) {
		System.out.println("---------Array Elements are---------");
		for(int i = 0 ; i < brr.length ; i++) {
			System.out.println("arr[" + (i) +  "] = " +brr[i]);
		}
		
	}
	
	public static int[] updateElement(int[] arr, int[] index, int[] newValue) {
		int indexs = 0;
		for(int i = 0 ; i < index.length ; i++) {
			if(i >= 0 && i < arr.length) {
				indexs = index[i];
				arr[indexs] = newValue[i];
			}
		}
		return arr;
	}
}



/*Enter array size = 5
---------Array Elements are---------
Enter Element 1 = 5
Enter Element 2 = 10
Enter Element 3 = 15
Enter Element 4 = 20
Enter Element 5 = 25
---------Enter Same size of both index[] & newValue[]---------
Enter Size of Index array = 2
Enter Size of new Values array = 2
---------Index array Elements---------
Enter Element 1 = 1
Enter Element 2 = 3
---------new Value array Elements---------
Enter Element 1 = 88
Enter Element 2 = 99
---------Array Elements are---------
arr[0] = 5
arr[1] = 88
arr[2] = 15
arr[3] = 99
arr[4] = 25
*/



/*Enter array size = 5
---------Array Elements are---------
Enter Element 1 = 10
Enter Element 2 = 20
Enter Element 3 = 30
Enter Element 4 = 40
Enter Element 5 = 50
---------Enter Same size of both index[] & newValue[]---------
Enter Size of Index array = 1
Enter Size of new Values array = 1
---------Index array Elements---------
Enter Element 1 = 2
---------new Value array Elements---------
Enter Element 1 = 99
---------Array Elements are---------
arr[0] = 10
arr[1] = 20
arr[2] = 99
arr[3] = 40
arr[4] = 50
*/



/*Enter array size = 6
---------Array Elements are---------
Enter Element 1 = 1
Enter Element 2 = 2
Enter Element 3 = 3
Enter Element 4 = 4
Enter Element 5 = 5
Enter Element 6 = 6
---------Enter Same size of both index[] & newValue[]---------
Enter Size of Index array = 2
Enter Size of new Values array = 2
---------Index array Elements---------
Enter Element 1 = 0
Enter Element 2 = 5
---------new Value array Elements---------
Enter Element 1 = 100
Enter Element 2 = 200
---------Array Elements are---------
arr[0] = 100
arr[1] = 2
arr[2] = 3
arr[3] = 4
arr[4] = 5
arr[5] = 200
*/
