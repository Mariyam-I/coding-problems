//WAP to find the Increasing Number
import java.util.Scanner;
class IncreasingNum
{
	public static void main(String[] args)
	{
		int number  = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		number = keyboard.nextInt();
		
		//Method call
		boolean incNum = isIncNum(number);
		
		//condition for checking given number is Increasing Number or Not by comparing with boolean value returned by the method.
		if(incNum == true)
		{
			System.out.print("is Increasing Number");
		}
		else
		{
			System.out.print("is not an Increasing Number");
		}
		
		
	}
	
	//Method to find the Increasing Number
	public static boolean isIncNum(int num)
	{
		int prevDigit = 10 , currDigit = 0 ;     //At first previous Digit should be initialized by 10 
		
		while(num > 0)
		{
			currDigit = num % 10;
			if(currDigit >= prevDigit)  /*At First time the  condition should be false & 
			                                  this condition will be true for decreasing number*/
				return false;
			
			prevDigit = currDigit;
			num /= 10 ;
		}
		return true;
	}
}





/*  SAMPLE OUTPUTS

Enter the number : 413223
is not an Increasing Number

Enter the number : 123345
is not an Increasing Number

Enter the number : 123467
is Increasing Number

Enter the number : 6068946
is not an Increasing Number

Enter the number : 76431
is not an Increasing Number

*/

