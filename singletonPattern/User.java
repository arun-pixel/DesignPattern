package singletonPattern;

public class User {
	

	public static void main(String[] args) {
		
		NetflixSubscription ns = NetflixSubscription.getSubscription();
		ns.subscriptionCount();
		
	}

}
