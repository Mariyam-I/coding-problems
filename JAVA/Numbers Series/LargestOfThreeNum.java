//WAP to find largest of three numbers
import java.util.Scanner;
class LargestOfThreeNum
{
	public static void main(String[] args)
	{
		int a, b, c;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("\tEnter first number a : ");
			a = keyboard.nextInt();
		
		System.out.print("\tEnter first number b : ");
			b = keyboard.nextInt();
		
		System.out.print("\tEnter first number c : ");
			c = keyboard.nextInt();
			
		//Method call
		largestNum(a, b, c);
		
	}
	
	//Method to find largest among the given three numbers 
	public static void largestNum(int a, int b, int c)
	{
		if(a > b && a > c)
		{
			System.out.println("\n a is largest ");
		}
		else if(b > a && b > c)
		{
			System.out.println("\n b is largest ");
		}
		else if(c > a && c > b)
		{
			System.out.println("\n c is largest ");
		}
		else
		{
			System.out.println("\n numbers might have same value");
		}
	}
}





/*  	SAMPLE OUTPUTS

        Enter first number a : 45
        Enter first number b : 32
        Enter first number c : 14

 a is largest

        Enter first number a : 12
        Enter first number b : 35
        Enter first number c : 14

 b is largest

        Enter first number a : 6
        Enter first number b : 5
        Enter first number c : 9

 c is largest

        Enter first number a : 67
        Enter first number b : 67
        Enter first number c : 50

 numbers might have same value

        Enter first number a : 78
        Enter first number b : 977
        Enter first number c : 977

 numbers might have same value

        Enter first number a : 145
        Enter first number b : 35
        Enter first number c : 145

 numbers might have same value

        Enter first number a : 79
        Enter first number b : 79
        Enter first number c : 79

 numbers might have same value


*/