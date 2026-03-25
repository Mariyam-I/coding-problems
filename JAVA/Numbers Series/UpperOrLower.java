//WAP to demponstrate the given charecter is in upper care or lower case
import java.util.Scanner;
class UpperOrLower
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the charecter : ");
		char charecter = keyboard.next().charAt(0);
		
		// Function call
		upperLower(charecter);
	}
	
	//Method to find the given character is Upper case , Lower case , Dgits or Sepcial Charecter.
	public static void 	upperLower(int ch)
	{
		//Condition to check the given charecter is in upper case
		if(ch >= 65 && ch <= 90)
		{
			System.out.print("Upper case latter");
		}
		//Condition to check the given charecter is in lower case
		else if (ch >= 97 && ch <= 122)
		{
			System.out.print("Lower case latter");
		}
		//Condition to check the given charecter is  a digit
		else if(ch >= 48 && ch <= 57)
		{
			System.out.print("It is a digit");
		}
		else
		{
			System.out.print("It is a special symbol");
		}
	}
	
}



/*  SAMPLE OUTPUTS

Enter the charecter : a
Lower case latter

Enter the charecter : A
Upper case latter

Enter the charecter : 12
It is a digit

Enter the charecter : $#
It is a special symbol
*/