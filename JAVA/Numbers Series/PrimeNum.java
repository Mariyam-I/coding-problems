//WAP to find Prime Number
import java.util.Scanner;
class PrimeNum
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	    System.out.print("Enter the number : ");
		int number  = keyboard.nextInt();
		
		//1 & 0 are not a prime number
		if(number == 0 || number == 1)
		{
			System.out.print(number + " is not a Prime Number");
		}
		
		else
		{ 
			//Method call of prime number
			boolean prime = isPrimeNum(number);
			
			//condition for checking given number is Prime or Not by comparing with boolean value returned by the method.
			if(prime == true)
			{
				System.out.print(number + " is a Prime Number");
			}
			else
			{
				System.out.print(number + " is not a Prime Number");
			}
		}
	}
	
	
	// Method for checking prime number
	public static boolean isPrimeNum(int num)
	{
		int count = 0;
		
										//First method to find prime number
	
		// for(int i = 1 ; i <= num ; i++)
		// {
			// if(num % i == 0)
			// {
				// count++;
			// }
		// }
		// if(count == 2)
		// {
			// return true;
		// }
		// else
		// {
			// return false;
		// }
		
		
									//Second method to find prime number
		
		// for(int i = 2 ; i < num ; i++)
		// {
			// if(num % i == 0)
			// {
				// count++;
			// }
		// }
		
		// if(count == 0)
		// {
			// return true;
		// }
		// else
		// {
			// return false;
		// }
		
		
									//Third method to find prime number
		
		for(int i = 2 ; i < (num/2) ; i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}
		if(count == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}





/*      SAMPLE OUTPUTS

                                    //First method to find prime number
	
Enter the number : 1
1 is not a Prime Number

Enter the number : 0
0 is not a Prime Number

Enter the number : 54829
54829 is a Prime Number

Enter the number : 307948
307948 is not a Prime Number
								
									//First method to find prime number
									
Enter the number : 1
1 is not a Prime Number

Enter the number : 0
0 is not a Prime Number

Enter the number : 342465
342465 is not a Prime Number

Enter the number : 64530
64530 is not a Prime Number


									//First method to find prime number
									
Enter the number : 1
1 is not a Prime Number

Enter the number : 0
0 is not a Prime Number

Enter the number : 65885
65885 is not a Prime Number

Enter the number : 481914
481914 is not a Prime Number

*/