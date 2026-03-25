//WAP to find the given number is Automorphic number 
import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = keyboard.nextInt();
		
		//Method call for checking Automorphic number
		boolean automorphic = isAutomorphicNumber(number);
		
		//condition for checking given number is Automorphic Number or Not by comparing with boolean value returned by the method.
		if(automorphic == true)
		{
			System.out.print("Given number is Automorphic Number");
		}
		else
		{
			System.out.print("Given number is Not Automorphic Number");
		}
	}
	
	//Method to find Automorphic number
	public static boolean isAutomorphicNumber(int num)
	{
		int square = 0 , digit = 0 ;
		
		square = num * num ;            //Tacking the square of the number
		
		digit = square % 10 ;          //Reading the last digit of Squared number
		
		//If the original numebr and the last digit of squared number  are equal then return true
		if(num == digit)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}






/*  SAMPLE OUTPUTS

Enter the number : 5
Given number is Automorphic Number

Enter the number : 12
Given number is Not Automorphic Number

Enter the number : 6
Given number is Automorphic Number

Enter the number : 7
Given number is Not Automorphic Number

*/