//WAP to find the Spy Number
import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = keyboard.nextInt();
		
		//Method call
		boolean spy = isSpyNum(number);
		
		//condition for checking given number is SPY Number or Not by comparing with boolean value returned by the method.
		if(spy == true)
		{
			System.out.print(number + " is an Spy Number ");
		}
		else
		{
			System.out.print(number + " is not an Spy Number ");
		}
	}
	
	//Method to find the spy number
	public static boolean isSpyNum(int num)
	{
		int digit = 0, sum = 0, product = 1;
		
		while(num > 0)
		{
			digit= num % 10;                //read the last digit
			sum = sum + digit ;            //Calculate the sum
			product = product * digit ;    //Calculate the product
			num /= 10;                     //kick out the last digit
		}
		
		System.out.println("sum is = " + sum + " and the product is = " + product);
		
		//checking condition for Spy number
		if(sum == product)
		{
			return true ;
		}
		else
		{
			return false;
		}
	}
}





/*    SAMPLE OUTPUTS

Enter the number : 1124
sum is = 8 and the product is = 8
1124 is an Spy Number

Enter the number : 1432
sum is = 10 and the product is = 24
1432 is not an Spy Number

Enter the number : 1241
sum is = 8 and the product is = 8
1241 is an Spy Number

Enter the number : 132
sum is = 6 and the product is = 6
132 is an Spy Number

*/