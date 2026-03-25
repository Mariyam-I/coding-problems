package com.cc_08_perform_operations;

import java.util.Scanner;

public class MutipleOperationsOnArray {

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
		
		//Find number of positive,negative and zeroes in array
		countPsitiveNegativeZeros(arr);
		
		//Release resources
		keyboard.close();
	}
	
	//Method to find number of positive, negative and zeros element
	public static void countPsitiveNegativeZeros(int[] arr) {
		
		int pCount = 0, nCount = 0, zCount = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] > 0) {       
				pCount++;           //Increase positiove counter if condition is true
			} else if(arr[i] < 0) {
				nCount++;           //Increase negative counter if elseif condition is true
			} else {
				zCount++;          //Else increase zero counter 
			}
		}
		System.out.println();
		System.out.println("Number of Positive Numbers =  " +pCount);
		System.out.println("Number of Negative Numbers =  "+nCount);
		System.out.println("Number of Zeros Numbers =  "+zCount);
	}
	
	//Method to find even and odd element
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
		System.out.println("Number of Even Elements =  " +eCount);
		System.out.println("Number of Odd Element  =  " +oCount);
	}
}





/*Enter the size of array = 20
Enter the element 1 = 1
Enter the element 2 =8
Enter the element 3 =3
Enter the element 4 =-2
Enter the element 5 =-4
Enter the element 6 =-34
Enter the element 7 =432
Enter the element 8 =0
Enter the element 9 =78
Enter the element 10 =0
Enter the element 11 =0
Enter the element 12 =45
Enter the element 13 =3
Enter the element 14 =23
Enter the element 15 =1
Enter the element 16 =43
Enter the element 17 =-56
Enter the element 18 =-6
Enter the element 19 =-23
Enter the element 20 =0

Number of Even Elements =  12
Number of Odd Element  =  8

Number of Positive Numbers =  10
Number of Negative Numbers =  6
Number of Zeros Numbers =  4
*/