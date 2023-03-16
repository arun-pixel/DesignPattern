package observerPattern;

public class Subscriber {
	
	private String name;
	private Channel channel = new Channel();
	
	public void update() {
		System.out.println("Hey "+name+" video uploaded");
	}
	
	public Subscriber(String name) {
		this.name = name;
	}

	public void subscribeChannel(Channel channel) {
		channel = channel;
	}

}
