//WAP to find the govrn number is Harshad number
import java.util.Scanner;
class HarshadNum
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = keyboard.nextInt();
		
		//Method call
		boolean  harshad = isHarshadNum(number);
		
		//condition for checking given number is Harshad Number or Not by comparing with boolean value returned by the method.
		if(harshad == true)
		{
			System.out.print(number + " is harshad number");
		}
		else
		{
			System.out.print(number + " is not harshad number");
		}
	}
	
	//Method to find the Harshad number
	public static boolean isHarshadNum(int num)
	{
		int digit = 0, sum = 0, temp = num;   //initialize temp with num
		
		//LOgic to find the sum of digits
		while(num > 0)
		{
			digit = num % 10;
			sum = sum + digit;
			num /= 10;
		}
		
		//cehcking the condition if the sum of digits divides the number, if so then return true
		if(temp %  sum == 0)
		{
			return true ;
		}
		else
		{
			return false;
		}
	}
}





/*   SAMPLE OUTPUTS

Enter the number : 156
156 is harshad number

Enter the number : 100
100 is harshad number

Enter the number : 164
164 is not harshad number

Enter the number : 146
146 is not harshad number

Enter the number : 128
128 is not harshad number

*/