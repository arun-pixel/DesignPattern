package singletonPattern;

public class User2 {
	
	public static void main(String[] args) {
		
		NetflixSubscription ns = NetflixSubscription.getSubscription();
		ns.subscriptionCount();
		
	}


}
