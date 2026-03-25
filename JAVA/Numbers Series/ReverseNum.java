//WAP to demonstrate reverse of given number 
import java.util.Scanner;
class ReverseNum
{
	public static void main(String[] args)
	{
		int num ; 
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter number num : ");
			num = keyboard.nextInt();
		
		//Method call
		revNum(num);
		
	}
	
	//Logic to reverse the given number
	public static void revNum(int num)
	{
		int digit = 0 , sum = 0;
		while( num > 0)
			{
				digit = num % 10;      // to Read Last Digit of any number
				num  = num / 10;       // to Remove or Kick out the last number from Digit
				sum = (sum * 10) + digit;
			}
			System.out.print("Number After Reverse : " + sum);
	}
}





/*  SAMPLE OUTPUTS

Enter number num : 12345
Number After Reverse : 54321

Enter number num : 12097
Number After Reverse : 79021

Enter number num : 12097584
Number After Reverse : 48579021

*/