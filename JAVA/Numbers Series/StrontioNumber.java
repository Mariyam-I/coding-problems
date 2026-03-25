//WAP to find the Strontio Number
import java.util.Scanner;
class StrontioNumber
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = keyboard.nextInt();
		
		//Method call
		isStrontioNum(number);
	}
	
	//Method to find the Strontio number
	public static void isStrontioNum(int num)
	{
		int ten = 0 , hundred = 0;
		
		//main condition that the number should be a4 digit number 
		if(num >= 1000 && num <= 9999)
		{
			num = num * 2;                    //multiply the number with 2
			ten = (num / 10) % 10 ;           //read the number at 10th 
			hundred = (num / 100 ) % 10;      //read the numbe at 100th position
			
			//check if the 10th place & 100th place number are equal 
			if(ten == hundred)
			{
				System.out.print("is a Strontio numbe");
			}
			else
			{
			System.out.print("not a Strontio number");
			}
		}
		else
		{
			System.out.print("not a Strontio number");
		}
	}
}





/*   SAMPLE OUTPUTS

Enter the number : 1386
is a Strontio numbe

Enter the number : 12345
not a Strontio number

Enter the number : 1221
is a Strontio numbe

Enter the number : 8888
is a Strontio numbe

*/





