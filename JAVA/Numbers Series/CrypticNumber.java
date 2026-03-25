//1- divisble by 7 
//2- not divisible by 5
//3- not palindrome 
//4- not contain repetitve digits 

import java.util.*;

public class CrypticNumber {
    
    // Function to check palindrome
    public static boolean isPalindrome(int num) {
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum * 10 + digit;
            num /= 10;
        }

        return temp == sum;
    }

   // Function to check if a number has repeating digits	
	public static boolean hasRepeatingDigits(int num) {

    // Create an array to store digits (0–9), initially all false
    boolean[] digits = new boolean[10];

    // Loop until number becomes 0
    while (num > 0) {

        // Get last digit of the number
        int d = num % 10;

        // Check if this digit was already seen before
        if (digits[d]) {
            return true; // If yes → repeating digit found
        }

        // Mark this digit as seen
        digits[d] = true;

        // Remove the last digit from the number
        num = num / 10;
    }

    // If no repeating digits found
    return false;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        boolean found = false;

        for (int i = L; i <= R; i++) {

            // Check all conditions
            if (i % 7 == 0 &&           // divisible by 7
                i % 5 != 0 &&           // not divisible by 5
                !isPalindrome(i) &&     // not palindrome
                !hasRepeatingDigits(i)  // no repeating digits
            ) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print(-1);
        }
    }
}