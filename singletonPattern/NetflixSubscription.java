package singletonPattern;

public class NetflixSubscription {
	
	int count = 0;
	
	private static NetflixSubscription subscription = null;
	
	
	private NetflixSubscription() {
		count++;
		
	}
	
	public static NetflixSubscription getSubscription() {
		
		if(subscription == null) {
			synchronized(NetflixSubscription.class){
				if(subscription == null) {
					return subscription = new NetflixSubscription();

				}
			}
		}
		return subscription;
	}
	
	public void subscriptionCount() {
		System.out.println("total no of subscription is "+count);
	}

}
