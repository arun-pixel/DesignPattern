package chainOfResponsibility;

public class BankPaymentHandler extends PaymentHandler{

	public void handlePayment(int amount) {
		  if (amount <= 500) {
	            System.out.println("Paid using bank account: " + amount);
	        } else {
	            next.handlePayment(amount);
	        }		
	}

}
