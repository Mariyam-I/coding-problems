class StringConcatOperator
{
	public static void main(String[] args)
	{
		// System.out.println(10 + 20);
		
		// System.out.println("a" + "b");
		
		// String a = "Java";
		// int b = 10, c = 20, d = 30;
		// System.out.println( a + b + c + d );
		// System.out.println( b + c + d + a );
		// System.out.println( b + c + a + d );
		// System.out.println( b + a + c + d );
		
		String a = "Java";
		int b = 10, c = 20, d = 30;
		// a = b + c + d;              incompatible types: int cannot be converted to String
	    // a = a + b + c;              Java1020
		// b = a + c + d;              incompatible types: String cannot be converted to int
		// b = b + c + d;              60
		System.out.println(a);
		System.out.println(b);
		
	}
}