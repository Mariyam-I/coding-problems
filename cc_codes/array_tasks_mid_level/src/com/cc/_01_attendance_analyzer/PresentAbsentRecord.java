package com.cc._01_attendance_analyzer;

public class PresentAbsentRecord {

	public static void main(String[] args) {

//		int[] arr = {1, 0, 1, 1, 0};
//		int[] arr = {1, 1, 1, 1};
//		int[] arr = {0, 0, 0};
//		int[] arr = {};
		int[] arr = {1};
		
		trackAttendance(arr);
	}

	public static void trackAttendance(int[] arr) {

		int pCount = 0, aCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				pCount++;
			} else if(arr[i] == 0){
				aCount++;
			} else {
				System.out.println("Invalid input!");
				break;
			}
		}
		System.out.println("Present = "+pCount);
		System.out.println("Absent = "+aCount);
	}

}


/*
Present = 3
Absent = 2
*/


/*
Present = 4
Absent = 0
*/


/*
Present = 0
Absent = 3
*/



/*   Corner Test Case
Present = 0
Absent = 0
*/


/*
Present = 1
Absent = 0
*/