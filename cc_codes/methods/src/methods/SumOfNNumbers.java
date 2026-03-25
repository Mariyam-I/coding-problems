package methods;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {

		Scanner keyboard  = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = keyboard.nextInt();
		
	    System.out.print("Sum is : " + sumOfNaturalNum(number));
	    
	    keyboard.close();
	}

	public static int sumOfNaturalNum(int number) {
		
		int sum = 0;
		for(int i = 1 ; i <= number ; i++)
		{
			sum = sum + i;
		}
		return sum;
	}

}




/*
Enter the number : 40
Sum is : 820

Enter the number : 100
Sum is : 5050

 */