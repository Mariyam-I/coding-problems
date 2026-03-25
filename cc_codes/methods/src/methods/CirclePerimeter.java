package methods;

import java.util.Scanner;

public class CirclePerimeter {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		        
		System.out.print("Enter the radius of the circle: ");
		double radius = keyboard.nextDouble();
		        
		double perimeter = calculatePerimeter(radius);
		        
		System.out.println("The perimeter of the circle is: " + perimeter);
		        
		keyboard.close() ;
		
	}

	public static double calculatePerimeter(double radius) {
		double pi = 3.141592653589793;
		        
		return 2 * pi * radius;
	}

}





/*Enter the radius of the circle: 15
The perimeter of the circle is: 94.24777960769379


Enter the radius of the circle: 168.2
The perimeter of the circle is: 1056.8317686676064

*/