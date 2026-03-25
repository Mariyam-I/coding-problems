//WAP to find Factors of given number
import java.util.Scanner;
class FactorsOfNum
{
	public static void main(String[] args)
	{
		int number = 0 ;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		number = keyboard.nextInt();
		
		
		//loggic TO FIND THE Fctors of given number
		for(int i =1; i <= number; i++)
		{
			if(number % i == 0)      //checking the fully divisibility of the number and that number will be the factor of given number
			{
				System.out.print("  "+i);
			}
		}
	}
}





/*

Enter the number : 5
  1  5

Enter the number : 6
  1  2  3  6

Enter the number : 12
  1  2  3  4  6  12

Enter the number : 15
  1  3  5  15

Enter the number : 24
  1  2  3  4  6  8  12  24

Enter the number : 50
  1  2  5  10  25  50

*/