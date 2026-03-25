package methods;

import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter length = ");
		int length = keyboard.nextInt();
		
		System.out.print("Enter breadth = ");
		int breadth = keyboard.nextInt();
		
		calculateAreaofRectangle(length, breadth);
		
		keyboard.close();

	}

	public static void calculateAreaofRectangle(int length, int breadth) {
		
		System.out.println("Area is = " +(length * breadth));		
	}

}





/*   
 * Enter length = 48
Enter breadth = 30
Area is = 1440


* Enter length = 58
Enter breadth = 20
Area is = 1160

*/

