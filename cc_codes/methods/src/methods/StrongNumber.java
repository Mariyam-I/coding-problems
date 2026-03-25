package methods;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
			
		System.out.print("Enter the Number : ");
		int num = keyboard.nextInt();
			
		//Method call for Strong Number
		boolean sNum = isStrongNumber(num);
			
		//condition for checking given number is Strong Number or Not by comparing with boolean value returned by the method.
		if(sNum == true) {
			System.out.print("Give number is Stron Number");
		} else {
			System.out.print("Give number is Not Strong Number");
		}
		keyboard.close();
	}
	//Method to find Strong number
	public static boolean isStrongNumber(int num)
	{
		int digit = 0 , sum = 0 ;
		int temp = num ;
		
		while(num > 0) {
			digit = num % 10 ;                      //Read the last digit
			digit = factorial(digit);				//find the factorial of last digit by method call
			sum = sum + digit;                      //Add the factorial of digit to sum
			num = num / 10;                         //Kick out the last digit
		}
		//If original number stored in temp and calculated sum are equal then return true
		if(temp == sum) {
			return true;
		} else {
			return false;
		}
	}
	//Method to find the factorial of digit
	public static int factorial(int digit) {
		int fact = 1;
		for(int i = 1 ; i <= digit ; i++) {
			fact = fact * i;
		}
		return fact;
	}
}



	/*
	Enter the Number : 145
	Give number is Strong Number

	Enter the Number : 2
	Give number is Strong Number

	Enter the Number : 322
	Give number is Not Strong Number

	Enter the Number : 212
	Give number is Not Strong Number

	Enter the Number : 40585
	Give number is Strong Number

	*/