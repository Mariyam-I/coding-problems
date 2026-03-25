//WAP to find Factorial of  given number
import java.util.Scanner;
class FactorialOFNum
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number  = keyboard.nextInt();
		
		//Method call 
		System.out.print( number  + " Factorial is : " +(factorialNum(number)));
		
	}
	
	//Method to find the Factorial of the given number
	public static int factorialNum(int num)
	{
		int fact = 1 ;
		
		
		                //1  ====>   INCREMETING METHOD
		// for(int i = 2 ; i <= num ; i++)
		// {
			// fact = fact * i;
		// } 
		// return fact ;
		
		
		
		
		                //2  ====>   DECREMETING METHOD
		for(int i = num ; i > 1 ; i--)
		{
			fact = fact * i;
		}
		return fact ;
	}
}





/*   SAMPLE OUTPUTS

		      //1  ====>   INCREMETING METHOD

Enter the number : 5
5 Factorial is : 120

Enter the number : 8
8 Factorial is : 40320

Enter the number : 13
13 Factorial is : 1932053504

Enter the number : 123
123 Factorial is : 0


             //2  ====>   DECREMETING METHOD


Enter the number : 12
12 Factorial is : 479001600

Enter the number : 5
5 Factorial is : 120

Enter the number : 42
42 Factorial is : 0

Enter the number : 15
15 Factorial is : 2004310016

*/