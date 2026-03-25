package methods;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
	
		Scanner keyboard  = new Scanner(System.in);
		
		System.out.print("Enter Principal  = ");
		double principal = keyboard.nextDouble();
		
		System.out.print("Enter rate of Interest = ");
		double interest = keyboard.nextDouble();
		
		System.out.print("Enter Time = ");
		int time = keyboard.nextInt();
		
		double sInterest = calculateSimpleInterest(principal , interest, time);
		
		System.out.println("Simple Interest is = " +sInterest);
		
		keyboard.close();

	}

	public static double calculateSimpleInterest(double principal, double interest, int time) {
		
		return ((principal * interest * time) / 100 );
	}

}




/*
Enter Principal  = 50000.59
Enter rate of Interest = 4.5
Enter Time = 3
Simple Interest is = 6750.079649999999


Enter Principal  = 400000
Enter rate of Interest = 12
Enter Time = 4
Simple Interest is = 192000.0

 */