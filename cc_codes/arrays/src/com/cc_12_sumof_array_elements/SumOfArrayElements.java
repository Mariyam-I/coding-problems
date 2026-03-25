package com.cc_12_sumof_array_elements;

import java.util.Scanner;

public class SumOfArrayElements {

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
		
		//Calculating sum of array elements and print the sum value
		int sum = sumOfElements(arr);
		System.out.println("sum of array elements is = " +sum);
		
		//Release resources
		keyboard.close();
	}

	//Method to find sum
	public static int sumOfElements(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum =  sum + arr [i];
		}
		return sum;
	}
}


/*Enter the size of array = 3
Enter the element 1 =1
Enter the element 2 =2
Enter the element 3 =3
sum of array elements is = 6



Enter the size of array = 5
Enter the element 1 =11
Enter the element 2 =22
Enter the element 3 =33
Enter the element 4 =44
Enter the element 5 =55
sum of array elements is = 165

*/