//WAP  to demonstrate method (with Arguments ,  with Return Value)

class MethodDemo4{
	public static void main(String[] args)
	{
		System.out.println("Started main()");
			int sq = square(5);
		System.out.println("Square of 5 is : " + sq);
		System.out.println("Ended main()");
	}
	
	public static int square(int s){
		return s * s;
	}	
}