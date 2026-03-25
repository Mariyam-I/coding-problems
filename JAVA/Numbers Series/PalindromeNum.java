//WAP to demonstrate Palindrome of number 
import java.util.Scanner;
class PalindromeNum
{
	public static void main(String[] args)
	{
		int num ; 

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter number num : ");
			num = keyboard.nextInt();
			
		//Method call
		boolean palindormeN = isPalindrome(num);
		
		//condition for checking given number is Palindrome or Not by comparing with boolean value returned by the method.
		if(palindormeN == true)
		{
			System.out.print( " Number is Palindrome ");
		}
		else
		{
			System.out.print( " Number is not Palindrome ");
		}
		
	}
	
	//Method to find the given number is palindorme or not
	public static boolean isPalindrome(int num)
	{
		int digit = 0 , sum = 0;
		int temp = num ;
			
		while( num > 0)     
		{
			digit = num % 10;        //to read the last digit of given number
			num  = num / 10;         //to kick out the last digit form the number
			sum = (sum * 10) + digit;
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
}




/* SAMPLE OUTPUTS

Enter number num : 123454321
 Number is Palindrome

Enter number num : 1256789
 Number is not Palindrome

*/