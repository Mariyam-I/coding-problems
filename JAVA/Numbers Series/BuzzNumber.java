//WAP to demonstrate Buzz 
import java.util.Scanner;
class BuzzNumber
{
	public static void main(String[] args)
	{
		int num ; 
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number  : ");
			num = keyboard.nextInt();
		
		//Method call
		boolean buzzNum = isBuzzNum(num);
		
		//condition for checking given number is Buzz or Not by comparing with boolean value returned by the method.
		if(buzzNum == true)
		{
		System.out.println(num + " is a Buzz");
		}
		else
		{
		System.out.println(num + " is not a Buzz");
		}
		
	}
	
	//Actual logic to find given number is Buzz or Not
	public static boolean  isBuzzNum(int a)
	{
		if(a % 7 ==  0 || a % 10 == 7)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}





/* SAMPLE OUTPUTS

Enter a number  : 57
57 is a Buzz

Enter a number  : 28
28 is a Buzz

Enter a number  : 132
132 is not a Buzz

*/