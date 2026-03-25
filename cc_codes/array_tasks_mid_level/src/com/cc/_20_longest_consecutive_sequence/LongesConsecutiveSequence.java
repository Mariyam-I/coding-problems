package com.cc._20_longest_consecutive_sequence;

public class LongesConsecutiveSequence {
	
	public static void main(String[] args) {
			
		int[] arr = {100, 4, 200, 1, 2, 3};
			arr = sort(arr);
			 
			 for(int i = 0 ; i <= arr.length-1 ; i++)
			 {
				 System.out.print(arr[i]+" ");
			 } 
			 for(int i = 0 ; i <= arr.length; i++) {
				 if(arr[i+1] == arr[i]+1)
				 {
					 System.out.print(arr[i]+",");
				 }
			 }
		} 
		

		public static int[] sort(int[] arr) {
			
				int temp = 0;
				for(int i = 0; i < arr.length-1 ; i++)
				{
					boolean isSwapped = false;
					
					for(int j = 0; j < arr.length - 1 - i; j++)
					{
						if(arr[j] > arr[j+1]) {
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						isSwapped = true;
						}
					}
					if(isSwapped == false) {
						break;
					}
				}
				
				return arr;
			}
}
