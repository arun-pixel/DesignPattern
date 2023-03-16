package chainOfResponsibility;

public class CreditCardPaymentHandler extends PaymentHandler {
	
	  public void handlePayment(int amount) {
	        if (amount <= 1000) {
	            System.out.println("Paid using credit card: " + amount);
	        } else {
	            next.handlePayment(amount);
	        }
	    }

}
