//WAP  to demonstrate method (with Arguments ,  No Return Value)

class MethodDemo2{
	public static void main(String[] args)
	{
		System.out.println("Started main()");
			add(10, 20);
		System.out.println("Ended main()");
	}
	
	public static void add(int a, int b){
		int sum = a + b;
		System.out.println("Addition = " + sum);
	}
}