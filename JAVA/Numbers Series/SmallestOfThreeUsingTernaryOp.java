//WAP to Find the Smallest of Three Numbers. Using Ternary Operator

import java.util.Scanner;

class SmallestOfThreeUsingTernaryOp{
	
	public static void main(String[] args){
		int a, b, c;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a : ");
			a = keyboard.nextInt();
		
		System.out.print("Enter b : ");
			b = keyboard.nextInt();
		
		System.out.print("Enter c : ");
			c = keyboard.nextInt();
		
		
		//Method call
		int small = smallestOfThree(a, b, c);
		System.out.println("Smallest is : " + small);
		
	}
	
	/*The ternary operator is a shortcut for the if-else statement. 
	It is used to make quick decisions in a single line of code.*/
	
	//condition ? value_if_true : value_if_false;
	
	//Method to find smallest of 3 using ternary operator 
	public static int smallestOfThree(int a, int b, int c){
		
		int result = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
		
		return result;
	}
}



//     OUTPUT


/*
Enter a : 21
Enter b : 14
Enter c : 12
Smallest is : 12


Enter a : 32
Enter b : 3
Enter c : 34
Smallest is : 3


Enter a : 54
Enter b : 43
Enter c : 30
Smallest is : 30
*/