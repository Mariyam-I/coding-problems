package com.cc._15_student_attendance;

public class FindCommonStudentsinTwoClasses {

	public static void main(String[] args) {
	    int[] classA = {101, 102, 103, 104};
	    int[] classB = {104, 105, 106};
	   
	    findCommonStudent(classA, classB);
	}

	public static void findCommonStudent(int[] classA, int[] classB) {
		 
	    for (int i = 0; i < classA.length; i++) {
	    	for (int j = 0; j < classB.length; j++) {
	    		if (classA[i] == classB[j]) {
	                System.out.print(classA[i] +" ");      
	    		}
	         }
	    }
	}
}



//104 