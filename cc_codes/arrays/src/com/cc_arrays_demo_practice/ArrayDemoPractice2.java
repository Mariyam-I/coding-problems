package com.cc_arrays_demo_practice;

import java.util.Scanner;

public class ArrayDemoPractice2 {
	
	public static void main(String[] args) {
			
		Scanner keyboard = new Scanner(System.in);
			
		int[] arr = new int[5];
		
		System.out.println("----------BEFOR---------");
		System.out.println("arr[0] " +arr[0]);
		System.out.println("arr[1] " +arr[1]);		
		System.out.println("arr[2] " +arr[2]);		
		System.out.println("arr[3] " +arr[3]);
		System.out.println("arr[4] " +arr[4]);
				
			
		System.out.println("----------Initialization---------");
		
		System.out.print(" Enter array element  1 = ");
		arr[0] = keyboard.nextInt();
		System.out.print(" Enter array element  2 = ");
		arr[1] = keyboard.nextInt();
		System.out.print(" Enter array element  3 = ");
		arr[2] = keyboard.nextInt();
		System.out.print(" Enter array element  4 = ");
		arr[3] = keyboard.nextInt();
		System.out.print(" Enter array element  5 = ");
		arr[4] = keyboard.nextInt();
				
		
		
		System.out.println("----------AFTER---------");
		System.out.println("arr[0] " +arr[0]);		
		System.out.println("arr[1] " +arr[1]);
		System.out.println("arr[2] " +arr[2]);
		System.out.println("arr[3] " +arr[3]);
		System.out.println("arr[4] " +arr[4]);
			
		keyboard.close();

			
	}

}


/*
 ----------BEFOR---------
arr[0] 0
arr[1] 0
arr[2] 0
arr[3] 0
arr[4] 0
----------Initialization---------
 Enter array element  1 = 10
 Enter array element  2 = 20
 Enter array element  3 = 30
 Enter array element  4 = 40
 Enter array element  5 = 50
----------AFTER---------
arr[0] 10
arr[1] 20
arr[2] 30
arr[3] 40
arr[4] 50
*/
