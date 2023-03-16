package observerPattern;

public class Youtube {
	
	public static void main(String[] args) {
		
        Channel channel = new Channel();
		
		Subscriber sub1 = new Subscriber("marshall");
		Subscriber sub2 = new Subscriber("ariana");
		Subscriber sub3 = new Subscriber("eminem");
		
		channel.subscribe(sub1);
		channel.subscribe(sub2);
		channel.subscribe(sub3);



		sub1.subscribeChannel(channel);
		sub1.subscribeChannel(channel);
		sub1.subscribeChannel(channel);

        channel.upload("what is design pattern");		
	}

}
