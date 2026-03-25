//WAP find the Neon Number
import java.util.Scanner;
class NeonNum
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = keyboard.nextInt();
		
		//Method call
		boolean neonNum  = isNeonNum(number);
		
		//condition for checking given number is Neon Number or Not by comparing with boolean value returned by the method.
		if(neonNum == true)
		{
			System.out.print(number + " is a Neon Number");
		}
		else
		{
			System.out.print(number + " is not a Neon Number");
		}
	}
	
	//Method to find the Neon Number
	public static boolean isNeonNum(int num)
	{
		int pSum = 0, digit = 0, product = 1;
		
		product = num * num ;      //Take the square the given number 
		
		//Logic to calculate the sum of the squared of given number stored in product 
		while (product > 0)
		{
			digit = product % 10;   //read the last digit from the product
			pSum = pSum + digit ;   
			product = product / 10; //Kick the last digit 
		}
		
		//compare the squared number sum with original number if they are equal or not
		if(num == pSum)
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

Enter the number : 9
9 is a Neon Number

Enter the number : 1
1 is a Neon Number

Enter the number : 0
0 is a Neon Number

Enter the number : 5
5 is not a Neon Number

Enter the number : 12
12 is not a Neon Number

*/