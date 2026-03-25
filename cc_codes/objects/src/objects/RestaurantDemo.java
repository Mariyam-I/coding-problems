package objects;

public class RestaurantDemo {

	public static void main(String[] args) {
		
		Restaurant r = new Restaurant();
		
		r.restaurantName ="Tandoor Mahal";
		r.location = "Connaught Place, New Delhi";
		r.cuisineType = "North Indian";
		r.menuItems = "[Butter Chicken , Naan, Paneer Tikka, Dal Makhani, Aloo Paratha]" ;
		r.rating = 4.5  ;
		
		System.out.println("Restaurant Name = " +r.restaurantName);
		System.out.println("location is = " +r.location);
		System.out.println("Cuisine Type = " +r.cuisineType);
		System.out.println("Menu Items are = " +r.menuItems);
		System.out.println("Rating = " +r.rating);
		
		System.out.println("---------Methods Call-------");
		r.takeOrder();
		r.serveFood();
		r.generateBill();
		r.getFeedback();
	}
}





/*
 Restaurant Name = Tandoor Mahal
location is = Connaught Place, New Delhi
Cuisine Type = North Indian
Menu Items are = [Butter Chicken , Naan, Paneer Tikka, Dal Makhani, Aloo Paratha]
Rating = 4.5
---------Methods Call-------
Waiter will take the order
Order will be served to the customer
The cashier generated a bill for the meal
The restaurant asked customers to rate their experience by rating out of (5) 
*/
