package com.cc._19_dutch_national_flag_problem;

public class SortArray {
	
	public static void main(String[] args) {
		int[] arr= {2,0,1,2,1,0};
//		int[] arr= {0,0,1,2,2};
			
		sortArray(arr);
	}

	public static void sortArray(int[] arr) {
		int temp = 0;
			
		for(int i=0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}



//0 0 1 1 2 2 

//0 0 1 2 2 