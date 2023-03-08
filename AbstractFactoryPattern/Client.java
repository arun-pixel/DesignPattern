package AbstractFactoryPattern;

public class Client {
	
	public static void main(String[] args) {
		
		Device dell = FactoryGenerator.getFactory("laptopFactory").getDevice("dell");
	   System.out.println(dell.getDetails());
		
	}

}
