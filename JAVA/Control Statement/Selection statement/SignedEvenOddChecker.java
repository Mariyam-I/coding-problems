//WAP to check Signed Even or Odd Number

class SignedEvenOddChecker{
	/*public static void main(String[] args){
		int num = -7;
		
		if(num > 0){
			if((num % 2) == 0){
				System.out.println("Positive Even");
			}
			else{
				System.out.println("Positive Odd");
			}
		}
		else if(num < 0){
			if((num % 2) == 0){
				System.out.println("Negative Even");
			}
			else{
				System.out.println("Negative Odd");
			}
		}
		else{
			System.out.println("is Zero");
		}
	}	*/
	
	
	public static void main(String[] args)
	{
		int num = 23;
		if((num > 0) && (num%2 == 0))
		{
			System.out.println("Positive Even");
		}
		else if((num > 0 ) && (num % 2 != 0))
		{
			System.out.println("Positive Odd");
		}
		else if((num < 0) && (num % 2 == 0))
		{
			System.out.println("Negative Even");
		}
		else if((num < 0 ) && (num % 2 != 0))
		{
			System.out.println("Negative Odd");
		}
		else{
			System.out.print(num + " is ZERO");
		}
	}
} 