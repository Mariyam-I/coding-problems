//WAP to find the Increasing Number
import java.util.Scanner;
class DecreasingNum
{
	public static void main(String[] args)
	{
		int number  = 0;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		number = keyboard.nextInt();
		
		//Method call
		boolean decNum = isDecNum(number);
		
		//condition for checking given number is Decreasing Number or Not by comparing with boolean value returned by the method.
		if(decNum == true)
		{
			System.out.print("is Decreasing Number");
		}
		else
		{
			System.out.print("is not an Decreasing Number");
		}
		
		
	}
	
	//Method to find the Decreasing Number
	public static boolean isDecNum(int num)
	{
		int prevDigit = 0 , currDigit = 0 ;   //At first previous Digit should be initialized by 0 
		
		while(num > 0)
		{
			currDigit = num % 10;
			if(currDigit <= prevDigit)     /*At First time the  condition should be false & 
			                                  this condition will be true for increasing number*/
				return false;
			
			prevDigit = currDigit;
			num /= 10 ;
		}
		return true;
	}
}




 
/*      SAMPLE OUTPUTS

Enter the number : 12345
is not an Decreasing Number

Enter the number : 65321
is Decreasing Number

Enter the number : 4652434
is not an Decreasing Number

Enter the number : 98765
is Decreasing Number

*/

