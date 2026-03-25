//WAP to find LCM of two given numbers
import java.util.Scanner;
class LCM
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int num1  = keyboard.nextInt();
		
		System.out.print("Enter the second number : ");
		int num2  = keyboard.nextInt();
		
		//Method call 
		System.out.print( num1 + " , " + num2 + " LCM is : " +(isLcm(num1 , num2)));
		
	}
	
	//Method to find the LCM of 2 numbers
	public static int isLcm(int num1 , int num2)
	{
		int min = 0 , hcf = 0 , lcm = 0 ;
		
		//Find the minimum number from the given two numbers
		if(num1 > num2)
		{
			min = num1;
		}
		else
		{
			min = num2;
		}
		
		//Loops run till minimum number
		for(int i = 1 ; i <= min ; i++)
		{
			//At some value of i this condition will become false and print the latest value of i & that is our hcf
			if(num1 % i == 0 && num2 % i == 0)
			{
				hcf = i ;
			}
		}
		return lcm = (num1 * num2)/ hcf ;
	}
}





/*   SAMPLE OUTPUTS


Enter the first number : 2
Enter the second number : 6
2 , 6 LCM is : 6

Enter the first number : 4
Enter the second number : 20
4 , 20 LCM is : 20

Enter the first number : 49
Enter the second number : 152
49 , 152 LCM is : 7448

Enter the first number : 7
Enter the second number : 49
7 , 49 LCM is : 49

Enter the first number : 8794
Enter the second number : 1345
8794 , 1345 LCM is : 11827930


*/