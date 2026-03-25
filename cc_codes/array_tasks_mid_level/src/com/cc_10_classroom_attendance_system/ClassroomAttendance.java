package com.cc_10_classroom_attendance_system;

public class ClassroomAttendance {

	public static void main(String[] args) {

//		int[] arr = {1, 1, 0, 1, 0};
//		int[] arr = {0, 0, 0, 0, 0};
//		int[] arr = {1, 1, 1, 1, 1};
		int[] arr = {0, 0, 1, 0, 0};
		
		calcPercentage(arr);
		
	}

	public static void calcPercentage(int[] arr) {

		int pCount = 0;
		double percent = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				pCount++;
			}
		}
		
		if(pCount==arr.length) {
			System.out.println("All student persent");
		}
		if(pCount==0) {
			System.out.println("All student absent");
			
		}
		if(pCount==1) {
			System.out.println("One student persent");

		}
		
		percent = ((double) pCount / arr.length) * 100;
		
		System.out.println(percent + "%");
	}

}



//60.0%



/*
All student absent
0.0%
*/


/*
All student persent
100.0%
*/


/*
One student persent
20.0%
*/