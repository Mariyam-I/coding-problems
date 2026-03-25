//WAP to find the number is Xylem or Phloem Number
import java.util.Scanner;
class XylemPhloemNum
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = keyboard.nextInt();
		
		//Method call
	    boolean xylemPhloem = isXylemPhloem(number);
		
		//condition for checking given number is Xylem or Pholem Number or Not by comparing with boolean value returned by the method.
		if(xylemPhloem == true)
		{
			System.out.print(number + " is Xylem number");
		}
		else
		{
			System.out.print(number + " is Phloem number");
		}
	}
	
	//Method to find the given number is Xylem or Pholem numebr
	public static boolean isXylemPhloem(int num)
	{
		int extremeSum = 0, meanSum = 0; 
		
		//Exteme is the sum of first and last digit 
		extremeSum = num % 10;
		num /= 10;
		
		//mean sum is the sum of middle digits 
		while(num > 9)
		{
			meanSum = meanSum + (num % 10); 
			num /= 10;
		}
		
		//Addition of first digit to Exteme sum
		extremeSum = extremeSum + num ;
		
		//returns true if the extremeSum is equal to meanSum otherwiese returns false
		if(extremeSum == meanSum)
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

Enter the number : 34326
34326 is Xylem number

Enter the number : 761312
761312 is phloem number

Enter the number : 12225
12225 is Xylem number

Enter the number : 17156
17156 is Phloem number

*/