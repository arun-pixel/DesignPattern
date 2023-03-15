package bridgePattern;

public class BridgePatternTest {
	
	public static void main(String[] args) {
		
		Shape triangle = new Triangle(new GreenColor());
		triangle.applyColor();
		
		Shape circle = new Circle(new RedColor());
		circle.applyColor();

		
	}

}
