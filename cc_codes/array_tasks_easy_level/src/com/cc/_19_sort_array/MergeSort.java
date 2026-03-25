package com.cc._19_sort_array;

public class MergeSort {

	public static void main(String[] args) {

		//Declaration, Creation & Initialization
//		int arr[] = {11, 20, 22, 10, 30, 55, 33, 44};
		int arr[] = {3, 5, 12, 4, 6, 8, 7, 9};
		
		//Print array before sorting 
		System.out.println("-----> Original Array");
		traverseArray(arr);
		
		System.out.println();
		
		//sort the array using merge sort
		arr = mergeSortArray(arr);
		
		//Print array after sorting 
		System.out.println("-----> Array After Sorting");
		traverseArray(arr);
	}

	//Logic two sort array using merge sort 
	public static int[] mergeSortArray(int[] arr) {
		
		int mid = arr.length / 2;
		//Divide the array into two halves 
		int left[] = new int[mid];
		int right[] = new int [arr.length - mid];
		
				//------ > Sort the divided array separately
		
		//copy divided arrays into new arrays
		for(int i = 0 ; i < mid ; i++) {
			left[i] = arr[i];
		}
		for(int i = mid ; i < arr.length; i++) {
			right[i - mid] = arr[i];
		}
		
		//Sort the copied array 
		sortArrar(left);
		sortArrar(right);

		//Merge the two sorted array 
		int[] brr = mergeArray(left , right); 
		
		return brr;		
	}

	public static void sortArrar(int[] arr) {

		int temp = 0 ;
		for(int j = 0 ; j < arr.length-1 ; j++) {
			int count = 0;
			for(int i = 0 ; i < arr.length-1-j ; i++) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					count++;
				}
			}
			if(count == 0) {
				break;
			}
		}
	}

	//Method to merge the two arrays after sorting
	public static int[] mergeArray(int[] first, int[] second) {
		
		int i = 0, j = 0 , k = 0;
		int[] crr = new int[first.length + second.length];
		/*for(int i = 0 ; i < left.length ; i++) {
			crr[i] = left[i];
		}
		for(int i = left.length ; i < crr.length ; i ++) {
			crr[i] = right[i - right.length];
		}
		return crr;
		*/
		
		 while (i < first.length && j < second.length) {
	            if (first[i] < second[j]) {
	                crr[k] = first[i];
	                k++;
	                i++;
	            } else {
	                crr[k] = second[j];
	                k++;
	                j++;
	            }
	        }
		 while (i < first.length) {
	            crr[k] = first[i];
	            k++;
                i++;
	        }

	        while (j < second.length) {
	            crr[k] = second[j];
	            k++;
                j++;
	        }
	        
	        return crr;
		}
	
	//Method to print array by traversing
	public static void traverseArray(int[] arr) {

		System.out.print("{");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("}");
	}

}


/*
-----> Original Array
{11 20 22 10 30 55 33 44 }
-----> Array After Sorting
{10 11 20 22 30 33 44 55 }
*/



/*
-----> Original Array
{3 5 12 4 6 8 7 9 }
-----> Array After Sorting
{3 4 5 6 7 8 9 12 }
*/
