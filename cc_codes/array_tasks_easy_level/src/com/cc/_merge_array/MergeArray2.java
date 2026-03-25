package com.cc._merge_array;

public class MergeArray2 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int[] brr = {11,22,33};
		
		int[] crr = reverseMerge(arr, brr);
	
		traverseArray(crr);
	}

	public static void traverseArray(int[] crr) {

		for(int i = 0 ; i < crr.length ; i++) {
			System.out.println("crr[ " + i + " ] = " +crr[i]);
		}
	}

	public static int[] reverseMerge(int[] arr, int[] brr) {

		int[] crr = new int[arr.length + brr.length];
		for(int i = 0 ; i < arr.length ; i++) {
			crr[i] = arr[i];
		}
		for(int i = arr.length ; i < crr.length ; i ++) {
			crr[i] = brr[crr.length-1-i];     //add 2nd array in rev order 

//			crr[i] = brr[i-arr.length];       //add 2nd array ele in inc order
		}
		return crr;
	}

}




/*
crr[ 0 ] = 10
crr[ 1 ] = 20
crr[ 2 ] = 30
crr[ 3 ] = 40
crr[ 4 ] = 50
crr[ 5 ] = 33
crr[ 6 ] = 22
crr[ 7 ] = 11
*/