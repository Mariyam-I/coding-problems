//WAP for Special 2-digit number
import java.util.Scanner;
class Special2_DigitNum
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the 2 digit 5number : ");
		int number = keyboard.nextInt();
		
		//Method call
		boolean specialNum = isSpecialNum(number);
		
		//condition for checking given number is Special 2_digit Number or Not by comparing with boolean value returned by the method.
		if(specialNum == true)
		{
			System.out.print(number + " is an Special 2_digit number ");
		}
		else
		{
			System.out.print(number + " is not an Special 2_digit number ");
		}
		
	}
	
	//Method to find the special 2_digit number
	public static boolean isSpecialNum(int num)
	{
		int temp = num;
		int digit = 0, sum = 0, product = 1, add = 0;
		
		while( num > 0)
		{
			digit = num % 10 ;             //Read the last digit
			sum = sum + digit;            //Calculate the sum
			product = product * digit;    //Calculate the product
			num /= 10;                    //Kick  out the last digit 
		}
		System.out.println("sum =  " + sum + " and product =  " + product);
		add = sum + product ;             //addition of the sum and product 
		
		if(temp == add)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}





/*  	

Enter the 2 digit number : 59
sum =  14 and product =  45
59 is an Special 2_digit number

Enter the 2 digit number : 45
sum =  9 and product =  20
45 is not an Special 2_digit number

Enter the 2 digit number : 23
sum =  5 and product =  6
23 is not an Special 2_digit number


*/