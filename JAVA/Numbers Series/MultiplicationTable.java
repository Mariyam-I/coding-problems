//WAP to generate Multiplication table of given number 
import java.util.Scanner;
class MultiplicationTable 
{
	public static void main(String[] args)
	{
		int number ;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter number  num : ");
		number = keyboard.nextInt();
		
		//Method call
		mTable(number);
	}
	
	//Logic to form multiplication table
	public static void mTable(int num)
	{
		for(int i = 1 ; i <= 10 ; i++)
		{
			System.out.print(" \n "+ num  + " *  " + i + " =  " + (num * i));
		}
	}
} 





/*	SAMPLE OUTPUTS

Enter number  num : 15

 15 *  1 =  15
 15 *  2 =  30
 15 *  3 =  45
 15 *  4 =  60
 15 *  5 =  75
 15 *  6 =  90
 15 *  7 =  105
 15 *  8 =  120
 15 *  9 =  135
 15 *  10 =  150

Enter number  num : 35

 35 *  1 =  35
 35 *  2 =  70
 35 *  3 =  105
 35 *  4 =  140
 35 *  5 =  175
 35 *  6 =  210
 35 *  7 =  245
 35 *  8 =  280
 35 *  9 =  315
 35 *  10 =  350

*/