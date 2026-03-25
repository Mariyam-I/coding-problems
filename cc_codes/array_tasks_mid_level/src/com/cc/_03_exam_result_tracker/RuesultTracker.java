package com.cc._03_exam_result_tracker;

public class RuesultTracker {

	public static void main(String[] args) {

//		int[] arr = {45, 32, 90, 29, 76};
//		int[] arr = {34, 34, 34};
//		int[] arr = {90, 80, 75};
//		int[] arr = {10, 0, 34};
		int[] arr = {35, 35};
		
		trackFailPass(arr);
	}

	public static void trackFailPass(int[] arr) {

		int passCount = 0 , failCount = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 35) {
				failCount++;
			}
			if(arr[i] >= 35 && arr[i] <= 100) {
				passCount++;
			}
		}
		System.out.println("Pass = "+ passCount);
		System.out.println("Fail = "+ failCount);
	}

}


/*
Pass = 3
Fail = 2
*/


/*
Pass = 0
Fail = 3
*/


/*
Pass = 3
Fail = 0
*/


/*
Pass = 0
Fail = 3
*/


/*
Pass = 2
Fail = 0
*/