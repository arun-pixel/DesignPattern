package AbstractFactoryPattern;

public class MobileFactory extends AbstractDeviceFactory{

	public Device getDevice(String device) {
		if(device.equals("onePlus")) {
			return new OnePlus(10,"Mediatek");
		}
		else if(device.equals("poco")) {
			return new Poco(8,"snapDragon");
		}
		else {
			return null;

		}
		
	}

}
