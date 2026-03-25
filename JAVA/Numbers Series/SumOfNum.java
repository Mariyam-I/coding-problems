//WAP to demonstrate the sum of given number
import java.util.Scanner;
class SumOfNum
{
	public static void main(String[] args)
	{
		Scanner keyboard  = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = keyboard.nextInt();
		
		//Method call
		System.out.print("Sum of the given number is : " + (numSum(number)));
	}
	
	//Method to find the sum of given digit 
	public static int numSum(int num)
	{
		int sum = 0 , digit = 0 ;
		while(num > 0)
		{
		digit = num % 10;  //read the last digit
		sum = sum + digit;
		num = num / 10;    //kick outlast digit
		}
			return sum;
	}

}





/*   SAMPLE OTPUTS

Enter the number : 83265
Sum of the given number is : 24

Enter the number : 456473
Sum of the given number is : 29

Enter the number : 56375819
Sum of the given number is : 44

Enter the number : 456381301
Sum of the given number is : 31

Enter the number : 546875665
Sum of the given number is : 52

*/