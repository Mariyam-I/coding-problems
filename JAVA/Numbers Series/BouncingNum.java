//WAP to find the Bouncing Number
import java.util.Scanner;
class BouncingNum
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = keyboard.nextInt();
		
		
		bouncingNum(number);
		
	}
	
	public static void bouncingNum(int num)
	{
		boolean isDecNum = false , isIncNum = false;
		int previousDigit = 10 , currentDigit = 0 ; 
		
		while (num > 0)
		{
			currentDigit = num % 10;
			
			if(currentDigit >= previousDigit)
			{
				isDecNum = true;
			}
			else
			{
				isIncNum = true;
			}
			currentDigit = previousDigit;
			num /= 10;
		}
		
		if(isDecNum == true && isIncNum == true)
		{
			System.out.print ("is bouncing number ");
		}
		else
		{
			System.out.print ("is not a bouncing number ");
		}
	}
}