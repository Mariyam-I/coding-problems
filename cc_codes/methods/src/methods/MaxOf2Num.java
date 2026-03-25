package methods;

import java.util.Scanner;

public class MaxOf2Num {

	public static void main(String[] args) {
		
		Scanner keyboard  = new Scanner(System.in);
		
		System.out.print("Enter first number = ");
		int a = keyboard.nextInt();
		
		System.out.print("Enter second number = ");
		int b = keyboard.nextInt();
		
		int maxNum = maxOFNum(a , b);
		
		if(maxNum == a) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
		keyboard.close();

	}

	public static int maxOFNum(int a, int b) {
		
		if(a > b) {
			return a;
		} else {
			return b ;
		}
		
	}

}




/*
 Enter first number = 13
Enter second number = 34
34

Enter first number = 599
Enter second number = 341
599

 */
