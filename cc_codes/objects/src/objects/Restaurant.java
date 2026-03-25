package objects;

public class Restaurant {
	String restaurantName ;
	String location ;
	String cuisineType ;
	String menuItems ;
	double rating ;
	
	
	public void takeOrder() {
		System.out.println("Waiter will take the order");
	}
	public void serveFood() {
		System.out.println("Order will be served to the customer");
	}
	public void generateBill() {
		System.out.println("The cashier generated a bill for the meal");
	}
	public void getFeedback() {
		System.out.println("The restaurant asked customers to rate their experience by rating out of (5) ");
	}

}
