//WAP to find the given number is Ugly number 
import java .util.Scanner;
class UglyNum
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number = ");
		int number = keyboard.nextInt();
		
		//Method call
		boolean ugly = isUglyNum(number);
		
		//condition for checking given number is Ugly Number or Not by comparing with boolean value returned by the method.
		if(ugly == true)
		{
			System.out.print(number + " is Ugly Number");
		}
		else
		{
			System.out.print(number + " is Not Ugly Number");
		}
	}
	
	//Logic to find the given number is ugly number or not
	public static boolean isUglyNum(int num)
	{
		
		while(num % 2 == 0){   //check Number is divisible by 2 or not
			num = num / 2;           //Then divide the numebr by 2
		}
		while(num % 3 == 0){   //check Number is divisible by 3 or not
			num = num / 3;           //Then divide the numebr by 3
		}
		while(num % 5 == 0){   //check Number is divisible by 5 or not
			num = num / 5;           //Then divide the numebr by 5
		}
		
		//Return the boolean value
		if(num == 1){
			return true;
		} else {
			return false;
		}
	}
}





/*      SAMPLE OUTPUTS

Enter the number = 6
6 is Ugly Number

Enter the number = 8
8 is Ugly Number

Enter the number = 15
15 is Ugly Number

Enter the number = 14
14 is Not Ugly Number

Enter the number = 21
21 is Not Ugly Number

*/