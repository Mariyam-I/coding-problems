package com.cc._04_split_array;

public class SplitArrayIn2Halves {

	public static void main(String[] args) {

//		int[] arr = {10,20,30,40,50,60,70}; 
//		int[] arr = {5,15,25,35,45,55,65,75};
		int[] arr = {1,2,3,4,5};
		
		splitArray(arr);
	}

	//Method to split array into two halveds
	private static void splitArray(int[] arr) {
		
		//-----------NORMAL APPROACH----------
		
	  /*System.out.println("------Frist halve-----");
		for(int i = 0 ; i <= arr.length / 2; i++) {
			System.out.print( arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("------Secod halve-----");
		for(int i = (arr.length/ 2) + 1 ; i < arr.length; i++) {
			System.out.print( arr[i] + " ");
		}*/

		
		//------------USING BINARY SERACH--------------
		
		int l = 0 , r = arr.length-1 , mid = (l+r) / 2;
		
		int[] first = new int[mid+1];
		int[] second = new int[arr.length - first.length];
		
		System.out.println("------Frist halve-----");
		for(int i = 0 ; i < first.length; i++) {
			first[i] = arr[i];
			System.out.print( first[i] + " ");
		}
		
		System.out.println();
		System.out.println("------Secod halve-----");
		for(int i = first.length ; i < arr.length ; i++) {
			second[i-first.length] = arr[i];
			System.out.print( second[i-first.length] + " ");
		}
	}	

}

/*
------Frist halve-----
10 20 30 40 
------Secod halve-----
50 60 70 */


/*
------Frist halve-----
5 15 25 35 
------Secod halve-----
45 55 65 75 */


/*
------Frist halve-----
1 2 3 
------Secod halve-----
4 5 */