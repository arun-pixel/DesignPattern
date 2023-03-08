package factoryMethodPattern;

public class Car {

	public static void main(String[] args) {
		
	Workshop workshop = new Workshop();
	NissanGTR nissan =	workshop.getEngine("newGen");
	System.out.println("4 seat");
	nissan.engine();
	System.out.println("alloy wheels");
		
	}
}
