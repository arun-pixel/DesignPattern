package AbstractFactoryPattern;

public class FactoryGenerator {
	
	public static AbstractDeviceFactory getFactory(String factoryType) {
		if(factoryType.equals("laptopFactory")) {
			return new LaptopFactory();
		}
		else if(factoryType.equals("mobileFactory")) {
			return new MobileFactory();
		}
		else {
			return null;
		}
	}

}
