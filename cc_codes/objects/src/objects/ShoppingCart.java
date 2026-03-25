package objects;

public class ShoppingCart {

	String cartID ;
	String items ;
	int totalPrice ;
	int discount ;
	String paymentMethod ;
	
	public void addItem() {
		System.out.println("Item added to cart");
	}
	public void removeItem() {
		System.out.println("Can remove item from cart");
	}
	public void applyDiscount() {
		System.out.println("Disount will be applied");
	}
	public void checkout() {
		System.out.println("Complete payment using credit card");
	}
}


	