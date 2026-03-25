//WAP to find the sum of N natural numbers
import java.util.Scanner;
class NNaturalNumberSum
{
	public static void main(String[] args)
	{
		Scanner keyboard  = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = keyboard.nextInt();
		
		//Function call 
	    System.out.print("Sum is : " + sumOfNum(number));		
	}
	
	//Method to find the sum of given number
   	public static int sumOfNum(int num)
	{
		int sum = 0;
		for(int i = 1 ; i <= num ; i++)
		{
			sum = sum + i;
		}
		return sum;
	}
}





/*     SAMPLE OUTPUTS

Enter the number : 10
Sum is : 55

Enter the number : 50
Sum is : 1275

Enter the number : 100
Sum is : 5050

Enter the number : 500
Sum is : 125250

*/