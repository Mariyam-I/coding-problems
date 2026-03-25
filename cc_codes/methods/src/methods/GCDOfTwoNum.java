package methods;

import java.util.Scanner;

public class GCDOfTwoNum {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
				
		System.out.print("Enter the first number : ");
		int num1  = keyboard.nextInt();
		
		System.out.print("Enter the second number : ");
		int num2  = keyboard.nextInt();
				
		//Method call 
		System.out.print( num1 + " , " + num2 + " HCF is : " +(isHcf(num1 , num2)));
			
		keyboard.close();
	}
			
		//Method to find the HCF of 2 numbers
		public static int isHcf(int num1 , int num2)
		{
			int min = 0 , hcf = 0 ;
			
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
			for(int i = 1 ; i <= min/2 ; i++)
			{
				//At some value of i this condition will become false and print the latest value of i & that is our hcf
				if(num1 % i == 0 && num2 % i == 0)
				{
					hcf = i ;
				}
			}
			return hcf;
		}
}





		/*   SAMPLE OUTPUTS

		Enter the first number : 12
		Enter the second number : 16
		12 , 16 HCF is : 4

		Enter the first number : 13
		Enter the second number : 15
		13 , 15 HCF is : 1

		Enter the first number : 56
		Enter the second number : 40
		56 , 40 HCF is : 8

		Enter the first number : 124
		Enter the second number : 345
		124 , 345 HCF is : 1


		*/

	
