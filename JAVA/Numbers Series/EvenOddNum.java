//WAP to find a Number is Even or odd
import java.util.Scanner;
class EvenOddNum
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the Number =  ");
		int number = keyboard.nextInt();
		
		//method call 
		boolean evenOdd = isEvenOdd(number);
		
		//condition for checking given number is Evne or Odd by comparing with boolean value returned by the method.
		if(evenOdd == true)
		{
			System.out.print(number + " is a Even number");
		}else{
			System.out.print(number + " is a Odd number");
		}
	}
	
	// Method to find given number is even or odd
	public static boolean isEvenOdd(int num)
	{
		if(num % 2 == 0)
		{
			return true;
		}else{
			return false;
		}
	}
}





/* SAMPLE OUTPUTS

Enter the Number =  1234
1234 is a Even number

Enter the Number =  213565
213565 is a Odd number

Enter the Number =  -12344
-12344 is a Even number

Enter the Number =  -1872481
-1872481 is a Odd number

*/