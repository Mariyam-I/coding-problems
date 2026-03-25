package objects;

public class ShoppingCartDemo {

	public static void main(String[] args) {

		ShoppingCart sc  = new ShoppingCart();
		
		sc.cartID = "FKORD45678";
		sc.items = "iPhone 15, Boat Earbuds, Samsung Smartwatch" ;
		sc.totalPrice = 140000 ;
		sc.discount = 5000 ;
		sc.paymentMethod = "UPI (Google Pay)" ;
		
		System.out.println("Cart ID = " +sc.cartID);
		System.out.println("Items = " +sc.items);
		System.out.println("Total Price in rupees = " +sc.totalPrice);
		System.out.println("Discount in rupees = " +sc.discount);
		System.out.println("Payment Method = " +sc.paymentMethod);
		
		System.out.println("-------Methods Call------");
		sc.addItem();
		sc.removeItem();
		sc.applyDiscount();
		sc.checkout();
	}
}



/*
Cart ID = FKORD45678
Items = iPhone 15, Boat Earbuds, Samsung Smartwatch
Total Price in rupees = 140000
Discount in rupees = 5000
Payment Method = UPI (Google Pay)
-------Methods Call------
Item added to cart
Can remove item from cart
Disount will be applied
Complete payment using credit card
*/