package methods;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter number to form table : ");
		int number = keyboard.nextInt();
		
		multTable(number);
		
		keyboard.close();
	}

	public static void multTable(int number) {
		
		for(int i = 1 ; i <= 10 ; i++)
		{
			System.out.print(" \n "+ number  + " *  " + i + " =  " + (number * i));
		}
	}

}





/*
 Enter number to form table : 8
 8 *  1 =  8 
 8 *  2 =  16 
 8 *  3 =  24 
 8 *  4 =  32 
 8 *  5 =  40 
 8 *  6 =  48 
 8 *  7 =  56 
 8 *  8 =  64 
 8 *  9 =  72 
 8 *  10 =  80
 
 
 Enter number to form table : 19
 19 *  1 =  19 
 19 *  2 =  38 
 19 *  3 =  57 
 19 *  4 =  76 
 19 *  5 =  95 
 19 *  6 =  114 
 19 *  7 =  133 
 19 *  8 =  152 
 19 *  9 =  171 
 19 *  10 =  190
 */
