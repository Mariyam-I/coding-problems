package methods;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number ; 
				
		Scanner keyboard = new Scanner(System.in);
				
		System.out.print("Enter a number  : ");
		number = keyboard.nextInt();
				
		//Method call
		boolean armStrong  =  isArmStrong(number);	
				
		//condition for checking given number is ArmStrong or Not by comparing with boolean value returned by the method.
		if(armStrong == true) {
			System.out.print("Arm Strong");
		}
		else {
			System.out.print(" Not Arm Strong");
		}
		keyboard.close();		
	}
			
			
	//Actual logic of ArmStrong number
	public static boolean isArmStrong(int number) {
		int d = 0 , cube = 0;
		int temp = number;
					
		while( number > 0) {
			d = number % 10;       //to find last digit of given number
			cube = cube + (d*d*d);
			number  = number / 10;    //to kick out last digit from given number
		}
		
		if( cube == temp) {
			return true;
		} else {
			return false;
		}
	}
}



		 
		/* SAMPLE OUTPUTS

		Enter a number  : 407
		Arm Strong

		Enter a number  : 153
		Arm Strong

		Enter a number  : 213
		 Not Arm Strong

		*/
