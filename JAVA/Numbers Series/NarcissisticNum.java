//WAP to find number is Naricssistic number or not
import java.util.Scanner;
class NarcissisticNum
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number;
		System.out.print("Enter a Number : ");
		number = keyboard.nextInt();
		
		boolean narNum = isNarcissNum(number);
		
		
		//condition for checking given number is Narcissistic or Not by comparing with boolean value returned by the method
		if(narNum == true)
		{
			System.out.print(number + " is Narcissistic  number");
		}
		else
		{
			System.out.print(number + " is not Narcissistic number");
		}
	}
	
	
	//Actual logic of Narcissistic Number
	public static boolean isNarcissNum(int num)
	{
		int temp = num , digit = 0, count = 0 , sum = 0 ;
		
		//Calculating the number of digits
		while(num > 0)
		{
			num = num/10;
			count++;
		}
		
		//Reassigning the num value from temp
		num = temp;
		
		//main logic 
		while(num > 0)
		{
			digit = num % 10;    //read the last digit 
			digit = getPower(digit , count); 
			sum = sum + digit; 
			num = num/10;  //kick out the last digit
		}
		
		if(sum == temp)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	//Calulating the number by raising Power given 
	public static int getPower(int base , int power)
	{
		int product = base;
		for(int i =1; i<power ; i++)
		{
			product = product * base;
		}
		return product;
	}
}





/*  SAMPLE OUTPUTS B

Enter a Number : 153
153 is Narcissistic  number

Enter a Number : 1634
1634 is Narcissistic  number

Enter a Number : 370
370 is Narcissistic  number

Enter a Number : 371
371 is Narcissistic  number

Enter a Number : 407
407 is Narcissistic  number

Enter a Number : 0
0 is Narcissistic  number

Enter a Number : 1
1 is Narcissistic  number

Enter a Number : 1234
1234 is not Narcissistic number

*/