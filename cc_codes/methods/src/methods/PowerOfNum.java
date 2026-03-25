package methods;

import java.util.Scanner;

public class PowerOfNum {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Enter the base = ");
		int base = keyboard.nextInt();
		
		System.out.print("Enter the exponent = ");
		int exponant = keyboard.nextInt();
		
		System.out.print("Result = " + (calcPower(base , exponant)));
		keyboard.close();

	}

	public static int calcPower(int base, int exponent) {
		
		int product = base ;
		for(int i = 1; i <exponent; i++)
		{
			product = product * base ;
		}
		return product;
	}

}



/*
 Enter the base = 21
Enter the exponent = 3
Result = 9261


Enter the base = 25
Enter the exponent = 3
Result = 15625
*/

