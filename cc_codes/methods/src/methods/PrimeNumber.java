package methods;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
	    System.out.print("Enter the number : ");
		int number  = keyboard.nextInt();
		
		if(number == 0 || number == 1)
		{
			System.out.print(number + " is not a Prime Number");
		} else { 

			boolean prime = isPrimeNum(number);
			
			if(prime == true)
			{
				System.out.print(number + " is a Prime Number");
			}
			else
			{
				System.out.print(number + " is not a Prime Number");
			}
		}
		keyboard.close();

	}

	public static boolean isPrimeNum(int number) {
		
		int count = 0 ;
		for(int i = 2 ; i < (number/2) ; i++)
		{
			if(number % i == 0)
			{
				count++;
			}
		}
		if(count == 0)
		{
			return true;
		} else {
			return false;
		}
	}
}





/*
Enter the number : 429
429 is not a Prime Number

Enter the number : 67
67 is a Prime Number
*/
