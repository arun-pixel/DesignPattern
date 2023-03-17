package strategyPattern;

public class Customer {
	
	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item(500);
		Item item2 = new Item(280);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
	//	cart.pay(new Paypal("arun@gmail.com", "password"));
		
		cart.pay(new CreditCard("arun", "1234567"));
	}

}
