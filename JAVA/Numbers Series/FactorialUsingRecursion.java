// WAP to Find Factorial of a Number (Using Recursion)

import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        
		Scanner keyboard = new Scanner(System.in);  
        
		System.out.print("ENter the number : ");
		int num = keyboard.nextInt();
		
		//Method call
		int result = factorial(num);
        
		System.out.println("Factorial of " + num + " is: " + result);
    }
		
	
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base case
        }
		else {
            return n * factorial(n - 1);  // Recursive call
		}
    }
}


/*     SAMPLE OUTPUTS


ENter the number : 5
Factorial of 5 is: 120

ENter the number : 18
Factorial of 18 is: -898433024

ENter the number : 8
Factorial of 8 is: 40320

ENter the number : 12
Factorial of 12 is: 479001600

ENter the number : 14
Factorial of 14 is: 1278945280

*/