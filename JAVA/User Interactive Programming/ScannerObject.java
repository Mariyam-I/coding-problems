import java.util.Scanner;
class ScannerObject
{
	public static void main(String[] args)
	{
		Scanner Keyboard = new Scanner(System.in);
		
		// System.out.print("Enter  first name :");
				// String firstName = Keyboard.next();
						
		// System.out.print("Enter  last name :");
				// String lastName = Keyboard.next();


		// System.out.println("First Name is " +firstName);
		// System.out.println("Last Name is " +lastName);
		// System.out.println("Full Name " + firstName + " " +lastName);

		                   
						   
						   //nextLine
		
		System.out.print("Enter  Full Name :");
				String fullName = Keyboard.nextLine();

		System.out.print("Enter  Age :");
				int age  = Keyboard.nextInt();

		Keyboard.nextLine();      //Between two nextLine() one should be added (IMP)
	
		System.out.print("Enter Country :");
				String country = Keyboard.nextLine();

		System.out.print("Enter Salary :");
				double salary = Keyboard.nextDouble();
				
		System.out.println("\n");
		
		System.out.println("Full Name is : " +fullName);
		System.out.println("Age is : " +age);
		System.out.println("Country : " + country );
		System.out.println("Slary : " + salary );
		
	}
}