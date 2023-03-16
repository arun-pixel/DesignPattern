package chainOfResponsibility;

public class ChainOfResponsibilityApp {
	
	public static void main(String[] args) {
		
		PaymentHandler bank = new BankPaymentHandler();
		PaymentHandler creditCard = new CreditCardPaymentHandler();
		PaymentHandler paypal = new PayPalPaymentHandler();
		bank.setNext(creditCard);
		creditCard.setNext(paypal);

		bank.handlePayment(700);
		bank.handlePayment(300);
		bank.handlePayment(1400);
		bank.handlePayment(700);
		
	}
	


}
