//WAP  to demonstrate method (No Arguments ,  with Return Value)

class MethodDemo3{
	public static void main(String[] args)
	{
		System.out.println("Started main()");
			double pi = getPI();
		System.out.println("PI = " + pi);
		System.out.println("Ended main()");
	}
	
	public static double getPI(){
		return 3.142;
	}
}