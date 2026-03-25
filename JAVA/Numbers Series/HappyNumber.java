//WAP to find the given number is Happy number 
import java.util.Scanner;
class HappyNumber
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number = ");
		int number = keyboard.nextInt();
		
		//Method call
		boolean happy = isHappyNum(number);
		
		//condition for checking given number is Happy Number or Not by comparing with boolean value returned by the method.
		if(happy == true)
		{
			System.out.print(number + " is Hppy Number");
		}
		else
		{
			System.out.print(number + " is Not Happy Number");
		}
		
	}
	
	//Logic to find the happy number 
	public static boolean isHappyNum(int num){
		
		int digit = 0 ;
		//
		while(num != 4 && num != 1){
			
			int sum = 0 ;                      //Initialize the sum with 0 before doing new iteration
			
			while(num > 0){                    //iterate the loop till num is greater than 0 
				digit = num % 10;              //read the last digit 
				sum = sum + (digit * digit);   //Take the square of the digit & store in sum 
				num = num / 10;                //kick out the last digit 
			}
			num = sum;                         //Store the sum value in num 
		}	
		//return the boolean value
		if(num == 1){
			return true;
		} else {
			return false;
		}
	}
}




/*       SAMPLE OUTPUTS

Enter the number = 4
4 is Not Happy Number

Enter the number = 49
49 is Hppy Number

Enter the number = 1
1 is Hppy Number

*/