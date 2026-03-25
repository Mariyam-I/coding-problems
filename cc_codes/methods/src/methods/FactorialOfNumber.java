package methods;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
				
		System.out.print("Enter the number : ");
		int number  = keyboard.nextInt();
				
		//Method call 
		System.out.print( number  + " Factorial is : " +(factorialNum(number)));
		
		keyboard.close();
		
	}
			
	//Method to find the Factorial of the given number
	public static long factorialNum(int number)
	{
		long fact = 1 ;
				
				
//		1  ====>   INCREMETING METHOD
		for(int i = 2 ; i <= number ; i++)
		{
			fact = fact * i;
		}
			return fact ;
				
		
		//2  ====>   DECREMETING METHOD
//		for(int i = number ; i > 1 ; i--)
//		{
//			fact = fact * i;
//			}
//		return fact ;
	}
}



/*   SAMPLE OUTPUTS

				      //1  ====>   INCREMETING METHOD

Enter the number : 9
9 Factorial is : 362880
		

Enter the number : 18
18 Factorial is : 6402373705728000

		             //2  ====>   DECREMETING METHOD

Enter the number : 12
12 Factorial is : 479001600


Enter the number : 18
18 Factorial is : 6402373705728000
*/

