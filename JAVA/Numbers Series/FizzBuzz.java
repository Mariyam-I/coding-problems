//WAP to demonstrate FizzBuzz 
import java.util.Scanner;
class FizzBuzz
{
	public static void main(String[] args)
	{
		int num ; 
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number  : ");
			num = keyboard.nextInt();
		
		//Method call
		checkFizzBuzz(num);
		
	}
	
	//Logic to cehck given number is Fizz , Buzz or Both
	public static void checkFizzBuzz(int a)
	{
		if(a % 3 ==  0 && a % 5 == 0)
		{
			System.out.println(a + " is Fizz Buzz");
		}
		else if(a % 3 ==  0)
		{
			System.out.println(a + " is Fizz ");
		}
		else if(a % 5 == 0)
		{
			System.out.println(a + " is Buzz ");
		}
		else
		{
			System.out.println(a + " is not Fizz & Buzz");
		}
	}
}





/*	SAMPLE OUTPUTS

Enter a number  : 15
15 is Fizz Buzz

Enter a number  : 57
57 is Fizz

Enter a number  : 40
40 is Buzz

Enter a number  : 59
59 is not Fizz & Buzz

*/