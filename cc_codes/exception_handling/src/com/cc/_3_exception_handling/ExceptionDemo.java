package com.cc._3_exception_handling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		/*System.out.println(10/0);
		throw new ArithmeticException("divide by zero");*/
		
		System.out.println("Ststement 1");
		try {
			System.out.println("Ststement 2");
			System.out.print("Enetr value for a = ");
			int a = keyboard.nextInt();
			System.out.print("Enetr value for b = ");
			int b = keyboard.nextInt();
			System.out.println("Dividion = " + (a / b));
			System.out.println("Ststement 3");
			
			
			/*return;    o/p:   Ststement 1
							  Finally*/

		}
		/*catch (Exception e) {
			e.printStackTrace();
		}*/	
		
		
		catch (ArithmeticException e) {      //First specific catch (Child)
			System.out.println(" catch block-------> Ststement 4");
		}
	
		
		/*catch (Exception e) { // then general (Parent)
			e.printStackTrace();
		}*/
		
		
		/*
		  Unreachable catch block for ArithmeticException. 
		  It is already handled by the catch block for ArithmeticException
		  
		  catch (ArithmeticException e) {     
			System.out.println(" catch block-------> Ststement 4");
		}*/
		
//		System.out.println("Middle");  //Syntax error on token "finally", delete this token
		finally {
			System.out.println("Finally");
		}
		
		System.out.println("Ststement 5");
		keyboard.close();

	}

}
