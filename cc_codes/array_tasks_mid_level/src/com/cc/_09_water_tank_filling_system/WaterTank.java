package com.cc._09_water_tank_filling_system;

public class WaterTank {

	public static void main(String[] args) {

//		int[] arr = {0, 10, 20, 0, 15, 5, 0};
//		int[] arr = {10, 20, 30, 40, 50, 60, 70};
		int[] arr = {0, 0, 0, 0, 0, 0, 0};
		
		displayEmptyTankPos(arr);
	}

	public static void displayEmptyTankPos(int[] arr) {

		int empty = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				empty++;
				System.out.print(" " +i);
			}
		}
		System.out.println();
		if(empty == arr.length) {
			System.out.println("All tanks empty");
		}else if(empty == 0) {
			System.out.println("No tank empty");
		}
	}

}



//0 3 6


//No tank empty



/*
0 1 2 3 4 5 6
All tanks empty
*/