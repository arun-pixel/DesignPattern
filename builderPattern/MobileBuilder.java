package builderPattern;

public class MobileBuilder {
	
	private String processor;
	private String os;
	private int battery;
	private String screen;
	

	public MobileBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
		
	}

	public MobileBuilder setOs(String os) {
		this.os = os;
		return this;

	}

	public MobileBuilder setBattery(int battery) {
		this.battery = battery;
		return this;

	}

	public MobileBuilder setScreen(String screen) {
		this.screen = screen;
		return this;

	}
	
	public Mobile getMobile() {
		return new Mobile(processor,os,battery,screen);
	}
	
	
	

}
