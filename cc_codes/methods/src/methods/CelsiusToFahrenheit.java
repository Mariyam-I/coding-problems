package methods;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {		      
		
		Scanner keyboard = new Scanner(System.in);
		        
		System.out.print("Enter temperature in Celsius : ");
		double celsius = keyboard.nextDouble();
		        
		double fahrenheit = convertToFahrenheit(celsius);
		        
		System.out.print("In Fahrenheit = " + fahrenheit );
		        
		keyboard.close();
	}

	public static double convertToFahrenheit(double celsius) {
		
		return (((celsius * 9 )/ 5) + 32);
	}
}





/*Enter temperature in Celsius : 1213.4
In Fahrenheit = 2216.12

Enter temperature in Celsius : 458.3133
In Fahrenheit = 856.96394
*/
