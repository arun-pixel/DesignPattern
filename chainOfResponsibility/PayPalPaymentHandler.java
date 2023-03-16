package chainOfResponsibility;

public class PayPalPaymentHandler extends PaymentHandler{
	
	  public void handlePayment(int amount) {
	        if (amount <= 1500) {
	            System.out.println("Paid using PayPal: " + amount);
	        } else {
	            next.handlePayment(amount);
	        }
	    }

}
