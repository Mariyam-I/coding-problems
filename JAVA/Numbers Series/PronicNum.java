//WAP to find the Pronic/Heteromecic Number
import java.util.Scanner;
class PronicNum
{	
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the range : ");
		int range  = keyboard.nextInt();
		
		//Method call
		PronicNum(range);
		
	}
	
	// Method to find the Fibonacci Series till the given range
	public static void PronicNum(int range)
	{
		int pNum = 0;
		for(int i = 0; i <= range ; i++)
		{
			pNum = i*(i + 1);
			System.out.print(pNum+ ", ");
		}
		
	}
}





/*  SAMPLE OUTPUTS

Enter the range : 6
0, 2, 6, 12, 20, 30, 42,

Enter the range : 8
0, 2, 6, 12, 20, 30, 42, 56, 72,

Enter the range : 11
0, 2, 6, 12, 20, 30, 42, 
56, 72, 90, 110, 132,

Enter the range : 15
0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240,

*/