package builderPattern;

public class Mobile {
	
	private String processor;
	private String os;
	private int battery;
	private String screen;
	
	public Mobile(String processor, String os, int battery, String screen) {
		this.processor = processor;
		this.os = os;
		this.battery = battery;
		this.screen = screen;
	}


	public String toString() {
		return "Mobile [processor=" + processor + ", os=" + os + ", battery=" + battery + ", screen=" + screen + "]";
	}
	

}
