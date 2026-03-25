2//WAP to find number is Disarium number or not
import java.util.Scanner;
class DisariumNumber
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number;
		System.out.print("Enter a Number : ");
		number = keyboard.nextInt();
		
		boolean disNum = isDisariumNum(number);
		
		
		//condition for checking given number is Disarium or Not by comparing with boolean value returned by the method
		if(disNum == true)
		{
			System.out.print(number + " is Disarium  number");
		}
		else
		{
			System.out.print(number + " is not Disarium number");
		}
	}
	
	
	//Actual logic of Disarium Number
	public static boolean isDisariumNum(int num)
	{
		int temp = num , digit = 0, count = 0 , sum = 0 ;
		
		//Calculating the number of digits
		while(num > 0)
		{
			num = num/10;
			count++;
		}
		
		//Reassigning the num value from temp
		num = temp;
		
		//main logic 
		while(num > 0)
		{
			digit = num % 10;    //read the last digit 
			digit = getPower(digit , count); 
			sum = sum + digit;
			count-- ;         //to decrement the count
			num = num/10;  //kick out the last digit
		}
		
		if(sum == temp)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	//Calulating the number by raising Power given 
	public static int getPower(int base , int power)
	{
		int product = base;   //Assigning base value to product 
		for(int i =1; i<power ; i++)
		{
			product = product * base;
		}
		return product;
	}
}





/*  SAMPLE OUTPUTS

Enter a Number : 175
175 is Disarium  number

Enter a Number : 518
518 is Disarium  number

Enter a Number : 89
89 is Disarium  number

Enter a Number : 135
135 is Disarium  number

Enter a Number : 4356
4356 is not Disarium number

*/