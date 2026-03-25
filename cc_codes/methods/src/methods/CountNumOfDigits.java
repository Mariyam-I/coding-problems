package methods;

import java.util.Scanner;

public class CountNumOfDigits {

	public static void main(String[] args) {
		int number ; 		
		Scanner keyboard = new Scanner(System.in);
				
		System.out.print("Enter number num : ");
		number = keyboard.nextInt();
					
		//Method call in the print statement itself
		System.out.print("Number of Digits are = " + countNum(number));
		keyboard.close();		
	}
			
	//Method to count the number of digits in any given number
	public static int countNum(int number)	{
		int count = 0;
		while( number > 0) {
			number  = number / 10 ;     //to kick out the last digit of the given number
			count++ ;
		}
		return count;
	}
}




		/* SAMPLE OUTPUTS

		Enter number num : 1223375896
		Number of Digits are = 10

		Enter number num : 487102504
		Number of Digits are = 9

		*/

