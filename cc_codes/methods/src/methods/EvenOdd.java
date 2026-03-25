package methods;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the Number =  ");
		int number = keyboard.nextInt();
		
		isEvenOdd(number);
		
		keyboard.close();
	}

	public static void isEvenOdd(int number) {
		
		if(number % 2 == 0)
		{
			System.out.println(number + " is a Even Number");
		}else {
			System.out.println(number + " is Not a Even Number");
		}
		
	}

}




/*
 * Enter the Number =   28
28 is a Even Number

* Enter the Number =  69
69 is Not a Even Number

*/
