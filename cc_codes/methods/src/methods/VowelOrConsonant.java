package methods;

import java.util.Scanner;

public class VowelOrConsonant {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the character : ");
		char ch = keyboard.next().charAt(0);
		
		vowelConsonantChecker(ch); 
		
		keyboard.close();
	}

	public static void vowelConsonantChecker(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
	            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	            System.out.println(ch + " is a vowel.");
	        }
	        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	            System.out.println(ch + " is a consonant.");
	        } else {
	            System.out.println("Input is not a valid alphabetic character.");
	        } 
	}
}




/*
Enter the character : J
J is a consonant.

Enter the character : i
i is a vowel.

 */