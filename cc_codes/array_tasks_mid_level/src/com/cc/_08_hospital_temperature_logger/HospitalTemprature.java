package com.cc._08_hospital_temperature_logger;

public class HospitalTemprature {

	public static void main(String[] args) {

//		int[] arr = {98, 101, 102, 99, 97};
//		int[] arr = {96, 97, 98};
//		int[] arr = {101, 103, 104};
		int[] arr = {100, 78, 86, 89};
		
		tempLogger(arr);
	}

	public static void tempLogger(int[] arr) {

		int temperature = 0 ;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 100) {
				temperature++;
			}
			
			if(arr[i] == 100) {
				System.out.println("Only one patient with exactly 100");
			}
		}
		System.out.println("Output : "+temperature);
		
		if(temperature == arr.length) {
			System.out.println("All patients with high fever");
		} 
		else if(temperature == 0) {
			System.out.println("No high fever");
		} 
	}

}


//Output : 2


/*
Output : 0
No high fever
*/


/*
Output : 3
All patients with high fever
*/