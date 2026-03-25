package com.cc._merge_array;

public class AlternateMerging {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		int[] brr = {11,22,33,44,55};
		
		//Method to mernge the array alternatively
		int[] crr = alternativeMerge(arr, brr);
	
		//Method to traverse and print the resultant array
		traverseArray(crr);
	}

	//Method to traverse & print array
	public static void traverseArray(int[] crr) {
	
		for(int i = 0 ; i < crr.length ; i++) {
			System.out.println("crr[ " + i + " ] = " +crr[i]);
		}
	}

	//Method to merge array alternatively
	public static int[] alternativeMerge(int[] arr, int[] brr) {

		int[] crr = new int[arr.length + brr.length];
		int k = 0;
		
		for(int i = 0 ; i < crr.length ; i++) {
			if(i < arr.length) {
				crr[k++] = arr[i];
			}
			if(i < brr.length) {
				crr[k++] = brr[i];
			}
		}
	return crr;
	}
}



/*    If both arrays are of same size
crr[ 0 ] = 10
crr[ 1 ] = 11
crr[ 2 ] = 20
crr[ 3 ] = 22
crr[ 4 ] = 30
crr[ 5 ] = 33
crr[ 6 ] = 40
crr[ 7 ] = 44
crr[ 8 ] = 50
crr[ 9 ] = 55
*/


/*    If first array size si greater 
crr[ 0 ] = 10
crr[ 1 ] = 11
crr[ 2 ] = 20
crr[ 3 ] = 22
crr[ 4 ] = 30
crr[ 5 ] = 33
crr[ 6 ] = 40
crr[ 7 ] = 50
*/



/*      If second array size is greater 
crr[ 0 ] = 10
crr[ 1 ] = 11
crr[ 2 ] = 20
crr[ 3 ] = 22
crr[ 4 ] = 30
crr[ 5 ] = 33
crr[ 6 ] = 44
crr[ 7 ] = 55
*/