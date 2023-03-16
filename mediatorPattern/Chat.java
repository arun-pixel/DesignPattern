package mediatorPattern;

public class Chat {
	
	public static void main(String[] args) {
		
		ChatMediator mediator = new ChatMediator();
		
		User user1 = new User(mediator, "arun");
		User user2 = new User(mediator, "andrew");
		User user3 = new User(mediator, "deepak");
		User user4 = new User(mediator, "megha");
		
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi guys");
		
	}

}
