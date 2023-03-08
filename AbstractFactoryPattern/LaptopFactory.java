package AbstractFactoryPattern;

public class LaptopFactory extends AbstractDeviceFactory{

	public Device getDevice(String device) {
		if(device.equals("dell")) {
			return new Dell(16,"Inspiron","NVIDIA");
		}
		else if(device.equals("macbook")) {
			return new MacBook(16,"Silicon","M2");
		}
		else {
			return null;

		}
	}

}
