//WAP to display odd Numbers  from 1 to 100
class DisplayOddNum
{
	public static void main(String[] args)
	{
		//Method call
		printOddNum();
	}
	
	
	//Logic to print Odd Numbers from 1 to 100
	public static void printOddNum()
	{
		for(int i = 1 ; i <= 100; i++)
		{
			if(i % 2 != 0){
				System.out.print("\t " + i);
			}
		}	
	}
}





/* SAMPLE OUTPUT

 1       3       5       7       9       11      13      15      17      19      21
 23      25      27      29      31      33      35      37      39      41      43
 45      47      49      51      53      55      57      59      61      63      65
 67      69      71      73      75      77      79      81      83      85      87 
 89      91      93      95      97      99

*/