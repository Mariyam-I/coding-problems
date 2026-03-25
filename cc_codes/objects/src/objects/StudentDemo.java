package objects;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Student s1 = new Student();
		
		System.out.println("*******Enter Student 1 Data*******");
		
		System.out.print("Enter ID = ");
		s1.ID = keyboard.next();
		System.out.print("Enter Name = ");
		s1.name = keyboard.next();
		System.out.print("Enter Marks = ");
		s1.marks = keyboard.nextInt();
		System.out.print("Enter Gender = ");
		s1.gender = keyboard.next().charAt(0);
		
		System.out.println("\n---------Student 1 Data--------");
		System.out.println("ID = " + s1.ID);
		System.out.println("Name = " + s1.name);
		System.out.println("Marks = " + s1.marks);
		System.out.println("Gender = " + s1.gender);
		
		s1.study();
		s1.submitAssighment();
		
		Student s2 = new Student();
		System.out.println("\n*******Enter Student 2 Data*******"); 
		
		System.out.print("Enter ID = ");
		s2.ID = keyboard.next();
		System.out.print("Enter Name = ");
		s2.name = keyboard.next();
		System.out.print("Enter Marks = ");
		s2.marks = keyboard.nextInt();
		System.out.print("Enter Gender = ");
		s2.gender = keyboard.next().charAt(0);
		
		System.out.println("\n---------Student 2 Data--------");
		System.out.println("ID = " + s2.ID);
		System.out.println("Name = " + s2.name);
		System.out.println("Marks = " + s2.marks);
		System.out.println("Gender = " + s2.gender);
		
		s2.study();
		s2.submitAssighment();
		
		Student s3 = new Student();

		System.out.println("\n*******Enter Student 3 Data*******");
		
		System.out.print("Enter ID = ");
		s3.ID = keyboard.next();
		System.out.print("Enter Name = ");
		s3.name = keyboard.next();
		System.out.print("Enter Marks = ");
		s3.marks = keyboard.nextInt();
		System.out.print("Enter Gender = ");
		s3.gender = keyboard.next().charAt(0);
		
		System.out.println("\n---------Student 3 Data--------");
		System.out.println("ID = " + s3.ID);
		System.out.println("Name = " + s3.name);
		System.out.println("Marks = " + s3.marks);
		System.out.println("Gender = " + s3.gender);
		
		s3.study();
		s3.submitAssighment();
		
		keyboard.close();	
	}
}




/*
 * *******Enter Student 1 Data*******
Enter ID = CSE-097
Enter Name = Mariyam
Enter Marks = 85
Enter Gender = F

---------Student 1 Data--------
ID = CSE-097
Name = Mariyam
Marks = 85
Gender = F
Students studying one day before exam
Student Submitted Assignment

*******Enter Student 2 Data*******
Enter ID = MECH-123
Enter Name = Rohan
Enter Marks = 70
Enter Gender = M

---------Student 2 Data--------
ID = MECH-123
Name = Rohan
Marks = 70
Gender = M
Students studying one day before exam
Student Submitted Assignment

*******Enter Student 3 Data*******
Enter ID = IS-311
Enter Name = Rida
Enter Marks = 69
Enter Gender = M

---------Student 3 Data--------
ID = IS-311
Name = Rida
Marks = 69
Gender = M
Students studying one day before exam
Student Submitted Assignment
*/