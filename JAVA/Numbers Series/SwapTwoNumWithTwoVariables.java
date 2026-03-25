//WAP to swap two numbers with 2 variables
import java.util.Scanner;
class SwapTwoNumWithTwoVariables
{
	public static void main(String[] args)
	{
		int a , b;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter first number a : ");
		a = keyboard.nextInt();
		
		System.out.print("Enter second number b : ");
		b = keyboard.nextInt();
		
		//Method call
		swapWithTwoVar(a,b);
	}
	
	//Method to Swap two numbers 
	public static void swapWithTwoVar(int a,int b)
	{
		//1st method ====>  Swapping using '+' and '-' operator
		// a = a + b;
		// b = a - b;
		// a = a - b;
		
		//2nd method ====>  Swapping using '*' and '/' operator
		a = a * b;
		b = a / b;
		a = a / b;
		
		System.out.print("After Swapping \n a is = " +  a  + " and b is = "  + b );
		
	}
}





/*	SAMPLE OTPUTS  [Both methos 1st & 2nd produces same output only method will be different]

	//Using 1st method ====>  Swapping using '+' and '-' operator
Enter first number a : 12
Enter second number b : 34
After Swapping
 a is = 34 and b is = 12

	//Using 2nd method ====>  Swapping using '*' and '/' operator
Enter first number a : 45
Enter second number b : 67
After Swapping
 a is = 67 and b is = 45

*/
