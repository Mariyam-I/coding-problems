//WAP to find Fibonacci series till the given range
import java.util.Scanner;
class FibonacciSeries
{
	
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the range : ");
		int range  = keyboard.nextInt();
		
		//Method call
		isFibSeries(range);
		

	}
	
	// Method to find the Fibonacci Series till the given range
	public static void isFibSeries(int range)
	{
		int first = 0 , second = 1 , next = 0 ;
		
		if(range == 1)
		{
			System.out.print( first );
		}
		else if (range == 2)
		{
			System.out.print( first + "  " + second);
		}
		else
		{
			System.out.print(first + "  " + second);
			for(int i = 3 ; i <= range ; i++)
			{
				next = first + second ;
				System.out.print("  " + next);
				first = second ;
				second  = next ;	
			}	
		}
	}
}





/*   SAMPLE OUTPUTS

Enter the range : 1
0

Enter the range : 2
0  1

Enter the range : 3
0  1  1

Enter the range : 5
0  1  1  2  3

Enter the range : 7
0  1  1  2  3  5  8

Enter the range : 9
0  1  1  2  3  5  8  13  21

Enter the range : 10
0  1  1  2  3  5  8  13  21  34

Enter the range : 13
0  1  1  2  3  5  8  13  21  34  55  89  144

Enter the range : 24
0  1  1  2  3  5  8  13  21  34  55  89  144  233  377  610  987  1597  2584  4181  6765  10946  17711  28657

*/