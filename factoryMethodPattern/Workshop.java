package factoryMethodPattern;

public class Workshop {
	
	public NissanGTR getEngine(String str) {
		if(str.equals("oldGen")) 
			return new EngineType();
		else if(str.equals("newGen"))
			return new ElectricType();
		else
			return null;
	
	}

}
