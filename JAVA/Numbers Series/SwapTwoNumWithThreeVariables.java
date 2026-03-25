//WAP to swap two numbers with 3 variables
import java.util.Scanner;
class SwapTwoNumWithThreeVariables
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
		swapTwoNum(a,b);
		
	}
	
	//Logic to Swap two numbers with three variables 
	public static void swapTwoNum(int a , int b)
	{
	    //creating temporary variable as third variable 
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.print("After Swapping \n a is = " +  a + " and b is = "  +b );
	}
}




/* SAMPLE OUTPUT

Enter first number a : 12
Enter second number b : 23
After Swapping
 a is = 23 and b is = 12

Enter first number a : 1234
Enter second number b : 4335
After Swapping
 a is = 4335 and b is = 1234

Enter first number a : -124
Enter second number b : -87641
After Swapping
 a is = -87641 and b is = -124

*/