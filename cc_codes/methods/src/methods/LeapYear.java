package methods;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args)	{
		int year ;
			
		Scanner keyboard = new Scanner(System.in);
				
		System.out.print("Enter the year : ");
		year = keyboard.nextInt();
				
		//Calling method of leapYear
		leapYear(year);
		
		keyboard.close();
	}
			
	//Method to find leap Year
	public static void leapYear(int y) {
		// if number is a century number 
		if(y % 100 == 0) {
		//then it should also divisible by 400
			if(y % 400 == 0) {
				System.out.print("given year is LEAP YEAR");
			}
			else
			{
				System.out.print("given year is not LEAP YEAR");
			}
		}
		// if number is not a century number 
		else if(y % 4 == 0) {
			System.out.print("given year is LEAP YEAR");
		}
		else {
			System.out.print("given year is not LEAP YEAR");
		}
	}
}





		/*   SAMPLE OUTPUTS

		Enter the year : 2000
		given year is LEAP YEAR

		Enter the year : 2025
		given year is not LEAP YEAR

		Enter the year : 2004
		given year is LEAP YEAR

		Enter the year : 2018
		given year is not LEAP YEAR

		Enter the year : 1900
		given year is not LEAP YEAR

		*/


