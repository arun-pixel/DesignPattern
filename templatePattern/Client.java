package templatePattern;

public class Client {
	
public static void main(String[] args) {
		
		HouseTemplate wooden = new WoodenHouse();
		
		wooden.buildHouse();
		
		System.out.println("===========================");
		
		HouseTemplate concrete = new ConcreteHouse();
		
		concrete.buildHouse();
	}


}
